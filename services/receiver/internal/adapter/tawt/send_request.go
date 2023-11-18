package tawt

import (
	"context"
	"encoding/json"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/domain"
	"github.com/gofiber/fiber/v2"
)

const graphematicParserApi = "tawt-rest-api/api/gp/parser/text"

// SendRequest - отправить запрос в TAWT.
func (a *adapterImpl) SendRequest(ctx context.Context, dto *domain.TawtRequestDto) (*domain.TawtResponseDto, error) {
	var adr string

	resp := &domain.TawtResponseDto{}

	switch dto.TaskType {
	case entities.TaskTypeGraphematicalParser:
		adr = graphematicParserApi
	}

	agent := fiber.Post(a.tawtUrl + adr).ContentType("application/json")
	agent.Body(dto.Data)

	_, tawtResp, errs := agent.Bytes()
	if len(errs) > 0 {
		return nil, errs[0]
	}

	err := json.Unmarshal(tawtResp, resp)
	if err != nil {
		return nil, err
	}

	return resp, nil
}
