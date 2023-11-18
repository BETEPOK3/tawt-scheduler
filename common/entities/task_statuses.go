package entities

// TaskStatus - статус задачи.
type TaskStatus string

const (
	// TaskStatusUnspecified - статус не указан.
	TaskStatusUnspecified TaskStatus = ""
	// TaskStatusInQueue - статус "в очереди".
	TaskStatusInQueue TaskStatus = "IN_QUEUE"
	// TaskStatusIsProcessing - статус "в обработке".
	TaskStatusIsProcessing TaskStatus = "IS_PROCESSING"
	// TaskStatusCompleted - статус "завершена".
	TaskStatusCompleted TaskStatus = "COMPLETED"
	// TaskStatusFailure - статус "завершена в ошибкой".
	TaskStatusFailure = "FAILURE"
)
