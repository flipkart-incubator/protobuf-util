// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/DeliveryInfo.proto

package cart.client.modules.serviceability;

public final class DeliveryInfoOuterClass {
  private DeliveryInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_serviceability_DeliveryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_serviceability_DeliveryInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5cart/client/modules/serviceability/Del" +
      "iveryInfo.proto\022\"cart.client.modules.ser" +
      "viceability\032\037google/protobuf/timestamp.p" +
      "roto\032)cart/client/modules/benefit/Benefi" +
      "t.proto\"\251\005\n\014DeliveryInfo\0224\n\020dispatchDate" +
      "Time\030\001 \001(\0132\032.google.protobuf.Timestamp\0224" +
      "\n\020deliveryDateTime\030\002 \001(\0132\032.google.protob" +
      "uf.Timestamp\022;\n\027prepaidDeliveryDateTime\030" +
      "\003 \001(\0132\032.google.protobuf.Timestamp\022<\n\030pos" +
      "tpaidDeliveryDateTime\030\004 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\0228\n\024promiseAfterDateTime\030" +
      "\005 \001(\0132\032.google.protobuf.Timestamp\0222\n\016cut" +
      "offDateTime\030\006 \001(\0132\032.google.protobuf.Time" +
      "stamp\022\021\n\tshowRange\030\007 \001(\010\0226\n\010benefits\030\010 \003" +
      "(\0132$.cart.client.modules.benefit.Benefit" +
      "\0220\n\014dispatchDate\030\t \001(\0132\032.google.protobuf" +
      ".Timestamp\0220\n\014deliveryDate\030\n \001(\0132\032.googl" +
      "e.protobuf.Timestamp\0224\n\020promiseAfterDate" +
      "\030\013 \001(\0132\032.google.protobuf.Timestamp\022.\n\ncu" +
      "toffDate\030\014 \001(\0132\032.google.protobuf.Timesta" +
      "mp\022/\n\013releaseDate\030\r \001(\0132\032.google.protobu" +
      "f.TimestampB&\n\"cart.client.modules.servi" +
      "ceabilityP\001b\006proto3"
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
          com.google.protobuf.TimestampProto.getDescriptor(),
          cart.client.modules.benefit.BenefitOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_serviceability_DeliveryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_serviceability_DeliveryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_serviceability_DeliveryInfo_descriptor,
        new java.lang.String[] { "DispatchDateTime", "DeliveryDateTime", "PrepaidDeliveryDateTime", "PostpaidDeliveryDateTime", "PromiseAfterDateTime", "CutoffDateTime", "ShowRange", "Benefits", "DispatchDate", "DeliveryDate", "PromiseAfterDate", "CutoffDate", "ReleaseDate", });
    com.google.protobuf.TimestampProto.getDescriptor();
    cart.client.modules.benefit.BenefitOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
