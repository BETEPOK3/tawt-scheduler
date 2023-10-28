package rabbit

import (
	"context"
	"github.com/pkg/errors"
	"github.com/rabbitmq/amqp091-go"
)

// SendRequest - отправить запрос в очередь.
func (a *adapterImpl) SendRequest(ctx context.Context, req []byte) error {
	corrId := "1"

	// Отправка запроса.
	err := a.channel.PublishWithContext(ctx,
		"",
		a.queueSend.Name,
		false,
		false,
		amqp091.Publishing{
			ContentType:   "json/application",
			CorrelationId: corrId,
			Body:          req,
		})
	if err != nil {
		return errors.Wrap(err, "publish message")
	}

	return nil
}
