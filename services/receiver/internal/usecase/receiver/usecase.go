package receiver

import "github.com/BETEPOK3/tawt-scheduler/receiver/internal/domain"

type Usecase struct {
	rabbitAdapter domain.RabbitAdapter
	tawtAdapter   domain.TawtAdapter
}

// NewReceiverUsecase - конструктор Usecase.
func NewReceiverUsecase(
	rabbitAdapter domain.RabbitAdapter,
	tawtAdapter domain.TawtAdapter,
) *Usecase {
	return &Usecase{
		rabbitAdapter: rabbitAdapter,
		tawtAdapter:   tawtAdapter,
	}
}
