package interfaces

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

// TasksRepository - интерфейс репозитория для работы с задачами.
type TasksRepository interface {
	GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error)
	GetByIdWithLock(ctx context.Context, id uuid.UUID) (*entities.Task, error)
	Create(ctx context.Context, dto *entities.CreateTaskDto) (uuid.UUID, error)
	Edit(ctx context.Context, dto *domain.EditTaskDto) error
}
