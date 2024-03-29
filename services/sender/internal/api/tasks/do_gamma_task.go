package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks/mappers"
	"github.com/gofiber/fiber/v2"
	"github.com/pkg/errors"
)

// DoGammaTask - выполнить графематический и морфологический анализ текста.
func (a *api) DoGammaTask(ctx *fiber.Ctx) error {
	dto, err := mappers.DecodeTaskInputDataGamma(ctx.Body())
	if err != nil {
		return errors.Wrap(err, "can't decode input data")
	}

	err = a.usecase.Create(ctx.Context(), dto)
	if err != nil {
		return errors.Wrap(err, "task creation error")
	}

	return ctx.SendStatus(200)
}
