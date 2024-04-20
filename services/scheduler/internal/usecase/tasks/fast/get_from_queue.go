package fast

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/rabbitmq/amqp091-go"
	"log"
	"sync"
	"time"
)

// GetFromQueue - получить задачу из медленной очереди.
func (u *usecase) GetFromQueue(ctx context.Context, stream domain.TaskStreamInterface) error {
	msg, err := u.getTask(ctx)
	if err != nil {
		return errors.Wrap(err, errors.ERR_USECASE, "getTask")
	}

	sendForProcessing := false

	err = u.transactor.Transaction(ctx, func(ctx context.Context) error {
		taskId := uuid.MustParse(msg.MessageId)

		task, err := u.tasksRepo.GetByIdWithLock(ctx, taskId)
		if err != nil {
			return errors.Wrap(err, errors.ERR_USECASE, "tasksRepo.GetByIdWithLock")
		}

		if task.Status != entities.TaskStatusQueued {
			sendForProcessing = true
			return nil
		}

		err = u.tasksRepo.Edit(ctx, &domain.EditTaskDto{
			Id:     taskId,
			Status: funcs.Ptr(entities.TaskStatusInProgress),
		})
		if err != nil {
			return errors.Wrap(err, errors.ERR_USECASE, "tasksRepo.Edit")
		}

		err = stream.ProcessTasks(entities.TaskList{task})
		if err != nil {
			return errors.Wrap(err, errors.ERR_USECASE, "ProcessTasks")
		}

		sendForProcessing = true

		return nil
	})
	if err != nil {
		return errors.Wrap(err, errors.ERR_USECASE, "transactor.Transaction")
	}

	if sendForProcessing {
		_ = msg.Ack(false)
	}

	return nil
}

func (u *usecase) getTask(ctx context.Context) (*amqp091.Delivery, error) {
	subCtx, cancel := context.WithCancel(ctx)
	defer cancel()

	var (
		msg *amqp091.Delivery
		wg  sync.WaitGroup
	)
	msgs := make(chan *amqp091.Delivery, len(u.fastQueueNames))
	errs := make(chan error, len(u.fastQueueNames))
	wg.Add(len(u.fastQueueNames))

	for _, queueName := range u.fastQueueNames {
		go func(ctx context.Context, queueName string) {
			defer wg.Done()

			thisMsg, err := u.rabbitAdapter.GetMessage(ctx, queueName)
			log.Println(queueName)

			if err != nil {
				errs <- err
			}
			log.Println(queueName)

			if thisMsg != nil {
				msgs <- thisMsg
			}

			log.Println(queueName)
		}(subCtx, queueName)
		time.Sleep(time.Millisecond)
	}

	msg = <-msgs
	cancel()
	wg.Wait()

	u.nackMessages(msgs)

	select {
	case err := <-errs:
		return nil, err
	default:
		return msg, nil
	}
}

func (u *usecase) nackMessages(msgs chan *amqp091.Delivery) {
	for {
		select {
		case nackMsg := <-msgs:
			_ = nackMsg.Nack(false, true)
		default:
			return
		}
	}
}
