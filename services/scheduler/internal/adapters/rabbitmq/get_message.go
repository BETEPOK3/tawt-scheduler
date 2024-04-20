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
		subCtx, cancel := context.WithCancel(ctx)
		defer cancel()

		msgs, err := channel.ConsumeWithContext(
			subCtx,
			queueName,
			"",
			false,
			false,
			false,
			false,
			nil,
		)
		if err != nil && !errors.Is(err, subCtx.Err()) {
			return nil, errors.Wrap(err, errors.ERR_ADAPTER, "rabbitMqChannel.Consume")
		}

		select {
		case msg, ok = <-msgs:
			if !ok {
				return nil, errors.Wrap(err, errors.ERR_ADAPTER, "get message from channel")
			}
		case <-subCtx.Done():
		}

		cancel()

		for msg := range msgs {
			_ = msg.Nack(false, false)
		}
	}

	return &msg, nil
}
