// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/enums/DisbursalChargeNameEnum.proto

package cart.client.modules.disbursal.enums;

/**
 * Protobuf enum {@code cart.client.modules.disbursal.enums.DisbursalChargeNameEnum}
 */
public enum DisbursalChargeNameEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PICKUP_CHARGE = 0;</code>
   */
  PICKUP_CHARGE(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PICKUP_CHARGE = 0;</code>
   */
  public static final int PICKUP_CHARGE_VALUE = 0;


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
  public static DisbursalChargeNameEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DisbursalChargeNameEnum forNumber(int value) {
    switch (value) {
      case 0: return PICKUP_CHARGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DisbursalChargeNameEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DisbursalChargeNameEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DisbursalChargeNameEnum>() {
          public DisbursalChargeNameEnum findValueByNumber(int number) {
            return DisbursalChargeNameEnum.forNumber(number);
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
    return cart.client.modules.disbursal.enums.DisbursalChargeNameEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DisbursalChargeNameEnum[] VALUES = values();

  public static DisbursalChargeNameEnum valueOf(
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

  private DisbursalChargeNameEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.disbursal.enums.DisbursalChargeNameEnum)
}

