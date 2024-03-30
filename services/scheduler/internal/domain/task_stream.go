package domain

import "github.com/BETEPOK3/tawt-scheduler/common/entities"

// TaskStreamInterface - интерфейс для обработки задач.
type TaskStreamInterface interface {
	ProcessTask(task *entities.Task) error
}
