// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/datamodels/metadata/ProductInfoAttribute.proto

package cart.client.datamodels.metadata;

/**
 * Protobuf enum {@code cart.client.datamodels.metadata.ProductInfoAttribute}
 */
public enum ProductInfoAttribute
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SellerId = 0;</code>
   */
  SellerId(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SellerId = 0;</code>
   */
  public static final int SellerId_VALUE = 0;


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
  public static ProductInfoAttribute valueOf(int value) {
    return forNumber(value);
  }

  public static ProductInfoAttribute forNumber(int value) {
    switch (value) {
      case 0: return SellerId;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProductInfoAttribute>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProductInfoAttribute> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProductInfoAttribute>() {
          public ProductInfoAttribute findValueByNumber(int number) {
            return ProductInfoAttribute.forNumber(number);
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
    return cart.client.datamodels.metadata.ProductInfoAttributeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ProductInfoAttribute[] VALUES = values();

  public static ProductInfoAttribute valueOf(
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

  private ProductInfoAttribute(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.datamodels.metadata.ProductInfoAttribute)
}

