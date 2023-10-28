package main

import (
	"database/sql"
	"errors"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/adapters/rabbit"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/graphematic"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/logger"
	"github.com/golang-migrate/migrate/v4"
	"github.com/golang-migrate/migrate/v4/database/postgres"
	_ "github.com/golang-migrate/migrate/v4/source/file"
	"github.com/rabbitmq/amqp091-go"
	"log"
	"os"
)

func main() {
	postgresServerUrl := os.Getenv("POSTGRES_URL")
	amqpServerURL := os.Getenv("AMQP_SERVER_URL")
	amqpQueueName := os.Getenv("AMQP_QUEUE_NAME")

	// Подключение к БД.
	db, err := sql.Open("postgres", postgresServerUrl)
	if err != nil {
		log.Fatal(err)
	}

	driver, err := postgres.WithInstance(db, &postgres.Config{})
	if err != nil {
		log.Fatal(err)
	}

	// Накатывание миграций.
	m, err := migrate.NewWithDatabaseInstance(
		"file:sql",
		"postgres", driver)
	if err != nil {
		log.Fatal(err)
	}
	if err := m.Up(); err != nil && !errors.Is(err, migrate.ErrNoChange) {
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
	graphematicApi := graphematic.NewGraphematicApi(rabbitAdapter)

	// Создание сервиса.
	app := fiber.New()
	app.Use(logger.New())
	app.Post("/graph", graphematicApi.AnalyzeText)

	log.Fatal(app.Listen(":8080"))
}
