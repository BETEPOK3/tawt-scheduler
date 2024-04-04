package requests

import (
	"encoding/json"
)

// GetTaskByIdRequest - запрос на получение задачи по идентификатору.
type GetTaskByIdRequest struct {
	Id string `json:"id"`
}

// GetTaskByIdResponse - ответ на получение задачи по идентификатору.
type GetTaskByIdResponse struct {
	Task *Task `json:"task"`
}

// Task - сущность задачи.
type Task struct {
	Id         string          `json:"id"`
	Type       string          `json:"type"`
	Input      json.RawMessage `json:"input"`
	Output     json.RawMessage `json:"output,omitempty"`
	CreatedAt  string          `json:"created_at"`
	FinishedAt *string         `json:"finished_at,omitempty"`
	Status     string          `json:"status"`
	Error      *string         `json:"error,omitempty"`
}
