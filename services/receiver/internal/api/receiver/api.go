package receiver

type apiImpl struct {
	rabbitAdapter RabbitAdapter
	tawtAdapter   TawtAdapter
}

// NewReceiverApi - конструктор apiImpl.
func NewReceiverApi(
	rabbitAdapter RabbitAdapter,
	tawtAdapter TawtAdapter,
) *apiImpl {
	return &apiImpl{
		rabbitAdapter: rabbitAdapter,
		tawtAdapter:   tawtAdapter,
	}
}
