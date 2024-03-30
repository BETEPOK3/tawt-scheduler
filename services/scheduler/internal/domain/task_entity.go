package domain

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"time"
)

// SendTaskMessageDto - DTO отправки сообщения с задачей в очередь.
type SendTaskMessageDto struct {
	QueueName string
	TaskId    uuid.UUID
	Priority  uint8
}

// EditTaskDto - DTO редактирования задачи.
type EditTaskDto struct {
	Id         uuid.UUID
	Status     *entities.TaskStatus
	Output     *[]byte
	FinishedAt *time.Time
	Error      *string
}

// FinishTaskDto - DTO заверешения задачи.
type FinishTaskDto struct {
	Id     uuid.UUID
	Output *[]byte
	Error  *string
}
