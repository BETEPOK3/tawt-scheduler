package rabbitmq

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/rabbitmq/amqp091-go"
)

// SendTask - отправить задачу в очередь.
func (a *Adapter) SendTask(ctx context.Context, dto *domain.SendTaskMessageDto) error {
	channel, ok := a.factory[dto.QueueName]
	if !ok {
		return errors.Error(errors.ERR_ADAPTER, "queue %s doesn't exist", dto.QueueName)
	}

	a.mu.Lock()
	err := channel.PublishWithContext(ctx,
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
	a.mu.Unlock()
	if err != nil {
		return errors.Wrap(err, errors.ERR_ADAPTER, "rabbitMqConnection.PublishWithContext")
	}

	return nil
}
