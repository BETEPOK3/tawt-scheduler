package domain

import "github.com/BETEPOK3/tawt-scheduler/common/entities"

// TawtRequestDto - DTO запроса в TAWT.
type TawtRequestDto struct {
	TaskType entities.TaskType
	Data     []byte
}
