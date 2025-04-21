

# EDIWheelB34InvoiceListRequestInvoiceInnerReferences

Only one references object is allowed. If a reference is used, the from date and to date should not be used. Date range OR references would need to be included in request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceTypeCode** | [**ReferenceTypeCodeEnum**](#ReferenceTypeCodeEnum) | Reference Type Codes available for use are as follows: DQ &#x3D; Michelin Bill of Lading Number (BOL), IV &#x3D; Document Number, ON &#x3D; Customer Purchase Order (PO) Number, VN &#x3D; Order Reference Number. If used in request, responses will be limited to document(s) with the designated referenceTypeCode. Only one referenceTypeCode can be used per request. |  [optional] |
|**documentID** | **String** | Corresponding value for above referenceTypeCode (if used). Only one reference documentID can be used per request. |  [optional] |



## Enum: ReferenceTypeCodeEnum

| Name | Value |
|---- | -----|
| DQ | &quot;DQ&quot; |
| IV | &quot;IV&quot; |
| ON | &quot;ON&quot; |
| VN | &quot;VN&quot; |



