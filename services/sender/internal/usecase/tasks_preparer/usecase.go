package tasks_preparer

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/disambiguation_false"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/disambiguation_true"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/gama"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/graphematical"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/interfaces"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer/syntax"
)

type factory map[entities.TaskType]domain.TasksPreparerUsecase

type usecase struct {
	factory factory

	schedulerAdapter interfaces.SchedulerAdapter
	cfg              *config.PrioritiesConfig
}

func NewTasksPreparerUsecase(
	schedulerAdapter interfaces.SchedulerAdapter,
	cfg *config.PrioritiesConfig,
) *usecase {
	uc := &usecase{
		schedulerAdapter: schedulerAdapter,
		cfg:              cfg,
	}

	uc.factory = factory{
		entities.TaskTypeGraphematical:       graphematical.NewTasksPreparerUsecaseGraphematical(uc, schedulerAdapter, cfg),
		entities.TaskTypeGama:                gama.NewTasksPreparerUsecaseGama(uc, schedulerAdapter, cfg),
		entities.TaskTypeDisambiguationFalse: disambiguation_false.NewTasksPreparerUsecaseDisambiguationFalse(uc, schedulerAdapter, cfg),
		entities.TaskTypeDisambiguationTrue:  disambiguation_true.NewTasksPreparerUsecaseDisambiguationTrue(uc, schedulerAdapter, cfg),
		entities.TaskTypeSyntax:              syntax.NewTasksPreparerUsecaseSyntax(uc, schedulerAdapter, cfg),
	}

	return uc
}
