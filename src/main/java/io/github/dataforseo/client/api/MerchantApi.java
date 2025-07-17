package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.MerchantIdListRequestInfo;
import io.github.dataforseo.client.model.MerchantIdListResponseInfo;
import io.github.dataforseo.client.model.MerchantErrorsRequestInfo;
import io.github.dataforseo.client.model.MerchantErrorsResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleLanguagesResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleLocationsResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductsTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductsTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleSellersTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantGoogleSellersTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleSellersTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductSpecTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantGoogleSellersAdUrlResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonLocationsResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonLanguagesResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonProductsTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantAmazonProductsTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonProductsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonAsinTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantAmazonAsinTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonAsinTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonSellersTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantAmazonSellersTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonSellersTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.MerchantAmazonReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetHtmlResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class MerchantApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MerchantApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MerchantApi(ApiClient apiClient) {
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


    public okhttp3.Call merchantIdListCall(List<MerchantIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/id_list";

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
        private okhttp3.Call merchantIdListValidateBeforeCall(List<MerchantIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return merchantIdListCall(payload, _callback);
 
        }
 
        public MerchantIdListResponseInfo merchantIdList(List<MerchantIdListRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantIdListResponseInfo> localVarResp = merchantIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantIdListResponseInfo> merchantIdListWithHttpInfo(List<MerchantIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = merchantIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call merchantIdListAsync(List<MerchantIdListRequestInfo> payload, final ApiCallback<MerchantIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = merchantIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call merchantErrorsCall(List<MerchantErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/errors";

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
        private okhttp3.Call merchantErrorsValidateBeforeCall(List<MerchantErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return merchantErrorsCall(payload, _callback);
 
        }
 
        public MerchantErrorsResponseInfo merchantErrors(List<MerchantErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantErrorsResponseInfo> localVarResp = merchantErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantErrorsResponseInfo> merchantErrorsWithHttpInfo(List<MerchantErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = merchantErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call merchantErrorsAsync(List<MerchantErrorsRequestInfo> payload, final ApiCallback<MerchantErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = merchantErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call merchantGoogleLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/google/languages";
   

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
    private okhttp3.Call merchantGoogleLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return merchantGoogleLanguagesCall(_callback);

    }

    public MerchantGoogleLanguagesResponseInfo merchantGoogleLanguages() throws ApiException {
       ApiResponse<MerchantGoogleLanguagesResponseInfo> localVarResp = merchantGoogleLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleLanguagesResponseInfo> merchantGoogleLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = merchantGoogleLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantGoogleLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantGoogleLanguagesAsync(final ApiCallback<MerchantGoogleLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantGoogleLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call merchantGoogleLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/google/locations";
   

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
    private okhttp3.Call merchantGoogleLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return merchantGoogleLocationsCall(_callback);

    }

    public MerchantGoogleLocationsResponseInfo merchantGoogleLocations() throws ApiException {
       ApiResponse<MerchantGoogleLocationsResponseInfo> localVarResp = merchantGoogleLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleLocationsResponseInfo> merchantGoogleLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = merchantGoogleLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantGoogleLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantGoogleLocationsAsync(final ApiCallback<MerchantGoogleLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantGoogleLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call merchantGoogleLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


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
    private okhttp3.Call merchantGoogleLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling merchantGoogleLocationsCountry(Async)");
       }

       return merchantGoogleLocationsCountryCall(country, _callback);

    }

    public MerchantGoogleLocationsCountryResponseInfo merchantGoogleLocationsCountry(String country) throws ApiException {
       ApiResponse<MerchantGoogleLocationsCountryResponseInfo> localVarResp = merchantGoogleLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleLocationsCountryResponseInfo> merchantGoogleLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = merchantGoogleLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantGoogleLocationsCountryAsync(String country, final ApiCallback<MerchantGoogleLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantGoogleLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductsTaskPostCall(List<MerchantGoogleProductsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/google/products/task_post";

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
        private okhttp3.Call googleProductsTaskPostValidateBeforeCall(List<MerchantGoogleProductsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleProductsTaskPostCall(payload, _callback);
 
        }
 
        public MerchantGoogleProductsTaskPostResponseInfo googleProductsTaskPost(List<MerchantGoogleProductsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantGoogleProductsTaskPostResponseInfo> localVarResp = googleProductsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantGoogleProductsTaskPostResponseInfo> googleProductsTaskPostWithHttpInfo(List<MerchantGoogleProductsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleProductsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantGoogleProductsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleProductsTaskPostAsync(List<MerchantGoogleProductsTaskPostRequestInfo> payload, final ApiCallback<MerchantGoogleProductsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleProductsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantGoogleProductsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleProductsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/google/products/tasks_ready";
   

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
    private okhttp3.Call googleProductsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleProductsTasksReadyCall(_callback);

    }

    public MerchantGoogleProductsTasksReadyResponseInfo googleProductsTasksReady() throws ApiException {
       ApiResponse<MerchantGoogleProductsTasksReadyResponseInfo> localVarResp = googleProductsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductsTasksReadyResponseInfo> googleProductsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleProductsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductsTasksReadyAsync(final ApiCallback<MerchantGoogleProductsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call merchantTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/tasks_ready";
   

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
    private okhttp3.Call merchantTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return merchantTasksReadyCall(_callback);

    }

    public MerchantTasksReadyResponseInfo merchantTasksReady() throws ApiException {
       ApiResponse<MerchantTasksReadyResponseInfo> localVarResp = merchantTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantTasksReadyResponseInfo> merchantTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = merchantTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantTasksReadyAsync(final ApiCallback<MerchantTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/products/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleProductsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleProductsTaskGetAdvanced(Async)");
       }

       return googleProductsTaskGetAdvancedCall(id, _callback);

    }

    public MerchantGoogleProductsTaskGetAdvancedResponseInfo googleProductsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantGoogleProductsTaskGetAdvancedResponseInfo> localVarResp = googleProductsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductsTaskGetAdvancedResponseInfo> googleProductsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleProductsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductsTaskGetAdvancedAsync(String id, final ApiCallback<MerchantGoogleProductsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/products/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleProductsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleProductsTaskGetHtml(Async)");
       }

       return googleProductsTaskGetHtmlCall(id, _callback);

    }

    public MerchantGoogleProductsTaskGetHtmlResponseInfo googleProductsTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantGoogleProductsTaskGetHtmlResponseInfo> localVarResp = googleProductsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductsTaskGetHtmlResponseInfo> googleProductsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleProductsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductsTaskGetHtmlAsync(String id, final ApiCallback<MerchantGoogleProductsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleSellersTaskPostCall(List<MerchantGoogleSellersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/google/sellers/task_post";

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
        private okhttp3.Call googleSellersTaskPostValidateBeforeCall(List<MerchantGoogleSellersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleSellersTaskPostCall(payload, _callback);
 
        }
 
        public MerchantGoogleSellersTaskPostResponseInfo googleSellersTaskPost(List<MerchantGoogleSellersTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantGoogleSellersTaskPostResponseInfo> localVarResp = googleSellersTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantGoogleSellersTaskPostResponseInfo> googleSellersTaskPostWithHttpInfo(List<MerchantGoogleSellersTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleSellersTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantGoogleSellersTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleSellersTaskPostAsync(List<MerchantGoogleSellersTaskPostRequestInfo> payload, final ApiCallback<MerchantGoogleSellersTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleSellersTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantGoogleSellersTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleSellersTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/google/sellers/tasks_ready";
   

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
    private okhttp3.Call googleSellersTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleSellersTasksReadyCall(_callback);

    }

    public MerchantGoogleSellersTasksReadyResponseInfo googleSellersTasksReady() throws ApiException {
       ApiResponse<MerchantGoogleSellersTasksReadyResponseInfo> localVarResp = googleSellersTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleSellersTasksReadyResponseInfo> googleSellersTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleSellersTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSellersTasksReadyAsync(final ApiCallback<MerchantGoogleSellersTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSellersTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleSellersTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/sellers/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleSellersTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleSellersTaskGetAdvanced(Async)");
       }

       return googleSellersTaskGetAdvancedCall(id, _callback);

    }

    public MerchantGoogleSellersTaskGetAdvancedResponseInfo googleSellersTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantGoogleSellersTaskGetAdvancedResponseInfo> localVarResp = googleSellersTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleSellersTaskGetAdvancedResponseInfo> googleSellersTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleSellersTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSellersTaskGetAdvancedAsync(String id, final ApiCallback<MerchantGoogleSellersTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSellersTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleSellersTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/sellers/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleSellersTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleSellersTaskGetHtml(Async)");
       }

       return googleSellersTaskGetHtmlCall(id, _callback);

    }

    public MerchantGoogleSellersTaskGetHtmlResponseInfo googleSellersTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantGoogleSellersTaskGetHtmlResponseInfo> localVarResp = googleSellersTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleSellersTaskGetHtmlResponseInfo> googleSellersTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleSellersTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSellersTaskGetHtmlAsync(String id, final ApiCallback<MerchantGoogleSellersTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSellersTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductSpecTaskPostCall(List<MerchantGoogleProductSpecTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/google/product_spec/task_post";

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
        private okhttp3.Call googleProductSpecTaskPostValidateBeforeCall(List<MerchantGoogleProductSpecTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleProductSpecTaskPostCall(payload, _callback);
 
        }
 
        public MerchantGoogleProductSpecTaskPostResponseInfo googleProductSpecTaskPost(List<MerchantGoogleProductSpecTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantGoogleProductSpecTaskPostResponseInfo> localVarResp = googleProductSpecTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantGoogleProductSpecTaskPostResponseInfo> googleProductSpecTaskPostWithHttpInfo(List<MerchantGoogleProductSpecTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleProductSpecTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleProductSpecTaskPostAsync(List<MerchantGoogleProductSpecTaskPostRequestInfo> payload, final ApiCallback<MerchantGoogleProductSpecTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleProductSpecTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleProductSpecTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/google/product_spec/tasks_ready";
   

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
    private okhttp3.Call googleProductSpecTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleProductSpecTasksReadyCall(_callback);

    }

    public MerchantGoogleProductSpecTasksReadyResponseInfo googleProductSpecTasksReady() throws ApiException {
       ApiResponse<MerchantGoogleProductSpecTasksReadyResponseInfo> localVarResp = googleProductSpecTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductSpecTasksReadyResponseInfo> googleProductSpecTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleProductSpecTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductSpecTasksReadyAsync(final ApiCallback<MerchantGoogleProductSpecTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductSpecTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductSpecTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/product_spec/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleProductSpecTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleProductSpecTaskGetAdvanced(Async)");
       }

       return googleProductSpecTaskGetAdvancedCall(id, _callback);

    }

    public MerchantGoogleProductSpecTaskGetAdvancedResponseInfo googleProductSpecTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantGoogleProductSpecTaskGetAdvancedResponseInfo> localVarResp = googleProductSpecTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductSpecTaskGetAdvancedResponseInfo> googleProductSpecTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleProductSpecTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductSpecTaskGetAdvancedAsync(String id, final ApiCallback<MerchantGoogleProductSpecTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductSpecTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductSpecTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/product_spec/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleProductSpecTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleProductSpecTaskGetHtml(Async)");
       }

       return googleProductSpecTaskGetHtmlCall(id, _callback);

    }

    public MerchantGoogleProductSpecTaskGetHtmlResponseInfo googleProductSpecTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantGoogleProductSpecTaskGetHtmlResponseInfo> localVarResp = googleProductSpecTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductSpecTaskGetHtmlResponseInfo> googleProductSpecTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleProductSpecTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductSpecTaskGetHtmlAsync(String id, final ApiCallback<MerchantGoogleProductSpecTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductSpecTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductSpecTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductInfoTaskPostCall(List<MerchantGoogleProductInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/google/product_info/task_post";

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
        private okhttp3.Call googleProductInfoTaskPostValidateBeforeCall(List<MerchantGoogleProductInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleProductInfoTaskPostCall(payload, _callback);
 
        }
 
        public MerchantGoogleProductInfoTaskPostResponseInfo googleProductInfoTaskPost(List<MerchantGoogleProductInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantGoogleProductInfoTaskPostResponseInfo> localVarResp = googleProductInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantGoogleProductInfoTaskPostResponseInfo> googleProductInfoTaskPostWithHttpInfo(List<MerchantGoogleProductInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleProductInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantGoogleProductInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleProductInfoTaskPostAsync(List<MerchantGoogleProductInfoTaskPostRequestInfo> payload, final ApiCallback<MerchantGoogleProductInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleProductInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantGoogleProductInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleProductInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/google/product_info/tasks_ready";
   

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
    private okhttp3.Call googleProductInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleProductInfoTasksReadyCall(_callback);

    }

    public MerchantGoogleProductInfoTasksReadyResponseInfo googleProductInfoTasksReady() throws ApiException {
       ApiResponse<MerchantGoogleProductInfoTasksReadyResponseInfo> localVarResp = googleProductInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductInfoTasksReadyResponseInfo> googleProductInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleProductInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductInfoTasksReadyAsync(final ApiCallback<MerchantGoogleProductInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleProductInfoTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/product_info/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleProductInfoTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleProductInfoTaskGetAdvanced(Async)");
       }

       return googleProductInfoTaskGetAdvancedCall(id, _callback);

    }

    public MerchantGoogleProductInfoTaskGetAdvancedResponseInfo googleProductInfoTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantGoogleProductInfoTaskGetAdvancedResponseInfo> localVarResp = googleProductInfoTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleProductInfoTaskGetAdvancedResponseInfo> googleProductInfoTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleProductInfoTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductInfoTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleProductInfoTaskGetAdvancedAsync(String id, final ApiCallback<MerchantGoogleProductInfoTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleProductInfoTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleProductInfoTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleSellersAdUrlCall( String shop_ad_aclk,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/google/sellers/ad_url/{shop_ad_aclk}".replace("{" + "shop_ad_aclk" + "}", localVarApiClient.escapeString(shop_ad_aclk.toString()));


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
    private okhttp3.Call googleSellersAdUrlValidateBeforeCall(String shop_ad_aclk, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'shop_ad_aclk' is set
       if (shop_ad_aclk == null) {
           throw new ApiException("Missing the required parameter 'shop_ad_aclk' when calling googleSellersAdUrl(Async)");
       }

       return googleSellersAdUrlCall(shop_ad_aclk, _callback);

    }

    public MerchantGoogleSellersAdUrlResponseInfo googleSellersAdUrl(String shop_ad_aclk) throws ApiException {
       ApiResponse<MerchantGoogleSellersAdUrlResponseInfo> localVarResp = googleSellersAdUrlWithHttpInfo(shop_ad_aclk);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantGoogleSellersAdUrlResponseInfo> googleSellersAdUrlWithHttpInfo(String shop_ad_aclk) throws ApiException {
       okhttp3.Call localVarCall = googleSellersAdUrlValidateBeforeCall(shop_ad_aclk, null);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersAdUrlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSellersAdUrlAsync(String shop_ad_aclk, final ApiCallback<MerchantGoogleSellersAdUrlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSellersAdUrlValidateBeforeCall(shop_ad_aclk, _callback);
       Type localVarReturnType = new TypeToken<MerchantGoogleSellersAdUrlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call merchantAmazonLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/amazon/locations";
   

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
    private okhttp3.Call merchantAmazonLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return merchantAmazonLocationsCall(_callback);

    }

    public MerchantAmazonLocationsResponseInfo merchantAmazonLocations() throws ApiException {
       ApiResponse<MerchantAmazonLocationsResponseInfo> localVarResp = merchantAmazonLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonLocationsResponseInfo> merchantAmazonLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = merchantAmazonLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantAmazonLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantAmazonLocationsAsync(final ApiCallback<MerchantAmazonLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantAmazonLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call merchantAmazonLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


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
    private okhttp3.Call merchantAmazonLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling merchantAmazonLocationsCountry(Async)");
       }

       return merchantAmazonLocationsCountryCall(country, _callback);

    }

    public MerchantAmazonLocationsCountryResponseInfo merchantAmazonLocationsCountry(String country) throws ApiException {
       ApiResponse<MerchantAmazonLocationsCountryResponseInfo> localVarResp = merchantAmazonLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonLocationsCountryResponseInfo> merchantAmazonLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = merchantAmazonLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantAmazonLocationsCountryAsync(String country, final ApiCallback<MerchantAmazonLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantAmazonLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call merchantAmazonLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/amazon/languages";
   

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
    private okhttp3.Call merchantAmazonLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return merchantAmazonLanguagesCall(_callback);

    }

    public MerchantAmazonLanguagesResponseInfo merchantAmazonLanguages() throws ApiException {
       ApiResponse<MerchantAmazonLanguagesResponseInfo> localVarResp = merchantAmazonLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonLanguagesResponseInfo> merchantAmazonLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = merchantAmazonLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantAmazonLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call merchantAmazonLanguagesAsync(final ApiCallback<MerchantAmazonLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = merchantAmazonLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonProductsTaskPostCall(List<MerchantAmazonProductsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/amazon/products/task_post";

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
        private okhttp3.Call amazonProductsTaskPostValidateBeforeCall(List<MerchantAmazonProductsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonProductsTaskPostCall(payload, _callback);
 
        }
 
        public MerchantAmazonProductsTaskPostResponseInfo amazonProductsTaskPost(List<MerchantAmazonProductsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantAmazonProductsTaskPostResponseInfo> localVarResp = amazonProductsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantAmazonProductsTaskPostResponseInfo> amazonProductsTaskPostWithHttpInfo(List<MerchantAmazonProductsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonProductsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantAmazonProductsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonProductsTaskPostAsync(List<MerchantAmazonProductsTaskPostRequestInfo> payload, final ApiCallback<MerchantAmazonProductsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonProductsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantAmazonProductsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonProductsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/amazon/products/tasks_ready";
   

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
    private okhttp3.Call amazonProductsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return amazonProductsTasksReadyCall(_callback);

    }

    public MerchantAmazonProductsTasksReadyResponseInfo amazonProductsTasksReady() throws ApiException {
       ApiResponse<MerchantAmazonProductsTasksReadyResponseInfo> localVarResp = amazonProductsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonProductsTasksReadyResponseInfo> amazonProductsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = amazonProductsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantAmazonProductsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonProductsTasksReadyAsync(final ApiCallback<MerchantAmazonProductsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonProductsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonProductsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonProductsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/products/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonProductsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonProductsTaskGetAdvanced(Async)");
       }

       return amazonProductsTaskGetAdvancedCall(id, _callback);

    }

    public MerchantAmazonProductsTaskGetAdvancedResponseInfo amazonProductsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantAmazonProductsTaskGetAdvancedResponseInfo> localVarResp = amazonProductsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonProductsTaskGetAdvancedResponseInfo> amazonProductsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonProductsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonProductsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonProductsTaskGetAdvancedAsync(String id, final ApiCallback<MerchantAmazonProductsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonProductsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonProductsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonProductsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/products/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonProductsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonProductsTaskGetHtml(Async)");
       }

       return amazonProductsTaskGetHtmlCall(id, _callback);

    }

    public MerchantAmazonProductsTaskGetHtmlResponseInfo amazonProductsTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantAmazonProductsTaskGetHtmlResponseInfo> localVarResp = amazonProductsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonProductsTaskGetHtmlResponseInfo> amazonProductsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonProductsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonProductsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonProductsTaskGetHtmlAsync(String id, final ApiCallback<MerchantAmazonProductsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonProductsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonProductsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonAsinTaskPostCall(List<MerchantAmazonAsinTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/amazon/asin/task_post";

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
        private okhttp3.Call amazonAsinTaskPostValidateBeforeCall(List<MerchantAmazonAsinTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonAsinTaskPostCall(payload, _callback);
 
        }
 
        public MerchantAmazonAsinTaskPostResponseInfo amazonAsinTaskPost(List<MerchantAmazonAsinTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantAmazonAsinTaskPostResponseInfo> localVarResp = amazonAsinTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantAmazonAsinTaskPostResponseInfo> amazonAsinTaskPostWithHttpInfo(List<MerchantAmazonAsinTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonAsinTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantAmazonAsinTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonAsinTaskPostAsync(List<MerchantAmazonAsinTaskPostRequestInfo> payload, final ApiCallback<MerchantAmazonAsinTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonAsinTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantAmazonAsinTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonAsinTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/amazon/asin/tasks_ready";
   

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
    private okhttp3.Call amazonAsinTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return amazonAsinTasksReadyCall(_callback);

    }

    public MerchantAmazonAsinTasksReadyResponseInfo amazonAsinTasksReady() throws ApiException {
       ApiResponse<MerchantAmazonAsinTasksReadyResponseInfo> localVarResp = amazonAsinTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonAsinTasksReadyResponseInfo> amazonAsinTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = amazonAsinTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantAmazonAsinTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonAsinTasksReadyAsync(final ApiCallback<MerchantAmazonAsinTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonAsinTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonAsinTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonAsinTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/asin/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonAsinTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonAsinTaskGetAdvanced(Async)");
       }

       return amazonAsinTaskGetAdvancedCall(id, _callback);

    }

    public MerchantAmazonAsinTaskGetAdvancedResponseInfo amazonAsinTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantAmazonAsinTaskGetAdvancedResponseInfo> localVarResp = amazonAsinTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonAsinTaskGetAdvancedResponseInfo> amazonAsinTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonAsinTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonAsinTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonAsinTaskGetAdvancedAsync(String id, final ApiCallback<MerchantAmazonAsinTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonAsinTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonAsinTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonAsinTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/asin/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonAsinTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonAsinTaskGetHtml(Async)");
       }

       return amazonAsinTaskGetHtmlCall(id, _callback);

    }

    public MerchantAmazonAsinTaskGetHtmlResponseInfo amazonAsinTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantAmazonAsinTaskGetHtmlResponseInfo> localVarResp = amazonAsinTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonAsinTaskGetHtmlResponseInfo> amazonAsinTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonAsinTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonAsinTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonAsinTaskGetHtmlAsync(String id, final ApiCallback<MerchantAmazonAsinTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonAsinTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonAsinTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonSellersTaskPostCall(List<MerchantAmazonSellersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/amazon/sellers/task_post";

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
        private okhttp3.Call amazonSellersTaskPostValidateBeforeCall(List<MerchantAmazonSellersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonSellersTaskPostCall(payload, _callback);
 
        }
 
        public MerchantAmazonSellersTaskPostResponseInfo amazonSellersTaskPost(List<MerchantAmazonSellersTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantAmazonSellersTaskPostResponseInfo> localVarResp = amazonSellersTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantAmazonSellersTaskPostResponseInfo> amazonSellersTaskPostWithHttpInfo(List<MerchantAmazonSellersTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonSellersTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantAmazonSellersTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonSellersTaskPostAsync(List<MerchantAmazonSellersTaskPostRequestInfo> payload, final ApiCallback<MerchantAmazonSellersTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonSellersTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantAmazonSellersTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonSellersTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/amazon/sellers/tasks_ready";
   

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
    private okhttp3.Call amazonSellersTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return amazonSellersTasksReadyCall(_callback);

    }

    public MerchantAmazonSellersTasksReadyResponseInfo amazonSellersTasksReady() throws ApiException {
       ApiResponse<MerchantAmazonSellersTasksReadyResponseInfo> localVarResp = amazonSellersTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonSellersTasksReadyResponseInfo> amazonSellersTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = amazonSellersTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantAmazonSellersTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonSellersTasksReadyAsync(final ApiCallback<MerchantAmazonSellersTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonSellersTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonSellersTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonSellersTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/sellers/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonSellersTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonSellersTaskGetAdvanced(Async)");
       }

       return amazonSellersTaskGetAdvancedCall(id, _callback);

    }

    public MerchantAmazonSellersTaskGetAdvancedResponseInfo amazonSellersTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantAmazonSellersTaskGetAdvancedResponseInfo> localVarResp = amazonSellersTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonSellersTaskGetAdvancedResponseInfo> amazonSellersTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonSellersTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonSellersTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonSellersTaskGetAdvancedAsync(String id, final ApiCallback<MerchantAmazonSellersTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonSellersTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonSellersTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonSellersTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/sellers/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonSellersTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonSellersTaskGetHtml(Async)");
       }

       return amazonSellersTaskGetHtmlCall(id, _callback);

    }

    public MerchantAmazonSellersTaskGetHtmlResponseInfo amazonSellersTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantAmazonSellersTaskGetHtmlResponseInfo> localVarResp = amazonSellersTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonSellersTaskGetHtmlResponseInfo> amazonSellersTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonSellersTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonSellersTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonSellersTaskGetHtmlAsync(String id, final ApiCallback<MerchantAmazonSellersTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonSellersTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonSellersTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonReviewsTaskPostCall(List<MerchantAmazonReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/merchant/amazon/reviews/task_post";

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
        private okhttp3.Call amazonReviewsTaskPostValidateBeforeCall(List<MerchantAmazonReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonReviewsTaskPostCall(payload, _callback);
 
        }
 
        public MerchantAmazonReviewsTaskPostResponseInfo amazonReviewsTaskPost(List<MerchantAmazonReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<MerchantAmazonReviewsTaskPostResponseInfo> localVarResp = amazonReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<MerchantAmazonReviewsTaskPostResponseInfo> amazonReviewsTaskPostWithHttpInfo(List<MerchantAmazonReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonReviewsTaskPostAsync(List<MerchantAmazonReviewsTaskPostRequestInfo> payload, final ApiCallback<MerchantAmazonReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/merchant/amazon/reviews/tasks_ready";
   

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
    private okhttp3.Call amazonReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return amazonReviewsTasksReadyCall(_callback);

    }

    public MerchantAmazonReviewsTasksReadyResponseInfo amazonReviewsTasksReady() throws ApiException {
       ApiResponse<MerchantAmazonReviewsTasksReadyResponseInfo> localVarResp = amazonReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonReviewsTasksReadyResponseInfo> amazonReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = amazonReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonReviewsTasksReadyAsync(final ApiCallback<MerchantAmazonReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonReviewsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/reviews/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonReviewsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonReviewsTaskGetAdvanced(Async)");
       }

       return amazonReviewsTaskGetAdvancedCall(id, _callback);

    }

    public MerchantAmazonReviewsTaskGetAdvancedResponseInfo amazonReviewsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<MerchantAmazonReviewsTaskGetAdvancedResponseInfo> localVarResp = amazonReviewsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonReviewsTaskGetAdvancedResponseInfo> amazonReviewsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonReviewsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonReviewsTaskGetAdvancedAsync(String id, final ApiCallback<MerchantAmazonReviewsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonReviewsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call amazonReviewsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/merchant/amazon/reviews/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call amazonReviewsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling amazonReviewsTaskGetHtml(Async)");
       }

       return amazonReviewsTaskGetHtmlCall(id, _callback);

    }

    public MerchantAmazonReviewsTaskGetHtmlResponseInfo amazonReviewsTaskGetHtml(String id) throws ApiException {
       ApiResponse<MerchantAmazonReviewsTaskGetHtmlResponseInfo> localVarResp = amazonReviewsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<MerchantAmazonReviewsTaskGetHtmlResponseInfo> amazonReviewsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = amazonReviewsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call amazonReviewsTaskGetHtmlAsync(String id, final ApiCallback<MerchantAmazonReviewsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = amazonReviewsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<MerchantAmazonReviewsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }


}