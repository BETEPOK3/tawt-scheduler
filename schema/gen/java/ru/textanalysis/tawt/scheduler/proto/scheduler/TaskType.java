// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/types.proto

// Protobuf Java Version: 4.26.0
package ru.textanalysis.tawt.scheduler.proto.scheduler;

/**
 * <pre>
 * TaskType - тип задачи.
 * </pre>
 *
 * Protobuf type {@code scheduler.TaskType}
 */
public final class TaskType extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:scheduler.TaskType)
    TaskTypeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      TaskType.class.getName());
  }
  // Use TaskType.newBuilder() to construct.
  private TaskType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TaskType() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.class, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.Builder.class);
  }

  private int specificCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object specific_;
  public enum SpecificCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GRAPHEMATICAL(1),
    GAMA(2),
    SPECIFIC_NOT_SET(0);
    private final int value;
    private SpecificCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecificCase valueOf(int value) {
      return forNumber(value);
    }

    public static SpecificCase forNumber(int value) {
      switch (value) {
        case 1: return GRAPHEMATICAL;
        case 2: return GAMA;
        case 0: return SPECIFIC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SpecificCase
  getSpecificCase() {
    return SpecificCase.forNumber(
        specificCase_);
  }

  public static final int GRAPHEMATICAL_FIELD_NUMBER = 1;
  /**
   * <pre>
   * graphematical - тип задачи "графематический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
   * @return Whether the graphematical field is set.
   */
  @java.lang.Override
  public boolean hasGraphematical() {
    return specificCase_ == 1;
  }
  /**
   * <pre>
   * graphematical - тип задачи "графематический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
   * @return The graphematical.
   */
  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical getGraphematical() {
    if (specificCase_ == 1) {
       return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
    }
    return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
  }
  /**
   * <pre>
   * graphematical - тип задачи "графематический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
   */
  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder getGraphematicalOrBuilder() {
    if (specificCase_ == 1) {
       return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
    }
    return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
  }

  public static final int GAMA_FIELD_NUMBER = 2;
  /**
   * <pre>
   * gama - тип задачи "граф. + морфологический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
   * @return Whether the gama field is set.
   */
  @java.lang.Override
  public boolean hasGama() {
    return specificCase_ == 2;
  }
  /**
   * <pre>
   * gama - тип задачи "граф. + морфологический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
   * @return The gama.
   */
  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama getGama() {
    if (specificCase_ == 2) {
       return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_;
    }
    return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance();
  }
  /**
   * <pre>
   * gama - тип задачи "граф. + морфологический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
   */
  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGamaOrBuilder getGamaOrBuilder() {
    if (specificCase_ == 2) {
       return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_;
    }
    return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance();
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
    if (specificCase_ == 1) {
      output.writeMessage(1, (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_);
    }
    if (specificCase_ == 2) {
      output.writeMessage(2, (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (specificCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_);
    }
    if (specificCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_);
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
    if (!(obj instanceof ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType)) {
      return super.equals(obj);
    }
    ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType other = (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType) obj;

    if (!getSpecificCase().equals(other.getSpecificCase())) return false;
    switch (specificCase_) {
      case 1:
        if (!getGraphematical()
            .equals(other.getGraphematical())) return false;
        break;
      case 2:
        if (!getGama()
            .equals(other.getGama())) return false;
        break;
      case 0:
      default:
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
    switch (specificCase_) {
      case 1:
        hash = (37 * hash) + GRAPHEMATICAL_FIELD_NUMBER;
        hash = (53 * hash) + getGraphematical().hashCode();
        break;
      case 2:
        hash = (37 * hash) + GAMA_FIELD_NUMBER;
        hash = (53 * hash) + getGama().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType parseFrom(
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
  public static Builder newBuilder(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType prototype) {
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
   * TaskType - тип задачи.
   * </pre>
   *
   * Protobuf type {@code scheduler.TaskType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scheduler.TaskType)
      ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.class, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.Builder.class);
    }

    // Construct using ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (graphematicalBuilder_ != null) {
        graphematicalBuilder_.clear();
      }
      if (gamaBuilder_ != null) {
        gamaBuilder_.clear();
      }
      specificCase_ = 0;
      specific_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_descriptor;
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType getDefaultInstanceForType() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.getDefaultInstance();
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType build() {
      ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType buildPartial() {
      ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType result = new ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType result) {
      result.specificCase_ = specificCase_;
      result.specific_ = this.specific_;
      if (specificCase_ == 1 &&
          graphematicalBuilder_ != null) {
        result.specific_ = graphematicalBuilder_.build();
      }
      if (specificCase_ == 2 &&
          gamaBuilder_ != null) {
        result.specific_ = gamaBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType) {
        return mergeFrom((ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType other) {
      if (other == ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType.getDefaultInstance()) return this;
      switch (other.getSpecificCase()) {
        case GRAPHEMATICAL: {
          mergeGraphematical(other.getGraphematical());
          break;
        }
        case GAMA: {
          mergeGama(other.getGama());
          break;
        }
        case SPECIFIC_NOT_SET: {
          break;
        }
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
                  getGraphematicalFieldBuilder().getBuilder(),
                  extensionRegistry);
              specificCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGamaFieldBuilder().getBuilder(),
                  extensionRegistry);
              specificCase_ = 2;
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
    private int specificCase_ = 0;
    private java.lang.Object specific_;
    public SpecificCase
        getSpecificCase() {
      return SpecificCase.forNumber(
          specificCase_);
    }

    public Builder clearSpecific() {
      specificCase_ = 0;
      specific_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder> graphematicalBuilder_;
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     * @return Whether the graphematical field is set.
     */
    @java.lang.Override
    public boolean hasGraphematical() {
      return specificCase_ == 1;
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     * @return The graphematical.
     */
    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical getGraphematical() {
      if (graphematicalBuilder_ == null) {
        if (specificCase_ == 1) {
          return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
        }
        return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
      } else {
        if (specificCase_ == 1) {
          return graphematicalBuilder_.getMessage();
        }
        return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    public Builder setGraphematical(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical value) {
      if (graphematicalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specific_ = value;
        onChanged();
      } else {
        graphematicalBuilder_.setMessage(value);
      }
      specificCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    public Builder setGraphematical(
        ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.Builder builderForValue) {
      if (graphematicalBuilder_ == null) {
        specific_ = builderForValue.build();
        onChanged();
      } else {
        graphematicalBuilder_.setMessage(builderForValue.build());
      }
      specificCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    public Builder mergeGraphematical(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical value) {
      if (graphematicalBuilder_ == null) {
        if (specificCase_ == 1 &&
            specific_ != ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance()) {
          specific_ = ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.newBuilder((ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_)
              .mergeFrom(value).buildPartial();
        } else {
          specific_ = value;
        }
        onChanged();
      } else {
        if (specificCase_ == 1) {
          graphematicalBuilder_.mergeFrom(value);
        } else {
          graphematicalBuilder_.setMessage(value);
        }
      }
      specificCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    public Builder clearGraphematical() {
      if (graphematicalBuilder_ == null) {
        if (specificCase_ == 1) {
          specificCase_ = 0;
          specific_ = null;
          onChanged();
        }
      } else {
        if (specificCase_ == 1) {
          specificCase_ = 0;
          specific_ = null;
        }
        graphematicalBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.Builder getGraphematicalBuilder() {
      return getGraphematicalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder getGraphematicalOrBuilder() {
      if ((specificCase_ == 1) && (graphematicalBuilder_ != null)) {
        return graphematicalBuilder_.getMessageOrBuilder();
      } else {
        if (specificCase_ == 1) {
          return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
        }
        return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder> 
        getGraphematicalFieldBuilder() {
      if (graphematicalBuilder_ == null) {
        if (!(specificCase_ == 1)) {
          specific_ = ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
        }
        graphematicalBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder>(
                (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGraphematical) specific_,
                getParentForChildren(),
                isClean());
        specific_ = null;
      }
      specificCase_ = 1;
      onChanged();
      return graphematicalBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGamaOrBuilder> gamaBuilder_;
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     * @return Whether the gama field is set.
     */
    @java.lang.Override
    public boolean hasGama() {
      return specificCase_ == 2;
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     * @return The gama.
     */
    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama getGama() {
      if (gamaBuilder_ == null) {
        if (specificCase_ == 2) {
          return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_;
        }
        return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance();
      } else {
        if (specificCase_ == 2) {
          return gamaBuilder_.getMessage();
        }
        return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    public Builder setGama(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama value) {
      if (gamaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specific_ = value;
        onChanged();
      } else {
        gamaBuilder_.setMessage(value);
      }
      specificCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    public Builder setGama(
        ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.Builder builderForValue) {
      if (gamaBuilder_ == null) {
        specific_ = builderForValue.build();
        onChanged();
      } else {
        gamaBuilder_.setMessage(builderForValue.build());
      }
      specificCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    public Builder mergeGama(ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama value) {
      if (gamaBuilder_ == null) {
        if (specificCase_ == 2 &&
            specific_ != ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance()) {
          specific_ = ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.newBuilder((ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_)
              .mergeFrom(value).buildPartial();
        } else {
          specific_ = value;
        }
        onChanged();
      } else {
        if (specificCase_ == 2) {
          gamaBuilder_.mergeFrom(value);
        } else {
          gamaBuilder_.setMessage(value);
        }
      }
      specificCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    public Builder clearGama() {
      if (gamaBuilder_ == null) {
        if (specificCase_ == 2) {
          specificCase_ = 0;
          specific_ = null;
          onChanged();
        }
      } else {
        if (specificCase_ == 2) {
          specificCase_ = 0;
          specific_ = null;
        }
        gamaBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.Builder getGamaBuilder() {
      return getGamaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    @java.lang.Override
    public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGamaOrBuilder getGamaOrBuilder() {
      if ((specificCase_ == 2) && (gamaBuilder_ != null)) {
        return gamaBuilder_.getMessageOrBuilder();
      } else {
        if (specificCase_ == 2) {
          return (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_;
        }
        return ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * gama - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGama gama = 2 [json_name = "gama"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGamaOrBuilder> 
        getGamaFieldBuilder() {
      if (gamaBuilder_ == null) {
        if (!(specificCase_ == 2)) {
          specific_ = ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.getDefaultInstance();
        }
        gamaBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama.Builder, ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGamaOrBuilder>(
                (ru.textanalysis.tawt.scheduler.proto.scheduler.TaskTypeGama) specific_,
                getParentForChildren(),
                isClean());
        specific_ = null;
      }
      specificCase_ = 2;
      onChanged();
      return gamaBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:scheduler.TaskType)
  }

  // @@protoc_insertion_point(class_scope:scheduler.TaskType)
  private static final ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType();
  }

  public static ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskType>
      PARSER = new com.google.protobuf.AbstractParser<TaskType>() {
    @java.lang.Override
    public TaskType parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.textanalysis.tawt.scheduler.proto.scheduler.TaskType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

