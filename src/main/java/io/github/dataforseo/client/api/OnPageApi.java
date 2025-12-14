package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.OnPageIdListRequestInfo;
import io.github.dataforseo.client.model.OnPageIdListResponseInfo;
import io.github.dataforseo.client.model.OnPageErrorsRequestInfo;
import io.github.dataforseo.client.model.OnPageErrorsResponseInfo;
import io.github.dataforseo.client.model.OnPageForceStopRequestInfo;
import io.github.dataforseo.client.model.OnPageForceStopResponseInfo;
import io.github.dataforseo.client.model.OnPageAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.OnPageTaskPostRequestInfo;
import io.github.dataforseo.client.model.OnPageTaskPostResponseInfo;
import io.github.dataforseo.client.model.OnPageTasksReadyResponseInfo;
import io.github.dataforseo.client.model.OnPageSummaryResponseInfo;
import io.github.dataforseo.client.model.OnPagePagesRequestInfo;
import io.github.dataforseo.client.model.OnPagePagesResponseInfo;
import io.github.dataforseo.client.model.OnPagePagesByResourceRequestInfo;
import io.github.dataforseo.client.model.OnPagePagesByResourceResponseInfo;
import io.github.dataforseo.client.model.OnPageResourcesRequestInfo;
import io.github.dataforseo.client.model.OnPageResourcesResponseInfo;
import io.github.dataforseo.client.model.OnPageDuplicateTagsRequestInfo;
import io.github.dataforseo.client.model.OnPageDuplicateTagsResponseInfo;
import io.github.dataforseo.client.model.OnPageDuplicateContentRequestInfo;
import io.github.dataforseo.client.model.OnPageDuplicateContentResponseInfo;
import io.github.dataforseo.client.model.OnPageLinksRequestInfo;
import io.github.dataforseo.client.model.OnPageLinksResponseInfo;
import io.github.dataforseo.client.model.OnPageRedirectChainsRequestInfo;
import io.github.dataforseo.client.model.OnPageRedirectChainsResponseInfo;
import io.github.dataforseo.client.model.OnPageNonIndexableRequestInfo;
import io.github.dataforseo.client.model.OnPageNonIndexableResponseInfo;
import io.github.dataforseo.client.model.OnPageWaterfallRequestInfo;
import io.github.dataforseo.client.model.OnPageWaterfallResponseInfo;
import io.github.dataforseo.client.model.OnPageKeywordDensityRequestInfo;
import io.github.dataforseo.client.model.OnPageKeywordDensityResponseInfo;
import io.github.dataforseo.client.model.OnPageMicrodataRequestInfo;
import io.github.dataforseo.client.model.OnPageMicrodataResponseInfo;
import io.github.dataforseo.client.model.OnPageRawHtmlRequestInfo;
import io.github.dataforseo.client.model.OnPageRawHtmlResponseInfo;
import io.github.dataforseo.client.model.OnPagePageScreenshotRequestInfo;
import io.github.dataforseo.client.model.OnPagePageScreenshotResponseInfo;
import io.github.dataforseo.client.model.OnPageContentParsingRequestInfo;
import io.github.dataforseo.client.model.OnPageContentParsingResponseInfo;
import io.github.dataforseo.client.model.OnPageContentParsingLiveRequestInfo;
import io.github.dataforseo.client.model.OnPageContentParsingLiveResponseInfo;
import io.github.dataforseo.client.model.OnPageInstantPagesRequestInfo;
import io.github.dataforseo.client.model.OnPageInstantPagesResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseLanguagesResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseAuditsResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseVersionsResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseTaskPostRequestInfo;
import io.github.dataforseo.client.model.OnPageLighthouseTaskPostResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseTasksReadyResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseTaskGetJsonResponseInfo;
import io.github.dataforseo.client.model.OnPageLighthouseLiveJsonRequestInfo;
import io.github.dataforseo.client.model.OnPageLighthouseLiveJsonResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class OnPageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OnPageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OnPageApi(ApiClient apiClient) {
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


    public okhttp3.Call onPageIdListCall(List<OnPageIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/id_list";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call onPageIdListValidateBeforeCall(List<OnPageIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return onPageIdListCall(payload, _callback);
 
        }
 
        public OnPageIdListResponseInfo onPageIdList(List<OnPageIdListRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageIdListResponseInfo> localVarResp = onPageIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageIdListResponseInfo> onPageIdListWithHttpInfo(List<OnPageIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = onPageIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call onPageIdListAsync(List<OnPageIdListRequestInfo> payload, final ApiCallback<OnPageIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = onPageIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call onPageErrorsCall(List<OnPageErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/errors";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call onPageErrorsValidateBeforeCall(List<OnPageErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return onPageErrorsCall(payload, _callback);
 
        }
 
        public OnPageErrorsResponseInfo onPageErrors(List<OnPageErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageErrorsResponseInfo> localVarResp = onPageErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageErrorsResponseInfo> onPageErrorsWithHttpInfo(List<OnPageErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = onPageErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call onPageErrorsAsync(List<OnPageErrorsRequestInfo> payload, final ApiCallback<OnPageErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = onPageErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call forceStopCall(List<OnPageForceStopRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/force_stop";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call forceStopValidateBeforeCall(List<OnPageForceStopRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return forceStopCall(payload, _callback);
 
        }
 
        public OnPageForceStopResponseInfo forceStop(List<OnPageForceStopRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageForceStopResponseInfo> localVarResp = forceStopWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageForceStopResponseInfo> forceStopWithHttpInfo(List<OnPageForceStopRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = forceStopValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageForceStopResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call forceStopAsync(List<OnPageForceStopRequestInfo> payload, final ApiCallback<OnPageForceStopResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = forceStopValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageForceStopResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call onPageAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/on_page/available_filters";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call onPageAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return onPageAvailableFiltersCall(_callback);

    }

    public OnPageAvailableFiltersResponseInfo onPageAvailableFilters() throws ApiException {
       ApiResponse<OnPageAvailableFiltersResponseInfo> localVarResp = onPageAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<OnPageAvailableFiltersResponseInfo> onPageAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = onPageAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<OnPageAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call onPageAvailableFiltersAsync(final ApiCallback<OnPageAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = onPageAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<OnPageAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call taskPostCall(List<OnPageTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call taskPostValidateBeforeCall(List<OnPageTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return taskPostCall(payload, _callback);
 
        }
 
        public OnPageTaskPostResponseInfo taskPost(List<OnPageTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageTaskPostResponseInfo> localVarResp = taskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageTaskPostResponseInfo> taskPostWithHttpInfo(List<OnPageTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = taskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call taskPostAsync(List<OnPageTaskPostRequestInfo> payload, final ApiCallback<OnPageTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = taskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call onPageTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/on_page/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call onPageTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return onPageTasksReadyCall(_callback);

    }

    public OnPageTasksReadyResponseInfo onPageTasksReady() throws ApiException {
       ApiResponse<OnPageTasksReadyResponseInfo> localVarResp = onPageTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<OnPageTasksReadyResponseInfo> onPageTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = onPageTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<OnPageTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call onPageTasksReadyAsync(final ApiCallback<OnPageTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = onPageTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<OnPageTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call summaryCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/on_page/summary/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call summaryValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling summary(Async)");
       }

       return summaryCall(id, _callback);

    }

    public OnPageSummaryResponseInfo summary(String id) throws ApiException {
       ApiResponse<OnPageSummaryResponseInfo> localVarResp = summaryWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<OnPageSummaryResponseInfo> summaryWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = summaryValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<OnPageSummaryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call summaryAsync(String id, final ApiCallback<OnPageSummaryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = summaryValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<OnPageSummaryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call pagesCall(List<OnPagePagesRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/pages";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call pagesValidateBeforeCall(List<OnPagePagesRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return pagesCall(payload, _callback);
 
        }
 
        public OnPagePagesResponseInfo pages(List<OnPagePagesRequestInfo> payload) throws ApiException {
            ApiResponse<OnPagePagesResponseInfo> localVarResp = pagesWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPagePagesResponseInfo> pagesWithHttpInfo(List<OnPagePagesRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = pagesValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPagePagesResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call pagesAsync(List<OnPagePagesRequestInfo> payload, final ApiCallback<OnPagePagesResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = pagesValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPagePagesResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call pagesByResourceCall(List<OnPagePagesByResourceRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/pages_by_resource";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call pagesByResourceValidateBeforeCall(List<OnPagePagesByResourceRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return pagesByResourceCall(payload, _callback);
 
        }
 
        public OnPagePagesByResourceResponseInfo pagesByResource(List<OnPagePagesByResourceRequestInfo> payload) throws ApiException {
            ApiResponse<OnPagePagesByResourceResponseInfo> localVarResp = pagesByResourceWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPagePagesByResourceResponseInfo> pagesByResourceWithHttpInfo(List<OnPagePagesByResourceRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = pagesByResourceValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPagePagesByResourceResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call pagesByResourceAsync(List<OnPagePagesByResourceRequestInfo> payload, final ApiCallback<OnPagePagesByResourceResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = pagesByResourceValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPagePagesByResourceResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call resourcesCall(List<OnPageResourcesRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/resources";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call resourcesValidateBeforeCall(List<OnPageResourcesRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return resourcesCall(payload, _callback);
 
        }
 
        public OnPageResourcesResponseInfo resources(List<OnPageResourcesRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageResourcesResponseInfo> localVarResp = resourcesWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageResourcesResponseInfo> resourcesWithHttpInfo(List<OnPageResourcesRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = resourcesValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageResourcesResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call resourcesAsync(List<OnPageResourcesRequestInfo> payload, final ApiCallback<OnPageResourcesResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = resourcesValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageResourcesResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call duplicateTagsCall(List<OnPageDuplicateTagsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/duplicate_tags";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call duplicateTagsValidateBeforeCall(List<OnPageDuplicateTagsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return duplicateTagsCall(payload, _callback);
 
        }
 
        public OnPageDuplicateTagsResponseInfo duplicateTags(List<OnPageDuplicateTagsRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageDuplicateTagsResponseInfo> localVarResp = duplicateTagsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageDuplicateTagsResponseInfo> duplicateTagsWithHttpInfo(List<OnPageDuplicateTagsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = duplicateTagsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageDuplicateTagsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call duplicateTagsAsync(List<OnPageDuplicateTagsRequestInfo> payload, final ApiCallback<OnPageDuplicateTagsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = duplicateTagsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageDuplicateTagsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call duplicateContentCall(List<OnPageDuplicateContentRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/duplicate_content";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call duplicateContentValidateBeforeCall(List<OnPageDuplicateContentRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return duplicateContentCall(payload, _callback);
 
        }
 
        public OnPageDuplicateContentResponseInfo duplicateContent(List<OnPageDuplicateContentRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageDuplicateContentResponseInfo> localVarResp = duplicateContentWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageDuplicateContentResponseInfo> duplicateContentWithHttpInfo(List<OnPageDuplicateContentRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = duplicateContentValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageDuplicateContentResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call duplicateContentAsync(List<OnPageDuplicateContentRequestInfo> payload, final ApiCallback<OnPageDuplicateContentResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = duplicateContentValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageDuplicateContentResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call linksCall(List<OnPageLinksRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/links";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call linksValidateBeforeCall(List<OnPageLinksRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return linksCall(payload, _callback);
 
        }
 
        public OnPageLinksResponseInfo links(List<OnPageLinksRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageLinksResponseInfo> localVarResp = linksWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageLinksResponseInfo> linksWithHttpInfo(List<OnPageLinksRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = linksValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageLinksResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call linksAsync(List<OnPageLinksRequestInfo> payload, final ApiCallback<OnPageLinksResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = linksValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageLinksResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call redirectChainsCall(List<OnPageRedirectChainsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/redirect_chains";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call redirectChainsValidateBeforeCall(List<OnPageRedirectChainsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return redirectChainsCall(payload, _callback);
 
        }
 
        public OnPageRedirectChainsResponseInfo redirectChains(List<OnPageRedirectChainsRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageRedirectChainsResponseInfo> localVarResp = redirectChainsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageRedirectChainsResponseInfo> redirectChainsWithHttpInfo(List<OnPageRedirectChainsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = redirectChainsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageRedirectChainsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call redirectChainsAsync(List<OnPageRedirectChainsRequestInfo> payload, final ApiCallback<OnPageRedirectChainsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = redirectChainsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageRedirectChainsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call nonIndexableCall(List<OnPageNonIndexableRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/non_indexable";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call nonIndexableValidateBeforeCall(List<OnPageNonIndexableRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return nonIndexableCall(payload, _callback);
 
        }
 
        public OnPageNonIndexableResponseInfo nonIndexable(List<OnPageNonIndexableRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageNonIndexableResponseInfo> localVarResp = nonIndexableWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageNonIndexableResponseInfo> nonIndexableWithHttpInfo(List<OnPageNonIndexableRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = nonIndexableValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageNonIndexableResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call nonIndexableAsync(List<OnPageNonIndexableRequestInfo> payload, final ApiCallback<OnPageNonIndexableResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = nonIndexableValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageNonIndexableResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call waterfallCall(List<OnPageWaterfallRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/waterfall";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call waterfallValidateBeforeCall(List<OnPageWaterfallRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return waterfallCall(payload, _callback);
 
        }
 
        public OnPageWaterfallResponseInfo waterfall(List<OnPageWaterfallRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageWaterfallResponseInfo> localVarResp = waterfallWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageWaterfallResponseInfo> waterfallWithHttpInfo(List<OnPageWaterfallRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = waterfallValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageWaterfallResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call waterfallAsync(List<OnPageWaterfallRequestInfo> payload, final ApiCallback<OnPageWaterfallResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = waterfallValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageWaterfallResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call keywordDensityCall(List<OnPageKeywordDensityRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/keyword_density";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call keywordDensityValidateBeforeCall(List<OnPageKeywordDensityRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return keywordDensityCall(payload, _callback);
 
        }
 
        public OnPageKeywordDensityResponseInfo keywordDensity(List<OnPageKeywordDensityRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageKeywordDensityResponseInfo> localVarResp = keywordDensityWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageKeywordDensityResponseInfo> keywordDensityWithHttpInfo(List<OnPageKeywordDensityRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = keywordDensityValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageKeywordDensityResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call keywordDensityAsync(List<OnPageKeywordDensityRequestInfo> payload, final ApiCallback<OnPageKeywordDensityResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = keywordDensityValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageKeywordDensityResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call microdataCall(List<OnPageMicrodataRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/microdata";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call microdataValidateBeforeCall(List<OnPageMicrodataRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return microdataCall(payload, _callback);
 
        }
 
        public OnPageMicrodataResponseInfo microdata(List<OnPageMicrodataRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageMicrodataResponseInfo> localVarResp = microdataWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageMicrodataResponseInfo> microdataWithHttpInfo(List<OnPageMicrodataRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = microdataValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageMicrodataResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call microdataAsync(List<OnPageMicrodataRequestInfo> payload, final ApiCallback<OnPageMicrodataResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = microdataValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageMicrodataResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call rawHtmlCall(List<OnPageRawHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/raw_html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call rawHtmlValidateBeforeCall(List<OnPageRawHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return rawHtmlCall(payload, _callback);
 
        }
 
        public OnPageRawHtmlResponseInfo rawHtml(List<OnPageRawHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageRawHtmlResponseInfo> localVarResp = rawHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageRawHtmlResponseInfo> rawHtmlWithHttpInfo(List<OnPageRawHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = rawHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageRawHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call rawHtmlAsync(List<OnPageRawHtmlRequestInfo> payload, final ApiCallback<OnPageRawHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = rawHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageRawHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call pageScreenshotCall(List<OnPagePageScreenshotRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/page_screenshot";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call pageScreenshotValidateBeforeCall(List<OnPagePageScreenshotRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return pageScreenshotCall(payload, _callback);
 
        }
 
        public OnPagePageScreenshotResponseInfo pageScreenshot(List<OnPagePageScreenshotRequestInfo> payload) throws ApiException {
            ApiResponse<OnPagePageScreenshotResponseInfo> localVarResp = pageScreenshotWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPagePageScreenshotResponseInfo> pageScreenshotWithHttpInfo(List<OnPagePageScreenshotRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = pageScreenshotValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPagePageScreenshotResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call pageScreenshotAsync(List<OnPagePageScreenshotRequestInfo> payload, final ApiCallback<OnPagePageScreenshotResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = pageScreenshotValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPagePageScreenshotResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call contentParsingCall(List<OnPageContentParsingRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/content_parsing";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call contentParsingValidateBeforeCall(List<OnPageContentParsingRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return contentParsingCall(payload, _callback);
 
        }
 
        public OnPageContentParsingResponseInfo contentParsing(List<OnPageContentParsingRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageContentParsingResponseInfo> localVarResp = contentParsingWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageContentParsingResponseInfo> contentParsingWithHttpInfo(List<OnPageContentParsingRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = contentParsingValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageContentParsingResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call contentParsingAsync(List<OnPageContentParsingRequestInfo> payload, final ApiCallback<OnPageContentParsingResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = contentParsingValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageContentParsingResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call contentParsingLiveCall(List<OnPageContentParsingLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/content_parsing/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call contentParsingLiveValidateBeforeCall(List<OnPageContentParsingLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return contentParsingLiveCall(payload, _callback);
 
        }
 
        public OnPageContentParsingLiveResponseInfo contentParsingLive(List<OnPageContentParsingLiveRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageContentParsingLiveResponseInfo> localVarResp = contentParsingLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageContentParsingLiveResponseInfo> contentParsingLiveWithHttpInfo(List<OnPageContentParsingLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = contentParsingLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageContentParsingLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call contentParsingLiveAsync(List<OnPageContentParsingLiveRequestInfo> payload, final ApiCallback<OnPageContentParsingLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = contentParsingLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageContentParsingLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call instantPagesCall(List<OnPageInstantPagesRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/instant_pages";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call instantPagesValidateBeforeCall(List<OnPageInstantPagesRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return instantPagesCall(payload, _callback);
 
        }
 
        public OnPageInstantPagesResponseInfo instantPages(List<OnPageInstantPagesRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageInstantPagesResponseInfo> localVarResp = instantPagesWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageInstantPagesResponseInfo> instantPagesWithHttpInfo(List<OnPageInstantPagesRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = instantPagesValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageInstantPagesResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call instantPagesAsync(List<OnPageInstantPagesRequestInfo> payload, final ApiCallback<OnPageInstantPagesResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = instantPagesValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageInstantPagesResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call lighthouseLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/on_page/lighthouse/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call lighthouseLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return lighthouseLanguagesCall(_callback);

    }

    public OnPageLighthouseLanguagesResponseInfo lighthouseLanguages() throws ApiException {
       ApiResponse<OnPageLighthouseLanguagesResponseInfo> localVarResp = lighthouseLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<OnPageLighthouseLanguagesResponseInfo> lighthouseLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = lighthouseLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<OnPageLighthouseLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call lighthouseLanguagesAsync(final ApiCallback<OnPageLighthouseLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = lighthouseLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<OnPageLighthouseLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call lighthouseAuditsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/on_page/lighthouse/audits";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call lighthouseAuditsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return lighthouseAuditsCall(_callback);

    }

    public OnPageLighthouseAuditsResponseInfo lighthouseAudits() throws ApiException {
       ApiResponse<OnPageLighthouseAuditsResponseInfo> localVarResp = lighthouseAuditsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<OnPageLighthouseAuditsResponseInfo> lighthouseAuditsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = lighthouseAuditsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<OnPageLighthouseAuditsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call lighthouseAuditsAsync(final ApiCallback<OnPageLighthouseAuditsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = lighthouseAuditsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<OnPageLighthouseAuditsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call lighthouseVersionsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/on_page/lighthouse/versions";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call lighthouseVersionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return lighthouseVersionsCall(_callback);

    }

    public OnPageLighthouseVersionsResponseInfo lighthouseVersions() throws ApiException {
       ApiResponse<OnPageLighthouseVersionsResponseInfo> localVarResp = lighthouseVersionsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<OnPageLighthouseVersionsResponseInfo> lighthouseVersionsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = lighthouseVersionsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<OnPageLighthouseVersionsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call lighthouseVersionsAsync(final ApiCallback<OnPageLighthouseVersionsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = lighthouseVersionsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<OnPageLighthouseVersionsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call lighthouseTaskPostCall(List<OnPageLighthouseTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/lighthouse/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call lighthouseTaskPostValidateBeforeCall(List<OnPageLighthouseTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return lighthouseTaskPostCall(payload, _callback);
 
        }
 
        public OnPageLighthouseTaskPostResponseInfo lighthouseTaskPost(List<OnPageLighthouseTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageLighthouseTaskPostResponseInfo> localVarResp = lighthouseTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageLighthouseTaskPostResponseInfo> lighthouseTaskPostWithHttpInfo(List<OnPageLighthouseTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = lighthouseTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageLighthouseTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call lighthouseTaskPostAsync(List<OnPageLighthouseTaskPostRequestInfo> payload, final ApiCallback<OnPageLighthouseTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = lighthouseTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageLighthouseTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call lighthouseTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/on_page/lighthouse/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call lighthouseTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return lighthouseTasksReadyCall(_callback);

    }

    public OnPageLighthouseTasksReadyResponseInfo lighthouseTasksReady() throws ApiException {
       ApiResponse<OnPageLighthouseTasksReadyResponseInfo> localVarResp = lighthouseTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<OnPageLighthouseTasksReadyResponseInfo> lighthouseTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = lighthouseTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<OnPageLighthouseTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call lighthouseTasksReadyAsync(final ApiCallback<OnPageLighthouseTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = lighthouseTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<OnPageLighthouseTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call lighthouseTaskGetJsonCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/on_page/lighthouse/task_get/json/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call lighthouseTaskGetJsonValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling lighthouseTaskGetJson(Async)");
       }

       return lighthouseTaskGetJsonCall(id, _callback);

    }

    public OnPageLighthouseTaskGetJsonResponseInfo lighthouseTaskGetJson(String id) throws ApiException {
       ApiResponse<OnPageLighthouseTaskGetJsonResponseInfo> localVarResp = lighthouseTaskGetJsonWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<OnPageLighthouseTaskGetJsonResponseInfo> lighthouseTaskGetJsonWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = lighthouseTaskGetJsonValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<OnPageLighthouseTaskGetJsonResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call lighthouseTaskGetJsonAsync(String id, final ApiCallback<OnPageLighthouseTaskGetJsonResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = lighthouseTaskGetJsonValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<OnPageLighthouseTaskGetJsonResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call lighthouseLiveJsonCall(List<OnPageLighthouseLiveJsonRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/on_page/lighthouse/live/json";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call lighthouseLiveJsonValidateBeforeCall(List<OnPageLighthouseLiveJsonRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return lighthouseLiveJsonCall(payload, _callback);
 
        }
 
        public OnPageLighthouseLiveJsonResponseInfo lighthouseLiveJson(List<OnPageLighthouseLiveJsonRequestInfo> payload) throws ApiException {
            ApiResponse<OnPageLighthouseLiveJsonResponseInfo> localVarResp = lighthouseLiveJsonWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<OnPageLighthouseLiveJsonResponseInfo> lighthouseLiveJsonWithHttpInfo(List<OnPageLighthouseLiveJsonRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = lighthouseLiveJsonValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<OnPageLighthouseLiveJsonResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call lighthouseLiveJsonAsync(List<OnPageLighthouseLiveJsonRequestInfo> payload, final ApiCallback<OnPageLighthouseLiveJsonResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = lighthouseLiveJsonValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<OnPageLighthouseLiveJsonResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}