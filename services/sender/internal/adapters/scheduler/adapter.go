package scheduler

import schema "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/scheduler"

// Adapter - адаптер планировщика.
type Adapter struct {
	client schema.TasksClient
}

// NewSchedulerAdapter - конструктор Adapter.
func NewSchedulerAdapter(client schema.TasksClient) *Adapter {
	return &Adapter{client: client}
}
