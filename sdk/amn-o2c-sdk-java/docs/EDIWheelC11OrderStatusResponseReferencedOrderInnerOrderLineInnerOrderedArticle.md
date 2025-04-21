

# EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**articleIdentification** | [**EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification**](EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.md) |  |  |
|**articleDescription** | [**EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleDescription**](EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleDescription.md) |  |  |
|**requestedDeliveryDate** | **String** | Original requested delivery date based on order creation |  |
|**requestedDeliveryTime** | **String** | Not used today |  [optional] |
|**articleComment** | **String** | Not used today |  [optional] |
|**scheduleDetails** | [**List&lt;EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner&gt;**](EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.md) | Multiple scheduleDetails can be present within a single lineID with same or varying status quantityValue |  |
|**orderedQuantity** | [**EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleOrderedQuantity**](EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleOrderedQuantity.md) |  |  [optional] |



