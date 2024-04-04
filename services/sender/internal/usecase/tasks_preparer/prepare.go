package tasks_preparer

import (
	"context"
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

// Prepare - подготовить задачу к созданию.
func (u *usecase) Prepare(ctx context.Context, dto *domain.PrepareTaskDto) (uuid.UUID, error) {
	var coef int

	switch dto.Type {
	case entities.TaskTypeGraphematical:
		coef = u.cfg.Graphematical
	case entities.TaskTypeGama:
		coef = u.cfg.Gama
	}

	priority := u.cfg.MaximumPriority - len(dto.Text)/coef
	if priority < 0 {
		priority = 0
	} else if priority > u.cfg.MaximumPriority {
		priority = u.cfg.MaximumPriority
	}

	taskId, err := u.schedulerAdapter.SendTask(ctx, &entities.CreateTaskDto{
		Type:     dto.Type,
		Input:    []byte(fmt.Sprintf(`{"text":"%s"}`, dto.Text)),
		Priority: uint8(priority),
	})
	if err != nil {
		return uuid.Nil(), errors.Wrap(err, errors.ERR_USECASE, "schedulerAdapter.SendTask")
	}

	return taskId, nil
}
