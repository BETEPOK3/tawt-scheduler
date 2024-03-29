package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/api/tasks/mappers"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// GetTaskById - получить задачу по идентификатору.
func (a *apiImpl) GetTaskById(ctx context.Context, req *schema.GetTaskByIdRequest) (*schema.GetTaskByIdResponse, error) {
	resp := &schema.GetTaskByIdResponse{Status: &common.Status{}}

	id := uuid.MustParse(req.TaskId)

	task, err := a.usecase.GetById(ctx, id)
	if err != nil {
		return resp, errors.Wrap(err, errors.ERR_API, "usecase.GetById")
	}

	resp.Task = mappers.TaskEntityToPb(task)

	return resp, nil
}
