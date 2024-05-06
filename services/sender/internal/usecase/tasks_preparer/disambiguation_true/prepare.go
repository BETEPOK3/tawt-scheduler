package disambiguation_true

import (
	"context"
	"fmt"
	"github.com/BETEPOK3/tawt-scheduler/common/entities"
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/domain"
	"log"
	"math"
)

// Prepare - подготовить задачу к созданию.
func (u *usecase) Prepare(ctx context.Context, dto *domain.PrepareTaskDto) (uuid.UUID, error) {
	priority := u.calculatePriority(dto)
	log.Printf("integer priority: %d", priority)

	taskId, err := u.schedulerAdapter.SendTask(ctx, &entities.CreateTaskDto{
		Type:     dto.Type,
		Input:    []byte(fmt.Sprintf(`{"text":"%s"}`, dto.Text)),
		Priority: priority,
	})
	if err != nil {
		return uuid.Nil(), errors.Wrap(err, errors.ERR_USECASE, "schedulerAdapter.SendTask")
	}

	return taskId, nil
}

func (u *usecase) calculatePriority(dto *domain.PrepareTaskDto) uint8 {
	wordCount := dto.Text.WordCount()
	log.Printf("word count: %d", wordCount)

	predTime := (u.cfg.GamaA+u.cfg.DisambiguationTrueA)*float64(wordCount) + u.cfg.GamaB + u.cfg.DisambiguationTrueB
	log.Printf("predicted time: %f", predTime)

	f := float64(u.cfg.MaximumPriority) * (1 - predTime/u.cfg.UpperTime)
	log.Printf("floating priority: %f", f)

	priority := uint8(math.Ceil(f))
	if priority < 0 {
		priority = 0
	} else if priority > u.cfg.MaximumPriority {
		priority = u.cfg.MaximumPriority
	}

	return priority
}
