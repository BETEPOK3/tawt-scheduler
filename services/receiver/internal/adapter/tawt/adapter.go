package tawt

type adapterImpl struct {
	tawtUrl string
}

// NewTawtAdapter - конструктор adapterImpl.
func NewTawtAdapter(
	tawtUrl string,
) *adapterImpl {
	return &adapterImpl{
		tawtUrl: tawtUrl,
	}
}
