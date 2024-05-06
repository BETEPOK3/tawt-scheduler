package tasks_preparer

import (
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/mappers"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"
	"github.com/gin-gonic/gin"
)

// PrepareTask - подготовить задачу.
func (a *api) PrepareTask(ctx *gin.Context) {
	req := &requests.PrepareTaskRequest{}

	err := ctx.ShouldBindJSON(req)
	if err != nil {
		ctx.AbortWithStatus(400)
		return
	}

	err = a.validator.ValidatePrepareTaskRequest(req)
	if err != nil {
		ctx.AbortWithStatus(400)
		return
	}

	dto := mappers.PrepareTaskDtoFromRest(req)

	taskId, err := a.usecase.GetStrategy(dto.Type).Prepare(ctx, dto)
	if err != nil {
		ctx.AbortWithStatus(500)
		return
	}

	resp := &requests.PrepareTaskResponse{
		TaskId: taskId.String(),
	}

	ctx.IndentedJSON(200, resp)
}
