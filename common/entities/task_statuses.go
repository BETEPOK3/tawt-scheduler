package entities

// TaskStatus - статус задачи.
type TaskStatus string

const (
	// TaskStatusUnspecified - статус не указан.
	TaskStatusUnspecified TaskStatus = ""
	// TaskStatusCreated - статус "создана".
	TaskStatusCreated TaskStatus = "CREATED"
	// TaskStatusQueued - статус "в очереди".
	TaskStatusQueued TaskStatus = "QUEUED"
	// TaskStatusInProgress - статус "в обработке".
	TaskStatusInProgress TaskStatus = "IN_PROGRESS"
	// TaskStatusCompleted - статус "завершена".
	TaskStatusCompleted TaskStatus = "COMPLETED"
	// TaskStatusError - статус "завершена в ошибкой".
	TaskStatusError TaskStatus = "ERROR"
)
