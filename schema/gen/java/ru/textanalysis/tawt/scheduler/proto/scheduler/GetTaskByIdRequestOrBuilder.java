// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/tasks.proto

// Protobuf Java Version: 4.26.0
package ru.textanalysis.tawt.scheduler.proto.scheduler;

public interface GetTaskByIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scheduler.GetTaskByIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * task_id - идентификатор задачи.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * task_id - идентификатор задачи.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();
}
