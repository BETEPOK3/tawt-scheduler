package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

// RabbitAdapter - интерфейс адаптера RabbitMQ.
type RabbitAdapter interface {
	Send(ctx context.Context, dto *domain.SendTaskMessageDto) error
}
