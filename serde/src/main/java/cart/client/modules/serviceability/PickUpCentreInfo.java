// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/PickUpCentreInfo.proto

package cart.client.modules.serviceability;

/**
 * Protobuf type {@code cart.client.modules.serviceability.PickUpCentreInfo}
 */
public  final class PickUpCentreInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.modules.serviceability.PickUpCentreInfo)
    PickUpCentreInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PickUpCentreInfo.newBuilder() to construct.
  private PickUpCentreInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PickUpCentreInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PickUpCentreInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (pickUpStartDateTime_ != null) {
              subBuilder = pickUpStartDateTime_.toBuilder();
            }
            pickUpStartDateTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pickUpStartDateTime_);
              pickUpStartDateTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (pickUpEndDateTime_ != null) {
              subBuilder = pickUpEndDateTime_.toBuilder();
            }
            pickUpEndDateTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pickUpEndDateTime_);
              pickUpEndDateTime_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cart.client.modules.serviceability.PickUpCentreInfoOuterClass.internal_static_cart_client_modules_serviceability_PickUpCentreInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.modules.serviceability.PickUpCentreInfoOuterClass.internal_static_cart_client_modules_serviceability_PickUpCentreInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.modules.serviceability.PickUpCentreInfo.class, cart.client.modules.serviceability.PickUpCentreInfo.Builder.class);
  }

  public static final int PICKUPSTARTDATETIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp pickUpStartDateTime_;
  /**
   * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
   */
  public boolean hasPickUpStartDateTime() {
    return pickUpStartDateTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
   */
  public com.google.protobuf.Timestamp getPickUpStartDateTime() {
    return pickUpStartDateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : pickUpStartDateTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getPickUpStartDateTimeOrBuilder() {
    return getPickUpStartDateTime();
  }

  public static final int PICKUPENDDATETIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp pickUpEndDateTime_;
  /**
   * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
   */
  public boolean hasPickUpEndDateTime() {
    return pickUpEndDateTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
   */
  public com.google.protobuf.Timestamp getPickUpEndDateTime() {
    return pickUpEndDateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : pickUpEndDateTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getPickUpEndDateTimeOrBuilder() {
    return getPickUpEndDateTime();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pickUpStartDateTime_ != null) {
      output.writeMessage(1, getPickUpStartDateTime());
    }
    if (pickUpEndDateTime_ != null) {
      output.writeMessage(2, getPickUpEndDateTime());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pickUpStartDateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPickUpStartDateTime());
    }
    if (pickUpEndDateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPickUpEndDateTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cart.client.modules.serviceability.PickUpCentreInfo)) {
      return super.equals(obj);
    }
    cart.client.modules.serviceability.PickUpCentreInfo other = (cart.client.modules.serviceability.PickUpCentreInfo) obj;

    boolean result = true;
    result = result && (hasPickUpStartDateTime() == other.hasPickUpStartDateTime());
    if (hasPickUpStartDateTime()) {
      result = result && getPickUpStartDateTime()
          .equals(other.getPickUpStartDateTime());
    }
    result = result && (hasPickUpEndDateTime() == other.hasPickUpEndDateTime());
    if (hasPickUpEndDateTime()) {
      result = result && getPickUpEndDateTime()
          .equals(other.getPickUpEndDateTime());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPickUpStartDateTime()) {
      hash = (37 * hash) + PICKUPSTARTDATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getPickUpStartDateTime().hashCode();
    }
    if (hasPickUpEndDateTime()) {
      hash = (37 * hash) + PICKUPENDDATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getPickUpEndDateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.PickUpCentreInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cart.client.modules.serviceability.PickUpCentreInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cart.client.modules.serviceability.PickUpCentreInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.modules.serviceability.PickUpCentreInfo)
      cart.client.modules.serviceability.PickUpCentreInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.modules.serviceability.PickUpCentreInfoOuterClass.internal_static_cart_client_modules_serviceability_PickUpCentreInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.modules.serviceability.PickUpCentreInfoOuterClass.internal_static_cart_client_modules_serviceability_PickUpCentreInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.modules.serviceability.PickUpCentreInfo.class, cart.client.modules.serviceability.PickUpCentreInfo.Builder.class);
    }

    // Construct using cart.client.modules.serviceability.PickUpCentreInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (pickUpStartDateTimeBuilder_ == null) {
        pickUpStartDateTime_ = null;
      } else {
        pickUpStartDateTime_ = null;
        pickUpStartDateTimeBuilder_ = null;
      }
      if (pickUpEndDateTimeBuilder_ == null) {
        pickUpEndDateTime_ = null;
      } else {
        pickUpEndDateTime_ = null;
        pickUpEndDateTimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.modules.serviceability.PickUpCentreInfoOuterClass.internal_static_cart_client_modules_serviceability_PickUpCentreInfo_descriptor;
    }

    public cart.client.modules.serviceability.PickUpCentreInfo getDefaultInstanceForType() {
      return cart.client.modules.serviceability.PickUpCentreInfo.getDefaultInstance();
    }

    public cart.client.modules.serviceability.PickUpCentreInfo build() {
      cart.client.modules.serviceability.PickUpCentreInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.modules.serviceability.PickUpCentreInfo buildPartial() {
      cart.client.modules.serviceability.PickUpCentreInfo result = new cart.client.modules.serviceability.PickUpCentreInfo(this);
      if (pickUpStartDateTimeBuilder_ == null) {
        result.pickUpStartDateTime_ = pickUpStartDateTime_;
      } else {
        result.pickUpStartDateTime_ = pickUpStartDateTimeBuilder_.build();
      }
      if (pickUpEndDateTimeBuilder_ == null) {
        result.pickUpEndDateTime_ = pickUpEndDateTime_;
      } else {
        result.pickUpEndDateTime_ = pickUpEndDateTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cart.client.modules.serviceability.PickUpCentreInfo) {
        return mergeFrom((cart.client.modules.serviceability.PickUpCentreInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.modules.serviceability.PickUpCentreInfo other) {
      if (other == cart.client.modules.serviceability.PickUpCentreInfo.getDefaultInstance()) return this;
      if (other.hasPickUpStartDateTime()) {
        mergePickUpStartDateTime(other.getPickUpStartDateTime());
      }
      if (other.hasPickUpEndDateTime()) {
        mergePickUpEndDateTime(other.getPickUpEndDateTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cart.client.modules.serviceability.PickUpCentreInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.modules.serviceability.PickUpCentreInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp pickUpStartDateTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> pickUpStartDateTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public boolean hasPickUpStartDateTime() {
      return pickUpStartDateTimeBuilder_ != null || pickUpStartDateTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public com.google.protobuf.Timestamp getPickUpStartDateTime() {
      if (pickUpStartDateTimeBuilder_ == null) {
        return pickUpStartDateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : pickUpStartDateTime_;
      } else {
        return pickUpStartDateTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public Builder setPickUpStartDateTime(com.google.protobuf.Timestamp value) {
      if (pickUpStartDateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pickUpStartDateTime_ = value;
        onChanged();
      } else {
        pickUpStartDateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public Builder setPickUpStartDateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (pickUpStartDateTimeBuilder_ == null) {
        pickUpStartDateTime_ = builderForValue.build();
        onChanged();
      } else {
        pickUpStartDateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public Builder mergePickUpStartDateTime(com.google.protobuf.Timestamp value) {
      if (pickUpStartDateTimeBuilder_ == null) {
        if (pickUpStartDateTime_ != null) {
          pickUpStartDateTime_ =
            com.google.protobuf.Timestamp.newBuilder(pickUpStartDateTime_).mergeFrom(value).buildPartial();
        } else {
          pickUpStartDateTime_ = value;
        }
        onChanged();
      } else {
        pickUpStartDateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public Builder clearPickUpStartDateTime() {
      if (pickUpStartDateTimeBuilder_ == null) {
        pickUpStartDateTime_ = null;
        onChanged();
      } else {
        pickUpStartDateTime_ = null;
        pickUpStartDateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getPickUpStartDateTimeBuilder() {
      
      onChanged();
      return getPickUpStartDateTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getPickUpStartDateTimeOrBuilder() {
      if (pickUpStartDateTimeBuilder_ != null) {
        return pickUpStartDateTimeBuilder_.getMessageOrBuilder();
      } else {
        return pickUpStartDateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : pickUpStartDateTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpStartDateTime = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getPickUpStartDateTimeFieldBuilder() {
      if (pickUpStartDateTimeBuilder_ == null) {
        pickUpStartDateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getPickUpStartDateTime(),
                getParentForChildren(),
                isClean());
        pickUpStartDateTime_ = null;
      }
      return pickUpStartDateTimeBuilder_;
    }

    private com.google.protobuf.Timestamp pickUpEndDateTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> pickUpEndDateTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public boolean hasPickUpEndDateTime() {
      return pickUpEndDateTimeBuilder_ != null || pickUpEndDateTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public com.google.protobuf.Timestamp getPickUpEndDateTime() {
      if (pickUpEndDateTimeBuilder_ == null) {
        return pickUpEndDateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : pickUpEndDateTime_;
      } else {
        return pickUpEndDateTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public Builder setPickUpEndDateTime(com.google.protobuf.Timestamp value) {
      if (pickUpEndDateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pickUpEndDateTime_ = value;
        onChanged();
      } else {
        pickUpEndDateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public Builder setPickUpEndDateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (pickUpEndDateTimeBuilder_ == null) {
        pickUpEndDateTime_ = builderForValue.build();
        onChanged();
      } else {
        pickUpEndDateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public Builder mergePickUpEndDateTime(com.google.protobuf.Timestamp value) {
      if (pickUpEndDateTimeBuilder_ == null) {
        if (pickUpEndDateTime_ != null) {
          pickUpEndDateTime_ =
            com.google.protobuf.Timestamp.newBuilder(pickUpEndDateTime_).mergeFrom(value).buildPartial();
        } else {
          pickUpEndDateTime_ = value;
        }
        onChanged();
      } else {
        pickUpEndDateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public Builder clearPickUpEndDateTime() {
      if (pickUpEndDateTimeBuilder_ == null) {
        pickUpEndDateTime_ = null;
        onChanged();
      } else {
        pickUpEndDateTime_ = null;
        pickUpEndDateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getPickUpEndDateTimeBuilder() {
      
      onChanged();
      return getPickUpEndDateTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getPickUpEndDateTimeOrBuilder() {
      if (pickUpEndDateTimeBuilder_ != null) {
        return pickUpEndDateTimeBuilder_.getMessageOrBuilder();
      } else {
        return pickUpEndDateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : pickUpEndDateTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp pickUpEndDateTime = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getPickUpEndDateTimeFieldBuilder() {
      if (pickUpEndDateTimeBuilder_ == null) {
        pickUpEndDateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getPickUpEndDateTime(),
                getParentForChildren(),
                isClean());
        pickUpEndDateTime_ = null;
      }
      return pickUpEndDateTimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cart.client.modules.serviceability.PickUpCentreInfo)
  }

  // @@protoc_insertion_point(class_scope:cart.client.modules.serviceability.PickUpCentreInfo)
  private static final cart.client.modules.serviceability.PickUpCentreInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.modules.serviceability.PickUpCentreInfo();
  }

  public static cart.client.modules.serviceability.PickUpCentreInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PickUpCentreInfo>
      PARSER = new com.google.protobuf.AbstractParser<PickUpCentreInfo>() {
    public PickUpCentreInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PickUpCentreInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PickUpCentreInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PickUpCentreInfo> getParserForType() {
    return PARSER;
  }

  public cart.client.modules.serviceability.PickUpCentreInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

