package rabbit

import (
	"github.com/rabbitmq/amqp091-go"
)

// adapterImpl - структура для доступа к брокеру очередей RabbitMQ.
type adapterImpl struct {
	channel   *amqp091.Channel
	queueSend amqp091.Queue
}

// NewRabbitAdapter - конструктор adapterImpl.
func NewRabbitAdapter(
	channel *amqp091.Channel,
	queueSend amqp091.Queue,
) *adapterImpl {
	return &adapterImpl{
		channel:   channel,
		queueSend: queueSend,
	}
}
