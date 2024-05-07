package domain

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"unicode"
)

var endOfSentenceRunes = []rune(".?!\n\r():@\"№#;$%^&*")

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

// SentencesStatistics - получить статистику количества предложений с определённым кол-вом слов.
// Индекс слайса - кол-во слов в предложении минус 1.
// Элемент слайса - количество предложений с данным кол-вом слов.
func (t InputText) SentencesStatistics() []int {
	result := make([]int, 20)
	maxWordCount := 1
	wordCount := 0
	prevIsChar := false

	for _, c := range t {
		curIsChar := isChar(c)

		if curIsChar {
			if !prevIsChar {
				wordCount++
			}
		} else {
			if isEndOfSentence(c) && wordCount > 0 {
				if wordCount > len(result) {
					result = append(result, make([]int, wordCount-len(result))...)
				}
				if wordCount > maxWordCount {
					maxWordCount = wordCount
				}
				result[wordCount-1]++
				wordCount = 0
			}
		}

		prevIsChar = curIsChar
	}

	if wordCount > 0 {
		if wordCount > len(result) {
			result = append(result, make([]int, wordCount-len(result))...)
		}
		if wordCount > maxWordCount {
			maxWordCount = wordCount
		}
		result[wordCount-1]++
	}

	return result[:maxWordCount]
}

func isChar(c rune) bool {
	return unicode.Is(unicode.Cyrillic, c) ||
		unicode.Is(unicode.Latin, c) ||
		unicode.Is(unicode.Digit, c) ||
		c == '-'
}

func isEndOfSentence(c rune) bool {
	for _, r := range endOfSentenceRunes {
		if c == r {
			return true
		}
	}

	return false
}
