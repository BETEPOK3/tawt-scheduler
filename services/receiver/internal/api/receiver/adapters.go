package receiver

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
)

// RabbitAdapter - интерфейс для работы с брокером очередей RabbitMQ.
type RabbitAdapter interface {
	ReceiveRequest(ctx context.Context) (*amqp091.Delivery, error)
	SendResponse(ctx context.Context, req *amqp091.Delivery, data []byte) error
}

// TawtAdapter - интерфейс для работы с TAWT.
type TawtAdapter interface {
	SendRequest(ctx context.Context, data []byte) (int, []byte, error)
}
