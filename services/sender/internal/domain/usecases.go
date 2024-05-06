package domain

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// TasksPreparerUsecase - интерфейс для подготовки задач.
type TasksPreparerUsecase interface {
	GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error)
	Prepare(ctx context.Context, dto *PrepareTaskDto) (uuid.UUID, error)
	GetStrategy(tp entities.TaskType) TasksPreparerUsecase
}
