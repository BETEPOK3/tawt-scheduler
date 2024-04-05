package domain

import "github.com/BETEPOK3/tawt-scheduler/common/entities"

// QueueType - тип очереди.
type QueueType int

const (
	// QueueTypeUnspecified - тип очереди не определён.
	QueueTypeUnspecified QueueType = 0
	// QueueTypeSlow - тип очереди "медленная".
	QueueTypeSlow QueueType = 1
	// QueueTypeFast - тип очереди "быстрая".
	QueueTypeFast QueueType = 2
)

// TaskStreamInterface - интерфейс для обработки задач.
type TaskStreamInterface interface {
	ProcessTasks(tasks entities.TaskList) error
}
