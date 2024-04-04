package errors

import (
	"github.com/pkg/errors"
	"gorm.io/gorm"
)

// IsGormNotFound - проверяет ошибку на наличилие ошибки RECORD_NOT_FOUND.
func IsGormNotFound(err error) bool {
	return errors.Is(err, gorm.ErrRecordNotFound)
}
