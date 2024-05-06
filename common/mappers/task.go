package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// TaskTypeToPb - преобразовать тип задачи в сущность схемы.
func TaskTypeToPb(src entities.TaskType) *schema.TaskType {
	switch src {
	case entities.TaskTypeGraphematical:
		return &schema.TaskType{
			Specific: &schema.TaskType_Graphematical{Graphematical: &schema.TaskTypeGraphematical{}},
		}
	case entities.TaskTypeGama:
		return &schema.TaskType{
			Specific: &schema.TaskType_Gama{Gama: &schema.TaskTypeGama{}},
		}
	case entities.TaskTypeDisambiguationFalse:
		return &schema.TaskType{
			Specific: &schema.TaskType_DisambiguationFalse{DisambiguationFalse: &schema.TaskTypeDisambiguationFalse{}},
		}
	case entities.TaskTypeDisambiguationTrue:
		return &schema.TaskType{
			Specific: &schema.TaskType_DisambiguationTrue{DisambiguationTrue: &schema.TaskTypeDisambiguationTrue{}},
		}
	case entities.TaskTypeSyntax:
		return &schema.TaskType{
			Specific: &schema.TaskType_Syntax{Syntax: &schema.TaskTypeSyntax{}},
		}
	default:
		return nil
	}
}

// TaskTypeFromPb - преобразовать тип задачи в доменную сущность.
func TaskTypeFromPb(src *schema.TaskType) entities.TaskType {
	switch src.Specific.(type) {
	case *schema.TaskType_Graphematical:
		return entities.TaskTypeGraphematical
	case *schema.TaskType_Gama:
		return entities.TaskTypeGama
	case *schema.TaskType_DisambiguationFalse:
		return entities.TaskTypeDisambiguationFalse
	case *schema.TaskType_DisambiguationTrue:
		return entities.TaskTypeDisambiguationTrue
	case *schema.TaskType_Syntax:
		return entities.TaskTypeSyntax
	default:
		return entities.TaskTypeUnspecified
	}
}
