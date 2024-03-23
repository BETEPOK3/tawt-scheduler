// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/types.proto

// Protobuf Java Version: 4.26.0
package tawt_scheduler.proto.scheduler;

/**
 * <pre>
 * EditTask - DTO редактирования данных задачи.
 * </pre>
 *
 * Protobuf type {@code scheduler.EditTask}
 */
public final class EditTask extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:scheduler.EditTask)
    EditTaskOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      EditTask.class.getName());
  }
  // Use EditTask.newBuilder() to construct.
  private EditTask(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EditTask() {
    taskId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_EditTask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_EditTask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tawt_scheduler.proto.scheduler.EditTask.class, tawt_scheduler.proto.scheduler.EditTask.Builder.class);
  }

  private int bitField0_;
  public static final int TASK_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskId_ = "";
  /**
   * <pre>
   * id - идентификатор задачи.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  @java.lang.Override
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * id - идентификатор задачи.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct output_;
  /**
   * <pre>
   * output - выходные данные задачи.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
   * @return Whether the output field is set.
   */
  @java.lang.Override
  public boolean hasOutput() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * output - выходные данные задачи.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
   * @return The output.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getOutput() {
    return output_ == null ? com.google.protobuf.Struct.getDefaultInstance() : output_;
  }
  /**
   * <pre>
   * output - выходные данные задачи.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getOutputOrBuilder() {
    return output_ == null ? com.google.protobuf.Struct.getDefaultInstance() : output_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(taskId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, taskId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOutput());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(taskId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, taskId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOutput());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tawt_scheduler.proto.scheduler.EditTask)) {
      return super.equals(obj);
    }
    tawt_scheduler.proto.scheduler.EditTask other = (tawt_scheduler.proto.scheduler.EditTask) obj;

    if (!getTaskId()
        .equals(other.getTaskId())) return false;
    if (hasOutput() != other.hasOutput()) return false;
    if (hasOutput()) {
      if (!getOutput()
          .equals(other.getOutput())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TASK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    if (hasOutput()) {
      hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getOutput().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static tawt_scheduler.proto.scheduler.EditTask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static tawt_scheduler.proto.scheduler.EditTask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static tawt_scheduler.proto.scheduler.EditTask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tawt_scheduler.proto.scheduler.EditTask prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * EditTask - DTO редактирования данных задачи.
   * </pre>
   *
   * Protobuf type {@code scheduler.EditTask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scheduler.EditTask)
      tawt_scheduler.proto.scheduler.EditTaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_EditTask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_EditTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tawt_scheduler.proto.scheduler.EditTask.class, tawt_scheduler.proto.scheduler.EditTask.Builder.class);
    }

    // Construct using tawt_scheduler.proto.scheduler.EditTask.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getOutputFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      taskId_ = "";
      output_ = null;
      if (outputBuilder_ != null) {
        outputBuilder_.dispose();
        outputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_EditTask_descriptor;
    }

    @java.lang.Override
    public tawt_scheduler.proto.scheduler.EditTask getDefaultInstanceForType() {
      return tawt_scheduler.proto.scheduler.EditTask.getDefaultInstance();
    }

    @java.lang.Override
    public tawt_scheduler.proto.scheduler.EditTask build() {
      tawt_scheduler.proto.scheduler.EditTask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tawt_scheduler.proto.scheduler.EditTask buildPartial() {
      tawt_scheduler.proto.scheduler.EditTask result = new tawt_scheduler.proto.scheduler.EditTask(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tawt_scheduler.proto.scheduler.EditTask result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskId_ = taskId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.output_ = outputBuilder_ == null
            ? output_
            : outputBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tawt_scheduler.proto.scheduler.EditTask) {
        return mergeFrom((tawt_scheduler.proto.scheduler.EditTask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tawt_scheduler.proto.scheduler.EditTask other) {
      if (other == tawt_scheduler.proto.scheduler.EditTask.getDefaultInstance()) return this;
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOutput()) {
        mergeOutput(other.getOutput());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              taskId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOutputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object taskId_ = "";
    /**
     * <pre>
     * id - идентификатор задачи.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @return The taskId.
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * id - идентификатор задачи.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @return The bytes for taskId.
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * id - идентификатор задачи.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @param value The taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id - идентификатор задачи.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskId() {
      taskId_ = getDefaultInstance().getTaskId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id - идентификатор задачи.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @param value The bytes for taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct output_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> outputBuilder_;
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     * @return Whether the output field is set.
     */
    public boolean hasOutput() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     * @return The output.
     */
    public com.google.protobuf.Struct getOutput() {
      if (outputBuilder_ == null) {
        return output_ == null ? com.google.protobuf.Struct.getDefaultInstance() : output_;
      } else {
        return outputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    public Builder setOutput(com.google.protobuf.Struct value) {
      if (outputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        output_ = value;
      } else {
        outputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    public Builder setOutput(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (outputBuilder_ == null) {
        output_ = builderForValue.build();
      } else {
        outputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    public Builder mergeOutput(com.google.protobuf.Struct value) {
      if (outputBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          output_ != null &&
          output_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getOutputBuilder().mergeFrom(value);
        } else {
          output_ = value;
        }
      } else {
        outputBuilder_.mergeFrom(value);
      }
      if (output_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    public Builder clearOutput() {
      bitField0_ = (bitField0_ & ~0x00000002);
      output_ = null;
      if (outputBuilder_ != null) {
        outputBuilder_.dispose();
        outputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    public com.google.protobuf.Struct.Builder getOutputBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOutputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    public com.google.protobuf.StructOrBuilder getOutputOrBuilder() {
      if (outputBuilder_ != null) {
        return outputBuilder_.getMessageOrBuilder();
      } else {
        return output_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : output_;
      }
    }
    /**
     * <pre>
     * output - выходные данные задачи.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct output = 2 [json_name = "output"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getOutputFieldBuilder() {
      if (outputBuilder_ == null) {
        outputBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getOutput(),
                getParentForChildren(),
                isClean());
        output_ = null;
      }
      return outputBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:scheduler.EditTask)
  }

  // @@protoc_insertion_point(class_scope:scheduler.EditTask)
  private static final tawt_scheduler.proto.scheduler.EditTask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tawt_scheduler.proto.scheduler.EditTask();
  }

  public static tawt_scheduler.proto.scheduler.EditTask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditTask>
      PARSER = new com.google.protobuf.AbstractParser<EditTask>() {
    @java.lang.Override
    public EditTask parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EditTask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditTask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tawt_scheduler.proto.scheduler.EditTask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

