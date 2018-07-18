// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/enums/AttachRestrictionReason.proto

package cart.client.modules.disbursal.enums;

/**
 * Protobuf enum {@code cart.client.modules.disbursal.enums.AttachRestrictionReason}
 */
public enum AttachRestrictionReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOT_APPLICABLE = 0;</code>
   */
  NOT_APPLICABLE(0),
  /**
   * <code>VAS = 1;</code>
   */
  VAS(1),
  /**
   * <code>SINGLE_PRODUCT_OFFER = 2;</code>
   */
  SINGLE_PRODUCT_OFFER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOT_APPLICABLE = 0;</code>
   */
  public static final int NOT_APPLICABLE_VALUE = 0;
  /**
   * <code>VAS = 1;</code>
   */
  public static final int VAS_VALUE = 1;
  /**
   * <code>SINGLE_PRODUCT_OFFER = 2;</code>
   */
  public static final int SINGLE_PRODUCT_OFFER_VALUE = 2;


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
  public static AttachRestrictionReason valueOf(int value) {
    return forNumber(value);
  }

  public static AttachRestrictionReason forNumber(int value) {
    switch (value) {
      case 0: return NOT_APPLICABLE;
      case 1: return VAS;
      case 2: return SINGLE_PRODUCT_OFFER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AttachRestrictionReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AttachRestrictionReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AttachRestrictionReason>() {
          public AttachRestrictionReason findValueByNumber(int number) {
            return AttachRestrictionReason.forNumber(number);
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
    return cart.client.modules.disbursal.enums.AttachRestrictionReasonOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final AttachRestrictionReason[] VALUES = values();

  public static AttachRestrictionReason valueOf(
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

  private AttachRestrictionReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.disbursal.enums.AttachRestrictionReason)
}
