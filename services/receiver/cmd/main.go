package main

import (
	"context"
	"database/sql"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/adapter/rabbit"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/adapter/tawt"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/usecase/receiver"
	_ "github.com/golang-migrate/migrate/v4/database/postgres"
	"github.com/rabbitmq/amqp091-go"
	"log"
	"os"
)

func main() {
	postgresServerUrl := os.Getenv("POSTGRES_URL")
	amqpServerURL := os.Getenv("AMQP_SERVER_URL")
	amqpQueueName := os.Getenv("AMQP_QUEUE_NAME")
	tawtServerURL := os.Getenv("TAWT_SERVER_URL")

	// Подключение к БД.
	_, err := sql.Open("postgres", postgresServerUrl)
	if err != nil {
		log.Fatalf("error connecting to db: %v\n", err)
	}

	// Подключение к сервису RabbitMQ.
	connection, err := amqp091.Dial(amqpServerURL)
	if err != nil {
		log.Fatalf("error connecting to rabbit: %v\n", err)
	}
	defer connection.Close()

	// Создание канала с RabbitMQ.
	channel, err := connection.Channel()
	if err != nil {
		log.Fatalf("error creating channel with rabbit: %v\n", err)
	}
	defer channel.Close()

	// Прослушивание очереди.
	messages, err := channel.Consume(
		amqpQueueName,
		"",
		false,
		false,
		false,
		false,
		nil,
	)
	if err != nil {
		log.Fatalf("error listening to queue: %v\n", err)
	}

	// Подготовка структур.
	ctx, cancel := context.WithCancel(context.Background())
	defer cancel()

	rabbitAdapter := rabbit.NewRabbitAdapter(channel, messages)
	tawtAdapter := tawt.NewTawtAdapter(tawtServerURL)
	receiverUsecase := receiver.NewReceiverUsecase(rabbitAdapter, tawtAdapter)

	// Запуск сервсиса.
	for {
		err = receiverUsecase.Consume(ctx)
		if err != nil {
			log.Printf("encountered error: %v\n", err)
		}
	}
}
