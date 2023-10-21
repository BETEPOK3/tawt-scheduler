package rabbit

import (
	"context"
	"github.com/rabbitmq/amqp091-go"
)

// SendResponse - отправить ответ RabbitMQ.
func (a *adapterImpl) SendResponse(ctx context.Context, req *amqp091.Delivery, data []byte) error {
	err := a.channel.PublishWithContext(ctx,
		"",          // exchange
		req.ReplyTo, // routing key
		false,       // mandatory
		false,       // immediate
		amqp091.Publishing{
			ContentType:   "json/application",
			CorrelationId: req.CorrelationId,
			Body:          data,
		})
	if err != nil {
		panic(err)
	}

	return nil
}
