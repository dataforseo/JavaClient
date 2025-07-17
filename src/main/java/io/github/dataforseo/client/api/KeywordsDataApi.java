package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.KeywordsDataIdListRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataIdListResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataErrorsRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataErrorsResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsStatusResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsLanguagesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLanguagesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsCategoriesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsExploreLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsExploreLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsDemographyLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsDemographyLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingLocationsResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingLanguagesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationIndustriesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class KeywordsDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public KeywordsDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeywordsDataApi(ApiClient apiClient) {
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


    public okhttp3.Call keywordsDataIdListCall(List<KeywordsDataIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/id_list";

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
        private okhttp3.Call keywordsDataIdListValidateBeforeCall(List<KeywordsDataIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return keywordsDataIdListCall(payload, _callback);
 
        }
 
        public KeywordsDataIdListResponseInfo keywordsDataIdList(List<KeywordsDataIdListRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataIdListResponseInfo> localVarResp = keywordsDataIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataIdListResponseInfo> keywordsDataIdListWithHttpInfo(List<KeywordsDataIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = keywordsDataIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call keywordsDataIdListAsync(List<KeywordsDataIdListRequestInfo> payload, final ApiCallback<KeywordsDataIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = keywordsDataIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataErrorsCall(List<KeywordsDataErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/errors";

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
        private okhttp3.Call keywordsDataErrorsValidateBeforeCall(List<KeywordsDataErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return keywordsDataErrorsCall(payload, _callback);
 
        }
 
        public KeywordsDataErrorsResponseInfo keywordsDataErrors(List<KeywordsDataErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataErrorsResponseInfo> localVarResp = keywordsDataErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataErrorsResponseInfo> keywordsDataErrorsWithHttpInfo(List<KeywordsDataErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = keywordsDataErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call keywordsDataErrorsAsync(List<KeywordsDataErrorsRequestInfo> payload, final ApiCallback<KeywordsDataErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = keywordsDataErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsStatusCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/status";
   

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
    private okhttp3.Call googleAdsStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsStatusCall(_callback);

    }

    public KeywordsDataGoogleAdsStatusResponseInfo googleAdsStatus() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsStatusResponseInfo> localVarResp = googleAdsStatusWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsStatusResponseInfo> googleAdsStatusWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsStatusValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsStatusResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsStatusAsync(final ApiCallback<KeywordsDataGoogleAdsStatusResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsStatusValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsStatusResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataGoogleAdsLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/locations";
   

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
    private okhttp3.Call keywordsDataGoogleAdsLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataGoogleAdsLocationsCall(_callback);

    }

    public KeywordsDataGoogleAdsLocationsResponseInfo keywordsDataGoogleAdsLocations() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsLocationsResponseInfo> localVarResp = keywordsDataGoogleAdsLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsLocationsResponseInfo> keywordsDataGoogleAdsLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataGoogleAdsLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataGoogleAdsLocationsAsync(final ApiCallback<KeywordsDataGoogleAdsLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataGoogleAdsLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataGoogleAdsLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_ads/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


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
    private okhttp3.Call keywordsDataGoogleAdsLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling keywordsDataGoogleAdsLocationsCountry(Async)");
       }

       return keywordsDataGoogleAdsLocationsCountryCall(country, _callback);

    }

    public KeywordsDataGoogleAdsLocationsCountryResponseInfo keywordsDataGoogleAdsLocationsCountry(String country) throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsLocationsCountryResponseInfo> localVarResp = keywordsDataGoogleAdsLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsLocationsCountryResponseInfo> keywordsDataGoogleAdsLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = keywordsDataGoogleAdsLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataGoogleAdsLocationsCountryAsync(String country, final ApiCallback<KeywordsDataGoogleAdsLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataGoogleAdsLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataGoogleAdsLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/languages";
   

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
    private okhttp3.Call keywordsDataGoogleAdsLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataGoogleAdsLanguagesCall(_callback);

    }

    public KeywordsDataGoogleAdsLanguagesResponseInfo keywordsDataGoogleAdsLanguages() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsLanguagesResponseInfo> localVarResp = keywordsDataGoogleAdsLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsLanguagesResponseInfo> keywordsDataGoogleAdsLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataGoogleAdsLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataGoogleAdsLanguagesAsync(final ApiCallback<KeywordsDataGoogleAdsLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataGoogleAdsLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsSearchVolumeTaskPostCall(List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/search_volume/task_post";

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
        private okhttp3.Call googleAdsSearchVolumeTaskPostValidateBeforeCall(List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsSearchVolumeTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo googleAdsSearchVolumeTaskPost(List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo> localVarResp = googleAdsSearchVolumeTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo> googleAdsSearchVolumeTaskPostWithHttpInfo(List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsSearchVolumeTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsSearchVolumeTaskPostAsync(List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsSearchVolumeTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsSearchVolumeTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/search_volume/tasks_ready";
   

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
    private okhttp3.Call googleAdsSearchVolumeTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsSearchVolumeTasksReadyCall(_callback);

    }

    public KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo googleAdsSearchVolumeTasksReady() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo> localVarResp = googleAdsSearchVolumeTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo> googleAdsSearchVolumeTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsSearchVolumeTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsSearchVolumeTasksReadyAsync(final ApiCallback<KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsSearchVolumeTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsSearchVolumeTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_ads/search_volume/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAdsSearchVolumeTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAdsSearchVolumeTaskGet(Async)");
       }

       return googleAdsSearchVolumeTaskGetCall(id, _callback);

    }

    public KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo googleAdsSearchVolumeTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo> localVarResp = googleAdsSearchVolumeTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo> googleAdsSearchVolumeTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAdsSearchVolumeTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsSearchVolumeTaskGetAsync(String id, final ApiCallback<KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsSearchVolumeTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsSearchVolumeLiveCall(List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/search_volume/live";

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
        private okhttp3.Call googleAdsSearchVolumeLiveValidateBeforeCall(List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo googleAdsSearchVolumeLive(List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo> localVarResp = googleAdsSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo> googleAdsSearchVolumeLiveWithHttpInfo(List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsSearchVolumeLiveAsync(List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsKeywordsForSiteTaskPostCall(List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/keywords_for_site/task_post";

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
        private okhttp3.Call googleAdsKeywordsForSiteTaskPostValidateBeforeCall(List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsKeywordsForSiteTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo googleAdsKeywordsForSiteTaskPost(List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo> localVarResp = googleAdsKeywordsForSiteTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo> googleAdsKeywordsForSiteTaskPostWithHttpInfo(List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsKeywordsForSiteTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsKeywordsForSiteTaskPostAsync(List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsKeywordsForSiteTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsKeywordsForSiteTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/keywords_for_site/tasks_ready";
   

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
    private okhttp3.Call googleAdsKeywordsForSiteTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsKeywordsForSiteTasksReadyCall(_callback);

    }

    public KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo googleAdsKeywordsForSiteTasksReady() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo> localVarResp = googleAdsKeywordsForSiteTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo> googleAdsKeywordsForSiteTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsKeywordsForSiteTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsKeywordsForSiteTasksReadyAsync(final ApiCallback<KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsKeywordsForSiteTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsKeywordsForSiteTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_ads/keywords_for_site/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAdsKeywordsForSiteTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAdsKeywordsForSiteTaskGet(Async)");
       }

       return googleAdsKeywordsForSiteTaskGetCall(id, _callback);

    }

    public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo googleAdsKeywordsForSiteTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo> localVarResp = googleAdsKeywordsForSiteTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo> googleAdsKeywordsForSiteTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAdsKeywordsForSiteTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsKeywordsForSiteTaskGetAsync(String id, final ApiCallback<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsKeywordsForSiteTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsKeywordsForSiteLiveCall(List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/keywords_for_site/live";

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
        private okhttp3.Call googleAdsKeywordsForSiteLiveValidateBeforeCall(List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsKeywordsForSiteLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo googleAdsKeywordsForSiteLive(List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo> localVarResp = googleAdsKeywordsForSiteLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo> googleAdsKeywordsForSiteLiveWithHttpInfo(List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsKeywordsForSiteLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsKeywordsForSiteLiveAsync(List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsKeywordsForSiteLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsKeywordsForKeywordsTaskPostCall(List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/keywords_for_keywords/task_post";

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
        private okhttp3.Call googleAdsKeywordsForKeywordsTaskPostValidateBeforeCall(List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsKeywordsForKeywordsTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo googleAdsKeywordsForKeywordsTaskPost(List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo> localVarResp = googleAdsKeywordsForKeywordsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo> googleAdsKeywordsForKeywordsTaskPostWithHttpInfo(List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsKeywordsForKeywordsTaskPostAsync(List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsKeywordsForKeywordsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/keywords_for_keywords/tasks_ready";
   

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
    private okhttp3.Call googleAdsKeywordsForKeywordsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsKeywordsForKeywordsTasksReadyCall(_callback);

    }

    public KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo googleAdsKeywordsForKeywordsTasksReady() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo> localVarResp = googleAdsKeywordsForKeywordsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo> googleAdsKeywordsForKeywordsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsKeywordsForKeywordsTasksReadyAsync(final ApiCallback<KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsKeywordsForKeywordsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_ads/keywords_for_keywords/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAdsKeywordsForKeywordsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAdsKeywordsForKeywordsTaskGet(Async)");
       }

       return googleAdsKeywordsForKeywordsTaskGetCall(id, _callback);

    }

    public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo googleAdsKeywordsForKeywordsTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo> localVarResp = googleAdsKeywordsForKeywordsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo> googleAdsKeywordsForKeywordsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsKeywordsForKeywordsTaskGetAsync(String id, final ApiCallback<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsKeywordsForKeywordsLiveCall(List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/keywords_for_keywords/live";

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
        private okhttp3.Call googleAdsKeywordsForKeywordsLiveValidateBeforeCall(List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsKeywordsForKeywordsLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo googleAdsKeywordsForKeywordsLive(List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo> localVarResp = googleAdsKeywordsForKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo> googleAdsKeywordsForKeywordsLiveWithHttpInfo(List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsKeywordsForKeywordsLiveAsync(List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsKeywordsForKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsAdTrafficByKeywordsTaskPostCall(List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/ad_traffic_by_keywords/task_post";

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
        private okhttp3.Call googleAdsAdTrafficByKeywordsTaskPostValidateBeforeCall(List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsAdTrafficByKeywordsTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo googleAdsAdTrafficByKeywordsTaskPost(List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo> localVarResp = googleAdsAdTrafficByKeywordsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo> googleAdsAdTrafficByKeywordsTaskPostWithHttpInfo(List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsAdTrafficByKeywordsTaskPostAsync(List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsAdTrafficByKeywordsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_ads/ad_traffic_by_keywords/tasks_ready";
   

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
    private okhttp3.Call googleAdsAdTrafficByKeywordsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsAdTrafficByKeywordsTasksReadyCall(_callback);

    }

    public KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo googleAdsAdTrafficByKeywordsTasksReady() throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo> localVarResp = googleAdsAdTrafficByKeywordsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo> googleAdsAdTrafficByKeywordsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsAdTrafficByKeywordsTasksReadyAsync(final ApiCallback<KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsAdTrafficByKeywordsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_ads/ad_traffic_by_keywords/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleAdsAdTrafficByKeywordsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAdsAdTrafficByKeywordsTaskGet(Async)");
       }

       return googleAdsAdTrafficByKeywordsTaskGetCall(id, _callback);

    }

    public KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo googleAdsAdTrafficByKeywordsTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo> localVarResp = googleAdsAdTrafficByKeywordsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo> googleAdsAdTrafficByKeywordsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsAdTrafficByKeywordsTaskGetAsync(String id, final ApiCallback<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsAdTrafficByKeywordsLiveCall(List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_ads/ad_traffic_by_keywords/live";

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
        private okhttp3.Call googleAdsAdTrafficByKeywordsLiveValidateBeforeCall(List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsAdTrafficByKeywordsLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo googleAdsAdTrafficByKeywordsLive(List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo> localVarResp = googleAdsAdTrafficByKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo> googleAdsAdTrafficByKeywordsLiveWithHttpInfo(List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsAdTrafficByKeywordsLiveAsync(List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo> payload, final ApiCallback<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsAdTrafficByKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataGoogleTrendsLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_trends/locations";
   

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
    private okhttp3.Call keywordsDataGoogleTrendsLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataGoogleTrendsLocationsCall(_callback);

    }

    public KeywordsDataGoogleTrendsLocationsResponseInfo keywordsDataGoogleTrendsLocations() throws ApiException {
       ApiResponse<KeywordsDataGoogleTrendsLocationsResponseInfo> localVarResp = keywordsDataGoogleTrendsLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleTrendsLocationsResponseInfo> keywordsDataGoogleTrendsLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataGoogleTrendsLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataGoogleTrendsLocationsAsync(final ApiCallback<KeywordsDataGoogleTrendsLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataGoogleTrendsLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataGoogleTrendsLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_trends/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


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
    private okhttp3.Call keywordsDataGoogleTrendsLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling keywordsDataGoogleTrendsLocationsCountry(Async)");
       }

       return keywordsDataGoogleTrendsLocationsCountryCall(country, _callback);

    }

    public KeywordsDataGoogleTrendsLocationsCountryResponseInfo keywordsDataGoogleTrendsLocationsCountry(String country) throws ApiException {
       ApiResponse<KeywordsDataGoogleTrendsLocationsCountryResponseInfo> localVarResp = keywordsDataGoogleTrendsLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleTrendsLocationsCountryResponseInfo> keywordsDataGoogleTrendsLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = keywordsDataGoogleTrendsLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataGoogleTrendsLocationsCountryAsync(String country, final ApiCallback<KeywordsDataGoogleTrendsLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataGoogleTrendsLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataGoogleTrendsLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_trends/languages";
   

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
    private okhttp3.Call keywordsDataGoogleTrendsLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataGoogleTrendsLanguagesCall(_callback);

    }

    public KeywordsDataGoogleTrendsLanguagesResponseInfo keywordsDataGoogleTrendsLanguages() throws ApiException {
       ApiResponse<KeywordsDataGoogleTrendsLanguagesResponseInfo> localVarResp = keywordsDataGoogleTrendsLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleTrendsLanguagesResponseInfo> keywordsDataGoogleTrendsLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataGoogleTrendsLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataGoogleTrendsLanguagesAsync(final ApiCallback<KeywordsDataGoogleTrendsLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataGoogleTrendsLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleTrendsCategoriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_trends/categories";
   

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
    private okhttp3.Call googleTrendsCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleTrendsCategoriesCall(_callback);

    }

    public KeywordsDataGoogleTrendsCategoriesResponseInfo googleTrendsCategories() throws ApiException {
       ApiResponse<KeywordsDataGoogleTrendsCategoriesResponseInfo> localVarResp = googleTrendsCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleTrendsCategoriesResponseInfo> googleTrendsCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleTrendsCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleTrendsCategoriesAsync(final ApiCallback<KeywordsDataGoogleTrendsCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleTrendsCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleTrendsExploreTaskPostCall(List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_trends/explore/task_post";

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
        private okhttp3.Call googleTrendsExploreTaskPostValidateBeforeCall(List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleTrendsExploreTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleTrendsExploreTaskPostResponseInfo googleTrendsExploreTaskPost(List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleTrendsExploreTaskPostResponseInfo> localVarResp = googleTrendsExploreTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleTrendsExploreTaskPostResponseInfo> googleTrendsExploreTaskPostWithHttpInfo(List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleTrendsExploreTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleTrendsExploreTaskPostAsync(List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataGoogleTrendsExploreTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleTrendsExploreTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleTrendsExploreTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/google_trends/explore/tasks_ready";
   

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
    private okhttp3.Call googleTrendsExploreTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleTrendsExploreTasksReadyCall(_callback);

    }

    public KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo googleTrendsExploreTasksReady() throws ApiException {
       ApiResponse<KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo> localVarResp = googleTrendsExploreTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo> googleTrendsExploreTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleTrendsExploreTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleTrendsExploreTasksReadyAsync(final ApiCallback<KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleTrendsExploreTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleTrendsExploreTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/google_trends/explore/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call googleTrendsExploreTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleTrendsExploreTaskGet(Async)");
       }

       return googleTrendsExploreTaskGetCall(id, _callback);

    }

    public KeywordsDataGoogleTrendsExploreTaskGetResponseInfo googleTrendsExploreTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataGoogleTrendsExploreTaskGetResponseInfo> localVarResp = googleTrendsExploreTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataGoogleTrendsExploreTaskGetResponseInfo> googleTrendsExploreTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleTrendsExploreTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleTrendsExploreTaskGetAsync(String id, final ApiCallback<KeywordsDataGoogleTrendsExploreTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleTrendsExploreTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleTrendsExploreLiveCall(List<KeywordsDataGoogleTrendsExploreLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/google_trends/explore/live";

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
        private okhttp3.Call googleTrendsExploreLiveValidateBeforeCall(List<KeywordsDataGoogleTrendsExploreLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleTrendsExploreLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataGoogleTrendsExploreLiveResponseInfo googleTrendsExploreLive(List<KeywordsDataGoogleTrendsExploreLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataGoogleTrendsExploreLiveResponseInfo> localVarResp = googleTrendsExploreLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataGoogleTrendsExploreLiveResponseInfo> googleTrendsExploreLiveWithHttpInfo(List<KeywordsDataGoogleTrendsExploreLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleTrendsExploreLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleTrendsExploreLiveAsync(List<KeywordsDataGoogleTrendsExploreLiveRequestInfo> payload, final ApiCallback<KeywordsDataGoogleTrendsExploreLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleTrendsExploreLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataGoogleTrendsExploreLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataDataforseoTrendsLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/dataforseo_trends/locations";
   

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
    private okhttp3.Call keywordsDataDataforseoTrendsLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataDataforseoTrendsLocationsCall(_callback);

    }

    public KeywordsDataDataforseoTrendsLocationsResponseInfo keywordsDataDataforseoTrendsLocations() throws ApiException {
       ApiResponse<KeywordsDataDataforseoTrendsLocationsResponseInfo> localVarResp = keywordsDataDataforseoTrendsLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataDataforseoTrendsLocationsResponseInfo> keywordsDataDataforseoTrendsLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataDataforseoTrendsLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataDataforseoTrendsLocationsAsync(final ApiCallback<KeywordsDataDataforseoTrendsLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataDataforseoTrendsLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataDataforseoTrendsLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/dataforseo_trends/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


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
    private okhttp3.Call keywordsDataDataforseoTrendsLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling keywordsDataDataforseoTrendsLocationsCountry(Async)");
       }

       return keywordsDataDataforseoTrendsLocationsCountryCall(country, _callback);

    }

    public KeywordsDataDataforseoTrendsLocationsCountryResponseInfo keywordsDataDataforseoTrendsLocationsCountry(String country) throws ApiException {
       ApiResponse<KeywordsDataDataforseoTrendsLocationsCountryResponseInfo> localVarResp = keywordsDataDataforseoTrendsLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataDataforseoTrendsLocationsCountryResponseInfo> keywordsDataDataforseoTrendsLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = keywordsDataDataforseoTrendsLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataDataforseoTrendsLocationsCountryAsync(String country, final ApiCallback<KeywordsDataDataforseoTrendsLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataDataforseoTrendsLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call dataforseoTrendsExploreLiveCall(List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/dataforseo_trends/explore/live";

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
        private okhttp3.Call dataforseoTrendsExploreLiveValidateBeforeCall(List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return dataforseoTrendsExploreLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataDataforseoTrendsExploreLiveResponseInfo dataforseoTrendsExploreLive(List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataDataforseoTrendsExploreLiveResponseInfo> localVarResp = dataforseoTrendsExploreLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataDataforseoTrendsExploreLiveResponseInfo> dataforseoTrendsExploreLiveWithHttpInfo(List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = dataforseoTrendsExploreLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsExploreLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call dataforseoTrendsExploreLiveAsync(List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo> payload, final ApiCallback<KeywordsDataDataforseoTrendsExploreLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = dataforseoTrendsExploreLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsExploreLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call dataforseoTrendsSubregionInterestsLiveCall(List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/dataforseo_trends/subregion_interests/live";

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
        private okhttp3.Call dataforseoTrendsSubregionInterestsLiveValidateBeforeCall(List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return dataforseoTrendsSubregionInterestsLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo dataforseoTrendsSubregionInterestsLive(List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo> localVarResp = dataforseoTrendsSubregionInterestsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo> dataforseoTrendsSubregionInterestsLiveWithHttpInfo(List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = dataforseoTrendsSubregionInterestsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call dataforseoTrendsSubregionInterestsLiveAsync(List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo> payload, final ApiCallback<KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = dataforseoTrendsSubregionInterestsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call dataforseoTrendsDemographyLiveCall(List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/dataforseo_trends/demography/live";

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
        private okhttp3.Call dataforseoTrendsDemographyLiveValidateBeforeCall(List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return dataforseoTrendsDemographyLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataDataforseoTrendsDemographyLiveResponseInfo dataforseoTrendsDemographyLive(List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataDataforseoTrendsDemographyLiveResponseInfo> localVarResp = dataforseoTrendsDemographyLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataDataforseoTrendsDemographyLiveResponseInfo> dataforseoTrendsDemographyLiveWithHttpInfo(List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = dataforseoTrendsDemographyLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsDemographyLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call dataforseoTrendsDemographyLiveAsync(List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo> payload, final ApiCallback<KeywordsDataDataforseoTrendsDemographyLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = dataforseoTrendsDemographyLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsDemographyLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call dataforseoTrendsMergedDataLiveCall(List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/dataforseo_trends/merged_data/live";

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
        private okhttp3.Call dataforseoTrendsMergedDataLiveValidateBeforeCall(List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return dataforseoTrendsMergedDataLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo dataforseoTrendsMergedDataLive(List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo> localVarResp = dataforseoTrendsMergedDataLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo> dataforseoTrendsMergedDataLiveWithHttpInfo(List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = dataforseoTrendsMergedDataLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call dataforseoTrendsMergedDataLiveAsync(List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo> payload, final ApiCallback<KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = dataforseoTrendsMergedDataLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataBingLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/locations";
   

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
    private okhttp3.Call keywordsDataBingLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataBingLocationsCall(_callback);

    }

    public KeywordsDataBingLocationsResponseInfo keywordsDataBingLocations() throws ApiException {
       ApiResponse<KeywordsDataBingLocationsResponseInfo> localVarResp = keywordsDataBingLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingLocationsResponseInfo> keywordsDataBingLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataBingLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataBingLocationsAsync(final ApiCallback<KeywordsDataBingLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataBingLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call keywordsDataBingLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/languages";
   

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
    private okhttp3.Call keywordsDataBingLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataBingLanguagesCall(_callback);

    }

    public KeywordsDataBingLanguagesResponseInfo keywordsDataBingLanguages() throws ApiException {
       ApiResponse<KeywordsDataBingLanguagesResponseInfo> localVarResp = keywordsDataBingLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingLanguagesResponseInfo> keywordsDataBingLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataBingLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataBingLanguagesAsync(final ApiCallback<KeywordsDataBingLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataBingLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingSearchVolumeTaskPostCall(List<KeywordsDataBingSearchVolumeTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/search_volume/task_post";

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
        private okhttp3.Call bingSearchVolumeTaskPostValidateBeforeCall(List<KeywordsDataBingSearchVolumeTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingSearchVolumeTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataBingSearchVolumeTaskPostResponseInfo bingSearchVolumeTaskPost(List<KeywordsDataBingSearchVolumeTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingSearchVolumeTaskPostResponseInfo> localVarResp = bingSearchVolumeTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingSearchVolumeTaskPostResponseInfo> bingSearchVolumeTaskPostWithHttpInfo(List<KeywordsDataBingSearchVolumeTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingSearchVolumeTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingSearchVolumeTaskPostAsync(List<KeywordsDataBingSearchVolumeTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataBingSearchVolumeTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingSearchVolumeTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingSearchVolumeTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/search_volume/tasks_ready";
   

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
    private okhttp3.Call bingSearchVolumeTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingSearchVolumeTasksReadyCall(_callback);

    }

    public KeywordsDataBingSearchVolumeTasksReadyResponseInfo bingSearchVolumeTasksReady() throws ApiException {
       ApiResponse<KeywordsDataBingSearchVolumeTasksReadyResponseInfo> localVarResp = bingSearchVolumeTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingSearchVolumeTasksReadyResponseInfo> bingSearchVolumeTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingSearchVolumeTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingSearchVolumeTasksReadyAsync(final ApiCallback<KeywordsDataBingSearchVolumeTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingSearchVolumeTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingSearchVolumeTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/bing/search_volume/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call bingSearchVolumeTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingSearchVolumeTaskGet(Async)");
       }

       return bingSearchVolumeTaskGetCall(id, _callback);

    }

    public KeywordsDataBingSearchVolumeTaskGetResponseInfo bingSearchVolumeTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataBingSearchVolumeTaskGetResponseInfo> localVarResp = bingSearchVolumeTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingSearchVolumeTaskGetResponseInfo> bingSearchVolumeTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingSearchVolumeTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingSearchVolumeTaskGetAsync(String id, final ApiCallback<KeywordsDataBingSearchVolumeTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingSearchVolumeTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingSearchVolumeLiveCall(List<KeywordsDataBingSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/search_volume/live";

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
        private okhttp3.Call bingSearchVolumeLiveValidateBeforeCall(List<KeywordsDataBingSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataBingSearchVolumeLiveResponseInfo bingSearchVolumeLive(List<KeywordsDataBingSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingSearchVolumeLiveResponseInfo> localVarResp = bingSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingSearchVolumeLiveResponseInfo> bingSearchVolumeLiveWithHttpInfo(List<KeywordsDataBingSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingSearchVolumeLiveAsync(List<KeywordsDataBingSearchVolumeLiveRequestInfo> payload, final ApiCallback<KeywordsDataBingSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingAudienceEstimationJobFunctionsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/audience_estimation/job_functions";
   

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
    private okhttp3.Call bingAudienceEstimationJobFunctionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingAudienceEstimationJobFunctionsCall(_callback);

    }

    public KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo bingAudienceEstimationJobFunctions() throws ApiException {
       ApiResponse<KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo> localVarResp = bingAudienceEstimationJobFunctionsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo> bingAudienceEstimationJobFunctionsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingAudienceEstimationJobFunctionsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingAudienceEstimationJobFunctionsAsync(final ApiCallback<KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingAudienceEstimationJobFunctionsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingAudienceEstimationIndustriesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/audience_estimation/industries";
   

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
    private okhttp3.Call bingAudienceEstimationIndustriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingAudienceEstimationIndustriesCall(_callback);

    }

    public KeywordsDataBingAudienceEstimationIndustriesResponseInfo bingAudienceEstimationIndustries() throws ApiException {
       ApiResponse<KeywordsDataBingAudienceEstimationIndustriesResponseInfo> localVarResp = bingAudienceEstimationIndustriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingAudienceEstimationIndustriesResponseInfo> bingAudienceEstimationIndustriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingAudienceEstimationIndustriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationIndustriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingAudienceEstimationIndustriesAsync(final ApiCallback<KeywordsDataBingAudienceEstimationIndustriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingAudienceEstimationIndustriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationIndustriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingAudienceEstimationTaskPostCall(List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/audience_estimation/task_post";

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
        private okhttp3.Call bingAudienceEstimationTaskPostValidateBeforeCall(List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingAudienceEstimationTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataBingAudienceEstimationTaskPostResponseInfo bingAudienceEstimationTaskPost(List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingAudienceEstimationTaskPostResponseInfo> localVarResp = bingAudienceEstimationTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingAudienceEstimationTaskPostResponseInfo> bingAudienceEstimationTaskPostWithHttpInfo(List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingAudienceEstimationTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingAudienceEstimationTaskPostAsync(List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataBingAudienceEstimationTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingAudienceEstimationTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingAudienceEstimationTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/audience_estimation/tasks_ready";
   

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
    private okhttp3.Call bingAudienceEstimationTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingAudienceEstimationTasksReadyCall(_callback);

    }

    public KeywordsDataBingAudienceEstimationTasksReadyResponseInfo bingAudienceEstimationTasksReady() throws ApiException {
       ApiResponse<KeywordsDataBingAudienceEstimationTasksReadyResponseInfo> localVarResp = bingAudienceEstimationTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingAudienceEstimationTasksReadyResponseInfo> bingAudienceEstimationTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingAudienceEstimationTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingAudienceEstimationTasksReadyAsync(final ApiCallback<KeywordsDataBingAudienceEstimationTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingAudienceEstimationTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingAudienceEstimationTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/bing/audience_estimation/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call bingAudienceEstimationTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingAudienceEstimationTaskGet(Async)");
       }

       return bingAudienceEstimationTaskGetCall(id, _callback);

    }

    public KeywordsDataBingAudienceEstimationTaskGetResponseInfo bingAudienceEstimationTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataBingAudienceEstimationTaskGetResponseInfo> localVarResp = bingAudienceEstimationTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingAudienceEstimationTaskGetResponseInfo> bingAudienceEstimationTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingAudienceEstimationTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingAudienceEstimationTaskGetAsync(String id, final ApiCallback<KeywordsDataBingAudienceEstimationTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingAudienceEstimationTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingAudienceEstimationLiveCall(List<KeywordsDataBingAudienceEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/audience_estimation/live";

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
        private okhttp3.Call bingAudienceEstimationLiveValidateBeforeCall(List<KeywordsDataBingAudienceEstimationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingAudienceEstimationLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataBingAudienceEstimationLiveResponseInfo bingAudienceEstimationLive(List<KeywordsDataBingAudienceEstimationLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingAudienceEstimationLiveResponseInfo> localVarResp = bingAudienceEstimationLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingAudienceEstimationLiveResponseInfo> bingAudienceEstimationLiveWithHttpInfo(List<KeywordsDataBingAudienceEstimationLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingAudienceEstimationLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingAudienceEstimationLiveAsync(List<KeywordsDataBingAudienceEstimationLiveRequestInfo> payload, final ApiCallback<KeywordsDataBingAudienceEstimationLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingAudienceEstimationLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingAudienceEstimationLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingKeywordsForSiteTaskPostCall(List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/keywords_for_site/task_post";

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
        private okhttp3.Call bingKeywordsForSiteTaskPostValidateBeforeCall(List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingKeywordsForSiteTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataBingKeywordsForSiteTaskPostResponseInfo bingKeywordsForSiteTaskPost(List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingKeywordsForSiteTaskPostResponseInfo> localVarResp = bingKeywordsForSiteTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingKeywordsForSiteTaskPostResponseInfo> bingKeywordsForSiteTaskPostWithHttpInfo(List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingKeywordsForSiteTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingKeywordsForSiteTaskPostAsync(List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataBingKeywordsForSiteTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingKeywordsForSiteTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingKeywordsForSiteTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/keywords_for_site/tasks_ready";
   

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
    private okhttp3.Call bingKeywordsForSiteTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingKeywordsForSiteTasksReadyCall(_callback);

    }

    public KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo bingKeywordsForSiteTasksReady() throws ApiException {
       ApiResponse<KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo> localVarResp = bingKeywordsForSiteTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo> bingKeywordsForSiteTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingKeywordsForSiteTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingKeywordsForSiteTasksReadyAsync(final ApiCallback<KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingKeywordsForSiteTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordsForSiteTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/bing/keywords_for_site/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call bingKeywordsForSiteTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingKeywordsForSiteTaskGet(Async)");
       }

       return bingKeywordsForSiteTaskGetCall(id, _callback);

    }

    public KeywordsDataBingKeywordsForSiteTaskGetResponseInfo bingKeywordsForSiteTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataBingKeywordsForSiteTaskGetResponseInfo> localVarResp = bingKeywordsForSiteTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordsForSiteTaskGetResponseInfo> bingKeywordsForSiteTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingKeywordsForSiteTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingKeywordsForSiteTaskGetAsync(String id, final ApiCallback<KeywordsDataBingKeywordsForSiteTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingKeywordsForSiteTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordsForSiteLiveCall(List<KeywordsDataBingKeywordsForSiteLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/keywords_for_site/live";

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
        private okhttp3.Call bingKeywordsForSiteLiveValidateBeforeCall(List<KeywordsDataBingKeywordsForSiteLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingKeywordsForSiteLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataBingKeywordsForSiteLiveResponseInfo bingKeywordsForSiteLive(List<KeywordsDataBingKeywordsForSiteLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingKeywordsForSiteLiveResponseInfo> localVarResp = bingKeywordsForSiteLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingKeywordsForSiteLiveResponseInfo> bingKeywordsForSiteLiveWithHttpInfo(List<KeywordsDataBingKeywordsForSiteLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingKeywordsForSiteLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingKeywordsForSiteLiveAsync(List<KeywordsDataBingKeywordsForSiteLiveRequestInfo> payload, final ApiCallback<KeywordsDataBingKeywordsForSiteLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingKeywordsForSiteLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForSiteLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingKeywordsForKeywordsTaskPostCall(List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/keywords_for_keywords/task_post";

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
        private okhttp3.Call bingKeywordsForKeywordsTaskPostValidateBeforeCall(List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingKeywordsForKeywordsTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo bingKeywordsForKeywordsTaskPost(List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo> localVarResp = bingKeywordsForKeywordsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo> bingKeywordsForKeywordsTaskPostWithHttpInfo(List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingKeywordsForKeywordsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingKeywordsForKeywordsTaskPostAsync(List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingKeywordsForKeywordsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingKeywordsForKeywordsTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/keywords_for_keywords/tasks_ready";
   

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
    private okhttp3.Call bingKeywordsForKeywordsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingKeywordsForKeywordsTasksReadyCall(_callback);

    }

    public KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo bingKeywordsForKeywordsTasksReady() throws ApiException {
       ApiResponse<KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo> localVarResp = bingKeywordsForKeywordsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo> bingKeywordsForKeywordsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingKeywordsForKeywordsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingKeywordsForKeywordsTasksReadyAsync(final ApiCallback<KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingKeywordsForKeywordsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordsForKeywordsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/bing/keywords_for_keywords/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call bingKeywordsForKeywordsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingKeywordsForKeywordsTaskGet(Async)");
       }

       return bingKeywordsForKeywordsTaskGetCall(id, _callback);

    }

    public KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo bingKeywordsForKeywordsTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo> localVarResp = bingKeywordsForKeywordsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo> bingKeywordsForKeywordsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingKeywordsForKeywordsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingKeywordsForKeywordsTaskGetAsync(String id, final ApiCallback<KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingKeywordsForKeywordsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordsForKeywordsLiveCall(List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/keywords_for_keywords/live";

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
        private okhttp3.Call bingKeywordsForKeywordsLiveValidateBeforeCall(List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingKeywordsForKeywordsLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataBingKeywordsForKeywordsLiveResponseInfo bingKeywordsForKeywordsLive(List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingKeywordsForKeywordsLiveResponseInfo> localVarResp = bingKeywordsForKeywordsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingKeywordsForKeywordsLiveResponseInfo> bingKeywordsForKeywordsLiveWithHttpInfo(List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingKeywordsForKeywordsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingKeywordsForKeywordsLiveAsync(List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo> payload, final ApiCallback<KeywordsDataBingKeywordsForKeywordsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingKeywordsForKeywordsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordsForKeywordsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataBingKeywordPerformanceLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/keyword_performance/locations_and_languages";
   

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
    private okhttp3.Call keywordsDataBingKeywordPerformanceLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataBingKeywordPerformanceLocationsAndLanguagesCall(_callback);

    }

    public KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo keywordsDataBingKeywordPerformanceLocationsAndLanguages() throws ApiException {
       ApiResponse<KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo> localVarResp = keywordsDataBingKeywordPerformanceLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo> keywordsDataBingKeywordPerformanceLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataBingKeywordPerformanceLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataBingKeywordPerformanceLocationsAndLanguagesAsync(final ApiCallback<KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataBingKeywordPerformanceLocationsAndLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordPerformanceTaskPostCall(List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/keyword_performance/task_post";

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
        private okhttp3.Call bingKeywordPerformanceTaskPostValidateBeforeCall(List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingKeywordPerformanceTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataBingKeywordPerformanceTaskPostResponseInfo bingKeywordPerformanceTaskPost(List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingKeywordPerformanceTaskPostResponseInfo> localVarResp = bingKeywordPerformanceTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingKeywordPerformanceTaskPostResponseInfo> bingKeywordPerformanceTaskPostWithHttpInfo(List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingKeywordPerformanceTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingKeywordPerformanceTaskPostAsync(List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataBingKeywordPerformanceTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingKeywordPerformanceTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingKeywordPerformanceTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/keyword_performance/tasks_ready";
   

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
    private okhttp3.Call bingKeywordPerformanceTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingKeywordPerformanceTasksReadyCall(_callback);

    }

    public KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo bingKeywordPerformanceTasksReady() throws ApiException {
       ApiResponse<KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo> localVarResp = bingKeywordPerformanceTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo> bingKeywordPerformanceTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingKeywordPerformanceTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingKeywordPerformanceTasksReadyAsync(final ApiCallback<KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingKeywordPerformanceTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordPerformanceTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/bing/keyword_performance/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call bingKeywordPerformanceTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingKeywordPerformanceTaskGet(Async)");
       }

       return bingKeywordPerformanceTaskGetCall(id, _callback);

    }

    public KeywordsDataBingKeywordPerformanceTaskGetResponseInfo bingKeywordPerformanceTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataBingKeywordPerformanceTaskGetResponseInfo> localVarResp = bingKeywordPerformanceTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingKeywordPerformanceTaskGetResponseInfo> bingKeywordPerformanceTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingKeywordPerformanceTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingKeywordPerformanceTaskGetAsync(String id, final ApiCallback<KeywordsDataBingKeywordPerformanceTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingKeywordPerformanceTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingKeywordPerformanceLiveCall(List<KeywordsDataBingKeywordPerformanceLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/keyword_performance/live";

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
        private okhttp3.Call bingKeywordPerformanceLiveValidateBeforeCall(List<KeywordsDataBingKeywordPerformanceLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingKeywordPerformanceLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataBingKeywordPerformanceLiveResponseInfo bingKeywordPerformanceLive(List<KeywordsDataBingKeywordPerformanceLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingKeywordPerformanceLiveResponseInfo> localVarResp = bingKeywordPerformanceLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingKeywordPerformanceLiveResponseInfo> bingKeywordPerformanceLiveWithHttpInfo(List<KeywordsDataBingKeywordPerformanceLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingKeywordPerformanceLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingKeywordPerformanceLiveAsync(List<KeywordsDataBingKeywordPerformanceLiveRequestInfo> payload, final ApiCallback<KeywordsDataBingKeywordPerformanceLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingKeywordPerformanceLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingKeywordPerformanceLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/search_volume_history/locations_and_languages";
   

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
    private okhttp3.Call keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesCall(_callback);

    }

    public KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo keywordsDataBingSearchVolumeHistoryLocationsAndLanguages() throws ApiException {
       ApiResponse<KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo> localVarResp = keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo> keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesAsync(final ApiCallback<KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataBingSearchVolumeHistoryLocationsAndLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingSearchVolumeHistoryTaskPostCall(List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/search_volume_history/task_post";

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
        private okhttp3.Call bingSearchVolumeHistoryTaskPostValidateBeforeCall(List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingSearchVolumeHistoryTaskPostCall(payload, _callback);
 
        }
 
        public KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo bingSearchVolumeHistoryTaskPost(List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo> localVarResp = bingSearchVolumeHistoryTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo> bingSearchVolumeHistoryTaskPostWithHttpInfo(List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingSearchVolumeHistoryTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingSearchVolumeHistoryTaskPostAsync(List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo> payload, final ApiCallback<KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingSearchVolumeHistoryTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingSearchVolumeHistoryTasksReadyCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/bing/search_volume_history/tasks_ready";
   

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
    private okhttp3.Call bingSearchVolumeHistoryTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingSearchVolumeHistoryTasksReadyCall(_callback);

    }

    public KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo bingSearchVolumeHistoryTasksReady() throws ApiException {
       ApiResponse<KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo> localVarResp = bingSearchVolumeHistoryTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo> bingSearchVolumeHistoryTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingSearchVolumeHistoryTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingSearchVolumeHistoryTasksReadyAsync(final ApiCallback<KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingSearchVolumeHistoryTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingSearchVolumeHistoryTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
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
   
       String localVarPath = "/v3/keywords_data/bing/search_volume_history/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


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
    private okhttp3.Call bingSearchVolumeHistoryTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingSearchVolumeHistoryTaskGet(Async)");
       }

       return bingSearchVolumeHistoryTaskGetCall(id, _callback);

    }

    public KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo bingSearchVolumeHistoryTaskGet(String id) throws ApiException {
       ApiResponse<KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo> localVarResp = bingSearchVolumeHistoryTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo> bingSearchVolumeHistoryTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingSearchVolumeHistoryTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingSearchVolumeHistoryTaskGetAsync(String id, final ApiCallback<KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingSearchVolumeHistoryTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingSearchVolumeHistoryLiveCall(List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/bing/search_volume_history/live";

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
        private okhttp3.Call bingSearchVolumeHistoryLiveValidateBeforeCall(List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingSearchVolumeHistoryLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataBingSearchVolumeHistoryLiveResponseInfo bingSearchVolumeHistoryLive(List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataBingSearchVolumeHistoryLiveResponseInfo> localVarResp = bingSearchVolumeHistoryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataBingSearchVolumeHistoryLiveResponseInfo> bingSearchVolumeHistoryLiveWithHttpInfo(List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingSearchVolumeHistoryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingSearchVolumeHistoryLiveAsync(List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo> payload, final ApiCallback<KeywordsDataBingSearchVolumeHistoryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingSearchVolumeHistoryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataBingSearchVolumeHistoryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordsDataClickstreamDataLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/keywords_data/clickstream_data/locations_and_languages";
   

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
    private okhttp3.Call keywordsDataClickstreamDataLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return keywordsDataClickstreamDataLocationsAndLanguagesCall(_callback);

    }

    public KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo keywordsDataClickstreamDataLocationsAndLanguages() throws ApiException {
       ApiResponse<KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo> localVarResp = keywordsDataClickstreamDataLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo> keywordsDataClickstreamDataLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = keywordsDataClickstreamDataLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call keywordsDataClickstreamDataLocationsAndLanguagesAsync(final ApiCallback<KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = keywordsDataClickstreamDataLocationsAndLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call clickstreamDataDataforseoSearchVolumeLiveCall(List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/clickstream_data/dataforseo_search_volume/live";

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
        private okhttp3.Call clickstreamDataDataforseoSearchVolumeLiveValidateBeforeCall(List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return clickstreamDataDataforseoSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo clickstreamDataDataforseoSearchVolumeLive(List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo> localVarResp = clickstreamDataDataforseoSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo> clickstreamDataDataforseoSearchVolumeLiveWithHttpInfo(List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = clickstreamDataDataforseoSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call clickstreamDataDataforseoSearchVolumeLiveAsync(List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo> payload, final ApiCallback<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = clickstreamDataDataforseoSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call clickstreamDataGlobalSearchVolumeLiveCall(List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/clickstream_data/global_search_volume/live";

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
        private okhttp3.Call clickstreamDataGlobalSearchVolumeLiveValidateBeforeCall(List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return clickstreamDataGlobalSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo clickstreamDataGlobalSearchVolumeLive(List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo> localVarResp = clickstreamDataGlobalSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo> clickstreamDataGlobalSearchVolumeLiveWithHttpInfo(List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = clickstreamDataGlobalSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call clickstreamDataGlobalSearchVolumeLiveAsync(List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo> payload, final ApiCallback<KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = clickstreamDataGlobalSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call clickstreamDataBulkSearchVolumeLiveCall(List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/keywords_data/clickstream_data/bulk_search_volume/live";

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
        private okhttp3.Call clickstreamDataBulkSearchVolumeLiveValidateBeforeCall(List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return clickstreamDataBulkSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo clickstreamDataBulkSearchVolumeLive(List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo> localVarResp = clickstreamDataBulkSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo> clickstreamDataBulkSearchVolumeLiveWithHttpInfo(List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = clickstreamDataBulkSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call clickstreamDataBulkSearchVolumeLiveAsync(List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo> payload, final ApiCallback<KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = clickstreamDataBulkSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}