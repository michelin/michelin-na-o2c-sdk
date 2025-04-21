

# EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | **String** | Line error indicator.  Possible line error codes: - 0: No errors occurred. No action required. - 903: Invalid article identification code. Article identification code used is invalid or inactive. - 904: Invalid requested quantity. Requested quantity is 0. - 919: No authority for brand/sales organization. Product is not authorized for customer to purchase. - 931: Customer price not found or Invalid Marketing Status. Pricing is not established for products or Product not available for purchase. - 934/935: Customer not allowed to create back order. Backorder not allowed for product on order. - 945: MSPN on Hold. Product status is not eligible for ordering. - 947: Invalid requested date. Invalid or missing requested delivery date. - 999: Miscellaneous line error.  |  [optional] |
|**errorText** | **String** | Line error text. |  [optional] |



