// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/flipkart/lockin/enums/MembershipStatus.proto

package com.flipkart.lockin.enums;

/**
 * Protobuf enum {@code com.flipkart.lockin.enums.MembershipStatus}
 */
public enum MembershipStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACTIVE = 0;</code>
   */
  ACTIVE(0),
  /**
   * <code>ACTIVATE_ELIGIBLE = 1;</code>
   */
  ACTIVATE_ELIGIBLE(1),
  /**
   * <code>INACTIVE = 2;</code>
   */
  INACTIVE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACTIVE = 0;</code>
   */
  public static final int ACTIVE_VALUE = 0;
  /**
   * <code>ACTIVATE_ELIGIBLE = 1;</code>
   */
  public static final int ACTIVATE_ELIGIBLE_VALUE = 1;
  /**
   * <code>INACTIVE = 2;</code>
   */
  public static final int INACTIVE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MembershipStatus valueOf(int value) {
    return forNumber(value);
  }

  public static MembershipStatus forNumber(int value) {
    switch (value) {
      case 0: return ACTIVE;
      case 1: return ACTIVATE_ELIGIBLE;
      case 2: return INACTIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MembershipStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MembershipStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MembershipStatus>() {
          public MembershipStatus findValueByNumber(int number) {
            return MembershipStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.flipkart.lockin.enums.MembershipStatusOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final MembershipStatus[] VALUES = values();

  public static MembershipStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MembershipStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.flipkart.lockin.enums.MembershipStatus)
}

