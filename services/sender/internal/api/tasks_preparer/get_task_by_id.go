package tasks_preparer

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"github.com/BETEPOK3/tawt-scheduler/common/uuid"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/mappers"
	"github.com/BETEPOK3/tawt-scheduler/sender/internal/api/tasks_preparer/requests"
	"github.com/gin-gonic/gin"
)

// GetTaskById - получить задачу по идентификатору.
func (a *api) GetTaskById(ctx *gin.Context) {
	req := &requests.GetTaskByIdRequest{
		Id: ctx.Query("id"),
	}

	err := a.validator.ValidateGetTaskByIdRequest(req)
	if err != nil {
		ctx.AbortWithStatus(400)
		return
	}

	id := uuid.MustParse(req.Id)

	task, err := a.usecase.GetById(ctx, id)
	if err != nil {
		if errors.Is(err, errors.ErrNotFound) {
			ctx.AbortWithStatus(404)
			return
		}
		ctx.AbortWithStatus(500)
		return
	}

	resp := &requests.GetTaskByIdResponse{
		Task: mappers.TaskEntityToRest(task),
	}

	ctx.IndentedJSON(200, resp)
}
