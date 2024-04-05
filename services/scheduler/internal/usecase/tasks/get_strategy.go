package tasks

import "github.com/BETEPOK3/tawt-scheduler/scheduler/internal/domain"

// GetStrategy - получить стратегию.
func (u *usecase) GetStrategy(tp domain.QueueType) domain.TasksUsecase {
	strategy, ok := u.factory[tp]
	if !ok {
		return u
	}
	return strategy
}
