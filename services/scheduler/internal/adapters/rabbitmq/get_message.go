package rabbitmq

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/rabbitmq/amqp091-go"
)

// GetMessage - получить сообщение.
func (a *Adapter) GetMessage(ctx context.Context, queueName string) (*amqp091.Delivery, error) {
	channel, err := a.newChannel()
	if err != nil {
		return nil, err
	}

	msg, ok, err := channel.Get(queueName, false)
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_ADAPTER, "rabbitMqChannel.Consume")
	}
	if !ok {
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

		msg, ok = <-msgs
		if !ok {
			return nil, errors.Wrap(err, errors.ERR_ADAPTER, "get message from channel")
		}
		_ = channel.Cancel("", false)
	}

	return &msg, nil
}
