package syntax

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/interfaces"
)

type usecase struct {
	domain.TasksPreparerUsecase

	schedulerAdapter interfaces.SchedulerAdapter
	cfg              *config.PrioritiesConfig
}

// NewTasksPreparerUsecaseSyntax - конструктор usecase для подготовки задач синтаксического.
func NewTasksPreparerUsecaseSyntax(
	tasksPreparerUsecase domain.TasksPreparerUsecase,
	schedulerAdapter interfaces.SchedulerAdapter,
	cfg *config.PrioritiesConfig,
) *usecase {
	return &usecase{
		TasksPreparerUsecase: tasksPreparerUsecase,
		schedulerAdapter:     schedulerAdapter,
		cfg:                  cfg,
	}
}
