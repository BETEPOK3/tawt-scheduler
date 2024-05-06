package tasks_preparer

import (
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
)

// GetStrategy - получить стратегию.
func (u *usecase) GetStrategy(tp entities.TaskType) domain.TasksPreparerUsecase {
	strategy, ok := u.factory[tp]
	if !ok {
		return u
	}
	return strategy
}
