// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/ServiceabilityInfoMetaData.proto

package cart.client.modules.serviceability;

public final class ServiceabilityInfoMetaDataOuterClass {
  private ServiceabilityInfoMetaDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_serviceability_ServiceabilityInfoMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_serviceability_ServiceabilityInfoMetaData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCcart/client/modules/serviceability/Ser" +
      "viceabilityInfoMetaData.proto\022\"cart.clie" +
      "nt.modules.serviceability\0320cart/client/m" +
      "odules/serviceability/MetaTag.proto\0324car" +
      "t/client/modules/serviceability/MetaMess" +
      "age.proto\032,cart/client/datamodels/Reserv" +
      "ationInfo.proto\"\220\002\n\032ServiceabilityInfoMe" +
      "taData\022=\n\010metaTags\030\001 \003(\0132+.cart.client.m" +
      "odules.serviceability.MetaTag\022E\n\014metaMes" +
      "sages\030\002 \003(\0132/.cart.client.modules.servic" +
      "eability.MetaMessage\022\026\n\016slotsAvailable\030\003" +
      " \001(\010\022\022\n\nisPromised\030\004 \001(\010\022@\n\017reservationI" +
      "nfo\030\005 \001(\0132\'.cart.client.datamodels.Reser" +
      "vationInfoB&\n\"cart.client.modules.servic" +
      "eabilityP\001b\006proto3"
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
          cart.client.modules.serviceability.MetaTagOuterClass.getDescriptor(),
          cart.client.modules.serviceability.MetaMessageOuterClass.getDescriptor(),
          cart.client.datamodels.ReservationInfoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_serviceability_ServiceabilityInfoMetaData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_serviceability_ServiceabilityInfoMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_serviceability_ServiceabilityInfoMetaData_descriptor,
        new java.lang.String[] { "MetaTags", "MetaMessages", "SlotsAvailable", "IsPromised", "ReservationInfo", });
    cart.client.modules.serviceability.MetaTagOuterClass.getDescriptor();
    cart.client.modules.serviceability.MetaMessageOuterClass.getDescriptor();
    cart.client.datamodels.ReservationInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
