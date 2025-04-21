

# EDIWheelC11OrderStatusResponseReferencedOrderInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **Object** |  |  [optional] |
|**orderDate** | **String** | Date order received in Michelin systems. Format YYYY-MM-DD |  |
|**supplierOrderNumber** | [**EDIWheelC11OrderStatusResponseReferencedOrderInnerSupplierOrderNumber**](EDIWheelC11OrderStatusResponseReferencedOrderInnerSupplierOrderNumber.md) |  |  |
|**orderingMethod** | **String** | Method by which order was received. Possible responses could include: CSR KEYED, INTERNET, EDI PO, TELEPHONY, VMI, ERPEBIB, S2S INTEGRATION |  |
|**orderReference** | [**EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderReference**](EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderReference.md) |  |  |
|**pickUp** | **String** |  |  [optional] |
|**deliveryOption** | **String** |  |  [optional] |
|**sellerParty** | **Object** |  |  [optional] |
|**supplierParty** | **Object** |  |  [optional] |
|**contract** | **Object** |  |  [optional] |
|**orderLine** | [**List&lt;EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInner&gt;**](EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInner.md) |  |  |



