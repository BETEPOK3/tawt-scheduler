package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"time"
)

// Finish - завершить задачу.
func (u *usecase) Finish(ctx context.Context, dto *domain.FinishTaskDto) error {
	editDto := &domain.EditTaskDto{
		Id:         dto.Id,
		Output:     dto.Output,
		FinishedAt: funcs.Ptr(time.Now()),
		Error:      dto.Error,
	}

	if dto.Error == nil {
		editDto.Status = funcs.Ptr(entities.TaskStatusCompleted)
	} else {
		editDto.Status = funcs.Ptr(entities.TaskStatusError)
	}

	err := u.tasksRepo.Edit(ctx, editDto)
	if err != nil {
		return errors.Wrap(err, errors.ERR_USECASE, "tasksRepo.Edit")
	}

	return nil
}
