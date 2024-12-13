# AuthenticationApi

All URIs are relative to *https://indus.api.michelin.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**idpV2B2bOauth2TokenPost**](AuthenticationApi.md#idpV2B2bOauth2TokenPost) | **POST** /idp/v2/b2b/oauth2/token | Obtain a token to consume the other APIs. |


<a id="idpV2B2bOauth2TokenPost"></a>
# **idpV2B2bOauth2TokenPost**
> AuthenticationTokenResponse idpV2B2bOauth2TokenPost(grantType, clientId, clientSecret)

Obtain a token to consume the other APIs.

This API will give you a valid authorization token to consume the other APIs.

### Example
```java
// Import classes:
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.models.*;
import com.michelin.adk.amn.o2c.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://indus.api.michelin.com");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String grantType = "grantType_example"; // String | 
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    try {
      AuthenticationTokenResponse result = apiInstance.idpV2B2bOauth2TokenPost(grantType, clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#idpV2B2bOauth2TokenPost");
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
| **grantType** | **String**|  | |
| **clientId** | **String**|  | |
| **clientSecret** | **String**|  | |

### Return type

[**AuthenticationTokenResponse**](AuthenticationTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

