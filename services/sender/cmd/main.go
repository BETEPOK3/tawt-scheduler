package main

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/adapters/rabbit"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/graphematic"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/logger"
	"github.com/rabbitmq/amqp091-go"
	"log"
	"os"
)

func main() {
	amqpServerURL := os.Getenv("AMQP_SERVER_URL")
	amqpQueueName := os.Getenv("AMQP_QUEUE_NAME")

	// Подключение к сервису RabbitMQ.
	connection, err := amqp091.Dial(amqpServerURL)
	if err != nil {
		panic(err)
	}
	defer connection.Close()

	// Создание канала с RabbitMQ.
	channel, err := connection.Channel()
	if err != nil {
		panic(err)
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
		panic(err)
	}

	// Объявление очереди для приёма ответов RabbitMQ.
	queueReceive, err := channel.QueueDeclare(
		"",
		false,
		false,
		true,
		false,
		nil,
	)
	if err != nil {
		panic(err)
	}

	// Объявление канала для прослушивания ответов.
	messages, err := channel.Consume(
		queueReceive.Name,
		"",
		true,
		false,
		false,
		false,
		nil,
	)
	if err != nil {
		panic(err)
	}

	// Подготовка структур.
	rabbitAdapter := rabbit.NewRabbitAdapter(channel, queueSend, queueReceive, messages)
	graphematicApi := graphematic.NewGraphematicApi(rabbitAdapter)

	// Создание сервиса.
	app := fiber.New()
	app.Use(logger.New())
	app.Post("/graph", graphematicApi.AnalyzeText)

	log.Fatal(app.Listen(":8080"))
}
