package graphematic

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

type api struct {
	rabbitAdapter domain.RabbitAdapter
}

// NewGraphematicApi - конструктор api.
func NewGraphematicApi(
	rabbit domain.RabbitAdapter,
) *api {
	return &api{
		rabbitAdapter: rabbit,
	}
}
