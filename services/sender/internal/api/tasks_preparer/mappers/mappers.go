package mappers

import "github.com/BETEPOK3/tawt-scheduler/common/entities"

var (
	taskTypesMapFromRest = map[int]entities.TaskType{
		1: entities.TaskTypeGraphematical,
		2: entities.TaskTypeGama,
	}
)

func taskTypeFromRest(tp int) entities.TaskType {
	if result, ok := taskTypesMapFromRest[tp]; ok {
		return result
	}
	return entities.TaskTypeUnspecified
}
