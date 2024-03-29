// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler/types.proto

// Protobuf Java Version: 4.26.0
package tawt_scheduler.proto.scheduler;

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
    return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tawt_scheduler.proto.scheduler.TaskType.class, tawt_scheduler.proto.scheduler.TaskType.Builder.class);
  }

  private int specificCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object specific_;
  public enum SpecificCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GRAPHEMATICAL(1),
    GAMMA(2),
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
        case 2: return GAMMA;
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
  public tawt_scheduler.proto.scheduler.TaskTypeGraphematical getGraphematical() {
    if (specificCase_ == 1) {
       return (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
    }
    return tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
  }
  /**
   * <pre>
   * graphematical - тип задачи "графематический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
   */
  @java.lang.Override
  public tawt_scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder getGraphematicalOrBuilder() {
    if (specificCase_ == 1) {
       return (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
    }
    return tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
  }

  public static final int GAMMA_FIELD_NUMBER = 2;
  /**
   * <pre>
   * gamma - тип задачи "граф. + морфологический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
   * @return Whether the gamma field is set.
   */
  @java.lang.Override
  public boolean hasGamma() {
    return specificCase_ == 2;
  }
  /**
   * <pre>
   * gamma - тип задачи "граф. + морфологический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
   * @return The gamma.
   */
  @java.lang.Override
  public tawt_scheduler.proto.scheduler.TaskTypeGamma getGamma() {
    if (specificCase_ == 2) {
       return (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_;
    }
    return tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance();
  }
  /**
   * <pre>
   * gamma - тип задачи "граф. + морфологический анализ".
   * </pre>
   *
   * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
   */
  @java.lang.Override
  public tawt_scheduler.proto.scheduler.TaskTypeGammaOrBuilder getGammaOrBuilder() {
    if (specificCase_ == 2) {
       return (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_;
    }
    return tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance();
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
      output.writeMessage(1, (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_);
    }
    if (specificCase_ == 2) {
      output.writeMessage(2, (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_);
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
        .computeMessageSize(1, (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_);
    }
    if (specificCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_);
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
    if (!(obj instanceof tawt_scheduler.proto.scheduler.TaskType)) {
      return super.equals(obj);
    }
    tawt_scheduler.proto.scheduler.TaskType other = (tawt_scheduler.proto.scheduler.TaskType) obj;

    if (!getSpecificCase().equals(other.getSpecificCase())) return false;
    switch (specificCase_) {
      case 1:
        if (!getGraphematical()
            .equals(other.getGraphematical())) return false;
        break;
      case 2:
        if (!getGamma()
            .equals(other.getGamma())) return false;
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
        hash = (37 * hash) + GAMMA_FIELD_NUMBER;
        hash = (53 * hash) + getGamma().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static tawt_scheduler.proto.scheduler.TaskType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static tawt_scheduler.proto.scheduler.TaskType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static tawt_scheduler.proto.scheduler.TaskType parseFrom(
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
  public static Builder newBuilder(tawt_scheduler.proto.scheduler.TaskType prototype) {
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
      tawt_scheduler.proto.scheduler.TaskTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tawt_scheduler.proto.scheduler.TaskType.class, tawt_scheduler.proto.scheduler.TaskType.Builder.class);
    }

    // Construct using tawt_scheduler.proto.scheduler.TaskType.newBuilder()
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
      if (gammaBuilder_ != null) {
        gammaBuilder_.clear();
      }
      specificCase_ = 0;
      specific_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tawt_scheduler.proto.scheduler.Types.internal_static_scheduler_TaskType_descriptor;
    }

    @java.lang.Override
    public tawt_scheduler.proto.scheduler.TaskType getDefaultInstanceForType() {
      return tawt_scheduler.proto.scheduler.TaskType.getDefaultInstance();
    }

    @java.lang.Override
    public tawt_scheduler.proto.scheduler.TaskType build() {
      tawt_scheduler.proto.scheduler.TaskType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tawt_scheduler.proto.scheduler.TaskType buildPartial() {
      tawt_scheduler.proto.scheduler.TaskType result = new tawt_scheduler.proto.scheduler.TaskType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(tawt_scheduler.proto.scheduler.TaskType result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(tawt_scheduler.proto.scheduler.TaskType result) {
      result.specificCase_ = specificCase_;
      result.specific_ = this.specific_;
      if (specificCase_ == 1 &&
          graphematicalBuilder_ != null) {
        result.specific_ = graphematicalBuilder_.build();
      }
      if (specificCase_ == 2 &&
          gammaBuilder_ != null) {
        result.specific_ = gammaBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tawt_scheduler.proto.scheduler.TaskType) {
        return mergeFrom((tawt_scheduler.proto.scheduler.TaskType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tawt_scheduler.proto.scheduler.TaskType other) {
      if (other == tawt_scheduler.proto.scheduler.TaskType.getDefaultInstance()) return this;
      switch (other.getSpecificCase()) {
        case GRAPHEMATICAL: {
          mergeGraphematical(other.getGraphematical());
          break;
        }
        case GAMMA: {
          mergeGamma(other.getGamma());
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
                  getGammaFieldBuilder().getBuilder(),
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
        tawt_scheduler.proto.scheduler.TaskTypeGraphematical, tawt_scheduler.proto.scheduler.TaskTypeGraphematical.Builder, tawt_scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder> graphematicalBuilder_;
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
    public tawt_scheduler.proto.scheduler.TaskTypeGraphematical getGraphematical() {
      if (graphematicalBuilder_ == null) {
        if (specificCase_ == 1) {
          return (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
        }
        return tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
      } else {
        if (specificCase_ == 1) {
          return graphematicalBuilder_.getMessage();
        }
        return tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * graphematical - тип задачи "графематический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGraphematical graphematical = 1 [json_name = "graphematical"];</code>
     */
    public Builder setGraphematical(tawt_scheduler.proto.scheduler.TaskTypeGraphematical value) {
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
        tawt_scheduler.proto.scheduler.TaskTypeGraphematical.Builder builderForValue) {
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
    public Builder mergeGraphematical(tawt_scheduler.proto.scheduler.TaskTypeGraphematical value) {
      if (graphematicalBuilder_ == null) {
        if (specificCase_ == 1 &&
            specific_ != tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance()) {
          specific_ = tawt_scheduler.proto.scheduler.TaskTypeGraphematical.newBuilder((tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_)
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
    public tawt_scheduler.proto.scheduler.TaskTypeGraphematical.Builder getGraphematicalBuilder() {
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
    public tawt_scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder getGraphematicalOrBuilder() {
      if ((specificCase_ == 1) && (graphematicalBuilder_ != null)) {
        return graphematicalBuilder_.getMessageOrBuilder();
      } else {
        if (specificCase_ == 1) {
          return (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_;
        }
        return tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
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
        tawt_scheduler.proto.scheduler.TaskTypeGraphematical, tawt_scheduler.proto.scheduler.TaskTypeGraphematical.Builder, tawt_scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder> 
        getGraphematicalFieldBuilder() {
      if (graphematicalBuilder_ == null) {
        if (!(specificCase_ == 1)) {
          specific_ = tawt_scheduler.proto.scheduler.TaskTypeGraphematical.getDefaultInstance();
        }
        graphematicalBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            tawt_scheduler.proto.scheduler.TaskTypeGraphematical, tawt_scheduler.proto.scheduler.TaskTypeGraphematical.Builder, tawt_scheduler.proto.scheduler.TaskTypeGraphematicalOrBuilder>(
                (tawt_scheduler.proto.scheduler.TaskTypeGraphematical) specific_,
                getParentForChildren(),
                isClean());
        specific_ = null;
      }
      specificCase_ = 1;
      onChanged();
      return graphematicalBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        tawt_scheduler.proto.scheduler.TaskTypeGamma, tawt_scheduler.proto.scheduler.TaskTypeGamma.Builder, tawt_scheduler.proto.scheduler.TaskTypeGammaOrBuilder> gammaBuilder_;
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     * @return Whether the gamma field is set.
     */
    @java.lang.Override
    public boolean hasGamma() {
      return specificCase_ == 2;
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     * @return The gamma.
     */
    @java.lang.Override
    public tawt_scheduler.proto.scheduler.TaskTypeGamma getGamma() {
      if (gammaBuilder_ == null) {
        if (specificCase_ == 2) {
          return (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_;
        }
        return tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance();
      } else {
        if (specificCase_ == 2) {
          return gammaBuilder_.getMessage();
        }
        return tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    public Builder setGamma(tawt_scheduler.proto.scheduler.TaskTypeGamma value) {
      if (gammaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specific_ = value;
        onChanged();
      } else {
        gammaBuilder_.setMessage(value);
      }
      specificCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    public Builder setGamma(
        tawt_scheduler.proto.scheduler.TaskTypeGamma.Builder builderForValue) {
      if (gammaBuilder_ == null) {
        specific_ = builderForValue.build();
        onChanged();
      } else {
        gammaBuilder_.setMessage(builderForValue.build());
      }
      specificCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    public Builder mergeGamma(tawt_scheduler.proto.scheduler.TaskTypeGamma value) {
      if (gammaBuilder_ == null) {
        if (specificCase_ == 2 &&
            specific_ != tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance()) {
          specific_ = tawt_scheduler.proto.scheduler.TaskTypeGamma.newBuilder((tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_)
              .mergeFrom(value).buildPartial();
        } else {
          specific_ = value;
        }
        onChanged();
      } else {
        if (specificCase_ == 2) {
          gammaBuilder_.mergeFrom(value);
        } else {
          gammaBuilder_.setMessage(value);
        }
      }
      specificCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    public Builder clearGamma() {
      if (gammaBuilder_ == null) {
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
        gammaBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    public tawt_scheduler.proto.scheduler.TaskTypeGamma.Builder getGammaBuilder() {
      return getGammaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    @java.lang.Override
    public tawt_scheduler.proto.scheduler.TaskTypeGammaOrBuilder getGammaOrBuilder() {
      if ((specificCase_ == 2) && (gammaBuilder_ != null)) {
        return gammaBuilder_.getMessageOrBuilder();
      } else {
        if (specificCase_ == 2) {
          return (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_;
        }
        return tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * gamma - тип задачи "граф. + морфологический анализ".
     * </pre>
     *
     * <code>.scheduler.TaskTypeGamma gamma = 2 [json_name = "gamma"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        tawt_scheduler.proto.scheduler.TaskTypeGamma, tawt_scheduler.proto.scheduler.TaskTypeGamma.Builder, tawt_scheduler.proto.scheduler.TaskTypeGammaOrBuilder> 
        getGammaFieldBuilder() {
      if (gammaBuilder_ == null) {
        if (!(specificCase_ == 2)) {
          specific_ = tawt_scheduler.proto.scheduler.TaskTypeGamma.getDefaultInstance();
        }
        gammaBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            tawt_scheduler.proto.scheduler.TaskTypeGamma, tawt_scheduler.proto.scheduler.TaskTypeGamma.Builder, tawt_scheduler.proto.scheduler.TaskTypeGammaOrBuilder>(
                (tawt_scheduler.proto.scheduler.TaskTypeGamma) specific_,
                getParentForChildren(),
                isClean());
        specific_ = null;
      }
      specificCase_ = 2;
      onChanged();
      return gammaBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:scheduler.TaskType)
  }

  // @@protoc_insertion_point(class_scope:scheduler.TaskType)
  private static final tawt_scheduler.proto.scheduler.TaskType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tawt_scheduler.proto.scheduler.TaskType();
  }

  public static tawt_scheduler.proto.scheduler.TaskType getDefaultInstance() {
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
  public tawt_scheduler.proto.scheduler.TaskType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

