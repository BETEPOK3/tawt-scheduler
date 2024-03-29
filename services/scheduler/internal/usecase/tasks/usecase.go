package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/common/transactions"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
)

type usecase struct {
	tasksRepo     TasksRepository
	transactor    transactions.Transactor
	rabbitAdapter RabbitAdapter
	queuesConfig  *config.QueuesConfig
}

// NewTasksUsecase - конструктор usecase.
func NewTasksUsecase(
	tasksRepo TasksRepository,
	transactor transactions.Transactor,
	rabbitAdapter RabbitAdapter,
	queuesConfig *config.QueuesConfig,
) *usecase {
	return &usecase{
		tasksRepo:     tasksRepo,
		transactor:    transactor,
		rabbitAdapter: rabbitAdapter,
		queuesConfig:  queuesConfig,
	}
}
