package tasks

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"
)

// GetTaskStream - получить поток задач на обработку.
func (a *apiImpl) GetTaskStream(req *schema.GetTaskStreamRequest, stream schema.Tasks_GetTaskStreamServer) error {
	return errors.Error(errors.ERR_NOT_IMPLEMENTED, "not implemented")
}
