// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/adjustments/CartItemAdjustment.proto

package cart.client.modules.adjustments;

public final class CartItemAdjustmentOuterClass {
  private CartItemAdjustmentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_adjustments_CartItemAdjustment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_adjustments_CartItemAdjustment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8cart/client/modules/adjustments/CartIt" +
      "emAdjustment.proto\022\037cart.client.modules." +
      "adjustments\0320cart/client/modules/adjustm" +
      "ents/Adjustment.proto\032,cart/client/modul" +
      "es/adjustments/Amount.proto\"\221\002\n\022CartItem" +
      "Adjustment\022A\n\020unitSellingPrice\030\001 \001(\0132\'.c" +
      "art.client.modules.adjustments.Amount\022A\n" +
      "\020itemSellingPrice\030\002 \001(\0132\'.cart.client.mo" +
      "dules.adjustments.Amount\022\020\n\010quantity\030\003 \001" +
      "(\005\022G\n\022itemAdjustmentList\030\004 \003(\0132+.cart.cl" +
      "ient.modules.adjustments.Adjustment\022\032\n\022g" +
      "roupAdjustmentIds\030\005 \003(\tB#\n\037cart.client.m" +
      "odules.adjustmentsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cart.client.modules.adjustments.AdjustmentOuterClass.getDescriptor(),
          cart.client.modules.adjustments.AmountOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_adjustments_CartItemAdjustment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_adjustments_CartItemAdjustment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_adjustments_CartItemAdjustment_descriptor,
        new java.lang.String[] { "UnitSellingPrice", "ItemSellingPrice", "Quantity", "ItemAdjustmentList", "GroupAdjustmentIds", });
    cart.client.modules.adjustments.AdjustmentOuterClass.getDescriptor();
    cart.client.modules.adjustments.AmountOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
