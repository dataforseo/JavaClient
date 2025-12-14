package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.ContentGenerationGenerateLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateTextLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateTextLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateMetaTagsLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateMetaTagsLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateSubTopicsLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationGenerateSubTopicsLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationParaphraseLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationParaphraseLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationCheckGrammarLanguagesResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationGrammarRulesResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationTextSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.ContentGenerationTextSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.ContentGenerationTextSummaryLanguagesResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class ContentGenerationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContentGenerationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContentGenerationApi(ApiClient apiClient) {
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


    public okhttp3.Call generateLiveCall(List<ContentGenerationGenerateLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/generate/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call generateLiveValidateBeforeCall(List<ContentGenerationGenerateLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return generateLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationGenerateLiveResponseInfo generateLive(List<ContentGenerationGenerateLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationGenerateLiveResponseInfo> localVarResp = generateLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationGenerateLiveResponseInfo> generateLiveWithHttpInfo(List<ContentGenerationGenerateLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = generateLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call generateLiveAsync(List<ContentGenerationGenerateLiveRequestInfo> payload, final ApiCallback<ContentGenerationGenerateLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = generateLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call generateTextLiveCall(List<ContentGenerationGenerateTextLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/generate_text/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call generateTextLiveValidateBeforeCall(List<ContentGenerationGenerateTextLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return generateTextLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationGenerateTextLiveResponseInfo generateTextLive(List<ContentGenerationGenerateTextLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationGenerateTextLiveResponseInfo> localVarResp = generateTextLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationGenerateTextLiveResponseInfo> generateTextLiveWithHttpInfo(List<ContentGenerationGenerateTextLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = generateTextLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateTextLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call generateTextLiveAsync(List<ContentGenerationGenerateTextLiveRequestInfo> payload, final ApiCallback<ContentGenerationGenerateTextLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = generateTextLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateTextLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call generateMetaTagsLiveCall(List<ContentGenerationGenerateMetaTagsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/generate_meta_tags/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call generateMetaTagsLiveValidateBeforeCall(List<ContentGenerationGenerateMetaTagsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return generateMetaTagsLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationGenerateMetaTagsLiveResponseInfo generateMetaTagsLive(List<ContentGenerationGenerateMetaTagsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationGenerateMetaTagsLiveResponseInfo> localVarResp = generateMetaTagsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationGenerateMetaTagsLiveResponseInfo> generateMetaTagsLiveWithHttpInfo(List<ContentGenerationGenerateMetaTagsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = generateMetaTagsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateMetaTagsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call generateMetaTagsLiveAsync(List<ContentGenerationGenerateMetaTagsLiveRequestInfo> payload, final ApiCallback<ContentGenerationGenerateMetaTagsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = generateMetaTagsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateMetaTagsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call generateSubTopicsLiveCall(List<ContentGenerationGenerateSubTopicsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/generate_sub_topics/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call generateSubTopicsLiveValidateBeforeCall(List<ContentGenerationGenerateSubTopicsLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return generateSubTopicsLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationGenerateSubTopicsLiveResponseInfo generateSubTopicsLive(List<ContentGenerationGenerateSubTopicsLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationGenerateSubTopicsLiveResponseInfo> localVarResp = generateSubTopicsLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationGenerateSubTopicsLiveResponseInfo> generateSubTopicsLiveWithHttpInfo(List<ContentGenerationGenerateSubTopicsLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = generateSubTopicsLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateSubTopicsLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call generateSubTopicsLiveAsync(List<ContentGenerationGenerateSubTopicsLiveRequestInfo> payload, final ApiCallback<ContentGenerationGenerateSubTopicsLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = generateSubTopicsLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationGenerateSubTopicsLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call paraphraseLiveCall(List<ContentGenerationParaphraseLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/paraphrase/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call paraphraseLiveValidateBeforeCall(List<ContentGenerationParaphraseLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return paraphraseLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationParaphraseLiveResponseInfo paraphraseLive(List<ContentGenerationParaphraseLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationParaphraseLiveResponseInfo> localVarResp = paraphraseLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationParaphraseLiveResponseInfo> paraphraseLiveWithHttpInfo(List<ContentGenerationParaphraseLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = paraphraseLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationParaphraseLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call paraphraseLiveAsync(List<ContentGenerationParaphraseLiveRequestInfo> payload, final ApiCallback<ContentGenerationParaphraseLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = paraphraseLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationParaphraseLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call checkGrammarLiveCall(List<ContentGenerationCheckGrammarLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/check_grammar/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call checkGrammarLiveValidateBeforeCall(List<ContentGenerationCheckGrammarLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return checkGrammarLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationCheckGrammarLiveResponseInfo checkGrammarLive(List<ContentGenerationCheckGrammarLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationCheckGrammarLiveResponseInfo> localVarResp = checkGrammarLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationCheckGrammarLiveResponseInfo> checkGrammarLiveWithHttpInfo(List<ContentGenerationCheckGrammarLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = checkGrammarLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationCheckGrammarLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call checkGrammarLiveAsync(List<ContentGenerationCheckGrammarLiveRequestInfo> payload, final ApiCallback<ContentGenerationCheckGrammarLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = checkGrammarLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationCheckGrammarLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call checkGrammarLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/content_generation/check_grammar/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call checkGrammarLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return checkGrammarLanguagesCall(_callback);

    }

    public ContentGenerationCheckGrammarLanguagesResponseInfo checkGrammarLanguages() throws ApiException {
       ApiResponse<ContentGenerationCheckGrammarLanguagesResponseInfo> localVarResp = checkGrammarLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentGenerationCheckGrammarLanguagesResponseInfo> checkGrammarLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = checkGrammarLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentGenerationCheckGrammarLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call checkGrammarLanguagesAsync(final ApiCallback<ContentGenerationCheckGrammarLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = checkGrammarLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentGenerationCheckGrammarLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call grammarRulesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/content_generation/grammar_rules";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call grammarRulesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return grammarRulesCall(_callback);

    }

    public ContentGenerationGrammarRulesResponseInfo grammarRules() throws ApiException {
       ApiResponse<ContentGenerationGrammarRulesResponseInfo> localVarResp = grammarRulesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentGenerationGrammarRulesResponseInfo> grammarRulesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = grammarRulesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentGenerationGrammarRulesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call grammarRulesAsync(final ApiCallback<ContentGenerationGrammarRulesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = grammarRulesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentGenerationGrammarRulesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call textSummaryLiveCall(List<ContentGenerationTextSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/content_generation/text_summary/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call textSummaryLiveValidateBeforeCall(List<ContentGenerationTextSummaryLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return textSummaryLiveCall(payload, _callback);
 
        }
 
        public ContentGenerationTextSummaryLiveResponseInfo textSummaryLive(List<ContentGenerationTextSummaryLiveRequestInfo> payload) throws ApiException {
            ApiResponse<ContentGenerationTextSummaryLiveResponseInfo> localVarResp = textSummaryLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<ContentGenerationTextSummaryLiveResponseInfo> textSummaryLiveWithHttpInfo(List<ContentGenerationTextSummaryLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = textSummaryLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<ContentGenerationTextSummaryLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call textSummaryLiveAsync(List<ContentGenerationTextSummaryLiveRequestInfo> payload, final ApiCallback<ContentGenerationTextSummaryLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = textSummaryLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<ContentGenerationTextSummaryLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call textSummaryLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/content_generation/text_summary/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call textSummaryLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return textSummaryLanguagesCall(_callback);

    }

    public ContentGenerationTextSummaryLanguagesResponseInfo textSummaryLanguages() throws ApiException {
       ApiResponse<ContentGenerationTextSummaryLanguagesResponseInfo> localVarResp = textSummaryLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<ContentGenerationTextSummaryLanguagesResponseInfo> textSummaryLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = textSummaryLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<ContentGenerationTextSummaryLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call textSummaryLanguagesAsync(final ApiCallback<ContentGenerationTextSummaryLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = textSummaryLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<ContentGenerationTextSummaryLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }


}