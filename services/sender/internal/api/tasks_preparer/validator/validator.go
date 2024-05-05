package validator

type validatorImpl struct{}

// NewValidator - конструктор валидатора запросов на подготовку задач.
func NewValidator() *validatorImpl {
	return &validatorImpl{}
}
