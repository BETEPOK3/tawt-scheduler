package tasks_preparer

import "github.com/BETEPOK3/tawt-scheduler/sender/internal/config"

type usecase struct {
	schedulerAdapter SchedulerAdapter
	cfg              *config.PrioritiesConfig
}

func NewTasksPreparerUsecase(
	schedulerAdapter SchedulerAdapter,
	cfg *config.PrioritiesConfig,
) *usecase {
	return &usecase{
		schedulerAdapter: schedulerAdapter,
		cfg:              cfg,
	}
}
