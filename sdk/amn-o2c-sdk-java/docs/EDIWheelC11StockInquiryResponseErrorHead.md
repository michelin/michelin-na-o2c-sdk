

# EDIWheelC11StockInquiryResponseErrorHead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | **String** | Error code if applicable. Error code &#x3D; 0 indicates no error.  Possible header error codes: - 0: No errors occurred. No action required. - 1: At least one item is incorrect. Details are distinctive in the error field on item level. - 303: No connection to ERP system. System is unavailable. - 405: Timeout during processing in ERP system. System has not responded within the expected time parameter. - 907: Invalid consignee(ship-to) party ID number. Consignee PartyID is missing from requests, or invalid, or is not setup or active within supplier system(s). - 915: Buyer (sold-to) party id number invalid. Buyer PartyID is missing or invalid from requests, OR is not setup or active within supplier system(s). - 920: Account not activated for this buyer (sold to) party ID number. Account is not in active status for order placement. - 999: Miscellaneous header error.  |  [optional] |



