package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.AppendixUserDataResponseInfo;
import io.github.dataforseo.client.model.AppendixErrorsResponseInfo;
import io.github.dataforseo.client.model.AppendixWebhookResendRequestInfo;
import io.github.dataforseo.client.model.AppendixWebhookResendResponseInfo;
import io.github.dataforseo.client.model.AppendixStatusResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


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


    public okhttp3.Call userDataCall( final ApiCallback _callback) throws ApiException {
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

    public AppendixUserDataResponseInfo userData() throws ApiException {
       ApiResponse<AppendixUserDataResponseInfo> localVarResp = userDataWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppendixUserDataResponseInfo> userDataWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = userDataValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppendixUserDataResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call userDataAsync(final ApiCallback<AppendixUserDataResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = userDataValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppendixUserDataResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appendixErrorsCall( final ApiCallback _callback) throws ApiException {
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

    public AppendixErrorsResponseInfo appendixErrors() throws ApiException {
       ApiResponse<AppendixErrorsResponseInfo> localVarResp = appendixErrorsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppendixErrorsResponseInfo> appendixErrorsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appendixErrorsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppendixErrorsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appendixErrorsAsync(final ApiCallback<AppendixErrorsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appendixErrorsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppendixErrorsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call webhookResendCall(List<AppendixWebhookResendRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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

           Object localVarPostBody = payload;

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
        private okhttp3.Call webhookResendValidateBeforeCall(List<AppendixWebhookResendRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return webhookResendCall(payload, _callback);
 
        }
 
        public AppendixWebhookResendResponseInfo webhookResend(List<AppendixWebhookResendRequestInfo> payload) throws ApiException {
            ApiResponse<AppendixWebhookResendResponseInfo> localVarResp = webhookResendWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppendixWebhookResendResponseInfo> webhookResendWithHttpInfo(List<AppendixWebhookResendRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = webhookResendValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppendixWebhookResendResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call webhookResendAsync(List<AppendixWebhookResendRequestInfo> payload, final ApiCallback<AppendixWebhookResendResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = webhookResendValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppendixWebhookResendResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appendixStatusCall( final ApiCallback _callback) throws ApiException {
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

    public AppendixStatusResponseInfo appendixStatus() throws ApiException {
       ApiResponse<AppendixStatusResponseInfo> localVarResp = appendixStatusWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppendixStatusResponseInfo> appendixStatusWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appendixStatusValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppendixStatusResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appendixStatusAsync(final ApiCallback<AppendixStatusResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appendixStatusValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppendixStatusResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }


}