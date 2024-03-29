package db

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/golang-migrate/migrate/v4"
	"github.com/golang-migrate/migrate/v4/database/postgres"
)

// MigrateAll - накатить миграции в БД.
func (d *DB) MigrateAll() error {
	db, err := d.DB.DB()
	if err != nil {
		return errors.Wrap(err, errors.ERR_SYSTEM, "error converting gorm.DB to sql.DB")
	}

	driver, err := postgres.WithInstance(db, &postgres.Config{})
	if err != nil {
		return errors.Wrap(err, errors.ERR_SYSTEM, "error getting db driver instance")
	}

	m, err := migrate.NewWithDatabaseInstance(
		"file:sql",
		"postgres", driver)
	if err != nil {
		return errors.Wrap(err, errors.ERR_SYSTEM, "error getting migrate instance")
	}
	if err := m.Up(); err != nil && err.Error() != migrate.ErrNoChange.Error() {
		return errors.Wrap(err, errors.ERR_SYSTEM, "error migrating")
	}

	return nil
}
