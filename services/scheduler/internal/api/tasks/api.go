package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

type apiImpl struct {
	schema.UnimplementedTasksServiceServer
	usecase domain.TasksUsecase
}

// NewTasksApi - конструктор apiImpl.
func NewTasksApi(u domain.TasksUsecase) *apiImpl {
	return &apiImpl{
		usecase: u,
	}
}
