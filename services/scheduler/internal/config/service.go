package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// ServiceConfig - конфигурация точек доступа сервиса.
type ServiceConfig struct {
	GrpcEndpoint int `json:"grpc_endpoint" yaml:"grpc_endpoint"`
}

// Validate - валидация QueuesConfig.
func (c *ServiceConfig) Validate() error {
	if c.GrpcEndpoint == 0 {
		return errors.Error(errors.ERR_SYSTEM, "GrpcEndpoint required")
	}

	return nil
}
