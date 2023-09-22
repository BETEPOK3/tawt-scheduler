package main

import (
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/logger"
	"github.com/rabbitmq/amqp091-go"
	"log"
	"os"
	"scheduler/internal/api"
)

func main() {
	// Подключение к серверу RabbitMQ.
	amqpServerURL := os.Getenv("AMQP_SERVER_URL")

	con, err := amqp091.Dial(amqpServerURL)
	if err != nil {
		panic(err)
	}
	defer con.Close()

	// Создание канала для RabbitMQ.
	channel, err := con.Channel()
	if err != nil {
		panic(err)
	}
	defer channel.Close()

	// Создание очереди для RabbitMQ.
	_, err = channel.QueueDeclare(
		"TawtQueue",
		false,
		true,
		false,
		false,
		nil,
	)
	if err != nil {
		panic(err)
	}

	// Создание сервиса.
	app := fiber.New()
	app.Use(logger.New())

	app.Get("/test", api.TestGet)
	app.Post("/test", api.TestPost)

	log.Fatal(app.Listen(":8080"))
}
