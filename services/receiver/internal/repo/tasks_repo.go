package repo

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/repo/dbstruct"
	"github.com/pkg/errors"
	"gorm.io/gorm"
	"time"
)

// tasksRepo - репозиторий для работы с задачами.
type tasksRepo struct {
	db *gorm.DB
}

// NewTasksRepo - конструктор tasksRepo.
func NewTasksRepo(db *gorm.DB) *tasksRepo {
	return &tasksRepo{db: db}
}

// TasksRepository - интерфейс репозитория для работы с задачами.
type TasksRepository interface {
	Start(ctx context.Context, id uuid.UUID) error
	Finish(ctx context.Context, id uuid.UUID, output []byte) error
	FinishWithError(ctx context.Context, id uuid.UUID, errString string) error
}

// Start - начать задачу.
func (r *tasksRepo) Start(ctx context.Context, id uuid.UUID) error {
	update := &dbstruct.DBUpdateTask{
		Id:     id,
		Status: funcs.Ptr(string(entities.TaskStatusIsProcessing)),
	}

	err := r.db.WithContext(ctx).Updates(&update).Error
	if err != nil {
		return errors.Wrap(err, "cant update task")
	}

	return nil
}

// Finish - завершить задачу.
func (r *tasksRepo) Finish(ctx context.Context, id uuid.UUID, output []byte) error {
	update := &dbstruct.DBUpdateTask{
		Id:         id,
		Status:     funcs.Ptr(string(entities.TaskStatusCompleted)),
		Output:     &output,
		FinishedAt: funcs.Ptr(time.Now()),
	}

	err := r.db.WithContext(ctx).Updates(&update).Error
	if err != nil {
		return errors.Wrap(err, "cant update task")
	}

	return nil
}

// FinishWithError - завершить задачу с ошибкой.
func (r *tasksRepo) FinishWithError(ctx context.Context, id uuid.UUID, errString string) error {
	update := &dbstruct.DBUpdateTask{
		Id:         id,
		Status:     funcs.Ptr(string(entities.TaskStatusFailure)),
		FinishedAt: funcs.Ptr(time.Now()),
		Error:      &errString,
	}

	err := r.db.WithContext(ctx).Updates(&update).Error
	if err != nil {
		return errors.Wrap(err, "cant update task")
	}

	return nil
}
