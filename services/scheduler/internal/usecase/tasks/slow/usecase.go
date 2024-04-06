package slow

import (
	"github.com/BETEPOK3/tawt-scheduler/common/transactions"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/tasks/interfaces"
)

type usecase struct {
	domain.TasksUsecase
	tasksRepo     interfaces.TasksRepository
	transactor    transactions.Transactor
	rabbitAdapter interfaces.RabbitAdapter
	slowQueueName string
}

// NewTasksSlowUsecase - конструктор usecase.
func NewTasksSlowUsecase(
	tasksUsecase domain.TasksUsecase,
	tasksRepo interfaces.TasksRepository,
	transactor transactions.Transactor,
	rabbitAdapter interfaces.RabbitAdapter,
	queuesConfig *config.QueuesConfig,
) *usecase {
	return &usecase{
		TasksUsecase:  tasksUsecase,
		tasksRepo:     tasksRepo,
		transactor:    transactor,
		rabbitAdapter: rabbitAdapter,
		slowQueueName: queuesConfig.SlowQueue,
	}
}
