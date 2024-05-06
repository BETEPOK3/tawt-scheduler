package domain

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"unicode"
)

// InputText - входная строка.
type InputText string

// PrepareTaskDto - DTO подготовки задачи к созданию.
type PrepareTaskDto struct {
	Type entities.TaskType
	Text InputText
}

// WordCount - получить количество слов в тексте.
func (t InputText) WordCount() int {
	result := 0

	prevIsChar := false

	for _, c := range t {
		curIsChar := isChar(c)

		if curIsChar && !prevIsChar {
			result++
		}

		prevIsChar = curIsChar
	}

	return result
}

func isChar(c rune) bool {
	return unicode.Is(unicode.Cyrillic, c) ||
		unicode.Is(unicode.Latin, c) ||
		unicode.Is(unicode.Digit, c) ||
		c == '-'
}
