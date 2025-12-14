package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.BusinessDataIdListRequestInfo;
import io.github.dataforseo.client.model.BusinessDataIdListResponseInfo;
import io.github.dataforseo.client.model.BusinessDataErrorsRequestInfo;
import io.github.dataforseo.client.model.BusinessDataErrorsResponseInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsLocationsResponseInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesResponseInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleLocationsResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleLanguagesResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorLanguagesResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskGetResponseInfo;
import io.github.dataforseo.client.model.BusinessDataSocialMediaPinterestLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataSocialMediaPinterestLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataSocialMediaFacebookLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataSocialMediaFacebookLiveResponseInfo;
import io.github.dataforseo.client.model.BusinessDataSocialMediaRedditLiveRequestInfo;
import io.github.dataforseo.client.model.BusinessDataSocialMediaRedditLiveResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class BusinessDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BusinessDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BusinessDataApi(ApiClient apiClient) {
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


    public okhttp3.Call businessDataIdListCall(List<BusinessDataIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/id_list";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call businessDataIdListValidateBeforeCall(List<BusinessDataIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return businessDataIdListCall(payload, _callback);
 
        }
 
        public BusinessDataIdListResponseInfo businessDataIdList(List<BusinessDataIdListRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataIdListResponseInfo> localVarResp = businessDataIdListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataIdListResponseInfo> businessDataIdListWithHttpInfo(List<BusinessDataIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = businessDataIdListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call businessDataIdListAsync(List<BusinessDataIdListRequestInfo> payload, final ApiCallback<BusinessDataIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = businessDataIdListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call businessDataErrorsCall(List<BusinessDataErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/errors";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call businessDataErrorsValidateBeforeCall(List<BusinessDataErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return businessDataErrorsCall(payload, _callback);
 
        }
 
        public BusinessDataErrorsResponseInfo businessDataErrors(List<BusinessDataErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataErrorsResponseInfo> localVarResp = businessDataErrorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataErrorsResponseInfo> businessDataErrorsWithHttpInfo(List<BusinessDataErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = businessDataErrorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call businessDataErrorsAsync(List<BusinessDataErrorsRequestInfo> payload, final ApiCallback<BusinessDataErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = businessDataErrorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call businessListingsLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/business_listings/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessListingsLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return businessListingsLocationsCall(_callback);

    }

    public BusinessDataBusinessListingsLocationsResponseInfo businessListingsLocations() throws ApiException {
       ApiResponse<BusinessDataBusinessListingsLocationsResponseInfo> localVarResp = businessListingsLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataBusinessListingsLocationsResponseInfo> businessListingsLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = businessListingsLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessListingsLocationsAsync(final ApiCallback<BusinessDataBusinessListingsLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessListingsLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call businessListingsCategoriesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/business_listings/categories";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessListingsCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return businessListingsCategoriesCall(_callback);

    }

    public BusinessDataBusinessListingsCategoriesResponseInfo businessListingsCategories() throws ApiException {
       ApiResponse<BusinessDataBusinessListingsCategoriesResponseInfo> localVarResp = businessListingsCategoriesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataBusinessListingsCategoriesResponseInfo> businessListingsCategoriesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = businessListingsCategoriesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsCategoriesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessListingsCategoriesAsync(final ApiCallback<BusinessDataBusinessListingsCategoriesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessListingsCategoriesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsCategoriesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call businessListingsAvailableFiltersCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/business_listings/available_filters";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessListingsAvailableFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return businessListingsAvailableFiltersCall(_callback);

    }

    public BusinessDataBusinessListingsAvailableFiltersResponseInfo businessListingsAvailableFilters() throws ApiException {
       ApiResponse<BusinessDataBusinessListingsAvailableFiltersResponseInfo> localVarResp = businessListingsAvailableFiltersWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataBusinessListingsAvailableFiltersResponseInfo> businessListingsAvailableFiltersWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = businessListingsAvailableFiltersValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsAvailableFiltersResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessListingsAvailableFiltersAsync(final ApiCallback<BusinessDataBusinessListingsAvailableFiltersResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessListingsAvailableFiltersValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsAvailableFiltersResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call businessListingsSearchLiveCall(List<BusinessDataBusinessListingsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/business_listings/search/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call businessListingsSearchLiveValidateBeforeCall(List<BusinessDataBusinessListingsSearchLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return businessListingsSearchLiveCall(payload, _callback);
 
        }
 
        public BusinessDataBusinessListingsSearchLiveResponseInfo businessListingsSearchLive(List<BusinessDataBusinessListingsSearchLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataBusinessListingsSearchLiveResponseInfo> localVarResp = businessListingsSearchLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataBusinessListingsSearchLiveResponseInfo> businessListingsSearchLiveWithHttpInfo(List<BusinessDataBusinessListingsSearchLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = businessListingsSearchLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsSearchLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call businessListingsSearchLiveAsync(List<BusinessDataBusinessListingsSearchLiveRequestInfo> payload, final ApiCallback<BusinessDataBusinessListingsSearchLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = businessListingsSearchLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsSearchLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call businessListingsCategoriesAggregationLiveCall(List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/business_listings/categories_aggregation/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call businessListingsCategoriesAggregationLiveValidateBeforeCall(List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return businessListingsCategoriesAggregationLiveCall(payload, _callback);
 
        }
 
        public BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo businessListingsCategoriesAggregationLive(List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo> localVarResp = businessListingsCategoriesAggregationLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo> businessListingsCategoriesAggregationLiveWithHttpInfo(List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = businessListingsCategoriesAggregationLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call businessListingsCategoriesAggregationLiveAsync(List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> payload, final ApiCallback<BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = businessListingsCategoriesAggregationLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call businessDataGoogleLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessDataGoogleLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return businessDataGoogleLocationsCall(_callback);

    }

    public BusinessDataGoogleLocationsResponseInfo businessDataGoogleLocations() throws ApiException {
       ApiResponse<BusinessDataGoogleLocationsResponseInfo> localVarResp = businessDataGoogleLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleLocationsResponseInfo> businessDataGoogleLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = businessDataGoogleLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessDataGoogleLocationsAsync(final ApiCallback<BusinessDataGoogleLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessDataGoogleLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call businessDataGoogleLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessDataGoogleLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling businessDataGoogleLocationsCountry(Async)");
       }

       return businessDataGoogleLocationsCountryCall(country, _callback);

    }

    public BusinessDataGoogleLocationsCountryResponseInfo businessDataGoogleLocationsCountry(String country) throws ApiException {
       ApiResponse<BusinessDataGoogleLocationsCountryResponseInfo> localVarResp = businessDataGoogleLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleLocationsCountryResponseInfo> businessDataGoogleLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = businessDataGoogleLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessDataGoogleLocationsCountryAsync(String country, final ApiCallback<BusinessDataGoogleLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessDataGoogleLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call businessDataGoogleLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessDataGoogleLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return businessDataGoogleLanguagesCall(_callback);

    }

    public BusinessDataGoogleLanguagesResponseInfo businessDataGoogleLanguages() throws ApiException {
       ApiResponse<BusinessDataGoogleLanguagesResponseInfo> localVarResp = businessDataGoogleLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleLanguagesResponseInfo> businessDataGoogleLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = businessDataGoogleLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessDataGoogleLanguagesAsync(final ApiCallback<BusinessDataGoogleLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessDataGoogleLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMyBusinessInfoTaskPostCall(List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/my_business_info/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleMyBusinessInfoTaskPostValidateBeforeCall(List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleMyBusinessInfoTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo googleMyBusinessInfoTaskPost(List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo> localVarResp = googleMyBusinessInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo> googleMyBusinessInfoTaskPostWithHttpInfo(List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleMyBusinessInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleMyBusinessInfoTaskPostAsync(List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleMyBusinessInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleMyBusinessInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/my_business_info/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMyBusinessInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleMyBusinessInfoTasksReadyCall(_callback);

    }

    public BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo googleMyBusinessInfoTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo> localVarResp = googleMyBusinessInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo> googleMyBusinessInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleMyBusinessInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMyBusinessInfoTasksReadyAsync(final ApiCallback<BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMyBusinessInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call businessDataTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call businessDataTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return businessDataTasksReadyCall(_callback);

    }

    public BusinessDataTasksReadyResponseInfo businessDataTasksReady() throws ApiException {
       ApiResponse<BusinessDataTasksReadyResponseInfo> localVarResp = businessDataTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTasksReadyResponseInfo> businessDataTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = businessDataTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call businessDataTasksReadyAsync(final ApiCallback<BusinessDataTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = businessDataTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMyBusinessInfoTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/my_business_info/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMyBusinessInfoTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleMyBusinessInfoTaskGet(Async)");
       }

       return googleMyBusinessInfoTaskGetCall(id, _callback);

    }

    public BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo googleMyBusinessInfoTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo> localVarResp = googleMyBusinessInfoTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo> googleMyBusinessInfoTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleMyBusinessInfoTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMyBusinessInfoTaskGetAsync(String id, final ApiCallback<BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMyBusinessInfoTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMyBusinessInfoLiveCall(List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/my_business_info/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleMyBusinessInfoLiveValidateBeforeCall(List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleMyBusinessInfoLiveCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleMyBusinessInfoLiveResponseInfo googleMyBusinessInfoLive(List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleMyBusinessInfoLiveResponseInfo> localVarResp = googleMyBusinessInfoLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleMyBusinessInfoLiveResponseInfo> googleMyBusinessInfoLiveWithHttpInfo(List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleMyBusinessInfoLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleMyBusinessInfoLiveAsync(List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo> payload, final ApiCallback<BusinessDataGoogleMyBusinessInfoLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleMyBusinessInfoLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessInfoLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleMyBusinessUpdatesTaskPostCall(List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/my_business_updates/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleMyBusinessUpdatesTaskPostValidateBeforeCall(List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleMyBusinessUpdatesTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo googleMyBusinessUpdatesTaskPost(List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo> localVarResp = googleMyBusinessUpdatesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo> googleMyBusinessUpdatesTaskPostWithHttpInfo(List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleMyBusinessUpdatesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleMyBusinessUpdatesTaskPostAsync(List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleMyBusinessUpdatesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleMyBusinessUpdatesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/my_business_updates/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMyBusinessUpdatesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleMyBusinessUpdatesTasksReadyCall(_callback);

    }

    public BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo googleMyBusinessUpdatesTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo> localVarResp = googleMyBusinessUpdatesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo> googleMyBusinessUpdatesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleMyBusinessUpdatesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMyBusinessUpdatesTasksReadyAsync(final ApiCallback<BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMyBusinessUpdatesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMyBusinessUpdatesTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/my_business_updates/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMyBusinessUpdatesTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleMyBusinessUpdatesTaskGet(Async)");
       }

       return googleMyBusinessUpdatesTaskGetCall(id, _callback);

    }

    public BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo googleMyBusinessUpdatesTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo> localVarResp = googleMyBusinessUpdatesTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo> googleMyBusinessUpdatesTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleMyBusinessUpdatesTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMyBusinessUpdatesTaskGetAsync(String id, final ApiCallback<BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMyBusinessUpdatesTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleHotelSearchesTaskPostCall(List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/hotel_searches/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleHotelSearchesTaskPostValidateBeforeCall(List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHotelSearchesTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleHotelSearchesTaskPostResponseInfo googleHotelSearchesTaskPost(List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleHotelSearchesTaskPostResponseInfo> localVarResp = googleHotelSearchesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleHotelSearchesTaskPostResponseInfo> googleHotelSearchesTaskPostWithHttpInfo(List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHotelSearchesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHotelSearchesTaskPostAsync(List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleHotelSearchesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHotelSearchesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHotelSearchesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/hotel_searches/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleHotelSearchesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleHotelSearchesTasksReadyCall(_callback);

    }

    public BusinessDataGoogleHotelSearchesTasksReadyResponseInfo googleHotelSearchesTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleHotelSearchesTasksReadyResponseInfo> localVarResp = googleHotelSearchesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleHotelSearchesTasksReadyResponseInfo> googleHotelSearchesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleHotelSearchesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleHotelSearchesTasksReadyAsync(final ApiCallback<BusinessDataGoogleHotelSearchesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleHotelSearchesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleHotelSearchesTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/hotel_searches/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleHotelSearchesTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleHotelSearchesTaskGet(Async)");
       }

       return googleHotelSearchesTaskGetCall(id, _callback);

    }

    public BusinessDataGoogleHotelSearchesTaskGetResponseInfo googleHotelSearchesTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleHotelSearchesTaskGetResponseInfo> localVarResp = googleHotelSearchesTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleHotelSearchesTaskGetResponseInfo> googleHotelSearchesTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleHotelSearchesTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleHotelSearchesTaskGetAsync(String id, final ApiCallback<BusinessDataGoogleHotelSearchesTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleHotelSearchesTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleHotelSearchesLiveCall(List<BusinessDataGoogleHotelSearchesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/hotel_searches/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleHotelSearchesLiveValidateBeforeCall(List<BusinessDataGoogleHotelSearchesLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHotelSearchesLiveCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleHotelSearchesLiveResponseInfo googleHotelSearchesLive(List<BusinessDataGoogleHotelSearchesLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleHotelSearchesLiveResponseInfo> localVarResp = googleHotelSearchesLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleHotelSearchesLiveResponseInfo> googleHotelSearchesLiveWithHttpInfo(List<BusinessDataGoogleHotelSearchesLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHotelSearchesLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHotelSearchesLiveAsync(List<BusinessDataGoogleHotelSearchesLiveRequestInfo> payload, final ApiCallback<BusinessDataGoogleHotelSearchesLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHotelSearchesLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelSearchesLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHotelInfoTaskPostCall(List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/hotel_info/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleHotelInfoTaskPostValidateBeforeCall(List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHotelInfoTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleHotelInfoTaskPostResponseInfo googleHotelInfoTaskPost(List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleHotelInfoTaskPostResponseInfo> localVarResp = googleHotelInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleHotelInfoTaskPostResponseInfo> googleHotelInfoTaskPostWithHttpInfo(List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHotelInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHotelInfoTaskPostAsync(List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleHotelInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHotelInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHotelInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/hotel_info/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleHotelInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleHotelInfoTasksReadyCall(_callback);

    }

    public BusinessDataGoogleHotelInfoTasksReadyResponseInfo googleHotelInfoTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleHotelInfoTasksReadyResponseInfo> localVarResp = googleHotelInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleHotelInfoTasksReadyResponseInfo> googleHotelInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleHotelInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleHotelInfoTasksReadyAsync(final ApiCallback<BusinessDataGoogleHotelInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleHotelInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleHotelInfoTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/hotel_info/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleHotelInfoTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleHotelInfoTaskGetAdvanced(Async)");
       }

       return googleHotelInfoTaskGetAdvancedCall(id, _callback);

    }

    public BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo googleHotelInfoTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo> localVarResp = googleHotelInfoTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo> googleHotelInfoTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleHotelInfoTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleHotelInfoTaskGetAdvancedAsync(String id, final ApiCallback<BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleHotelInfoTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleHotelInfoTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/hotel_info/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleHotelInfoTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleHotelInfoTaskGetHtml(Async)");
       }

       return googleHotelInfoTaskGetHtmlCall(id, _callback);

    }

    public BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo googleHotelInfoTaskGetHtml(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo> localVarResp = googleHotelInfoTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo> googleHotelInfoTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleHotelInfoTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleHotelInfoTaskGetHtmlAsync(String id, final ApiCallback<BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleHotelInfoTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleHotelInfoLiveAdvancedCall(List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/hotel_info/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleHotelInfoLiveAdvancedValidateBeforeCall(List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHotelInfoLiveAdvancedCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo googleHotelInfoLiveAdvanced(List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo> localVarResp = googleHotelInfoLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo> googleHotelInfoLiveAdvancedWithHttpInfo(List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHotelInfoLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHotelInfoLiveAdvancedAsync(List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> payload, final ApiCallback<BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHotelInfoLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleHotelInfoLiveHtmlCall(List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/hotel_info/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleHotelInfoLiveHtmlValidateBeforeCall(List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleHotelInfoLiveHtmlCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleHotelInfoLiveHtmlResponseInfo googleHotelInfoLiveHtml(List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleHotelInfoLiveHtmlResponseInfo> localVarResp = googleHotelInfoLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleHotelInfoLiveHtmlResponseInfo> googleHotelInfoLiveHtmlWithHttpInfo(List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleHotelInfoLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleHotelInfoLiveHtmlAsync(List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> payload, final ApiCallback<BusinessDataGoogleHotelInfoLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleHotelInfoLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleHotelInfoLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleReviewsTaskPostCall(List<BusinessDataGoogleReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/reviews/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleReviewsTaskPostValidateBeforeCall(List<BusinessDataGoogleReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleReviewsTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleReviewsTaskPostResponseInfo googleReviewsTaskPost(List<BusinessDataGoogleReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleReviewsTaskPostResponseInfo> localVarResp = googleReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleReviewsTaskPostResponseInfo> googleReviewsTaskPostWithHttpInfo(List<BusinessDataGoogleReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleReviewsTaskPostAsync(List<BusinessDataGoogleReviewsTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/reviews/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleReviewsTasksReadyCall(_callback);

    }

    public BusinessDataGoogleReviewsTasksReadyResponseInfo googleReviewsTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleReviewsTasksReadyResponseInfo> localVarResp = googleReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleReviewsTasksReadyResponseInfo> googleReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleReviewsTasksReadyAsync(final ApiCallback<BusinessDataGoogleReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleReviewsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/reviews/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleReviewsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleReviewsTaskGet(Async)");
       }

       return googleReviewsTaskGetCall(id, _callback);

    }

    public BusinessDataGoogleReviewsTaskGetResponseInfo googleReviewsTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleReviewsTaskGetResponseInfo> localVarResp = googleReviewsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleReviewsTaskGetResponseInfo> googleReviewsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleReviewsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleReviewsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleReviewsTaskGetAsync(String id, final ApiCallback<BusinessDataGoogleReviewsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleReviewsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleReviewsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleExtendedReviewsTaskPostCall(List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/extended_reviews/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleExtendedReviewsTaskPostValidateBeforeCall(List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleExtendedReviewsTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleExtendedReviewsTaskPostResponseInfo googleExtendedReviewsTaskPost(List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleExtendedReviewsTaskPostResponseInfo> localVarResp = googleExtendedReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleExtendedReviewsTaskPostResponseInfo> googleExtendedReviewsTaskPostWithHttpInfo(List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleExtendedReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleExtendedReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleExtendedReviewsTaskPostAsync(List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleExtendedReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleExtendedReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleExtendedReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleExtendedReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/extended_reviews/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleExtendedReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleExtendedReviewsTasksReadyCall(_callback);

    }

    public BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo googleExtendedReviewsTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo> localVarResp = googleExtendedReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo> googleExtendedReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleExtendedReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleExtendedReviewsTasksReadyAsync(final ApiCallback<BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleExtendedReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleExtendedReviewsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/extended_reviews/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleExtendedReviewsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleExtendedReviewsTaskGet(Async)");
       }

       return googleExtendedReviewsTaskGetCall(id, _callback);

    }

    public BusinessDataGoogleExtendedReviewsTaskGetResponseInfo googleExtendedReviewsTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleExtendedReviewsTaskGetResponseInfo> localVarResp = googleExtendedReviewsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleExtendedReviewsTaskGetResponseInfo> googleExtendedReviewsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleExtendedReviewsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleExtendedReviewsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleExtendedReviewsTaskGetAsync(String id, final ApiCallback<BusinessDataGoogleExtendedReviewsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleExtendedReviewsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleExtendedReviewsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleQuestionsAndAnswersTaskPostCall(List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/questions_and_answers/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleQuestionsAndAnswersTaskPostValidateBeforeCall(List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleQuestionsAndAnswersTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo googleQuestionsAndAnswersTaskPost(List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo> localVarResp = googleQuestionsAndAnswersTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo> googleQuestionsAndAnswersTaskPostWithHttpInfo(List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleQuestionsAndAnswersTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleQuestionsAndAnswersTaskPostAsync(List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> payload, final ApiCallback<BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleQuestionsAndAnswersTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleQuestionsAndAnswersTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/google/questions_and_answers/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleQuestionsAndAnswersTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleQuestionsAndAnswersTasksReadyCall(_callback);

    }

    public BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo googleQuestionsAndAnswersTasksReady() throws ApiException {
       ApiResponse<BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo> localVarResp = googleQuestionsAndAnswersTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo> googleQuestionsAndAnswersTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleQuestionsAndAnswersTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleQuestionsAndAnswersTasksReadyAsync(final ApiCallback<BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleQuestionsAndAnswersTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleQuestionsAndAnswersTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/google/questions_and_answers/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleQuestionsAndAnswersTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleQuestionsAndAnswersTaskGet(Async)");
       }

       return googleQuestionsAndAnswersTaskGetCall(id, _callback);

    }

    public BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo googleQuestionsAndAnswersTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo> localVarResp = googleQuestionsAndAnswersTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo> googleQuestionsAndAnswersTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleQuestionsAndAnswersTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleQuestionsAndAnswersTaskGetAsync(String id, final ApiCallback<BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleQuestionsAndAnswersTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleQuestionsAndAnswersLiveCall(List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/google/questions_and_answers/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleQuestionsAndAnswersLiveValidateBeforeCall(List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleQuestionsAndAnswersLiveCall(payload, _callback);
 
        }
 
        public BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo googleQuestionsAndAnswersLive(List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo> localVarResp = googleQuestionsAndAnswersLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo> googleQuestionsAndAnswersLiveWithHttpInfo(List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleQuestionsAndAnswersLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleQuestionsAndAnswersLiveAsync(List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> payload, final ApiCallback<BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleQuestionsAndAnswersLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call trustpilotSearchTaskPostCall(List<BusinessDataTrustpilotSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/trustpilot/search/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call trustpilotSearchTaskPostValidateBeforeCall(List<BusinessDataTrustpilotSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return trustpilotSearchTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataTrustpilotSearchTaskPostResponseInfo trustpilotSearchTaskPost(List<BusinessDataTrustpilotSearchTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataTrustpilotSearchTaskPostResponseInfo> localVarResp = trustpilotSearchTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataTrustpilotSearchTaskPostResponseInfo> trustpilotSearchTaskPostWithHttpInfo(List<BusinessDataTrustpilotSearchTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = trustpilotSearchTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataTrustpilotSearchTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call trustpilotSearchTaskPostAsync(List<BusinessDataTrustpilotSearchTaskPostRequestInfo> payload, final ApiCallback<BusinessDataTrustpilotSearchTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = trustpilotSearchTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataTrustpilotSearchTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call trustpilotSearchTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/trustpilot/search/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call trustpilotSearchTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return trustpilotSearchTasksReadyCall(_callback);

    }

    public BusinessDataTrustpilotSearchTasksReadyResponseInfo trustpilotSearchTasksReady() throws ApiException {
       ApiResponse<BusinessDataTrustpilotSearchTasksReadyResponseInfo> localVarResp = trustpilotSearchTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTrustpilotSearchTasksReadyResponseInfo> trustpilotSearchTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = trustpilotSearchTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotSearchTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call trustpilotSearchTasksReadyAsync(final ApiCallback<BusinessDataTrustpilotSearchTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = trustpilotSearchTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotSearchTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call trustpilotSearchTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/trustpilot/search/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call trustpilotSearchTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling trustpilotSearchTaskGet(Async)");
       }

       return trustpilotSearchTaskGetCall(id, _callback);

    }

    public BusinessDataTrustpilotSearchTaskGetResponseInfo trustpilotSearchTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataTrustpilotSearchTaskGetResponseInfo> localVarResp = trustpilotSearchTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTrustpilotSearchTaskGetResponseInfo> trustpilotSearchTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = trustpilotSearchTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotSearchTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call trustpilotSearchTaskGetAsync(String id, final ApiCallback<BusinessDataTrustpilotSearchTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = trustpilotSearchTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotSearchTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call trustpilotReviewsTaskPostCall(List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/trustpilot/reviews/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call trustpilotReviewsTaskPostValidateBeforeCall(List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return trustpilotReviewsTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataTrustpilotReviewsTaskPostResponseInfo trustpilotReviewsTaskPost(List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataTrustpilotReviewsTaskPostResponseInfo> localVarResp = trustpilotReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataTrustpilotReviewsTaskPostResponseInfo> trustpilotReviewsTaskPostWithHttpInfo(List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = trustpilotReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataTrustpilotReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call trustpilotReviewsTaskPostAsync(List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> payload, final ApiCallback<BusinessDataTrustpilotReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = trustpilotReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataTrustpilotReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call trustpilotReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/trustpilot/reviews/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call trustpilotReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return trustpilotReviewsTasksReadyCall(_callback);

    }

    public BusinessDataTrustpilotReviewsTasksReadyResponseInfo trustpilotReviewsTasksReady() throws ApiException {
       ApiResponse<BusinessDataTrustpilotReviewsTasksReadyResponseInfo> localVarResp = trustpilotReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTrustpilotReviewsTasksReadyResponseInfo> trustpilotReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = trustpilotReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call trustpilotReviewsTasksReadyAsync(final ApiCallback<BusinessDataTrustpilotReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = trustpilotReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call trustpilotReviewsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/trustpilot/reviews/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call trustpilotReviewsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling trustpilotReviewsTaskGet(Async)");
       }

       return trustpilotReviewsTaskGetCall(id, _callback);

    }

    public BusinessDataTrustpilotReviewsTaskGetResponseInfo trustpilotReviewsTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataTrustpilotReviewsTaskGetResponseInfo> localVarResp = trustpilotReviewsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTrustpilotReviewsTaskGetResponseInfo> trustpilotReviewsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = trustpilotReviewsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotReviewsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call trustpilotReviewsTaskGetAsync(String id, final ApiCallback<BusinessDataTrustpilotReviewsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = trustpilotReviewsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataTrustpilotReviewsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/tripadvisor/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return tripadvisorLocationsCall(_callback);

    }

    public BusinessDataTripadvisorLocationsResponseInfo tripadvisorLocations() throws ApiException {
       ApiResponse<BusinessDataTripadvisorLocationsResponseInfo> localVarResp = tripadvisorLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorLocationsResponseInfo> tripadvisorLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = tripadvisorLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorLocationsAsync(final ApiCallback<BusinessDataTripadvisorLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/tripadvisor/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling tripadvisorLocationsCountry(Async)");
       }

       return tripadvisorLocationsCountryCall(country, _callback);

    }

    public BusinessDataTripadvisorLocationsCountryResponseInfo tripadvisorLocationsCountry(String country) throws ApiException {
       ApiResponse<BusinessDataTripadvisorLocationsCountryResponseInfo> localVarResp = tripadvisorLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorLocationsCountryResponseInfo> tripadvisorLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = tripadvisorLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorLocationsCountryAsync(String country, final ApiCallback<BusinessDataTripadvisorLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/tripadvisor/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return tripadvisorLanguagesCall(_callback);

    }

    public BusinessDataTripadvisorLanguagesResponseInfo tripadvisorLanguages() throws ApiException {
       ApiResponse<BusinessDataTripadvisorLanguagesResponseInfo> localVarResp = tripadvisorLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorLanguagesResponseInfo> tripadvisorLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = tripadvisorLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorLanguagesAsync(final ApiCallback<BusinessDataTripadvisorLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorSearchTaskPostCall(List<BusinessDataTripadvisorSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/tripadvisor/search/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call tripadvisorSearchTaskPostValidateBeforeCall(List<BusinessDataTripadvisorSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return tripadvisorSearchTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataTripadvisorSearchTaskPostResponseInfo tripadvisorSearchTaskPost(List<BusinessDataTripadvisorSearchTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataTripadvisorSearchTaskPostResponseInfo> localVarResp = tripadvisorSearchTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataTripadvisorSearchTaskPostResponseInfo> tripadvisorSearchTaskPostWithHttpInfo(List<BusinessDataTripadvisorSearchTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = tripadvisorSearchTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataTripadvisorSearchTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call tripadvisorSearchTaskPostAsync(List<BusinessDataTripadvisorSearchTaskPostRequestInfo> payload, final ApiCallback<BusinessDataTripadvisorSearchTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = tripadvisorSearchTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataTripadvisorSearchTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call tripadvisorSearchTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/tripadvisor/search/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorSearchTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return tripadvisorSearchTasksReadyCall(_callback);

    }

    public BusinessDataTripadvisorSearchTasksReadyResponseInfo tripadvisorSearchTasksReady() throws ApiException {
       ApiResponse<BusinessDataTripadvisorSearchTasksReadyResponseInfo> localVarResp = tripadvisorSearchTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorSearchTasksReadyResponseInfo> tripadvisorSearchTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = tripadvisorSearchTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorSearchTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorSearchTasksReadyAsync(final ApiCallback<BusinessDataTripadvisorSearchTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorSearchTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorSearchTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorSearchTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/tripadvisor/search/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorSearchTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling tripadvisorSearchTaskGet(Async)");
       }

       return tripadvisorSearchTaskGetCall(id, _callback);

    }

    public BusinessDataTripadvisorSearchTaskGetResponseInfo tripadvisorSearchTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataTripadvisorSearchTaskGetResponseInfo> localVarResp = tripadvisorSearchTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorSearchTaskGetResponseInfo> tripadvisorSearchTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = tripadvisorSearchTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorSearchTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorSearchTaskGetAsync(String id, final ApiCallback<BusinessDataTripadvisorSearchTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorSearchTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorSearchTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorReviewsTaskPostCall(List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/tripadvisor/reviews/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call tripadvisorReviewsTaskPostValidateBeforeCall(List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return tripadvisorReviewsTaskPostCall(payload, _callback);
 
        }
 
        public BusinessDataTripadvisorReviewsTaskPostResponseInfo tripadvisorReviewsTaskPost(List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataTripadvisorReviewsTaskPostResponseInfo> localVarResp = tripadvisorReviewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataTripadvisorReviewsTaskPostResponseInfo> tripadvisorReviewsTaskPostWithHttpInfo(List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = tripadvisorReviewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataTripadvisorReviewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call tripadvisorReviewsTaskPostAsync(List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> payload, final ApiCallback<BusinessDataTripadvisorReviewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = tripadvisorReviewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataTripadvisorReviewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call tripadvisorReviewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/business_data/tripadvisor/reviews/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorReviewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return tripadvisorReviewsTasksReadyCall(_callback);

    }

    public BusinessDataTripadvisorReviewsTasksReadyResponseInfo tripadvisorReviewsTasksReady() throws ApiException {
       ApiResponse<BusinessDataTripadvisorReviewsTasksReadyResponseInfo> localVarResp = tripadvisorReviewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorReviewsTasksReadyResponseInfo> tripadvisorReviewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = tripadvisorReviewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorReviewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorReviewsTasksReadyAsync(final ApiCallback<BusinessDataTripadvisorReviewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorReviewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorReviewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tripadvisorReviewsTaskGetCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/business_data/tripadvisor/reviews/task_get/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tripadvisorReviewsTaskGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling tripadvisorReviewsTaskGet(Async)");
       }

       return tripadvisorReviewsTaskGetCall(id, _callback);

    }

    public BusinessDataTripadvisorReviewsTaskGetResponseInfo tripadvisorReviewsTaskGet(String id) throws ApiException {
       ApiResponse<BusinessDataTripadvisorReviewsTaskGetResponseInfo> localVarResp = tripadvisorReviewsTaskGetWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<BusinessDataTripadvisorReviewsTaskGetResponseInfo> tripadvisorReviewsTaskGetWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = tripadvisorReviewsTaskGetValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorReviewsTaskGetResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tripadvisorReviewsTaskGetAsync(String id, final ApiCallback<BusinessDataTripadvisorReviewsTaskGetResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tripadvisorReviewsTaskGetValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<BusinessDataTripadvisorReviewsTaskGetResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call socialMediaPinterestLiveCall(List<BusinessDataSocialMediaPinterestLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/social_media/pinterest/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call socialMediaPinterestLiveValidateBeforeCall(List<BusinessDataSocialMediaPinterestLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return socialMediaPinterestLiveCall(payload, _callback);
 
        }
 
        public BusinessDataSocialMediaPinterestLiveResponseInfo socialMediaPinterestLive(List<BusinessDataSocialMediaPinterestLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataSocialMediaPinterestLiveResponseInfo> localVarResp = socialMediaPinterestLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataSocialMediaPinterestLiveResponseInfo> socialMediaPinterestLiveWithHttpInfo(List<BusinessDataSocialMediaPinterestLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = socialMediaPinterestLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataSocialMediaPinterestLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call socialMediaPinterestLiveAsync(List<BusinessDataSocialMediaPinterestLiveRequestInfo> payload, final ApiCallback<BusinessDataSocialMediaPinterestLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = socialMediaPinterestLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataSocialMediaPinterestLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call socialMediaFacebookLiveCall(List<BusinessDataSocialMediaFacebookLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/social_media/facebook/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call socialMediaFacebookLiveValidateBeforeCall(List<BusinessDataSocialMediaFacebookLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return socialMediaFacebookLiveCall(payload, _callback);
 
        }
 
        public BusinessDataSocialMediaFacebookLiveResponseInfo socialMediaFacebookLive(List<BusinessDataSocialMediaFacebookLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataSocialMediaFacebookLiveResponseInfo> localVarResp = socialMediaFacebookLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataSocialMediaFacebookLiveResponseInfo> socialMediaFacebookLiveWithHttpInfo(List<BusinessDataSocialMediaFacebookLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = socialMediaFacebookLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataSocialMediaFacebookLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call socialMediaFacebookLiveAsync(List<BusinessDataSocialMediaFacebookLiveRequestInfo> payload, final ApiCallback<BusinessDataSocialMediaFacebookLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = socialMediaFacebookLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataSocialMediaFacebookLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call socialMediaRedditLiveCall(List<BusinessDataSocialMediaRedditLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/business_data/social_media/reddit/live";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call socialMediaRedditLiveValidateBeforeCall(List<BusinessDataSocialMediaRedditLiveRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return socialMediaRedditLiveCall(payload, _callback);
 
        }
 
        public BusinessDataSocialMediaRedditLiveResponseInfo socialMediaRedditLive(List<BusinessDataSocialMediaRedditLiveRequestInfo> payload) throws ApiException {
            ApiResponse<BusinessDataSocialMediaRedditLiveResponseInfo> localVarResp = socialMediaRedditLiveWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<BusinessDataSocialMediaRedditLiveResponseInfo> socialMediaRedditLiveWithHttpInfo(List<BusinessDataSocialMediaRedditLiveRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = socialMediaRedditLiveValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<BusinessDataSocialMediaRedditLiveResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call socialMediaRedditLiveAsync(List<BusinessDataSocialMediaRedditLiveRequestInfo> payload, final ApiCallback<BusinessDataSocialMediaRedditLiveResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = socialMediaRedditLiveValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<BusinessDataSocialMediaRedditLiveResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}