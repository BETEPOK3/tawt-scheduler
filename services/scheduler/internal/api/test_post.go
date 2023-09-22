package api

import (
	"github.com/gofiber/fiber/v2"
	"scheduler/internal/domain"
)

func TestPost(c *fiber.Ctx) error {
	test := &domain.TestText{}

	err := c.BodyParser(test)
	if err != nil {
		return err
	}

	return c.JSON(test)
}
