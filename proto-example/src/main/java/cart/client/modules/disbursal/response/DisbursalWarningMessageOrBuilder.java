// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalWarningMessage.proto

package cart.client.modules.disbursal.response;

public interface DisbursalWarningMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.disbursal.response.DisbursalWarningMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string warningMessage = 1;</code>
   */
  java.lang.String getWarningMessage();
  /**
   * <code>string warningMessage = 1;</code>
   */
  com.google.protobuf.ByteString
      getWarningMessageBytes();

  /**
   * <code>string affectedOfferId = 2;</code>
   */
  java.lang.String getAffectedOfferId();
  /**
   * <code>string affectedOfferId = 2;</code>
   */
  com.google.protobuf.ByteString
      getAffectedOfferIdBytes();

  /**
   * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
   */
  int getDisbursalWarningEnumValue();
  /**
   * <code>.cart.client.modules.disbursal.enums.DisbursalWarningEnum disbursalWarningEnum = 3;</code>
   */
  cart.client.modules.disbursal.enums.DisbursalWarningEnum getDisbursalWarningEnum();

  /**
   * <code>repeated string externalIds = 4;</code>
   */
  java.util.List<java.lang.String>
      getExternalIdsList();
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  int getExternalIdsCount();
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  java.lang.String getExternalIds(int index);
  /**
   * <code>repeated string externalIds = 4;</code>
   */
  com.google.protobuf.ByteString
      getExternalIdsBytes(int index);
}
