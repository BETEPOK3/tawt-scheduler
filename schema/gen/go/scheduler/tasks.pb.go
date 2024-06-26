// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: scheduler/tasks.proto

package scheduler

import (
	common "github.com/BETEPOK3/tawt-scheduler/schema/gen/go/common"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// GetTaskByIdRequest - запрос на получение задачи по идентификатору.
type GetTaskByIdRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// task_id - идентификатор задачи.
	TaskId string `protobuf:"bytes,1,opt,name=task_id,json=taskId,proto3" json:"task_id,omitempty"`
}

func (x *GetTaskByIdRequest) Reset() {
	*x = GetTaskByIdRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTaskByIdRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTaskByIdRequest) ProtoMessage() {}

func (x *GetTaskByIdRequest) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTaskByIdRequest.ProtoReflect.Descriptor instead.
func (*GetTaskByIdRequest) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{0}
}

func (x *GetTaskByIdRequest) GetTaskId() string {
	if x != nil {
		return x.TaskId
	}
	return ""
}

// GetTaskByIdResponse - ответ на GetTaskByIdRequest.
type GetTaskByIdResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// status - статус.
	Status *common.Status `protobuf:"bytes,1,opt,name=status,proto3" json:"status,omitempty"`
	// task - задача.
	Task *Task `protobuf:"bytes,2,opt,name=task,proto3" json:"task,omitempty"`
}

func (x *GetTaskByIdResponse) Reset() {
	*x = GetTaskByIdResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTaskByIdResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTaskByIdResponse) ProtoMessage() {}

func (x *GetTaskByIdResponse) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTaskByIdResponse.ProtoReflect.Descriptor instead.
func (*GetTaskByIdResponse) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{1}
}

func (x *GetTaskByIdResponse) GetStatus() *common.Status {
	if x != nil {
		return x.Status
	}
	return nil
}

func (x *GetTaskByIdResponse) GetTask() *Task {
	if x != nil {
		return x.Task
	}
	return nil
}

// CreateTaskRequest - запрос на создание задачи.
type CreateTaskRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// dto - данные для создания задачи.
	Dto *CreateTask `protobuf:"bytes,1,opt,name=dto,proto3" json:"dto,omitempty"`
}

func (x *CreateTaskRequest) Reset() {
	*x = CreateTaskRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateTaskRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateTaskRequest) ProtoMessage() {}

func (x *CreateTaskRequest) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateTaskRequest.ProtoReflect.Descriptor instead.
func (*CreateTaskRequest) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{2}
}

func (x *CreateTaskRequest) GetDto() *CreateTask {
	if x != nil {
		return x.Dto
	}
	return nil
}

// CreateTaskResponse - ответ на CreateTaskRequest.
type CreateTaskResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// status - статус.
	Status *common.Status `protobuf:"bytes,1,opt,name=status,proto3" json:"status,omitempty"`
	// task_id - идентификатор созданной задачи.
	TaskId string `protobuf:"bytes,2,opt,name=task_id,json=taskId,proto3" json:"task_id,omitempty"`
}

func (x *CreateTaskResponse) Reset() {
	*x = CreateTaskResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateTaskResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateTaskResponse) ProtoMessage() {}

func (x *CreateTaskResponse) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateTaskResponse.ProtoReflect.Descriptor instead.
func (*CreateTaskResponse) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{3}
}

func (x *CreateTaskResponse) GetStatus() *common.Status {
	if x != nil {
		return x.Status
	}
	return nil
}

func (x *CreateTaskResponse) GetTaskId() string {
	if x != nil {
		return x.TaskId
	}
	return ""
}

// GetTaskStreamRequest - запрос на получение потока задач на обработку.
type GetTaskStreamRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// queue_type - тип очереди.
	QueueType QueueType `protobuf:"varint,1,opt,name=queue_type,json=queueType,proto3,enum=scheduler.QueueType" json:"queue_type,omitempty"`
}

func (x *GetTaskStreamRequest) Reset() {
	*x = GetTaskStreamRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTaskStreamRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTaskStreamRequest) ProtoMessage() {}

