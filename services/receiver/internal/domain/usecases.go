package domain

import "context"

// ReceiverUsecase - бизнес-логика для работы с получателем.
type ReceiverUsecase interface {
	Consume(ctx context.Context) error
}
