package entities

import (
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// Task - задача.
type Task struct {
	Id   uuid.UUID `json:"id"`
	Type TaskType  `json:"type"`
	Data []byte    `json:"data"`
}
