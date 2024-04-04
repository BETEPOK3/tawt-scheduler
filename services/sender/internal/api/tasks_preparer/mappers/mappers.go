package mappers

import "github.com/BETEPOK3/tawt-scheduler/common/entities"

var (
	taskTypesMapToRest = map[entities.TaskType]int{
		entities.TaskTypeGraphematical: 1,
		entities.TaskTypeGama:          2,
	}
)
