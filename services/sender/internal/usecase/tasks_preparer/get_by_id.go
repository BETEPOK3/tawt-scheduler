package tasks_preparer

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// GetById - получить задачу по идентификатору.
func (u *usecase) GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error) {
	task, err := u.schedulerAdapter.GetById(ctx, id)
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_USECASE, "schedulerAdapter.GetById")
	}

	return task, nil
}
