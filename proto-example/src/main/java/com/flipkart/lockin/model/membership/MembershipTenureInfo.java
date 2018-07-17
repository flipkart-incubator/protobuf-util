// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/flipkart/lockin/model/membership/MembershipTenureInfo.proto

package com.flipkart.lockin.model.membership;

/**
 * Protobuf type {@code com.flipkart.lockin.model.membership.MembershipTenureInfo}
 */
public  final class MembershipTenureInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.flipkart.lockin.model.membership.MembershipTenureInfo)
    MembershipTenureInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MembershipTenureInfo.newBuilder() to construct.
  private MembershipTenureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MembershipTenureInfo() {
    tier_ = 0;
    start_ = "";
    end_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MembershipTenureInfo(
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

            tier_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            start_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            end_ = s;
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
    return com.flipkart.lockin.model.membership.MembershipTenureInfoOuterClass.internal_static_com_flipkart_lockin_model_membership_MembershipTenureInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.flipkart.lockin.model.membership.MembershipTenureInfoOuterClass.internal_static_com_flipkart_lockin_model_membership_MembershipTenureInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.flipkart.lockin.model.membership.MembershipTenureInfo.class, com.flipkart.lockin.model.membership.MembershipTenureInfo.Builder.class);
  }

  public static final int TIER_FIELD_NUMBER = 1;
  private int tier_;
  /**
   * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
   */
  public int getTierValue() {
    return tier_;
  }
  /**
   * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
   */
  public com.flipkart.lockin.enums.Tier getTier() {
    com.flipkart.lockin.enums.Tier result = com.flipkart.lockin.enums.Tier.valueOf(tier_);
    return result == null ? com.flipkart.lockin.enums.Tier.UNRECOGNIZED : result;
  }

  public static final int START_FIELD_NUMBER = 2;
  private volatile java.lang.Object start_;
  /**
   * <code>string start = 2;</code>
   */
  public java.lang.String getStart() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      start_ = s;
      return s;
    }
  }
  /**
   * <code>string start = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStartBytes() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      start_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_FIELD_NUMBER = 3;
  private volatile java.lang.Object end_;
  /**
   * <code>string end = 3;</code>
   */
  public java.lang.String getEnd() {
    java.lang.Object ref = end_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      end_ = s;
      return s;
    }
  }
  /**
   * <code>string end = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEndBytes() {
    java.lang.Object ref = end_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      end_ = b;
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
    if (tier_ != com.flipkart.lockin.enums.Tier.DEFAULT.getNumber()) {
      output.writeEnum(1, tier_);
    }
    if (!getStartBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, start_);
    }
    if (!getEndBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, end_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tier_ != com.flipkart.lockin.enums.Tier.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, tier_);
    }
    if (!getStartBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, start_);
    }
    if (!getEndBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, end_);
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
    if (!(obj instanceof com.flipkart.lockin.model.membership.MembershipTenureInfo)) {
      return super.equals(obj);
    }
    com.flipkart.lockin.model.membership.MembershipTenureInfo other = (com.flipkart.lockin.model.membership.MembershipTenureInfo) obj;

    boolean result = true;
    result = result && tier_ == other.tier_;
    result = result && getStart()
        .equals(other.getStart());
    result = result && getEnd()
        .equals(other.getEnd());
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
    hash = (37 * hash) + TIER_FIELD_NUMBER;
    hash = (53 * hash) + tier_;
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart().hashCode();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkart.lockin.model.membership.MembershipTenureInfo parseFrom(
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
  public static Builder newBuilder(com.flipkart.lockin.model.membership.MembershipTenureInfo prototype) {
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
   * Protobuf type {@code com.flipkart.lockin.model.membership.MembershipTenureInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.flipkart.lockin.model.membership.MembershipTenureInfo)
      com.flipkart.lockin.model.membership.MembershipTenureInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.flipkart.lockin.model.membership.MembershipTenureInfoOuterClass.internal_static_com_flipkart_lockin_model_membership_MembershipTenureInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.flipkart.lockin.model.membership.MembershipTenureInfoOuterClass.internal_static_com_flipkart_lockin_model_membership_MembershipTenureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.flipkart.lockin.model.membership.MembershipTenureInfo.class, com.flipkart.lockin.model.membership.MembershipTenureInfo.Builder.class);
    }

    // Construct using com.flipkart.lockin.model.membership.MembershipTenureInfo.newBuilder()
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
      tier_ = 0;

      start_ = "";

      end_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.flipkart.lockin.model.membership.MembershipTenureInfoOuterClass.internal_static_com_flipkart_lockin_model_membership_MembershipTenureInfo_descriptor;
    }

    public com.flipkart.lockin.model.membership.MembershipTenureInfo getDefaultInstanceForType() {
      return com.flipkart.lockin.model.membership.MembershipTenureInfo.getDefaultInstance();
    }

    public com.flipkart.lockin.model.membership.MembershipTenureInfo build() {
      com.flipkart.lockin.model.membership.MembershipTenureInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.flipkart.lockin.model.membership.MembershipTenureInfo buildPartial() {
      com.flipkart.lockin.model.membership.MembershipTenureInfo result = new com.flipkart.lockin.model.membership.MembershipTenureInfo(this);
      result.tier_ = tier_;
      result.start_ = start_;
      result.end_ = end_;
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
      if (other instanceof com.flipkart.lockin.model.membership.MembershipTenureInfo) {
        return mergeFrom((com.flipkart.lockin.model.membership.MembershipTenureInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.flipkart.lockin.model.membership.MembershipTenureInfo other) {
      if (other == com.flipkart.lockin.model.membership.MembershipTenureInfo.getDefaultInstance()) return this;
      if (other.tier_ != 0) {
        setTierValue(other.getTierValue());
      }
      if (!other.getStart().isEmpty()) {
        start_ = other.start_;
        onChanged();
      }
      if (!other.getEnd().isEmpty()) {
        end_ = other.end_;
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
      com.flipkart.lockin.model.membership.MembershipTenureInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.flipkart.lockin.model.membership.MembershipTenureInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int tier_ = 0;
    /**
     * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
     */
    public int getTierValue() {
      return tier_;
    }
    /**
     * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
     */
    public Builder setTierValue(int value) {
      tier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
     */
    public com.flipkart.lockin.enums.Tier getTier() {
      com.flipkart.lockin.enums.Tier result = com.flipkart.lockin.enums.Tier.valueOf(tier_);
      return result == null ? com.flipkart.lockin.enums.Tier.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
     */
    public Builder setTier(com.flipkart.lockin.enums.Tier value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      tier_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.flipkart.lockin.enums.Tier tier = 1;</code>
     */
    public Builder clearTier() {
      
      tier_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object start_ = "";
    /**
     * <code>string start = 2;</code>
     */
    public java.lang.String getStart() {
      java.lang.Object ref = start_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        start_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string start = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStartBytes() {
      java.lang.Object ref = start_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        start_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string start = 2;</code>
     */
    public Builder setStart(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string start = 2;</code>
     */
    public Builder clearStart() {
      
      start_ = getDefaultInstance().getStart();
      onChanged();
      return this;
    }
    /**
     * <code>string start = 2;</code>
     */
    public Builder setStartBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      start_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object end_ = "";
    /**
     * <code>string end = 3;</code>
     */
    public java.lang.String getEnd() {
      java.lang.Object ref = end_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        end_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string end = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEndBytes() {
      java.lang.Object ref = end_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        end_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string end = 3;</code>
     */
    public Builder setEnd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string end = 3;</code>
     */
    public Builder clearEnd() {
      
      end_ = getDefaultInstance().getEnd();
      onChanged();
      return this;
    }
    /**
     * <code>string end = 3;</code>
     */
    public Builder setEndBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      end_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.flipkart.lockin.model.membership.MembershipTenureInfo)
  }

  // @@protoc_insertion_point(class_scope:com.flipkart.lockin.model.membership.MembershipTenureInfo)
  private static final com.flipkart.lockin.model.membership.MembershipTenureInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.flipkart.lockin.model.membership.MembershipTenureInfo();
  }

  public static com.flipkart.lockin.model.membership.MembershipTenureInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipTenureInfo>
      PARSER = new com.google.protobuf.AbstractParser<MembershipTenureInfo>() {
    public MembershipTenureInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MembershipTenureInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MembershipTenureInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipTenureInfo> getParserForType() {
    return PARSER;
  }

  public com.flipkart.lockin.model.membership.MembershipTenureInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

