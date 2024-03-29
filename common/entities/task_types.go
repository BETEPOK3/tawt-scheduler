package entities

// TaskType - тип задачи.
type TaskType string

const (
	TaskTypeUnspecified   TaskType = ""
	TaskTypeGraphematical TaskType = "GRAPHEMATICAL"
	TaskTypeGamma         TaskType = "GAMMA"
)
