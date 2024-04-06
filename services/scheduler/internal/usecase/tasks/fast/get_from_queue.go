package fast

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/rabbitmq/amqp091-go"
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
	rabbitCtx, cancel := context.WithCancel(ctx)
	defer cancel()

	var msg *amqp091.Delivery
	msgs := make(chan *amqp091.Delivery)
	errs := make(chan error)

	for _, queueName := range u.fastQueueNames {
		go func(ctx context.Context, queueName string) {
			msg, err := u.rabbitAdapter.GetMessage(ctx, queueName)
			if err != nil {
				errs <- err
			}
			if msg != nil {
				msgs <- msg
			}
		}(rabbitCtx, queueName)
		time.Sleep(time.Millisecond)
	}

	msg = <-msgs
	cancel()

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