func (x *GetTaskStreamRequest) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTaskStreamRequest.ProtoReflect.Descriptor instead.
func (*GetTaskStreamRequest) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{4}
}

func (x *GetTaskStreamRequest) GetQueueType() QueueType {
	if x != nil {
		return x.QueueType
	}
	return QueueType_QUEUE_TYPE_UNSPECIFIED
}

// GetTaskStreamResponse - ответ на GetTaskStreamRequest.
type GetTaskStreamResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// status - статус.
	Status *common.Status `protobuf:"bytes,1,opt,name=status,proto3" json:"status,omitempty"`
	// task - данные задачи.
	Task *TaskStreamData `protobuf:"bytes,2,opt,name=task,proto3" json:"task,omitempty"`
}

func (x *GetTaskStreamResponse) Reset() {
	*x = GetTaskStreamResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTaskStreamResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTaskStreamResponse) ProtoMessage() {}

func (x *GetTaskStreamResponse) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTaskStreamResponse.ProtoReflect.Descriptor instead.
func (*GetTaskStreamResponse) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{5}
}

func (x *GetTaskStreamResponse) GetStatus() *common.Status {
	if x != nil {
		return x.Status
	}
	return nil
}

func (x *GetTaskStreamResponse) GetTask() *TaskStreamData {
	if x != nil {
		return x.Task
	}
	return nil
}

// FinishTaskRequest - запрос на редактирования задачи.
type FinishTaskRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// dto - данные для завершения задачи.
	Dto *FinishTask `protobuf:"bytes,1,opt,name=dto,proto3" json:"dto,omitempty"`
}

func (x *FinishTaskRequest) Reset() {
	*x = FinishTaskRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FinishTaskRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FinishTaskRequest) ProtoMessage() {}

func (x *FinishTaskRequest) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FinishTaskRequest.ProtoReflect.Descriptor instead.
func (*FinishTaskRequest) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{6}
}

func (x *FinishTaskRequest) GetDto() *FinishTask {
	if x != nil {
		return x.Dto
	}
	return nil
}

// FinishTaskResponse - ответ на FinishTaskRequest.
type FinishTaskResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// status - статус.
	Status *common.Status `protobuf:"bytes,1,opt,name=status,proto3" json:"status,omitempty"`
}

func (x *FinishTaskResponse) Reset() {
	*x = FinishTaskResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_scheduler_tasks_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FinishTaskResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FinishTaskResponse) ProtoMessage() {}

