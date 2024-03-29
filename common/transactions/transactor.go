package transactions

import (
	"context"
	"database/sql"
)

// Action - выполняемые действия внутри транзакции.
type Action func(ctx context.Context) error

// Transactor - интерфейс транзактора.
type Transactor interface {
	WithOptions(opts *sql.TxOptions) Transactor
	Transaction(ctx context.Context, action Action) error
}
