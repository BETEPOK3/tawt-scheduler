package domain

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// TasksUsecase - бизнес-логика по работе с задачами.
type TasksUsecase interface {
	GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error)
	GetStream(ctx context.Context, queueName string, stream TaskStreamInterface) error
	Create(ctx context.Context, dto *entities.CreateTaskDto) (uuid.UUID, error)
	Finish(ctx context.Context, dto *FinishTaskDto) error
}

// ProcessorUsecase - бизнес-логика фоновой обработки задач.
type ProcessorUsecase interface {
	RunAgingMechanism(ctx context.Context)
}
