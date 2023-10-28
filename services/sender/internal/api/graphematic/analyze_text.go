package graphematic

import (
	"github.com/gofiber/fiber/v2"
	"github.com/pkg/errors"
)

// AnalyzeText - выполнить графематический анализ текста.
func (a *api) AnalyzeText(ctx *fiber.Ctx) error {
	err := a.rabbitAdapter.SendRequest(ctx.Context(), ctx.Body())
	if err != nil {
		return errors.Wrap(err, "send request")
	}

	return ctx.SendStatus(200)
}
