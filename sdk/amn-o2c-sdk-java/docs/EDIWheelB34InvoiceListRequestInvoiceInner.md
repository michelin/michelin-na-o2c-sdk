

# EDIWheelB34InvoiceListRequestInvoiceInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceIssueFromDate** | **String** | From Date value for Date Range searches. Format YYYY-MM-DD. Date range cannot be used in conjunction with other reference(s) as selection criteria. Date range OR references would need to be included in request. Max date range &#x3D; 30 days. Depending on volume of activity, smaller range searches are recommended. |  [optional] |
|**invoiceIssueToDate** | **String** | To Date value for Date Range searches. Format YYYY-MM-DD. Date range cannot be used in conjunction with other reference(s) as selection criteria. Date range OR references would need to be included in request. Max date range &#x3D; 30 days. Depending on volume of activity, smaller range searches are recommended. |  [optional] |
|**documentTypeCode** | [**DocumentTypeCodeEnum**](#DocumentTypeCodeEnum) | Document Type Codes available for use are as follows: 380 &#x3D; commercial invoice, 381 &#x3D; credit note, 383 &#x3D; debit note. If used in request, responses will be limited to items with the designated documentTypeCode. |  [optional] |
|**buyerParty** | [**EDIWheelB34InvoiceListRequestInvoiceInnerBuyerParty**](EDIWheelB34InvoiceListRequestInvoiceInnerBuyerParty.md) |  |  |
|**consignee** | [**EDIWheelB34InvoiceListRequestInvoiceInnerConsignee**](EDIWheelB34InvoiceListRequestInvoiceInnerConsignee.md) |  |  [optional] |
|**references** | [**EDIWheelB34InvoiceListRequestInvoiceInnerReferences**](EDIWheelB34InvoiceListRequestInvoiceInnerReferences.md) |  |  [optional] |
|**attachment** | [**AttachmentEnum**](#AttachmentEnum) | Attachment dictates response details to include as follows: \&quot;1\&quot; &#x3D; data only, \&quot;2\&quot; &#x3D; data + PDF base64 details, \&quot;3\&quot; &#x3D; PDF base64 details only |  |



## Enum: DocumentTypeCodeEnum

| Name | Value |
|---- | -----|
| _380 | &quot;380&quot; |
| _381 | &quot;381&quot; |
| _383 | &quot;383&quot; |



## Enum: AttachmentEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |



