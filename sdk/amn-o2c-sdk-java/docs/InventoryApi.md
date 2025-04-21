# InventoryApi

All URIs are relative to *https://indus.api.michelin.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**stockAmnC11InquiryPost**](InventoryApi.md#stockAmnC11InquiryPost) | **POST** /stock/amn/C1_1/inquiry | Query inventory in real-time |


<a id="stockAmnC11InquiryPost"></a>
# **stockAmnC11InquiryPost**
> EDIWheelC11StockInquiryResponse stockAmnC11InquiryPost(edIWheelC11StockInquiryRequest)

Query inventory in real-time

Query inventory in real-time

### Example
```java
// Import classes:
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.auth.*;
import com.michelin.adk.amn.models.*;
import com.michelin.adk.amn.o2c.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://indus.api.michelin.com");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    EDIWheelC11StockInquiryRequest edIWheelC11StockInquiryRequest = new EDIWheelC11StockInquiryRequest(); // EDIWheelC11StockInquiryRequest | 
    try {
      EDIWheelC11StockInquiryResponse result = apiInstance.stockAmnC11InquiryPost(edIWheelC11StockInquiryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#stockAmnC11InquiryPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edIWheelC11StockInquiryRequest** | [**EDIWheelC11StockInquiryRequest**](EDIWheelC11StockInquiryRequest.md)|  | |

### Return type

[**EDIWheelC11StockInquiryResponse**](EDIWheelC11StockInquiryResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials), [apikey](../README.md#apikey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inquiry Quoted |  -  |
| **400** | Invalid Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **408** | Request Timeout |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

