// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/PZDataBag.proto

package cart.client.modules.disbursal;

/**
 * Protobuf type {@code cart.client.modules.disbursal.PZDataBag}
 */
public  final class PZDataBag extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.modules.disbursal.PZDataBag)
    PZDataBagOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PZDataBag.newBuilder() to construct.
  private PZDataBag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PZDataBag() {
    pboOfferDetails_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PZDataBag(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              pboOfferDetails_ = new java.util.ArrayList<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail>();
              mutable_bitField0_ |= 0x00000001;
            }
            pboOfferDetails_.add(
                input.readMessage(cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        pboOfferDetails_ = java.util.Collections.unmodifiableList(pboOfferDetails_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cart.client.modules.disbursal.PZDataBagOuterClass.internal_static_cart_client_modules_disbursal_PZDataBag_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.modules.disbursal.PZDataBagOuterClass.internal_static_cart_client_modules_disbursal_PZDataBag_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.modules.disbursal.PZDataBag.class, cart.client.modules.disbursal.PZDataBag.Builder.class);
  }

  public static final int PBOOFFERDETAILS_FIELD_NUMBER = 1;
  private java.util.List<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail> pboOfferDetails_;
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
   */
  public java.util.List<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail> getPboOfferDetailsList() {
    return pboOfferDetails_;
  }
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
   */
  public java.util.List<? extends cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder> 
      getPboOfferDetailsOrBuilderList() {
    return pboOfferDetails_;
  }
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
   */
  public int getPboOfferDetailsCount() {
    return pboOfferDetails_.size();
  }
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
   */
  public cart.client.modules.disbursal.response.DisbursalPBOOfferDetail getPboOfferDetails(int index) {
    return pboOfferDetails_.get(index);
  }
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
   */
  public cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder getPboOfferDetailsOrBuilder(
      int index) {
    return pboOfferDetails_.get(index);
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
    for (int i = 0; i < pboOfferDetails_.size(); i++) {
      output.writeMessage(1, pboOfferDetails_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pboOfferDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pboOfferDetails_.get(i));
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
    if (!(obj instanceof cart.client.modules.disbursal.PZDataBag)) {
      return super.equals(obj);
    }
    cart.client.modules.disbursal.PZDataBag other = (cart.client.modules.disbursal.PZDataBag) obj;

    boolean result = true;
    result = result && getPboOfferDetailsList()
        .equals(other.getPboOfferDetailsList());
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
    if (getPboOfferDetailsCount() > 0) {
      hash = (37 * hash) + PBOOFFERDETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getPboOfferDetailsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.disbursal.PZDataBag parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.modules.disbursal.PZDataBag parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.modules.disbursal.PZDataBag parseFrom(
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
  public static Builder newBuilder(cart.client.modules.disbursal.PZDataBag prototype) {
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
   * Protobuf type {@code cart.client.modules.disbursal.PZDataBag}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.modules.disbursal.PZDataBag)
      cart.client.modules.disbursal.PZDataBagOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.modules.disbursal.PZDataBagOuterClass.internal_static_cart_client_modules_disbursal_PZDataBag_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.modules.disbursal.PZDataBagOuterClass.internal_static_cart_client_modules_disbursal_PZDataBag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.modules.disbursal.PZDataBag.class, cart.client.modules.disbursal.PZDataBag.Builder.class);
    }

    // Construct using cart.client.modules.disbursal.PZDataBag.newBuilder()
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
        getPboOfferDetailsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (pboOfferDetailsBuilder_ == null) {
        pboOfferDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pboOfferDetailsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.modules.disbursal.PZDataBagOuterClass.internal_static_cart_client_modules_disbursal_PZDataBag_descriptor;
    }

    public cart.client.modules.disbursal.PZDataBag getDefaultInstanceForType() {
      return cart.client.modules.disbursal.PZDataBag.getDefaultInstance();
    }

    public cart.client.modules.disbursal.PZDataBag build() {
      cart.client.modules.disbursal.PZDataBag result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.modules.disbursal.PZDataBag buildPartial() {
      cart.client.modules.disbursal.PZDataBag result = new cart.client.modules.disbursal.PZDataBag(this);
      int from_bitField0_ = bitField0_;
      if (pboOfferDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          pboOfferDetails_ = java.util.Collections.unmodifiableList(pboOfferDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pboOfferDetails_ = pboOfferDetails_;
      } else {
        result.pboOfferDetails_ = pboOfferDetailsBuilder_.build();
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
      if (other instanceof cart.client.modules.disbursal.PZDataBag) {
        return mergeFrom((cart.client.modules.disbursal.PZDataBag)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.modules.disbursal.PZDataBag other) {
      if (other == cart.client.modules.disbursal.PZDataBag.getDefaultInstance()) return this;
      if (pboOfferDetailsBuilder_ == null) {
        if (!other.pboOfferDetails_.isEmpty()) {
          if (pboOfferDetails_.isEmpty()) {
            pboOfferDetails_ = other.pboOfferDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePboOfferDetailsIsMutable();
            pboOfferDetails_.addAll(other.pboOfferDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.pboOfferDetails_.isEmpty()) {
          if (pboOfferDetailsBuilder_.isEmpty()) {
            pboOfferDetailsBuilder_.dispose();
            pboOfferDetailsBuilder_ = null;
            pboOfferDetails_ = other.pboOfferDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pboOfferDetailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPboOfferDetailsFieldBuilder() : null;
          } else {
            pboOfferDetailsBuilder_.addAllMessages(other.pboOfferDetails_);
          }
        }
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
      cart.client.modules.disbursal.PZDataBag parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.modules.disbursal.PZDataBag) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail> pboOfferDetails_ =
      java.util.Collections.emptyList();
    private void ensurePboOfferDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        pboOfferDetails_ = new java.util.ArrayList<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail>(pboOfferDetails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cart.client.modules.disbursal.response.DisbursalPBOOfferDetail, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder, cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder> pboOfferDetailsBuilder_;

    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public java.util.List<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail> getPboOfferDetailsList() {
      if (pboOfferDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pboOfferDetails_);
      } else {
        return pboOfferDetailsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public int getPboOfferDetailsCount() {
      if (pboOfferDetailsBuilder_ == null) {
        return pboOfferDetails_.size();
      } else {
        return pboOfferDetailsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public cart.client.modules.disbursal.response.DisbursalPBOOfferDetail getPboOfferDetails(int index) {
      if (pboOfferDetailsBuilder_ == null) {
        return pboOfferDetails_.get(index);
      } else {
        return pboOfferDetailsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder setPboOfferDetails(
        int index, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail value) {
      if (pboOfferDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.set(index, value);
        onChanged();
      } else {
        pboOfferDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder setPboOfferDetails(
        int index, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder builderForValue) {
      if (pboOfferDetailsBuilder_ == null) {
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        pboOfferDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder addPboOfferDetails(cart.client.modules.disbursal.response.DisbursalPBOOfferDetail value) {
      if (pboOfferDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.add(value);
        onChanged();
      } else {
        pboOfferDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder addPboOfferDetails(
        int index, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail value) {
      if (pboOfferDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.add(index, value);
        onChanged();
      } else {
        pboOfferDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder addPboOfferDetails(
        cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder builderForValue) {
      if (pboOfferDetailsBuilder_ == null) {
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.add(builderForValue.build());
        onChanged();
      } else {
        pboOfferDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder addPboOfferDetails(
        int index, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder builderForValue) {
      if (pboOfferDetailsBuilder_ == null) {
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        pboOfferDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder addAllPboOfferDetails(
        java.lang.Iterable<? extends cart.client.modules.disbursal.response.DisbursalPBOOfferDetail> values) {
      if (pboOfferDetailsBuilder_ == null) {
        ensurePboOfferDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pboOfferDetails_);
        onChanged();
      } else {
        pboOfferDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder clearPboOfferDetails() {
      if (pboOfferDetailsBuilder_ == null) {
        pboOfferDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pboOfferDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public Builder removePboOfferDetails(int index) {
      if (pboOfferDetailsBuilder_ == null) {
        ensurePboOfferDetailsIsMutable();
        pboOfferDetails_.remove(index);
        onChanged();
      } else {
        pboOfferDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder getPboOfferDetailsBuilder(
        int index) {
      return getPboOfferDetailsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder getPboOfferDetailsOrBuilder(
        int index) {
      if (pboOfferDetailsBuilder_ == null) {
        return pboOfferDetails_.get(index);  } else {
        return pboOfferDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public java.util.List<? extends cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder> 
         getPboOfferDetailsOrBuilderList() {
      if (pboOfferDetailsBuilder_ != null) {
        return pboOfferDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pboOfferDetails_);
      }
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder addPboOfferDetailsBuilder() {
      return getPboOfferDetailsFieldBuilder().addBuilder(
          cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder addPboOfferDetailsBuilder(
        int index) {
      return getPboOfferDetailsFieldBuilder().addBuilder(
          index, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .cart.client.modules.disbursal.response.DisbursalPBOOfferDetail pboOfferDetails = 1;</code>
     */
    public java.util.List<cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder> 
         getPboOfferDetailsBuilderList() {
      return getPboOfferDetailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cart.client.modules.disbursal.response.DisbursalPBOOfferDetail, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder, cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder> 
        getPboOfferDetailsFieldBuilder() {
      if (pboOfferDetailsBuilder_ == null) {
        pboOfferDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cart.client.modules.disbursal.response.DisbursalPBOOfferDetail, cart.client.modules.disbursal.response.DisbursalPBOOfferDetail.Builder, cart.client.modules.disbursal.response.DisbursalPBOOfferDetailOrBuilder>(
                pboOfferDetails_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        pboOfferDetails_ = null;
      }
      return pboOfferDetailsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cart.client.modules.disbursal.PZDataBag)
  }

  // @@protoc_insertion_point(class_scope:cart.client.modules.disbursal.PZDataBag)
  private static final cart.client.modules.disbursal.PZDataBag DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.modules.disbursal.PZDataBag();
  }

  public static cart.client.modules.disbursal.PZDataBag getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PZDataBag>
      PARSER = new com.google.protobuf.AbstractParser<PZDataBag>() {
    public PZDataBag parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PZDataBag(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PZDataBag> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PZDataBag> getParserForType() {
    return PARSER;
  }

  public cart.client.modules.disbursal.PZDataBag getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
