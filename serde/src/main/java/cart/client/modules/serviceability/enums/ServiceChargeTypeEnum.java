// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/enums/ServiceChargeTypeEnum.proto

package cart.client.modules.serviceability.enums;

/**
 * Protobuf enum {@code cart.client.modules.serviceability.enums.ServiceChargeTypeEnum}
 */
public enum ServiceChargeTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SHIPPING_CHARGE = 0;</code>
   */
  SHIPPING_CHARGE(0),
  /**
   * <code>OCTROI_CHARGE = 1;</code>
   */
  OCTROI_CHARGE(1),
  /**
   * <code>GIFT_WRAP_CHARGE = 2;</code>
   */
  GIFT_WRAP_CHARGE(2),
  /**
   * <code>PICKUP_CHARGE = 3;</code>
   */
  PICKUP_CHARGE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SHIPPING_CHARGE = 0;</code>
   */
  public static final int SHIPPING_CHARGE_VALUE = 0;
  /**
   * <code>OCTROI_CHARGE = 1;</code>
   */
  public static final int OCTROI_CHARGE_VALUE = 1;
  /**
   * <code>GIFT_WRAP_CHARGE = 2;</code>
   */
  public static final int GIFT_WRAP_CHARGE_VALUE = 2;
  /**
   * <code>PICKUP_CHARGE = 3;</code>
   */
  public static final int PICKUP_CHARGE_VALUE = 3;


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
  public static ServiceChargeTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ServiceChargeTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return SHIPPING_CHARGE;
      case 1: return OCTROI_CHARGE;
      case 2: return GIFT_WRAP_CHARGE;
      case 3: return PICKUP_CHARGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceChargeTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServiceChargeTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServiceChargeTypeEnum>() {
          public ServiceChargeTypeEnum findValueByNumber(int number) {
            return ServiceChargeTypeEnum.forNumber(number);
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
    return cart.client.modules.serviceability.enums.ServiceChargeTypeEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServiceChargeTypeEnum[] VALUES = values();

  public static ServiceChargeTypeEnum valueOf(
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

  private ServiceChargeTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.serviceability.enums.ServiceChargeTypeEnum)
}
