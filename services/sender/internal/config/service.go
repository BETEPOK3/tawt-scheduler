package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// ServiceConfig - конфигурация точек доступа сервиса.
type ServiceConfig struct {
	HttpEndpoint int `json:"http_endpoint" yaml:"http_endpoint"`
}

// Validate - валидация QueuesConfig.
func (c *ServiceConfig) Validate() error {
	if c.HttpEndpoint == 0 {
		return errors.Error(errors.ERR_SYSTEM, "HttpEndpoint required")
	}

	return nil
}
