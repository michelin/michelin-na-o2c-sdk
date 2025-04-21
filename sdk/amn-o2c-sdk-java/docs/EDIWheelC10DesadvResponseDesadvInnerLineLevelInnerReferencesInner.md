

# EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceTypeCode** | [**ReferenceTypeCodeEnum**](#ReferenceTypeCodeEnum) | Reference Type Code: BM &#x3D; Bill of Lading number, ON &#x3D; Customer Purchase Order Number, VN &#x3D; Michelin Sales Order Number, ACC &#x3D; Shipping unit identification |  |
|**documentID** | **String** | Document ID corresponding to the reference type code. This could be Michelin Bill of Lading number, Customer Purchase Order Number, Michelin Sales Order Number, or Trailer ID (where present) |  |
|**lineID** | **String** | Line ID within purchase order or sales order |  [optional] |



## Enum: ReferenceTypeCodeEnum

| Name | Value |
|---- | -----|
| BM | &quot;BM&quot; |
| ON | &quot;ON&quot; |
| VN | &quot;VN&quot; |
| ACC | &quot;ACC&quot; |



