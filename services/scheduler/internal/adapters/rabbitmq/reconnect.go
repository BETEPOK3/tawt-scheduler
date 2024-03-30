package rabbitmq

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/rabbitmq/amqp091-go"
)

func (a *Adapter) newChannel() (*amqp091.Channel, error) {
	ch, err := a.rabbitMqConnection.Channel()
	if err != nil {
		conn, err := amqp091.Dial(a.cfg.Url)
		if err != nil {
			return nil, errors.Wrap(err, errors.ERR_ADAPTER, "Dial")
		}

		ch, err = conn.Channel()
		if err != nil {
			return nil, errors.Wrap(err, errors.ERR_ADAPTER, "Channel")
		}

		a.rabbitMqConnection = conn
	}

	return ch, nil
}
