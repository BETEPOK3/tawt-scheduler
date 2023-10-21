package graphematic

import (
	"github.com/gofiber/fiber/v2"
)

// AnalyzeText - выполнить графематический анализ текста.
func (a *api) AnalyzeText(ctx *fiber.Ctx) error {
	resp, err := a.rabbitAdapter.SendRequest(ctx.Context(), ctx.Body())
	if err != nil {
		return err
	}

	return ctx.Send(resp)
}
