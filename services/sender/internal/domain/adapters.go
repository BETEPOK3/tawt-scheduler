package domain

import "context"

// RabbitAdapter - интерфейс адаптера RabbitMQ.
type RabbitAdapter interface {
	SendRequest(ctx context.Context, req []byte) ([]byte, error)
}
