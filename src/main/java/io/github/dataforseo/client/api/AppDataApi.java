package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.AppDataIdListRequestInfo;
import io.github.dataforseo.client.model.AppDataIdListResponseInfo;
import io.github.dataforseo.client.model.AppDataErrorsRequestInfo;
import io.github.dataforseo.client.model.AppDataErrorsResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleCategoriesResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleLocationsResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleLanguagesResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppSearchesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListingsCategoriesResponseInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveRequestInfo;
import io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleCategoriesResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleLocationsResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleLanguagesResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppSearchesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataAppleAppInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppInfoTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListingsCategoriesResponseInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveRequestInfo;
import io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class AppDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AppDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppDataApi(ApiClient apiClient) {
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


    public okhttp3.Call appDataIdListCall(List<AppDataIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/id_list";

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
        private okhttp3.Call appDataIdListValidateBeforeCall(List<AppDataIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appDataIdListCall(payload, _callback);
 
        }
 
        public AppDataIdListResponseInfo appDataIdList(List<AppDataIdListRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataIdListResponseInfo> localVarResp = appDataIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataIdListResponseInfo> appDataIdListWithHttpInfo(List<AppDataIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appDataIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appDataIdListAsync(List<AppDataIdListRequestInfo> payload, final ApiCallback<AppDataIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appDataIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appDataErrorsCall(List<AppDataErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/errors";

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
        private okhttp3.Call appDataErrorsValidateBeforeCall(List<AppDataErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appDataErrorsCall(payload, _callback);
 
        }
 
        public AppDataErrorsResponseInfo appDataErrors(List<AppDataErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataErrorsResponseInfo> localVarResp = appDataErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataErrorsResponseInfo> appDataErrorsWithHttpInfo(List<AppDataErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appDataErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appDataErrorsAsync(List<AppDataErrorsRequestInfo> payload, final ApiCallback<AppDataErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appDataErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleCategoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/categories";
   

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
    private okhttp3.Call googleCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleCategoriesCall(_callback);

    }

    public AppDataGoogleCategoriesResponseInfo googleCategories() throws ApiException {
       ApiResponse<AppDataGoogleCategoriesResponseInfo> localVarResp = googleCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleCategoriesResponseInfo> googleCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleCategoriesAsync(final ApiCallback<AppDataGoogleCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appDataGoogleLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/locations";
   

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
    private okhttp3.Call appDataGoogleLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appDataGoogleLocationsCall(_callback);

    }

    public AppDataGoogleLocationsResponseInfo appDataGoogleLocations() throws ApiException {
       ApiResponse<AppDataGoogleLocationsResponseInfo> localVarResp = appDataGoogleLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleLocationsResponseInfo> appDataGoogleLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appDataGoogleLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appDataGoogleLocationsAsync(final ApiCallback<AppDataGoogleLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appDataGoogleLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appDataGoogleLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


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
    private okhttp3.Call appDataGoogleLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling appDataGoogleLocationsCountry(Async)");
       }

       return appDataGoogleLocationsCountryCall(country, _callback);

    }

    public AppDataGoogleLocationsCountryResponseInfo appDataGoogleLocationsCountry(String country) throws ApiException {
       ApiResponse<AppDataGoogleLocationsCountryResponseInfo> localVarResp = appDataGoogleLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleLocationsCountryResponseInfo> appDataGoogleLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = appDataGoogleLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appDataGoogleLocationsCountryAsync(String country, final ApiCallback<AppDataGoogleLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appDataGoogleLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appDataGoogleLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/languages";
   

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
    private okhttp3.Call appDataGoogleLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appDataGoogleLanguagesCall(_callback);

    }

    public AppDataGoogleLanguagesResponseInfo appDataGoogleLanguages() throws ApiException {
       ApiResponse<AppDataGoogleLanguagesResponseInfo> localVarResp = appDataGoogleLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleLanguagesResponseInfo> appDataGoogleLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appDataGoogleLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appDataGoogleLanguagesAsync(final ApiCallback<AppDataGoogleLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appDataGoogleLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppSearchesTaskPostCall(List<AppDataGoogleAppSearchesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/google/app_searches/task_post";

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
        private okhttp3.Call googleAppSearchesTaskPostValidateBeforeCall(List<AppDataGoogleAppSearchesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppSearchesTaskPostCall(payload, _callback);
 
        }
 
        public AppDataGoogleAppSearchesTaskPostResponseInfo googleAppSearchesTaskPost(List<AppDataGoogleAppSearchesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataGoogleAppSearchesTaskPostResponseInfo> localVarResp = googleAppSearchesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataGoogleAppSearchesTaskPostResponseInfo> googleAppSearchesTaskPostWithHttpInfo(List<AppDataGoogleAppSearchesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppSearchesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppSearchesTaskPostAsync(List<AppDataGoogleAppSearchesTaskPostRequestInfo> payload, final ApiCallback<AppDataGoogleAppSearchesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppSearchesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAppSearchesTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/app_searches/tasks_ready";
   

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
    private okhttp3.Call googleAppSearchesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAppSearchesTasksReadyCall(_callback);

    }

    public AppDataGoogleAppSearchesTasksReadyResponseInfo googleAppSearchesTasksReady() throws ApiException {
       ApiResponse<AppDataGoogleAppSearchesTasksReadyResponseInfo> localVarResp = googleAppSearchesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppSearchesTasksReadyResponseInfo> googleAppSearchesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAppSearchesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppSearchesTasksReadyAsync(final ApiCallback<AppDataGoogleAppSearchesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppSearchesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appDataTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/tasks_ready";
   

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
    private okhttp3.Call appDataTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appDataTasksReadyCall(_callback);

    }

    public AppDataTasksReadyResponseInfo appDataTasksReady() throws ApiException {
       ApiResponse<AppDataTasksReadyResponseInfo> localVarResp = appDataTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataTasksReadyResponseInfo> appDataTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appDataTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appDataTasksReadyAsync(final ApiCallback<AppDataTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appDataTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppSearchesTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_searches/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppSearchesTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppSearchesTaskGetAdvanced(Async)");
       }

       return googleAppSearchesTaskGetAdvancedCall(id, _callback);

    }

    public AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo googleAppSearchesTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo> localVarResp = googleAppSearchesTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo> googleAppSearchesTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppSearchesTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppSearchesTaskGetAdvancedAsync(String id, final ApiCallback<AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppSearchesTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppSearchesTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_searches/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppSearchesTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppSearchesTaskGetHtml(Async)");
       }

       return googleAppSearchesTaskGetHtmlCall(id, _callback);

    }

    public AppDataGoogleAppSearchesTaskGetHtmlResponseInfo googleAppSearchesTaskGetHtml(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppSearchesTaskGetHtmlResponseInfo> localVarResp = googleAppSearchesTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppSearchesTaskGetHtmlResponseInfo> googleAppSearchesTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppSearchesTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppSearchesTaskGetHtmlAsync(String id, final ApiCallback<AppDataGoogleAppSearchesTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppSearchesTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppSearchesTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppListTaskPostCall(List<AppDataGoogleAppListTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/google/app_list/task_post";

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
        private okhttp3.Call googleAppListTaskPostValidateBeforeCall(List<AppDataGoogleAppListTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppListTaskPostCall(payload, _callback);
 
        }
 
        public AppDataGoogleAppListTaskPostResponseInfo googleAppListTaskPost(List<AppDataGoogleAppListTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataGoogleAppListTaskPostResponseInfo> localVarResp = googleAppListTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataGoogleAppListTaskPostResponseInfo> googleAppListTaskPostWithHttpInfo(List<AppDataGoogleAppListTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppListTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppListTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppListTaskPostAsync(List<AppDataGoogleAppListTaskPostRequestInfo> payload, final ApiCallback<AppDataGoogleAppListTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppListTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppListTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAppListTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/app_list/tasks_ready";
   

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
    private okhttp3.Call googleAppListTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAppListTasksReadyCall(_callback);

    }

    public AppDataGoogleAppListTasksReadyResponseInfo googleAppListTasksReady() throws ApiException {
       ApiResponse<AppDataGoogleAppListTasksReadyResponseInfo> localVarResp = googleAppListTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppListTasksReadyResponseInfo> googleAppListTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAppListTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppListTasksReadyAsync(final ApiCallback<AppDataGoogleAppListTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppListTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppListTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_list/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppListTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppListTaskGetAdvanced(Async)");
       }

       return googleAppListTaskGetAdvancedCall(id, _callback);

    }

    public AppDataGoogleAppListTaskGetAdvancedResponseInfo googleAppListTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppListTaskGetAdvancedResponseInfo> localVarResp = googleAppListTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppListTaskGetAdvancedResponseInfo> googleAppListTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppListTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppListTaskGetAdvancedAsync(String id, final ApiCallback<AppDataGoogleAppListTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppListTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppListTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_list/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppListTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppListTaskGetHtml(Async)");
       }

       return googleAppListTaskGetHtmlCall(id, _callback);

    }

    public AppDataGoogleAppListTaskGetHtmlResponseInfo googleAppListTaskGetHtml(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppListTaskGetHtmlResponseInfo> localVarResp = googleAppListTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppListTaskGetHtmlResponseInfo> googleAppListTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppListTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppListTaskGetHtmlAsync(String id, final ApiCallback<AppDataGoogleAppListTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppListTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppInfoTaskPostCall(List<AppDataGoogleAppInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/google/app_info/task_post";

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
        private okhttp3.Call googleAppInfoTaskPostValidateBeforeCall(List<AppDataGoogleAppInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppInfoTaskPostCall(payload, _callback);
 
        }
 
        public AppDataGoogleAppInfoTaskPostResponseInfo googleAppInfoTaskPost(List<AppDataGoogleAppInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataGoogleAppInfoTaskPostResponseInfo> localVarResp = googleAppInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataGoogleAppInfoTaskPostResponseInfo> googleAppInfoTaskPostWithHttpInfo(List<AppDataGoogleAppInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppInfoTaskPostAsync(List<AppDataGoogleAppInfoTaskPostRequestInfo> payload, final ApiCallback<AppDataGoogleAppInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAppInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/app_info/tasks_ready";
   

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
    private okhttp3.Call googleAppInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAppInfoTasksReadyCall(_callback);

    }

    public AppDataGoogleAppInfoTasksReadyResponseInfo googleAppInfoTasksReady() throws ApiException {
       ApiResponse<AppDataGoogleAppInfoTasksReadyResponseInfo> localVarResp = googleAppInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppInfoTasksReadyResponseInfo> googleAppInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAppInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppInfoTasksReadyAsync(final ApiCallback<AppDataGoogleAppInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppInfoTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_info/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppInfoTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppInfoTaskGetAdvanced(Async)");
       }

       return googleAppInfoTaskGetAdvancedCall(id, _callback);

    }

    public AppDataGoogleAppInfoTaskGetAdvancedResponseInfo googleAppInfoTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppInfoTaskGetAdvancedResponseInfo> localVarResp = googleAppInfoTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppInfoTaskGetAdvancedResponseInfo> googleAppInfoTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppInfoTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppInfoTaskGetAdvancedAsync(String id, final ApiCallback<AppDataGoogleAppInfoTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppInfoTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppInfoTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_info/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppInfoTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppInfoTaskGetHtml(Async)");
       }

       return googleAppInfoTaskGetHtmlCall(id, _callback);

    }

    public AppDataGoogleAppInfoTaskGetHtmlResponseInfo googleAppInfoTaskGetHtml(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppInfoTaskGetHtmlResponseInfo> localVarResp = googleAppInfoTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppInfoTaskGetHtmlResponseInfo> googleAppInfoTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppInfoTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppInfoTaskGetHtmlAsync(String id, final ApiCallback<AppDataGoogleAppInfoTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppInfoTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppInfoTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppReviewsTaskPostCall(List<AppDataGoogleAppReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/google/app_reviews/task_post";

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
        private okhttp3.Call googleAppReviewsTaskPostValidateBeforeCall(List<AppDataGoogleAppReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppReviewsTaskPostCall(payload, _callback);
 
        }
 
        public AppDataGoogleAppReviewsTaskPostResponseInfo googleAppReviewsTaskPost(List<AppDataGoogleAppReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataGoogleAppReviewsTaskPostResponseInfo> localVarResp = googleAppReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataGoogleAppReviewsTaskPostResponseInfo> googleAppReviewsTaskPostWithHttpInfo(List<AppDataGoogleAppReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppReviewsTaskPostAsync(List<AppDataGoogleAppReviewsTaskPostRequestInfo> payload, final ApiCallback<AppDataGoogleAppReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAppReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/app_reviews/tasks_ready";
   

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
    private okhttp3.Call googleAppReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAppReviewsTasksReadyCall(_callback);

    }

    public AppDataGoogleAppReviewsTasksReadyResponseInfo googleAppReviewsTasksReady() throws ApiException {
       ApiResponse<AppDataGoogleAppReviewsTasksReadyResponseInfo> localVarResp = googleAppReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppReviewsTasksReadyResponseInfo> googleAppReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAppReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppReviewsTasksReadyAsync(final ApiCallback<AppDataGoogleAppReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppReviewsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_reviews/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppReviewsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppReviewsTaskGetAdvanced(Async)");
       }

       return googleAppReviewsTaskGetAdvancedCall(id, _callback);

    }

    public AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo googleAppReviewsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo> localVarResp = googleAppReviewsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo> googleAppReviewsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppReviewsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppReviewsTaskGetAdvancedAsync(String id, final ApiCallback<AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppReviewsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppReviewsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/google/app_reviews/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAppReviewsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAppReviewsTaskGetHtml(Async)");
       }

       return googleAppReviewsTaskGetHtmlCall(id, _callback);

    }

    public AppDataGoogleAppReviewsTaskGetHtmlResponseInfo googleAppReviewsTaskGetHtml(String id) throws ApiException {
       ApiResponse<AppDataGoogleAppReviewsTaskGetHtmlResponseInfo> localVarResp = googleAppReviewsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppReviewsTaskGetHtmlResponseInfo> googleAppReviewsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAppReviewsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppReviewsTaskGetHtmlAsync(String id, final ApiCallback<AppDataGoogleAppReviewsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppReviewsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppReviewsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppListingsCategoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/google/app_listings/categories";
   

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
    private okhttp3.Call googleAppListingsCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAppListingsCategoriesCall(_callback);

    }

    public AppDataGoogleAppListingsCategoriesResponseInfo googleAppListingsCategories() throws ApiException {
       ApiResponse<AppDataGoogleAppListingsCategoriesResponseInfo> localVarResp = googleAppListingsCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataGoogleAppListingsCategoriesResponseInfo> googleAppListingsCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAppListingsCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListingsCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAppListingsCategoriesAsync(final ApiCallback<AppDataGoogleAppListingsCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAppListingsCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataGoogleAppListingsCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAppListingsSearchLiveCall(List<AppDataGoogleAppListingsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/google/app_listings/search/live";

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
        private okhttp3.Call googleAppListingsSearchLiveValidateBeforeCall(List<AppDataGoogleAppListingsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppListingsSearchLiveCall(payload, _callback);
 
        }
 
        public AppDataGoogleAppListingsSearchLiveResponseInfo googleAppListingsSearchLive(List<AppDataGoogleAppListingsSearchLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataGoogleAppListingsSearchLiveResponseInfo> localVarResp = googleAppListingsSearchLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataGoogleAppListingsSearchLiveResponseInfo> googleAppListingsSearchLiveWithHttpInfo(List<AppDataGoogleAppListingsSearchLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppListingsSearchLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppListingsSearchLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppListingsSearchLiveAsync(List<AppDataGoogleAppListingsSearchLiveRequestInfo> payload, final ApiCallback<AppDataGoogleAppListingsSearchLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppListingsSearchLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataGoogleAppListingsSearchLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleCategoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/categories";
   

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
    private okhttp3.Call appleCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleCategoriesCall(_callback);

    }

    public AppDataAppleCategoriesResponseInfo appleCategories() throws ApiException {
       ApiResponse<AppDataAppleCategoriesResponseInfo> localVarResp = appleCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleCategoriesResponseInfo> appleCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleCategoriesAsync(final ApiCallback<AppDataAppleCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/locations";
   

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
    private okhttp3.Call appleLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleLocationsCall(_callback);

    }

    public AppDataAppleLocationsResponseInfo appleLocations() throws ApiException {
       ApiResponse<AppDataAppleLocationsResponseInfo> localVarResp = appleLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleLocationsResponseInfo> appleLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleLocationsAsync(final ApiCallback<AppDataAppleLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/languages";
   

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
    private okhttp3.Call appleLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleLanguagesCall(_callback);

    }

    public AppDataAppleLanguagesResponseInfo appleLanguages() throws ApiException {
       ApiResponse<AppDataAppleLanguagesResponseInfo> localVarResp = appleLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleLanguagesResponseInfo> appleLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleLanguagesAsync(final ApiCallback<AppDataAppleLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppSearchesTaskPostCall(List<AppDataAppleAppSearchesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/apple/app_searches/task_post";

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
        private okhttp3.Call appleAppSearchesTaskPostValidateBeforeCall(List<AppDataAppleAppSearchesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppSearchesTaskPostCall(payload, _callback);
 
        }
 
        public AppDataAppleAppSearchesTaskPostResponseInfo appleAppSearchesTaskPost(List<AppDataAppleAppSearchesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataAppleAppSearchesTaskPostResponseInfo> localVarResp = appleAppSearchesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataAppleAppSearchesTaskPostResponseInfo> appleAppSearchesTaskPostWithHttpInfo(List<AppDataAppleAppSearchesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppSearchesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataAppleAppSearchesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppSearchesTaskPostAsync(List<AppDataAppleAppSearchesTaskPostRequestInfo> payload, final ApiCallback<AppDataAppleAppSearchesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppSearchesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataAppleAppSearchesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleAppSearchesTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/app_searches/tasks_ready";
   

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
    private okhttp3.Call appleAppSearchesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleAppSearchesTasksReadyCall(_callback);

    }

    public AppDataAppleAppSearchesTasksReadyResponseInfo appleAppSearchesTasksReady() throws ApiException {
       ApiResponse<AppDataAppleAppSearchesTasksReadyResponseInfo> localVarResp = appleAppSearchesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppSearchesTasksReadyResponseInfo> appleAppSearchesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleAppSearchesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppSearchesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppSearchesTasksReadyAsync(final ApiCallback<AppDataAppleAppSearchesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppSearchesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppSearchesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppSearchesTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/apple/app_searches/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call appleAppSearchesTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling appleAppSearchesTaskGetAdvanced(Async)");
       }

       return appleAppSearchesTaskGetAdvancedCall(id, _callback);

    }

    public AppDataAppleAppSearchesTaskGetAdvancedResponseInfo appleAppSearchesTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataAppleAppSearchesTaskGetAdvancedResponseInfo> localVarResp = appleAppSearchesTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppSearchesTaskGetAdvancedResponseInfo> appleAppSearchesTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = appleAppSearchesTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppSearchesTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppSearchesTaskGetAdvancedAsync(String id, final ApiCallback<AppDataAppleAppSearchesTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppSearchesTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppSearchesTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppInfoTaskPostCall(List<AppDataAppleAppInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/apple/app_info/task_post";

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
        private okhttp3.Call appleAppInfoTaskPostValidateBeforeCall(List<AppDataAppleAppInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppInfoTaskPostCall(payload, _callback);
 
        }
 
        public AppDataAppleAppInfoTaskPostResponseInfo appleAppInfoTaskPost(List<AppDataAppleAppInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataAppleAppInfoTaskPostResponseInfo> localVarResp = appleAppInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataAppleAppInfoTaskPostResponseInfo> appleAppInfoTaskPostWithHttpInfo(List<AppDataAppleAppInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataAppleAppInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppInfoTaskPostAsync(List<AppDataAppleAppInfoTaskPostRequestInfo> payload, final ApiCallback<AppDataAppleAppInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataAppleAppInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleAppInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/app_info/tasks_ready";
   

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
    private okhttp3.Call appleAppInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleAppInfoTasksReadyCall(_callback);

    }

    public AppDataAppleAppInfoTasksReadyResponseInfo appleAppInfoTasksReady() throws ApiException {
       ApiResponse<AppDataAppleAppInfoTasksReadyResponseInfo> localVarResp = appleAppInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppInfoTasksReadyResponseInfo> appleAppInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleAppInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppInfoTasksReadyAsync(final ApiCallback<AppDataAppleAppInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppInfoTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/apple/app_info/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call appleAppInfoTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling appleAppInfoTaskGetAdvanced(Async)");
       }

       return appleAppInfoTaskGetAdvancedCall(id, _callback);

    }

    public AppDataAppleAppInfoTaskGetAdvancedResponseInfo appleAppInfoTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataAppleAppInfoTaskGetAdvancedResponseInfo> localVarResp = appleAppInfoTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppInfoTaskGetAdvancedResponseInfo> appleAppInfoTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = appleAppInfoTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppInfoTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppInfoTaskGetAdvancedAsync(String id, final ApiCallback<AppDataAppleAppInfoTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppInfoTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppInfoTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppListTaskPostCall(List<AppDataAppleAppListTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/apple/app_list/task_post";

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
        private okhttp3.Call appleAppListTaskPostValidateBeforeCall(List<AppDataAppleAppListTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppListTaskPostCall(payload, _callback);
 
        }
 
        public AppDataAppleAppListTaskPostResponseInfo appleAppListTaskPost(List<AppDataAppleAppListTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataAppleAppListTaskPostResponseInfo> localVarResp = appleAppListTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataAppleAppListTaskPostResponseInfo> appleAppListTaskPostWithHttpInfo(List<AppDataAppleAppListTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppListTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataAppleAppListTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppListTaskPostAsync(List<AppDataAppleAppListTaskPostRequestInfo> payload, final ApiCallback<AppDataAppleAppListTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppListTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataAppleAppListTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleAppListTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/app_list/tasks_ready";
   

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
    private okhttp3.Call appleAppListTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleAppListTasksReadyCall(_callback);

    }

    public AppDataAppleAppListTasksReadyResponseInfo appleAppListTasksReady() throws ApiException {
       ApiResponse<AppDataAppleAppListTasksReadyResponseInfo> localVarResp = appleAppListTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppListTasksReadyResponseInfo> appleAppListTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleAppListTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppListTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppListTasksReadyAsync(final ApiCallback<AppDataAppleAppListTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppListTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppListTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppListTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/apple/app_list/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call appleAppListTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling appleAppListTaskGetAdvanced(Async)");
       }

       return appleAppListTaskGetAdvancedCall(id, _callback);

    }

    public AppDataAppleAppListTaskGetAdvancedResponseInfo appleAppListTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataAppleAppListTaskGetAdvancedResponseInfo> localVarResp = appleAppListTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppListTaskGetAdvancedResponseInfo> appleAppListTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = appleAppListTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppListTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppListTaskGetAdvancedAsync(String id, final ApiCallback<AppDataAppleAppListTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppListTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppListTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppReviewsTaskPostCall(List<AppDataAppleAppReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/apple/app_reviews/task_post";

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
        private okhttp3.Call appleAppReviewsTaskPostValidateBeforeCall(List<AppDataAppleAppReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppReviewsTaskPostCall(payload, _callback);
 
        }
 
        public AppDataAppleAppReviewsTaskPostResponseInfo appleAppReviewsTaskPost(List<AppDataAppleAppReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataAppleAppReviewsTaskPostResponseInfo> localVarResp = appleAppReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataAppleAppReviewsTaskPostResponseInfo> appleAppReviewsTaskPostWithHttpInfo(List<AppDataAppleAppReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataAppleAppReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppReviewsTaskPostAsync(List<AppDataAppleAppReviewsTaskPostRequestInfo> payload, final ApiCallback<AppDataAppleAppReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataAppleAppReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleAppReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/app_reviews/tasks_ready";
   

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
    private okhttp3.Call appleAppReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleAppReviewsTasksReadyCall(_callback);

    }

    public AppDataAppleAppReviewsTasksReadyResponseInfo appleAppReviewsTasksReady() throws ApiException {
       ApiResponse<AppDataAppleAppReviewsTasksReadyResponseInfo> localVarResp = appleAppReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppReviewsTasksReadyResponseInfo> appleAppReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleAppReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppReviewsTasksReadyAsync(final ApiCallback<AppDataAppleAppReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppReviewsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/app_data/apple/app_reviews/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call appleAppReviewsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling appleAppReviewsTaskGetAdvanced(Async)");
       }

       return appleAppReviewsTaskGetAdvancedCall(id, _callback);

    }

    public AppDataAppleAppReviewsTaskGetAdvancedResponseInfo appleAppReviewsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AppDataAppleAppReviewsTaskGetAdvancedResponseInfo> localVarResp = appleAppReviewsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppReviewsTaskGetAdvancedResponseInfo> appleAppReviewsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = appleAppReviewsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppReviewsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppReviewsTaskGetAdvancedAsync(String id, final ApiCallback<AppDataAppleAppReviewsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppReviewsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppReviewsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppListingsCategoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/app_data/apple/app_listings/categories";
   

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
    private okhttp3.Call appleAppListingsCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return appleAppListingsCategoriesCall(_callback);

    }

    public AppDataAppleAppListingsCategoriesResponseInfo appleAppListingsCategories() throws ApiException {
       ApiResponse<AppDataAppleAppListingsCategoriesResponseInfo> localVarResp = appleAppListingsCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AppDataAppleAppListingsCategoriesResponseInfo> appleAppListingsCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = appleAppListingsCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AppDataAppleAppListingsCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call appleAppListingsCategoriesAsync(final ApiCallback<AppDataAppleAppListingsCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = appleAppListingsCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AppDataAppleAppListingsCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call appleAppListingsSearchLiveCall(List<AppDataAppleAppListingsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/app_data/apple/app_listings/search/live";

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
        private okhttp3.Call appleAppListingsSearchLiveValidateBeforeCall(List<AppDataAppleAppListingsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppListingsSearchLiveCall(payload, _callback);
 
        }
 
        public AppDataAppleAppListingsSearchLiveResponseInfo appleAppListingsSearchLive(List<AppDataAppleAppListingsSearchLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AppDataAppleAppListingsSearchLiveResponseInfo> localVarResp = appleAppListingsSearchLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AppDataAppleAppListingsSearchLiveResponseInfo> appleAppListingsSearchLiveWithHttpInfo(List<AppDataAppleAppListingsSearchLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppListingsSearchLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AppDataAppleAppListingsSearchLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppListingsSearchLiveAsync(List<AppDataAppleAppListingsSearchLiveRequestInfo> payload, final ApiCallback<AppDataAppleAppListingsSearchLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppListingsSearchLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AppDataAppleAppListingsSearchLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}