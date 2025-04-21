

# EDIWheelB34InvoiceListResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentID** | **String** | Fixed documentID &#x3D; B3 |  |
|**variant** | **String** | Fixed variant &#x3D; 4 |  |
|**numberOfMessages** | **Integer** | Number of messages returned based on request search criteria. Max response &#x3D; 100 messages. This may include a pagination feature in the future to be able to include more messages. |  |
|**errorHead** | [**EDIWheelB34InvoiceListResponseErrorHead**](EDIWheelB34InvoiceListResponseErrorHead.md) |  |  [optional] |
|**invoice** | [**List&lt;EDIWheelB34InvoiceListResponseInvoiceInner&gt;**](EDIWheelB34InvoiceListResponseInvoiceInner.md) |  |  |



