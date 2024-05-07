// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/types.proto

// Protobuf Java Version: 4.26.0
package ru.textanalysis.tawt.scheduler.proto.scheduler;

/**
 * <pre>
 * TaskTypeDisambiguationTrue - тип задачи "граф. + морфологический анализ + устранение неоднозначностей с использованием статистического анализа".
 * </pre>
 *
 * Protobuf type {@code scheduler.TaskTypeDisambiguationTrue}
 */
public final class TaskTypeDisambiguationTrue extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:scheduler.TaskTypeDisambiguationTrue)
    TaskTypeDisambiguationTrueOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      TaskTypeDisambiguationTrue.class.getName());
  }
  // Use TaskTypeDisambiguationTrue.newBuilder() to construct.
  private TaskTypeDisambiguationTrue(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TaskTypeDisambiguationTrue() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskTypeDisambiguationTrue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskTypeDisambiguationTrue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.class, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue)) {
      return super.equals(obj);
    }
    ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue other = (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue parseFrom(
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
  public static Builder newBuilder(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue prototype) {
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
   * TaskTypeDisambiguationTrue - тип задачи "граф. + морфологический анализ + устранение неоднозначностей с использованием статистического анализа".
   * </pre>
   *
   * Protobuf type {@code scheduler.TaskTypeDisambiguationTrue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scheduler.TaskTypeDisambiguationTrue)
      ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskTypeDisambiguationTrue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskTypeDisambiguationTrue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.class, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.Builder.class);
    }

    // Construct using ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskTypeDisambiguationTrue_descriptor;
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue getDefaultInstanceForType() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.getDefaultInstance();
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue build() {
      ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue buildPartial() {
      ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue result = new ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue) {
        return mergeFrom((ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue other) {
      if (other == ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:scheduler.TaskTypeDisambiguationTrue)
  }

  // @@protoc_insertion_point(class_scope:scheduler.TaskTypeDisambiguationTrue)
  private static final ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue();
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskTypeDisambiguationTrue>
      PARSER = new com.google.protobuf.AbstractParser<TaskTypeDisambiguationTrue>() {
    @java.lang.Override
    public TaskTypeDisambiguationTrue parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskTypeDisambiguationTrue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskTypeDisambiguationTrue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeDisambiguationTrue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

