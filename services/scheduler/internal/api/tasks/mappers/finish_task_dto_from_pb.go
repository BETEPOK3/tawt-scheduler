package mappers

import (
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// FinishTaskDtoFromPb - преобразовать DTO завершения задачи в доменную сущность.
func FinishTaskDtoFromPb(src *schema.FinishTask) *domain.FinishTaskDto {
	result := &domain.FinishTaskDto{
		Id:    uuid.MustParse(src.TaskId),
		Error: src.Error,
	}

	if src.Output != nil {
		result.Output = funcs.Ptr([]byte(*src.Output))
	}

	return result
}
