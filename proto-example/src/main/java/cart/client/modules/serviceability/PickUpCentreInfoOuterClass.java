// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/PickUpCentreInfo.proto

package cart.client.modules.serviceability;

public final class PickUpCentreInfoOuterClass {
  private PickUpCentreInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_serviceability_PickUpCentreInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_serviceability_PickUpCentreInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9cart/client/modules/serviceability/Pic" +
      "kUpCentreInfo.proto\022\"cart.client.modules" +
      ".serviceability\032\037google/protobuf/timesta" +
      "mp.proto\"\202\001\n\020PickUpCentreInfo\0227\n\023pickUpS" +
      "tartDateTime\030\001 \001(\0132\032.google.protobuf.Tim" +
      "estamp\0225\n\021pickUpEndDateTime\030\002 \001(\0132\032.goog" +
      "le.protobuf.TimestampB&\n\"cart.client.mod" +
      "ules.serviceabilityP\001b\006proto3"
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
        }, assigner);
    internal_static_cart_client_modules_serviceability_PickUpCentreInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_serviceability_PickUpCentreInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_serviceability_PickUpCentreInfo_descriptor,
        new java.lang.String[] { "PickUpStartDateTime", "PickUpEndDateTime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
