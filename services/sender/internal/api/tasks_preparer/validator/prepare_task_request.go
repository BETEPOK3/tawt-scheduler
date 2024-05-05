package validator

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"
)

// ValidatePrepareTaskRequest - валидация запроса на подготовку задачи.
func (v *validatorImpl) ValidatePrepareTaskRequest(msg *requests.PrepareTaskRequest) error {
	if len(msg.Text) == 0 {
		return errors.Error(errors.ERR_BAD_REQUEST, "msg.Text required")
	}

	if msg.Type < 1 || msg.Type > 2 {
		return errors.Error(errors.ERR_BAD_REQUEST, "invalid msg.Type")
	}

	return nil
}
