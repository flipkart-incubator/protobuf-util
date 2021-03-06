// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/enums/DisbursalCalculationTypeEnum.proto

package cart.client.modules.disbursal.enums;

/**
 * Protobuf enum {@code cart.client.modules.disbursal.enums.DisbursalCalculationTypeEnum}
 */
public enum DisbursalCalculationTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PERCENTAGE = 0;</code>
   */
  PERCENTAGE(0),
  /**
   * <code>FIXED = 1;</code>
   */
  FIXED(1),
  /**
   * <code>BASKET_ADDITION = 2;</code>
   */
  BASKET_ADDITION(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PERCENTAGE = 0;</code>
   */
  public static final int PERCENTAGE_VALUE = 0;
  /**
   * <code>FIXED = 1;</code>
   */
  public static final int FIXED_VALUE = 1;
  /**
   * <code>BASKET_ADDITION = 2;</code>
   */
  public static final int BASKET_ADDITION_VALUE = 2;


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
  public static DisbursalCalculationTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DisbursalCalculationTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return PERCENTAGE;
      case 1: return FIXED;
      case 2: return BASKET_ADDITION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DisbursalCalculationTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DisbursalCalculationTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DisbursalCalculationTypeEnum>() {
          public DisbursalCalculationTypeEnum findValueByNumber(int number) {
            return DisbursalCalculationTypeEnum.forNumber(number);
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
    return cart.client.modules.disbursal.enums.DisbursalCalculationTypeEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DisbursalCalculationTypeEnum[] VALUES = values();

  public static DisbursalCalculationTypeEnum valueOf(
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

  private DisbursalCalculationTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.disbursal.enums.DisbursalCalculationTypeEnum)
}

