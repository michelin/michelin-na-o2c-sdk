

# EDIWheelC11OrderCreationResponseErrorHead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | **String** | Error code if applicable. Error code &#x3D; 0 indicates no error.  Possible header error codes: - 0: No errors occurred. No action required. - 1: At least one item is incorrect. Details are distinctive in the error field on item level. - 303: No connection to ERP system. System is unavailable. - 405: Timeout during processing in ERP system. System has not responded within the expected time parameter. - 901: Document number invalid (identification number of document, blanket order reference, customer reference, additional customer reference number) - 906: Duplicate PO. Customer settings prevent duplicate PO for Michelin DC orders - 907: Invalid consignee(ship-to) party ID number. Consignee PartyID is missing from requests, or invalid, or is not setup or active within supplier system(s). - 909: Invalid purchase order number. Invalid purchase order number format included in order request (where customer requires PO) - 915: Buyer (sold-to) party id number invalid. Buyer PartyID is missing or invalid from requests, OR is not setup or active within supplier system(s). - 920: Account not activated for this buyer (sold to) party ID number. Account is not in active status for order placement. - 925: Invalid Supplier Party ID. Supplier Party ID included in request is invalid. - 942: Min Max Qty Error Validation. Customer quantity setting for order exceeded. - 943: Unable to generate sales order number. Michelin order management system is unable to generate sales order number. Please contact Michelin customer service for further assistance. - 950: Distributor Order Not Allowed. Order request not allowed to designated supplier - 999: Miscellaneous header error.  |  |



