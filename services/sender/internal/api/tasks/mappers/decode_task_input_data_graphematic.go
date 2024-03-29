package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/google/uuid"
)

var userId = uuid.MustParse("e9b3ddab-d3cc-4aad-9265-0b06edc3452c")

// DecodeTaskInputDataGraphematic - преобразование json представления входных данных для графематического анализа в доменную сущность.
func DecodeTaskInputDataGraphematic(data []byte) (*domain.CreateTaskDto, error) {
	result := &domain.CreateTaskDto{
		UserId:    userId,
		Type:      entities.TaskTypeGraphematical,
		InputData: data,
	}

	return result, nil
}
