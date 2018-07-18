// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/ExchangeServiceabilityStatus.proto

package cart.client.modules.serviceability;

/**
 * Protobuf type {@code cart.client.modules.serviceability.ExchangeServiceabilityStatus}
 */
public  final class ExchangeServiceabilityStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.modules.serviceability.ExchangeServiceabilityStatus)
    ExchangeServiceabilityStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExchangeServiceabilityStatus.newBuilder() to construct.
  private ExchangeServiceabilityStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExchangeServiceabilityStatus() {
    current_ = false;
    previous_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExchangeServiceabilityStatus(
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

            current_ = input.readBool();
            break;
          }
          case 16: {

            previous_ = input.readBool();
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
    return cart.client.modules.serviceability.ExchangeServiceabilityStatusOuterClass.internal_static_cart_client_modules_serviceability_ExchangeServiceabilityStatus_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.modules.serviceability.ExchangeServiceabilityStatusOuterClass.internal_static_cart_client_modules_serviceability_ExchangeServiceabilityStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.modules.serviceability.ExchangeServiceabilityStatus.class, cart.client.modules.serviceability.ExchangeServiceabilityStatus.Builder.class);
  }

  public static final int CURRENT_FIELD_NUMBER = 1;
  private boolean current_;
  /**
   * <code>bool current = 1;</code>
   */
  public boolean getCurrent() {
    return current_;
  }

  public static final int PREVIOUS_FIELD_NUMBER = 2;
  private boolean previous_;
  /**
   * <code>bool previous = 2;</code>
   */
  public boolean getPrevious() {
    return previous_;
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
    if (current_ != false) {
      output.writeBool(1, current_);
    }
    if (previous_ != false) {
      output.writeBool(2, previous_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (current_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, current_);
    }
    if (previous_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, previous_);
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
    if (!(obj instanceof cart.client.modules.serviceability.ExchangeServiceabilityStatus)) {
      return super.equals(obj);
    }
    cart.client.modules.serviceability.ExchangeServiceabilityStatus other = (cart.client.modules.serviceability.ExchangeServiceabilityStatus) obj;

    boolean result = true;
    result = result && (getCurrent()
        == other.getCurrent());
    result = result && (getPrevious()
        == other.getPrevious());
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
    hash = (37 * hash) + CURRENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCurrent());
    hash = (37 * hash) + PREVIOUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrevious());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus parseFrom(
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
  public static Builder newBuilder(cart.client.modules.serviceability.ExchangeServiceabilityStatus prototype) {
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
   * Protobuf type {@code cart.client.modules.serviceability.ExchangeServiceabilityStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.modules.serviceability.ExchangeServiceabilityStatus)
      cart.client.modules.serviceability.ExchangeServiceabilityStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.modules.serviceability.ExchangeServiceabilityStatusOuterClass.internal_static_cart_client_modules_serviceability_ExchangeServiceabilityStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.modules.serviceability.ExchangeServiceabilityStatusOuterClass.internal_static_cart_client_modules_serviceability_ExchangeServiceabilityStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.modules.serviceability.ExchangeServiceabilityStatus.class, cart.client.modules.serviceability.ExchangeServiceabilityStatus.Builder.class);
    }

    // Construct using cart.client.modules.serviceability.ExchangeServiceabilityStatus.newBuilder()
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
      current_ = false;

      previous_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.modules.serviceability.ExchangeServiceabilityStatusOuterClass.internal_static_cart_client_modules_serviceability_ExchangeServiceabilityStatus_descriptor;
    }

    public cart.client.modules.serviceability.ExchangeServiceabilityStatus getDefaultInstanceForType() {
      return cart.client.modules.serviceability.ExchangeServiceabilityStatus.getDefaultInstance();
    }

    public cart.client.modules.serviceability.ExchangeServiceabilityStatus build() {
      cart.client.modules.serviceability.ExchangeServiceabilityStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.modules.serviceability.ExchangeServiceabilityStatus buildPartial() {
      cart.client.modules.serviceability.ExchangeServiceabilityStatus result = new cart.client.modules.serviceability.ExchangeServiceabilityStatus(this);
      result.current_ = current_;
      result.previous_ = previous_;
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
      if (other instanceof cart.client.modules.serviceability.ExchangeServiceabilityStatus) {
        return mergeFrom((cart.client.modules.serviceability.ExchangeServiceabilityStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.modules.serviceability.ExchangeServiceabilityStatus other) {
      if (other == cart.client.modules.serviceability.ExchangeServiceabilityStatus.getDefaultInstance()) return this;
      if (other.getCurrent() != false) {
        setCurrent(other.getCurrent());
      }
      if (other.getPrevious() != false) {
        setPrevious(other.getPrevious());
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
      cart.client.modules.serviceability.ExchangeServiceabilityStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.modules.serviceability.ExchangeServiceabilityStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean current_ ;
    /**
     * <code>bool current = 1;</code>
     */
    public boolean getCurrent() {
      return current_;
    }
    /**
     * <code>bool current = 1;</code>
     */
    public Builder setCurrent(boolean value) {
      
      current_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool current = 1;</code>
     */
    public Builder clearCurrent() {
      
      current_ = false;
      onChanged();
      return this;
    }

    private boolean previous_ ;
    /**
     * <code>bool previous = 2;</code>
     */
    public boolean getPrevious() {
      return previous_;
    }
    /**
     * <code>bool previous = 2;</code>
     */
    public Builder setPrevious(boolean value) {
      
      previous_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool previous = 2;</code>
     */
    public Builder clearPrevious() {
      
      previous_ = false;
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


    // @@protoc_insertion_point(builder_scope:cart.client.modules.serviceability.ExchangeServiceabilityStatus)
  }

  // @@protoc_insertion_point(class_scope:cart.client.modules.serviceability.ExchangeServiceabilityStatus)
  private static final cart.client.modules.serviceability.ExchangeServiceabilityStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.modules.serviceability.ExchangeServiceabilityStatus();
  }

  public static cart.client.modules.serviceability.ExchangeServiceabilityStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExchangeServiceabilityStatus>
      PARSER = new com.google.protobuf.AbstractParser<ExchangeServiceabilityStatus>() {
    public ExchangeServiceabilityStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExchangeServiceabilityStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExchangeServiceabilityStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExchangeServiceabilityStatus> getParserForType() {
    return PARSER;
  }

  public cart.client.modules.serviceability.ExchangeServiceabilityStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
