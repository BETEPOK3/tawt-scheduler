package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

// GetStream - получить поток с задач с их последующей обработкой.
func (u *usecase) GetStream(ctx context.Context, queueName string, stream domain.TaskStreamInterface) error {
	msgs, err := u.rabbitAdapter.GetTaskStream(ctx, queueName)
	if err != nil {
		return errors.Wrap(err, errors.ERR_USECASE, "rabbitAdapter.GetTaskStream")
	}

	for msg := range msgs {
		sendForProcessing := false

		err := u.transactor.
			Transaction(ctx, func(ctx context.Context) error {
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

				err = stream.ProcessTask(task)
				if err != nil {
					return errors.Wrap(err, errors.ERR_USECASE, "ProcessTask")
				}

				sendForProcessing = true

				return nil
			})
		if err != nil {
			return errors.Wrap(err, errors.ERR_USECASE, "transactor.Transaction")
		}

		if sendForProcessing {
			_ = msg.Ack(false)
		} else {
			break
		}
	}

	return nil
}
