// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/ServiceAbilityInfo.proto

package cart.client.modules.serviceability;

public interface ServiceAbilityInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.serviceability.ServiceAbilityInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cart.client.modules.serviceability.Service coreServices = 1;</code>
   */
  java.util.List<cart.client.modules.serviceability.Service> 
      getCoreServicesList();
  /**
   * <code>repeated .cart.client.modules.serviceability.Service coreServices = 1;</code>
   */
  cart.client.modules.serviceability.Service getCoreServices(int index);
  /**
   * <code>repeated .cart.client.modules.serviceability.Service coreServices = 1;</code>
   */
  int getCoreServicesCount();
  /**
   * <code>repeated .cart.client.modules.serviceability.Service coreServices = 1;</code>
   */
  java.util.List<? extends cart.client.modules.serviceability.ServiceOrBuilder> 
      getCoreServicesOrBuilderList();
  /**
   * <code>repeated .cart.client.modules.serviceability.Service coreServices = 1;</code>
   */
  cart.client.modules.serviceability.ServiceOrBuilder getCoreServicesOrBuilder(
      int index);

  /**
   * <code>repeated .cart.client.modules.serviceability.Service addOnServices = 2;</code>
   */
  java.util.List<cart.client.modules.serviceability.Service> 
      getAddOnServicesList();
  /**
   * <code>repeated .cart.client.modules.serviceability.Service addOnServices = 2;</code>
   */
  cart.client.modules.serviceability.Service getAddOnServices(int index);
  /**
   * <code>repeated .cart.client.modules.serviceability.Service addOnServices = 2;</code>
   */
  int getAddOnServicesCount();
  /**
   * <code>repeated .cart.client.modules.serviceability.Service addOnServices = 2;</code>
   */
  java.util.List<? extends cart.client.modules.serviceability.ServiceOrBuilder> 
      getAddOnServicesOrBuilderList();
  /**
   * <code>repeated .cart.client.modules.serviceability.Service addOnServices = 2;</code>
   */
  cart.client.modules.serviceability.ServiceOrBuilder getAddOnServicesOrBuilder(
      int index);

  /**
   * <code>.cart.client.modules.serviceability.ServiceabilityInfoMetaData metaData = 3;</code>
   */
  boolean hasMetaData();
  /**
   * <code>.cart.client.modules.serviceability.ServiceabilityInfoMetaData metaData = 3;</code>
   */
  cart.client.modules.serviceability.ServiceabilityInfoMetaData getMetaData();
  /**
   * <code>.cart.client.modules.serviceability.ServiceabilityInfoMetaData metaData = 3;</code>
   */
  cart.client.modules.serviceability.ServiceabilityInfoMetaDataOrBuilder getMetaDataOrBuilder();
}
