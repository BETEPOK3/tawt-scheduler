package graphematical

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

// NewTasksPreparerUsecaseGraphematical - конструктор usecase для подготовки задач графематического анализа.
func NewTasksPreparerUsecaseGraphematical(
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
