// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/tasks.proto

// Protobuf Java Version: 4.26.0
package ru.textanalysis.tawt.scheduler.proto.scheduler;

/**
 * <pre>
 * CreateTaskRequest - запрос на создание задачи.
 * </pre>
 *
 * Protobuf type {@code scheduler.CreateTaskRequest}
 */
public final class CreateTaskRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:scheduler.CreateTaskRequest)
    CreateTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      CreateTaskRequest.class.getName());
  }
  // Use CreateTaskRequest.newBuilder() to construct.
  private CreateTaskRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateTaskRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.textanalysis.tawt.scheduler.proto.scheduler.TasksOuterClass.internal_static_scheduler_CreateTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.textanalysis.tawt.scheduler.proto.scheduler.TasksOuterClass.internal_static_scheduler_CreateTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.class, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DTO_FIELD_NUMBER = 1;
  private ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask dto_;
  /**
   * <pre>
   * dto - данные для создания задачи.
   * </pre>
   *
   * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
   * @return Whether the dto field is set.
   */
  @java.lang.Override
  public boolean hasDto() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * dto - данные для создания задачи.
   * </pre>
   *
   * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
   * @return The dto.
   */
  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask getDto() {
    return dto_ == null ? ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.getDefaultInstance() : dto_;
  }
  /**
   * <pre>
   * dto - данные для создания задачи.
   * </pre>
   *
   * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
   */
  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskOrBuilder getDtoOrBuilder() {
    return dto_ == null ? ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.getDefaultInstance() : dto_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getDto());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDto());
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
    if (!(obj instanceof ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest)) {
      return super.equals(obj);
    }
    ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest other = (ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest) obj;

    if (hasDto() != other.hasDto()) return false;
    if (hasDto()) {
      if (!getDto()
          .equals(other.getDto())) return false;
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
    if (hasDto()) {
      hash = (37 * hash) + DTO_FIELD_NUMBER;
      hash = (53 * hash) + getDto().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest parseFrom(
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
  public static Builder newBuilder(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest prototype) {
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
   * CreateTaskRequest - запрос на создание задачи.
   * </pre>
   *
   * Protobuf type {@code scheduler.CreateTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scheduler.CreateTaskRequest)
      ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.TasksOuterClass.internal_static_scheduler_CreateTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.TasksOuterClass.internal_static_scheduler_CreateTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.class, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.Builder.class);
    }

    // Construct using ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.newBuilder()
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
        getDtoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dto_ = null;
      if (dtoBuilder_ != null) {
        dtoBuilder_.dispose();
        dtoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.TasksOuterClass.internal_static_scheduler_CreateTaskRequest_descriptor;
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest getDefaultInstanceForType() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest build() {
      ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest buildPartial() {
      ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest result = new ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dto_ = dtoBuilder_ == null
            ? dto_
            : dtoBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest) {
        return mergeFrom((ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest other) {
      if (other == ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.getDefaultInstance()) return this;
      if (other.hasDto()) {
        mergeDto(other.getDto());
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
              input.readMessage(
                  getDtoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask dto_;
    private com.google.protobuf.SingleFieldBuilder<
        ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskOrBuilder> dtoBuilder_;
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     * @return Whether the dto field is set.
     */
    public boolean hasDto() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     * @return The dto.
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask getDto() {
      if (dtoBuilder_ == null) {
        return dto_ == null ? ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.getDefaultInstance() : dto_;
      } else {
        return dtoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    public Builder setDto(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask value) {
      if (dtoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dto_ = value;
      } else {
        dtoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    public Builder setDto(
        ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.Builder builderForValue) {
      if (dtoBuilder_ == null) {
        dto_ = builderForValue.build();
      } else {
        dtoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    public Builder mergeDto(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask value) {
      if (dtoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dto_ != null &&
          dto_ != ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.getDefaultInstance()) {
          getDtoBuilder().mergeFrom(value);
        } else {
          dto_ = value;
        }
      } else {
        dtoBuilder_.mergeFrom(value);
      }
      if (dto_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    public Builder clearDto() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dto_ = null;
      if (dtoBuilder_ != null) {
        dtoBuilder_.dispose();
        dtoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.Builder getDtoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDtoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskOrBuilder getDtoOrBuilder() {
      if (dtoBuilder_ != null) {
        return dtoBuilder_.getMessageOrBuilder();
      } else {
        return dto_ == null ?
            ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.getDefaultInstance() : dto_;
      }
    }
    /**
     * <pre>
     * dto - данные для создания задачи.
     * </pre>
     *
     * <code>.scheduler.CreateTask dto = 1 [json_name = "dto"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskOrBuilder> 
        getDtoFieldBuilder() {
      if (dtoBuilder_ == null) {
        dtoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTask.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskOrBuilder>(
                getDto(),
                getParentForChildren(),
                isClean());
        dto_ = null;
      }
      return dtoBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:scheduler.CreateTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:scheduler.CreateTaskRequest)
  private static final ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest();
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTaskRequest>() {
    @java.lang.Override
    public CreateTaskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

