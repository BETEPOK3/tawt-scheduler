package config

// Config - конфигурация сервиса.
type Config struct {
	Service    *ServiceConfig    `json:"service" yaml:"service"`
	Priorities *PrioritiesConfig `json:"priorities" yaml:"priorities"`
	Scheduler  *SchedulerConfig  `json:"scheduler" yaml:"scheduler"`
}
