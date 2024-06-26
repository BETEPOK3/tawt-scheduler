package dbstruct

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"time"
)

const TasksTableName = "tasks"

// DBTask - сущность задачи.
type DBTask struct {
	Id         uuid.UUID `gorm:"primaryKey"`
	Input      []byte
	Output     []byte
	Type       string
	Status     string
	CreatedAt  time.Time
	FinishedAt *time.Time
	Error      *string
}

// DBTaskList - список DBTask.
type DBTaskList []*DBTask

// DBCreateTask - DTO создания задачи.
type DBCreateTask struct {
	Id     uuid.UUID `gorm:"primaryKey"`
	Input  []byte
	Type   string
	Status string
}

// DBUpdateTask - DTO редактирования задачи.
type DBUpdateTask struct {
	Id         uuid.UUID
	Status     *string
	Output     *[]byte
	FinishedAt *time.Time
	Error      *string
}

// NewDBCreateTask - конструктор DBCreateTask.
func NewDBCreateTask(dto *entities.CreateTaskDto) *DBCreateTask {
	return &DBCreateTask{
		Id:     uuid.NewULID(),
		Input:  dto.Input,
		Type:   string(dto.Type),
		Status: string(entities.TaskStatusCreated),
	}
}

// NewDBUpdateTask - конструктор DBUpdateTask.
func NewDBUpdateTask(dto *domain.EditTaskDto) *DBUpdateTask {
	return &DBUpdateTask{
		Id:         dto.Id,
		Status:     (*string)(dto.Status),
		Output:     dto.Output,
		FinishedAt: dto.FinishedAt,
		Error:      dto.Error,
	}
}

// TableName - название таблицы.
func (d *DBTask) TableName() string {
	return TasksTableName
}

// TableName - название таблицы.
func (d *DBCreateTask) TableName() string {
	return TasksTableName
}

// TableName - название таблицы.
func (d *DBUpdateTask) TableName() string {
	return TasksTableName
}

// ToDomain - преобразовать в доменную сущность.
func (d *DBTask) ToDomain() *entities.Task {
	return &entities.Task{
		Id:         d.Id,
		Type:       entities.TaskType(d.Type),
		Input:      d.Input,
		Output:     d.Output,
		CreatedAt:  d.CreatedAt,
		FinishedAt: d.FinishedAt,
		Status:     entities.TaskStatus(d.Status),
		Error:      d.Error,
	}
}

// ToDomain - преобразовать в доменную сущность.
func (list DBTaskList) ToDomain() []*entities.Task {
	return funcs.Map(list, (*DBTask).ToDomain)
}
