// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/ServiceAbilityInfo.proto

package cart.client.modules.serviceability;

public final class ServiceAbilityInfoOuterClass {
  private ServiceAbilityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_serviceability_ServiceAbilityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_serviceability_ServiceAbilityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;cart/client/modules/serviceability/Ser" +
      "viceAbilityInfo.proto\022\"cart.client.modul" +
      "es.serviceability\032Ccart/client/modules/s" +
      "erviceability/ServiceabilityInfoMetaData" +
      ".proto\0320cart/client/modules/serviceabili" +
      "ty/Service.proto\"\355\001\n\022ServiceAbilityInfo\022" +
      "A\n\014coreServices\030\001 \003(\0132+.cart.client.modu" +
      "les.serviceability.Service\022B\n\raddOnServi" +
      "ces\030\002 \003(\0132+.cart.client.modules.servicea" +
      "bility.Service\022P\n\010metaData\030\003 \001(\0132>.cart." +
      "client.modules.serviceability.Serviceabi" +
      "lityInfoMetaDataB&\n\"cart.client.modules." +
      "serviceabilityP\001b\006proto3"
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
          cart.client.modules.serviceability.ServiceabilityInfoMetaDataOuterClass.getDescriptor(),
          cart.client.modules.serviceability.ServiceOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_serviceability_ServiceAbilityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_serviceability_ServiceAbilityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_serviceability_ServiceAbilityInfo_descriptor,
        new java.lang.String[] { "CoreServices", "AddOnServices", "MetaData", });
    cart.client.modules.serviceability.ServiceabilityInfoMetaDataOuterClass.getDescriptor();
    cart.client.modules.serviceability.ServiceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}