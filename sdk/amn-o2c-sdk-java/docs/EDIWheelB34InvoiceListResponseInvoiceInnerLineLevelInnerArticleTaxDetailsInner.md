

# EDIWheelB34InvoiceListResponseInvoiceInnerLineLevelInnerArticleTaxDetailsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taxTypeCode** | **String** | Identification of the type of tax or fee applicable by Line ID. Format &#x3D; 3 characters. Potential Tax Type Codes: ENV, FET, GST, LOC, STT, OTH. |  |
|**subCountryCode** | **String** | Tax sub country code by Line ID. Format &#x3D; two character Country (US or CA) - two character State abbreviation. Example: US-SC. |  [optional] |
|**taxRate** | **BigDecimal** | Tax rate by Line ID, where applicable. |  |
|**taxAmount** | [**EDIWheelB34InvoiceListResponseInvoiceInnerLineLevelInnerArticleTaxDetailsInnerTaxAmount**](EDIWheelB34InvoiceListResponseInvoiceInnerLineLevelInnerArticleTaxDetailsInnerTaxAmount.md) |  |  [optional] |



