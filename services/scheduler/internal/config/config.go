package config

import "github.com/BETEPOK3/tawt-scheduler/common/config"

// Config - конфигурация сервиса.
type Config struct {
	Service  *ServiceConfig         `json:"service" yaml:"service"`
	Postgres *config.PostgresConfig `json:"postgres" yaml:"postgres"`
	RabbitMQ *config.RabbitMQConfig `json:"rabbitmq" yaml:"rabbitmq"`
	Queues   *QueuesConfig          `json:"queues" yaml:"queues"`
}
