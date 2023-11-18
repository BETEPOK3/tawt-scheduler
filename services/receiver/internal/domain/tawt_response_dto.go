package domain

import "encoding/json"

// TawtResponseDto - DTO ответа TAWT.
type TawtResponseDto struct {
	Data    json.RawMessage `json:"data"`
	Success bool            `json:"success"`
}
