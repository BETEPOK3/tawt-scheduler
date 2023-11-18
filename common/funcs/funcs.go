package funcs

// Ptr - возвращает адрес переменной.
func Ptr[A any](a A) *A {
	return &a
}
