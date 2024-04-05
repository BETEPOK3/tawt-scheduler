package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// QueuesConfig - конфигурация с названиями очередей.
type QueuesConfig struct {
	SlowQueue       string `json:"slow_queue" yaml:"slow_queue"`
	FastQueuePrefix string `json:"fast_queue_prefix" yaml:"fast_queue_prefix"`
}

// Validate - валидация QueuesConfig.
func (c *QueuesConfig) Validate() error {
	if c.SlowQueue == "" {
		return errors.Error(errors.ERR_SYSTEM, "SlowQueue required")
	}
	if c.FastQueuePrefix == "" {
		return errors.Error(errors.ERR_SYSTEM, "FastQueuePrefix required")
	}

	return nil
}
