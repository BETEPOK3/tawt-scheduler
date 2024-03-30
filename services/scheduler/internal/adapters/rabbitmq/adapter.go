package rabbitmq

import (
	"github.com/BETEPOK3/tawt-scheduler/common/config"
	"github.com/rabbitmq/amqp091-go"
)

// Adapter - структура для доступа к брокеру очередей RabbitMQ.
type Adapter struct {
	cfg                *config.RabbitMQConfig
	rabbitMqConnection *amqp091.Connection
}

// NewRabbitAdapter - конструктор Adapter.
func NewRabbitAdapter(
	cfg *config.RabbitMQConfig,
	rabbitMqConnection *amqp091.Connection,
) *Adapter {
	return &Adapter{
		cfg:                cfg,
		rabbitMqConnection: rabbitMqConnection,
	}
}
