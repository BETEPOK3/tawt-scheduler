package receiver

import (
	"context"
	"encoding/json"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/domain"
	"github.com/pkg/errors"
)

// Consume - проверка очереди RabbitMQ и отправка запросов в TAWT.
func (u *Usecase) Consume(ctx context.Context) error {
	msg, err := u.rabbitAdapter.ReceiveTask(ctx)
	if err != nil {
		return errors.Wrap(err, "receive request")
	}

	task := &entities.Task{}

	err = json.Unmarshal(msg.Body, task)
	if err != nil {
		return errors.Wrap(err, "can't parse received message")
	}

	err = u.tasksRepo.Start(ctx, task.Id)
	if err != nil {
		return errors.Wrap(err, "can't start task")
	}

	tawtRequest := &domain.TawtRequestDto{
		TaskType: task.Type,
		Data:     task.Data,
	}

	resp, err := u.tawtAdapter.SendRequest(ctx, tawtRequest)
	if err != nil {
		return err
	}

	_ = msg.Ack(false)

	if !resp.Success {
		err = u.tasksRepo.FinishWithError(ctx, task.Id, "error")
		if err != nil {
			return errors.Wrap(err, "can't finish task with error")
		}
	} else {
		err = u.tasksRepo.Finish(ctx, task.Id, []byte(resp.Data))
		if err != nil {
			return errors.Wrap(err, "can't finish task")
		}
	}

	return nil
}
