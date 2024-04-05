package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

func (u *usecase) GetFromQueue(ctx context.Context, stream domain.TaskStreamInterface) error {
	return errors.Error(errors.ERR_NOT_IMPLEMENTED, "not implemented")
}
