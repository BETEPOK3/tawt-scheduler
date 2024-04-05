package slow

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

// GetFromQueue - получить задачу из медленной очереди.
func (u *usecase) GetFromQueue(ctx context.Context, stream domain.TaskStreamInterface) error {
	msg, err := u.rabbitAdapter.GetMessage(ctx, u.queuesConfig.SlowQueue)
	if err != nil {
		return errors.Wrap(err, errors.ERR_USECASE, "rabbitAdapter.GetMessage")
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
