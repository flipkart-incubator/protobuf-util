// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalItemResponseMetaData.proto

package cart.client.modules.disbursal.response;

public interface DisbursalItemResponseMetaDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.disbursal.response.DisbursalItemResponseMetaData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string cancellationIds = 1;</code>
   */
  java.util.List<java.lang.String>
      getCancellationIdsList();
  /**
   * <code>repeated string cancellationIds = 1;</code>
   */
  int getCancellationIdsCount();
  /**
   * <code>repeated string cancellationIds = 1;</code>
   */
  java.lang.String getCancellationIds(int index);
  /**
   * <code>repeated string cancellationIds = 1;</code>
   */
  com.google.protobuf.ByteString
      getCancellationIdsBytes(int index);

  /**
   * <code>string shipGroupId = 2;</code>
   */
  java.lang.String getShipGroupId();
  /**
   * <code>string shipGroupId = 2;</code>
   */
  com.google.protobuf.ByteString
      getShipGroupIdBytes();

  /**
   * <code>string cancellationId = 3;</code>
   */
  java.lang.String getCancellationId();
  /**
   * <code>string cancellationId = 3;</code>
   */
  com.google.protobuf.ByteString
      getCancellationIdBytes();

  /**
   * <code>string userAction = 4;</code>
   */
  java.lang.String getUserAction();
  /**
   * <code>string userAction = 4;</code>
   */
  com.google.protobuf.ByteString
      getUserActionBytes();

  /**
   * <code>string basketAction = 5;</code>
   */
  java.lang.String getBasketAction();
  /**
   * <code>string basketAction = 5;</code>
   */
  com.google.protobuf.ByteString
      getBasketActionBytes();

  /**
   * <code>string basketEntryAction = 6;</code>
   */
  java.lang.String getBasketEntryAction();
  /**
   * <code>string basketEntryAction = 6;</code>
   */
  com.google.protobuf.ByteString
      getBasketEntryActionBytes();

  /**
   * <code>int32 pickUpCharge = 7;</code>
   */
  int getPickUpCharge();

  /**
   * <code>string returnGroupId = 8;</code>
   */
  java.lang.String getReturnGroupId();
  /**
   * <code>string returnGroupId = 8;</code>
   */
  com.google.protobuf.ByteString
      getReturnGroupIdBytes();

  /**
   * <code>repeated string returnPolicyId = 9;</code>
   */
  java.util.List<java.lang.String>
      getReturnPolicyIdList();
  /**
   * <code>repeated string returnPolicyId = 9;</code>
   */
  int getReturnPolicyIdCount();
  /**
   * <code>repeated string returnPolicyId = 9;</code>
   */
  java.lang.String getReturnPolicyId(int index);
  /**
   * <code>repeated string returnPolicyId = 9;</code>
   */
  com.google.protobuf.ByteString
      getReturnPolicyIdBytes(int index);

  /**
   * <code>int32 effectiveDiscount = 10;</code>
   */
  int getEffectiveDiscount();

  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry otherInfo = 11;</code>
   */
  java.util.List<cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry> 
      getOtherInfoList();
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry otherInfo = 11;</code>
   */
  cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry getOtherInfo(int index);
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry otherInfo = 11;</code>
   */
  int getOtherInfoCount();
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry otherInfo = 11;</code>
   */
  java.util.List<? extends cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntryOrBuilder> 
      getOtherInfoOrBuilderList();
  /**
   * <code>repeated .cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntry otherInfo = 11;</code>
   */
  cart.client.modules.disbursal.response.DisbursalItemResponseMetaData.otherInfoEntryOrBuilder getOtherInfoOrBuilder(
      int index);
}
