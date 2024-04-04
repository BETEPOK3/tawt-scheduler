// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/types.proto
// Protobuf Java Version: 4.26.0

package ru.textanalysis.tawt.scheduler.proto.scheduler;

public final class Types {
  private Types() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      Types.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_TaskType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_TaskType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_TaskTypeGraphematical_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_TaskTypeGraphematical_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_TaskTypeGama_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_TaskTypeGama_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_CreateTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_CreateTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_TaskStreamData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_TaskStreamData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_FinishTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_scheduler_FinishTask_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025scheduler/types.proto\022\tscheduler\032\034goog" +
      "le/protobuf/struct.proto\"\205\003\n\004Task\022\016\n\002id\030" +
      "\001 \001(\tR\002id\022\'\n\004type\030\002 \001(\0132\023.scheduler.Task" +
      "TypeR\004type\022\024\n\005input\030\003 \001(\tR\005input\022\033\n\006outp" +
      "ut\030\004 \001(\tH\000R\006output\210\001\001\022\035\n\ncreated_at\030\005 \001(" +
      "\tR\tcreatedAt\022$\n\013finished_at\030\006 \001(\tH\001R\nfin" +
      "ishedAt\210\001\001\022.\n\006status\030\007 \001(\0162\026.scheduler.T" +
      "ask.StatusR\006status\022\031\n\005error\030\010 \001(\tH\002R\005err" +
      "or\210\001\001\"\\\n\006Status\022\033\n\027TASK_STATUS_UNSPECIFI" +
      "ED\020\000\022\n\n\006QUEUED\020\001\022\017\n\013IN_PROGRESS\020\002\022\r\n\tCOM" +
      "PLETED\020\003\022\t\n\005ERROR\020\004B\t\n\007_outputB\016\n\014_finis" +
      "hed_atB\010\n\006_error\"\217\001\n\010TaskType\022H\n\rgraphem" +
      "atical\030\001 \001(\0132 .scheduler.TaskTypeGraphem" +
      "aticalH\000R\rgraphematical\022-\n\004gama\030\002 \001(\0132\027." +
      "scheduler.TaskTypeGamaH\000R\004gamaB\n\n\010specif" +
      "ic\"\027\n\025TaskTypeGraphematical\"\016\n\014TaskTypeG" +
      "ama\"g\n\nCreateTask\022\'\n\004type\030\001 \001(\0132\023.schedu" +
      "ler.TaskTypeR\004type\022\024\n\005input\030\002 \001(\014R\005input" +
      "\022\032\n\010priority\030\003 \001(\rR\010priority\"h\n\016TaskStre" +
      "amData\022\027\n\007task_id\030\001 \001(\tR\006taskId\022\'\n\004type\030" +
      "\002 \001(\0132\023.scheduler.TaskTypeR\004type\022\024\n\005inpu" +
      "t\030\003 \001(\tR\005input\"r\n\nFinishTask\022\027\n\007task_id\030" +
      "\001 \001(\tR\006taskId\022\033\n\006output\030\002 \001(\tH\000R\006output\210" +
      "\001\001\022\031\n\005error\030\003 \001(\tH\001R\005error\210\001\001B\t\n\007_output" +
      "B\010\n\006_errorBx\n.ru.textanalysis.tawt.sched" +
      "uler.proto.schedulerP\001ZDgithub.com/BETEP" +
      "OK3/tawt-scheduler/schema/gen/go/schedul" +
      "er;schedulerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_scheduler_Task_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scheduler_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_Task_descriptor,
        new java.lang.String[] { "Id", "Type", "Input", "Output", "CreatedAt", "FinishedAt", "Status", "Error", });
    internal_static_scheduler_TaskType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_scheduler_TaskType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_TaskType_descriptor,
        new java.lang.String[] { "Graphematical", "Gama", "Specific", });
    internal_static_scheduler_TaskTypeGraphematical_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_scheduler_TaskTypeGraphematical_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_TaskTypeGraphematical_descriptor,
        new java.lang.String[] { });
    internal_static_scheduler_TaskTypeGama_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_scheduler_TaskTypeGama_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_TaskTypeGama_descriptor,
        new java.lang.String[] { });
    internal_static_scheduler_CreateTask_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_scheduler_CreateTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_CreateTask_descriptor,
        new java.lang.String[] { "Type", "Input", "Priority", });
    internal_static_scheduler_TaskStreamData_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_scheduler_TaskStreamData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_TaskStreamData_descriptor,
        new java.lang.String[] { "TaskId", "Type", "Input", });
    internal_static_scheduler_FinishTask_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_scheduler_FinishTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_scheduler_FinishTask_descriptor,
        new java.lang.String[] { "TaskId", "Output", "Error", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
