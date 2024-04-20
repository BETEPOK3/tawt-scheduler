package tasks

import (
	"context"
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

// Create - создать задачу.
func (u *usecase) Create(ctx context.Context, dto *entities.CreateTaskDto) (uuid.UUID, error) {
	id, err := u.tasksRepo.Create(ctx, dto)
	if err != nil {
		return uuid.Nil(), errors.Wrap(err, errors.ERR_USECASE, "tasksRepo.Create")
	}

	err = u.transactor.Transaction(ctx, func(ctx context.Context) error {
		err = u.tasksRepo.Edit(ctx, &domain.EditTaskDto{
			Id:     id,
			Status: funcs.Ptr(entities.TaskStatusQueued),
		})
		if err != nil {
			return errors.Wrap(err, errors.ERR_USECASE, "tasksRepo.Edit")
		}

		err = u.rabbitAdapter.SendTask(ctx, &domain.SendTaskMessageDto{
			QueueName: u.chooseQueue(dto.Priority),
			TaskId:    id,
			Priority:  dto.Priority,
		})
		if err != nil {
			return errors.Wrap(err, errors.ERR_USECASE, "rabbitAdapter.SendTask")
		}

		return nil
	})
	if err != nil {
		return id, errors.Wrap(err, errors.ERR_USECASE, "transactor.Transaction")
	}

	return id, nil
}

// chooseQueue - выбор очереди в зависимости от приоритета.
func (u *usecase) chooseQueue(priority uint8) string {
	if priority == 0 {
		return u.queuesConfig.SlowQueue
	}

	return fmt.Sprintf("%s_%02d", u.queuesConfig.FastQueuePrefix, priority)
}
