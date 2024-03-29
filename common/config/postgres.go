package config

import "github.com/BETEPOK3/tawt-scheduler/common/errors"

// PostgresConfig - конфигурация для подключения к Postgres.
type PostgresConfig struct {
	// PgHost - хост БД.
	PgHost string `json:"pg_host" yaml:"pg_host"`
	// PgPort - порт БД.
	PgPort int `json:"pg_port" yaml:"pg_port"`
	// PgUser - имя пользователя БД.
	PgUser string `json:"pg_user" yaml:"pg_user"`
	// PgPassword - пароль БД.
	PgPassword string `json:"pg_password" yaml:"pg_password"`
	// PgName - имя БД.
	PgName string `json:"pg_name" yaml:"pg_name"`
	// PgAutoMigrate - запускать ли миграции автоматически при запуске сервиса.
	PgAutoMigrate bool `json:"pg_auto_migrate" yaml:"pg_auto_migrate"`
}

// Validate - валидация PostgresConfig.
func (c *PostgresConfig) Validate() error {
	if c.PgHost == "" {
		return errors.Error(errors.ERR_SYSTEM, "PgHost required")
	}
	if c.PgPort == 0 {
		return errors.Error(errors.ERR_SYSTEM, "PgPort required")
	}
	if c.PgUser == "" {
		return errors.Error(errors.ERR_SYSTEM, "PgUser required")
	}
	if c.PgPassword == "" {
		return errors.Error(errors.ERR_SYSTEM, "PgPassword required")
	}
	if c.PgName == "" {
		return errors.Error(errors.ERR_SYSTEM, "PgName required")
	}

	return nil
}
