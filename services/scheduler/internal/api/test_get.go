package api

import (
	"github.com/gofiber/fiber/v2"
	"scheduler/internal/domain"
)

func TestGet(c *fiber.Ctx) error {
	ret := &domain.TestText{
		Text: "text-test",
		Num:  123,
	}

	return c.JSON(ret)
}
