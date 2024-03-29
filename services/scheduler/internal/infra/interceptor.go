package infra

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
)

type grpcStatusHandler struct{}

// NewGrpcStatusHandler - конструктор grpcStatusHandler для сервиса scheduler.
func NewGrpcStatusHandler() *grpcStatusHandler {
	return &grpcStatusHandler{}
}

// GetStatus - получить статус схемы.
func (h *grpcStatusHandler) GetStatus(err error) *common.Status {
	status := &common.Status{}
	if err == nil {
		status.Code = common.Status_OK
		return status
	}

	status.Error = err.Error()

	switch {
	case errors.Is(err, errors.ErrNotFound):
		status.Code = common.Status_NOT_FOUND
	default:
		status.Code = common.Status_INTERNAL_ERROR
	}

	return status
}

// GetError - получить ошибку из статуса схемы
func (h *grpcStatusHandler) GetError(*common.Status) error {
	return nil
}
