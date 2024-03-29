package errors

// ErrorType - тип ошибки.
type ErrorType int

const (
	// ERR_UNKNOWN - неизвестная ошибка.
	ERR_UNKNOWN ErrorType = iota + 1
	// ERR_INFRA - инфраструктурная ошибка.
	ERR_INFRA
	// ERR_SYSTEM - системная ошибки.
	ERR_SYSTEM
	// ERR_API - ошибка API.
	ERR_API
	// ERR_USECASE - ошибка слоя usecase.
	ERR_USECASE
	// ERR_DB - ошибка БД.
	ERR_DB
	// ERR_ADAPTER - ошибка адаптера.
	ERR_ADAPTER
	// ERR_NOT_FOUND - запись не найдена.
	ERR_NOT_FOUND
	// ERR_DUPLICATED - запись дублирована.
	ERR_DUPLICATED
	// ERR_BUSINESS - бизнесовая ошибка.
	ERR_BUSINESS
	// ERR_NOT_IMPLEMENTED - ошибка отсутствия реализации.
	ERR_NOT_IMPLEMENTED
)

var (
	ErrNotFound = &AppError{Type: ERR_NOT_FOUND}
)

var stringErrors = []string{
	"ERR_UNKNOWN",
	"ERR_INFRA",
	"ERR_SYSTEM",
	"ERR_API",
	"ERR_USECASE",
	"ERR_DB",
	"ERR_ADAPTER",
	"ERR_NOT_FOUND",
	"ERR_DUPLICATED",
	"ERR_BUSINESS",
	"ERR_NOT_IMPLEMENTED",
}

// String - преобразование кода ошибки в строку.
func (e ErrorType) String() string {
	return stringErrors[int(e)-1]
}
