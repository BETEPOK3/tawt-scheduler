package processor

import (
	mainconfig "github.com/BETEPOK3/tawt-scheduler/common/config"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
)

type usecase struct {
	rabbitAdapter  RabbitAdapter
	rabbitmqConfig *mainconfig.RabbitMQConfig
	queuesConfig   *config.QueuesConfig
}

// NewProcessorUsecase - конструктор usecase.
func NewProcessorUsecase(
	rabbitAdapter RabbitAdapter,
	rabbitmqConfig *mainconfig.RabbitMQConfig,
	queuesConfig *config.QueuesConfig,
) *usecase {
	return &usecase{
		rabbitAdapter:  rabbitAdapter,
		rabbitmqConfig: rabbitmqConfig,
		queuesConfig:   queuesConfig,
	}
}
