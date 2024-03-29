package interceptors

import (
	"context"
	"github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

// GrpcStatusHandler - обработчик статуса ответа gRPC.
type GrpcStatusHandler interface {
	GetStatus(err error) *common.Status
	GetError(status *common.Status) error
}

// grpcResponse - интерфейс ответа gRPC. Нужен для получения структуры Status.
type grpcResponse interface {
	GetStatus() *common.Status
}

// UnaryServerInterceptor - перехватчик обработки статуса ответов gRPC.
func UnaryServerInterceptor(grpcStatusHandler GrpcStatusHandler) grpc.UnaryServerInterceptor {
	return func(ctx context.Context, req interface{}, info *grpc.UnaryServerInfo, handler grpc.UnaryHandler) (interface{}, error) {
		resp, err := handler(ctx, req)

		var errStatus *common.Status
		if grpcResp, ok := resp.(grpcResponse); ok {
			errStatus = grpcStatusHandler.GetStatus(err)
			respStatus := grpcResp.GetStatus()
			respStatus.Code = errStatus.Code
			respStatus.Error = errStatus.Error
		} else {
			if err != nil {
				return nil, status.Error(codes.Internal, err.Error())
			} else {
				return resp, nil
			}
		}

		return resp, grpcStatusHandler.GetError(errStatus)
	}
}
