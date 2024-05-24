package rabbitmq

import (
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
	"github.com/rabbitmq/amqp091-go"
	"sync"
)

type factory map[string]*amqp091.Channel

// Adapter - структура для доступа к брокеру очередей RabbitMQ.
type Adapter struct {
	mu      sync.Mutex
	factory factory
}

// NewRabbitAdapter - конструктор Adapter.
func NewRabbitAdapter(
	queuesCfg *config.QueuesConfig,
	rabbitMqConnection *amqp091.Connection,
) (*Adapter, error) {
	fact := make(factory)
	for i := uint8(1); i <= queuesCfg.MaxPriority; i++ {
		queueName := fmt.Sprintf("%s_%02d", queuesCfg.FastQueuePrefix, i)
		ch, err := rabbitMqConnection.Channel()
		if err != nil {
			return nil, errors.Wrap(err, errors.ERR_INFRA, "new channel")
		}
		fact[queueName] = ch
	}
	ch, err := rabbitMqConnection.Channel()
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "new channel")
	}
	fact[queuesCfg.SlowQueue] = ch
	return &Adapter{mu: sync.Mutex{}, factory: fact}, nil
}
