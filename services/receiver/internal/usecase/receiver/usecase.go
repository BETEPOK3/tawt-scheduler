package receiver

import (
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/domain"
	"github.com/BETEPOK3/tawt-scheduler/receiver/internal/repo"
)

type Usecase struct {
	tasksRepo     repo.TasksRepository
	rabbitAdapter domain.RabbitAdapter
	tawtAdapter   domain.TawtAdapter
}

// NewReceiverUsecase - конструктор Usecase.
func NewReceiverUsecase(
	tasksRepo repo.TasksRepository,
	rabbitAdapter domain.RabbitAdapter,
	tawtAdapter domain.TawtAdapter,
) *Usecase {
	return &Usecase{
		tasksRepo:     tasksRepo,
		rabbitAdapter: rabbitAdapter,
		tawtAdapter:   tawtAdapter,
	}
}
