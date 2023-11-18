package repo

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/repo/dbstruct"
	"github.com/pkg/errors"
	"gorm.io/gorm"
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
	Create(ctx context.Context, dto *domain.CreateTaskDto) (uuid.UUID, error)
}

// Create - создать задачу.
func (r *tasksRepo) Create(ctx context.Context, dto *domain.CreateTaskDto) (uuid.UUID, error) {
	task := dbstruct.NewDBCreateTask(dto)

	err := r.db.WithContext(ctx).Create(&task).Error
	if err != nil {
		return uuid.Nil(), errors.Wrap(err, "can't create task")
	}

	return task.Id, nil
}
