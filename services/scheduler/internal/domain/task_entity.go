package domain

import "github.com/BETEPOK3/tawt-scheduler/common/uuid"

// SendTaskMessageDto - DTO отправки сообщения с задачей в очередь.
type SendTaskMessageDto struct {
	QueueName string
	CorrId    uuid.UUID
	Priority  uint8
}
