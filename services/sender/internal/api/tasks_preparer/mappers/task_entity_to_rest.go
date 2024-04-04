package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/utils"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"
)

// TaskEntityToRest - преобразовать сущность задачи в REST сущность.
func TaskEntityToRest(src *entities.Task) *requests.Task {
	return &requests.Task{
		Id:         src.Id.String(),
		Type:       string(src.Type),
		Input:      src.Input,
		Output:     src.Output,
		CreatedAt:  utils.TimeToPb(src.CreatedAt),
		FinishedAt: utils.PtrTimeToPb(src.FinishedAt),
		Status:     string(src.Status),
		Error:      src.Error,
	}
}
