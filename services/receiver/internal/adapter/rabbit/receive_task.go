package rabbit

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
)

// ReceiveTask - получить задачу из очереди.
func (a *adapterImpl) ReceiveTask(ctx context.Context) (*amqp091.Delivery, error) {
	for msg := range a.messages {
		return &msg, nil
	}

	return nil, nil
}
