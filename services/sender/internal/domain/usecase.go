package domain

import (
	"context"
)

// TasksUsecase - бизнес-логика по работе с задачами.
type TasksUsecase interface {
	Create(ctx context.Context, dto *CreateTaskDto) error
}
