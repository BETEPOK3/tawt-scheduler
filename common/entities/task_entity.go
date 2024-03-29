package entities

import (
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"time"
)

// Task - задача.
type Task struct {
	Id         uuid.UUID
	Type       TaskType
	Input      []byte
	Output     []byte
	CreatedAt  time.Time
	FinishedAt *time.Time
	Status     TaskStatus
	Error      *string
}

// TaskList - список Task.
type TaskList []*Task

// CreateTaskDto - DTO создания задачи.
type CreateTaskDto struct {
	Type     TaskType
	Input    []byte
	Priority uint8
}
