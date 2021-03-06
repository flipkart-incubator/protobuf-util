// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/endpoints/common/meta/cart/UserInfo.proto

package cart.client.endpoints.common.meta.cart;

/**
 * Protobuf type {@code cart.client.endpoints.common.meta.cart.UserInfo}
 */
public  final class UserInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.endpoints.common.meta.cart.UserInfo)
    UserInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserInfo.newBuilder() to construct.
  private UserInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserInfo() {
    userRefId_ = "";
    userAssocType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserInfo(
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

            userRefId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userAssocType_ = s;
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
    return cart.client.endpoints.common.meta.cart.UserInfoOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.endpoints.common.meta.cart.UserInfoOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.endpoints.common.meta.cart.UserInfo.class, cart.client.endpoints.common.meta.cart.UserInfo.Builder.class);
  }

  public static final int USERREFID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userRefId_;
  /**
   * <code>string userRefId = 1;</code>
   */
  public java.lang.String getUserRefId() {
    java.lang.Object ref = userRefId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userRefId_ = s;
      return s;
    }
  }
  /**
   * <code>string userRefId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserRefIdBytes() {
    java.lang.Object ref = userRefId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userRefId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERASSOCTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object userAssocType_;
  /**
   * <code>string userAssocType = 2;</code>
   */
  public java.lang.String getUserAssocType() {
    java.lang.Object ref = userAssocType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAssocType_ = s;
      return s;
    }
  }
  /**
   * <code>string userAssocType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserAssocTypeBytes() {
    java.lang.Object ref = userAssocType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userAssocType_ = b;
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
    if (!getUserRefIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userRefId_);
    }
    if (!getUserAssocTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userAssocType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserRefIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userRefId_);
    }
    if (!getUserAssocTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userAssocType_);
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
    if (!(obj instanceof cart.client.endpoints.common.meta.cart.UserInfo)) {
      return super.equals(obj);
    }
    cart.client.endpoints.common.meta.cart.UserInfo other = (cart.client.endpoints.common.meta.cart.UserInfo) obj;

    boolean result = true;
    result = result && getUserRefId()
        .equals(other.getUserRefId());
    result = result && getUserAssocType()
        .equals(other.getUserAssocType());
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
    hash = (37 * hash) + USERREFID_FIELD_NUMBER;
    hash = (53 * hash) + getUserRefId().hashCode();
    hash = (37 * hash) + USERASSOCTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getUserAssocType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cart.UserInfo parseFrom(
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
  public static Builder newBuilder(cart.client.endpoints.common.meta.cart.UserInfo prototype) {
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
   * Protobuf type {@code cart.client.endpoints.common.meta.cart.UserInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.endpoints.common.meta.cart.UserInfo)
      cart.client.endpoints.common.meta.cart.UserInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.endpoints.common.meta.cart.UserInfoOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.endpoints.common.meta.cart.UserInfoOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.endpoints.common.meta.cart.UserInfo.class, cart.client.endpoints.common.meta.cart.UserInfo.Builder.class);
    }

    // Construct using cart.client.endpoints.common.meta.cart.UserInfo.newBuilder()
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
      userRefId_ = "";

      userAssocType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.endpoints.common.meta.cart.UserInfoOuterClass.internal_static_cart_client_endpoints_common_meta_cart_UserInfo_descriptor;
    }

    public cart.client.endpoints.common.meta.cart.UserInfo getDefaultInstanceForType() {
      return cart.client.endpoints.common.meta.cart.UserInfo.getDefaultInstance();
    }

    public cart.client.endpoints.common.meta.cart.UserInfo build() {
      cart.client.endpoints.common.meta.cart.UserInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.endpoints.common.meta.cart.UserInfo buildPartial() {
      cart.client.endpoints.common.meta.cart.UserInfo result = new cart.client.endpoints.common.meta.cart.UserInfo(this);
      result.userRefId_ = userRefId_;
      result.userAssocType_ = userAssocType_;
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
      if (other instanceof cart.client.endpoints.common.meta.cart.UserInfo) {
        return mergeFrom((cart.client.endpoints.common.meta.cart.UserInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.endpoints.common.meta.cart.UserInfo other) {
      if (other == cart.client.endpoints.common.meta.cart.UserInfo.getDefaultInstance()) return this;
      if (!other.getUserRefId().isEmpty()) {
        userRefId_ = other.userRefId_;
        onChanged();
      }
      if (!other.getUserAssocType().isEmpty()) {
        userAssocType_ = other.userAssocType_;
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
      cart.client.endpoints.common.meta.cart.UserInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.endpoints.common.meta.cart.UserInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userRefId_ = "";
    /**
     * <code>string userRefId = 1;</code>
     */
    public java.lang.String getUserRefId() {
      java.lang.Object ref = userRefId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userRefId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userRefId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserRefIdBytes() {
      java.lang.Object ref = userRefId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userRefId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userRefId = 1;</code>
     */
    public Builder setUserRefId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userRefId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userRefId = 1;</code>
     */
    public Builder clearUserRefId() {
      
      userRefId_ = getDefaultInstance().getUserRefId();
      onChanged();
      return this;
    }
    /**
     * <code>string userRefId = 1;</code>
     */
    public Builder setUserRefIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userRefId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userAssocType_ = "";
    /**
     * <code>string userAssocType = 2;</code>
     */
    public java.lang.String getUserAssocType() {
      java.lang.Object ref = userAssocType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAssocType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userAssocType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserAssocTypeBytes() {
      java.lang.Object ref = userAssocType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userAssocType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userAssocType = 2;</code>
     */
    public Builder setUserAssocType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userAssocType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userAssocType = 2;</code>
     */
    public Builder clearUserAssocType() {
      
      userAssocType_ = getDefaultInstance().getUserAssocType();
      onChanged();
      return this;
    }
    /**
     * <code>string userAssocType = 2;</code>
     */
    public Builder setUserAssocTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userAssocType_ = value;
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


    // @@protoc_insertion_point(builder_scope:cart.client.endpoints.common.meta.cart.UserInfo)
  }

  // @@protoc_insertion_point(class_scope:cart.client.endpoints.common.meta.cart.UserInfo)
  private static final cart.client.endpoints.common.meta.cart.UserInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.endpoints.common.meta.cart.UserInfo();
  }

  public static cart.client.endpoints.common.meta.cart.UserInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserInfo>() {
    public UserInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserInfo> getParserForType() {
    return PARSER;
  }

  public cart.client.endpoints.common.meta.cart.UserInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

