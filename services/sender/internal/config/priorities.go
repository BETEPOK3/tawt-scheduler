package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// PrioritiesConfig - конфигурация точек доступа сервиса.
type PrioritiesConfig struct {
	MaximumPriority     int `json:"maximum_priority" yaml:"maximum_priority"`
	Graphematical       int `json:"graphematical" yaml:"graphematical"`
	Gama                int `json:"gama" yaml:"gama"`
	DisambiguationFalse int `json:"disambiguation_false" yaml:"disambiguation_false"`
	DisambiguationTrue  int `json:"disambiguation_true" yaml:"disambiguation_true"`
	Sp                  int `json:"sp" yaml:"sp"`
}

// Validate - валидация QueuesConfig.
func (c *PrioritiesConfig) Validate() error {
	if c.Graphematical == 0 {
		return errors.Error(errors.ERR_SYSTEM, "Graphematical required")
	}
	if c.Gama == 0 {
		return errors.Error(errors.ERR_SYSTEM, "Gama required")
	}
	if c.DisambiguationFalse == 0 {
		return errors.Error(errors.ERR_SYSTEM, "DisambiguationFalse required")
	}
	if c.DisambiguationTrue == 0 {
		return errors.Error(errors.ERR_SYSTEM, "DisambiguationTrue required")
	}
	if c.Sp == 0 {
		return errors.Error(errors.ERR_SYSTEM, "Sp required")
	}

	return nil
}
