// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oneof/oneof.proto

package com.flipkart.protobuf.ext.example.oneof;

/**
 * Protobuf type {@code SampleMessage}
 */
public  final class SampleMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SampleMessage)
    SampleMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SampleMessage.newBuilder() to construct.
  private SampleMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SampleMessage() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SampleMessage(
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
            messageCase_ = 1;
            message_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            messageCase_ = 2;
            message_ = s;
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
    return com.flipkart.protobuf.ext.example.oneof.Oneof.internal_static_SampleMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.flipkart.protobuf.ext.example.oneof.Oneof.internal_static_SampleMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.flipkart.protobuf.ext.example.oneof.SampleMessage.class, com.flipkart.protobuf.ext.example.oneof.SampleMessage.Builder.class);
  }

  private int messageCase_ = 0;
  private java.lang.Object message_;
  public enum MessageCase
      implements com.google.protobuf.Internal.EnumLite {
    MESSAGE_1(1),
    MESSAGE_2(2),
    MESSAGE_NOT_SET(0);
    private final int value;
    private MessageCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static MessageCase forNumber(int value) {
      switch (value) {
        case 1: return MESSAGE_1;
        case 2: return MESSAGE_2;
        case 0: return MESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MessageCase
  getMessageCase() {
    return MessageCase.forNumber(
        messageCase_);
  }

  public static final int MESSAGE_1_FIELD_NUMBER = 1;
  /**
   * <code>string message_1 = 1;</code>
   */
  public java.lang.String getMessage1() {
    java.lang.Object ref = "";
    if (messageCase_ == 1) {
      ref = message_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (messageCase_ == 1) {
        message_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string message_1 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessage1Bytes() {
    java.lang.Object ref = "";
    if (messageCase_ == 1) {
      ref = message_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (messageCase_ == 1) {
        message_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_2_FIELD_NUMBER = 2;
  /**
   * <code>string message_2 = 2;</code>
   */
  public java.lang.String getMessage2() {
    java.lang.Object ref = "";
    if (messageCase_ == 2) {
      ref = message_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (messageCase_ == 2) {
        message_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string message_2 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessage2Bytes() {
    java.lang.Object ref = "";
    if (messageCase_ == 2) {
      ref = message_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (messageCase_ == 2) {
        message_ = b;
      }
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
    if (messageCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (messageCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (messageCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof com.flipkart.protobuf.ext.example.oneof.SampleMessage)) {
      return super.equals(obj);
    }
    com.flipkart.protobuf.ext.example.oneof.SampleMessage other = (com.flipkart.protobuf.ext.example.oneof.SampleMessage) obj;

    boolean result = true;
    result = result && getMessageCase().equals(
        other.getMessageCase());
    if (!result) return false;
    switch (messageCase_) {
      case 1:
        result = result && getMessage1()
            .equals(other.getMessage1());
        break;
      case 2:
        result = result && getMessage2()
            .equals(other.getMessage2());
        break;
      case 0:
      default:
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
    switch (messageCase_) {
      case 1:
        hash = (37 * hash) + MESSAGE_1_FIELD_NUMBER;
        hash = (53 * hash) + getMessage1().hashCode();
        break;
      case 2:
        hash = (37 * hash) + MESSAGE_2_FIELD_NUMBER;
        hash = (53 * hash) + getMessage2().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage parseFrom(
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
  public static Builder newBuilder(com.flipkart.protobuf.ext.example.oneof.SampleMessage prototype) {
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
   * Protobuf type {@code SampleMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SampleMessage)
      com.flipkart.protobuf.ext.example.oneof.SampleMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.flipkart.protobuf.ext.example.oneof.Oneof.internal_static_SampleMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.flipkart.protobuf.ext.example.oneof.Oneof.internal_static_SampleMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.flipkart.protobuf.ext.example.oneof.SampleMessage.class, com.flipkart.protobuf.ext.example.oneof.SampleMessage.Builder.class);
    }

    // Construct using com.flipkart.protobuf.ext.example.oneof.SampleMessage.newBuilder()
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
      messageCase_ = 0;
      message_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.flipkart.protobuf.ext.example.oneof.Oneof.internal_static_SampleMessage_descriptor;
    }

    public com.flipkart.protobuf.ext.example.oneof.SampleMessage getDefaultInstanceForType() {
      return com.flipkart.protobuf.ext.example.oneof.SampleMessage.getDefaultInstance();
    }

    public com.flipkart.protobuf.ext.example.oneof.SampleMessage build() {
      com.flipkart.protobuf.ext.example.oneof.SampleMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.flipkart.protobuf.ext.example.oneof.SampleMessage buildPartial() {
      com.flipkart.protobuf.ext.example.oneof.SampleMessage result = new com.flipkart.protobuf.ext.example.oneof.SampleMessage(this);
      if (messageCase_ == 1) {
        result.message_ = message_;
      }
      if (messageCase_ == 2) {
        result.message_ = message_;
      }
      result.messageCase_ = messageCase_;
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
      if (other instanceof com.flipkart.protobuf.ext.example.oneof.SampleMessage) {
        return mergeFrom((com.flipkart.protobuf.ext.example.oneof.SampleMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.flipkart.protobuf.ext.example.oneof.SampleMessage other) {
      if (other == com.flipkart.protobuf.ext.example.oneof.SampleMessage.getDefaultInstance()) return this;
      switch (other.getMessageCase()) {
        case MESSAGE_1: {
          messageCase_ = 1;
          message_ = other.message_;
          onChanged();
          break;
        }
        case MESSAGE_2: {
          messageCase_ = 2;
          message_ = other.message_;
          onChanged();
          break;
        }
        case MESSAGE_NOT_SET: {
          break;
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
      com.flipkart.protobuf.ext.example.oneof.SampleMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.flipkart.protobuf.ext.example.oneof.SampleMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int messageCase_ = 0;
    private java.lang.Object message_;
    public MessageCase
        getMessageCase() {
      return MessageCase.forNumber(
          messageCase_);
    }

    public Builder clearMessage() {
      messageCase_ = 0;
      message_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>string message_1 = 1;</code>
     */
    public java.lang.String getMessage1() {
      java.lang.Object ref = "";
      if (messageCase_ == 1) {
        ref = message_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (messageCase_ == 1) {
          message_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message_1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessage1Bytes() {
      java.lang.Object ref = "";
      if (messageCase_ == 1) {
        ref = message_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (messageCase_ == 1) {
          message_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message_1 = 1;</code>
     */
    public Builder setMessage1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  messageCase_ = 1;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message_1 = 1;</code>
     */
    public Builder clearMessage1() {
      if (messageCase_ == 1) {
        messageCase_ = 0;
        message_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string message_1 = 1;</code>
     */
    public Builder setMessage1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      messageCase_ = 1;
      message_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string message_2 = 2;</code>
     */
    public java.lang.String getMessage2() {
      java.lang.Object ref = "";
      if (messageCase_ == 2) {
        ref = message_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (messageCase_ == 2) {
          message_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message_2 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessage2Bytes() {
      java.lang.Object ref = "";
      if (messageCase_ == 2) {
        ref = message_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (messageCase_ == 2) {
          message_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message_2 = 2;</code>
     */
    public Builder setMessage2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  messageCase_ = 2;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message_2 = 2;</code>
     */
    public Builder clearMessage2() {
      if (messageCase_ == 2) {
        messageCase_ = 0;
        message_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string message_2 = 2;</code>
     */
    public Builder setMessage2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      messageCase_ = 2;
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:SampleMessage)
  }

  // @@protoc_insertion_point(class_scope:SampleMessage)
  private static final com.flipkart.protobuf.ext.example.oneof.SampleMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.flipkart.protobuf.ext.example.oneof.SampleMessage();
  }

  public static com.flipkart.protobuf.ext.example.oneof.SampleMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SampleMessage>
      PARSER = new com.google.protobuf.AbstractParser<SampleMessage>() {
    public SampleMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SampleMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SampleMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SampleMessage> getParserForType() {
    return PARSER;
  }

  public com.flipkart.protobuf.ext.example.oneof.SampleMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
