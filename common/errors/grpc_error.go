package errors

import (
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
)

// grpcResponse - интерфейс ответа gRPC. Нужен для получения структуры Status.
type grpcResponse interface {
	GetStatus() *common.Status
}

// ErrorFromResponse - получить ошибку из ответа gRPC запроса.
func ErrorFromResponse(err error, resp grpcResponse) error {
	if err != nil {
		return err
	}

	status := resp.GetStatus()

	switch status.Code {
	case common.Status_NOT_FOUND:
		return Error(ERR_NOT_FOUND, status.Error)
	case common.Status_OK:
		return nil
	default:
		return Error(ERR_ADAPTER, status.Error)
	}
}
