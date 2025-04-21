

# EDIWheelC11OrderStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentID** | **String** | Fixed documentID &#x3D; C1 |  |
|**variant** | **String** | Fixed variant &#x3D; 1 |  |
|**orderStatusIndicator** | [**OrderStatusIndicatorEnum**](#OrderStatusIndicatorEnum) | Indicator used in request determines line statuses that are included in response. Indicator options: 0 &#x3D; open/backorder status lines, 1 &#x3D; open/backorder and cancelled status lines, 2 &#x3D; all status lines. |  |
|**orderDateFrom** | **String** | From Date value for Date Range searches. Format YYYY-MM-DD. Date range cannot be used in conjunction with order reference(s) as selection criteria. Max of 90 day window. Date range OR Reference value required for searches. |  [optional] |
|**orderDateTo** | **String** | To Date value for Date Range searches. Format YYYY-MM-DD. Date range cannot be used in conjunction with order reference(s) as selection criteria. Max of 90 day window. Date range OR Reference value required for searches. |  [optional] |
|**buyerParty** | [**EDIWheelC11OrderStatusRequestBuyerParty**](EDIWheelC11OrderStatusRequestBuyerParty.md) |  |  |
|**consignee** | [**EDIWheelC11OrderStatusRequestConsignee**](EDIWheelC11OrderStatusRequestConsignee.md) |  |  |
|**referencedOrder** | [**List&lt;EDIWheelC11OrderStatusRequestReferencedOrderInner&gt;**](EDIWheelC11OrderStatusRequestReferencedOrderInner.md) | referencedOrder / documentID search criteria cannot be used in combination with the date range search. Date range OR Reference value required for searches. |  [optional] |



## Enum: OrderStatusIndicatorEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



