package rabbit

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
	"log"
)

// ReceiveRequest - получить запрос из RabbitMQ.
func (a *adapterImpl) ReceiveRequest(ctx context.Context) (*amqp091.Delivery, error) {
	for msg := range a.messages {
		_ = msg.Ack(false)

		log.Printf("received message: %s\n", msg.Body)

		return &msg, nil
	}

	return nil, nil
}
