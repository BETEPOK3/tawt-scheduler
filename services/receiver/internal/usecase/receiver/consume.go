package receiver

import (
	"context"
	"github.com/pkg/errors"
)

// Consume - проверка очереди RabbitMQ и отправка запросов в TAWT.
func (a *Usecase) Consume(ctx context.Context) error {
	msg, err := a.rabbitAdapter.ReceiveRequest(ctx)
	if err != nil {
		return errors.Wrap(err, "receive request")
	}

	_, _, err = a.tawtAdapter.SendRequest(ctx, msg.Body)

	return nil
}
