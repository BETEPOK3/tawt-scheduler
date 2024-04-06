package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// RabbitMQConfig - конфигурация для подключения к RabbitMQ.
type RabbitMQConfig struct {
	// Url - URL для подключения к RabbitMQ.
	Url string `json:"url" yaml:"url"`
	// ReconnectDelay - время ожидания переподключения (мс.).
	ReconnectDelay int `json:"reconnect_delay" yaml:"reconnect_delay"`
}

// Validate - валидация RabbitMQConfig.
func (c *RabbitMQConfig) Validate() error {
	if c.Url == "" {
		return errors.Error(errors.ERR_SYSTEM, "Url required")
	}
	if c.ReconnectDelay == 0 {
		return errors.Error(errors.ERR_SYSTEM, "ReconnectDelay required")
	}

	return nil
}
