package main

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/adapter/rabbit"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/adapter/tawt"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/api/receiver"
	"github.com/rabbitmq/amqp091-go"
	"os"
)

func main() {
	amqpServerURL := os.Getenv("AMQP_SERVER_URL")
	amqpQueueName := os.Getenv("AMQP_QUEUE_NAME")
	tawtServerURL := os.Getenv("TAWT_SERVER_URL")

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
		panic(err)
	}

	// Подготовка структур.
	ctx := context.Background()

	rabbitAdapter := rabbit.NewRabbitAdapter(channel, messages)
	tawtAdapter := tawt.NewTawtAdapter(tawtServerURL)
	receiverApi := receiver.NewReceiverApi(rabbitAdapter, tawtAdapter)

	// Запуск сервсиса.
	err = receiverApi.ConsumeRepeatedly(ctx)
	if err != nil {
		panic(err)
	}
}
