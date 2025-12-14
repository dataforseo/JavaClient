package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.ContentAnalysisIdListRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisIdListResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisLocationsResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisLanguagesResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisCategoriesResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisSearchLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisSearchLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class ContentAnalysisApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContentAnalysisApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContentAnalysisApi(ApiClient apiClient) {
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


    public okhttp3.Call contentAnalysisIdListCall(List<ContentAnalysisIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/id_list";

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
        private okhttp3.Call contentAnalysisIdListValidateBeforeCall(List<ContentAnalysisIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return contentAnalysisIdListCall(payload, _callback);
 
        }
 
        public ContentAnalysisIdListResponseInfo contentAnalysisIdList(List<ContentAnalysisIdListRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisIdListResponseInfo> localVarResp = contentAnalysisIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisIdListResponseInfo> contentAnalysisIdListWithHttpInfo(List<ContentAnalysisIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = contentAnalysisIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call contentAnalysisIdListAsync(List<ContentAnalysisIdListRequestInfo> payload, final ApiCallback<ContentAnalysisIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = contentAnalysisIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call contentAnalysisAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/content_analysis/available_filters";
   

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
    private okhttp3.Call contentAnalysisAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return contentAnalysisAvailableFiltersCall(_callback);

    }

    public ContentAnalysisAvailableFiltersResponseInfo contentAnalysisAvailableFilters() throws ApiException {
       ApiResponse<ContentAnalysisAvailableFiltersResponseInfo> localVarResp = contentAnalysisAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentAnalysisAvailableFiltersResponseInfo> contentAnalysisAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = contentAnalysisAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentAnalysisAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call contentAnalysisAvailableFiltersAsync(final ApiCallback<ContentAnalysisAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = contentAnalysisAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentAnalysisAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call locationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/content_analysis/locations";
   

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
    private okhttp3.Call locationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return locationsCall(_callback);

    }

    public ContentAnalysisLocationsResponseInfo locations() throws ApiException {
       ApiResponse<ContentAnalysisLocationsResponseInfo> localVarResp = locationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentAnalysisLocationsResponseInfo> locationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = locationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentAnalysisLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call locationsAsync(final ApiCallback<ContentAnalysisLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = locationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentAnalysisLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call languagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/content_analysis/languages";
   

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
    private okhttp3.Call languagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return languagesCall(_callback);

    }

    public ContentAnalysisLanguagesResponseInfo languages() throws ApiException {
       ApiResponse<ContentAnalysisLanguagesResponseInfo> localVarResp = languagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentAnalysisLanguagesResponseInfo> languagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = languagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentAnalysisLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call languagesAsync(final ApiCallback<ContentAnalysisLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = languagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentAnalysisLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call contentAnalysisCategoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/content_analysis/categories";
   

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
    private okhttp3.Call contentAnalysisCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return contentAnalysisCategoriesCall(_callback);

    }

    public ContentAnalysisCategoriesResponseInfo contentAnalysisCategories() throws ApiException {
       ApiResponse<ContentAnalysisCategoriesResponseInfo> localVarResp = contentAnalysisCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentAnalysisCategoriesResponseInfo> contentAnalysisCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = contentAnalysisCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentAnalysisCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call contentAnalysisCategoriesAsync(final ApiCallback<ContentAnalysisCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = contentAnalysisCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentAnalysisCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call searchLiveCall(List<ContentAnalysisSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/search/live";

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
        private okhttp3.Call searchLiveValidateBeforeCall(List<ContentAnalysisSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return searchLiveCall(payload, _callback);
 
        }
 
        public ContentAnalysisSearchLiveResponseInfo searchLive(List<ContentAnalysisSearchLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisSearchLiveResponseInfo> localVarResp = searchLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisSearchLiveResponseInfo> searchLiveWithHttpInfo(List<ContentAnalysisSearchLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = searchLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisSearchLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call searchLiveAsync(List<ContentAnalysisSearchLiveRequestInfo> payload, final ApiCallback<ContentAnalysisSearchLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = searchLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisSearchLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call contentAnalysisSummaryLiveCall(List<ContentAnalysisSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/summary/live";

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
        private okhttp3.Call contentAnalysisSummaryLiveValidateBeforeCall(List<ContentAnalysisSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return contentAnalysisSummaryLiveCall(payload, _callback);
 
        }
 
        public ContentAnalysisSummaryLiveResponseInfo contentAnalysisSummaryLive(List<ContentAnalysisSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisSummaryLiveResponseInfo> localVarResp = contentAnalysisSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisSummaryLiveResponseInfo> contentAnalysisSummaryLiveWithHttpInfo(List<ContentAnalysisSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = contentAnalysisSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call contentAnalysisSummaryLiveAsync(List<ContentAnalysisSummaryLiveRequestInfo> payload, final ApiCallback<ContentAnalysisSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = contentAnalysisSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call sentimentAnalysisLiveCall(List<ContentAnalysisSentimentAnalysisLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/sentiment_analysis/live";

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
        private okhttp3.Call sentimentAnalysisLiveValidateBeforeCall(List<ContentAnalysisSentimentAnalysisLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return sentimentAnalysisLiveCall(payload, _callback);
 
        }
 
        public ContentAnalysisSentimentAnalysisLiveResponseInfo sentimentAnalysisLive(List<ContentAnalysisSentimentAnalysisLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisSentimentAnalysisLiveResponseInfo> localVarResp = sentimentAnalysisLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisSentimentAnalysisLiveResponseInfo> sentimentAnalysisLiveWithHttpInfo(List<ContentAnalysisSentimentAnalysisLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = sentimentAnalysisLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisSentimentAnalysisLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call sentimentAnalysisLiveAsync(List<ContentAnalysisSentimentAnalysisLiveRequestInfo> payload, final ApiCallback<ContentAnalysisSentimentAnalysisLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = sentimentAnalysisLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisSentimentAnalysisLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call ratingDistributionLiveCall(List<ContentAnalysisRatingDistributionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/rating_distribution/live";

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
        private okhttp3.Call ratingDistributionLiveValidateBeforeCall(List<ContentAnalysisRatingDistributionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return ratingDistributionLiveCall(payload, _callback);
 
        }
 
        public ContentAnalysisRatingDistributionLiveResponseInfo ratingDistributionLive(List<ContentAnalysisRatingDistributionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisRatingDistributionLiveResponseInfo> localVarResp = ratingDistributionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisRatingDistributionLiveResponseInfo> ratingDistributionLiveWithHttpInfo(List<ContentAnalysisRatingDistributionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = ratingDistributionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisRatingDistributionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call ratingDistributionLiveAsync(List<ContentAnalysisRatingDistributionLiveRequestInfo> payload, final ApiCallback<ContentAnalysisRatingDistributionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = ratingDistributionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisRatingDistributionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call phraseTrendsLiveCall(List<ContentAnalysisPhraseTrendsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/phrase_trends/live";

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
        private okhttp3.Call phraseTrendsLiveValidateBeforeCall(List<ContentAnalysisPhraseTrendsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return phraseTrendsLiveCall(payload, _callback);
 
        }
 
        public ContentAnalysisPhraseTrendsLiveResponseInfo phraseTrendsLive(List<ContentAnalysisPhraseTrendsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisPhraseTrendsLiveResponseInfo> localVarResp = phraseTrendsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisPhraseTrendsLiveResponseInfo> phraseTrendsLiveWithHttpInfo(List<ContentAnalysisPhraseTrendsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = phraseTrendsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisPhraseTrendsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call phraseTrendsLiveAsync(List<ContentAnalysisPhraseTrendsLiveRequestInfo> payload, final ApiCallback<ContentAnalysisPhraseTrendsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = phraseTrendsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisPhraseTrendsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call categoryTrendsLiveCall(List<ContentAnalysisCategoryTrendsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/content_analysis/category_trends/live";

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
        private okhttp3.Call categoryTrendsLiveValidateBeforeCall(List<ContentAnalysisCategoryTrendsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return categoryTrendsLiveCall(payload, _callback);
 
        }
 
        public ContentAnalysisCategoryTrendsLiveResponseInfo categoryTrendsLive(List<ContentAnalysisCategoryTrendsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentAnalysisCategoryTrendsLiveResponseInfo> localVarResp = categoryTrendsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentAnalysisCategoryTrendsLiveResponseInfo> categoryTrendsLiveWithHttpInfo(List<ContentAnalysisCategoryTrendsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = categoryTrendsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentAnalysisCategoryTrendsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call categoryTrendsLiveAsync(List<ContentAnalysisCategoryTrendsLiveRequestInfo> payload, final ApiCallback<ContentAnalysisCategoryTrendsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = categoryTrendsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentAnalysisCategoryTrendsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}