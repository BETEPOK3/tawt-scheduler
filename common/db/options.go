package db

import "context"

type transactionOption struct {
	ctx context.Context
}

// MaybeTransaction - проверка на активную транзакцию.
func MaybeTransaction(ctx context.Context) *transactionOption {
	return &transactionOption{ctx: ctx}
}

func (o *transactionOption) apply(db *DB) *DB {
	if dbTransaction := dbFromContext(o.ctx); dbTransaction != nil {
		return dbTransaction
	}

	return db
}
