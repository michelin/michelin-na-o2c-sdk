# InvoiceApi

All URIs are relative to *https://indus.api.michelin.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoiceAmnB34InvoicesPost**](InvoiceApi.md#invoiceAmnB34InvoicesPost) | **POST** /invoice/amn/B3_4/invoices | Get your invoices list. |


<a id="invoiceAmnB34InvoicesPost"></a>
# **invoiceAmnB34InvoicesPost**
> EDIWheelB44InvoiceListResponse invoiceAmnB34InvoicesPost(edIWheelB44InvoiceListRequest)

Get your invoices list.

This service will give you your Michelin invoices.

### Example
```java
// Import classes:
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.auth.*;
import com.michelin.adk.amn.models.*;
import com.michelin.adk.amn.o2c.InvoiceApi;

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

    InvoiceApi apiInstance = new InvoiceApi(defaultClient);
    EDIWheelB44InvoiceListRequest edIWheelB44InvoiceListRequest = new EDIWheelB44InvoiceListRequest(); // EDIWheelB44InvoiceListRequest | 
    try {
      EDIWheelB44InvoiceListResponse result = apiInstance.invoiceAmnB34InvoicesPost(edIWheelB44InvoiceListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#invoiceAmnB34InvoicesPost");
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
| **edIWheelB44InvoiceListRequest** | [**EDIWheelB44InvoiceListRequest**](EDIWheelB44InvoiceListRequest.md)|  | [optional] |

### Return type

[**EDIWheelB44InvoiceListResponse**](EDIWheelB44InvoiceListResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials), [apikey](../README.md#apikey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoices list responsed |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

