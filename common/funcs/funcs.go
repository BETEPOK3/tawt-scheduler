package funcs

// Ptr - возвращает адрес переменной.
func Ptr[A any](a A) *A {
	return &a
}

// Map - преобразует []T в []R с помощью функции mapFunc.
func Map[T, R any](src []T, mapFunc func(T) R) []R {
	result := make([]R, len(src))

	for i, v := range src {
		result[i] = mapFunc(v)
	}

	return result
}
