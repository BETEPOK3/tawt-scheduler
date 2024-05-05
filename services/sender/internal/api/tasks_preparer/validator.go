package tasks_preparer

import "github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"

type Validator interface {
	ValidateGetTaskByIdRequest(msg *requests.GetTaskByIdRequest) error
	ValidatePrepareTaskRequest(msg *requests.PrepareTaskRequest) error
}
