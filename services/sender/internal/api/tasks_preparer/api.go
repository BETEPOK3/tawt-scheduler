package tasks_preparer

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

type api struct {
	tasksPreparerUsecase domain.TasksPreparerUsecase
}

// NewTaskPreparersApi - конструктор api.
func NewTaskPreparersApi(
	tasksPreparerUsecase domain.TasksPreparerUsecase,
) *api {
	return &api{
		tasksPreparerUsecase: tasksPreparerUsecase,
	}
}
