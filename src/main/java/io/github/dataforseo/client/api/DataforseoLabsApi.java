package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.DataforseoLabsIdListRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsIdListResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsStatusResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsErrorsRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsErrorsResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsLocationsAndLanguagesResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsCategoriesResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleAvailableHistoryResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordIdeasLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordIdeasLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleTopSearchesLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleTopSearchesLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleRankedKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleRankedKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleSubdomainsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleSubdomainsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleRelevantPagesLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleRelevantPagesLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGooglePageIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGooglePageIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingCompetitorsDomainLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingCompetitorsDomainLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingDomainIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingDomainIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingDomainRankOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingDomainRankOverviewLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingPageIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingPageIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingRankedKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingRankedKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingRelatedKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingRelatedKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingRelevantPagesLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingRelevantPagesLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingSerpCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingSerpCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingSubdomainsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsBingSubdomainsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleAppCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleAppCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleBulkAppMetricsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleBulkAppMetricsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleAppCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleAppCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class DataforseoLabsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DataforseoLabsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataforseoLabsApi(ApiClient apiClient) {
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


    public okhttp3.Call dataforseoLabsIdListCall(List<DataforseoLabsIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/id_list";

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
        private okhttp3.Call dataforseoLabsIdListValidateBeforeCall(List<DataforseoLabsIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return dataforseoLabsIdListCall(payload, _callback);
 
        }
 
        public DataforseoLabsIdListResponseInfo dataforseoLabsIdList(List<DataforseoLabsIdListRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsIdListResponseInfo> localVarResp = dataforseoLabsIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsIdListResponseInfo> dataforseoLabsIdListWithHttpInfo(List<DataforseoLabsIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = dataforseoLabsIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call dataforseoLabsIdListAsync(List<DataforseoLabsIdListRequestInfo> payload, final ApiCallback<DataforseoLabsIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = dataforseoLabsIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call dataforseoLabsStatusCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/dataforseo_labs/status";
   

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
    private okhttp3.Call dataforseoLabsStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return dataforseoLabsStatusCall(_callback);

    }

    public DataforseoLabsStatusResponseInfo dataforseoLabsStatus() throws ApiException {
       ApiResponse<DataforseoLabsStatusResponseInfo> localVarResp = dataforseoLabsStatusWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DataforseoLabsStatusResponseInfo> dataforseoLabsStatusWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = dataforseoLabsStatusValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DataforseoLabsStatusResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call dataforseoLabsStatusAsync(final ApiCallback<DataforseoLabsStatusResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = dataforseoLabsStatusValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DataforseoLabsStatusResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call dataforseoLabsErrorsCall(List<DataforseoLabsErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/errors";

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
        private okhttp3.Call dataforseoLabsErrorsValidateBeforeCall(List<DataforseoLabsErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return dataforseoLabsErrorsCall(payload, _callback);
 
        }
 
        public DataforseoLabsErrorsResponseInfo dataforseoLabsErrors(List<DataforseoLabsErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsErrorsResponseInfo> localVarResp = dataforseoLabsErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsErrorsResponseInfo> dataforseoLabsErrorsWithHttpInfo(List<DataforseoLabsErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = dataforseoLabsErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call dataforseoLabsErrorsAsync(List<DataforseoLabsErrorsRequestInfo> payload, final ApiCallback<DataforseoLabsErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = dataforseoLabsErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call availableFiltersCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/dataforseo_labs/available_filters";
   

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
    private okhttp3.Call availableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return availableFiltersCall(_callback);

    }

    public DataforseoLabsAvailableFiltersResponseInfo availableFilters() throws ApiException {
       ApiResponse<DataforseoLabsAvailableFiltersResponseInfo> localVarResp = availableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DataforseoLabsAvailableFiltersResponseInfo> availableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = availableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DataforseoLabsAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call availableFiltersAsync(final ApiCallback<DataforseoLabsAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = availableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DataforseoLabsAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call dataforseoLabsLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/dataforseo_labs/locations_and_languages";
   

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
    private okhttp3.Call dataforseoLabsLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return dataforseoLabsLocationsAndLanguagesCall(_callback);

    }

    public DataforseoLabsLocationsAndLanguagesResponseInfo dataforseoLabsLocationsAndLanguages() throws ApiException {
       ApiResponse<DataforseoLabsLocationsAndLanguagesResponseInfo> localVarResp = dataforseoLabsLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DataforseoLabsLocationsAndLanguagesResponseInfo> dataforseoLabsLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = dataforseoLabsLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DataforseoLabsLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call dataforseoLabsLocationsAndLanguagesAsync(final ApiCallback<DataforseoLabsLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = dataforseoLabsLocationsAndLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DataforseoLabsLocationsAndLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call categoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/dataforseo_labs/categories";
   

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
    private okhttp3.Call categoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return categoriesCall(_callback);

    }

    public DataforseoLabsCategoriesResponseInfo categories() throws ApiException {
       ApiResponse<DataforseoLabsCategoriesResponseInfo> localVarResp = categoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DataforseoLabsCategoriesResponseInfo> categoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = categoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DataforseoLabsCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call categoriesAsync(final ApiCallback<DataforseoLabsCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = categoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DataforseoLabsCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAvailableHistoryCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/dataforseo_labs/google/available_history";
   

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
    private okhttp3.Call googleAvailableHistoryValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAvailableHistoryCall(_callback);

    }

    public DataforseoLabsGoogleAvailableHistoryResponseInfo googleAvailableHistory() throws ApiException {
       ApiResponse<DataforseoLabsGoogleAvailableHistoryResponseInfo> localVarResp = googleAvailableHistoryWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DataforseoLabsGoogleAvailableHistoryResponseInfo> googleAvailableHistoryWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAvailableHistoryValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DataforseoLabsGoogleAvailableHistoryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAvailableHistoryAsync(final ApiCallback<DataforseoLabsGoogleAvailableHistoryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAvailableHistoryValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DataforseoLabsGoogleAvailableHistoryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleKeywordsForSiteLiveCall(List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/keywords_for_site/live";

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
        private okhttp3.Call googleKeywordsForSiteLiveValidateBeforeCall(List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleKeywordsForSiteLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo googleKeywordsForSiteLive(List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo> localVarResp = googleKeywordsForSiteLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo> googleKeywordsForSiteLiveWithHttpInfo(List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleKeywordsForSiteLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleKeywordsForSiteLiveAsync(List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleKeywordsForSiteLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleRelatedKeywordsLiveCall(List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/related_keywords/live";

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
        private okhttp3.Call googleRelatedKeywordsLiveValidateBeforeCall(List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleRelatedKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo googleRelatedKeywordsLive(List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo> localVarResp = googleRelatedKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo> googleRelatedKeywordsLiveWithHttpInfo(List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleRelatedKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleRelatedKeywordsLiveAsync(List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleRelatedKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleKeywordSuggestionsLiveCall(List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/keyword_suggestions/live";

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
        private okhttp3.Call googleKeywordSuggestionsLiveValidateBeforeCall(List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleKeywordSuggestionsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo googleKeywordSuggestionsLive(List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo> localVarResp = googleKeywordSuggestionsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo> googleKeywordSuggestionsLiveWithHttpInfo(List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleKeywordSuggestionsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleKeywordSuggestionsLiveAsync(List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleKeywordSuggestionsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleKeywordIdeasLiveCall(List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/keyword_ideas/live";

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
        private okhttp3.Call googleKeywordIdeasLiveValidateBeforeCall(List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleKeywordIdeasLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleKeywordIdeasLiveResponseInfo googleKeywordIdeasLive(List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleKeywordIdeasLiveResponseInfo> localVarResp = googleKeywordIdeasLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleKeywordIdeasLiveResponseInfo> googleKeywordIdeasLiveWithHttpInfo(List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleKeywordIdeasLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordIdeasLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleKeywordIdeasLiveAsync(List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleKeywordIdeasLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleKeywordIdeasLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordIdeasLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleBulkKeywordDifficultyLiveCall(List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/bulk_keyword_difficulty/live";

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
        private okhttp3.Call googleBulkKeywordDifficultyLiveValidateBeforeCall(List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleBulkKeywordDifficultyLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo googleBulkKeywordDifficultyLive(List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo> localVarResp = googleBulkKeywordDifficultyLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo> googleBulkKeywordDifficultyLiveWithHttpInfo(List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleBulkKeywordDifficultyLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleBulkKeywordDifficultyLiveAsync(List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleBulkKeywordDifficultyLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleSearchIntentLiveCall(List<DataforseoLabsGoogleSearchIntentLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/search_intent/live";

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
        private okhttp3.Call googleSearchIntentLiveValidateBeforeCall(List<DataforseoLabsGoogleSearchIntentLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleSearchIntentLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleSearchIntentLiveResponseInfo googleSearchIntentLive(List<DataforseoLabsGoogleSearchIntentLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleSearchIntentLiveResponseInfo> localVarResp = googleSearchIntentLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleSearchIntentLiveResponseInfo> googleSearchIntentLiveWithHttpInfo(List<DataforseoLabsGoogleSearchIntentLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleSearchIntentLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleSearchIntentLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleSearchIntentLiveAsync(List<DataforseoLabsGoogleSearchIntentLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleSearchIntentLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleSearchIntentLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleSearchIntentLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call dataforseoLabsGoogleCategoriesForKeywordsLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/dataforseo_labs/google/categories_for_keywords/languages";
   

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
    private okhttp3.Call dataforseoLabsGoogleCategoriesForKeywordsLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return dataforseoLabsGoogleCategoriesForKeywordsLanguagesCall(_callback);

    }

    public DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo dataforseoLabsGoogleCategoriesForKeywordsLanguages() throws ApiException {
       ApiResponse<DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo> localVarResp = dataforseoLabsGoogleCategoriesForKeywordsLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo> dataforseoLabsGoogleCategoriesForKeywordsLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = dataforseoLabsGoogleCategoriesForKeywordsLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call dataforseoLabsGoogleCategoriesForKeywordsLanguagesAsync(final ApiCallback<DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = dataforseoLabsGoogleCategoriesForKeywordsLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleCategoriesForDomainLiveCall(List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/categories_for_domain/live";

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
        private okhttp3.Call googleCategoriesForDomainLiveValidateBeforeCall(List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleCategoriesForDomainLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo googleCategoriesForDomainLive(List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo> localVarResp = googleCategoriesForDomainLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo> googleCategoriesForDomainLiveWithHttpInfo(List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleCategoriesForDomainLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleCategoriesForDomainLiveAsync(List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleCategoriesForDomainLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleCategoriesForKeywordsLiveCall(List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/categories_for_keywords/live";

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
        private okhttp3.Call googleCategoriesForKeywordsLiveValidateBeforeCall(List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleCategoriesForKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo googleCategoriesForKeywordsLive(List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo> localVarResp = googleCategoriesForKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo> googleCategoriesForKeywordsLiveWithHttpInfo(List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleCategoriesForKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleCategoriesForKeywordsLiveAsync(List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleCategoriesForKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleKeywordsForCategoriesLiveCall(List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/keywords_for_categories/live";

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
        private okhttp3.Call googleKeywordsForCategoriesLiveValidateBeforeCall(List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleKeywordsForCategoriesLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo googleKeywordsForCategoriesLive(List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo> localVarResp = googleKeywordsForCategoriesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo> googleKeywordsForCategoriesLiveWithHttpInfo(List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleKeywordsForCategoriesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleKeywordsForCategoriesLiveAsync(List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleKeywordsForCategoriesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDomainMetricsByCategoriesLiveCall(List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/domain_metrics_by_categories/live";

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
        private okhttp3.Call googleDomainMetricsByCategoriesLiveValidateBeforeCall(List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDomainMetricsByCategoriesLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo googleDomainMetricsByCategoriesLive(List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo> localVarResp = googleDomainMetricsByCategoriesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo> googleDomainMetricsByCategoriesLiveWithHttpInfo(List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDomainMetricsByCategoriesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDomainMetricsByCategoriesLiveAsync(List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDomainMetricsByCategoriesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleTopSearchesLiveCall(List<DataforseoLabsGoogleTopSearchesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/top_searches/live";

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
        private okhttp3.Call googleTopSearchesLiveValidateBeforeCall(List<DataforseoLabsGoogleTopSearchesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleTopSearchesLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleTopSearchesLiveResponseInfo googleTopSearchesLive(List<DataforseoLabsGoogleTopSearchesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleTopSearchesLiveResponseInfo> localVarResp = googleTopSearchesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleTopSearchesLiveResponseInfo> googleTopSearchesLiveWithHttpInfo(List<DataforseoLabsGoogleTopSearchesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleTopSearchesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleTopSearchesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleTopSearchesLiveAsync(List<DataforseoLabsGoogleTopSearchesLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleTopSearchesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleTopSearchesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleTopSearchesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDomainWhoisOverviewLiveCall(List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/domain_whois_overview/live";

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
        private okhttp3.Call googleDomainWhoisOverviewLiveValidateBeforeCall(List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDomainWhoisOverviewLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo googleDomainWhoisOverviewLive(List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo> localVarResp = googleDomainWhoisOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo> googleDomainWhoisOverviewLiveWithHttpInfo(List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDomainWhoisOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDomainWhoisOverviewLiveAsync(List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDomainWhoisOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleRankedKeywordsLiveCall(List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/ranked_keywords/live";

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
        private okhttp3.Call googleRankedKeywordsLiveValidateBeforeCall(List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleRankedKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleRankedKeywordsLiveResponseInfo googleRankedKeywordsLive(List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleRankedKeywordsLiveResponseInfo> localVarResp = googleRankedKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleRankedKeywordsLiveResponseInfo> googleRankedKeywordsLiveWithHttpInfo(List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleRankedKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleRankedKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleRankedKeywordsLiveAsync(List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleRankedKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleRankedKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleRankedKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleSerpCompetitorsLiveCall(List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/serp_competitors/live";

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
        private okhttp3.Call googleSerpCompetitorsLiveValidateBeforeCall(List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleSerpCompetitorsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo googleSerpCompetitorsLive(List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo> localVarResp = googleSerpCompetitorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo> googleSerpCompetitorsLiveWithHttpInfo(List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleSerpCompetitorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleSerpCompetitorsLiveAsync(List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleSerpCompetitorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleCompetitorsDomainLiveCall(List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/competitors_domain/live";

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
        private okhttp3.Call googleCompetitorsDomainLiveValidateBeforeCall(List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleCompetitorsDomainLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo googleCompetitorsDomainLive(List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo> localVarResp = googleCompetitorsDomainLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo> googleCompetitorsDomainLiveWithHttpInfo(List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleCompetitorsDomainLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleCompetitorsDomainLiveAsync(List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleCompetitorsDomainLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDomainIntersectionLiveCall(List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/domain_intersection/live";

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
        private okhttp3.Call googleDomainIntersectionLiveValidateBeforeCall(List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDomainIntersectionLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleDomainIntersectionLiveResponseInfo googleDomainIntersectionLive(List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleDomainIntersectionLiveResponseInfo> localVarResp = googleDomainIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleDomainIntersectionLiveResponseInfo> googleDomainIntersectionLiveWithHttpInfo(List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDomainIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDomainIntersectionLiveAsync(List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleDomainIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDomainIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleSubdomainsLiveCall(List<DataforseoLabsGoogleSubdomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/subdomains/live";

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
        private okhttp3.Call googleSubdomainsLiveValidateBeforeCall(List<DataforseoLabsGoogleSubdomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleSubdomainsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleSubdomainsLiveResponseInfo googleSubdomainsLive(List<DataforseoLabsGoogleSubdomainsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleSubdomainsLiveResponseInfo> localVarResp = googleSubdomainsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleSubdomainsLiveResponseInfo> googleSubdomainsLiveWithHttpInfo(List<DataforseoLabsGoogleSubdomainsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleSubdomainsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleSubdomainsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleSubdomainsLiveAsync(List<DataforseoLabsGoogleSubdomainsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleSubdomainsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleSubdomainsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleSubdomainsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleRelevantPagesLiveCall(List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/relevant_pages/live";

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
        private okhttp3.Call googleRelevantPagesLiveValidateBeforeCall(List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleRelevantPagesLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleRelevantPagesLiveResponseInfo googleRelevantPagesLive(List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleRelevantPagesLiveResponseInfo> localVarResp = googleRelevantPagesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleRelevantPagesLiveResponseInfo> googleRelevantPagesLiveWithHttpInfo(List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleRelevantPagesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleRelevantPagesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleRelevantPagesLiveAsync(List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleRelevantPagesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleRelevantPagesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleRelevantPagesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDomainRankOverviewLiveCall(List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/domain_rank_overview/live";

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
        private okhttp3.Call googleDomainRankOverviewLiveValidateBeforeCall(List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDomainRankOverviewLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo googleDomainRankOverviewLive(List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo> localVarResp = googleDomainRankOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo> googleDomainRankOverviewLiveWithHttpInfo(List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDomainRankOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDomainRankOverviewLiveAsync(List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDomainRankOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHistoricalSerpsLiveCall(List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/historical_serps/live";

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
        private okhttp3.Call googleHistoricalSerpsLiveValidateBeforeCall(List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHistoricalSerpsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo googleHistoricalSerpsLive(List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo> localVarResp = googleHistoricalSerpsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo> googleHistoricalSerpsLiveWithHttpInfo(List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHistoricalSerpsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHistoricalSerpsLiveAsync(List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHistoricalSerpsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHistoricalRankOverviewLiveCall(List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/historical_rank_overview/live";

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
        private okhttp3.Call googleHistoricalRankOverviewLiveValidateBeforeCall(List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHistoricalRankOverviewLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo googleHistoricalRankOverviewLive(List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo> localVarResp = googleHistoricalRankOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo> googleHistoricalRankOverviewLiveWithHttpInfo(List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHistoricalRankOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHistoricalRankOverviewLiveAsync(List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHistoricalRankOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googlePageIntersectionLiveCall(List<DataforseoLabsGooglePageIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/page_intersection/live";

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
        private okhttp3.Call googlePageIntersectionLiveValidateBeforeCall(List<DataforseoLabsGooglePageIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googlePageIntersectionLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGooglePageIntersectionLiveResponseInfo googlePageIntersectionLive(List<DataforseoLabsGooglePageIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGooglePageIntersectionLiveResponseInfo> localVarResp = googlePageIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGooglePageIntersectionLiveResponseInfo> googlePageIntersectionLiveWithHttpInfo(List<DataforseoLabsGooglePageIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googlePageIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGooglePageIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googlePageIntersectionLiveAsync(List<DataforseoLabsGooglePageIntersectionLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGooglePageIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googlePageIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGooglePageIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleBulkTrafficEstimationLiveCall(List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/bulk_traffic_estimation/live";

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
        private okhttp3.Call googleBulkTrafficEstimationLiveValidateBeforeCall(List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleBulkTrafficEstimationLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo googleBulkTrafficEstimationLive(List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo> localVarResp = googleBulkTrafficEstimationLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo> googleBulkTrafficEstimationLiveWithHttpInfo(List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleBulkTrafficEstimationLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleBulkTrafficEstimationLiveAsync(List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleBulkTrafficEstimationLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHistoricalBulkTrafficEstimationLiveCall(List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/historical_bulk_traffic_estimation/live";

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
        private okhttp3.Call googleHistoricalBulkTrafficEstimationLiveValidateBeforeCall(List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHistoricalBulkTrafficEstimationLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo googleHistoricalBulkTrafficEstimationLive(List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo> localVarResp = googleHistoricalBulkTrafficEstimationLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo> googleHistoricalBulkTrafficEstimationLiveWithHttpInfo(List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHistoricalBulkTrafficEstimationLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHistoricalBulkTrafficEstimationLiveAsync(List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHistoricalBulkTrafficEstimationLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHistoricalKeywordDataLiveCall(List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/historical_keyword_data/live";

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
        private okhttp3.Call googleHistoricalKeywordDataLiveValidateBeforeCall(List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHistoricalKeywordDataLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo googleHistoricalKeywordDataLive(List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo> localVarResp = googleHistoricalKeywordDataLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo> googleHistoricalKeywordDataLiveWithHttpInfo(List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHistoricalKeywordDataLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHistoricalKeywordDataLiveAsync(List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHistoricalKeywordDataLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleKeywordOverviewLiveCall(List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/keyword_overview/live";

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
        private okhttp3.Call googleKeywordOverviewLiveValidateBeforeCall(List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleKeywordOverviewLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleKeywordOverviewLiveResponseInfo googleKeywordOverviewLive(List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleKeywordOverviewLiveResponseInfo> localVarResp = googleKeywordOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleKeywordOverviewLiveResponseInfo> googleKeywordOverviewLiveWithHttpInfo(List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleKeywordOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleKeywordOverviewLiveAsync(List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleKeywordOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleKeywordOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonBulkSearchVolumeLiveCall(List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/amazon/bulk_search_volume/live";

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
        private okhttp3.Call amazonBulkSearchVolumeLiveValidateBeforeCall(List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonBulkSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo amazonBulkSearchVolumeLive(List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo> localVarResp = amazonBulkSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo> amazonBulkSearchVolumeLiveWithHttpInfo(List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonBulkSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonBulkSearchVolumeLiveAsync(List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonBulkSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonRelatedKeywordsLiveCall(List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/amazon/related_keywords/live";

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
        private okhttp3.Call amazonRelatedKeywordsLiveValidateBeforeCall(List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonRelatedKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo amazonRelatedKeywordsLive(List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo> localVarResp = amazonRelatedKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo> amazonRelatedKeywordsLiveWithHttpInfo(List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonRelatedKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonRelatedKeywordsLiveAsync(List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonRelatedKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonRankedKeywordsLiveCall(List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/amazon/ranked_keywords/live";

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
        private okhttp3.Call amazonRankedKeywordsLiveValidateBeforeCall(List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonRankedKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAmazonRankedKeywordsLiveResponseInfo amazonRankedKeywordsLive(List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAmazonRankedKeywordsLiveResponseInfo> localVarResp = amazonRankedKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAmazonRankedKeywordsLiveResponseInfo> amazonRankedKeywordsLiveWithHttpInfo(List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonRankedKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonRankedKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonRankedKeywordsLiveAsync(List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAmazonRankedKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonRankedKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonRankedKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonProductRankOverviewLiveCall(List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/amazon/product_rank_overview/live";

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
        private okhttp3.Call amazonProductRankOverviewLiveValidateBeforeCall(List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonProductRankOverviewLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAmazonProductRankOverviewLiveResponseInfo amazonProductRankOverviewLive(List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAmazonProductRankOverviewLiveResponseInfo> localVarResp = amazonProductRankOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAmazonProductRankOverviewLiveResponseInfo> amazonProductRankOverviewLiveWithHttpInfo(List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonProductRankOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonProductRankOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonProductRankOverviewLiveAsync(List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAmazonProductRankOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonProductRankOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonProductRankOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonProductCompetitorsLiveCall(List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/amazon/product_competitors/live";

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
        private okhttp3.Call amazonProductCompetitorsLiveValidateBeforeCall(List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonProductCompetitorsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAmazonProductCompetitorsLiveResponseInfo amazonProductCompetitorsLive(List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAmazonProductCompetitorsLiveResponseInfo> localVarResp = amazonProductCompetitorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAmazonProductCompetitorsLiveResponseInfo> amazonProductCompetitorsLiveWithHttpInfo(List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonProductCompetitorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonProductCompetitorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonProductCompetitorsLiveAsync(List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAmazonProductCompetitorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonProductCompetitorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonProductCompetitorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call amazonProductKeywordIntersectionsLiveCall(List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/amazon/product_keyword_intersections/live";

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
        private okhttp3.Call amazonProductKeywordIntersectionsLiveValidateBeforeCall(List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return amazonProductKeywordIntersectionsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo amazonProductKeywordIntersectionsLive(List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo> localVarResp = amazonProductKeywordIntersectionsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo> amazonProductKeywordIntersectionsLiveWithHttpInfo(List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = amazonProductKeywordIntersectionsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call amazonProductKeywordIntersectionsLiveAsync(List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = amazonProductKeywordIntersectionsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingBulkKeywordDifficultyLiveCall(List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/bulk_keyword_difficulty/live";

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
        private okhttp3.Call bingBulkKeywordDifficultyLiveValidateBeforeCall(List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingBulkKeywordDifficultyLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo bingBulkKeywordDifficultyLive(List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo> localVarResp = bingBulkKeywordDifficultyLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo> bingBulkKeywordDifficultyLiveWithHttpInfo(List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingBulkKeywordDifficultyLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingBulkKeywordDifficultyLiveAsync(List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingBulkKeywordDifficultyLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingBulkTrafficEstimationLiveCall(List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/bulk_traffic_estimation/live";

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
        private okhttp3.Call bingBulkTrafficEstimationLiveValidateBeforeCall(List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingBulkTrafficEstimationLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo bingBulkTrafficEstimationLive(List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo> localVarResp = bingBulkTrafficEstimationLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo> bingBulkTrafficEstimationLiveWithHttpInfo(List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingBulkTrafficEstimationLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingBulkTrafficEstimationLiveAsync(List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingBulkTrafficEstimationLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingCompetitorsDomainLiveCall(List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/competitors_domain/live";

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
        private okhttp3.Call bingCompetitorsDomainLiveValidateBeforeCall(List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingCompetitorsDomainLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingCompetitorsDomainLiveResponseInfo bingCompetitorsDomainLive(List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingCompetitorsDomainLiveResponseInfo> localVarResp = bingCompetitorsDomainLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingCompetitorsDomainLiveResponseInfo> bingCompetitorsDomainLiveWithHttpInfo(List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingCompetitorsDomainLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingCompetitorsDomainLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingCompetitorsDomainLiveAsync(List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingCompetitorsDomainLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingCompetitorsDomainLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingCompetitorsDomainLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingDomainIntersectionLiveCall(List<DataforseoLabsBingDomainIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/domain_intersection/live";

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
        private okhttp3.Call bingDomainIntersectionLiveValidateBeforeCall(List<DataforseoLabsBingDomainIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingDomainIntersectionLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingDomainIntersectionLiveResponseInfo bingDomainIntersectionLive(List<DataforseoLabsBingDomainIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingDomainIntersectionLiveResponseInfo> localVarResp = bingDomainIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingDomainIntersectionLiveResponseInfo> bingDomainIntersectionLiveWithHttpInfo(List<DataforseoLabsBingDomainIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingDomainIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingDomainIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingDomainIntersectionLiveAsync(List<DataforseoLabsBingDomainIntersectionLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingDomainIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingDomainIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingDomainIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingDomainRankOverviewLiveCall(List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/domain_rank_overview/live";

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
        private okhttp3.Call bingDomainRankOverviewLiveValidateBeforeCall(List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingDomainRankOverviewLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingDomainRankOverviewLiveResponseInfo bingDomainRankOverviewLive(List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingDomainRankOverviewLiveResponseInfo> localVarResp = bingDomainRankOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingDomainRankOverviewLiveResponseInfo> bingDomainRankOverviewLiveWithHttpInfo(List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingDomainRankOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingDomainRankOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingDomainRankOverviewLiveAsync(List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingDomainRankOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingDomainRankOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingDomainRankOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingPageIntersectionLiveCall(List<DataforseoLabsBingPageIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/page_intersection/live";

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
        private okhttp3.Call bingPageIntersectionLiveValidateBeforeCall(List<DataforseoLabsBingPageIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingPageIntersectionLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingPageIntersectionLiveResponseInfo bingPageIntersectionLive(List<DataforseoLabsBingPageIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingPageIntersectionLiveResponseInfo> localVarResp = bingPageIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingPageIntersectionLiveResponseInfo> bingPageIntersectionLiveWithHttpInfo(List<DataforseoLabsBingPageIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingPageIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingPageIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingPageIntersectionLiveAsync(List<DataforseoLabsBingPageIntersectionLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingPageIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingPageIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingPageIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingRankedKeywordsLiveCall(List<DataforseoLabsBingRankedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/ranked_keywords/live";

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
        private okhttp3.Call bingRankedKeywordsLiveValidateBeforeCall(List<DataforseoLabsBingRankedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingRankedKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingRankedKeywordsLiveResponseInfo bingRankedKeywordsLive(List<DataforseoLabsBingRankedKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingRankedKeywordsLiveResponseInfo> localVarResp = bingRankedKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingRankedKeywordsLiveResponseInfo> bingRankedKeywordsLiveWithHttpInfo(List<DataforseoLabsBingRankedKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingRankedKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingRankedKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingRankedKeywordsLiveAsync(List<DataforseoLabsBingRankedKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingRankedKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingRankedKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingRankedKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingRelatedKeywordsLiveCall(List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/related_keywords/live";

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
        private okhttp3.Call bingRelatedKeywordsLiveValidateBeforeCall(List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingRelatedKeywordsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingRelatedKeywordsLiveResponseInfo bingRelatedKeywordsLive(List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingRelatedKeywordsLiveResponseInfo> localVarResp = bingRelatedKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingRelatedKeywordsLiveResponseInfo> bingRelatedKeywordsLiveWithHttpInfo(List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingRelatedKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingRelatedKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingRelatedKeywordsLiveAsync(List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingRelatedKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingRelatedKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingRelatedKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingRelevantPagesLiveCall(List<DataforseoLabsBingRelevantPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/relevant_pages/live";

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
        private okhttp3.Call bingRelevantPagesLiveValidateBeforeCall(List<DataforseoLabsBingRelevantPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingRelevantPagesLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingRelevantPagesLiveResponseInfo bingRelevantPagesLive(List<DataforseoLabsBingRelevantPagesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingRelevantPagesLiveResponseInfo> localVarResp = bingRelevantPagesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingRelevantPagesLiveResponseInfo> bingRelevantPagesLiveWithHttpInfo(List<DataforseoLabsBingRelevantPagesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingRelevantPagesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingRelevantPagesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingRelevantPagesLiveAsync(List<DataforseoLabsBingRelevantPagesLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingRelevantPagesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingRelevantPagesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingRelevantPagesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingSerpCompetitorsLiveCall(List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/serp_competitors/live";

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
        private okhttp3.Call bingSerpCompetitorsLiveValidateBeforeCall(List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingSerpCompetitorsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingSerpCompetitorsLiveResponseInfo bingSerpCompetitorsLive(List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingSerpCompetitorsLiveResponseInfo> localVarResp = bingSerpCompetitorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingSerpCompetitorsLiveResponseInfo> bingSerpCompetitorsLiveWithHttpInfo(List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingSerpCompetitorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingSerpCompetitorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingSerpCompetitorsLiveAsync(List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingSerpCompetitorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingSerpCompetitorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingSerpCompetitorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingSubdomainsLiveCall(List<DataforseoLabsBingSubdomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/bing/subdomains/live";

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
        private okhttp3.Call bingSubdomainsLiveValidateBeforeCall(List<DataforseoLabsBingSubdomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingSubdomainsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsBingSubdomainsLiveResponseInfo bingSubdomainsLive(List<DataforseoLabsBingSubdomainsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsBingSubdomainsLiveResponseInfo> localVarResp = bingSubdomainsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsBingSubdomainsLiveResponseInfo> bingSubdomainsLiveWithHttpInfo(List<DataforseoLabsBingSubdomainsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingSubdomainsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingSubdomainsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingSubdomainsLiveAsync(List<DataforseoLabsBingSubdomainsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsBingSubdomainsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingSubdomainsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsBingSubdomainsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleBulkAppMetricsLiveCall(List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/bulk_app_metrics/live";

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
        private okhttp3.Call googleBulkAppMetricsLiveValidateBeforeCall(List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleBulkAppMetricsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo googleBulkAppMetricsLive(List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo> localVarResp = googleBulkAppMetricsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo> googleBulkAppMetricsLiveWithHttpInfo(List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleBulkAppMetricsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleBulkAppMetricsLiveAsync(List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleBulkAppMetricsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleKeywordsForAppLiveCall(List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/keywords_for_app/live";

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
        private okhttp3.Call googleKeywordsForAppLiveValidateBeforeCall(List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleKeywordsForAppLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleKeywordsForAppLiveResponseInfo googleKeywordsForAppLive(List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleKeywordsForAppLiveResponseInfo> localVarResp = googleKeywordsForAppLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleKeywordsForAppLiveResponseInfo> googleKeywordsForAppLiveWithHttpInfo(List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleKeywordsForAppLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordsForAppLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleKeywordsForAppLiveAsync(List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleKeywordsForAppLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleKeywordsForAppLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleKeywordsForAppLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAppCompetitorsLiveCall(List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/app_competitors/live";

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
        private okhttp3.Call googleAppCompetitorsLiveValidateBeforeCall(List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppCompetitorsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleAppCompetitorsLiveResponseInfo googleAppCompetitorsLive(List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleAppCompetitorsLiveResponseInfo> localVarResp = googleAppCompetitorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleAppCompetitorsLiveResponseInfo> googleAppCompetitorsLiveWithHttpInfo(List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppCompetitorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleAppCompetitorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppCompetitorsLiveAsync(List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleAppCompetitorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppCompetitorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleAppCompetitorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAppIntersectionLiveCall(List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/google/app_intersection/live";

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
        private okhttp3.Call googleAppIntersectionLiveValidateBeforeCall(List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAppIntersectionLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsGoogleAppIntersectionLiveResponseInfo googleAppIntersectionLive(List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsGoogleAppIntersectionLiveResponseInfo> localVarResp = googleAppIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsGoogleAppIntersectionLiveResponseInfo> googleAppIntersectionLiveWithHttpInfo(List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAppIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleAppIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAppIntersectionLiveAsync(List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo> payload, final ApiCallback<DataforseoLabsGoogleAppIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAppIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsGoogleAppIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleBulkAppMetricsLiveCall(List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/apple/bulk_app_metrics/live";

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
        private okhttp3.Call appleBulkAppMetricsLiveValidateBeforeCall(List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleBulkAppMetricsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAppleBulkAppMetricsLiveResponseInfo appleBulkAppMetricsLive(List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAppleBulkAppMetricsLiveResponseInfo> localVarResp = appleBulkAppMetricsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAppleBulkAppMetricsLiveResponseInfo> appleBulkAppMetricsLiveWithHttpInfo(List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleBulkAppMetricsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleBulkAppMetricsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleBulkAppMetricsLiveAsync(List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAppleBulkAppMetricsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleBulkAppMetricsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleBulkAppMetricsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleKeywordsForAppLiveCall(List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/apple/keywords_for_app/live";

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
        private okhttp3.Call appleKeywordsForAppLiveValidateBeforeCall(List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleKeywordsForAppLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAppleKeywordsForAppLiveResponseInfo appleKeywordsForAppLive(List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAppleKeywordsForAppLiveResponseInfo> localVarResp = appleKeywordsForAppLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAppleKeywordsForAppLiveResponseInfo> appleKeywordsForAppLiveWithHttpInfo(List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleKeywordsForAppLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleKeywordsForAppLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleKeywordsForAppLiveAsync(List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAppleKeywordsForAppLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleKeywordsForAppLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleKeywordsForAppLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleAppCompetitorsLiveCall(List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/apple/app_competitors/live";

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
        private okhttp3.Call appleAppCompetitorsLiveValidateBeforeCall(List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppCompetitorsLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAppleAppCompetitorsLiveResponseInfo appleAppCompetitorsLive(List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAppleAppCompetitorsLiveResponseInfo> localVarResp = appleAppCompetitorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAppleAppCompetitorsLiveResponseInfo> appleAppCompetitorsLiveWithHttpInfo(List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppCompetitorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleAppCompetitorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppCompetitorsLiveAsync(List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAppleAppCompetitorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppCompetitorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleAppCompetitorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call appleAppIntersectionLiveCall(List<DataforseoLabsAppleAppIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/dataforseo_labs/apple/app_intersection/live";

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
        private okhttp3.Call appleAppIntersectionLiveValidateBeforeCall(List<DataforseoLabsAppleAppIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return appleAppIntersectionLiveCall(payload, _callback);
 
        }
 
        public DataforseoLabsAppleAppIntersectionLiveResponseInfo appleAppIntersectionLive(List<DataforseoLabsAppleAppIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DataforseoLabsAppleAppIntersectionLiveResponseInfo> localVarResp = appleAppIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DataforseoLabsAppleAppIntersectionLiveResponseInfo> appleAppIntersectionLiveWithHttpInfo(List<DataforseoLabsAppleAppIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = appleAppIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleAppIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call appleAppIntersectionLiveAsync(List<DataforseoLabsAppleAppIntersectionLiveRequestInfo> payload, final ApiCallback<DataforseoLabsAppleAppIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = appleAppIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DataforseoLabsAppleAppIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}