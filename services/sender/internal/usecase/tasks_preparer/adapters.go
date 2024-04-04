package tasks_preparer

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// SchedulerAdapter - интерфейс адаптера планировщика.
type SchedulerAdapter interface {
	SendTask(ctx context.Context, dto *entities.CreateTaskDto) (uuid.UUID, error)
	GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error)
}
