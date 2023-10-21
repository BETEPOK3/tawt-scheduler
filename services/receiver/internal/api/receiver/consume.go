package receiver

import "context"

// ConsumeRepeatedly - постоянная проверка очереди RabbitMQ и отправка запросов в TAWT.
func (a *apiImpl) ConsumeRepeatedly(ctx context.Context) error {
	for {
		msg, err := a.rabbitAdapter.ReceiveRequest(ctx)
		if err != nil {
			return err
		}

		_, resp, err := a.tawtAdapter.SendRequest(ctx, msg.Body)

		err = a.rabbitAdapter.SendResponse(ctx, msg, resp)
		if err != nil {
			return err
		}
	}
}
