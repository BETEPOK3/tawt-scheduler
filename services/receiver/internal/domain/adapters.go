package domain

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
)

// RabbitAdapter - интерфейс для работы с брокером очередей RabbitMQ.
type RabbitAdapter interface {
	ReceiveTask(ctx context.Context) (*amqp091.Delivery, error)
}

// TawtAdapter - интерфейс для работы с TAWT.
type TawtAdapter interface {
	SendRequest(ctx context.Context, dto *TawtRequestDto) (*TawtResponseDto, error)
}
