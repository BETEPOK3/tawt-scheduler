package tasks_preparer

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

type api struct {
	usecase   domain.TasksPreparerUsecase
	validator Validator
}

// NewTaskPreparersApi - конструктор api.
func NewTaskPreparersApi(
	usecase domain.TasksPreparerUsecase,
	validator Validator,
) *api {
	return &api{
		usecase:   usecase,
		validator: validator,
	}
}
