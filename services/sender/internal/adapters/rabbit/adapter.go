package rabbit

import (
	"github.com/rabbitmq/amqp091-go"
)

// adapterImpl - структура для доступа к брокеру очередей RabbitMQ.
type adapterImpl struct {
	channel      *amqp091.Channel
	queueSend    amqp091.Queue
	queueReceive amqp091.Queue
	messages     <-chan amqp091.Delivery
}

// NewRabbitAdapter - конструктор adapterImpl.
func NewRabbitAdapter(
	channel *amqp091.Channel,
	queueSend amqp091.Queue,
	queueReceive amqp091.Queue,
	messages <-chan amqp091.Delivery,
) *adapterImpl {
	return &adapterImpl{
		channel:      channel,
		queueSend:    queueSend,
		queueReceive: queueReceive,
		messages:     messages,
	}
}
