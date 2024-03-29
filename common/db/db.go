package db

import (
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/config"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"gorm.io/driver/postgres"
	"gorm.io/gorm"
)

// DB - сущность подключения к БД.
type DB struct {
	*gorm.DB
}

// NewDBPostgres - конструктор DB, подключение к Postgres.
func NewDBPostgres(cfg *config.PostgresConfig) (*DB, error) {
	dsn := fmt.Sprintf("user=%s password=%s dbname=%s host=%s port=%d sslmode=disable",
		cfg.PgUser, cfg.PgPassword, cfg.PgName, cfg.PgHost, cfg.PgPort)

	db, err := gorm.Open(postgres.Open(dsn), &gorm.Config{})
	if err != nil {
		return nil, errors.Wrap(err, errors.ERR_SYSTEM, "error connect to db")
	}

	return &DB{DB: db}, nil
}
