package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.DomainAnalyticsIdListRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsIdListResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsErrorsRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsErrorsResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLocationsResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLanguagesResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsWhoisAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class DomainAnalyticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DomainAnalyticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DomainAnalyticsApi(ApiClient apiClient) {
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


    public okhttp3.Call domainAnalyticsIdListCall(List<DomainAnalyticsIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/id_list";

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
        private okhttp3.Call domainAnalyticsIdListValidateBeforeCall(List<DomainAnalyticsIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return domainAnalyticsIdListCall(payload, _callback);
 
        }
 
        public DomainAnalyticsIdListResponseInfo domainAnalyticsIdList(List<DomainAnalyticsIdListRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsIdListResponseInfo> localVarResp = domainAnalyticsIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsIdListResponseInfo> domainAnalyticsIdListWithHttpInfo(List<DomainAnalyticsIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = domainAnalyticsIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call domainAnalyticsIdListAsync(List<DomainAnalyticsIdListRequestInfo> payload, final ApiCallback<DomainAnalyticsIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = domainAnalyticsIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call domainAnalyticsErrorsCall(List<DomainAnalyticsErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/errors";

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
        private okhttp3.Call domainAnalyticsErrorsValidateBeforeCall(List<DomainAnalyticsErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return domainAnalyticsErrorsCall(payload, _callback);
 
        }
 
        public DomainAnalyticsErrorsResponseInfo domainAnalyticsErrors(List<DomainAnalyticsErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsErrorsResponseInfo> localVarResp = domainAnalyticsErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsErrorsResponseInfo> domainAnalyticsErrorsWithHttpInfo(List<DomainAnalyticsErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = domainAnalyticsErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call domainAnalyticsErrorsAsync(List<DomainAnalyticsErrorsRequestInfo> payload, final ApiCallback<DomainAnalyticsErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = domainAnalyticsErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call technologiesAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/domain_analytics/technologies/available_filters";
   

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
    private okhttp3.Call technologiesAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return technologiesAvailableFiltersCall(_callback);

    }

    public DomainAnalyticsTechnologiesAvailableFiltersResponseInfo technologiesAvailableFilters() throws ApiException {
       ApiResponse<DomainAnalyticsTechnologiesAvailableFiltersResponseInfo> localVarResp = technologiesAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DomainAnalyticsTechnologiesAvailableFiltersResponseInfo> technologiesAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = technologiesAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call technologiesAvailableFiltersAsync(final ApiCallback<DomainAnalyticsTechnologiesAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = technologiesAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call technologiesLocationsCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/domain_analytics/technologies/locations";
   

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
    private okhttp3.Call technologiesLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return technologiesLocationsCall(_callback);

    }

    public DomainAnalyticsTechnologiesLocationsResponseInfo technologiesLocations() throws ApiException {
       ApiResponse<DomainAnalyticsTechnologiesLocationsResponseInfo> localVarResp = technologiesLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DomainAnalyticsTechnologiesLocationsResponseInfo> technologiesLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = technologiesLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call technologiesLocationsAsync(final ApiCallback<DomainAnalyticsTechnologiesLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = technologiesLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call technologiesLanguagesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/domain_analytics/technologies/languages";
   

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
    private okhttp3.Call technologiesLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return technologiesLanguagesCall(_callback);

    }

    public DomainAnalyticsTechnologiesLanguagesResponseInfo technologiesLanguages() throws ApiException {
       ApiResponse<DomainAnalyticsTechnologiesLanguagesResponseInfo> localVarResp = technologiesLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DomainAnalyticsTechnologiesLanguagesResponseInfo> technologiesLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = technologiesLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call technologiesLanguagesAsync(final ApiCallback<DomainAnalyticsTechnologiesLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = technologiesLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call technologiesTechnologiesCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/domain_analytics/technologies/technologies";
   

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
    private okhttp3.Call technologiesTechnologiesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return technologiesTechnologiesCall(_callback);

    }

    public DomainAnalyticsTechnologiesTechnologiesResponseInfo technologiesTechnologies() throws ApiException {
       ApiResponse<DomainAnalyticsTechnologiesTechnologiesResponseInfo> localVarResp = technologiesTechnologiesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DomainAnalyticsTechnologiesTechnologiesResponseInfo> technologiesTechnologiesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = technologiesTechnologiesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesTechnologiesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call technologiesTechnologiesAsync(final ApiCallback<DomainAnalyticsTechnologiesTechnologiesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = technologiesTechnologiesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesTechnologiesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call technologiesAggregationTechnologiesLiveCall(List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/technologies/aggregation_technologies/live";

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
        private okhttp3.Call technologiesAggregationTechnologiesLiveValidateBeforeCall(List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return technologiesAggregationTechnologiesLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo technologiesAggregationTechnologiesLive(List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo> localVarResp = technologiesAggregationTechnologiesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo> technologiesAggregationTechnologiesLiveWithHttpInfo(List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = technologiesAggregationTechnologiesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call technologiesAggregationTechnologiesLiveAsync(List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = technologiesAggregationTechnologiesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call technologiesTechnologiesSummaryLiveCall(List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/technologies/technologies_summary/live";

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
        private okhttp3.Call technologiesTechnologiesSummaryLiveValidateBeforeCall(List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return technologiesTechnologiesSummaryLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo technologiesTechnologiesSummaryLive(List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo> localVarResp = technologiesTechnologiesSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo> technologiesTechnologiesSummaryLiveWithHttpInfo(List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = technologiesTechnologiesSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call technologiesTechnologiesSummaryLiveAsync(List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = technologiesTechnologiesSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call technologiesTechnologyStatsLiveCall(List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/technologies/technology_stats/live";

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
        private okhttp3.Call technologiesTechnologyStatsLiveValidateBeforeCall(List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return technologiesTechnologyStatsLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo technologiesTechnologyStatsLive(List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo> localVarResp = technologiesTechnologyStatsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo> technologiesTechnologyStatsLiveWithHttpInfo(List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = technologiesTechnologyStatsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call technologiesTechnologyStatsLiveAsync(List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = technologiesTechnologyStatsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call technologiesDomainsByTechnologyLiveCall(List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/technologies/domains_by_technology/live";

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
        private okhttp3.Call technologiesDomainsByTechnologyLiveValidateBeforeCall(List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return technologiesDomainsByTechnologyLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo technologiesDomainsByTechnologyLive(List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo> localVarResp = technologiesDomainsByTechnologyLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo> technologiesDomainsByTechnologyLiveWithHttpInfo(List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = technologiesDomainsByTechnologyLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call technologiesDomainsByTechnologyLiveAsync(List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = technologiesDomainsByTechnologyLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call technologiesDomainsByHtmlTermsLiveCall(List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/technologies/domains_by_html_terms/live";

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
        private okhttp3.Call technologiesDomainsByHtmlTermsLiveValidateBeforeCall(List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return technologiesDomainsByHtmlTermsLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo technologiesDomainsByHtmlTermsLive(List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo> localVarResp = technologiesDomainsByHtmlTermsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo> technologiesDomainsByHtmlTermsLiveWithHttpInfo(List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = technologiesDomainsByHtmlTermsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call technologiesDomainsByHtmlTermsLiveAsync(List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = technologiesDomainsByHtmlTermsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call technologiesDomainTechnologiesLiveCall(List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/technologies/domain_technologies/live";

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
        private okhttp3.Call technologiesDomainTechnologiesLiveValidateBeforeCall(List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return technologiesDomainTechnologiesLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo technologiesDomainTechnologiesLive(List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo> localVarResp = technologiesDomainTechnologiesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo> technologiesDomainTechnologiesLiveWithHttpInfo(List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = technologiesDomainTechnologiesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call technologiesDomainTechnologiesLiveAsync(List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = technologiesDomainTechnologiesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call whoisAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/domain_analytics/whois/available_filters";
   

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
    private okhttp3.Call whoisAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return whoisAvailableFiltersCall(_callback);

    }

    public DomainAnalyticsWhoisAvailableFiltersResponseInfo whoisAvailableFilters() throws ApiException {
       ApiResponse<DomainAnalyticsWhoisAvailableFiltersResponseInfo> localVarResp = whoisAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<DomainAnalyticsWhoisAvailableFiltersResponseInfo> whoisAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = whoisAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<DomainAnalyticsWhoisAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call whoisAvailableFiltersAsync(final ApiCallback<DomainAnalyticsWhoisAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = whoisAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<DomainAnalyticsWhoisAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call whoisOverviewLiveCall(List<DomainAnalyticsWhoisOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/domain_analytics/whois/overview/live";

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
        private okhttp3.Call whoisOverviewLiveValidateBeforeCall(List<DomainAnalyticsWhoisOverviewLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return whoisOverviewLiveCall(payload, _callback);
 
        }
 
        public DomainAnalyticsWhoisOverviewLiveResponseInfo whoisOverviewLive(List<DomainAnalyticsWhoisOverviewLiveRequestInfo> payload) throws ApiException {
            ApiResponse<DomainAnalyticsWhoisOverviewLiveResponseInfo> localVarResp = whoisOverviewLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<DomainAnalyticsWhoisOverviewLiveResponseInfo> whoisOverviewLiveWithHttpInfo(List<DomainAnalyticsWhoisOverviewLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = whoisOverviewLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<DomainAnalyticsWhoisOverviewLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call whoisOverviewLiveAsync(List<DomainAnalyticsWhoisOverviewLiveRequestInfo> payload, final ApiCallback<DomainAnalyticsWhoisOverviewLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = whoisOverviewLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<DomainAnalyticsWhoisOverviewLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}