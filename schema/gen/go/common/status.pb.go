// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: common/status.proto

package common

import (
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

// Code - код статуса ответа.
type Status_Code int32

const (
	// CODE_UNSPECIFIED - статус не определён.
	Status_CODE_UNSPECIFIED Status_Code = 0
	// OK - успех.
	Status_OK Status_Code = 200
	// NOT_FOUND - запись не найдена.
	Status_NOT_FOUND Status_Code = 404
	// INTERNAL_ERROR - внутренняя ошибка (необработанная ошибка).
	Status_INTERNAL_ERROR Status_Code = 500
)

// Enum value maps for Status_Code.
var (
	Status_Code_name = map[int32]string{
		0:   "CODE_UNSPECIFIED",
		200: "OK",
		404: "NOT_FOUND",
		500: "INTERNAL_ERROR",
	}
	Status_Code_value = map[string]int32{
		"CODE_UNSPECIFIED": 0,
		"OK":               200,
		"NOT_FOUND":        404,
		"INTERNAL_ERROR":   500,
	}
)

func (x Status_Code) Enum() *Status_Code {
	p := new(Status_Code)
	*p = x
	return p
}

func (x Status_Code) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Status_Code) Descriptor() protoreflect.EnumDescriptor {
	return file_common_status_proto_enumTypes[0].Descriptor()
}

func (Status_Code) Type() protoreflect.EnumType {
	return &file_common_status_proto_enumTypes[0]
}

func (x Status_Code) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Status_Code.Descriptor instead.
func (Status_Code) EnumDescriptor() ([]byte, []int) {
	return file_common_status_proto_rawDescGZIP(), []int{0, 0}
}

// Status - статус ответа.
type Status struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// code - код статуса.
	Code Status_Code `protobuf:"varint,1,opt,name=code,proto3,enum=common.Status_Code" json:"code,omitempty"`
	// error - описание ошибки.
	Error string `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
}

func (x *Status) Reset() {
	*x = Status{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_status_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Status) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Status) ProtoMessage() {}

func (x *Status) ProtoReflect() protoreflect.Message {
	mi := &file_common_status_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Status.ProtoReflect.Descriptor instead.
func (*Status) Descriptor() ([]byte, []int) {
	return file_common_status_proto_rawDescGZIP(), []int{0}
}

func (x *Status) GetCode() Status_Code {
	if x != nil {
		return x.Code
	}
	return Status_CODE_UNSPECIFIED
}

func (x *Status) GetError() string {
	if x != nil {
		return x.Error
	}
	return ""
}

var File_common_status_proto protoreflect.FileDescriptor

var file_common_status_proto_rawDesc = []byte{
	0x0a, 0x13, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x22, 0x93, 0x01,
	0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x27, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x13, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x43, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x63, 0x6f, 0x64,
	0x65, 0x12, 0x14, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x22, 0x4a, 0x0a, 0x04, 0x43, 0x6f, 0x64, 0x65, 0x12,
	0x14, 0x0a, 0x10, 0x43, 0x4f, 0x44, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x07, 0x0a, 0x02, 0x4f, 0x4b, 0x10, 0xc8, 0x01, 0x12, 0x0e,
	0x0a, 0x09, 0x4e, 0x4f, 0x54, 0x5f, 0x46, 0x4f, 0x55, 0x4e, 0x44, 0x10, 0x94, 0x03, 0x12, 0x13,
	0x0a, 0x0e, 0x49, 0x4e, 0x54, 0x45, 0x52, 0x4e, 0x41, 0x4c, 0x5f, 0x45, 0x52, 0x52, 0x4f, 0x52,
	0x10, 0xf4, 0x03, 0x42, 0x6f, 0x0a, 0x2b, 0x72, 0x75, 0x2e, 0x74, 0x65, 0x78, 0x74, 0x61, 0x6e,
	0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x2e, 0x74, 0x61, 0x77, 0x74, 0x2e, 0x73, 0x63, 0x68, 0x65,
	0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x50, 0x01, 0x5a, 0x3e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x42, 0x45, 0x54, 0x45, 0x50, 0x4f, 0x4b, 0x33, 0x2f, 0x74, 0x61, 0x77, 0x74, 0x2d, 0x73,
	0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f,
	0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x3b, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_common_status_proto_rawDescOnce sync.Once
	file_common_status_proto_rawDescData = file_common_status_proto_rawDesc
)

func file_common_status_proto_rawDescGZIP() []byte {
	file_common_status_proto_rawDescOnce.Do(func() {
		file_common_status_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_status_proto_rawDescData)
	})
	return file_common_status_proto_rawDescData
}

var file_common_status_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_common_status_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_common_status_proto_goTypes = []interface{}{
	(Status_Code)(0), // 0: common.Status.Code
	(*Status)(nil),   // 1: common.Status
}
var file_common_status_proto_depIdxs = []int32{
	0, // 0: common.Status.code:type_name -> common.Status.Code
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_common_status_proto_init() }
func file_common_status_proto_init() {
	if File_common_status_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_common_status_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Status); i {
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
			RawDescriptor: file_common_status_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_status_proto_goTypes,
		DependencyIndexes: file_common_status_proto_depIdxs,
		EnumInfos:         file_common_status_proto_enumTypes,
		MessageInfos:      file_common_status_proto_msgTypes,
	}.Build()
	File_common_status_proto = out.File
	file_common_status_proto_rawDesc = nil
	file_common_status_proto_goTypes = nil
	file_common_status_proto_depIdxs = nil
}
