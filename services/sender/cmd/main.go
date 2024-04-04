package main

import (
	"context"
	"flag"
	"fmt"
	conf "github.com/BETEPOK3/tawt-scheduler/common/config"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/config"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/infra"
	"github.com/gin-gonic/gin"
	_ "github.com/golang-migrate/migrate/v4/source/file"
	"log"
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

	tasksPreparerUsecase, err := builder.BuildTasksPreparerUsecase()
	if err != nil {
		log.Fatalf("error building tasksPreparerUsecase: %v", err)
	}

	tasksPreparerApi := tasks_preparer.NewTaskPreparersApi(tasksPreparerUsecase)

	router := gin.Default()
	router.GET("/task", tasksPreparerApi.GetTaskByIt)
	log.Fatal(router.Run(fmt.Sprintf(":%d", cfg.Service.HttpEndpoint)))
}
