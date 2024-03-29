package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// QueuesConfig - конфигурация с названиями очередей.
type QueuesConfig struct {
	Slow string `json:"slow" yaml:"slow"`
	Fast string `json:"fast" yaml:"fast"`
	Dlx  string `json:"dlx" yaml:"dlx"`
}

// Validate - валидация QueuesConfig.
func (c *QueuesConfig) Validate() error {
	if c.Slow == "" {
		return errors.Error(errors.ERR_SYSTEM, "Slow required")
	}
	if c.Fast == "" {
		return errors.Error(errors.ERR_SYSTEM, "Fast required")
	}
	if c.Dlx == "" {
		return errors.Error(errors.ERR_SYSTEM, "Dlx required")
	}

	return nil
}
