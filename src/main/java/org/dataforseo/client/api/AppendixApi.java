/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.dataforseo.client.api;

import org.dataforseo.client.ApiCallback;
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.ApiResponse;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.Pair;
import org.dataforseo.client.ProgressRequestBody;
import org.dataforseo.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.dataforseo.client.model.AppendixErrorsResponseInfo;
import org.dataforseo.client.model.AppendixStatusResponseInfo;
import org.dataforseo.client.model.AppendixUserDataResponseInfo;
import org.dataforseo.client.model.AppendixWebhookResendRequestInfo;
import org.dataforseo.client.model.AppendixWebhookResendResponseInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppendixApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AppendixApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppendixApi(ApiClient apiClient) {
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
     * Build call for appendixErrors
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call appendixErrorsCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/appendix/errors";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call appendixErrorsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return appendixErrorsCall(_callback);

    }

    /**
     * 
     * This endpoint returns a list of possible DataForSEO API errors and general status codes. Below you will find a list of HTTP response codes and internal messages. We recommend storing the data connected to error codes in your application log and designing a necessary system for handling related exceptional or error conditions. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/errors/?bash&#39;
     * @return AppendixErrorsResponseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public AppendixErrorsResponseInfo appendixErrors() throws ApiException {
        ApiResponse<AppendixErrorsResponseInfo> localVarResp = appendixErrorsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * This endpoint returns a list of possible DataForSEO API errors and general status codes. Below you will find a list of HTTP response codes and internal messages. We recommend storing the data connected to error codes in your application log and designing a necessary system for handling related exceptional or error conditions. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/errors/?bash&#39;
     * @return ApiResponse&lt;AppendixErrorsResponseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppendixErrorsResponseInfo> appendixErrorsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = appendixErrorsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AppendixErrorsResponseInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This endpoint returns a list of possible DataForSEO API errors and general status codes. Below you will find a list of HTTP response codes and internal messages. We recommend storing the data connected to error codes in your application log and designing a necessary system for handling related exceptional or error conditions. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/errors/?bash&#39;
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call appendixErrorsAsync(final ApiCallback<AppendixErrorsResponseInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = appendixErrorsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AppendixErrorsResponseInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for appendixStatus
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call appendixStatusCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/appendix/status";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call appendixStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return appendixStatusCall(_callback);

    }

    /**
     * 
     * By calling this API you will receive detailed information about the current status of all our APIs and endpoints. You will also get a full issue description if a problem occurs. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/status/?bash&#39;
     * @return AppendixStatusResponseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public AppendixStatusResponseInfo appendixStatus() throws ApiException {
        ApiResponse<AppendixStatusResponseInfo> localVarResp = appendixStatusWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * By calling this API you will receive detailed information about the current status of all our APIs and endpoints. You will also get a full issue description if a problem occurs. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/status/?bash&#39;
     * @return ApiResponse&lt;AppendixStatusResponseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppendixStatusResponseInfo> appendixStatusWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = appendixStatusValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AppendixStatusResponseInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * By calling this API you will receive detailed information about the current status of all our APIs and endpoints. You will also get a full issue description if a problem occurs. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/status/?bash&#39;
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call appendixStatusAsync(final ApiCallback<AppendixStatusResponseInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = appendixStatusValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AppendixStatusResponseInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userData
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userDataCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/appendix/user_data";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userDataValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return userDataCall(_callback);

    }

    /**
     * 
     * You will receive detailed information about your API usage, prices, spending and other account details by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/user_data/?bash&#39;
     * @return AppendixUserDataResponseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public AppendixUserDataResponseInfo userData() throws ApiException {
        ApiResponse<AppendixUserDataResponseInfo> localVarResp = userDataWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * You will receive detailed information about your API usage, prices, spending and other account details by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/user_data/?bash&#39;
     * @return ApiResponse&lt;AppendixUserDataResponseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppendixUserDataResponseInfo> userDataWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = userDataValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AppendixUserDataResponseInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * You will receive detailed information about your API usage, prices, spending and other account details by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/user_data/?bash&#39;
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userDataAsync(final ApiCallback<AppendixUserDataResponseInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = userDataValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AppendixUserDataResponseInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for webhookResend
     * @param appendixWebhookResendRequestInfo  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookResendCall(List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = appendixWebhookResendRequestInfo;

        // create path and map variables
        String localVarPath = "/v3/appendix/webhook_resend";

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call webhookResendValidateBeforeCall(List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo, final ApiCallback _callback) throws ApiException {
        return webhookResendCall(appendixWebhookResendRequestInfo, _callback);

    }

    /**
     * 
     * Using this endpoint you can resend webhooks (pingbacks and postbacks) for up to 100 specified tasks. Note: Your account will not be double-charged for resending a webhook. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/webhook_resend/?bash&#39;
     * @param appendixWebhookResendRequestInfo  (optional)
     * @return AppendixWebhookResendResponseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public AppendixWebhookResendResponseInfo webhookResend(List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo) throws ApiException {
        ApiResponse<AppendixWebhookResendResponseInfo> localVarResp = webhookResendWithHttpInfo(appendixWebhookResendRequestInfo);
        return localVarResp.getData();
    }

    /**
     * 
     * Using this endpoint you can resend webhooks (pingbacks and postbacks) for up to 100 specified tasks. Note: Your account will not be double-charged for resending a webhook. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/webhook_resend/?bash&#39;
     * @param appendixWebhookResendRequestInfo  (optional)
     * @return ApiResponse&lt;AppendixWebhookResendResponseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppendixWebhookResendResponseInfo> webhookResendWithHttpInfo(List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo) throws ApiException {
        okhttp3.Call localVarCall = webhookResendValidateBeforeCall(appendixWebhookResendRequestInfo, null);
        Type localVarReturnType = new TypeToken<AppendixWebhookResendResponseInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Using this endpoint you can resend webhooks (pingbacks and postbacks) for up to 100 specified tasks. Note: Your account will not be double-charged for resending a webhook. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/webhook_resend/?bash&#39;
     * @param appendixWebhookResendRequestInfo  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookResendAsync(List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo, final ApiCallback<AppendixWebhookResendResponseInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = webhookResendValidateBeforeCall(appendixWebhookResendRequestInfo, _callback);
        Type localVarReturnType = new TypeToken<AppendixWebhookResendResponseInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}