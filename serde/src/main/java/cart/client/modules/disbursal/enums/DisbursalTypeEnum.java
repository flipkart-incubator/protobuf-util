// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/enums/DisbursalTypeEnum.proto

package cart.client.modules.disbursal.enums;

/**
 * Protobuf enum {@code cart.client.modules.disbursal.enums.DisbursalTypeEnum}
 */
public enum DisbursalTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CHARGE = 0;</code>
   */
  CHARGE(0),
  /**
   * <code>DISCOUNT = 1;</code>
   */
  DISCOUNT(1),
  /**
   * <code>FREEBIE = 2;</code>
   */
  FREEBIE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CHARGE = 0;</code>
   */
  public static final int CHARGE_VALUE = 0;
  /**
   * <code>DISCOUNT = 1;</code>
   */
  public static final int DISCOUNT_VALUE = 1;
  /**
   * <code>FREEBIE = 2;</code>
   */
  public static final int FREEBIE_VALUE = 2;


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
  public static DisbursalTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DisbursalTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return CHARGE;
      case 1: return DISCOUNT;
      case 2: return FREEBIE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DisbursalTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DisbursalTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DisbursalTypeEnum>() {
          public DisbursalTypeEnum findValueByNumber(int number) {
            return DisbursalTypeEnum.forNumber(number);
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
    return cart.client.modules.disbursal.enums.DisbursalTypeEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DisbursalTypeEnum[] VALUES = values();

  public static DisbursalTypeEnum valueOf(
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

  private DisbursalTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.disbursal.enums.DisbursalTypeEnum)
}
