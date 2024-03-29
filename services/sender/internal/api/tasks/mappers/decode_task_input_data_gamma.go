package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
)

// DecodeTaskInputDataGamma - преобразование json представления входных данных для графематического и морфологического анализа в доменную сущность.
func DecodeTaskInputDataGamma(data []byte) (*domain.CreateTaskDto, error) {
	result := &domain.CreateTaskDto{
		UserId:    userId,
		Type:      entities.TaskTypeGamma,
		InputData: data,
	}

	return result, nil
}
