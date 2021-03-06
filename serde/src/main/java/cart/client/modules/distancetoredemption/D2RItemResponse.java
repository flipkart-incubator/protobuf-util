// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/distancetoredemption/D2RItemResponse.proto

package cart.client.modules.distancetoredemption;

/**
 * Protobuf type {@code cart.client.modules.distancetoredemption.D2RItemResponse}
 */
public  final class D2RItemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.modules.distancetoredemption.D2RItemResponse)
    D2RItemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use D2RItemResponse.newBuilder() to construct.
  private D2RItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private D2RItemResponse() {
    source_ = 0;
    caseType_ = "";
    displayText_ = "";
    promotionId_ = "";
    promotionPageURL_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private D2RItemResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            source_ = rawValue;
            break;
          }
          case 18: {
            cart.client.modules.distancetoredemption.ProductContext.Builder subBuilder = null;
            if (productContext_ != null) {
              subBuilder = productContext_.toBuilder();
            }
            productContext_ = input.readMessage(cart.client.modules.distancetoredemption.ProductContext.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(productContext_);
              productContext_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            caseType_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            displayText_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            promotionId_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            promotionPageURL_ = s;
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
    return cart.client.modules.distancetoredemption.D2RItemResponseOuterClass.internal_static_cart_client_modules_distancetoredemption_D2RItemResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.modules.distancetoredemption.D2RItemResponseOuterClass.internal_static_cart_client_modules_distancetoredemption_D2RItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.modules.distancetoredemption.D2RItemResponse.class, cart.client.modules.distancetoredemption.D2RItemResponse.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  private int source_;
  /**
   * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
   */
  public int getSourceValue() {
    return source_;
  }
  /**
   * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
   */
  public cart.client.modules.distancetoredemption.D2RSource getSource() {
    cart.client.modules.distancetoredemption.D2RSource result = cart.client.modules.distancetoredemption.D2RSource.valueOf(source_);
    return result == null ? cart.client.modules.distancetoredemption.D2RSource.UNRECOGNIZED : result;
  }

  public static final int PRODUCTCONTEXT_FIELD_NUMBER = 2;
  private cart.client.modules.distancetoredemption.ProductContext productContext_;
  /**
   * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
   */
  public boolean hasProductContext() {
    return productContext_ != null;
  }
  /**
   * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
   */
  public cart.client.modules.distancetoredemption.ProductContext getProductContext() {
    return productContext_ == null ? cart.client.modules.distancetoredemption.ProductContext.getDefaultInstance() : productContext_;
  }
  /**
   * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
   */
  public cart.client.modules.distancetoredemption.ProductContextOrBuilder getProductContextOrBuilder() {
    return getProductContext();
  }

  public static final int CASETYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object caseType_;
  /**
   * <code>string caseType = 3;</code>
   */
  public java.lang.String getCaseType() {
    java.lang.Object ref = caseType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      caseType_ = s;
      return s;
    }
  }
  /**
   * <code>string caseType = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCaseTypeBytes() {
    java.lang.Object ref = caseType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      caseType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAYTEXT_FIELD_NUMBER = 4;
  private volatile java.lang.Object displayText_;
  /**
   * <code>string displayText = 4;</code>
   */
  public java.lang.String getDisplayText() {
    java.lang.Object ref = displayText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayText_ = s;
      return s;
    }
  }
  /**
   * <code>string displayText = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayTextBytes() {
    java.lang.Object ref = displayText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROMOTIONID_FIELD_NUMBER = 5;
  private volatile java.lang.Object promotionId_;
  /**
   * <code>string promotionId = 5;</code>
   */
  public java.lang.String getPromotionId() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionId_ = s;
      return s;
    }
  }
  /**
   * <code>string promotionId = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPromotionIdBytes() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      promotionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROMOTIONPAGEURL_FIELD_NUMBER = 6;
  private volatile java.lang.Object promotionPageURL_;
  /**
   * <code>string promotionPageURL = 6;</code>
   */
  public java.lang.String getPromotionPageURL() {
    java.lang.Object ref = promotionPageURL_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionPageURL_ = s;
      return s;
    }
  }
  /**
   * <code>string promotionPageURL = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPromotionPageURLBytes() {
    java.lang.Object ref = promotionPageURL_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      promotionPageURL_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (source_ != cart.client.modules.distancetoredemption.D2RSource.PromiseInfo.getNumber()) {
      output.writeEnum(1, source_);
    }
    if (productContext_ != null) {
      output.writeMessage(2, getProductContext());
    }
    if (!getCaseTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, caseType_);
    }
    if (!getDisplayTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, displayText_);
    }
    if (!getPromotionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, promotionId_);
    }
    if (!getPromotionPageURLBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, promotionPageURL_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (source_ != cart.client.modules.distancetoredemption.D2RSource.PromiseInfo.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, source_);
    }
    if (productContext_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProductContext());
    }
    if (!getCaseTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, caseType_);
    }
    if (!getDisplayTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, displayText_);
    }
    if (!getPromotionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, promotionId_);
    }
    if (!getPromotionPageURLBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, promotionPageURL_);
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
    if (!(obj instanceof cart.client.modules.distancetoredemption.D2RItemResponse)) {
      return super.equals(obj);
    }
    cart.client.modules.distancetoredemption.D2RItemResponse other = (cart.client.modules.distancetoredemption.D2RItemResponse) obj;

    boolean result = true;
    result = result && source_ == other.source_;
    result = result && (hasProductContext() == other.hasProductContext());
    if (hasProductContext()) {
      result = result && getProductContext()
          .equals(other.getProductContext());
    }
    result = result && getCaseType()
        .equals(other.getCaseType());
    result = result && getDisplayText()
        .equals(other.getDisplayText());
    result = result && getPromotionId()
        .equals(other.getPromotionId());
    result = result && getPromotionPageURL()
        .equals(other.getPromotionPageURL());
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
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + source_;
    if (hasProductContext()) {
      hash = (37 * hash) + PRODUCTCONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getProductContext().hashCode();
    }
    hash = (37 * hash) + CASETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCaseType().hashCode();
    hash = (37 * hash) + DISPLAYTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayText().hashCode();
    hash = (37 * hash) + PROMOTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionId().hashCode();
    hash = (37 * hash) + PROMOTIONPAGEURL_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionPageURL().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.distancetoredemption.D2RItemResponse parseFrom(
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
  public static Builder newBuilder(cart.client.modules.distancetoredemption.D2RItemResponse prototype) {
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
   * Protobuf type {@code cart.client.modules.distancetoredemption.D2RItemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.modules.distancetoredemption.D2RItemResponse)
      cart.client.modules.distancetoredemption.D2RItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.modules.distancetoredemption.D2RItemResponseOuterClass.internal_static_cart_client_modules_distancetoredemption_D2RItemResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.modules.distancetoredemption.D2RItemResponseOuterClass.internal_static_cart_client_modules_distancetoredemption_D2RItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.modules.distancetoredemption.D2RItemResponse.class, cart.client.modules.distancetoredemption.D2RItemResponse.Builder.class);
    }

    // Construct using cart.client.modules.distancetoredemption.D2RItemResponse.newBuilder()
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
      source_ = 0;

      if (productContextBuilder_ == null) {
        productContext_ = null;
      } else {
        productContext_ = null;
        productContextBuilder_ = null;
      }
      caseType_ = "";

      displayText_ = "";

      promotionId_ = "";

      promotionPageURL_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.modules.distancetoredemption.D2RItemResponseOuterClass.internal_static_cart_client_modules_distancetoredemption_D2RItemResponse_descriptor;
    }

    public cart.client.modules.distancetoredemption.D2RItemResponse getDefaultInstanceForType() {
      return cart.client.modules.distancetoredemption.D2RItemResponse.getDefaultInstance();
    }

    public cart.client.modules.distancetoredemption.D2RItemResponse build() {
      cart.client.modules.distancetoredemption.D2RItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.modules.distancetoredemption.D2RItemResponse buildPartial() {
      cart.client.modules.distancetoredemption.D2RItemResponse result = new cart.client.modules.distancetoredemption.D2RItemResponse(this);
      result.source_ = source_;
      if (productContextBuilder_ == null) {
        result.productContext_ = productContext_;
      } else {
        result.productContext_ = productContextBuilder_.build();
      }
      result.caseType_ = caseType_;
      result.displayText_ = displayText_;
      result.promotionId_ = promotionId_;
      result.promotionPageURL_ = promotionPageURL_;
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
      if (other instanceof cart.client.modules.distancetoredemption.D2RItemResponse) {
        return mergeFrom((cart.client.modules.distancetoredemption.D2RItemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.modules.distancetoredemption.D2RItemResponse other) {
      if (other == cart.client.modules.distancetoredemption.D2RItemResponse.getDefaultInstance()) return this;
      if (other.source_ != 0) {
        setSourceValue(other.getSourceValue());
      }
      if (other.hasProductContext()) {
        mergeProductContext(other.getProductContext());
      }
      if (!other.getCaseType().isEmpty()) {
        caseType_ = other.caseType_;
        onChanged();
      }
      if (!other.getDisplayText().isEmpty()) {
        displayText_ = other.displayText_;
        onChanged();
      }
      if (!other.getPromotionId().isEmpty()) {
        promotionId_ = other.promotionId_;
        onChanged();
      }
      if (!other.getPromotionPageURL().isEmpty()) {
        promotionPageURL_ = other.promotionPageURL_;
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
      cart.client.modules.distancetoredemption.D2RItemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.modules.distancetoredemption.D2RItemResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int source_ = 0;
    /**
     * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
     */
    public int getSourceValue() {
      return source_;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
     */
    public Builder setSourceValue(int value) {
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
     */
    public cart.client.modules.distancetoredemption.D2RSource getSource() {
      cart.client.modules.distancetoredemption.D2RSource result = cart.client.modules.distancetoredemption.D2RSource.valueOf(source_);
      return result == null ? cart.client.modules.distancetoredemption.D2RSource.UNRECOGNIZED : result;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
     */
    public Builder setSource(cart.client.modules.distancetoredemption.D2RSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      source_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
     */
    public Builder clearSource() {
      
      source_ = 0;
      onChanged();
      return this;
    }

    private cart.client.modules.distancetoredemption.ProductContext productContext_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cart.client.modules.distancetoredemption.ProductContext, cart.client.modules.distancetoredemption.ProductContext.Builder, cart.client.modules.distancetoredemption.ProductContextOrBuilder> productContextBuilder_;
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public boolean hasProductContext() {
      return productContextBuilder_ != null || productContext_ != null;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public cart.client.modules.distancetoredemption.ProductContext getProductContext() {
      if (productContextBuilder_ == null) {
        return productContext_ == null ? cart.client.modules.distancetoredemption.ProductContext.getDefaultInstance() : productContext_;
      } else {
        return productContextBuilder_.getMessage();
      }
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public Builder setProductContext(cart.client.modules.distancetoredemption.ProductContext value) {
      if (productContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productContext_ = value;
        onChanged();
      } else {
        productContextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public Builder setProductContext(
        cart.client.modules.distancetoredemption.ProductContext.Builder builderForValue) {
      if (productContextBuilder_ == null) {
        productContext_ = builderForValue.build();
        onChanged();
      } else {
        productContextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public Builder mergeProductContext(cart.client.modules.distancetoredemption.ProductContext value) {
      if (productContextBuilder_ == null) {
        if (productContext_ != null) {
          productContext_ =
            cart.client.modules.distancetoredemption.ProductContext.newBuilder(productContext_).mergeFrom(value).buildPartial();
        } else {
          productContext_ = value;
        }
        onChanged();
      } else {
        productContextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public Builder clearProductContext() {
      if (productContextBuilder_ == null) {
        productContext_ = null;
        onChanged();
      } else {
        productContext_ = null;
        productContextBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public cart.client.modules.distancetoredemption.ProductContext.Builder getProductContextBuilder() {
      
      onChanged();
      return getProductContextFieldBuilder().getBuilder();
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    public cart.client.modules.distancetoredemption.ProductContextOrBuilder getProductContextOrBuilder() {
      if (productContextBuilder_ != null) {
        return productContextBuilder_.getMessageOrBuilder();
      } else {
        return productContext_ == null ?
            cart.client.modules.distancetoredemption.ProductContext.getDefaultInstance() : productContext_;
      }
    }
    /**
     * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cart.client.modules.distancetoredemption.ProductContext, cart.client.modules.distancetoredemption.ProductContext.Builder, cart.client.modules.distancetoredemption.ProductContextOrBuilder> 
        getProductContextFieldBuilder() {
      if (productContextBuilder_ == null) {
        productContextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cart.client.modules.distancetoredemption.ProductContext, cart.client.modules.distancetoredemption.ProductContext.Builder, cart.client.modules.distancetoredemption.ProductContextOrBuilder>(
                getProductContext(),
                getParentForChildren(),
                isClean());
        productContext_ = null;
      }
      return productContextBuilder_;
    }

    private java.lang.Object caseType_ = "";
    /**
     * <code>string caseType = 3;</code>
     */
    public java.lang.String getCaseType() {
      java.lang.Object ref = caseType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        caseType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string caseType = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCaseTypeBytes() {
      java.lang.Object ref = caseType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        caseType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string caseType = 3;</code>
     */
    public Builder setCaseType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      caseType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string caseType = 3;</code>
     */
    public Builder clearCaseType() {
      
      caseType_ = getDefaultInstance().getCaseType();
      onChanged();
      return this;
    }
    /**
     * <code>string caseType = 3;</code>
     */
    public Builder setCaseTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      caseType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayText_ = "";
    /**
     * <code>string displayText = 4;</code>
     */
    public java.lang.String getDisplayText() {
      java.lang.Object ref = displayText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string displayText = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayTextBytes() {
      java.lang.Object ref = displayText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string displayText = 4;</code>
     */
    public Builder setDisplayText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string displayText = 4;</code>
     */
    public Builder clearDisplayText() {
      
      displayText_ = getDefaultInstance().getDisplayText();
      onChanged();
      return this;
    }
    /**
     * <code>string displayText = 4;</code>
     */
    public Builder setDisplayTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object promotionId_ = "";
    /**
     * <code>string promotionId = 5;</code>
     */
    public java.lang.String getPromotionId() {
      java.lang.Object ref = promotionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string promotionId = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPromotionIdBytes() {
      java.lang.Object ref = promotionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        promotionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string promotionId = 5;</code>
     */
    public Builder setPromotionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      promotionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string promotionId = 5;</code>
     */
    public Builder clearPromotionId() {
      
      promotionId_ = getDefaultInstance().getPromotionId();
      onChanged();
      return this;
    }
    /**
     * <code>string promotionId = 5;</code>
     */
    public Builder setPromotionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      promotionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object promotionPageURL_ = "";
    /**
     * <code>string promotionPageURL = 6;</code>
     */
    public java.lang.String getPromotionPageURL() {
      java.lang.Object ref = promotionPageURL_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionPageURL_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string promotionPageURL = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPromotionPageURLBytes() {
      java.lang.Object ref = promotionPageURL_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        promotionPageURL_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string promotionPageURL = 6;</code>
     */
    public Builder setPromotionPageURL(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      promotionPageURL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string promotionPageURL = 6;</code>
     */
    public Builder clearPromotionPageURL() {
      
      promotionPageURL_ = getDefaultInstance().getPromotionPageURL();
      onChanged();
      return this;
    }
    /**
     * <code>string promotionPageURL = 6;</code>
     */
    public Builder setPromotionPageURLBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      promotionPageURL_ = value;
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


    // @@protoc_insertion_point(builder_scope:cart.client.modules.distancetoredemption.D2RItemResponse)
  }

  // @@protoc_insertion_point(class_scope:cart.client.modules.distancetoredemption.D2RItemResponse)
  private static final cart.client.modules.distancetoredemption.D2RItemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.modules.distancetoredemption.D2RItemResponse();
  }

  public static cart.client.modules.distancetoredemption.D2RItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<D2RItemResponse>
      PARSER = new com.google.protobuf.AbstractParser<D2RItemResponse>() {
    public D2RItemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new D2RItemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<D2RItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<D2RItemResponse> getParserForType() {
    return PARSER;
  }

  public cart.client.modules.distancetoredemption.D2RItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

