// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/tasks.proto

// Protobuf Java Version: 4.26.0
package tawt_scheduler.proto.scheduler;

public interface CreateTaskResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scheduler.CreateTaskResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * status - статус.
   * </pre>
   *
   * <code>.common.Status status = 1 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status - статус.
   * </pre>
   *
   * <code>.common.Status status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  tawt_scheduler.proto.scheduler.Status getStatus();
  /**
   * <pre>
   * status - статус.
   * </pre>
   *
   * <code>.common.Status status = 1 [json_name = "status"];</code>
   */
  tawt_scheduler.proto.scheduler.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * task_id - идентификатор созданной задачи.
   * </pre>
   *
   * <code>string task_id = 2 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * task_id - идентификатор созданной задачи.
   * </pre>
   *
   * <code>string task_id = 2 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();
}