func (x *FinishTaskResponse) ProtoReflect() protoreflect.Message {
	mi := &file_scheduler_tasks_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FinishTaskResponse.ProtoReflect.Descriptor instead.
func (*FinishTaskResponse) Descriptor() ([]byte, []int) {
	return file_scheduler_tasks_proto_rawDescGZIP(), []int{7}
}

func (x *FinishTaskResponse) GetStatus() *common.Status {
	if x != nil {
		return x.Status
	}
	return nil
}

var File_scheduler_tasks_proto protoreflect.FileDescriptor

var file_scheduler_tasks_proto_rawDesc = []byte{
	0x0a, 0x15, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2f, 0x74, 0x61, 0x73, 0x6b,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c,
	0x65, 0x72, 0x1a, 0x13, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c,
	0x65, 0x72, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x2d,
	0x0a, 0x12, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x74, 0x61, 0x73, 0x6b, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x74, 0x61, 0x73, 0x6b, 0x49, 0x64, 0x22, 0x62, 0x0a,
	0x13, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x53, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x23, 0x0a, 0x04,
	0x74, 0x61, 0x73, 0x6b, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x73, 0x63, 0x68,
	0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x54, 0x61, 0x73, 0x6b, 0x52, 0x04, 0x74, 0x61, 0x73,
	0x6b, 0x22, 0x3c, 0x0a, 0x11, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x61, 0x73, 0x6b, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x27, 0x0a, 0x03, 0x64, 0x74, 0x6f, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e,
	0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x61, 0x73, 0x6b, 0x52, 0x03, 0x64, 0x74, 0x6f, 0x22,
	0x55, 0x0a, 0x12, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x61, 0x73, 0x6b, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x17, 0x0a,
	0x07, 0x74, 0x61, 0x73, 0x6b, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06,
	0x74, 0x61, 0x73, 0x6b, 0x49, 0x64, 0x22, 0x4b, 0x0a, 0x14, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73,
	0x6b, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x33,
	0x0a, 0x0a, 0x71, 0x75, 0x65, 0x75, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x14, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x51,
	0x75, 0x65, 0x75, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x09, 0x71, 0x75, 0x65, 0x75, 0x65, 0x54,
	0x79, 0x70, 0x65, 0x22, 0x6e, 0x0a, 0x15, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x06,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x2d, 0x0a, 0x04, 0x74, 0x61, 0x73, 0x6b, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x19, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x54,
	0x61, 0x73, 0x6b, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x44, 0x61, 0x74, 0x61, 0x52, 0x04, 0x74,
	0x61, 0x73, 0x6b, 0x22, 0x3c, 0x0a, 0x11, 0x46, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x54, 0x61, 0x73,
	0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x27, 0x0a, 0x03, 0x64, 0x74, 0x6f, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65,
	0x72, 0x2e, 0x46, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x54, 0x61, 0x73, 0x6b, 0x52, 0x03, 0x64, 0x74,
	0x6f, 0x22, 0x3c, 0x0a, 0x12, 0x46, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x54, 0x61, 0x73, 0x6b, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x32,
	0xc3, 0x02, 0x0a, 0x05, 0x54, 0x61, 0x73, 0x6b, 0x73, 0x12, 0x4c, 0x0a, 0x0b, 0x47, 0x65, 0x74,
	0x54, 0x61, 0x73, 0x6b, 0x42, 0x79, 0x49, 0x64, 0x12, 0x1d, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x72, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x42, 0x79, 0x49, 0x64,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1e, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75,
	0x6c, 0x65, 0x72, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x42, 0x79, 0x49, 0x64, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x56, 0x0a, 0x0d, 0x47, 0x65, 0x74, 0x54, 0x61,
	0x73, 0x6b, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x12, 0x1f, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x72, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x53, 0x74, 0x72, 0x65,
	0x61, 0x6d, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e, 0x73, 0x63, 0x68, 0x65,
	0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x61, 0x73, 0x6b, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x28, 0x01, 0x30, 0x01, 0x12,
	0x49, 0x0a, 0x0a, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x61, 0x73, 0x6b, 0x12, 0x1c, 0x2e,
	0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x54, 0x61, 0x73, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x73, 0x63,
	0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x61,
	0x73, 0x6b, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x49, 0x0a, 0x0a, 0x46, 0x69,
	0x6e, 0x69, 0x73, 0x68, 0x54, 0x61, 0x73, 0x6b, 0x12, 0x1c, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x72, 0x2e, 0x46, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x54, 0x61, 0x73, 0x6b, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c,
	0x65, 0x72, 0x2e, 0x46, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x54, 0x61, 0x73, 0x6b, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x78, 0x0a, 0x2e, 0x72, 0x75, 0x2e, 0x74, 0x65, 0x78, 0x74,
	0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x2e, 0x74, 0x61, 0x77, 0x74, 0x2e, 0x73, 0x63,
	0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73, 0x63,
	0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x50, 0x01, 0x5a, 0x44, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x42, 0x45, 0x54, 0x45, 0x50, 0x4f, 0x4b, 0x33, 0x2f, 0x74,
	0x61, 0x77, 0x74, 0x2d, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2f, 0x73, 0x63,
	0x68, 0x65, 0x6d, 0x61, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x73, 0x63, 0x68, 0x65,
	0x64, 0x75, 0x6c, 0x65, 0x72, 0x3b, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_scheduler_tasks_proto_rawDescOnce sync.Once
	file_scheduler_tasks_proto_rawDescData = file_scheduler_tasks_proto_rawDesc
)

func file_scheduler_tasks_proto_rawDescGZIP() []byte {
	file_scheduler_tasks_proto_rawDescOnce.Do(func() {
		file_scheduler_tasks_proto_rawDescData = protoimpl.X.CompressGZIP(file_scheduler_tasks_proto_rawDescData)
	})
	return file_scheduler_tasks_proto_rawDescData
}

var file_scheduler_tasks_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_scheduler_tasks_proto_goTypes = []interface{}{
	(*GetTaskByIdRequest)(nil),    // 0: scheduler.GetTaskByIdRequest
	(*GetTaskByIdResponse)(nil),   // 1: scheduler.GetTaskByIdResponse
	(*CreateTaskRequest)(nil),     // 2: scheduler.CreateTaskRequest
	(*CreateTaskResponse)(nil),    // 3: scheduler.CreateTaskResponse
	(*GetTaskStreamRequest)(nil),  // 4: scheduler.GetTaskStreamRequest
	(*GetTaskStreamResponse)(nil), // 5: scheduler.GetTaskStreamResponse
	(*FinishTaskRequest)(nil),     // 6: scheduler.FinishTaskRequest
	(*FinishTaskResponse)(nil),    // 7: scheduler.FinishTaskResponse
	(*common.Status)(nil),         // 8: common.Status
	(*Task)(nil),                  // 9: scheduler.Task
	(*CreateTask)(nil),            // 10: scheduler.CreateTask
	(QueueType)(0),                // 11: scheduler.QueueType
	(*TaskStreamData)(nil),        // 12: scheduler.TaskStreamData
	(*FinishTask)(nil),            // 13: scheduler.FinishTask
}
var file_scheduler_tasks_proto_depIdxs = []int32{
	8,  // 0: scheduler.GetTaskByIdResponse.status:type_name -> common.Status
	9,  // 1: scheduler.GetTaskByIdResponse.task:type_name -> scheduler.Task
	10, // 2: scheduler.CreateTaskRequest.dto:type_name -> scheduler.CreateTask
	8,  // 3: scheduler.CreateTaskResponse.status:type_name -> common.Status
	11, // 4: scheduler.GetTaskStreamRequest.queue_type:type_name -> scheduler.QueueType
	8,  // 5: scheduler.GetTaskStreamResponse.status:type_name -> common.Status
	12, // 6: scheduler.GetTaskStreamResponse.task:type_name -> scheduler.TaskStreamData
	13, // 7: scheduler.FinishTaskRequest.dto:type_name -> scheduler.FinishTask
	8,  // 8: scheduler.FinishTaskResponse.status:type_name -> common.Status
	0,  // 9: scheduler.Tasks.GetTaskById:input_type -> scheduler.GetTaskByIdRequest
	4,  // 10: scheduler.Tasks.GetTaskStream:input_type -> scheduler.GetTaskStreamRequest
	2,  // 11: scheduler.Tasks.CreateTask:input_type -> scheduler.CreateTaskRequest
	6,  // 12: scheduler.Tasks.FinishTask:input_type -> scheduler.FinishTaskRequest
	1,  // 13: scheduler.Tasks.GetTaskById:output_type -> scheduler.GetTaskByIdResponse
	5,  // 14: scheduler.Tasks.GetTaskStream:output_type -> scheduler.GetTaskStreamResponse
	3,  // 15: scheduler.Tasks.CreateTask:output_type -> scheduler.CreateTaskResponse
	7,  // 16: scheduler.Tasks.FinishTask:output_type -> scheduler.FinishTaskResponse
	13, // [13:17] is the sub-list for method output_type
	9,  // [9:13] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_scheduler_tasks_proto_init() }
func file_scheduler_tasks_proto_init() {
	if File_scheduler_tasks_proto != nil {
		return
	}
	file_scheduler_types_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_scheduler_tasks_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTaskByIdRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTaskByIdResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateTaskRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateTaskResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTaskStreamRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTaskStreamResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FinishTaskRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_scheduler_tasks_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FinishTaskResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_scheduler_tasks_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_scheduler_tasks_proto_goTypes,
		DependencyIndexes: file_scheduler_tasks_proto_depIdxs,
		MessageInfos:      file_scheduler_tasks_proto_msgTypes,
	}.Build()
	File_scheduler_tasks_proto = out.File
	file_scheduler_tasks_proto_rawDesc = nil
	file_scheduler_tasks_proto_goTypes = nil
	file_scheduler_tasks_proto_depIdxs = nil
}
