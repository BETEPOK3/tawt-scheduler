package processor

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/rabbitmq/amqp091-go"
)

// RabbitAdapter - интерфейс адаптера RabbitMQ.
type RabbitAdapter interface {
	SendTask(ctx context.Context, dto *domain.SendTaskMessageDto) error
	GetMessage(ctx context.Context, queueName string) (*amqp091.Delivery, error)
}
