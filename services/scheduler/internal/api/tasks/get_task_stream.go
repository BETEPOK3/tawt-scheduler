package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/api/tasks/mappers"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// GetTaskStream - получить поток задач на обработку.
func (a *apiImpl) GetTaskStream(req *schema.GetTaskStreamRequest, stream schema.Tasks_GetTaskStreamServer) error {
	ctx, cancel := context.WithCancel(context.Background())
	defer cancel()

	err := a.usecase.GetStream(ctx, req.QueueName, &getTaskStreamProcessor{stream: stream})
	if err != nil {
		return errors.Wrap(err, errors.ERR_API, "usecase.GetStream")
	}

	return errors.Error(errors.ERR_NOT_IMPLEMENTED, "not implemented")
}

type getTaskStreamProcessor struct {
	stream schema.Tasks_GetTaskStreamServer
}

// ProcessTask - отправить задачу на обработку.
func (s *getTaskStreamProcessor) ProcessTask(task *entities.Task) error {
	err := s.stream.Send(&schema.GetTaskStreamResponse{
		Status: &common.Status{},
		Task:   mappers.TaskStreamDataToPb(task),
	})
	if err != nil {
		return errors.Wrap(err, errors.ERR_API, "stream.Send")
	}

	return nil
}
