package tasks

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/api/tasks/mappers"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
	"io"
)

// GetTaskStream - получить поток задач на обработку.
func (a *apiImpl) GetTaskStream(stream schema.Tasks_GetTaskStreamServer) error {
	ctx, cancel := context.WithCancel(context.Background())
	defer cancel()

	processor := &getTaskStreamProcessor{stream}

	for {
		req, err := stream.Recv()
		if err == io.EOF {
			break
		}
		if err != nil {
			return errors.Wrap(err, errors.ERR_API, "Recv")
		}

		err = a.usecase.GetStrategy(domain.QueueType(req.QueueType)).GetFromQueue(ctx, processor)
		if err != nil {
			return errors.Wrap(err, errors.ERR_API, "usecase.GetStream")
		}
	}

	return nil
}

type getTaskStreamProcessor struct {
	schema.Tasks_GetTaskStreamServer
}

// ProcessTasks - отправить задачу на обработку.
func (s *getTaskStreamProcessor) ProcessTasks(tasks entities.TaskList) error {
	for _, task := range tasks {
		err := s.Send(&schema.GetTaskStreamResponse{
			Status: &common.Status{},
			Task:   mappers.TaskStreamDataToPb(task),
		})
		if err != nil {
			return errors.Wrap(err, errors.ERR_API, "Send")
		}
	}

	return nil
}
