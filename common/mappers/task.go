package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// TaskTypeToPb - преобразовать тип задачи в сущность схемы.
func TaskTypeToPb(src *entities.Task) *schema.TaskType {
	switch src.Type {
	case entities.TaskTypeGraphematical:
		return &schema.TaskType{
			Specific: &schema.TaskType_Graphematical{Graphematical: &schema.TaskTypeGraphematical{}},
		}
	case entities.TaskTypeGamma:
		return &schema.TaskType{
			Specific: &schema.TaskType_Gamma{Gamma: &schema.TaskTypeGamma{}},
		}
	default:
		return nil
	}
}

// TaskTypeFromPb - преобразовать тип задачи в доменную сущность.
func TaskTypeFromPb(src *schema.TaskType) (entities.TaskType, []byte) {
	switch src.Specific.(type) {
	case *schema.TaskType_Graphematical:
		return entities.TaskTypeGraphematical, nil
	case *schema.TaskType_Gamma:
		return entities.TaskTypeGamma, nil
	default:
		return entities.TaskTypeUnspecified, nil
	}
}
