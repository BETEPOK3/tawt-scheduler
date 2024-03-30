package rabbitmq

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/rabbitmq/amqp091-go"
)

// SendTask - отправить задачу в очередь.
func (a *Adapter) SendTask(ctx context.Context, dto *domain.SendTaskMessageDto) error {
	channel, err := a.newChannel()
	if err != nil {
		return err
	}

	err = channel.PublishWithContext(ctx,
		"",
		dto.QueueName,
		false,
		false,
		amqp091.Publishing{
			MessageId:    dto.TaskId.String(),
			Priority:     dto.Priority,
			DeliveryMode: amqp091.Persistent,
		},
	)
	if err != nil {
		return errors.Wrap(err, errors.ERR_ADAPTER, "rabbitMqConnection.PublishWithContext")
	}

	return nil
}
