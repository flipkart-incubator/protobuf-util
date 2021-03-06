// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/Service.proto

package cart.client.modules.serviceability;

public interface ServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.serviceability.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.client.modules.serviceability.ApplicabilityInfo applicableOn = 1;</code>
   */
  boolean hasApplicableOn();
  /**
   * <code>.cart.client.modules.serviceability.ApplicabilityInfo applicableOn = 1;</code>
   */
  cart.client.modules.serviceability.ApplicabilityInfo getApplicableOn();
  /**
   * <code>.cart.client.modules.serviceability.ApplicabilityInfo applicableOn = 1;</code>
   */
  cart.client.modules.serviceability.ApplicabilityInfoOrBuilder getApplicableOnOrBuilder();

  /**
   * <code>repeated .cart.client.modules.serviceability.BasedOnInfo basedOnInfo = 2;</code>
   */
  java.util.List<cart.client.modules.serviceability.BasedOnInfo> 
      getBasedOnInfoList();
  /**
   * <code>repeated .cart.client.modules.serviceability.BasedOnInfo basedOnInfo = 2;</code>
   */
  cart.client.modules.serviceability.BasedOnInfo getBasedOnInfo(int index);
  /**
   * <code>repeated .cart.client.modules.serviceability.BasedOnInfo basedOnInfo = 2;</code>
   */
  int getBasedOnInfoCount();
  /**
   * <code>repeated .cart.client.modules.serviceability.BasedOnInfo basedOnInfo = 2;</code>
   */
  java.util.List<? extends cart.client.modules.serviceability.BasedOnInfoOrBuilder> 
      getBasedOnInfoOrBuilderList();
  /**
   * <code>repeated .cart.client.modules.serviceability.BasedOnInfo basedOnInfo = 2;</code>
   */
  cart.client.modules.serviceability.BasedOnInfoOrBuilder getBasedOnInfoOrBuilder(
      int index);

  /**
   * <code>.cart.client.modules.serviceability.ServiceDetails serviceDetails = 3;</code>
   */
  boolean hasServiceDetails();
  /**
   * <code>.cart.client.modules.serviceability.ServiceDetails serviceDetails = 3;</code>
   */
  cart.client.modules.serviceability.ServiceDetails getServiceDetails();
  /**
   * <code>.cart.client.modules.serviceability.ServiceDetails serviceDetails = 3;</code>
   */
  cart.client.modules.serviceability.ServiceDetailsOrBuilder getServiceDetailsOrBuilder();

  /**
   * <code>repeated .cart.client.modules.serviceability.PostOrderService postOrderServices = 4;</code>
   */
  java.util.List<cart.client.modules.serviceability.PostOrderService> 
      getPostOrderServicesList();
  /**
   * <code>repeated .cart.client.modules.serviceability.PostOrderService postOrderServices = 4;</code>
   */
  cart.client.modules.serviceability.PostOrderService getPostOrderServices(int index);
  /**
   * <code>repeated .cart.client.modules.serviceability.PostOrderService postOrderServices = 4;</code>
   */
  int getPostOrderServicesCount();
  /**
   * <code>repeated .cart.client.modules.serviceability.PostOrderService postOrderServices = 4;</code>
   */
  java.util.List<? extends cart.client.modules.serviceability.PostOrderServiceOrBuilder> 
      getPostOrderServicesOrBuilderList();
  /**
   * <code>repeated .cart.client.modules.serviceability.PostOrderService postOrderServices = 4;</code>
   */
  cart.client.modules.serviceability.PostOrderServiceOrBuilder getPostOrderServicesOrBuilder(
      int index);
}
