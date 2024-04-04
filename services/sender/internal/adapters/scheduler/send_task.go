package scheduler

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/adapters/scheduler/mappers"
)

// SendTask - отправить задачу планировщику.
func (a *Adapter) SendTask(ctx context.Context, dto *entities.CreateTaskDto) (uuid.UUID, error) {
	req := &schema.CreateTaskRequest{Dto: mappers.CreateTaskDtoToPb(dto)}

	resp, err := a.client.CreateTask(ctx, req)
	if err != nil {
		return uuid.Nil(), errors.Wrap(err, errors.ERR_ADAPTER, "client.CreateTask")
	}

	id := uuid.MustParse(resp.TaskId)

	return id, nil
}
