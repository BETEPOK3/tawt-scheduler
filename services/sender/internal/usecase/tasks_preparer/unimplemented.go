package tasks_preparer

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

func (u *usecase) Prepare(ctx context.Context, dto *domain.PrepareTaskDto) (uuid.UUID, error) {
	return uuid.Nil(), errors.Error(errors.ERR_NOT_IMPLEMENTED, "not implemented")
}
