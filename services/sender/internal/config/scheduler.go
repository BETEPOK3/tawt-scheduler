package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// SchedulerConfig - конфигурация подключения к планировщику.
type SchedulerConfig struct {
	// Host - хост.
	Host string `json:"host" yaml:"host"`
	// Port - порт.
	Port string `json:"port" yaml:"port"`
}

// Validate - валидация SchedulerConfig.
func (c *SchedulerConfig) Validate() error {
	if c.Host == "" {
		return errors.Error(errors.ERR_SYSTEM, "Host required")
	}
	if c.Port == "" {
		return errors.Error(errors.ERR_SYSTEM, "Port required")
	}

	return nil
}
