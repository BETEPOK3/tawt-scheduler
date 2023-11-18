package infra

import (
	"github.com/golang-migrate/migrate/v4"
	"github.com/golang-migrate/migrate/v4/database/postgres"
	"github.com/pkg/errors"
	"gorm.io/gorm"
	"log"
)

// MigrateAll - накатывает миграции в БД.
func MigrateAll(gormDB *gorm.DB) error {
	db, err := gormDB.DB()
	if err != nil {
		log.Fatal(err)
	}

	driver, err := postgres.WithInstance(db, &postgres.Config{})
	if err != nil {
		log.Fatal(err)
	}

	m, err := migrate.NewWithDatabaseInstance(
		"file:sql",
		"postgres", driver)
	if err != nil {
		log.Fatal(err)
	}
	if err := m.Up(); err != nil && !errors.Is(err, migrate.ErrNoChange) {
		log.Fatal(err)
	}

	return nil
}
