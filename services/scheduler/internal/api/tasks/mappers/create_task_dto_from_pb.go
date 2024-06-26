package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/mappers"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// CreateTaskDtoFromPb - преобразование DTO создания задачи в доменную сущность.
func CreateTaskDtoFromPb(src *schema.CreateTask) *entities.CreateTaskDto {
	return &entities.CreateTaskDto{
		Type:     mappers.TaskTypeFromPb(src.Type),
		Input:    src.Input,
		Priority: uint8(src.Priority),
	}
}
