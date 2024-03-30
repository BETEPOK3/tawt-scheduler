package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/api/tasks/mappers"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// FinishTask - редактировать задачу.
func (a *apiImpl) FinishTask(ctx context.Context, req *schema.FinishTaskRequest) (*schema.FinishTaskResponse, error) {
	resp := &schema.FinishTaskResponse{Status: &common.Status{}}

	dto := mappers.FinishTaskDtoFromPb(req.Dto)

	err := a.usecase.Finish(ctx, dto)
	if err != nil {
		return resp, errors.Wrap(err, errors.ERR_API, "usecase.Finish")
	}

	return resp, errors.Error(errors.ERR_NOT_IMPLEMENTED, "not implemented")
}
