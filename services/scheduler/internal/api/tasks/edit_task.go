package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// EditTask - редактировать задачу.
func (a *apiImpl) EditTask(ctx context.Context, in *schema.EditTaskRequest) (*schema.EditTaskResponse, error) {
	resp := &schema.EditTaskResponse{Status: &common.Status{}}

	return resp, errors.Error(errors.ERR_NOT_IMPLEMENTED, "not implemented")
}
