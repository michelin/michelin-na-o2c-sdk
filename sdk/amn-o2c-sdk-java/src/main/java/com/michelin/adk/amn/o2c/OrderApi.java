/*
 * Michelin North America Order-to-Cash APIs
 * These APIs will help you to do business transactions with Michelin.  <br><br><b>Authentication details:</b><br> <br><u>Option A:</u> OAuth2 Client Credentials (recommended) <br><u>Option B:</u> API Key + Basic Authentication (not recommended) <br><br>To request your access, please contact your representative. <br><br>Our services are based on the EDIWHEEL standards. <br>You can find more information on the <a href=\"https://www.ediwheel.com/\" target=\"_blank\">EDIWHEEL website</a>. 
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.michelin.adk.amn.o2c;

import com.michelin.adk.amn.ApiCallback;
import com.michelin.adk.amn.ApiClient;
import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.ApiResponse;
import com.michelin.adk.amn.Configuration;
import com.michelin.adk.amn.Pair;
import com.michelin.adk.amn.ProgressRequestBody;
import com.michelin.adk.amn.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequest;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponse;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusRequest;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for orderAmnC11CreatePost
     * @param edIWheelC11OrderCreationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call orderAmnC11CreatePostCall(EDIWheelC11OrderCreationRequest edIWheelC11OrderCreationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = edIWheelC11OrderCreationRequest;

        // create path and map variables
        String localVarPath = "/order/amn/C1_1/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2ClientCredentials", "apikey", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call orderAmnC11CreatePostValidateBeforeCall(EDIWheelC11OrderCreationRequest edIWheelC11OrderCreationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edIWheelC11OrderCreationRequest' is set
        if (edIWheelC11OrderCreationRequest == null) {
            throw new ApiException("Missing the required parameter 'edIWheelC11OrderCreationRequest' when calling orderAmnC11CreatePost(Async)");
        }

        return orderAmnC11CreatePostCall(edIWheelC11OrderCreationRequest, _callback);

    }

    /**
     * Create order in real-time
     * Create order in real-time
     * @param edIWheelC11OrderCreationRequest  (required)
     * @return EDIWheelC11OrderCreationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public EDIWheelC11OrderCreationResponse orderAmnC11CreatePost(EDIWheelC11OrderCreationRequest edIWheelC11OrderCreationRequest) throws ApiException {
        ApiResponse<EDIWheelC11OrderCreationResponse> localVarResp = orderAmnC11CreatePostWithHttpInfo(edIWheelC11OrderCreationRequest);
        return localVarResp.getData();
    }

    /**
     * Create order in real-time
     * Create order in real-time
     * @param edIWheelC11OrderCreationRequest  (required)
     * @return ApiResponse&lt;EDIWheelC11OrderCreationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<EDIWheelC11OrderCreationResponse> orderAmnC11CreatePostWithHttpInfo(EDIWheelC11OrderCreationRequest edIWheelC11OrderCreationRequest) throws ApiException {
        okhttp3.Call localVarCall = orderAmnC11CreatePostValidateBeforeCall(edIWheelC11OrderCreationRequest, null);
        Type localVarReturnType = new TypeToken<EDIWheelC11OrderCreationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create order in real-time (asynchronously)
     * Create order in real-time
     * @param edIWheelC11OrderCreationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call orderAmnC11CreatePostAsync(EDIWheelC11OrderCreationRequest edIWheelC11OrderCreationRequest, final ApiCallback<EDIWheelC11OrderCreationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = orderAmnC11CreatePostValidateBeforeCall(edIWheelC11OrderCreationRequest, _callback);
        Type localVarReturnType = new TypeToken<EDIWheelC11OrderCreationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for orderAmnC11StatusPost
     * @param edIWheelC11OrderStatusRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order status query responsed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call orderAmnC11StatusPostCall(EDIWheelC11OrderStatusRequest edIWheelC11OrderStatusRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = edIWheelC11OrderStatusRequest;

        // create path and map variables
        String localVarPath = "/order/amn/C1_1/status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2ClientCredentials", "apikey", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call orderAmnC11StatusPostValidateBeforeCall(EDIWheelC11OrderStatusRequest edIWheelC11OrderStatusRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edIWheelC11OrderStatusRequest' is set
        if (edIWheelC11OrderStatusRequest == null) {
            throw new ApiException("Missing the required parameter 'edIWheelC11OrderStatusRequest' when calling orderAmnC11StatusPost(Async)");
        }

        return orderAmnC11StatusPostCall(edIWheelC11OrderStatusRequest, _callback);

    }

    /**
     * Query order status in real-time
     * Query order status in real-time
     * @param edIWheelC11OrderStatusRequest  (required)
     * @return EDIWheelC11OrderStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order status query responsed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public EDIWheelC11OrderStatusResponse orderAmnC11StatusPost(EDIWheelC11OrderStatusRequest edIWheelC11OrderStatusRequest) throws ApiException {
        ApiResponse<EDIWheelC11OrderStatusResponse> localVarResp = orderAmnC11StatusPostWithHttpInfo(edIWheelC11OrderStatusRequest);
        return localVarResp.getData();
    }

    /**
     * Query order status in real-time
     * Query order status in real-time
     * @param edIWheelC11OrderStatusRequest  (required)
     * @return ApiResponse&lt;EDIWheelC11OrderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order status query responsed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<EDIWheelC11OrderStatusResponse> orderAmnC11StatusPostWithHttpInfo(EDIWheelC11OrderStatusRequest edIWheelC11OrderStatusRequest) throws ApiException {
        okhttp3.Call localVarCall = orderAmnC11StatusPostValidateBeforeCall(edIWheelC11OrderStatusRequest, null);
        Type localVarReturnType = new TypeToken<EDIWheelC11OrderStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Query order status in real-time (asynchronously)
     * Query order status in real-time
     * @param edIWheelC11OrderStatusRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order status query responsed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * WWW_Authenticate -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call orderAmnC11StatusPostAsync(EDIWheelC11OrderStatusRequest edIWheelC11OrderStatusRequest, final ApiCallback<EDIWheelC11OrderStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = orderAmnC11StatusPostValidateBeforeCall(edIWheelC11OrderStatusRequest, _callback);
        Type localVarReturnType = new TypeToken<EDIWheelC11OrderStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
