package requests

// AnalyzeTextRequest - запрос на графематический анализ текста.
type AnalyzeTextRequest struct {
	Text string `json:"text"`
}
