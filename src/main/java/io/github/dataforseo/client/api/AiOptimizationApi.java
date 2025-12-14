package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLanguagesResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsSearchLiveRequestInfo;
import io.github.dataforseo.client.model.BaseAiOptimizationLLmMentionsTargetElement;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsSearchLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsTopPagesLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsTopPagesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsTopDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsTopDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationLLmMentionsCrossAggregateMetricsTargetInfo;
import io.github.dataforseo.client.model.AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveRequestInfo;
import io.github.dataforseo.client.model.LlmMessageChainItem;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskGetResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskGetResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesModelsResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesTaskPostRequestInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesTaskPostResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesTaskGetResponseInfo;
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


    public okhttp3.Call chatGptLlmScraperLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
    private okhttp3.Call chatGptLlmScraperLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return chatGptLlmScraperLocationsCall(_callback);

    }

    public AiOptimizationChatGptLlmScraperLocationsResponseInfo chatGptLlmScraperLocations() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperLocationsResponseInfo> localVarResp = chatGptLlmScraperLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperLocationsResponseInfo> chatGptLlmScraperLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmScraperLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmScraperLocationsAsync(final ApiCallback<AiOptimizationChatGptLlmScraperLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmScraperLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmScraperLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
    private okhttp3.Call chatGptLlmScraperLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling chatGptLlmScraperLocationsCountry(Async)");
       }

       return chatGptLlmScraperLocationsCountryCall(country, _callback);

    }

    public AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo chatGptLlmScraperLocationsCountry(String country) throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo> localVarResp = chatGptLlmScraperLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo> chatGptLlmScraperLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmScraperLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmScraperLocationsCountryAsync(String country, final ApiCallback<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmScraperLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call chatGptLlmScraperLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
    private okhttp3.Call chatGptLlmScraperLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return chatGptLlmScraperLanguagesCall(_callback);

    }

    public AiOptimizationChatGptLlmScraperLanguagesResponseInfo chatGptLlmScraperLanguages() throws ApiException {
       ApiResponse<AiOptimizationChatGptLlmScraperLanguagesResponseInfo> localVarResp = chatGptLlmScraperLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationChatGptLlmScraperLanguagesResponseInfo> chatGptLlmScraperLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = chatGptLlmScraperLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationChatGptLlmScraperLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call chatGptLlmScraperLanguagesAsync(final ApiCallback<AiOptimizationChatGptLlmScraperLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = chatGptLlmScraperLanguagesValidateBeforeCall(_callback);
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

    public okhttp3.Call llmMentionsLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/llm_mentions/locations_and_languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call llmMentionsLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return llmMentionsLocationsAndLanguagesCall(_callback);

    }

    public AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo llmMentionsLocationsAndLanguages() throws ApiException {
       ApiResponse<AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo> localVarResp = llmMentionsLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo> llmMentionsLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = llmMentionsLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call llmMentionsLocationsAndLanguagesAsync(final ApiCallback<AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = llmMentionsLocationsAndLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call llmMentionsAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/llm_mentions/available_filters";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call llmMentionsAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return llmMentionsAvailableFiltersCall(_callback);

    }

    public AiOptimizationLlmMentionsAvailableFiltersResponseInfo llmMentionsAvailableFilters() throws ApiException {
       ApiResponse<AiOptimizationLlmMentionsAvailableFiltersResponseInfo> localVarResp = llmMentionsAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationLlmMentionsAvailableFiltersResponseInfo> llmMentionsAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = llmMentionsAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call llmMentionsAvailableFiltersAsync(final ApiCallback<AiOptimizationLlmMentionsAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = llmMentionsAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call llmMentionsSearchLiveCall(List<AiOptimizationLlmMentionsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/llm_mentions/search/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call llmMentionsSearchLiveValidateBeforeCall(List<AiOptimizationLlmMentionsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return llmMentionsSearchLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationLlmMentionsSearchLiveResponseInfo llmMentionsSearchLive(List<AiOptimizationLlmMentionsSearchLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationLlmMentionsSearchLiveResponseInfo> localVarResp = llmMentionsSearchLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationLlmMentionsSearchLiveResponseInfo> llmMentionsSearchLiveWithHttpInfo(List<AiOptimizationLlmMentionsSearchLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = llmMentionsSearchLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsSearchLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call llmMentionsSearchLiveAsync(List<AiOptimizationLlmMentionsSearchLiveRequestInfo> payload, final ApiCallback<AiOptimizationLlmMentionsSearchLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = llmMentionsSearchLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsSearchLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call llmMentionsTopPagesLiveCall(List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/llm_mentions/top_pages/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call llmMentionsTopPagesLiveValidateBeforeCall(List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return llmMentionsTopPagesLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationLlmMentionsTopPagesLiveResponseInfo llmMentionsTopPagesLive(List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationLlmMentionsTopPagesLiveResponseInfo> localVarResp = llmMentionsTopPagesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationLlmMentionsTopPagesLiveResponseInfo> llmMentionsTopPagesLiveWithHttpInfo(List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = llmMentionsTopPagesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsTopPagesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call llmMentionsTopPagesLiveAsync(List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo> payload, final ApiCallback<AiOptimizationLlmMentionsTopPagesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = llmMentionsTopPagesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsTopPagesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call llmMentionsTopDomainsLiveCall(List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/llm_mentions/top_domains/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call llmMentionsTopDomainsLiveValidateBeforeCall(List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return llmMentionsTopDomainsLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationLlmMentionsTopDomainsLiveResponseInfo llmMentionsTopDomainsLive(List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationLlmMentionsTopDomainsLiveResponseInfo> localVarResp = llmMentionsTopDomainsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationLlmMentionsTopDomainsLiveResponseInfo> llmMentionsTopDomainsLiveWithHttpInfo(List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = llmMentionsTopDomainsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsTopDomainsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call llmMentionsTopDomainsLiveAsync(List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo> payload, final ApiCallback<AiOptimizationLlmMentionsTopDomainsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = llmMentionsTopDomainsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsTopDomainsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call llmMentionsAggregatedMetricsLiveCall(List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/llm_mentions/aggregated_metrics/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call llmMentionsAggregatedMetricsLiveValidateBeforeCall(List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return llmMentionsAggregatedMetricsLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo llmMentionsAggregatedMetricsLive(List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo> localVarResp = llmMentionsAggregatedMetricsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo> llmMentionsAggregatedMetricsLiveWithHttpInfo(List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = llmMentionsAggregatedMetricsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call llmMentionsAggregatedMetricsLiveAsync(List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo> payload, final ApiCallback<AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = llmMentionsAggregatedMetricsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call llmMentionsCrossAggregatedMetricsLiveCall(List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/llm_mentions/cross_aggregated_metrics/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call llmMentionsCrossAggregatedMetricsLiveValidateBeforeCall(List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return llmMentionsCrossAggregatedMetricsLiveCall(payload, _callback);
 
        }
 
        public AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo llmMentionsCrossAggregatedMetricsLive(List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo> localVarResp = llmMentionsCrossAggregatedMetricsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo> llmMentionsCrossAggregatedMetricsLiveWithHttpInfo(List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = llmMentionsCrossAggregatedMetricsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call llmMentionsCrossAggregatedMetricsLiveAsync(List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo> payload, final ApiCallback<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = llmMentionsCrossAggregatedMetricsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
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

    public okhttp3.Call geminiLlmResponsesTaskPostCall(List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/ai_optimization/gemini/llm_responses/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call geminiLlmResponsesTaskPostValidateBeforeCall(List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return geminiLlmResponsesTaskPostCall(payload, _callback);
 
        }
 
        public AiOptimizationGeminiLlmResponsesTaskPostResponseInfo geminiLlmResponsesTaskPost(List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<AiOptimizationGeminiLlmResponsesTaskPostResponseInfo> localVarResp = geminiLlmResponsesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<AiOptimizationGeminiLlmResponsesTaskPostResponseInfo> geminiLlmResponsesTaskPostWithHttpInfo(List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = geminiLlmResponsesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call geminiLlmResponsesTaskPostAsync(List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo> payload, final ApiCallback<AiOptimizationGeminiLlmResponsesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = geminiLlmResponsesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call geminiLlmResponsesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/ai_optimization/gemini/llm_responses/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call geminiLlmResponsesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return geminiLlmResponsesTasksReadyCall(_callback);

    }

    public AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo geminiLlmResponsesTasksReady() throws ApiException {
       ApiResponse<AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo> localVarResp = geminiLlmResponsesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo> geminiLlmResponsesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = geminiLlmResponsesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call geminiLlmResponsesTasksReadyAsync(final ApiCallback<AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = geminiLlmResponsesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call geminiLlmResponsesTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/ai_optimization/gemini/llm_responses/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call geminiLlmResponsesTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling geminiLlmResponsesTaskGet(Async)");
       }

       return geminiLlmResponsesTaskGetCall(id, _callback);

    }

    public AiOptimizationGeminiLlmResponsesTaskGetResponseInfo geminiLlmResponsesTaskGet(String id) throws ApiException {
       ApiResponse<AiOptimizationGeminiLlmResponsesTaskGetResponseInfo> localVarResp = geminiLlmResponsesTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationGeminiLlmResponsesTaskGetResponseInfo> geminiLlmResponsesTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = geminiLlmResponsesTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call geminiLlmResponsesTaskGetAsync(String id, final ApiCallback<AiOptimizationGeminiLlmResponsesTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = geminiLlmResponsesTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<AiOptimizationGeminiLlmResponsesTaskGetResponseInfo>(){}.getType();
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

    public okhttp3.Call aiKeywordDataLocationsAndLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
    private okhttp3.Call aiKeywordDataLocationsAndLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return aiKeywordDataLocationsAndLanguagesCall(_callback);

    }

    public AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo aiKeywordDataLocationsAndLanguages() throws ApiException {
       ApiResponse<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo> localVarResp = aiKeywordDataLocationsAndLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo> aiKeywordDataLocationsAndLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = aiKeywordDataLocationsAndLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call aiKeywordDataLocationsAndLanguagesAsync(final ApiCallback<AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = aiKeywordDataLocationsAndLanguagesValidateBeforeCall(_callback);
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