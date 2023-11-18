package domain

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
)

// RabbitAdapter - интерфейс адаптера RabbitMQ.
type RabbitAdapter interface {
	SendTask(ctx context.Context, task *entities.Task, priority uint8) error
}
