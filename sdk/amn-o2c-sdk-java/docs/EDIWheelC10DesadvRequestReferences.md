

# EDIWheelC10DesadvRequestReferences


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceTypeCode** | [**ReferenceTypeCodeEnum**](#ReferenceTypeCodeEnum) | Reference Type Codes available for use are as follows: VN &#x3D; Michelin Sales Order Number, ON &#x3D; Customer Purchase Order Number. If used in request, responses will be limited to item(s) with the designated referenceTypeCode. Only one referenceTypeCode can be used per request. |  [optional] |
|**documentID** | **String** | Corresponding value for above referenceTypeCode (if used). Only one referenceTypeCode documentID can be used per request. Date range OR Reference value required for searches. |  [optional] |



## Enum: ReferenceTypeCodeEnum

| Name | Value |
|---- | -----|
| VN | &quot;VN&quot; |
| ON | &quot;ON&quot; |



