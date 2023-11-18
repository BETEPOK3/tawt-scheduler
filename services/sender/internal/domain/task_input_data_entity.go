package domain

import (
	"encoding/json"
	"github.com/pkg/errors"
)

// TaskInputDataGraphematic - входные данные задачи графематического анализа.
type TaskInputDataGraphematic struct {
	Text string `json:"text"`
}

// DecodeTaskInputDataGraphematic - преобразовать json-представление входных данных для графематического анализа в структуру.
func DecodeTaskInputDataGraphematic(data []byte) (*TaskInputDataGraphematic, error) {
	result := &TaskInputDataGraphematic{}

	err := json.Unmarshal(data, result)
	if err != nil {
		return nil, errors.Wrap(err, "cant decode input")
	}

	return result, nil
}
