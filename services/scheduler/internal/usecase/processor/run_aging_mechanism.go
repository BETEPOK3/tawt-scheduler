package processor

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"log"
	"time"
)

// RunAgingMechanism - запустить механизм старения.
func (u *usecase) RunAgingMechanism(ctx context.Context) {
	go func() {
		for {
			msgs, err := u.rabbitAdapter.GetTaskStream(ctx, u.queuesConfig.Dlx)
			if err != nil {
				log.Println("RunAgingMechanism: error listening to RabbitMQ")
				break
			}

			for msg := range msgs {
				priority := msg.Priority
				if priority < u.rabbitmqConfig.MaxPriority {
					priority++
				}

				err = u.rabbitAdapter.SendTask(ctx, &domain.SendTaskMessageDto{
					QueueName: u.queuesConfig.Fast,
					TaskId:    uuid.MustParse(msg.MessageId),
					Priority:  priority,
				})
				if err != nil {
					log.Printf("RunAgingMechanism: error increasing priority of task with id %s from %d to %d\n", msg.MessageId, msg.Priority, priority)
					break
				}

				log.Printf("RunAgingMechanism: increased priority of task with id %s from %d to %d\n", msg.MessageId, msg.Priority, priority)

				_ = msg.Ack(false)
			}
		}

		time.Sleep(time.Duration(u.rabbitmqConfig.ReconnectDelay))
	}()
}
