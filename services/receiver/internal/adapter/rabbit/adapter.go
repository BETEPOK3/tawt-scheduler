package rabbit

import "github.com/rabbitmq/amqp091-go"

type adapterImpl struct {
	channel  *amqp091.Channel
	messages <-chan amqp091.Delivery
}

// NewRabbitAdapter - конструктор adapterImpl.
func NewRabbitAdapter(
	channel *amqp091.Channel,
	messages <-chan amqp091.Delivery,
) *adapterImpl {
	return &adapterImpl{
		channel:  channel,
		messages: messages,
	}
}
