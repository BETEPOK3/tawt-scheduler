package dbstruct

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"time"
)

const tasksTableName = "tasks"

// DBTask - сущность задачи.
type DBTask struct {
	Id         uuid.UUID `gorm:"primaryKey"`
	UserId     uuid.UUID
	Input      []byte
	Output     []byte
	Type       string
	Status     string
	CreatedAt  time.Time
	FinishedAt *time.Time
	Error      *string
}

// DBCreateTask - DTO создания задачи.
type DBCreateTask struct {
	Id     uuid.UUID
	UserId uuid.UUID
	Input  []byte
	Type   string
	Status string
}

// NewDBCreateTask - конструктор DBCreateTask.
func NewDBCreateTask(dto *domain.CreateTaskDto) *DBCreateTask {
	return &DBCreateTask{
		Id:     uuid.NewULID(),
		UserId: dto.UserId,
		Input:  dto.InputData,
		Type:   string(dto.Type),
		Status: string(entities.TaskStatusInQueue),
	}
}

func (d *DBTask) TableName() string {
	return tasksTableName
}

func (d *DBCreateTask) TableName() string {
	return tasksTableName
}
