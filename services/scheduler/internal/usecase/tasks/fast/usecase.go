package fast

import (
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/transactions"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/tasks/interfaces"
)

type usecase struct {
	domain.TasksUsecase
	tasksRepo      interfaces.TasksRepository
	transactor     transactions.Transactor
	rabbitAdapter  interfaces.RabbitAdapter
	fastQueueNames []string
}

// NewTasksFastUsecase - конструктор usecase.
func NewTasksFastUsecase(
	tasksUsecase domain.TasksUsecase,
	tasksRepo interfaces.TasksRepository,
	transactor transactions.Transactor,
	rabbitAdapter interfaces.RabbitAdapter,
	queuesConfig *config.QueuesConfig,
) *usecase {
	uc := &usecase{
		TasksUsecase:   tasksUsecase,
		tasksRepo:      tasksRepo,
		transactor:     transactor,
		rabbitAdapter:  rabbitAdapter,
		fastQueueNames: make([]string, 0, queuesConfig.MaxPriority),
	}

	for i := queuesConfig.MaxPriority; i > 0; i-- {
		uc.fastQueueNames = append(uc.fastQueueNames, fmt.Sprintf("%s_%02d", queuesConfig.FastQueuePrefix, i))
	}

	return uc
}
