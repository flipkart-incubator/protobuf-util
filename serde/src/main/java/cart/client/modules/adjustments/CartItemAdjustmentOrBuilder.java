// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/adjustments/CartItemAdjustment.proto

package cart.client.modules.adjustments;

public interface CartItemAdjustmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.adjustments.CartItemAdjustment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.client.modules.adjustments.Amount unitSellingPrice = 1;</code>
   */
  boolean hasUnitSellingPrice();
  /**
   * <code>.cart.client.modules.adjustments.Amount unitSellingPrice = 1;</code>
   */
  cart.client.modules.adjustments.Amount getUnitSellingPrice();
  /**
   * <code>.cart.client.modules.adjustments.Amount unitSellingPrice = 1;</code>
   */
  cart.client.modules.adjustments.AmountOrBuilder getUnitSellingPriceOrBuilder();

  /**
   * <code>.cart.client.modules.adjustments.Amount itemSellingPrice = 2;</code>
   */
  boolean hasItemSellingPrice();
  /**
   * <code>.cart.client.modules.adjustments.Amount itemSellingPrice = 2;</code>
   */
  cart.client.modules.adjustments.Amount getItemSellingPrice();
  /**
   * <code>.cart.client.modules.adjustments.Amount itemSellingPrice = 2;</code>
   */
  cart.client.modules.adjustments.AmountOrBuilder getItemSellingPriceOrBuilder();

  /**
   * <code>int32 quantity = 3;</code>
   */
  int getQuantity();

  /**
   * <code>repeated .cart.client.modules.adjustments.Adjustment itemAdjustmentList = 4;</code>
   */
  java.util.List<cart.client.modules.adjustments.Adjustment> 
      getItemAdjustmentListList();
  /**
   * <code>repeated .cart.client.modules.adjustments.Adjustment itemAdjustmentList = 4;</code>
   */
  cart.client.modules.adjustments.Adjustment getItemAdjustmentList(int index);
  /**
   * <code>repeated .cart.client.modules.adjustments.Adjustment itemAdjustmentList = 4;</code>
   */
  int getItemAdjustmentListCount();
  /**
   * <code>repeated .cart.client.modules.adjustments.Adjustment itemAdjustmentList = 4;</code>
   */
  java.util.List<? extends cart.client.modules.adjustments.AdjustmentOrBuilder> 
      getItemAdjustmentListOrBuilderList();
  /**
   * <code>repeated .cart.client.modules.adjustments.Adjustment itemAdjustmentList = 4;</code>
   */
  cart.client.modules.adjustments.AdjustmentOrBuilder getItemAdjustmentListOrBuilder(
      int index);

  /**
   * <code>repeated string groupAdjustmentIds = 5;</code>
   */
  java.util.List<java.lang.String>
      getGroupAdjustmentIdsList();
  /**
   * <code>repeated string groupAdjustmentIds = 5;</code>
   */
  int getGroupAdjustmentIdsCount();
  /**
   * <code>repeated string groupAdjustmentIds = 5;</code>
   */
  java.lang.String getGroupAdjustmentIds(int index);
  /**
   * <code>repeated string groupAdjustmentIds = 5;</code>
   */
  com.google.protobuf.ByteString
      getGroupAdjustmentIdsBytes(int index);
}