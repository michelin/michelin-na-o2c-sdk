# OrderApi

All URIs are relative to *https://indus.api.michelin.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderAmnC11CreatePost**](OrderApi.md#orderAmnC11CreatePost) | **POST** /order/amn/C1_1/create | Create order in real-time |
| [**orderAmnC11StatusPost**](OrderApi.md#orderAmnC11StatusPost) | **POST** /order/amn/C1_1/status | Query order status in real-time |


<a id="orderAmnC11CreatePost"></a>
# **orderAmnC11CreatePost**
> EDIWheelC11OrderCreationResponse orderAmnC11CreatePost(edIWheelC11OrderCreationRequest)

Create order in real-time

Create order in real-time

### Example
```java
// Import classes:
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.auth.*;
import com.michelin.adk.amn.models.*;
import com.michelin.adk.amn.o2c.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    EDIWheelC11OrderCreationRequest edIWheelC11OrderCreationRequest = new EDIWheelC11OrderCreationRequest(); // EDIWheelC11OrderCreationRequest | 
    try {
      EDIWheelC11OrderCreationResponse result = apiInstance.orderAmnC11CreatePost(edIWheelC11OrderCreationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#orderAmnC11CreatePost");
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
| **edIWheelC11OrderCreationRequest** | [**EDIWheelC11OrderCreationRequest**](EDIWheelC11OrderCreationRequest.md)|  | |

### Return type

[**EDIWheelC11OrderCreationResponse**](EDIWheelC11OrderCreationResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials), [apikey](../README.md#apikey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Created |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

<a id="orderAmnC11StatusPost"></a>
# **orderAmnC11StatusPost**
> EDIWheelC11OrderStatusResponse orderAmnC11StatusPost(edIWheelC11OrderStatusRequest)

Query order status in real-time

Query order status in real-time

### Example
```java
// Import classes:
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.auth.*;
import com.michelin.adk.amn.models.*;
import com.michelin.adk.amn.o2c.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    EDIWheelC11OrderStatusRequest edIWheelC11OrderStatusRequest = new EDIWheelC11OrderStatusRequest(); // EDIWheelC11OrderStatusRequest | 
    try {
      EDIWheelC11OrderStatusResponse result = apiInstance.orderAmnC11StatusPost(edIWheelC11OrderStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#orderAmnC11StatusPost");
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
| **edIWheelC11OrderStatusRequest** | [**EDIWheelC11OrderStatusRequest**](EDIWheelC11OrderStatusRequest.md)|  | |

### Return type

[**EDIWheelC11OrderStatusResponse**](EDIWheelC11OrderStatusResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials), [apikey](../README.md#apikey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order status query responsed |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

