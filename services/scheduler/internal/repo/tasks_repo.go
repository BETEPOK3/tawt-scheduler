package repo

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/db"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/repo/dbstruct"
	"gorm.io/gorm/clause"
)

// tasksRepo - репозиторий для работы с задачами.
type tasksRepo struct {
	db *db.DB
}

// NewTasksRepo - конструктор tasksRepo.
func NewTasksRepo(db *db.DB) *tasksRepo {
	return &tasksRepo{db: db}
}

// GetById - получить задачу по идентификатору.
func (r *tasksRepo) GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error) {
	task := &dbstruct.DBTask{Id: id}

	err := r.db.WithDefaultOptions(ctx).Take(task).Error
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_DB, "get task with id %s", id)
	}

	return task.ToDomain(), nil
}

// GetByIdWithLock - получить с блокировкой задачу по идентификатору.
func (r *tasksRepo) GetByIdWithLock(ctx context.Context, id uuid.UUID) (*entities.Task, error) {
	task := &dbstruct.DBTask{Id: id}

	err := r.db.WithDefaultOptions(ctx).
		Clauses(clause.Locking{Strength: "UPDATE"}).
		Take(task).Error
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_DB, "get task with id %s", id)
	}

	return task.ToDomain(), nil
}

// Create - создать задачу.
func (r *tasksRepo) Create(ctx context.Context, dto *entities.CreateTaskDto) (uuid.UUID, error) {
	task := dbstruct.NewDBCreateTask(dto)

	err := r.db.WithDefaultOptions(ctx).Create(&task).Error
	if err != nil {
		return uuid.Nil(), errors.Wrap(err, errors.ERR_DB, "create task")
	}

	return task.Id, nil
}

// Edit - редактировать задачу.
func (r *tasksRepo) Edit(ctx context.Context, dto *domain.EditTaskDto) error {
	editDto := dbstruct.NewDBUpdateTask(dto)

	query := r.db.WithDefaultOptions(ctx).
		Model(&dbstruct.DBTask{Id: dto.Id}).
		Updates(editDto)
	if query.Error != nil {
		return errors.Wrap(query.Error, errors.ERR_DB, "error updating task with id %s", dto.Id)
	}
	if query.RowsAffected == 0 {
		return errors.Error(errors.ERR_NOT_IMPLEMENTED, "task with id %s not found", dto.Id)
	}

	return nil
}
