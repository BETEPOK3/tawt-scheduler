package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

// PrepareTaskDtoFromRest - преобразовать DTO подготовки задачи в доменную сущность.
func PrepareTaskDtoFromRest(src *requests.PrepareTaskRequest) *domain.PrepareTaskDto {
	return &domain.PrepareTaskDto{
		Type: taskTypeFromRest(src.Type),
		Text: domain.InputText(src.Text),
	}
}
