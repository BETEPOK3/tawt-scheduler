package rabbit

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
)

// SendRequest - отправить запрос в очередь.
func (a *adapterImpl) SendRequest(ctx context.Context, req []byte) ([]byte, error) {
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
			ReplyTo:       a.queueReceive.Name,
			Body:          req,
		})
	if err != nil {
		return nil, err
	}

	// Приём ответа.
	var reply []byte

	for msg := range a.messages {
		if corrId == msg.CorrelationId {
			reply = msg.Body
			break
		}
	}

	return reply, nil
}
