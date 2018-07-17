// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalWarningMessage.proto

package cart.client.modules.disbursal.response;

/**
 * Protobuf type {@code cart.client.modules.disbursal.response.DisbursalWarningMessage}
 */
public  final class DisbursalWarningMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.modules.disbursal.response.DisbursalWarningMessage)
    DisbursalWarningMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisbursalWarningMessage.newBuilder() to construct.
  private DisbursalWarningMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisbursalWarningMessage() {
    warningMessage_ = "";
    affectedOfferId_ = "";
    disbursalWarningEnum_ = 0;
    externalIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DisbursalWarningMessage(
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
            java.lang.String s = input.readStringRequireUtf8();

            warningMessage_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            affectedOfferId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            disbursalWarningEnum_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              externalIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            externalIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        externalIds_ = externalIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cart.client.modules.disbursal.response.DisbursalWarningMessageOuterClass.internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.modules.disbursal.response.DisbursalWarningMessageOuterClass.internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.modules.disbursal.response.DisbursalWarningMessage.class, cart.client.modules.disbursal.response.DisbursalWarningMessage.Builder.class);
  }

  private int bitField0_;
  public static final int WARNINGMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object warningMessage_;
  /**
   * <code>string warningMessage = 1;</code>
   */
  public java.lang.String getWarningMessage() {
    java.lang.Object ref = warningMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      warningMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string warningMessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getWarningMessageBytes() {
    java.lang.Object ref = warningMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      warningMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AFFECTEDOFFERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object affectedOfferId_;
  /**
   * <code>string affectedOfferId = 2;</code>
   */
  public java.lang.String getAffectedOfferId() {
    java.lang.Object ref = affectedOfferId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      affectedOfferId_ = s;
      return s;
    }
  }
  /**
   * <code>string affectedOfferId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAffectedOfferIdBytes() {
    java.lang.Object ref = affectedOfferId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      affectedOfferId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISBURSALWARNINGENUM_FIELD_NUMBER = 3;
  private int disbursalWarningEnum_;
  /**
   * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
   */
  public int getDisbursalWarningEnumValue() {
    return disbursalWarningEnum_;
  }
  /**
   * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
   */
  public cart.client.modules.disbursal.enums.DisbursalWarningEnum getDisbursalWarningEnum() {
    cart.client.modules.disbursal.enums.DisbursalWarningEnum result = cart.client.modules.disbursal.enums.DisbursalWarningEnum.valueOf(disbursalWarningEnum_);
    return result == null ? cart.client.modules.disbursal.enums.DisbursalWarningEnum.UNRECOGNIZED : result;
  }

  public static final int EXTERNALIDS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList externalIds_;
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getExternalIdsList() {
    return externalIds_;
  }
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  public int getExternalIdsCount() {
    return externalIds_.size();
  }
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  public java.lang.String getExternalIds(int index) {
    return externalIds_.get(index);
  }
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  public com.google.protobuf.ByteString
      getExternalIdsBytes(int index) {
    return externalIds_.getByteString(index);
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
    if (!getWarningMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, warningMessage_);
    }
    if (!getAffectedOfferIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, affectedOfferId_);
    }
    if (disbursalWarningEnum_ != cart.client.modules.disbursal.enums.DisbursalWarningEnum.FREEBIE_NOT_SERVICABLE.getNumber()) {
      output.writeEnum(3, disbursalWarningEnum_);
    }
    for (int i = 0; i < externalIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, externalIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getWarningMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, warningMessage_);
    }
    if (!getAffectedOfferIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, affectedOfferId_);
    }
    if (disbursalWarningEnum_ != cart.client.modules.disbursal.enums.DisbursalWarningEnum.FREEBIE_NOT_SERVICABLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, disbursalWarningEnum_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < externalIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(externalIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getExternalIdsList().size();
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
    if (!(obj instanceof cart.client.modules.disbursal.response.DisbursalWarningMessage)) {
      return super.equals(obj);
    }
    cart.client.modules.disbursal.response.DisbursalWarningMessage other = (cart.client.modules.disbursal.response.DisbursalWarningMessage) obj;

    boolean result = true;
    result = result && getWarningMessage()
        .equals(other.getWarningMessage());
    result = result && getAffectedOfferId()
        .equals(other.getAffectedOfferId());
    result = result && disbursalWarningEnum_ == other.disbursalWarningEnum_;
    result = result && getExternalIdsList()
        .equals(other.getExternalIdsList());
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
    hash = (37 * hash) + WARNINGMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getWarningMessage().hashCode();
    hash = (37 * hash) + AFFECTEDOFFERID_FIELD_NUMBER;
    hash = (53 * hash) + getAffectedOfferId().hashCode();
    hash = (37 * hash) + DISBURSALWARNINGENUM_FIELD_NUMBER;
    hash = (53 * hash) + disbursalWarningEnum_;
    if (getExternalIdsCount() > 0) {
      hash = (37 * hash) + EXTERNALIDS_FIELD_NUMBER;
      hash = (53 * hash) + getExternalIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.disbursal.response.DisbursalWarningMessage parseFrom(
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
  public static Builder newBuilder(cart.client.modules.disbursal.response.DisbursalWarningMessage prototype) {
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
   * Protobuf type {@code cart.client.modules.disbursal.response.DisbursalWarningMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.modules.disbursal.response.DisbursalWarningMessage)
      cart.client.modules.disbursal.response.DisbursalWarningMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.modules.disbursal.response.DisbursalWarningMessageOuterClass.internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.modules.disbursal.response.DisbursalWarningMessageOuterClass.internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.modules.disbursal.response.DisbursalWarningMessage.class, cart.client.modules.disbursal.response.DisbursalWarningMessage.Builder.class);
    }

    // Construct using cart.client.modules.disbursal.response.DisbursalWarningMessage.newBuilder()
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
      warningMessage_ = "";

      affectedOfferId_ = "";

      disbursalWarningEnum_ = 0;

      externalIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.modules.disbursal.response.DisbursalWarningMessageOuterClass.internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_descriptor;
    }

    public cart.client.modules.disbursal.response.DisbursalWarningMessage getDefaultInstanceForType() {
      return cart.client.modules.disbursal.response.DisbursalWarningMessage.getDefaultInstance();
    }

    public cart.client.modules.disbursal.response.DisbursalWarningMessage build() {
      cart.client.modules.disbursal.response.DisbursalWarningMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.modules.disbursal.response.DisbursalWarningMessage buildPartial() {
      cart.client.modules.disbursal.response.DisbursalWarningMessage result = new cart.client.modules.disbursal.response.DisbursalWarningMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.warningMessage_ = warningMessage_;
      result.affectedOfferId_ = affectedOfferId_;
      result.disbursalWarningEnum_ = disbursalWarningEnum_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        externalIds_ = externalIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.externalIds_ = externalIds_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof cart.client.modules.disbursal.response.DisbursalWarningMessage) {
        return mergeFrom((cart.client.modules.disbursal.response.DisbursalWarningMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.modules.disbursal.response.DisbursalWarningMessage other) {
      if (other == cart.client.modules.disbursal.response.DisbursalWarningMessage.getDefaultInstance()) return this;
      if (!other.getWarningMessage().isEmpty()) {
        warningMessage_ = other.warningMessage_;
        onChanged();
      }
      if (!other.getAffectedOfferId().isEmpty()) {
        affectedOfferId_ = other.affectedOfferId_;
        onChanged();
      }
      if (other.disbursalWarningEnum_ != 0) {
        setDisbursalWarningEnumValue(other.getDisbursalWarningEnumValue());
      }
      if (!other.externalIds_.isEmpty()) {
        if (externalIds_.isEmpty()) {
          externalIds_ = other.externalIds_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureExternalIdsIsMutable();
          externalIds_.addAll(other.externalIds_);
        }
        onChanged();
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
      cart.client.modules.disbursal.response.DisbursalWarningMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.modules.disbursal.response.DisbursalWarningMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object warningMessage_ = "";
    /**
     * <code>string warningMessage = 1;</code>
     */
    public java.lang.String getWarningMessage() {
      java.lang.Object ref = warningMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        warningMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string warningMessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getWarningMessageBytes() {
      java.lang.Object ref = warningMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        warningMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string warningMessage = 1;</code>
     */
    public Builder setWarningMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      warningMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string warningMessage = 1;</code>
     */
    public Builder clearWarningMessage() {
      
      warningMessage_ = getDefaultInstance().getWarningMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string warningMessage = 1;</code>
     */
    public Builder setWarningMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      warningMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object affectedOfferId_ = "";
    /**
     * <code>string affectedOfferId = 2;</code>
     */
    public java.lang.String getAffectedOfferId() {
      java.lang.Object ref = affectedOfferId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        affectedOfferId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string affectedOfferId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAffectedOfferIdBytes() {
      java.lang.Object ref = affectedOfferId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        affectedOfferId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string affectedOfferId = 2;</code>
     */
    public Builder setAffectedOfferId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      affectedOfferId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string affectedOfferId = 2;</code>
     */
    public Builder clearAffectedOfferId() {
      
      affectedOfferId_ = getDefaultInstance().getAffectedOfferId();
      onChanged();
      return this;
    }
    /**
     * <code>string affectedOfferId = 2;</code>
     */
    public Builder setAffectedOfferIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      affectedOfferId_ = value;
      onChanged();
      return this;
    }

    private int disbursalWarningEnum_ = 0;
    /**
     * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
     */
    public int getDisbursalWarningEnumValue() {
      return disbursalWarningEnum_;
    }
    /**
     * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
     */
    public Builder setDisbursalWarningEnumValue(int value) {
      disbursalWarningEnum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
     */
    public cart.client.modules.disbursal.enums.DisbursalWarningEnum getDisbursalWarningEnum() {
      cart.client.modules.disbursal.enums.DisbursalWarningEnum result = cart.client.modules.disbursal.enums.DisbursalWarningEnum.valueOf(disbursalWarningEnum_);
      return result == null ? cart.client.modules.disbursal.enums.DisbursalWarningEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
     */
    public Builder setDisbursalWarningEnum(cart.client.modules.disbursal.enums.DisbursalWarningEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      disbursalWarningEnum_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
     */
    public Builder clearDisbursalWarningEnum() {
      
      disbursalWarningEnum_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList externalIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureExternalIdsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        externalIds_ = new com.google.protobuf.LazyStringArrayList(externalIds_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getExternalIdsList() {
      return externalIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public int getExternalIdsCount() {
      return externalIds_.size();
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public java.lang.String getExternalIds(int index) {
      return externalIds_.get(index);
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public com.google.protobuf.ByteString
        getExternalIdsBytes(int index) {
      return externalIds_.getByteString(index);
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public Builder setExternalIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExternalIdsIsMutable();
      externalIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public Builder addExternalIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExternalIdsIsMutable();
      externalIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public Builder addAllExternalIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureExternalIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, externalIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public Builder clearExternalIds() {
      externalIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string externalIds = 4;</code>
     */
    public Builder addExternalIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureExternalIdsIsMutable();
      externalIds_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cart.client.modules.disbursal.response.DisbursalWarningMessage)
  }

  // @@protoc_insertion_point(class_scope:cart.client.modules.disbursal.response.DisbursalWarningMessage)
  private static final cart.client.modules.disbursal.response.DisbursalWarningMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.modules.disbursal.response.DisbursalWarningMessage();
  }

  public static cart.client.modules.disbursal.response.DisbursalWarningMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisbursalWarningMessage>
      PARSER = new com.google.protobuf.AbstractParser<DisbursalWarningMessage>() {
    public DisbursalWarningMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DisbursalWarningMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DisbursalWarningMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisbursalWarningMessage> getParserForType() {
    return PARSER;
  }

  public cart.client.modules.disbursal.response.DisbursalWarningMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
