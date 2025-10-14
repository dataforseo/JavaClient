package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveRequestInfo;
import io.github.dataforseo.client.model.LlmMessageChainItem;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskGetResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLanguagesResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskGetResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationAiKeywordDataAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class AiOptimizationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiOptimizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiOptimizationApi(ApiClient apiClient) {
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


    public okhttp3.Call chatGptLlmResponsesModelsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/chat_gpt/llm_responses/models";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call chatGptLlmResponsesModelsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return chatGptLlmResponsesModelsCall(_callback);

    }

    public AiOptimizationChatGptLlmResponsesModelsResponseInfo chatGptLlmResponsesModels() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmResponsesModelsResponseInfo> localVarResp = chatGptLlmResponsesModelsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmResponsesModelsResponseInfo> chatGptLlmResponsesModelsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmResponsesModelsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesModelsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmResponsesModelsAsync(final ApiCallback<AiOptimizationChatGptLlmResponsesModelsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmResponsesModelsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesModelsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmResponsesLiveCall(List<AiOptimizationChatGptLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/chat_gpt/llm_responses/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call chatGptLlmResponsesLiveValidateBeforeCall(List<AiOptimizationChatGptLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return chatGptLlmResponsesLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationChatGptLlmResponsesLiveResponseInfo chatGptLlmResponsesLive(List<AiOptimizationChatGptLlmResponsesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationChatGptLlmResponsesLiveResponseInfo> localVarResp = chatGptLlmResponsesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationChatGptLlmResponsesLiveResponseInfo> chatGptLlmResponsesLiveWithHttpInfo(List<AiOptimizationChatGptLlmResponsesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = chatGptLlmResponsesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call chatGptLlmResponsesLiveAsync(List<AiOptimizationChatGptLlmResponsesLiveRequestInfo> payload, final ApiCallback<AiOptimizationChatGptLlmResponsesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = chatGptLlmResponsesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call chatGptLlmResponsesTaskPostCall(List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/chat_gpt/llm_responses/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call chatGptLlmResponsesTaskPostValidateBeforeCall(List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return chatGptLlmResponsesTaskPostCall(payload, _callback);
 
        }
 
        public AiOptimizationChatGptLlmResponsesTaskPostResponseInfo chatGptLlmResponsesTaskPost(List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationChatGptLlmResponsesTaskPostResponseInfo> localVarResp = chatGptLlmResponsesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationChatGptLlmResponsesTaskPostResponseInfo> chatGptLlmResponsesTaskPostWithHttpInfo(List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = chatGptLlmResponsesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call chatGptLlmResponsesTaskPostAsync(List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo> payload, final ApiCallback<AiOptimizationChatGptLlmResponsesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = chatGptLlmResponsesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call chatGptLlmResponsesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/chat_gpt/llm_responses/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call chatGptLlmResponsesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return chatGptLlmResponsesTasksReadyCall(_callback);

    }

    public AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo chatGptLlmResponsesTasksReady() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo> localVarResp = chatGptLlmResponsesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo> chatGptLlmResponsesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmResponsesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmResponsesTasksReadyAsync(final ApiCallback<AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmResponsesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmResponsesTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/ai_optimization/chat_gpt/llm_responses/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call chatGptLlmResponsesTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling chatGptLlmResponsesTaskGet(Async)");
       }

       return chatGptLlmResponsesTaskGetCall(id, _callback);

    }

    public AiOptimizationChatGptLlmResponsesTaskGetResponseInfo chatGptLlmResponsesTaskGet(String id) throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmResponsesTaskGetResponseInfo> localVarResp = chatGptLlmResponsesTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmResponsesTaskGetResponseInfo> chatGptLlmResponsesTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmResponsesTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmResponsesTaskGetAsync(String id, final ApiCallback<AiOptimizationChatGptLlmResponsesTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmResponsesTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmResponsesTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call aiOptimizationChatGptLlmScraperLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call aiOptimizationChatGptLlmScraperLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return aiOptimizationChatGptLlmScraperLocationsCall(_callback);

    }

    public AiOptimizationChatGptLlmScraperLocationsResponseInfo aiOptimizationChatGptLlmScraperLocations() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperLocationsResponseInfo> localVarResp = aiOptimizationChatGptLlmScraperLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperLocationsResponseInfo> aiOptimizationChatGptLlmScraperLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = aiOptimizationChatGptLlmScraperLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call aiOptimizationChatGptLlmScraperLocationsAsync(final ApiCallback<AiOptimizationChatGptLlmScraperLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = aiOptimizationChatGptLlmScraperLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call aiOptimizationChatGptLlmScraperLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call aiOptimizationChatGptLlmScraperLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling aiOptimizationChatGptLlmScraperLocationsCountry(Async)");
       }

       return aiOptimizationChatGptLlmScraperLocationsCountryCall(country, _callback);

    }

    public AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo aiOptimizationChatGptLlmScraperLocationsCountry(String country) throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo> localVarResp = aiOptimizationChatGptLlmScraperLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo> aiOptimizationChatGptLlmScraperLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = aiOptimizationChatGptLlmScraperLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call aiOptimizationChatGptLlmScraperLocationsCountryAsync(String country, final ApiCallback<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = aiOptimizationChatGptLlmScraperLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call aiOptimizationChatGptLlmScraperLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call aiOptimizationChatGptLlmScraperLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return aiOptimizationChatGptLlmScraperLanguagesCall(_callback);

    }

    public AiOptimizationChatGptLlmScraperLanguagesResponseInfo aiOptimizationChatGptLlmScraperLanguages() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperLanguagesResponseInfo> localVarResp = aiOptimizationChatGptLlmScraperLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperLanguagesResponseInfo> aiOptimizationChatGptLlmScraperLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = aiOptimizationChatGptLlmScraperLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call aiOptimizationChatGptLlmScraperLanguagesAsync(final ApiCallback<AiOptimizationChatGptLlmScraperLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = aiOptimizationChatGptLlmScraperLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmScraperTaskPostCall(List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call chatGptLlmScraperTaskPostValidateBeforeCall(List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return chatGptLlmScraperTaskPostCall(payload, _callback);
 
        }
 
        public AiOptimizationChatGptLlmScraperTaskPostResponseInfo chatGptLlmScraperTaskPost(List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationChatGptLlmScraperTaskPostResponseInfo> localVarResp = chatGptLlmScraperTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationChatGptLlmScraperTaskPostResponseInfo> chatGptLlmScraperTaskPostWithHttpInfo(List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = chatGptLlmScraperTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call chatGptLlmScraperTaskPostAsync(List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo> payload, final ApiCallback<AiOptimizationChatGptLlmScraperTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = chatGptLlmScraperTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call chatGptLlmScraperTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call chatGptLlmScraperTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return chatGptLlmScraperTasksReadyCall(_callback);

    }

    public AiOptimizationChatGptLlmScraperTasksReadyResponseInfo chatGptLlmScraperTasksReady() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperTasksReadyResponseInfo> localVarResp = chatGptLlmScraperTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperTasksReadyResponseInfo> chatGptLlmScraperTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmScraperTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmScraperTasksReadyAsync(final ApiCallback<AiOptimizationChatGptLlmScraperTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmScraperTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmScraperTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call chatGptLlmScraperTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling chatGptLlmScraperTaskGetAdvanced(Async)");
       }

       return chatGptLlmScraperTaskGetAdvancedCall(id, _callback);

    }

    public AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo chatGptLlmScraperTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo> localVarResp = chatGptLlmScraperTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo> chatGptLlmScraperTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmScraperTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmScraperTaskGetAdvancedAsync(String id, final ApiCallback<AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmScraperTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmScraperTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/ai_optimization/chat_gpt/llm_scraper/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call chatGptLlmScraperTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling chatGptLlmScraperTaskGetHtml(Async)");
       }

       return chatGptLlmScraperTaskGetHtmlCall(id, _callback);

    }

    public AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo chatGptLlmScraperTaskGetHtml(String id) throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo> localVarResp = chatGptLlmScraperTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo> chatGptLlmScraperTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmScraperTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmScraperTaskGetHtmlAsync(String id, final ApiCallback<AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmScraperTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call claudeLlmResponsesModelsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/claude/llm_responses/models";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call claudeLlmResponsesModelsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return claudeLlmResponsesModelsCall(_callback);

    }

    public AiOptimizationClaudeLlmResponsesModelsResponseInfo claudeLlmResponsesModels() throws ApiException {
       ApiResponse<AiOptimizationClaudeLlmResponsesModelsResponseInfo> localVarResp = claudeLlmResponsesModelsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationClaudeLlmResponsesModelsResponseInfo> claudeLlmResponsesModelsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = claudeLlmResponsesModelsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesModelsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call claudeLlmResponsesModelsAsync(final ApiCallback<AiOptimizationClaudeLlmResponsesModelsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = claudeLlmResponsesModelsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesModelsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call claudeLlmResponsesLiveCall(List<AiOptimizationClaudeLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/claude/llm_responses/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call claudeLlmResponsesLiveValidateBeforeCall(List<AiOptimizationClaudeLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return claudeLlmResponsesLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationClaudeLlmResponsesLiveResponseInfo claudeLlmResponsesLive(List<AiOptimizationClaudeLlmResponsesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationClaudeLlmResponsesLiveResponseInfo> localVarResp = claudeLlmResponsesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationClaudeLlmResponsesLiveResponseInfo> claudeLlmResponsesLiveWithHttpInfo(List<AiOptimizationClaudeLlmResponsesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = claudeLlmResponsesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call claudeLlmResponsesLiveAsync(List<AiOptimizationClaudeLlmResponsesLiveRequestInfo> payload, final ApiCallback<AiOptimizationClaudeLlmResponsesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = claudeLlmResponsesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call claudeLlmResponsesTaskPostCall(List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/claude/llm_responses/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call claudeLlmResponsesTaskPostValidateBeforeCall(List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return claudeLlmResponsesTaskPostCall(payload, _callback);
 
        }
 
        public AiOptimizationClaudeLlmResponsesTaskPostResponseInfo claudeLlmResponsesTaskPost(List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationClaudeLlmResponsesTaskPostResponseInfo> localVarResp = claudeLlmResponsesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationClaudeLlmResponsesTaskPostResponseInfo> claudeLlmResponsesTaskPostWithHttpInfo(List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = claudeLlmResponsesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call claudeLlmResponsesTaskPostAsync(List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo> payload, final ApiCallback<AiOptimizationClaudeLlmResponsesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = claudeLlmResponsesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call claudeLlmResponsesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/claude/llm_responses/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call claudeLlmResponsesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return claudeLlmResponsesTasksReadyCall(_callback);

    }

    public AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo claudeLlmResponsesTasksReady() throws ApiException {
       ApiResponse<AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo> localVarResp = claudeLlmResponsesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo> claudeLlmResponsesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = claudeLlmResponsesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call claudeLlmResponsesTasksReadyAsync(final ApiCallback<AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = claudeLlmResponsesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call claudeLlmResponsesTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/ai_optimization/claude/llm_responses/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call claudeLlmResponsesTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling claudeLlmResponsesTaskGet(Async)");
       }

       return claudeLlmResponsesTaskGetCall(id, _callback);

    }

    public AiOptimizationClaudeLlmResponsesTaskGetResponseInfo claudeLlmResponsesTaskGet(String id) throws ApiException {
       ApiResponse<AiOptimizationClaudeLlmResponsesTaskGetResponseInfo> localVarResp = claudeLlmResponsesTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationClaudeLlmResponsesTaskGetResponseInfo> claudeLlmResponsesTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = claudeLlmResponsesTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call claudeLlmResponsesTaskGetAsync(String id, final ApiCallback<AiOptimizationClaudeLlmResponsesTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = claudeLlmResponsesTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationClaudeLlmResponsesTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call geminiLlmResponsesModelsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/gemini/llm_responses/models";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call geminiLlmResponsesModelsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return geminiLlmResponsesModelsCall(_callback);

    }

    public AiOptimizationGeminiLlmResponsesModelsResponseInfo geminiLlmResponsesModels() throws ApiException {
       ApiResponse<AiOptimizationGeminiLlmResponsesModelsResponseInfo> localVarResp = geminiLlmResponsesModelsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationGeminiLlmResponsesModelsResponseInfo> geminiLlmResponsesModelsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = geminiLlmResponsesModelsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesModelsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call geminiLlmResponsesModelsAsync(final ApiCallback<AiOptimizationGeminiLlmResponsesModelsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = geminiLlmResponsesModelsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesModelsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call geminiLlmResponsesLiveCall(List<AiOptimizationGeminiLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/gemini/llm_responses/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call geminiLlmResponsesLiveValidateBeforeCall(List<AiOptimizationGeminiLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return geminiLlmResponsesLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationGeminiLlmResponsesLiveResponseInfo geminiLlmResponsesLive(List<AiOptimizationGeminiLlmResponsesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationGeminiLlmResponsesLiveResponseInfo> localVarResp = geminiLlmResponsesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationGeminiLlmResponsesLiveResponseInfo> geminiLlmResponsesLiveWithHttpInfo(List<AiOptimizationGeminiLlmResponsesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = geminiLlmResponsesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call geminiLlmResponsesLiveAsync(List<AiOptimizationGeminiLlmResponsesLiveRequestInfo> payload, final ApiCallback<AiOptimizationGeminiLlmResponsesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = geminiLlmResponsesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call perplexityLlmResponsesModelsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/perplexity/llm_responses/models";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call perplexityLlmResponsesModelsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return perplexityLlmResponsesModelsCall(_callback);

    }

    public AiOptimizationPerplexityLlmResponsesModelsResponseInfo perplexityLlmResponsesModels() throws ApiException {
       ApiResponse<AiOptimizationPerplexityLlmResponsesModelsResponseInfo> localVarResp = perplexityLlmResponsesModelsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationPerplexityLlmResponsesModelsResponseInfo> perplexityLlmResponsesModelsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = perplexityLlmResponsesModelsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationPerplexityLlmResponsesModelsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call perplexityLlmResponsesModelsAsync(final ApiCallback<AiOptimizationPerplexityLlmResponsesModelsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = perplexityLlmResponsesModelsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationPerplexityLlmResponsesModelsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call perplexityLlmResponsesLiveCall(List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/perplexity/llm_responses/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call perplexityLlmResponsesLiveValidateBeforeCall(List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return perplexityLlmResponsesLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationPerplexityLlmResponsesLiveResponseInfo perplexityLlmResponsesLive(List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationPerplexityLlmResponsesLiveResponseInfo> localVarResp = perplexityLlmResponsesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationPerplexityLlmResponsesLiveResponseInfo> perplexityLlmResponsesLiveWithHttpInfo(List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = perplexityLlmResponsesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationPerplexityLlmResponsesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call perplexityLlmResponsesLiveAsync(List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo> payload, final ApiCallback<AiOptimizationPerplexityLlmResponsesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = perplexityLlmResponsesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationPerplexityLlmResponsesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call aiKeywordDataAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/ai_keyword_data/available_filters";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call aiKeywordDataAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return aiKeywordDataAvailableFiltersCall(_callback);

    }

    public AiOptimizationAiKeywordDataAvailableFiltersResponseInfo aiKeywordDataAvailableFilters() throws ApiException {
       ApiResponse<AiOptimizationAiKeywordDataAvailableFiltersResponseInfo> localVarResp = aiKeywordDataAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationAiKeywordDataAvailableFiltersResponseInfo> aiKeywordDataAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = aiKeywordDataAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call aiKeywordDataAvailableFiltersAsync(final ApiCallback<AiOptimizationAiKeywordDataAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = aiKeywordDataAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call aiOptimizationAiKeywordDataLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/ai_keyword_data/locations_and_languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call aiOptimizationAiKeywordDataLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return aiOptimizationAiKeywordDataLocationsAndLanguagesCall(_callback);

    }

    public AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo aiOptimizationAiKeywordDataLocationsAndLanguages() throws ApiException {
       ApiResponse<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo> localVarResp = aiOptimizationAiKeywordDataLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo> aiOptimizationAiKeywordDataLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = aiOptimizationAiKeywordDataLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call aiOptimizationAiKeywordDataLocationsAndLanguagesAsync(final ApiCallback<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = aiOptimizationAiKeywordDataLocationsAndLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call aiKeywordDataKeywordsSearchVolumeLiveCall(List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/ai_keyword_data/keywords_search_volume/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call aiKeywordDataKeywordsSearchVolumeLiveValidateBeforeCall(List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return aiKeywordDataKeywordsSearchVolumeLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo aiKeywordDataKeywordsSearchVolumeLive(List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo> localVarResp = aiKeywordDataKeywordsSearchVolumeLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo> aiKeywordDataKeywordsSearchVolumeLiveWithHttpInfo(List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = aiKeywordDataKeywordsSearchVolumeLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call aiKeywordDataKeywordsSearchVolumeLiveAsync(List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo> payload, final ApiCallback<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = aiKeywordDataKeywordsSearchVolumeLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}