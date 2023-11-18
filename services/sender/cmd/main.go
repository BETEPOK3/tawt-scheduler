package main

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/adapters/rabbit"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/infra"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/repo"
	tasks_usecase "github.com/BETEPOK3/tawt-scheduler/sender/internal/usecase/tasks"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/logger"
	_ "github.com/golang-migrate/migrate/v4/source/file"
	"github.com/rabbitmq/amqp091-go"
	"gorm.io/driver/postgres"
	"gorm.io/gorm"
	"log"
	"os"
)

func main() {
	postgresDsn := os.Getenv("POSTGRES_DSN")
	amqpServerURL := os.Getenv("AMQP_SERVER_URL")
	amqpQueueName := os.Getenv("AMQP_QUEUE_NAME")

	// Подключение к БД.
	db, err := gorm.Open(postgres.Open(postgresDsn), &gorm.Config{})
	if err != nil {
		log.Fatal(err)
	}

	// Накатывание миграций.
	err = infra.MigrateAll(db)
	if err != nil {
		log.Fatal(err)
	}

	// Подключение к сервису RabbitMQ.
	connection, err := amqp091.Dial(amqpServerURL)
	if err != nil {
		log.Fatal(err)
	}
	defer connection.Close()

	// Создание канала с RabbitMQ.
	channel, err := connection.Channel()
	if err != nil {
		log.Fatal(err)
	}
	defer channel.Close()

	// Объявление очереди для отправки запросов RabbitMQ.
	queueSend, err := channel.QueueDeclare(
		amqpQueueName,
		false,
		false,
		false,
		false,
		amqp091.Table{"x-max-priority": 10},
	)
	if err != nil {
		log.Fatal(err)
	}

	// Подготовка структур.
	rabbitAdapter := rabbit.NewRabbitAdapter(channel, queueSend)
	tasksRepo := repo.NewTasksRepo(db)
	tasksUsecase := tasks_usecase.NewTasksUsecase(tasksRepo, rabbitAdapter)
	tasksApi := tasks.NewTasksApi(tasksUsecase)

	// Создание сервиса.
	app := fiber.New()
	app.Use(logger.New())
	app.Post("/graph", tasksApi.DoGraphematicTask)

	log.Fatal(app.Listen(":8080"))
}
