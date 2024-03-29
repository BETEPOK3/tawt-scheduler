package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/api/tasks/mappers"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// CreateTask - создать задачу.
func (a *apiImpl) CreateTask(ctx context.Context, req *schema.CreateTaskRequest) (*schema.CreateTaskResponse, error) {
	resp := &schema.CreateTaskResponse{Status: &common.Status{}}

	dto := mappers.CreateTaskDtoFromPb(req.Dto)

	id, err := a.usecase.Create(ctx, dto)
	if err != nil {
		return resp, errors.Wrap(err, errors.ERR_API, "usecase.Create")
	}

	resp.TaskId = id.String()

	return resp, nil
}
