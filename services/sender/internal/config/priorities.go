package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// PrioritiesConfig - конфигурация точек доступа сервиса.
type PrioritiesConfig struct {
	MaximumPriority      uint8   `json:"maximum_priority" yaml:"maximum_priority"`
	UpperTime            float64 `json:"upper_time" yaml:"upper_time"`
	GraphematicalA       float64 `json:"graphematical_a" yaml:"graphematical_a"`
	GraphematicalB       float64 `json:"graphematical_b" yaml:"graphematical_b"`
	GamaA                float64 `json:"gama_a" yaml:"gama_a"`
	GamaB                float64 `json:"gama_b" yaml:"gama_b"`
	DisambiguationFalseA float64 `json:"disambiguation_false_a" yaml:"disambiguation_false_a"`
	DisambiguationFalseB float64 `json:"disambiguation_false_b" yaml:"disambiguation_false_b"`
	DisambiguationTrueA  float64 `json:"disambiguation_true_a" yaml:"disambiguation_true_a"`
	DisambiguationTrueB  float64 `json:"disambiguation_true_b" yaml:"disambiguation_true_b"`
	SyntaxA              float64 `json:"syntax_a" yaml:"syntax_a"`
	SyntaxB              float64 `json:"syntax_b" yaml:"syntax_b"`
}

// Validate - валидация QueuesConfig.
func (c *PrioritiesConfig) Validate() error {
	if c.GraphematicalA == 0 {
		return errors.Error(errors.ERR_SYSTEM, "GraphematicalA required")
	}
	if c.GraphematicalB == 0 {
		return errors.Error(errors.ERR_SYSTEM, "GraphematicalB required")
	}
	if c.GamaA == 0 {
		return errors.Error(errors.ERR_SYSTEM, "GamaA required")
	}
	if c.GamaB == 0 {
		return errors.Error(errors.ERR_SYSTEM, "GamaB required")
	}
	if c.DisambiguationFalseA == 0 {
		return errors.Error(errors.ERR_SYSTEM, "DisambiguationFalseA required")
	}
	if c.DisambiguationFalseB == 0 {
		return errors.Error(errors.ERR_SYSTEM, "DisambiguationFalseB required")
	}
	if c.DisambiguationTrueA == 0 {
		return errors.Error(errors.ERR_SYSTEM, "DisambiguationTrueA required")
	}
	if c.DisambiguationTrueB == 0 {
		return errors.Error(errors.ERR_SYSTEM, "DisambiguationTrueB required")
	}
	if c.SyntaxA == 0 {
		return errors.Error(errors.ERR_SYSTEM, "SyntaxA required")
	}
	if c.SyntaxB == 0 {
		return errors.Error(errors.ERR_SYSTEM, "SyntaxB required")
	}

	return nil
}
