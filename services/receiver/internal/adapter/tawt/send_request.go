package tawt

import (
	"context"
	"github.com/gofiber/fiber/v2"
)

const graphematicParserApi = "tawt-rest-api/api/gp/parser/text"

// SendRequest - отправить запрос в TAWT.
func (a *adapterImpl) SendRequest(ctx context.Context, data []byte) (int, []byte, error) {
	agent := fiber.Post(a.tawtUrl + graphematicParserApi).ContentType("application/json")
	agent.Body(data)

	status, resp, errs := agent.Bytes()

	if len(errs) > 0 {
		return status, nil, errs[0]
	}

	return status, resp, nil
}
