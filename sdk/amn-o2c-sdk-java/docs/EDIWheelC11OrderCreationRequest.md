

# EDIWheelC11OrderCreationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | Fixed value \&quot;C1\&quot; |  |
|**variant** | **String** | Fixed value \&quot;1\&quot; |  [optional] |
|**transportPriority** | **Object** |  |  |
|**pickUp** | [**PickUpEnum**](#PickUpEnum) |  |  |
|**deliveryRemarks** | **String** |  |  [optional] |
|**customerReference** | [**EDIWheelC11OrderCreationRequestAllOfCustomerReference**](EDIWheelC11OrderCreationRequestAllOfCustomerReference.md) |  |  |
|**supplierParty** | [**EDIWheelC11OrderCreationRequestAllOfSupplierParty**](EDIWheelC11OrderCreationRequestAllOfSupplierParty.md) |  |  |
|**buyerParty** | [**EDIWheelC11OrderCreationRequestAllOfBuyerParty**](EDIWheelC11OrderCreationRequestAllOfBuyerParty.md) |  |  |
|**consignee** | [**EDIWheelC11OrderCreationRequestAllOfConsignee**](EDIWheelC11OrderCreationRequestAllOfConsignee.md) |  |  [optional] |
|**orderLine** | [**List&lt;EDIWheelC11OrderCreationRequestAllOfOrderLine&gt;**](EDIWheelC11OrderCreationRequestAllOfOrderLine.md) |  |  [optional] |



## Enum: PickUpEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |



