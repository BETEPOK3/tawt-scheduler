package requests

// PrepareTaskRequest - запрос для подготовки задачи.
type PrepareTaskRequest struct {
	Text string `form:"text" json:"text" binding:"required"`
	Type int    `form:"type" json:"type" binding:"required"`
}

// PrepareTaskResponse - ответ на PrepareTaskRequest.
type PrepareTaskResponse struct {
	TaskId string `json:"task_id"`
}
