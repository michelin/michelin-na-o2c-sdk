

# EDIWheelC11OrderCreationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | DocumentID always \&quot;C1\&quot;. |  |
|**variant** | **String** | Variant always \&quot;1\&quot;. |  [optional] |
|**transportPriority** | **String** | Mode of transport indicated in the request. Example: \&quot;REPL\&quot; for Next Truck. |  [optional] |
|**errorHead** | [**EDIWheelC11OrderCreationResponseErrorHead**](EDIWheelC11OrderCreationResponseErrorHead.md) |  |  |
|**customerReference** | [**EDIWheelC11OrderCreationResponseCustomerReference**](EDIWheelC11OrderCreationResponseCustomerReference.md) |  |  |
|**supplierParty** | [**EDIWheelC11OrderCreationResponseSupplierParty**](EDIWheelC11OrderCreationResponseSupplierParty.md) |  |  [optional] |
|**buyerParty** | [**EDIWheelC11OrderCreationResponseBuyerParty**](EDIWheelC11OrderCreationResponseBuyerParty.md) |  |  |
|**consignee** | [**EDIWheelC11OrderCreationResponseConsignee**](EDIWheelC11OrderCreationResponseConsignee.md) |  |  [optional] |
|**currencyCode** | **String** | CurrencyCode &#x3D; USD or CAD. |  [optional] |
|**orderLine** | [**List&lt;EDIWheelC11OrderCreationResponseOrderLineInner&gt;**](EDIWheelC11OrderCreationResponseOrderLineInner.md) |  |  [optional] |



