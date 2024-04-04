package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/mappers"
	"github.com/BETEPOK3/tawt-scheduler/common/utils"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// TaskEntityToPb - преобразование доменной сущности задачи в сущность схемы.
func TaskEntityToPb(src *entities.Task) *schema.Task {
	result := &schema.Task{
		Id:         src.Id.String(),
		Type:       mappers.TaskTypeToPb(src.Type),
		Input:      string(src.Input),
		CreatedAt:  utils.TimeToPb(src.CreatedAt),
		FinishedAt: utils.PtrTimeToPb(src.FinishedAt),
		Status:     testStatusToPb(src.Status),
		Error:      src.Error,
	}

	if len(src.Output) > 0 {
		result.Output = funcs.Ptr(string(src.Output))
	}

	return result
}

func testStatusToPb(src entities.TaskStatus) schema.Task_Status {
	switch src {
	case entities.TaskStatusQueued:
		return schema.Task_QUEUED
	case entities.TaskStatusInProgress:
		return schema.Task_IN_PROGRESS
	case entities.TaskStatusCompleted:
		return schema.Task_COMPLETED
	case entities.TaskStatusError:
		return schema.Task_ERROR
	default:
		return schema.Task_TASK_STATUS_UNSPECIFIED
	}
}
