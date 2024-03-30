package rabbitmq

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/rabbitmq/amqp091-go"
)

// GetTaskStream - получить поток задач.
func (a *Adapter) GetTaskStream(ctx context.Context, queueName string) (<-chan amqp091.Delivery, error) {
	channel, err := a.newChannel()
	if err != nil {
		return nil, err
	}

	msgs, err := channel.ConsumeWithContext(
		ctx,
		queueName,
		"",
		false,
		false,
		false,
		false,
		nil,
	)
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_ADAPTER, "rabbitMqChannel.Consume")
	}

	return msgs, nil
}
