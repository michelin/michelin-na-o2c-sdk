# AsnApi

All URIs are relative to *https://indus.api.michelin.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**desadvAmnC10DesadvPost**](AsnApi.md#desadvAmnC10DesadvPost) | **POST** /desadv/amn/C1_0/desadv | Get Advanced Shipping Notice |


<a id="desadvAmnC10DesadvPost"></a>
# **desadvAmnC10DesadvPost**
> EDIWheelC10DesadvResponse desadvAmnC10DesadvPost(edIWheelC10DesadvRequest)

Get Advanced Shipping Notice

Get Advanced Shipping Notice

### Example
```java
// Import classes:
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.auth.*;
import com.michelin.adk.amn.models.*;
import com.michelin.adk.amn.o2c.AsnApi;

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

    AsnApi apiInstance = new AsnApi(defaultClient);
    EDIWheelC10DesadvRequest edIWheelC10DesadvRequest = new EDIWheelC10DesadvRequest(); // EDIWheelC10DesadvRequest | 
    try {
      EDIWheelC10DesadvResponse result = apiInstance.desadvAmnC10DesadvPost(edIWheelC10DesadvRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnApi#desadvAmnC10DesadvPost");
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
| **edIWheelC10DesadvRequest** | [**EDIWheelC10DesadvRequest**](EDIWheelC10DesadvRequest.md)|  | |

### Return type

[**EDIWheelC10DesadvResponse**](EDIWheelC10DesadvResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials), [apikey](../README.md#apikey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delivery query responsed |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

