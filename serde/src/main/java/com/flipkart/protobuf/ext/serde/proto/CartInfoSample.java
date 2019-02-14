package com.flipkart.protobuf.ext.serde.proto;

import cart.client.datamodels.metadata.DependentService;
import cart.client.datamodels.metadata.ProductInfoAttribute;
import cart.client.endpoints.common.enums.CartAssocType;
import cart.client.endpoints.common.enums.CartDomainName;
import cart.client.endpoints.common.enums.CartItemAddedAgainst;
import cart.client.endpoints.common.meta.cart.UserDemographics;
import cart.client.endpoints.common.meta.cartitem.Quantity;
import cart.client.modules.adjustments.Amount;
import cart.client.modules.adjustments.CartItemAdjustment;
import cart.client.modules.disbursal.DisbursalItemResponse;
import cart.client.modules.disbursal.enums.*;
import cart.client.modules.disbursal.response.*;
import cart.client.modules.metadata.StatusResponse;
import cart.client.modules.productinfo.MinimalItemInfo;
import cart.client.modules.serviceability.*;
import cart.client.modules.serviceability.enums.DeliverySpeedTypeEnum;
import cart.client.modules.serviceability.enums.ServiceChargeTypeEnum;
import cart.client.modules.serviceability.enums.ServiceNameEnum;
import cart.client.statemanagement.ItemState;
import cart.client.v2.datamodels.*;
import com.google.protobuf.Timestamp;

