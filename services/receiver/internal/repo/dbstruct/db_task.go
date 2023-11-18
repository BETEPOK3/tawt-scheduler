package dbstruct

import (
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
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

// DBUpdateTask - DTO для редактирования задачи.
type DBUpdateTask struct {
	Id         uuid.UUID
	Output     *[]byte
	Status     *string
	FinishedAt *time.Time
	Error      *string
}

// TableName - название таблицы.
func (d *DBTask) TableName() string {
	return tasksTableName
}

// TableName - название таблицы.
func (d *DBUpdateTask) TableName() string {
	return tasksTableName
}
