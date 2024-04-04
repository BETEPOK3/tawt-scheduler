package errors

import (
	"errors"
	"fmt"
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

func (e *AppError) Is(target error) bool {
	var ex *AppError
	if errors.As(target, &ex) && ex.Type == e.Type {
		return true
	}
	return false
}

func (e *AppError) Unwrap() error {
	return e.Err
}

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

func Error(tp ErrorType, msg string, a ...interface{}) *AppError {
	if len(a) > 0 {
		msg = fmt.Sprintf(msg, a)
	}

	return &AppError{
		Type:    tp,
		Message: msg,
	}
}

func Is(err, target error) bool {
	return errors.Is(err, target)
}
