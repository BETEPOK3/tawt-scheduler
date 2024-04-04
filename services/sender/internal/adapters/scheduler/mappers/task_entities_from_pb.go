package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/mappers"
	"github.com/BETEPOK3/tawt-scheduler/common/utils"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// TaskEntityFromPb - преобразование сущности задачи в доменную сущность.
func TaskEntityFromPb(src *schema.Task) *entities.Task {
	result := &entities.Task{
		Id:         uuid.MustParse(src.Id),
		Type:       mappers.TaskTypeFromPb(src.Type),
		Input:      []byte(src.Input),
		Output:     nil,
		CreatedAt:  utils.MustTimeFromPb(src.CreatedAt),
		FinishedAt: utils.PtrMustTimeFromPb(src.FinishedAt),
		Status:     taskStatusFromPb(src.Status),
		Error:      src.Error,
	}

	if src.Output != nil {
		result.Output = []byte(*src.Output)
	}

	return result
}

func taskStatusFromPb(src schema.Task_Status) entities.TaskStatus {
	switch src {
	case schema.Task_QUEUED:
		return entities.TaskStatusQueued
	case schema.Task_IN_PROGRESS:
		return entities.TaskStatusInProgress
	case schema.Task_COMPLETED:
		return entities.TaskStatusCompleted
	case schema.Task_ERROR:
		return entities.TaskStatusError
	default:
		return entities.TaskStatusUnspecified
	}
}
