// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/enums/DisbursalAdjustmentGranularityEnum.proto

package cart.client.modules.disbursal.enums;

/**
 * Protobuf enum {@code cart.client.modules.disbursal.enums.DisbursalAdjustmentGranularityEnum}
 */
public enum DisbursalAdjustmentGranularityEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ITEM_SELLING_PRICE = 0;</code>
   */
  ITEM_SELLING_PRICE(0),
  /**
   * <code>ITEM_SERVICE_CHARGE = 1;</code>
   */
  ITEM_SERVICE_CHARGE(1),
  /**
   * <code>BASKET_CONTENTS = 2;</code>
   */
  BASKET_CONTENTS(2),
  /**
   * <code>BASKET_NET_PRICE = 3;</code>
   */
  BASKET_NET_PRICE(3),
  /**
   * <code>BASKET_SERVICE_CHARGE = 4;</code>
   */
  BASKET_SERVICE_CHARGE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ITEM_SELLING_PRICE = 0;</code>
   */
  public static final int ITEM_SELLING_PRICE_VALUE = 0;
  /**
   * <code>ITEM_SERVICE_CHARGE = 1;</code>
   */
  public static final int ITEM_SERVICE_CHARGE_VALUE = 1;
  /**
   * <code>BASKET_CONTENTS = 2;</code>
   */
  public static final int BASKET_CONTENTS_VALUE = 2;
  /**
   * <code>BASKET_NET_PRICE = 3;</code>
   */
  public static final int BASKET_NET_PRICE_VALUE = 3;
  /**
   * <code>BASKET_SERVICE_CHARGE = 4;</code>
   */
  public static final int BASKET_SERVICE_CHARGE_VALUE = 4;


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
  public static DisbursalAdjustmentGranularityEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DisbursalAdjustmentGranularityEnum forNumber(int value) {
    switch (value) {
      case 0: return ITEM_SELLING_PRICE;
      case 1: return ITEM_SERVICE_CHARGE;
      case 2: return BASKET_CONTENTS;
      case 3: return BASKET_NET_PRICE;
      case 4: return BASKET_SERVICE_CHARGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DisbursalAdjustmentGranularityEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DisbursalAdjustmentGranularityEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DisbursalAdjustmentGranularityEnum>() {
          public DisbursalAdjustmentGranularityEnum findValueByNumber(int number) {
            return DisbursalAdjustmentGranularityEnum.forNumber(number);
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
    return cart.client.modules.disbursal.enums.DisbursalAdjustmentGranularityEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DisbursalAdjustmentGranularityEnum[] VALUES = values();

  public static DisbursalAdjustmentGranularityEnum valueOf(
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

  private DisbursalAdjustmentGranularityEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.disbursal.enums.DisbursalAdjustmentGranularityEnum)
}
