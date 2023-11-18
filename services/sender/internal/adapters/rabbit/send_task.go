package rabbit

import (
	"context"
	"encoding/json"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/pkg/errors"
	"github.com/rabbitmq/amqp091-go"
)

// SendTask - отправить задачу в очередь.
func (a *adapterImpl) SendTask(ctx context.Context, task *entities.Task, priority uint8) error {
	data, err := json.Marshal(task)
	if err != nil {
		return errors.Wrap(err, "marshal json")
	}

	err = a.channel.PublishWithContext(ctx,
		"",
		a.queueSend.Name,
		false,
		false,
		amqp091.Publishing{
			ContentType: "json/application",
			Priority:    priority,
			Body:        data,
		})
	if err != nil {
		return errors.Wrap(err, "publish message")
	}

	return nil
}
