// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalApplicationMetaData.proto

package cart.client.modules.disbursal.response;

public final class DisbursalApplicationMetaDataOuterClass {
  private DisbursalApplicationMetaDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalApplicationMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalApplicationMetaData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIcart/client/modules/disbursal/response" +
      "/DisbursalApplicationMetaData.proto\022&car" +
      "t.client.modules.disbursal.response\032Fcar" +
      "t/client/modules/disbursal/enums/Disburs" +
      "alApplicationTypeEnum.proto\"\241\001\n\034Disbursa" +
      "lApplicationMetaData\022g\n\034disbursalApplica" +
      "tionTypeEnum\030\001 \001(\0162A.cart.client.modules" +
      ".disbursal.enums.DisbursalApplicationTyp" +
      "eEnum\022\030\n\020deferredDuration\030\002 \001(\003B*\n&cart." +
      "client.modules.disbursal.responseP\001b\006pro" +
      "to3"
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
          cart.client.modules.disbursal.enums.DisbursalApplicationTypeEnumOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_disbursal_response_DisbursalApplicationMetaData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalApplicationMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalApplicationMetaData_descriptor,
        new java.lang.String[] { "DisbursalApplicationTypeEnum", "DeferredDuration", });
    cart.client.modules.disbursal.enums.DisbursalApplicationTypeEnumOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}