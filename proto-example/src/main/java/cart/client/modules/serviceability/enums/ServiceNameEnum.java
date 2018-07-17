// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/enums/ServiceNameEnum.proto

package cart.client.modules.serviceability.enums;

/**
 * Protobuf enum {@code cart.client.modules.serviceability.enums.ServiceNameEnum}
 */
public enum ServiceNameEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NORMAL_DELIVERY = 0;</code>
   */
  NORMAL_DELIVERY(0),
  /**
   * <code>NEXT_DAY_DELIVERY = 1;</code>
   */
  NEXT_DAY_DELIVERY(1),
  /**
   * <code>SAME_DAY_DELIVERY = 2;</code>
   */
  SAME_DAY_DELIVERY(2),
  /**
   * <code>HAND_TO_HAND_DELIVERY = 3;</code>
   */
  HAND_TO_HAND_DELIVERY(3),
  /**
   * <code>LOCATION_SERVICEABILITY = 4;</code>
   */
  LOCATION_SERVICEABILITY(4),
  /**
   * <code>PAYMENT_PREPAID_SERVICEABILITY = 5;</code>
   */
  PAYMENT_PREPAID_SERVICEABILITY(5),
  /**
   * <code>PAYMENT_POSTPAID_SERVICEABILITY = 6;</code>
   */
  PAYMENT_POSTPAID_SERVICEABILITY(6),
  /**
   * <code>GIFTWRAP = 7;</code>
   */
  GIFTWRAP(7),
  /**
   * <code>NO_PINCODE_SERVICEABILITY = 8;</code>
   */
  NO_PINCODE_SERVICEABILITY(8),
  /**
   * <code>SLOT = 9;</code>
   */
  SLOT(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NORMAL_DELIVERY = 0;</code>
   */
  public static final int NORMAL_DELIVERY_VALUE = 0;
  /**
   * <code>NEXT_DAY_DELIVERY = 1;</code>
   */
  public static final int NEXT_DAY_DELIVERY_VALUE = 1;
  /**
   * <code>SAME_DAY_DELIVERY = 2;</code>
   */
  public static final int SAME_DAY_DELIVERY_VALUE = 2;
  /**
   * <code>HAND_TO_HAND_DELIVERY = 3;</code>
   */
  public static final int HAND_TO_HAND_DELIVERY_VALUE = 3;
  /**
   * <code>LOCATION_SERVICEABILITY = 4;</code>
   */
  public static final int LOCATION_SERVICEABILITY_VALUE = 4;
  /**
   * <code>PAYMENT_PREPAID_SERVICEABILITY = 5;</code>
   */
  public static final int PAYMENT_PREPAID_SERVICEABILITY_VALUE = 5;
  /**
   * <code>PAYMENT_POSTPAID_SERVICEABILITY = 6;</code>
   */
  public static final int PAYMENT_POSTPAID_SERVICEABILITY_VALUE = 6;
  /**
   * <code>GIFTWRAP = 7;</code>
   */
  public static final int GIFTWRAP_VALUE = 7;
  /**
   * <code>NO_PINCODE_SERVICEABILITY = 8;</code>
   */
  public static final int NO_PINCODE_SERVICEABILITY_VALUE = 8;
  /**
   * <code>SLOT = 9;</code>
   */
  public static final int SLOT_VALUE = 9;


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
  public static ServiceNameEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ServiceNameEnum forNumber(int value) {
    switch (value) {
      case 0: return NORMAL_DELIVERY;
      case 1: return NEXT_DAY_DELIVERY;
      case 2: return SAME_DAY_DELIVERY;
      case 3: return HAND_TO_HAND_DELIVERY;
      case 4: return LOCATION_SERVICEABILITY;
      case 5: return PAYMENT_PREPAID_SERVICEABILITY;
      case 6: return PAYMENT_POSTPAID_SERVICEABILITY;
      case 7: return GIFTWRAP;
      case 8: return NO_PINCODE_SERVICEABILITY;
      case 9: return SLOT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceNameEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServiceNameEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServiceNameEnum>() {
          public ServiceNameEnum findValueByNumber(int number) {
            return ServiceNameEnum.forNumber(number);
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
    return cart.client.modules.serviceability.enums.ServiceNameEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServiceNameEnum[] VALUES = values();

  public static ServiceNameEnum valueOf(
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

  private ServiceNameEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.serviceability.enums.ServiceNameEnum)
}
