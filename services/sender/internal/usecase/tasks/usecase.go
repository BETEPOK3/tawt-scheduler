package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/repo"
)

// Usecase - бизнес-логика обработки задач.
type Usecase struct {
	tasksRepo     repo.TasksRepository
	rabbitAdapter domain.RabbitAdapter
}

// NewTasksUsecase - конструктор Usecase.
func NewTasksUsecase(
	tasksRepo repo.TasksRepository,
	rabbitAdapter domain.RabbitAdapter,
) *Usecase {
	return &Usecase{
		tasksRepo:     tasksRepo,
		rabbitAdapter: rabbitAdapter,
	}
}
