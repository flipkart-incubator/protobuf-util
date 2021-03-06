// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/Tag.proto

package cart.client.modules.serviceability;

/**
 * Protobuf type {@code cart.client.modules.serviceability.Tag}
 */
public  final class Tag extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.modules.serviceability.Tag)
    TagOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Tag.newBuilder() to construct.
  private Tag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Tag() {
    cocCode_ = "";
    routeCode_ = "";
    slotTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Tag(
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

            cocCode_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            routeCode_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            slotTime_ = s;
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
    return cart.client.modules.serviceability.TagOuterClass.internal_static_cart_client_modules_serviceability_Tag_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.modules.serviceability.TagOuterClass.internal_static_cart_client_modules_serviceability_Tag_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.modules.serviceability.Tag.class, cart.client.modules.serviceability.Tag.Builder.class);
  }

  public static final int COCCODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object cocCode_;
  /**
   * <code>string cocCode = 1;</code>
   */
  public java.lang.String getCocCode() {
    java.lang.Object ref = cocCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cocCode_ = s;
      return s;
    }
  }
  /**
   * <code>string cocCode = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCocCodeBytes() {
    java.lang.Object ref = cocCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cocCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUTECODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object routeCode_;
  /**
   * <code>string routeCode = 2;</code>
   */
  public java.lang.String getRouteCode() {
    java.lang.Object ref = routeCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      routeCode_ = s;
      return s;
    }
  }
  /**
   * <code>string routeCode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRouteCodeBytes() {
    java.lang.Object ref = routeCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      routeCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SLOTTIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object slotTime_;
  /**
   * <code>string slotTime = 3;</code>
   */
  public java.lang.String getSlotTime() {
    java.lang.Object ref = slotTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      slotTime_ = s;
      return s;
    }
  }
  /**
   * <code>string slotTime = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSlotTimeBytes() {
    java.lang.Object ref = slotTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      slotTime_ = b;
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
    if (!getCocCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cocCode_);
    }
    if (!getRouteCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, routeCode_);
    }
    if (!getSlotTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, slotTime_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCocCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cocCode_);
    }
    if (!getRouteCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, routeCode_);
    }
    if (!getSlotTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, slotTime_);
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
    if (!(obj instanceof cart.client.modules.serviceability.Tag)) {
      return super.equals(obj);
    }
    cart.client.modules.serviceability.Tag other = (cart.client.modules.serviceability.Tag) obj;

    boolean result = true;
    result = result && getCocCode()
        .equals(other.getCocCode());
    result = result && getRouteCode()
        .equals(other.getRouteCode());
    result = result && getSlotTime()
        .equals(other.getSlotTime());
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
    hash = (37 * hash) + COCCODE_FIELD_NUMBER;
    hash = (53 * hash) + getCocCode().hashCode();
    hash = (37 * hash) + ROUTECODE_FIELD_NUMBER;
    hash = (53 * hash) + getRouteCode().hashCode();
    hash = (37 * hash) + SLOTTIME_FIELD_NUMBER;
    hash = (53 * hash) + getSlotTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.modules.serviceability.Tag parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.serviceability.Tag parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.Tag parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.Tag parseFrom(
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
  public static Builder newBuilder(cart.client.modules.serviceability.Tag prototype) {
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
   * Protobuf type {@code cart.client.modules.serviceability.Tag}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.modules.serviceability.Tag)
      cart.client.modules.serviceability.TagOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.modules.serviceability.TagOuterClass.internal_static_cart_client_modules_serviceability_Tag_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.modules.serviceability.TagOuterClass.internal_static_cart_client_modules_serviceability_Tag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.modules.serviceability.Tag.class, cart.client.modules.serviceability.Tag.Builder.class);
    }

    // Construct using cart.client.modules.serviceability.Tag.newBuilder()
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
      cocCode_ = "";

      routeCode_ = "";

      slotTime_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.modules.serviceability.TagOuterClass.internal_static_cart_client_modules_serviceability_Tag_descriptor;
    }

    public cart.client.modules.serviceability.Tag getDefaultInstanceForType() {
      return cart.client.modules.serviceability.Tag.getDefaultInstance();
    }

    public cart.client.modules.serviceability.Tag build() {
      cart.client.modules.serviceability.Tag result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.modules.serviceability.Tag buildPartial() {
      cart.client.modules.serviceability.Tag result = new cart.client.modules.serviceability.Tag(this);
      result.cocCode_ = cocCode_;
      result.routeCode_ = routeCode_;
      result.slotTime_ = slotTime_;
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
      if (other instanceof cart.client.modules.serviceability.Tag) {
        return mergeFrom((cart.client.modules.serviceability.Tag)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.modules.serviceability.Tag other) {
      if (other == cart.client.modules.serviceability.Tag.getDefaultInstance()) return this;
      if (!other.getCocCode().isEmpty()) {
        cocCode_ = other.cocCode_;
        onChanged();
      }
      if (!other.getRouteCode().isEmpty()) {
        routeCode_ = other.routeCode_;
        onChanged();
      }
      if (!other.getSlotTime().isEmpty()) {
        slotTime_ = other.slotTime_;
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
      cart.client.modules.serviceability.Tag parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.modules.serviceability.Tag) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cocCode_ = "";
    /**
     * <code>string cocCode = 1;</code>
     */
    public java.lang.String getCocCode() {
      java.lang.Object ref = cocCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cocCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cocCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCocCodeBytes() {
      java.lang.Object ref = cocCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cocCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cocCode = 1;</code>
     */
    public Builder setCocCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cocCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cocCode = 1;</code>
     */
    public Builder clearCocCode() {
      
      cocCode_ = getDefaultInstance().getCocCode();
      onChanged();
      return this;
    }
    /**
     * <code>string cocCode = 1;</code>
     */
    public Builder setCocCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cocCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object routeCode_ = "";
    /**
     * <code>string routeCode = 2;</code>
     */
    public java.lang.String getRouteCode() {
      java.lang.Object ref = routeCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        routeCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string routeCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRouteCodeBytes() {
      java.lang.Object ref = routeCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        routeCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string routeCode = 2;</code>
     */
    public Builder setRouteCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      routeCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string routeCode = 2;</code>
     */
    public Builder clearRouteCode() {
      
      routeCode_ = getDefaultInstance().getRouteCode();
      onChanged();
      return this;
    }
    /**
     * <code>string routeCode = 2;</code>
     */
    public Builder setRouteCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      routeCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object slotTime_ = "";
    /**
     * <code>string slotTime = 3;</code>
     */
    public java.lang.String getSlotTime() {
      java.lang.Object ref = slotTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        slotTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string slotTime = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSlotTimeBytes() {
      java.lang.Object ref = slotTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        slotTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string slotTime = 3;</code>
     */
    public Builder setSlotTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      slotTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string slotTime = 3;</code>
     */
    public Builder clearSlotTime() {
      
      slotTime_ = getDefaultInstance().getSlotTime();
      onChanged();
      return this;
    }
    /**
     * <code>string slotTime = 3;</code>
     */
    public Builder setSlotTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      slotTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:cart.client.modules.serviceability.Tag)
  }

  // @@protoc_insertion_point(class_scope:cart.client.modules.serviceability.Tag)
  private static final cart.client.modules.serviceability.Tag DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.modules.serviceability.Tag();
  }

  public static cart.client.modules.serviceability.Tag getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Tag>
      PARSER = new com.google.protobuf.AbstractParser<Tag>() {
    public Tag parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Tag(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Tag> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Tag> getParserForType() {
    return PARSER;
  }

  public cart.client.modules.serviceability.Tag getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

