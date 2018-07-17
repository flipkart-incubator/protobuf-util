package com.flipkart.protobuf.ext.serde.proto;

import cart.client.endpoints.common.enums.CartAssocType;
import cart.client.endpoints.common.enums.CartDomainName;
import cart.client.endpoints.common.enums.CartItemAddedAgainst;
import cart.client.endpoints.common.meta.cartitem.Quantity;
import cart.client.modules.disbursal.DisbursalItemResponse;
import cart.client.modules.metadata.StatusResponse;
import cart.client.modules.productinfo.MinimalItemInfo;
import cart.client.modules.serviceability.ServiceAbilityInfo;
import cart.client.statemanagement.ItemState;
import cart.client.v2.datamodels.*;
import com.google.protobuf.Timestamp;

public class CartInfoSample {
	public static CartInfo getSampleCartInfo() {
		Timestamp addedTimeStamp = Timestamp.newBuilder()
				.setSeconds(1531836106000L)
				.build();

		CartItemMetaData cartItemMetaData = CartItemMetaData.newBuilder()
				.setQuantity(Quantity.newBuilder().setValue(1).build())
				.setServiceAbilityInfo(ServiceAbilityInfo.newBuilder().build())
				.setDisbursalItemResponse(DisbursalItemResponse.newBuilder().build())
				.setMinimalItemInfo(MinimalItemInfo.newBuilder()
						.setTitle("Honor 9 Lite (Glacier Grey, 32 GB)")
						.setUrl("/honor-9-lite-glacier-grey-32-gb/p/itmff5zgdeckztpk?pid=MOBFF5ZGTY7JHSDH")
						.setImageUrl("http://img.fkcdn.com/image/100/100/jcp4b680/mobile/z/d/b/honor-9-lite-lld-al10-original-imaffh2qdpanuhp9.jpeg")
						.setVertical("mobile")
						.build())
				.setStatusResponse(StatusResponse.newBuilder().setItemState(ItemState.BUYABLE).setMessage("This item is valid").build())
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
//				.setCartItems(0, cartItemInfo)
				.setMarketPlaceMetaData(marketPlaceMetaData)
				.build();
		CartInfo cartInfo = CartInfo.newBuilder()
				.setId("ACHWI93X4WDG2JDGRBYCE54ORG7M174S:P:A-0001")
				.setDomain(CartDomainName.PHYSICAL)
				.setAssocType(CartAssocType.ACCOUNT)
				.setAssocId("ACHWI93X4WDG2JDGRBYCE54ORG7M174S")
				.setVersion(1531836107211L)
				.setDomain(CartDomainName.PHYSICAL)
//				.setMarketPlaceInfoList(1, marketPlaceInfo)
				.build();

		return cartInfo;

	}
}
