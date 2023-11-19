package entities

import (
	"encoding/json"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
)

// Task - задача.
type Task struct {
	Id   uuid.UUID       `json:"id"`
	Type TaskType        `json:"type"`
	Data json.RawMessage `json:"data"`
}