public class CartInfoSample {
	public static CartInfo getSampleCartInfo() {
		Timestamp addedTimeStamp = Timestamp.newBuilder()
				.setSeconds(1531836106000L)
				.build();

		DeliveryInfo deliveryInfo = DeliveryInfo.newBuilder()
				.setDispatchDate(Timestamp.newBuilder().setSeconds(1000).build())
				.setDeliveryDate(Timestamp.newBuilder().setSeconds(111111).build())
				.setPrepaidDeliveryDateTime(Timestamp.newBuilder().setSeconds(11111).build())
				.setPostpaidDeliveryDateTime(Timestamp.newBuilder().setSeconds(22222).build())
				.setPromiseAfterDate(Timestamp.newBuilder().setSeconds(2222).build())
				.setCutoffDate(Timestamp.newBuilder().setSeconds(22222).build())
				.setShowRange(false)
				.build();

		DeliverySla deliverySla = DeliverySla.newBuilder()
				.setMinSla(3)
				.setMaxSla(3)
				.setInternalSla(0)
				.setSla(3)
				.setSpeed(DeliverySpeedTypeEnum.REGULAR)
				.setDeliveryInfo(deliveryInfo)
				.setDataBag(DataBag.newBuilder().setSla(0).setCost(0).build())
				.build();

		ServiceDetails serviceDetails = ServiceDetails.newBuilder()
				.setServiceNameEnum(ServiceNameEnum.NORMAL_DELIVERY)
				.setServiceable(true)
				.setHasOutstandingPurchaseLimit(false)
				.setOutstandingPurchaseLimit(0)
				.setServiceCharges(ServiceCharges.newBuilder()
						.addServiceChargeMap(ServiceCharges.serviceChargeMapEntry.newBuilder().setKey(ServiceChargeTypeEnum.SHIPPING_CHARGE).setValue(0).build()).build())
				.setDeliverySla(deliverySla)
				.setPromiseType(PromiseType.UN_SLOTTED)
				.setUseDefaultSlot(false)
				.setSlotCost(0)
				.setMaxQuantity(0)
				.setIsDefaultPromise(true)
				.build();

		Service coreServices = Service.newBuilder()
				.setApplicableOn(ApplicabilityInfo.newBuilder().setType("orderFulfillment").setValue("REGULAR").build())
				.addBasedOnInfo(BasedOnInfo.newBuilder().setType("pin").setValue("560034").build())
				.setServiceDetails(serviceDetails)
				.addPostOrderServices(PostOrderService.newBuilder().build())
				.build();

		Service addOnServices1 = Service.newBuilder()
				.setApplicableOn(ApplicabilityInfo.newBuilder().setType("paymentMode").setValue("prepaid").build())
				.addBasedOnInfo(BasedOnInfo.newBuilder().setType("pin").setValue("560034").build())
				.setServiceDetails(ServiceDetails.newBuilder().setServiceNameEnum(ServiceNameEnum.PAYMENT_PREPAID_SERVICEABILITY).setServiceable(true).setOutstandingPurchaseLimit(0).setSlotCost(0).setMaxQuantity(0).build())
				.build();

		Service addOnServices2 = Service.newBuilder()
				.setApplicableOn(ApplicabilityInfo.newBuilder().setType("paymentMode").setValue("cod").build())
				.addBasedOnInfo(BasedOnInfo.newBuilder().setType("pin").setValue("560034").build())
				.setServiceDetails(ServiceDetails.newBuilder().setServiceNameEnum(ServiceNameEnum.PAYMENT_POSTPAID_SERVICEABILITY).setServiceable(true).setOutstandingPurchaseLimit(0).setSlotCost(0).setMaxQuantity(0).build())
				.build();

		ServiceabilityInfoMetaData metaData = ServiceabilityInfoMetaData.newBuilder()
				.setIsPromised(true)
				.setSlotsAvailable(false)
				.build();

		ServiceAbilityInfo serviceAbilityInfo = ServiceAbilityInfo.newBuilder()
				.addCoreServices(coreServices)
				.addAddOnServices(addOnServices1)
				.addAddOnServices(addOnServices2)
				.setMetaData(metaData)
				.build();
		DisbursalNetAdjustmentDetails disbursalNetAdjustmentDetails = DisbursalNetAdjustmentDetails.newBuilder()
				.setAdjustmentName(DisbursalAdjustmentNameEnum.PROMOTIONAL_DISCOUNT)
				.setDisbursalType(DisbursalTypeEnum.DISCOUNT)
				.setDisbursalAmount(Amount.newBuilder().setValue(0).build())
				.build();

		OfferMessage offerMessage = OfferMessage.newBuilder()
				.setText(MessageText.newBuilder()
						.setSmall("Jio:₹2200 Cashback, Recharge Rs198 or 299/m")
						.setMedium("Jio : get ₹2200 cashback, Recharge with Rs198/299 Per month")
						.setLarge("Jio : get ₹2200 cashback, Recharge with Rs198/299 Per month")
						.build())
				.setTnc(MessageLink.newBuilder()
						.setDisplayText("Know More")
						.setRequired(true)
						.build())
				.build();
		DisbursalOffer disbursalOffer = DisbursalOffer.newBuilder()
				.setOfferId("nb:mp:060ab78305")
				.setBasedOn(DisbursalBasedOnEnum.OFFER)
				.setApplicableOn(DisbursalApplicableOnEnum.ITEM)
				.setGiveAwayType(DisbursalGiveAwayTypeEnum.DISCOUNT_1)
				.setDisbursalNetAdjustmentDetails(disbursalNetAdjustmentDetails)
				.setDiscountAmount(0)
				.setOfferMessage(offerMessage)
				.setMessage("Jio:₹2200 Cashback, Recharge Rs198 or 299/m")
				.build();

		Freebie freebie = Freebie.newBuilder()
				.build();

		DisbursalItemResponse disbursalItemResponse = DisbursalItemResponse.newBuilder()
				.addFreebieList(freebie)
				.addOffers(disbursalOffer)
				.setDisbursalItemMetaData(DisbursalItemResponseMetaData.newBuilder().setEffectiveDiscount(3000).build())
				.addItemOfferMessages(OfferMessage.newBuilder().build())
				.build();

		CartItemAdjustment cartItemAdjustment = CartItemAdjustment.newBuilder()
				.build();

		CartItemMetaData cartItemMetaData = CartItemMetaData.newBuilder()
				.setQuantity(Quantity.newBuilder().setValue(1).build())
				.setServiceAbilityInfo(serviceAbilityInfo)
				.setDisbursalItemResponse(disbursalItemResponse)
				.setMinimalItemInfo(MinimalItemInfo.newBuilder()
						.setTitle("Honor 9 Lite (Glacier Grey, 32 GB)")
						.setUrl("/honor-9-lite-glacier-grey-32-gb/p/itmff5zgdeckztpk?pid=MOBFF5ZGTY7JHSDH")
						.setImageUrl("http://img.fkcdn.com/image/100/100/jcp4b680/mobile/z/d/b/honor-9-lite-lld-al10-original-imaffh2qdpanuhp9.jpeg")
						.setVertical("mobile")
						.build())
				.setStatusResponse(StatusResponse.newBuilder().setItemState(ItemState.BUYABLE).setMessage("This item is valid").build())
				.setItemAdjustment(cartItemAdjustment)
				.setAttachMetadata(AttachMetadata.newBuilder().setShowAttach(true).setAttachRestrictionReason(AttachRestrictionReason.NOT_APPLICABLE).build())
				.build();
		CartItemInfo cartItemInfo = CartItemInfo.newBuilder()
				.setId("LSTMOBFF5ZGTY7JHSDHE06MDN:ACHWI93X4WDG2JDGRBYCE54ORG7M174S:P:A-0001:U:SPCMS")
				.setCartId("ACHWI93X4WDG2JDGRBYCE54ORG7M174S:P:A-0001")
				.setItemAddedAgainst(CartItemAddedAgainst.USER)
				.setItemSource("SPCMS")
				.setItemId("LSTMOBFF5ZGTY7JHSDHE06MDN")
				.setIsDeleted("0")
				.setAddedDateTime(addedTimeStamp)
				.setCartItemMetaData(cartItemMetaData)
				.setMarketPlaceId(MarketPlace.FLIPKART)
				.build();
		MarketPlaceMetaData marketPlaceMetaData = MarketPlaceMetaData.newBuilder()
				.setIsMarketPlaceServiceable(true)
				.build();
		MarketPlaceInfo marketPlaceInfo = MarketPlaceInfo.newBuilder()
				.setMarketPlace(MarketPlace.FLIPKART)
				.addCartItems(cartItemInfo)
				.setMarketPlaceMetaData(marketPlaceMetaData)
				.build();

		UserDemographics userDemographics = UserDemographics.newBuilder()
				.setShippingPincode("560034")
				.setIpAddress("115.110.204.62")
				.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.111 Safari/537.36")
				.build();

		CartMetaData cartMetaData = CartMetaData.newBuilder()
				.setUserDemographics(userDemographics)
				.setShippingPinCode("560034")
				.build();

		CartInfo cartInfo = CartInfo.newBuilder()
				.setId("ACHWI93X4WDG2JDGRBYCE54ORG7M174S:P:A-0001")
				.setDomain(CartDomainName.PHYSICAL)
				.setAssocType(CartAssocType.ACCOUNT)
				.setAssocId("ACHWI93X4WDG2JDGRBYCE54ORG7M174S")
				.setVersion(1531836107211L)
				.setDomain(CartDomainName.PHYSICAL)
				.addMarketPlaceInfoList(marketPlaceInfo)
				.setCartMetaData(cartMetaData)
				.build();

		return cartInfo;

	}

	public static void main(String[] args) {
		System.out.println(CartInfoSample.getSampleCartInfo());
	}
}
