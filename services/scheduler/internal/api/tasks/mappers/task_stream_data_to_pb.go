package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/mappers"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// TaskStreamDataToPb - преобразовать данные задачи в сущность схемы для потокой обработки.
func TaskStreamDataToPb(src *entities.Task) *schema.TaskStreamData {
	return &schema.TaskStreamData{
		TaskId: src.Id.String(),
		Type:   mappers.TaskTypeToPb(src.Type),
		Input:  string(src.Input),
	}
}
