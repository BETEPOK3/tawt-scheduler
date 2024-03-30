// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/types.proto

// Protobuf Java Version: 4.26.0
package ru.textanalysis.tawt.scheduler.proto.scheduler;

public interface CreateTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scheduler.CreateTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * type - тип задачи с параметрами.
   * </pre>
   *
   * <code>.scheduler.TaskType type = 1 [json_name = "type"];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * type - тип задачи с параметрами.
   * </pre>
   *
   * <code>.scheduler.TaskType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType getType();
  /**
   * <pre>
   * type - тип задачи с параметрами.
   * </pre>
   *
   * <code>.scheduler.TaskType type = 1 [json_name = "type"];</code>
   */
  ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * input - входные данные задачи (в формате JSON).
   * </pre>
   *
   * <code>string input = 2 [json_name = "input"];</code>
   * @return The input.
   */
  java.lang.String getInput();
  /**
   * <pre>
   * input - входные данные задачи (в формате JSON).
   * </pre>
   *
   * <code>string input = 2 [json_name = "input"];</code>
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString
      getInputBytes();

  /**
   * <pre>
   * priority - приоритет задачи.
   * </pre>
   *
   * <code>uint32 priority = 3 [json_name = "priority"];</code>
   * @return The priority.
   */
  int getPriority();
}
