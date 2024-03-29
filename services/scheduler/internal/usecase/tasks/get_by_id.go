package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// GetById - получить задачу по идентификатору.
func (u *usecase) GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error) {
	task, err := u.tasksRepo.GetById(ctx, id)
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_USECASE, "tasksRepo.GetById")
	}

	return task, nil
}
