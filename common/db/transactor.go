package db

import (
	"context"
	"database/sql"
	"github.com/BETEPOK3/tawt-scheduler/common/transactions"
	"gorm.io/gorm"
)

type transactor struct {
	db   *DB
	opts *sql.TxOptions
}

// NewTransactor - конструктор transactor.
func NewTransactor(db *DB) *transactor {
	return &transactor{
		db: db,
	}
}

// WithOptions - добавить опции.
func (t *transactor) WithOptions(opts *sql.TxOptions) transactions.Transactor {
	return &transactor{
		db:   t.db,
		opts: opts,
	}
}

// Transaction - выполнить действия в транзакции.
func (t *transactor) Transaction(ctx context.Context, action transactions.Action) error {
	var opts []*sql.TxOptions
	if t.opts != nil {
		opts = append(opts, t.opts)
	}

	return t.db.WithContext(ctx).Transaction(func(db *gorm.DB) error {
		return action(ctx)
	})
}
