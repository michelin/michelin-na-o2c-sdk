

# EDIWheelB34InvoiceListResponseInvoiceInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issueDate** | **String** | Invoice Transaction Date in format YYYY-MM-DD |  |
|**documentNumber** | **String** | Invoice, Credit or Debit Number. Format &#x3D; 12 numeric digits. Original delivery invoice prefix &#x3D; 1, Debit memo (3rd party transactions) prefix &#x3D; 1, Correction or Debit prefix &#x3D; 5, Correction or Credit prefix &#x3D; 3. |  |
|**documentTypeCode** | **String** | Document Type Code used in request. Document Type Code descriptions: 380 &#x3D; commercial invoice, 381 &#x3D; credit note, 383 &#x3D; debit note. |  |
|**documentCurrency** | **String** | Invoice currency designation. Format &#x3D; three alpha characters: USD (for US Dollar) or CAD (for Canadian Dollar). |  |
|**references** | [**EDIWheelB34InvoiceListResponseInvoiceInnerReferences**](EDIWheelB34InvoiceListResponseInvoiceInnerReferences.md) |  |  [optional] |
|**allowanceOrCharge** | [**List&lt;EDIWheelB34InvoiceListResponseInvoiceInnerAllowanceOrChargeInner&gt;**](EDIWheelB34InvoiceListResponseInvoiceInnerAllowanceOrChargeInner.md) |  |  [optional] |
|**buyerParty** | [**EDIWheelB34InvoiceListResponseInvoiceInnerBuyerParty**](EDIWheelB34InvoiceListResponseInvoiceInnerBuyerParty.md) |  |  |
|**invoiceIssuerParty** | [**EDIWheelB34InvoiceListResponseInvoiceInnerInvoiceIssuerParty**](EDIWheelB34InvoiceListResponseInvoiceInnerInvoiceIssuerParty.md) |  |  [optional] |
|**consignee** | [**EDIWheelB34InvoiceListResponseInvoiceInnerConsignee**](EDIWheelB34InvoiceListResponseInvoiceInnerConsignee.md) |  |  [optional] |
|**sellerParty** | [**EDIWheelB34InvoiceListResponseInvoiceInnerSellerParty**](EDIWheelB34InvoiceListResponseInvoiceInnerSellerParty.md) |  |  [optional] |
|**paymentTerms** | [**List&lt;EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner&gt;**](EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.md) |  |  [optional] |
|**headerNote** | [**EDIWheelB34InvoiceListResponseInvoiceInnerHeaderNote**](EDIWheelB34InvoiceListResponseInvoiceInnerHeaderNote.md) |  |  [optional] |
|**lineLevel** | [**List&lt;EDIWheelB34InvoiceListResponseInvoiceInnerLineLevelInner&gt;**](EDIWheelB34InvoiceListResponseInvoiceInnerLineLevelInner.md) |  |  [optional] |
|**controls** | [**EDIWheelB34InvoiceListResponseInvoiceInnerControls**](EDIWheelB34InvoiceListResponseInvoiceInnerControls.md) |  |  [optional] |
|**summary** | [**EDIWheelB34InvoiceListResponseInvoiceInnerSummary**](EDIWheelB34InvoiceListResponseInvoiceInnerSummary.md) |  |  |
|**attachments** | [**List&lt;EDIWheelB34InvoiceListResponseInvoiceInnerAttachmentsInner&gt;**](EDIWheelB34InvoiceListResponseInvoiceInnerAttachmentsInner.md) | If attachment indicator \&quot;2\&quot; or \&quot;3\&quot; is used in request, additional PDF Base64 details are displayed to allow for PDF conversion. |  [optional] |
|**einvoicingID** | **List&lt;Object&gt;** |  |  [optional] |



