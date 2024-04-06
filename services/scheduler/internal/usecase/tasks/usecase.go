package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/common/transactions"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/tasks/fast"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/tasks/interfaces"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/tasks/slow"
)

type factory map[domain.QueueType]domain.TasksUsecase

type usecase struct {
	factory factory

	tasksRepo     interfaces.TasksRepository
	transactor    transactions.Transactor
	rabbitAdapter interfaces.RabbitAdapter
	queuesConfig  *config.QueuesConfig
}

// NewTasksUsecase - конструктор usecase.
func NewTasksUsecase(
	tasksRepo interfaces.TasksRepository,
	transactor transactions.Transactor,
	rabbitAdapter interfaces.RabbitAdapter,
	queuesConfig *config.QueuesConfig,
) *usecase {
	uc := &usecase{
		tasksRepo:     tasksRepo,
		transactor:    transactor,
		rabbitAdapter: rabbitAdapter,
		queuesConfig:  queuesConfig,
	}

	uc.factory = factory{
		domain.QueueTypeSlow: slow.NewTasksSlowUsecase(uc, tasksRepo, transactor, rabbitAdapter, queuesConfig),
		domain.QueueTypeFast: fast.NewTasksFastUsecase(uc, tasksRepo, transactor, rabbitAdapter, queuesConfig),
	}

	return uc
}
