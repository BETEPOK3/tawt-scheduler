package scheduler

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/adapters/scheduler/mappers"
)

// GetById - получить задачу по идентификатору.
func (a *Adapter) GetById(ctx context.Context, id uuid.UUID) (*entities.Task, error) {
	req := &schema.GetTaskByIdRequest{TaskId: id.String()}

	resp, err := a.client.GetTaskById(ctx, req)
	if respErr := errors.ErrorFromResponse(err, resp); respErr != nil {
		return nil, errors.Wrap(respErr, errors.ERR_ADAPTER, "client.GetTaskById")
	}

	task := mappers.TaskEntityFromPb(resp.Task)

	return task, nil
}
