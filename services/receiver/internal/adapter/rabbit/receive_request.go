package rabbit

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
)

// ReceiveRequest - получить запрос из RabbitMQ.
func (a *adapterImpl) ReceiveRequest(ctx context.Context) (*amqp091.Delivery, error) {
	for msg := range a.messages {
		_ = msg.Ack(false)

		return &msg, nil
	}

	return nil, nil
}
