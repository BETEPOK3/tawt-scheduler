package domain

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// CreateTaskDto - DTO создания задачи.
type CreateTaskDto struct {
	UserId    uuid.UUID
	Type      entities.TaskType
	InputData []byte
}
