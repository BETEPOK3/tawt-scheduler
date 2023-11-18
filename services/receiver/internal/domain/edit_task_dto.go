package domain

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"time"
)

// EditTaskDto - DTO редактирования задачи.
type EditTaskDto struct {
	Id         uuid.UUID
	Output     *[]byte
	Status     entities.TaskStatus
	FinishedAt *time.Time
	Error      *string
}
