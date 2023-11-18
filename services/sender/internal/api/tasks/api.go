package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

type api struct {
	usecase domain.TasksUsecase
}

// NewTasksApi - конструктор api.
func NewTasksApi(
	usecase domain.TasksUsecase,
) *api {
	return &api{
		usecase: usecase,
	}
}
