package validator

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"
	"github.com/google/uuid"
)

// ValidateGetTaskByIdRequest - валидация запроса на получение задачи по идентификатору.
func (v *validatorImpl) ValidateGetTaskByIdRequest(msg *requests.GetTaskByIdRequest) error {
	if uuid.Validate(msg.Id) != nil {
		return errors.Error(errors.ERR_BAD_REQUEST, "invalid msg.Id")
	}

	return nil
}
