

# EDIWheelB34InvoiceListResponseErrorHead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | **String** | Error code if applicable. Error code &#x3D; 0 indicates no error.  Possible header error codes: - 0: No errors occurred. No action required. - 1: At least one item is incorrect. Details are distinctive in the error field on item level. - 907: Invalid consignee(ship-to) party ID number. Consignee PartyID is missing from requests, or invalid, or is not setup or active within supplier system(s). - 915: Buyer (sold-to) party id number invalid. Buyer PartyID is missing or invalid from requests, OR is not setup or active within supplier system(s). - 987: Date range cannot be used in conjunction with other reference(s) as selection criteria. - 999: Miscellaneous header error.  |  [optional] |



