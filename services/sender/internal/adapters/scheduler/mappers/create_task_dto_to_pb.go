package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/mappers"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// CreateTaskDtoToPb - преобразовать DTO создания задачи в сущность схемы.
func CreateTaskDtoToPb(src *entities.CreateTaskDto) *schema.CreateTask {
	return &schema.CreateTask{
		Type:     mappers.TaskTypeToPb(src.Type),
		Input:    src.Input,
		Priority: uint32(src.Priority),
	}
}
