// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/endpoints/common/meta/cart/FulfillmentData.proto

package cart.client.endpoints.common.meta.cart;

public interface FulfillmentDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.endpoints.common.meta.cart.FulfillmentData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.client.endpoints.common.enums.FulfillmentServiceType fulfillmentServiceType = 1;</code>
   */
  int getFulfillmentServiceTypeValue();
  /**
   * <code>.cart.client.endpoints.common.enums.FulfillmentServiceType fulfillmentServiceType = 1;</code>
   */
  cart.client.endpoints.common.enums.FulfillmentServiceType getFulfillmentServiceType();

  /**
   * <code>string fulfillmentId = 2;</code>
   */
  java.lang.String getFulfillmentId();
  /**
   * <code>string fulfillmentId = 2;</code>
   */
  com.google.protobuf.ByteString
      getFulfillmentIdBytes();
}
