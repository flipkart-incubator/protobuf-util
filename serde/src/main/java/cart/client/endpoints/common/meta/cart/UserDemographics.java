// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/endpoints/common/meta/cart/UserDemographics.proto

package cart.client.endpoints.common.meta.cart;

/**
 * Protobuf type {@code cart.client.endpoints.common.meta.cart.UserDemographics}
 */
public  final class UserDemographics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.endpoints.common.meta.cart.UserDemographics)
    UserDemographicsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserDemographics.newBuilder() to construct.
  private UserDemographics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserDemographics() {
    shippingPincode_ = "";
    ipAddress_ = "";
    userAgent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserDemographics(
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

            shippingPincode_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ipAddress_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userAgent_ = s;
            break;
          }
          case 34: {
            cart.client.endpoints.common.meta.cart.FulfillmentData.Builder subBuilder = null;
            if (fulfillmentData_ != null) {
              subBuilder = fulfillmentData_.toBuilder();
            }
            fulfillmentData_ = input.readMessage(cart.client.endpoints.common.meta.cart.FulfillmentData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fulfillmentData_);
              fulfillmentData_ = subBuilder.buildPartial();
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
    return cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserDemographics_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserDemographics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.endpoints.common.meta.cart.UserDemographics.class, cart.client.endpoints.common.meta.cart.UserDemographics.Builder.class);
  }

  public static final int SHIPPINGPINCODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object shippingPincode_;
  /**
   * <code>string shippingPincode = 1;</code>
   */
  public java.lang.String getShippingPincode() {
    java.lang.Object ref = shippingPincode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shippingPincode_ = s;
      return s;
    }
  }
  /**
   * <code>string shippingPincode = 1;</code>
   */
  public com.google.protobuf.ByteString
      getShippingPincodeBytes() {
    java.lang.Object ref = shippingPincode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shippingPincode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IPADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object ipAddress_;
  /**
   * <code>string ipAddress = 2;</code>
   */
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ipAddress = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERAGENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object userAgent_;
  /**
   * <code>string userAgent = 3;</code>
   */
  public java.lang.String getUserAgent() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAgent_ = s;
      return s;
    }
  }
  /**
   * <code>string userAgent = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserAgentBytes() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userAgent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FULFILLMENTDATA_FIELD_NUMBER = 4;
  private cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData_;
  /**
   * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
   */
  public boolean hasFulfillmentData() {
    return fulfillmentData_ != null;
  }
  /**
   * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
   */
  public cart.client.endpoints.common.meta.cart.FulfillmentData getFulfillmentData() {
    return fulfillmentData_ == null ? cart.client.endpoints.common.meta.cart.FulfillmentData.getDefaultInstance() : fulfillmentData_;
  }
  /**
   * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
   */
  public cart.client.endpoints.common.meta.cart.FulfillmentDataOrBuilder getFulfillmentDataOrBuilder() {
    return getFulfillmentData();
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
    if (!getShippingPincodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, shippingPincode_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ipAddress_);
    }
    if (!getUserAgentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userAgent_);
    }
    if (fulfillmentData_ != null) {
      output.writeMessage(4, getFulfillmentData());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getShippingPincodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, shippingPincode_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ipAddress_);
    }
    if (!getUserAgentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userAgent_);
    }
    if (fulfillmentData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFulfillmentData());
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
    if (!(obj instanceof cart.client.endpoints.common.meta.cart.UserDemographics)) {
      return super.equals(obj);
    }
    cart.client.endpoints.common.meta.cart.UserDemographics other = (cart.client.endpoints.common.meta.cart.UserDemographics) obj;

    boolean result = true;
    result = result && getShippingPincode()
        .equals(other.getShippingPincode());
    result = result && getIpAddress()
        .equals(other.getIpAddress());
    result = result && getUserAgent()
        .equals(other.getUserAgent());
    result = result && (hasFulfillmentData() == other.hasFulfillmentData());
    if (hasFulfillmentData()) {
      result = result && getFulfillmentData()
          .equals(other.getFulfillmentData());
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
    hash = (37 * hash) + SHIPPINGPINCODE_FIELD_NUMBER;
    hash = (53 * hash) + getShippingPincode().hashCode();
    hash = (37 * hash) + IPADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + USERAGENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserAgent().hashCode();
    if (hasFulfillmentData()) {
      hash = (37 * hash) + FULFILLMENTDATA_FIELD_NUMBER;
      hash = (53 * hash) + getFulfillmentData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cart.UserDemographics parseFrom(
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
  public static Builder newBuilder(cart.client.endpoints.common.meta.cart.UserDemographics prototype) {
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
   * Protobuf type {@code cart.client.endpoints.common.meta.cart.UserDemographics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.endpoints.common.meta.cart.UserDemographics)
      cart.client.endpoints.common.meta.cart.UserDemographicsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserDemographics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserDemographics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.endpoints.common.meta.cart.UserDemographics.class, cart.client.endpoints.common.meta.cart.UserDemographics.Builder.class);
    }

    // Construct using cart.client.endpoints.common.meta.cart.UserDemographics.newBuilder()
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
      shippingPincode_ = "";

      ipAddress_ = "";

      userAgent_ = "";

      if (fulfillmentDataBuilder_ == null) {
        fulfillmentData_ = null;
      } else {
        fulfillmentData_ = null;
        fulfillmentDataBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserDemographics_descriptor;
    }

    public cart.client.endpoints.common.meta.cart.UserDemographics getDefaultInstanceForType() {
      return cart.client.endpoints.common.meta.cart.UserDemographics.getDefaultInstance();
    }

    public cart.client.endpoints.common.meta.cart.UserDemographics build() {
      cart.client.endpoints.common.meta.cart.UserDemographics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.endpoints.common.meta.cart.UserDemographics buildPartial() {
      cart.client.endpoints.common.meta.cart.UserDemographics result = new cart.client.endpoints.common.meta.cart.UserDemographics(this);
      result.shippingPincode_ = shippingPincode_;
      result.ipAddress_ = ipAddress_;
      result.userAgent_ = userAgent_;
      if (fulfillmentDataBuilder_ == null) {
        result.fulfillmentData_ = fulfillmentData_;
      } else {
        result.fulfillmentData_ = fulfillmentDataBuilder_.build();
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
      if (other instanceof cart.client.endpoints.common.meta.cart.UserDemographics) {
        return mergeFrom((cart.client.endpoints.common.meta.cart.UserDemographics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.endpoints.common.meta.cart.UserDemographics other) {
      if (other == cart.client.endpoints.common.meta.cart.UserDemographics.getDefaultInstance()) return this;
      if (!other.getShippingPincode().isEmpty()) {
        shippingPincode_ = other.shippingPincode_;
        onChanged();
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
      }
      if (!other.getUserAgent().isEmpty()) {
        userAgent_ = other.userAgent_;
        onChanged();
      }
      if (other.hasFulfillmentData()) {
        mergeFulfillmentData(other.getFulfillmentData());
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
      cart.client.endpoints.common.meta.cart.UserDemographics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.endpoints.common.meta.cart.UserDemographics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object shippingPincode_ = "";
    /**
     * <code>string shippingPincode = 1;</code>
     */
    public java.lang.String getShippingPincode() {
      java.lang.Object ref = shippingPincode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shippingPincode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shippingPincode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getShippingPincodeBytes() {
      java.lang.Object ref = shippingPincode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shippingPincode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shippingPincode = 1;</code>
     */
    public Builder setShippingPincode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      shippingPincode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string shippingPincode = 1;</code>
     */
    public Builder clearShippingPincode() {
      
      shippingPincode_ = getDefaultInstance().getShippingPincode();
      onChanged();
      return this;
    }
    /**
     * <code>string shippingPincode = 1;</code>
     */
    public Builder setShippingPincodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      shippingPincode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <code>string ipAddress = 2;</code>
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipAddress = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipAddress = 2;</code>
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipAddress = 2;</code>
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string ipAddress = 2;</code>
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userAgent_ = "";
    /**
     * <code>string userAgent = 3;</code>
     */
    public java.lang.String getUserAgent() {
      java.lang.Object ref = userAgent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAgent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userAgent = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserAgentBytes() {
      java.lang.Object ref = userAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userAgent = 3;</code>
     */
    public Builder setUserAgent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userAgent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userAgent = 3;</code>
     */
    public Builder clearUserAgent() {
      
      userAgent_ = getDefaultInstance().getUserAgent();
      onChanged();
      return this;
    }
    /**
     * <code>string userAgent = 3;</code>
     */
    public Builder setUserAgentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userAgent_ = value;
      onChanged();
      return this;
    }

    private cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cart.client.endpoints.common.meta.cart.FulfillmentData, cart.client.endpoints.common.meta.cart.FulfillmentData.Builder, cart.client.endpoints.common.meta.cart.FulfillmentDataOrBuilder> fulfillmentDataBuilder_;
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public boolean hasFulfillmentData() {
      return fulfillmentDataBuilder_ != null || fulfillmentData_ != null;
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public cart.client.endpoints.common.meta.cart.FulfillmentData getFulfillmentData() {
      if (fulfillmentDataBuilder_ == null) {
        return fulfillmentData_ == null ? cart.client.endpoints.common.meta.cart.FulfillmentData.getDefaultInstance() : fulfillmentData_;
      } else {
        return fulfillmentDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public Builder setFulfillmentData(cart.client.endpoints.common.meta.cart.FulfillmentData value) {
      if (fulfillmentDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fulfillmentData_ = value;
        onChanged();
      } else {
        fulfillmentDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public Builder setFulfillmentData(
        cart.client.endpoints.common.meta.cart.FulfillmentData.Builder builderForValue) {
      if (fulfillmentDataBuilder_ == null) {
        fulfillmentData_ = builderForValue.build();
        onChanged();
      } else {
        fulfillmentDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public Builder mergeFulfillmentData(cart.client.endpoints.common.meta.cart.FulfillmentData value) {
      if (fulfillmentDataBuilder_ == null) {
        if (fulfillmentData_ != null) {
          fulfillmentData_ =
            cart.client.endpoints.common.meta.cart.FulfillmentData.newBuilder(fulfillmentData_).mergeFrom(value).buildPartial();
        } else {
          fulfillmentData_ = value;
        }
        onChanged();
      } else {
        fulfillmentDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public Builder clearFulfillmentData() {
      if (fulfillmentDataBuilder_ == null) {
        fulfillmentData_ = null;
        onChanged();
      } else {
        fulfillmentData_ = null;
        fulfillmentDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public cart.client.endpoints.common.meta.cart.FulfillmentData.Builder getFulfillmentDataBuilder() {
      
      onChanged();
      return getFulfillmentDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    public cart.client.endpoints.common.meta.cart.FulfillmentDataOrBuilder getFulfillmentDataOrBuilder() {
      if (fulfillmentDataBuilder_ != null) {
        return fulfillmentDataBuilder_.getMessageOrBuilder();
      } else {
        return fulfillmentData_ == null ?
            cart.client.endpoints.common.meta.cart.FulfillmentData.getDefaultInstance() : fulfillmentData_;
      }
    }
    /**
     * <code>.cart.client.endpoints.common.meta.cart.FulfillmentData fulfillmentData = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cart.client.endpoints.common.meta.cart.FulfillmentData, cart.client.endpoints.common.meta.cart.FulfillmentData.Builder, cart.client.endpoints.common.meta.cart.FulfillmentDataOrBuilder> 
        getFulfillmentDataFieldBuilder() {
      if (fulfillmentDataBuilder_ == null) {
        fulfillmentDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cart.client.endpoints.common.meta.cart.FulfillmentData, cart.client.endpoints.common.meta.cart.FulfillmentData.Builder, cart.client.endpoints.common.meta.cart.FulfillmentDataOrBuilder>(
                getFulfillmentData(),
                getParentForChildren(),
                isClean());
        fulfillmentData_ = null;
      }
      return fulfillmentDataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cart.client.endpoints.common.meta.cart.UserDemographics)
  }

  // @@protoc_insertion_point(class_scope:cart.client.endpoints.common.meta.cart.UserDemographics)
  private static final cart.client.endpoints.common.meta.cart.UserDemographics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.endpoints.common.meta.cart.UserDemographics();
  }

  public static cart.client.endpoints.common.meta.cart.UserDemographics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserDemographics>
      PARSER = new com.google.protobuf.AbstractParser<UserDemographics>() {
    public UserDemographics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserDemographics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserDemographics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserDemographics> getParserForType() {
    return PARSER;
  }

  public cart.client.endpoints.common.meta.cart.UserDemographics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
