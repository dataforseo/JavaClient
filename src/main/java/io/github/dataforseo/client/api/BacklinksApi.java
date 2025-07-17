package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.BacklinksIdListRequestInfo;
import io.github.dataforseo.client.model.BacklinksIdListResponseInfo;
import io.github.dataforseo.client.model.BacklinksErrorsRequestInfo;
import io.github.dataforseo.client.model.BacklinksErrorsResponseInfo;
import io.github.dataforseo.client.model.BacklinksAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.BacklinksIndexResponseInfo;
import io.github.dataforseo.client.model.BacklinksSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksHistoryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksHistoryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBacklinksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBacklinksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksAnchorsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksAnchorsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksReferringDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksReferringDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksReferringNetworksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksReferringNetworksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksPageIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksPageIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkRanksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkRanksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class BacklinksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BacklinksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BacklinksApi(ApiClient apiClient) {
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


    public okhttp3.Call backlinksIdListCall(List<BacklinksIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/id_list";

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
        private okhttp3.Call backlinksIdListValidateBeforeCall(List<BacklinksIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return backlinksIdListCall(payload, _callback);
 
        }
 
        public BacklinksIdListResponseInfo backlinksIdList(List<BacklinksIdListRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksIdListResponseInfo> localVarResp = backlinksIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksIdListResponseInfo> backlinksIdListWithHttpInfo(List<BacklinksIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = backlinksIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call backlinksIdListAsync(List<BacklinksIdListRequestInfo> payload, final ApiCallback<BacklinksIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = backlinksIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call backlinksErrorsCall(List<BacklinksErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/errors";

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
        private okhttp3.Call backlinksErrorsValidateBeforeCall(List<BacklinksErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return backlinksErrorsCall(payload, _callback);
 
        }
 
        public BacklinksErrorsResponseInfo backlinksErrors(List<BacklinksErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksErrorsResponseInfo> localVarResp = backlinksErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksErrorsResponseInfo> backlinksErrorsWithHttpInfo(List<BacklinksErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = backlinksErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call backlinksErrorsAsync(List<BacklinksErrorsRequestInfo> payload, final ApiCallback<BacklinksErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = backlinksErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call backlinksAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/backlinks/available_filters";
   

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
    private okhttp3.Call backlinksAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return backlinksAvailableFiltersCall(_callback);

    }

    public BacklinksAvailableFiltersResponseInfo backlinksAvailableFilters() throws ApiException {
       ApiResponse<BacklinksAvailableFiltersResponseInfo> localVarResp = backlinksAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BacklinksAvailableFiltersResponseInfo> backlinksAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = backlinksAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BacklinksAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call backlinksAvailableFiltersAsync(final ApiCallback<BacklinksAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = backlinksAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BacklinksAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call indexCall( final ApiCallback _callback) throws ApiException {
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
          String localVarPath = "/v3/backlinks/index";
   

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
    private okhttp3.Call indexValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return indexCall(_callback);

    }

    public BacklinksIndexResponseInfo index() throws ApiException {
       ApiResponse<BacklinksIndexResponseInfo> localVarResp = indexWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BacklinksIndexResponseInfo> indexWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = indexValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BacklinksIndexResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call indexAsync(final ApiCallback<BacklinksIndexResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = indexValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BacklinksIndexResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call summaryLiveCall(List<BacklinksSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/summary/live";

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
        private okhttp3.Call summaryLiveValidateBeforeCall(List<BacklinksSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return summaryLiveCall(payload, _callback);
 
        }
 
        public BacklinksSummaryLiveResponseInfo summaryLive(List<BacklinksSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksSummaryLiveResponseInfo> localVarResp = summaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksSummaryLiveResponseInfo> summaryLiveWithHttpInfo(List<BacklinksSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = summaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call summaryLiveAsync(List<BacklinksSummaryLiveRequestInfo> payload, final ApiCallback<BacklinksSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = summaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call historyLiveCall(List<BacklinksHistoryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/history/live";

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
        private okhttp3.Call historyLiveValidateBeforeCall(List<BacklinksHistoryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return historyLiveCall(payload, _callback);
 
        }
 
        public BacklinksHistoryLiveResponseInfo historyLive(List<BacklinksHistoryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksHistoryLiveResponseInfo> localVarResp = historyLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksHistoryLiveResponseInfo> historyLiveWithHttpInfo(List<BacklinksHistoryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = historyLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksHistoryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call historyLiveAsync(List<BacklinksHistoryLiveRequestInfo> payload, final ApiCallback<BacklinksHistoryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = historyLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksHistoryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call backlinksLiveCall(List<BacklinksBacklinksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/backlinks/live";

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
        private okhttp3.Call backlinksLiveValidateBeforeCall(List<BacklinksBacklinksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return backlinksLiveCall(payload, _callback);
 
        }
 
        public BacklinksBacklinksLiveResponseInfo backlinksLive(List<BacklinksBacklinksLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBacklinksLiveResponseInfo> localVarResp = backlinksLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBacklinksLiveResponseInfo> backlinksLiveWithHttpInfo(List<BacklinksBacklinksLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = backlinksLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBacklinksLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call backlinksLiveAsync(List<BacklinksBacklinksLiveRequestInfo> payload, final ApiCallback<BacklinksBacklinksLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = backlinksLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBacklinksLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call anchorsLiveCall(List<BacklinksAnchorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/anchors/live";

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
        private okhttp3.Call anchorsLiveValidateBeforeCall(List<BacklinksAnchorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return anchorsLiveCall(payload, _callback);
 
        }
 
        public BacklinksAnchorsLiveResponseInfo anchorsLive(List<BacklinksAnchorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksAnchorsLiveResponseInfo> localVarResp = anchorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksAnchorsLiveResponseInfo> anchorsLiveWithHttpInfo(List<BacklinksAnchorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = anchorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksAnchorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call anchorsLiveAsync(List<BacklinksAnchorsLiveRequestInfo> payload, final ApiCallback<BacklinksAnchorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = anchorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksAnchorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call domainPagesLiveCall(List<BacklinksDomainPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/domain_pages/live";

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
        private okhttp3.Call domainPagesLiveValidateBeforeCall(List<BacklinksDomainPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return domainPagesLiveCall(payload, _callback);
 
        }
 
        public BacklinksDomainPagesLiveResponseInfo domainPagesLive(List<BacklinksDomainPagesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksDomainPagesLiveResponseInfo> localVarResp = domainPagesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksDomainPagesLiveResponseInfo> domainPagesLiveWithHttpInfo(List<BacklinksDomainPagesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = domainPagesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksDomainPagesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call domainPagesLiveAsync(List<BacklinksDomainPagesLiveRequestInfo> payload, final ApiCallback<BacklinksDomainPagesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = domainPagesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksDomainPagesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call domainPagesSummaryLiveCall(List<BacklinksDomainPagesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/domain_pages_summary/live";

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
        private okhttp3.Call domainPagesSummaryLiveValidateBeforeCall(List<BacklinksDomainPagesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return domainPagesSummaryLiveCall(payload, _callback);
 
        }
 
        public BacklinksDomainPagesSummaryLiveResponseInfo domainPagesSummaryLive(List<BacklinksDomainPagesSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksDomainPagesSummaryLiveResponseInfo> localVarResp = domainPagesSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksDomainPagesSummaryLiveResponseInfo> domainPagesSummaryLiveWithHttpInfo(List<BacklinksDomainPagesSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = domainPagesSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksDomainPagesSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call domainPagesSummaryLiveAsync(List<BacklinksDomainPagesSummaryLiveRequestInfo> payload, final ApiCallback<BacklinksDomainPagesSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = domainPagesSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksDomainPagesSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call referringDomainsLiveCall(List<BacklinksReferringDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/referring_domains/live";

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
        private okhttp3.Call referringDomainsLiveValidateBeforeCall(List<BacklinksReferringDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return referringDomainsLiveCall(payload, _callback);
 
        }
 
        public BacklinksReferringDomainsLiveResponseInfo referringDomainsLive(List<BacklinksReferringDomainsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksReferringDomainsLiveResponseInfo> localVarResp = referringDomainsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksReferringDomainsLiveResponseInfo> referringDomainsLiveWithHttpInfo(List<BacklinksReferringDomainsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = referringDomainsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksReferringDomainsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call referringDomainsLiveAsync(List<BacklinksReferringDomainsLiveRequestInfo> payload, final ApiCallback<BacklinksReferringDomainsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = referringDomainsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksReferringDomainsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call referringNetworksLiveCall(List<BacklinksReferringNetworksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/referring_networks/live";

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
        private okhttp3.Call referringNetworksLiveValidateBeforeCall(List<BacklinksReferringNetworksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return referringNetworksLiveCall(payload, _callback);
 
        }
 
        public BacklinksReferringNetworksLiveResponseInfo referringNetworksLive(List<BacklinksReferringNetworksLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksReferringNetworksLiveResponseInfo> localVarResp = referringNetworksLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksReferringNetworksLiveResponseInfo> referringNetworksLiveWithHttpInfo(List<BacklinksReferringNetworksLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = referringNetworksLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksReferringNetworksLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call referringNetworksLiveAsync(List<BacklinksReferringNetworksLiveRequestInfo> payload, final ApiCallback<BacklinksReferringNetworksLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = referringNetworksLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksReferringNetworksLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call competitorsLiveCall(List<BacklinksCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/competitors/live";

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
        private okhttp3.Call competitorsLiveValidateBeforeCall(List<BacklinksCompetitorsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return competitorsLiveCall(payload, _callback);
 
        }
 
        public BacklinksCompetitorsLiveResponseInfo competitorsLive(List<BacklinksCompetitorsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksCompetitorsLiveResponseInfo> localVarResp = competitorsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksCompetitorsLiveResponseInfo> competitorsLiveWithHttpInfo(List<BacklinksCompetitorsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = competitorsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksCompetitorsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call competitorsLiveAsync(List<BacklinksCompetitorsLiveRequestInfo> payload, final ApiCallback<BacklinksCompetitorsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = competitorsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksCompetitorsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call domainIntersectionLiveCall(List<BacklinksDomainIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/domain_intersection/live";

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
        private okhttp3.Call domainIntersectionLiveValidateBeforeCall(List<BacklinksDomainIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return domainIntersectionLiveCall(payload, _callback);
 
        }
 
        public BacklinksDomainIntersectionLiveResponseInfo domainIntersectionLive(List<BacklinksDomainIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksDomainIntersectionLiveResponseInfo> localVarResp = domainIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksDomainIntersectionLiveResponseInfo> domainIntersectionLiveWithHttpInfo(List<BacklinksDomainIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = domainIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksDomainIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call domainIntersectionLiveAsync(List<BacklinksDomainIntersectionLiveRequestInfo> payload, final ApiCallback<BacklinksDomainIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = domainIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksDomainIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call pageIntersectionLiveCall(List<BacklinksPageIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/page_intersection/live";

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
        private okhttp3.Call pageIntersectionLiveValidateBeforeCall(List<BacklinksPageIntersectionLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return pageIntersectionLiveCall(payload, _callback);
 
        }
 
        public BacklinksPageIntersectionLiveResponseInfo pageIntersectionLive(List<BacklinksPageIntersectionLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksPageIntersectionLiveResponseInfo> localVarResp = pageIntersectionLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksPageIntersectionLiveResponseInfo> pageIntersectionLiveWithHttpInfo(List<BacklinksPageIntersectionLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = pageIntersectionLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksPageIntersectionLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call pageIntersectionLiveAsync(List<BacklinksPageIntersectionLiveRequestInfo> payload, final ApiCallback<BacklinksPageIntersectionLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = pageIntersectionLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksPageIntersectionLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call timeseriesSummaryLiveCall(List<BacklinksTimeseriesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/timeseries_summary/live";

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
        private okhttp3.Call timeseriesSummaryLiveValidateBeforeCall(List<BacklinksTimeseriesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return timeseriesSummaryLiveCall(payload, _callback);
 
        }
 
        public BacklinksTimeseriesSummaryLiveResponseInfo timeseriesSummaryLive(List<BacklinksTimeseriesSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksTimeseriesSummaryLiveResponseInfo> localVarResp = timeseriesSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksTimeseriesSummaryLiveResponseInfo> timeseriesSummaryLiveWithHttpInfo(List<BacklinksTimeseriesSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = timeseriesSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksTimeseriesSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call timeseriesSummaryLiveAsync(List<BacklinksTimeseriesSummaryLiveRequestInfo> payload, final ApiCallback<BacklinksTimeseriesSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = timeseriesSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksTimeseriesSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call timeseriesNewLostSummaryLiveCall(List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/timeseries_new_lost_summary/live";

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
        private okhttp3.Call timeseriesNewLostSummaryLiveValidateBeforeCall(List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return timeseriesNewLostSummaryLiveCall(payload, _callback);
 
        }
 
        public BacklinksTimeseriesNewLostSummaryLiveResponseInfo timeseriesNewLostSummaryLive(List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksTimeseriesNewLostSummaryLiveResponseInfo> localVarResp = timeseriesNewLostSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksTimeseriesNewLostSummaryLiveResponseInfo> timeseriesNewLostSummaryLiveWithHttpInfo(List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = timeseriesNewLostSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksTimeseriesNewLostSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call timeseriesNewLostSummaryLiveAsync(List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> payload, final ApiCallback<BacklinksTimeseriesNewLostSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = timeseriesNewLostSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksTimeseriesNewLostSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkRanksLiveCall(List<BacklinksBulkRanksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_ranks/live";

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
        private okhttp3.Call bulkRanksLiveValidateBeforeCall(List<BacklinksBulkRanksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkRanksLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkRanksLiveResponseInfo bulkRanksLive(List<BacklinksBulkRanksLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkRanksLiveResponseInfo> localVarResp = bulkRanksLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkRanksLiveResponseInfo> bulkRanksLiveWithHttpInfo(List<BacklinksBulkRanksLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkRanksLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkRanksLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkRanksLiveAsync(List<BacklinksBulkRanksLiveRequestInfo> payload, final ApiCallback<BacklinksBulkRanksLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkRanksLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkRanksLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkBacklinksLiveCall(List<BacklinksBulkBacklinksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_backlinks/live";

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
        private okhttp3.Call bulkBacklinksLiveValidateBeforeCall(List<BacklinksBulkBacklinksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkBacklinksLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkBacklinksLiveResponseInfo bulkBacklinksLive(List<BacklinksBulkBacklinksLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkBacklinksLiveResponseInfo> localVarResp = bulkBacklinksLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkBacklinksLiveResponseInfo> bulkBacklinksLiveWithHttpInfo(List<BacklinksBulkBacklinksLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkBacklinksLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkBacklinksLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkBacklinksLiveAsync(List<BacklinksBulkBacklinksLiveRequestInfo> payload, final ApiCallback<BacklinksBulkBacklinksLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkBacklinksLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkBacklinksLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkSpamScoreLiveCall(List<BacklinksBulkSpamScoreLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_spam_score/live";

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
        private okhttp3.Call bulkSpamScoreLiveValidateBeforeCall(List<BacklinksBulkSpamScoreLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkSpamScoreLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkSpamScoreLiveResponseInfo bulkSpamScoreLive(List<BacklinksBulkSpamScoreLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkSpamScoreLiveResponseInfo> localVarResp = bulkSpamScoreLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkSpamScoreLiveResponseInfo> bulkSpamScoreLiveWithHttpInfo(List<BacklinksBulkSpamScoreLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkSpamScoreLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkSpamScoreLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkSpamScoreLiveAsync(List<BacklinksBulkSpamScoreLiveRequestInfo> payload, final ApiCallback<BacklinksBulkSpamScoreLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkSpamScoreLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkSpamScoreLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkReferringDomainsLiveCall(List<BacklinksBulkReferringDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_referring_domains/live";

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
        private okhttp3.Call bulkReferringDomainsLiveValidateBeforeCall(List<BacklinksBulkReferringDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkReferringDomainsLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkReferringDomainsLiveResponseInfo bulkReferringDomainsLive(List<BacklinksBulkReferringDomainsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkReferringDomainsLiveResponseInfo> localVarResp = bulkReferringDomainsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkReferringDomainsLiveResponseInfo> bulkReferringDomainsLiveWithHttpInfo(List<BacklinksBulkReferringDomainsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkReferringDomainsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkReferringDomainsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkReferringDomainsLiveAsync(List<BacklinksBulkReferringDomainsLiveRequestInfo> payload, final ApiCallback<BacklinksBulkReferringDomainsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkReferringDomainsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkReferringDomainsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkNewLostBacklinksLiveCall(List<BacklinksBulkNewLostBacklinksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_new_lost_backlinks/live";

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
        private okhttp3.Call bulkNewLostBacklinksLiveValidateBeforeCall(List<BacklinksBulkNewLostBacklinksLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkNewLostBacklinksLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkNewLostBacklinksLiveResponseInfo bulkNewLostBacklinksLive(List<BacklinksBulkNewLostBacklinksLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkNewLostBacklinksLiveResponseInfo> localVarResp = bulkNewLostBacklinksLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkNewLostBacklinksLiveResponseInfo> bulkNewLostBacklinksLiveWithHttpInfo(List<BacklinksBulkNewLostBacklinksLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkNewLostBacklinksLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkNewLostBacklinksLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkNewLostBacklinksLiveAsync(List<BacklinksBulkNewLostBacklinksLiveRequestInfo> payload, final ApiCallback<BacklinksBulkNewLostBacklinksLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkNewLostBacklinksLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkNewLostBacklinksLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkNewLostReferringDomainsLiveCall(List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_new_lost_referring_domains/live";

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
        private okhttp3.Call bulkNewLostReferringDomainsLiveValidateBeforeCall(List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkNewLostReferringDomainsLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkNewLostReferringDomainsLiveResponseInfo bulkNewLostReferringDomainsLive(List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkNewLostReferringDomainsLiveResponseInfo> localVarResp = bulkNewLostReferringDomainsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkNewLostReferringDomainsLiveResponseInfo> bulkNewLostReferringDomainsLiveWithHttpInfo(List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkNewLostReferringDomainsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkNewLostReferringDomainsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkNewLostReferringDomainsLiveAsync(List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> payload, final ApiCallback<BacklinksBulkNewLostReferringDomainsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkNewLostReferringDomainsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkNewLostReferringDomainsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bulkPagesSummaryLiveCall(List<BacklinksBulkPagesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
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
           String localVarPath = "/v3/backlinks/bulk_pages_summary/live";

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
        private okhttp3.Call bulkPagesSummaryLiveValidateBeforeCall(List<BacklinksBulkPagesSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bulkPagesSummaryLiveCall(payload, _callback);
 
        }
 
        public BacklinksBulkPagesSummaryLiveResponseInfo bulkPagesSummaryLive(List<BacklinksBulkPagesSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BacklinksBulkPagesSummaryLiveResponseInfo> localVarResp = bulkPagesSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BacklinksBulkPagesSummaryLiveResponseInfo> bulkPagesSummaryLiveWithHttpInfo(List<BacklinksBulkPagesSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bulkPagesSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BacklinksBulkPagesSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bulkPagesSummaryLiveAsync(List<BacklinksBulkPagesSummaryLiveRequestInfo> payload, final ApiCallback<BacklinksBulkPagesSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bulkPagesSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BacklinksBulkPagesSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}