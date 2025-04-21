

# EDIWheelC11OrderStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentID** | **String** | Fixed documentID &#x3D; C1 |  |
|**variant** | **String** | Fixed variant &#x3D; 1 |  [optional] |
|**orderDateFrom** | **String** | orderDateFrom returned IF included in request |  [optional] |
|**orderDateTo** | **String** | orderDateTo returned IF included in request |  [optional] |
|**orderStatusIndicator** | [**OrderStatusIndicatorEnum**](#OrderStatusIndicatorEnum) | Indicator used in request determines line statuses that are included in response |  |
|**errorHead** | [**EDIWheelC10DesadvResponseErrorHead**](EDIWheelC10DesadvResponseErrorHead.md) |  |  |
|**buyerParty** | [**EDIWheelC11OrderStatusResponseBuyerParty**](EDIWheelC11OrderStatusResponseBuyerParty.md) |  |  |
|**orderingParty** | **Object** |  |  [optional] |
|**consignee** | [**EDIWheelC11OrderStatusResponseConsignee**](EDIWheelC11OrderStatusResponseConsignee.md) |  |  |
|**referencedOrder** | [**List&lt;EDIWheelC11OrderStatusResponseReferencedOrderInner&gt;**](EDIWheelC11OrderStatusResponseReferencedOrderInner.md) |  |  [optional] |



## Enum: OrderStatusIndicatorEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



