package infra

import (
	"context"
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
	scheduler_adapter "github.com/BETEPOK3/tawt-scheduler/sender/internal/adapters/scheduler"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks_preparer"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
)

type builder struct {
	ctx context.Context
	cfg *config.Config
}

// NewBuilder - конструктор builder.
func NewBuilder(ctx context.Context, cfg *config.Config) *builder {
	return &builder{
		ctx: ctx,
		cfg: cfg,
	}
}

// Ctx - получить контекст.
func (b *builder) Ctx() context.Context {
	return b.ctx
}

// BuildTasksPreparerUsecase - создать usecase для подготовки задач.
func (b *builder) BuildTasksPreparerUsecase() (domain.TasksPreparerUsecase, error) {
	schedulerAdapter, err := b.BuildSchedulerAdapter()
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "BuildSchedulerAdapter")
	}

	return tasks_preparer.NewTasksPreparerUsecase(schedulerAdapter, b.cfg.Priorities), nil
}

// BuildSchedulerAdapter - создать адаптер для работы с планировщиком.
func (b *builder) BuildSchedulerAdapter() (*scheduler_adapter.Adapter, error) {
	conn, err := grpc.DialContext(b.ctx, fmt.Sprintf("%s:%s", b.cfg.Scheduler.Host, b.cfg.Scheduler.Port), grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "DialContext scheduler service")
	}

	client := schema.NewTasksClient(conn)

	return scheduler_adapter.NewSchedulerAdapter(client), nil
}
