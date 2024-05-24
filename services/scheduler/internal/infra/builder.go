package infra

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/common/db"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	rabbitmq_adapter "github.com/BETEPOK3/tawt-scheduler/scheduler/internal/adapters/rabbitmq"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/repo"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/processor"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/usecase/tasks"
	"github.com/rabbitmq/amqp091-go"
)

type builder struct {
	ctx          context.Context
	cfg          *config.Config
	db           *db.DB
	rabbitmqConn *amqp091.Connection
	rabbitmqChan *amqp091.Channel
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

// DB - подключиться к БД или вернуть текущее подключение.
func (b *builder) DB() (*db.DB, error) {
	if b.db == nil {
		con, err := db.NewDBPostgres(b.cfg.Postgres)
		if err != nil {
			return nil, errors.Wrap(err, errors.ERR_INFRA, "NewDBPostgres")
		}

		b.db = con
	}

	return b.db, nil
}

// BuildTasksUsecase - создать Usecase для работы с задачами.
func (b *builder) BuildTasksUsecase() (domain.TasksUsecase, error) {
	schedulerDb, err := b.DB()
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "DB")
	}

	rabbitmqAdapter, err := b.BuildRabbitmqAdapter()
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "BuildRabbitmqAdapter")
	}

	tasksRepo := repo.NewTasksRepo(schedulerDb)
	transactor := db.NewTransactor(schedulerDb)

	return tasks.NewTasksUsecase(tasksRepo, transactor, rabbitmqAdapter, b.cfg.Queues), nil
}

// BuildProcessorUsecase - создать Usecase для обработки фоновых задач.
func (b *builder) BuildProcessorUsecase() (domain.ProcessorUsecase, error) {
	rabbitmqAdapter, err := b.BuildRabbitmqAdapter()
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "BuildRabbitmqAdapter")
	}

	return processor.NewProcessorUsecase(rabbitmqAdapter, b.cfg.RabbitMQ, b.cfg.Queues), nil
}

// BuildRabbitmqAdapter - создать адаптер для работы с RabbitMQ.
func (b *builder) BuildRabbitmqAdapter() (*rabbitmq_adapter.Adapter, error) {
	rabbitmqConn, err := b.RabbitmqConnection()
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_INFRA, "RabbitmqConnection")
	}

	return rabbitmq_adapter.NewRabbitAdapter(b.cfg.Queues, rabbitmqConn)
}

// RabbitmqConnection - подключится к RabbitMQ или вернуть текущее подключение.
func (b *builder) RabbitmqConnection() (*amqp091.Connection, error) {
	if b.rabbitmqConn == nil {
		conn, err := amqp091.Dial(b.cfg.RabbitMQ.Url)
		if err != nil {
			return nil, errors.Wrap(err, errors.ERR_INFRA, "dial")
		}

		b.rabbitmqConn = conn
	}

	return b.rabbitmqConn, nil
}
