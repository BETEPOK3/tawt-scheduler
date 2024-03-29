package rabbitmq

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/rabbitmq/amqp091-go"
)

// Send - отправить задачу в очередь.
func (a *Adapter) Send(ctx context.Context, dto *domain.SendTaskMessageDto) error {
	channel, err := a.conn.Channel()
	if err != nil {
		return errors.Wrap(err, errors.ERR_ADAPTER, "conn.Channel")
	}

	err = channel.PublishWithContext(ctx,
		"",
		dto.QueueName,
		false,
		false,
		amqp091.Publishing{
			CorrelationId: dto.CorrId.String(),
			Priority:      dto.Priority,
		})
	if err != nil {
		return errors.Wrap(err, errors.ERR_ADAPTER, "conn.PublishWithContext")
	}

	return nil
}
