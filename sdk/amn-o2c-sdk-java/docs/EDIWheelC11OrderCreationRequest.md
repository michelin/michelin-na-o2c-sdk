

# EDIWheelC11OrderCreationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | Fixed value \&quot;C1\&quot; |  |
|**variant** | **String** | Fixed value \&quot;1\&quot; |  [optional] |
|**transportPriority** | [**TransportPriorityEnum**](#TransportPriorityEnum) | REPL &#x3D; Next Truck &lt;br&gt; RUSH &#x3D; Small Package &lt;br&gt; REPL offers could be present from Michelin and/or extended supplier. REPL offer from extended supplier would typically result in a same day or next day delivery.&lt;br&gt; REPL offers from Michelin could also include \&quot;backorder\&quot; offers designated by deliveryDate &#x3D; 2999-12-31 &lt;br&gt; If order is for pickup from supplier DC, this value would be set as null |  |
|**pickUp** | [**PickUpEnum**](#PickUpEnum) | Indicator &#x3D; \&quot;Y\&quot; in order request would indicate customer intends to pick up product from local supplier warehouse. &lt;br&gt; If order is for pickup from supplier DC, set value as \&quot;Y\&quot;.&lt;br&gt; If order is not for pickup from supplier DC, set value as null and set transportPriority field. |  |
|**deliveryRemarks** | **String** |  |  [optional] |
|**customerReference** | [**EDIWheelC11OrderCreationRequestAllOfCustomerReference**](EDIWheelC11OrderCreationRequestAllOfCustomerReference.md) |  |  |
|**supplierParty** | [**EDIWheelC11OrderCreationRequestAllOfSupplierParty**](EDIWheelC11OrderCreationRequestAllOfSupplierParty.md) |  |  |
|**buyerParty** | [**EDIWheelC11OrderCreationRequestAllOfBuyerParty**](EDIWheelC11OrderCreationRequestAllOfBuyerParty.md) |  |  |
|**consignee** | [**EDIWheelC11OrderCreationRequestAllOfConsignee**](EDIWheelC11OrderCreationRequestAllOfConsignee.md) |  |  [optional] |
|**orderLine** | [**List&lt;EDIWheelC11OrderCreationRequestAllOfOrderLine&gt;**](EDIWheelC11OrderCreationRequestAllOfOrderLine.md) |  |  [optional] |



## Enum: TransportPriorityEnum

| Name | Value |
|---- | -----|
| REPL | &quot;REPL&quot; |
| RUSH | &quot;RUSH&quot; |



## Enum: PickUpEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |



