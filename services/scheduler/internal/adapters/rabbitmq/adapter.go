package rabbitmq

import (
	"github.com/rabbitmq/amqp091-go"
)

// Adapter - структура для доступа к брокеру очередей RabbitMQ.
type Adapter struct {
	conn *amqp091.Connection
}

// NewRabbitAdapter - конструктор Adapter.
func NewRabbitAdapter(
	conn *amqp091.Connection,
) *Adapter {
	return &Adapter{
		conn: conn,
	}
}
