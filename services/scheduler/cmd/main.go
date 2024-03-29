package main

import (
	"context"
	"flag"
	"fmt"
	conf "github.com/BETEPOK3/tawt-scheduler/common/config"
	"github.com/BETEPOK3/tawt-scheduler/common/interceptors"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/api/tasks"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/scheduler/internal/infra"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
	_ "github.com/golang-migrate/migrate/v4/source/file"
	"google.golang.org/grpc"
	"log"
	"net"
)

func main() {
	configFile := flag.String("c", "config.template.yaml", "configuration file")
	flag.Parse()

	var cfg *config.Config
	if err := conf.ReadAndValidate(*configFile, &cfg); err != nil {
		log.Fatalf("error reading config file: %v", err)
	}

	ctx, cancel := context.WithCancel(context.Background())
	defer cancel()

	builder := infra.NewBuilder(ctx, cfg)
	grpcServer := grpc.NewServer(
		grpc.UnaryInterceptor(interceptors.UnaryServerInterceptor(infra.NewGrpcStatusHandler())),
	)

	if cfg.Postgres.PgAutoMigrate {
		db, err := builder.DB()
		if err != nil {
			log.Fatalf("error getting db: %v", err)
		}

		err = db.MigrateAll()
		if err != nil {
			log.Fatalf("error migrating: %v", err)
		}
	}

	tasksUsecase, err := builder.BuildTasksUsecase()
	if err != nil {
		log.Fatalf("error building TasksUsecase: %v", err)
	}

	tasksApi := tasks.NewTasksApi(tasksUsecase)
	schema.RegisterTasksServiceServer(grpcServer, tasksApi)

	listener, err := net.Listen("tcp", fmt.Sprintf(":%d", cfg.Service.GrpcEndpoint))
	if err != nil {
		log.Fatalf("error creating Listener instance")
	}

	if err = grpcServer.Serve(listener); err != nil {
		log.Fatalf("error starting grpc server")
	}
}
