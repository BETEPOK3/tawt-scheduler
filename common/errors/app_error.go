package errors

import (
	"fmt"
	"github.com/pkg/errors"
)

// AppError - данные об ошибке.
type AppError struct {
	Type    ErrorType
	Message string
	Err     error
}

func (e *AppError) Error() string {
	if e.Err != nil {
		return fmt.Sprintf("[%s] %s %s", e.Type.String(), e.Message, e.Err.Error())
	}
	return fmt.Sprintf("[%s] %s", e.Type.String(), e.Message)
}

// Wrap - обернуть ошибку другим типом ошибки.
func Wrap(err error, tp ErrorType, msg string, a ...interface{}) *AppError {
	if err == nil {
		panic("wrap nil error")
	}

	if len(a) > 0 {
		msg = fmt.Sprintf(msg, a)
	}

	return &AppError{
		Type:    tp,
		Message: msg,
		Err:     err,
	}
}

// Error - создать ошибку.
func Error(tp ErrorType, msg string, a ...interface{}) *AppError {
	if len(a) > 0 {
		msg = fmt.Sprintf(msg, a)
	}

	return &AppError{
		Type:    tp,
		Message: msg,
	}
}

// Is - имеется ли в цепочке ошибок err ошибка target.
func Is(err, target error) bool {
	return errors.Is(err, target)
}
