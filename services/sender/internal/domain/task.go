package domain

import "github.com/BETEPOK3/tawt-scheduler/common/entities"

// PrepareTaskDto - DTO подготовки задачи к созданию.
type PrepareTaskDto struct {
	Type  entities.TaskType
	Input string
}
