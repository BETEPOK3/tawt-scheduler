package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"github.com/pkg/errors"
)

// Create - создать задачу.
func (u *Usecase) Create(ctx context.Context, dto *domain.CreateTaskDto) error {
	id, err := u.tasksRepo.Create(ctx, dto)
	if err != nil {
		return errors.Wrap(err, "can't create task in db")
	}

	priority, err := u.getPriority(dto)
	if err != nil {
		return err
	}

	task := &entities.Task{
		Id:   id,
		Type: dto.Type,
		Data: dto.InputData,
	}

	err = u.rabbitAdapter.SendTask(ctx, task, priority)
	if err != nil {
		return errors.Wrap(err, "can't send request to scheduler")
	}

	return nil
}

func (u *Usecase) getPriority(dto *domain.CreateTaskDto) (uint8, error) {
	var num float64

	switch dto.Type {
	case entities.TaskTypeGraphematicalParser:
		res, err := domain.DecodeTaskInputDataGraphematic(dto.InputData)
		if err != nil {
			return 0, err
		}

		num = 10.0 - float64(len(res.Text))/537819.0
	}

	if num < 0.0 {
		return 0.0, nil
	} else if num > 9.0 {
		return 9.0, nil
	}
	return uint8(num), nil
}
