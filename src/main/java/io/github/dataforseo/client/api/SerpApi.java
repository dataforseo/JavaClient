package io.github.dataforseo.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

import io.github.dataforseo.client.model.SerpIdListRequestInfo;
import io.github.dataforseo.client.model.SerpIdListResponseInfo;
import io.github.dataforseo.client.model.SerpErrorsRequestInfo;
import io.github.dataforseo.client.model.SerpErrorsResponseInfo;
import io.github.dataforseo.client.model.SerpScreenshotRequestInfo;
import io.github.dataforseo.client.model.SerpScreenshotResponseInfo;
import io.github.dataforseo.client.model.SerpAiSummaryRequestInfo;
import io.github.dataforseo.client.model.SerpAiSummaryResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpApiStopCrawlOnMatchInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicLiveRegularRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicLiveRegularResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleOrganicLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAiModeLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleMapsLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleNewsLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleEventsLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleImagesLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleJobsTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleJobsTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleJobsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleJobsTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleJobsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleJobsTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAutocompleteLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetSearchLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleDatasetInfoLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsSearchLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsSearchTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.SerpBingLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicLiveRegularRequestInfo;
import io.github.dataforseo.client.model.SerpBingOrganicLiveRegularResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpBingOrganicLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpBingOrganicLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpBingOrganicLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackLiveRegularRequestInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackLiveRegularResponseInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpBingLocalPackLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoInfoLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpYoutubeVideoCommentsLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYahooLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpYahooLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.SerpYahooLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicLiveRegularRequestInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicLiveRegularResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpYahooOrganicLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpNaverOrganicTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamLocationsResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamLocationsCountryResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamLanguagesResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTasksFixedResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetRegularResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveHtmlRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveHtmlResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskPostRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskPostResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTasksReadyResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo;
import io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo;

import io.github.dataforseo.client.ApiCallback;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.ApiResponse;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.Pair;
import io.github.dataforseo.client.ProgressRequestBody;
import io.github.dataforseo.client.ProgressResponseBody;


public class SerpApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SerpApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SerpApi(ApiClient apiClient) {
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


    public okhttp3.Call idListCall(List<SerpIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/id_list";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call idListValidateBeforeCall(List<SerpIdListRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return idListCall(payload, _callback);
 
        }
 
        public SerpIdListResponseInfo idList(List<SerpIdListRequestInfo> payload) throws ApiException {
            ApiResponse<SerpIdListResponseInfo> localVarResp = idListWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpIdListResponseInfo> idListWithHttpInfo(List<SerpIdListRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = idListValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpIdListResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call idListAsync(List<SerpIdListRequestInfo> payload, final ApiCallback<SerpIdListResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = idListValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpIdListResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call errorsCall(List<SerpErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/errors";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call errorsValidateBeforeCall(List<SerpErrorsRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return errorsCall(payload, _callback);
 
        }
 
        public SerpErrorsResponseInfo errors(List<SerpErrorsRequestInfo> payload) throws ApiException {
            ApiResponse<SerpErrorsResponseInfo> localVarResp = errorsWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpErrorsResponseInfo> errorsWithHttpInfo(List<SerpErrorsRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = errorsValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpErrorsResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call errorsAsync(List<SerpErrorsRequestInfo> payload, final ApiCallback<SerpErrorsResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = errorsValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpErrorsResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call screenshotCall(List<SerpScreenshotRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/screenshot";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call screenshotValidateBeforeCall(List<SerpScreenshotRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return screenshotCall(payload, _callback);
 
        }
 
        public SerpScreenshotResponseInfo screenshot(List<SerpScreenshotRequestInfo> payload) throws ApiException {
            ApiResponse<SerpScreenshotResponseInfo> localVarResp = screenshotWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpScreenshotResponseInfo> screenshotWithHttpInfo(List<SerpScreenshotRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = screenshotValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpScreenshotResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call screenshotAsync(List<SerpScreenshotRequestInfo> payload, final ApiCallback<SerpScreenshotResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = screenshotValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpScreenshotResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call aiSummaryCall(List<SerpAiSummaryRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/ai_summary";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call aiSummaryValidateBeforeCall(List<SerpAiSummaryRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return aiSummaryCall(payload, _callback);
 
        }
 
        public SerpAiSummaryResponseInfo aiSummary(List<SerpAiSummaryRequestInfo> payload) throws ApiException {
            ApiResponse<SerpAiSummaryResponseInfo> localVarResp = aiSummaryWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpAiSummaryResponseInfo> aiSummaryWithHttpInfo(List<SerpAiSummaryRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = aiSummaryValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpAiSummaryResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call aiSummaryAsync(List<SerpAiSummaryRequestInfo> payload, final ApiCallback<SerpAiSummaryResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = aiSummaryValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpAiSummaryResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleLocationsCall(_callback);

    }

    public SerpGoogleLocationsResponseInfo googleLocations() throws ApiException {
       ApiResponse<SerpGoogleLocationsResponseInfo> localVarResp = googleLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLocationsResponseInfo> googleLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLocationsAsync(final ApiCallback<SerpGoogleLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling googleLocationsCountry(Async)");
       }

       return googleLocationsCountryCall(country, _callback);

    }

    public SerpGoogleLocationsCountryResponseInfo googleLocationsCountry(String country) throws ApiException {
       ApiResponse<SerpGoogleLocationsCountryResponseInfo> localVarResp = googleLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLocationsCountryResponseInfo> googleLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = googleLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<SerpGoogleLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLocationsCountryAsync(String country, final ApiCallback<SerpGoogleLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleLanguagesCall(_callback);

    }

    public SerpGoogleLanguagesResponseInfo googleLanguages() throws ApiException {
       ApiResponse<SerpGoogleLanguagesResponseInfo> localVarResp = googleLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLanguagesResponseInfo> googleLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLanguagesAsync(final ApiCallback<SerpGoogleLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleOrganicTaskPostCall(List<SerpGoogleOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/organic/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleOrganicTaskPostValidateBeforeCall(List<SerpGoogleOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleOrganicTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleOrganicTaskPostResponseInfo googleOrganicTaskPost(List<SerpGoogleOrganicTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleOrganicTaskPostResponseInfo> localVarResp = googleOrganicTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleOrganicTaskPostResponseInfo> googleOrganicTaskPostWithHttpInfo(List<SerpGoogleOrganicTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleOrganicTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleOrganicTaskPostAsync(List<SerpGoogleOrganicTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleOrganicTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleOrganicTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleOrganicTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/organic/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleOrganicTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleOrganicTasksReadyCall(_callback);

    }

    public SerpGoogleOrganicTasksReadyResponseInfo googleOrganicTasksReady() throws ApiException {
       ApiResponse<SerpGoogleOrganicTasksReadyResponseInfo> localVarResp = googleOrganicTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleOrganicTasksReadyResponseInfo> googleOrganicTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleOrganicTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleOrganicTasksReadyAsync(final ApiCallback<SerpGoogleOrganicTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleOrganicTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call tasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call tasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return tasksReadyCall(_callback);

    }

    public SerpTasksReadyResponseInfo tasksReady() throws ApiException {
       ApiResponse<SerpTasksReadyResponseInfo> localVarResp = tasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpTasksReadyResponseInfo> tasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = tasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call tasksReadyAsync(final ApiCallback<SerpTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = tasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleOrganicTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/organic/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleOrganicTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleOrganicTasksFixedCall(_callback);

    }

    public SerpGoogleOrganicTasksFixedResponseInfo googleOrganicTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleOrganicTasksFixedResponseInfo> localVarResp = googleOrganicTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleOrganicTasksFixedResponseInfo> googleOrganicTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleOrganicTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleOrganicTasksFixedAsync(final ApiCallback<SerpGoogleOrganicTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleOrganicTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleOrganicTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/organic/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleOrganicTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleOrganicTaskGetRegular(Async)");
       }

       return googleOrganicTaskGetRegularCall(id, _callback);

    }

    public SerpGoogleOrganicTaskGetRegularResponseInfo googleOrganicTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpGoogleOrganicTaskGetRegularResponseInfo> localVarResp = googleOrganicTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleOrganicTaskGetRegularResponseInfo> googleOrganicTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleOrganicTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleOrganicTaskGetRegularAsync(String id, final ApiCallback<SerpGoogleOrganicTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleOrganicTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleOrganicTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/organic/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleOrganicTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleOrganicTaskGetAdvanced(Async)");
       }

       return googleOrganicTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleOrganicTaskGetAdvancedResponseInfo googleOrganicTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleOrganicTaskGetAdvancedResponseInfo> localVarResp = googleOrganicTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleOrganicTaskGetAdvancedResponseInfo> googleOrganicTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleOrganicTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleOrganicTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleOrganicTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleOrganicTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleOrganicTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/organic/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleOrganicTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleOrganicTaskGetHtml(Async)");
       }

       return googleOrganicTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleOrganicTaskGetHtmlResponseInfo googleOrganicTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleOrganicTaskGetHtmlResponseInfo> localVarResp = googleOrganicTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleOrganicTaskGetHtmlResponseInfo> googleOrganicTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleOrganicTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleOrganicTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleOrganicTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleOrganicTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleOrganicTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleOrganicLiveRegularCall(List<SerpGoogleOrganicLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/organic/live/regular";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleOrganicLiveRegularValidateBeforeCall(List<SerpGoogleOrganicLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleOrganicLiveRegularCall(payload, _callback);
 
        }
 
        public SerpGoogleOrganicLiveRegularResponseInfo googleOrganicLiveRegular(List<SerpGoogleOrganicLiveRegularRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleOrganicLiveRegularResponseInfo> localVarResp = googleOrganicLiveRegularWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleOrganicLiveRegularResponseInfo> googleOrganicLiveRegularWithHttpInfo(List<SerpGoogleOrganicLiveRegularRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleOrganicLiveRegularValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicLiveRegularResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleOrganicLiveRegularAsync(List<SerpGoogleOrganicLiveRegularRequestInfo> payload, final ApiCallback<SerpGoogleOrganicLiveRegularResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleOrganicLiveRegularValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicLiveRegularResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleOrganicLiveAdvancedCall(List<SerpGoogleOrganicLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/organic/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleOrganicLiveAdvancedValidateBeforeCall(List<SerpGoogleOrganicLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleOrganicLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleOrganicLiveAdvancedResponseInfo googleOrganicLiveAdvanced(List<SerpGoogleOrganicLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleOrganicLiveAdvancedResponseInfo> localVarResp = googleOrganicLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleOrganicLiveAdvancedResponseInfo> googleOrganicLiveAdvancedWithHttpInfo(List<SerpGoogleOrganicLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleOrganicLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleOrganicLiveAdvancedAsync(List<SerpGoogleOrganicLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleOrganicLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleOrganicLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleOrganicLiveHtmlCall(List<SerpGoogleOrganicLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/organic/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleOrganicLiveHtmlValidateBeforeCall(List<SerpGoogleOrganicLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleOrganicLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleOrganicLiveHtmlResponseInfo googleOrganicLiveHtml(List<SerpGoogleOrganicLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleOrganicLiveHtmlResponseInfo> localVarResp = googleOrganicLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleOrganicLiveHtmlResponseInfo> googleOrganicLiveHtmlWithHttpInfo(List<SerpGoogleOrganicLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleOrganicLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleOrganicLiveHtmlAsync(List<SerpGoogleOrganicLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleOrganicLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleOrganicLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleOrganicLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAiModeLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ai_mode/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAiModeLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAiModeLanguagesCall(_callback);

    }

    public SerpGoogleAiModeLanguagesResponseInfo googleAiModeLanguages() throws ApiException {
       ApiResponse<SerpGoogleAiModeLanguagesResponseInfo> localVarResp = googleAiModeLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAiModeLanguagesResponseInfo> googleAiModeLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAiModeLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAiModeLanguagesAsync(final ApiCallback<SerpGoogleAiModeLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAiModeLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAiModeTaskPostCall(List<SerpGoogleAiModeTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/ai_mode/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAiModeTaskPostValidateBeforeCall(List<SerpGoogleAiModeTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAiModeTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleAiModeTaskPostResponseInfo googleAiModeTaskPost(List<SerpGoogleAiModeTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAiModeTaskPostResponseInfo> localVarResp = googleAiModeTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAiModeTaskPostResponseInfo> googleAiModeTaskPostWithHttpInfo(List<SerpGoogleAiModeTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAiModeTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAiModeTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAiModeTaskPostAsync(List<SerpGoogleAiModeTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleAiModeTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAiModeTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAiModeTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAiModeTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ai_mode/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAiModeTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAiModeTasksReadyCall(_callback);

    }

    public SerpGoogleAiModeTasksReadyResponseInfo googleAiModeTasksReady() throws ApiException {
       ApiResponse<SerpGoogleAiModeTasksReadyResponseInfo> localVarResp = googleAiModeTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAiModeTasksReadyResponseInfo> googleAiModeTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAiModeTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAiModeTasksReadyAsync(final ApiCallback<SerpGoogleAiModeTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAiModeTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAiModeTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ai_mode/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAiModeTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAiModeTasksFixedCall(_callback);

    }

    public SerpGoogleAiModeTasksFixedResponseInfo googleAiModeTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleAiModeTasksFixedResponseInfo> localVarResp = googleAiModeTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAiModeTasksFixedResponseInfo> googleAiModeTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAiModeTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAiModeTasksFixedAsync(final ApiCallback<SerpGoogleAiModeTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAiModeTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAiModeTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/ai_mode/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAiModeTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAiModeTaskGetAdvanced(Async)");
       }

       return googleAiModeTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleAiModeTaskGetAdvancedResponseInfo googleAiModeTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleAiModeTaskGetAdvancedResponseInfo> localVarResp = googleAiModeTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAiModeTaskGetAdvancedResponseInfo> googleAiModeTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAiModeTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAiModeTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleAiModeTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAiModeTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAiModeTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/ai_mode/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAiModeTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAiModeTaskGetHtml(Async)");
       }

       return googleAiModeTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleAiModeTaskGetHtmlResponseInfo googleAiModeTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleAiModeTaskGetHtmlResponseInfo> localVarResp = googleAiModeTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAiModeTaskGetHtmlResponseInfo> googleAiModeTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAiModeTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAiModeTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleAiModeTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAiModeTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAiModeTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAiModeLiveAdvancedCall(List<SerpGoogleAiModeLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/ai_mode/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAiModeLiveAdvancedValidateBeforeCall(List<SerpGoogleAiModeLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAiModeLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleAiModeLiveAdvancedResponseInfo googleAiModeLiveAdvanced(List<SerpGoogleAiModeLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAiModeLiveAdvancedResponseInfo> localVarResp = googleAiModeLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAiModeLiveAdvancedResponseInfo> googleAiModeLiveAdvancedWithHttpInfo(List<SerpGoogleAiModeLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAiModeLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAiModeLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAiModeLiveAdvancedAsync(List<SerpGoogleAiModeLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleAiModeLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAiModeLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAiModeLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAiModeLiveHtmlCall(List<SerpGoogleAiModeLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/ai_mode/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAiModeLiveHtmlValidateBeforeCall(List<SerpGoogleAiModeLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAiModeLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleAiModeLiveHtmlResponseInfo googleAiModeLiveHtml(List<SerpGoogleAiModeLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAiModeLiveHtmlResponseInfo> localVarResp = googleAiModeLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAiModeLiveHtmlResponseInfo> googleAiModeLiveHtmlWithHttpInfo(List<SerpGoogleAiModeLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAiModeLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAiModeLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAiModeLiveHtmlAsync(List<SerpGoogleAiModeLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleAiModeLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAiModeLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAiModeLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleMapsTaskPostCall(List<SerpGoogleMapsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/maps/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleMapsTaskPostValidateBeforeCall(List<SerpGoogleMapsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleMapsTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleMapsTaskPostResponseInfo googleMapsTaskPost(List<SerpGoogleMapsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleMapsTaskPostResponseInfo> localVarResp = googleMapsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleMapsTaskPostResponseInfo> googleMapsTaskPostWithHttpInfo(List<SerpGoogleMapsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleMapsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleMapsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleMapsTaskPostAsync(List<SerpGoogleMapsTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleMapsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleMapsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleMapsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleMapsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/maps/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMapsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleMapsTasksReadyCall(_callback);

    }

    public SerpGoogleMapsTasksReadyResponseInfo googleMapsTasksReady() throws ApiException {
       ApiResponse<SerpGoogleMapsTasksReadyResponseInfo> localVarResp = googleMapsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleMapsTasksReadyResponseInfo> googleMapsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleMapsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleMapsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMapsTasksReadyAsync(final ApiCallback<SerpGoogleMapsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMapsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleMapsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMapsTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/maps/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMapsTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleMapsTasksFixedCall(_callback);

    }

    public SerpGoogleMapsTasksFixedResponseInfo googleMapsTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleMapsTasksFixedResponseInfo> localVarResp = googleMapsTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleMapsTasksFixedResponseInfo> googleMapsTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleMapsTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleMapsTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMapsTasksFixedAsync(final ApiCallback<SerpGoogleMapsTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMapsTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleMapsTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMapsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/maps/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleMapsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleMapsTaskGetAdvanced(Async)");
       }

       return googleMapsTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleMapsTaskGetAdvancedResponseInfo googleMapsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleMapsTaskGetAdvancedResponseInfo> localVarResp = googleMapsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleMapsTaskGetAdvancedResponseInfo> googleMapsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleMapsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleMapsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleMapsTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleMapsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleMapsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleMapsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleMapsLiveAdvancedCall(List<SerpGoogleMapsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/maps/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleMapsLiveAdvancedValidateBeforeCall(List<SerpGoogleMapsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleMapsLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleMapsLiveAdvancedResponseInfo googleMapsLiveAdvanced(List<SerpGoogleMapsLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleMapsLiveAdvancedResponseInfo> localVarResp = googleMapsLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleMapsLiveAdvancedResponseInfo> googleMapsLiveAdvancedWithHttpInfo(List<SerpGoogleMapsLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleMapsLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleMapsLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleMapsLiveAdvancedAsync(List<SerpGoogleMapsLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleMapsLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleMapsLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleMapsLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleLocalFinderTaskPostCall(List<SerpGoogleLocalFinderTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/local_finder/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleLocalFinderTaskPostValidateBeforeCall(List<SerpGoogleLocalFinderTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleLocalFinderTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleLocalFinderTaskPostResponseInfo googleLocalFinderTaskPost(List<SerpGoogleLocalFinderTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleLocalFinderTaskPostResponseInfo> localVarResp = googleLocalFinderTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleLocalFinderTaskPostResponseInfo> googleLocalFinderTaskPostWithHttpInfo(List<SerpGoogleLocalFinderTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleLocalFinderTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleLocalFinderTaskPostAsync(List<SerpGoogleLocalFinderTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleLocalFinderTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleLocalFinderTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleLocalFinderTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/local_finder/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLocalFinderTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleLocalFinderTasksReadyCall(_callback);

    }

    public SerpGoogleLocalFinderTasksReadyResponseInfo googleLocalFinderTasksReady() throws ApiException {
       ApiResponse<SerpGoogleLocalFinderTasksReadyResponseInfo> localVarResp = googleLocalFinderTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLocalFinderTasksReadyResponseInfo> googleLocalFinderTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleLocalFinderTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLocalFinderTasksReadyAsync(final ApiCallback<SerpGoogleLocalFinderTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLocalFinderTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleLocalFinderTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/local_finder/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLocalFinderTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleLocalFinderTasksFixedCall(_callback);

    }

    public SerpGoogleLocalFinderTasksFixedResponseInfo googleLocalFinderTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleLocalFinderTasksFixedResponseInfo> localVarResp = googleLocalFinderTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLocalFinderTasksFixedResponseInfo> googleLocalFinderTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleLocalFinderTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLocalFinderTasksFixedAsync(final ApiCallback<SerpGoogleLocalFinderTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLocalFinderTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleLocalFinderTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/local_finder/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLocalFinderTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleLocalFinderTaskGetAdvanced(Async)");
       }

       return googleLocalFinderTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleLocalFinderTaskGetAdvancedResponseInfo googleLocalFinderTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleLocalFinderTaskGetAdvancedResponseInfo> localVarResp = googleLocalFinderTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLocalFinderTaskGetAdvancedResponseInfo> googleLocalFinderTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleLocalFinderTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLocalFinderTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleLocalFinderTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLocalFinderTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleLocalFinderTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/local_finder/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleLocalFinderTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleLocalFinderTaskGetHtml(Async)");
       }

       return googleLocalFinderTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleLocalFinderTaskGetHtmlResponseInfo googleLocalFinderTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleLocalFinderTaskGetHtmlResponseInfo> localVarResp = googleLocalFinderTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleLocalFinderTaskGetHtmlResponseInfo> googleLocalFinderTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleLocalFinderTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleLocalFinderTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleLocalFinderTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleLocalFinderTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleLocalFinderLiveAdvancedCall(List<SerpGoogleLocalFinderLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/local_finder/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleLocalFinderLiveAdvancedValidateBeforeCall(List<SerpGoogleLocalFinderLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleLocalFinderLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleLocalFinderLiveAdvancedResponseInfo googleLocalFinderLiveAdvanced(List<SerpGoogleLocalFinderLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleLocalFinderLiveAdvancedResponseInfo> localVarResp = googleLocalFinderLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleLocalFinderLiveAdvancedResponseInfo> googleLocalFinderLiveAdvancedWithHttpInfo(List<SerpGoogleLocalFinderLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleLocalFinderLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleLocalFinderLiveAdvancedAsync(List<SerpGoogleLocalFinderLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleLocalFinderLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleLocalFinderLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleLocalFinderLiveHtmlCall(List<SerpGoogleLocalFinderLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/local_finder/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleLocalFinderLiveHtmlValidateBeforeCall(List<SerpGoogleLocalFinderLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleLocalFinderLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleLocalFinderLiveHtmlResponseInfo googleLocalFinderLiveHtml(List<SerpGoogleLocalFinderLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleLocalFinderLiveHtmlResponseInfo> localVarResp = googleLocalFinderLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleLocalFinderLiveHtmlResponseInfo> googleLocalFinderLiveHtmlWithHttpInfo(List<SerpGoogleLocalFinderLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleLocalFinderLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleLocalFinderLiveHtmlAsync(List<SerpGoogleLocalFinderLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleLocalFinderLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleLocalFinderLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleLocalFinderLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleNewsTaskPostCall(List<SerpGoogleNewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/news/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleNewsTaskPostValidateBeforeCall(List<SerpGoogleNewsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleNewsTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleNewsTaskPostResponseInfo googleNewsTaskPost(List<SerpGoogleNewsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleNewsTaskPostResponseInfo> localVarResp = googleNewsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleNewsTaskPostResponseInfo> googleNewsTaskPostWithHttpInfo(List<SerpGoogleNewsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleNewsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleNewsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleNewsTaskPostAsync(List<SerpGoogleNewsTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleNewsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleNewsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleNewsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleNewsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/news/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleNewsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleNewsTasksReadyCall(_callback);

    }

    public SerpGoogleNewsTasksReadyResponseInfo googleNewsTasksReady() throws ApiException {
       ApiResponse<SerpGoogleNewsTasksReadyResponseInfo> localVarResp = googleNewsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleNewsTasksReadyResponseInfo> googleNewsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleNewsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleNewsTasksReadyAsync(final ApiCallback<SerpGoogleNewsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleNewsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleNewsTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/news/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleNewsTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleNewsTasksFixedCall(_callback);

    }

    public SerpGoogleNewsTasksFixedResponseInfo googleNewsTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleNewsTasksFixedResponseInfo> localVarResp = googleNewsTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleNewsTasksFixedResponseInfo> googleNewsTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleNewsTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleNewsTasksFixedAsync(final ApiCallback<SerpGoogleNewsTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleNewsTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleNewsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/news/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleNewsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleNewsTaskGetAdvanced(Async)");
       }

       return googleNewsTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleNewsTaskGetAdvancedResponseInfo googleNewsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleNewsTaskGetAdvancedResponseInfo> localVarResp = googleNewsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleNewsTaskGetAdvancedResponseInfo> googleNewsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleNewsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleNewsTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleNewsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleNewsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleNewsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/news/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleNewsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleNewsTaskGetHtml(Async)");
       }

       return googleNewsTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleNewsTaskGetHtmlResponseInfo googleNewsTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleNewsTaskGetHtmlResponseInfo> localVarResp = googleNewsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleNewsTaskGetHtmlResponseInfo> googleNewsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleNewsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleNewsTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleNewsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleNewsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleNewsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleNewsLiveAdvancedCall(List<SerpGoogleNewsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/news/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleNewsLiveAdvancedValidateBeforeCall(List<SerpGoogleNewsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleNewsLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleNewsLiveAdvancedResponseInfo googleNewsLiveAdvanced(List<SerpGoogleNewsLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleNewsLiveAdvancedResponseInfo> localVarResp = googleNewsLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleNewsLiveAdvancedResponseInfo> googleNewsLiveAdvancedWithHttpInfo(List<SerpGoogleNewsLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleNewsLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleNewsLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleNewsLiveAdvancedAsync(List<SerpGoogleNewsLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleNewsLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleNewsLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleNewsLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleNewsLiveHtmlCall(List<SerpGoogleNewsLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/news/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleNewsLiveHtmlValidateBeforeCall(List<SerpGoogleNewsLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleNewsLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleNewsLiveHtmlResponseInfo googleNewsLiveHtml(List<SerpGoogleNewsLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleNewsLiveHtmlResponseInfo> localVarResp = googleNewsLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleNewsLiveHtmlResponseInfo> googleNewsLiveHtmlWithHttpInfo(List<SerpGoogleNewsLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleNewsLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleNewsLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleNewsLiveHtmlAsync(List<SerpGoogleNewsLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleNewsLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleNewsLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleNewsLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleEventsTaskPostCall(List<SerpGoogleEventsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/events/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleEventsTaskPostValidateBeforeCall(List<SerpGoogleEventsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleEventsTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleEventsTaskPostResponseInfo googleEventsTaskPost(List<SerpGoogleEventsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleEventsTaskPostResponseInfo> localVarResp = googleEventsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleEventsTaskPostResponseInfo> googleEventsTaskPostWithHttpInfo(List<SerpGoogleEventsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleEventsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleEventsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleEventsTaskPostAsync(List<SerpGoogleEventsTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleEventsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleEventsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleEventsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleEventsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/events/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleEventsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleEventsTasksReadyCall(_callback);

    }

    public SerpGoogleEventsTasksReadyResponseInfo googleEventsTasksReady() throws ApiException {
       ApiResponse<SerpGoogleEventsTasksReadyResponseInfo> localVarResp = googleEventsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleEventsTasksReadyResponseInfo> googleEventsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleEventsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleEventsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleEventsTasksReadyAsync(final ApiCallback<SerpGoogleEventsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleEventsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleEventsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleEventsTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/events/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleEventsTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleEventsTasksFixedCall(_callback);

    }

    public SerpGoogleEventsTasksFixedResponseInfo googleEventsTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleEventsTasksFixedResponseInfo> localVarResp = googleEventsTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleEventsTasksFixedResponseInfo> googleEventsTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleEventsTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleEventsTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleEventsTasksFixedAsync(final ApiCallback<SerpGoogleEventsTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleEventsTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleEventsTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleEventsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/events/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleEventsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleEventsTaskGetAdvanced(Async)");
       }

       return googleEventsTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleEventsTaskGetAdvancedResponseInfo googleEventsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleEventsTaskGetAdvancedResponseInfo> localVarResp = googleEventsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleEventsTaskGetAdvancedResponseInfo> googleEventsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleEventsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleEventsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleEventsTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleEventsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleEventsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleEventsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleEventsLiveAdvancedCall(List<SerpGoogleEventsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/events/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleEventsLiveAdvancedValidateBeforeCall(List<SerpGoogleEventsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleEventsLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleEventsLiveAdvancedResponseInfo googleEventsLiveAdvanced(List<SerpGoogleEventsLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleEventsLiveAdvancedResponseInfo> localVarResp = googleEventsLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleEventsLiveAdvancedResponseInfo> googleEventsLiveAdvancedWithHttpInfo(List<SerpGoogleEventsLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleEventsLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleEventsLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleEventsLiveAdvancedAsync(List<SerpGoogleEventsLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleEventsLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleEventsLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleEventsLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleImagesTaskPostCall(List<SerpGoogleImagesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/images/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleImagesTaskPostValidateBeforeCall(List<SerpGoogleImagesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleImagesTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleImagesTaskPostResponseInfo googleImagesTaskPost(List<SerpGoogleImagesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleImagesTaskPostResponseInfo> localVarResp = googleImagesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleImagesTaskPostResponseInfo> googleImagesTaskPostWithHttpInfo(List<SerpGoogleImagesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleImagesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleImagesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleImagesTaskPostAsync(List<SerpGoogleImagesTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleImagesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleImagesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleImagesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleImagesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/images/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleImagesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleImagesTasksReadyCall(_callback);

    }

    public SerpGoogleImagesTasksReadyResponseInfo googleImagesTasksReady() throws ApiException {
       ApiResponse<SerpGoogleImagesTasksReadyResponseInfo> localVarResp = googleImagesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleImagesTasksReadyResponseInfo> googleImagesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleImagesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleImagesTasksReadyAsync(final ApiCallback<SerpGoogleImagesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleImagesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleImagesTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/images/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleImagesTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleImagesTasksFixedCall(_callback);

    }

    public SerpGoogleImagesTasksFixedResponseInfo googleImagesTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleImagesTasksFixedResponseInfo> localVarResp = googleImagesTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleImagesTasksFixedResponseInfo> googleImagesTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleImagesTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleImagesTasksFixedAsync(final ApiCallback<SerpGoogleImagesTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleImagesTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleImagesTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/images/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleImagesTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleImagesTaskGetAdvanced(Async)");
       }

       return googleImagesTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleImagesTaskGetAdvancedResponseInfo googleImagesTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleImagesTaskGetAdvancedResponseInfo> localVarResp = googleImagesTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleImagesTaskGetAdvancedResponseInfo> googleImagesTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleImagesTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleImagesTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleImagesTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleImagesTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleImagesTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/images/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleImagesTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleImagesTaskGetHtml(Async)");
       }

       return googleImagesTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleImagesTaskGetHtmlResponseInfo googleImagesTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleImagesTaskGetHtmlResponseInfo> localVarResp = googleImagesTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleImagesTaskGetHtmlResponseInfo> googleImagesTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleImagesTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleImagesTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleImagesTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleImagesTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleImagesTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleImagesLiveAdvancedCall(List<SerpGoogleImagesLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/images/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleImagesLiveAdvancedValidateBeforeCall(List<SerpGoogleImagesLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleImagesLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleImagesLiveAdvancedResponseInfo googleImagesLiveAdvanced(List<SerpGoogleImagesLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleImagesLiveAdvancedResponseInfo> localVarResp = googleImagesLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleImagesLiveAdvancedResponseInfo> googleImagesLiveAdvancedWithHttpInfo(List<SerpGoogleImagesLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleImagesLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleImagesLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleImagesLiveAdvancedAsync(List<SerpGoogleImagesLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleImagesLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleImagesLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleImagesLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleImagesLiveHtmlCall(List<SerpGoogleImagesLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/images/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleImagesLiveHtmlValidateBeforeCall(List<SerpGoogleImagesLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleImagesLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleImagesLiveHtmlResponseInfo googleImagesLiveHtml(List<SerpGoogleImagesLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleImagesLiveHtmlResponseInfo> localVarResp = googleImagesLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleImagesLiveHtmlResponseInfo> googleImagesLiveHtmlWithHttpInfo(List<SerpGoogleImagesLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleImagesLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleImagesLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleImagesLiveHtmlAsync(List<SerpGoogleImagesLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleImagesLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleImagesLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleImagesLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleSearchByImageTaskPostCall(List<SerpGoogleSearchByImageTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/search_by_image/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleSearchByImageTaskPostValidateBeforeCall(List<SerpGoogleSearchByImageTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleSearchByImageTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleSearchByImageTaskPostResponseInfo googleSearchByImageTaskPost(List<SerpGoogleSearchByImageTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleSearchByImageTaskPostResponseInfo> localVarResp = googleSearchByImageTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleSearchByImageTaskPostResponseInfo> googleSearchByImageTaskPostWithHttpInfo(List<SerpGoogleSearchByImageTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleSearchByImageTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleSearchByImageTaskPostAsync(List<SerpGoogleSearchByImageTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleSearchByImageTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleSearchByImageTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleSearchByImageTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/search_by_image/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleSearchByImageTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleSearchByImageTasksReadyCall(_callback);

    }

    public SerpGoogleSearchByImageTasksReadyResponseInfo googleSearchByImageTasksReady() throws ApiException {
       ApiResponse<SerpGoogleSearchByImageTasksReadyResponseInfo> localVarResp = googleSearchByImageTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleSearchByImageTasksReadyResponseInfo> googleSearchByImageTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleSearchByImageTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSearchByImageTasksReadyAsync(final ApiCallback<SerpGoogleSearchByImageTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSearchByImageTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleSearchByImageTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/search_by_image/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleSearchByImageTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleSearchByImageTasksFixedCall(_callback);

    }

    public SerpGoogleSearchByImageTasksFixedResponseInfo googleSearchByImageTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleSearchByImageTasksFixedResponseInfo> localVarResp = googleSearchByImageTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleSearchByImageTasksFixedResponseInfo> googleSearchByImageTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleSearchByImageTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSearchByImageTasksFixedAsync(final ApiCallback<SerpGoogleSearchByImageTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSearchByImageTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleSearchByImageTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/search_by_image/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleSearchByImageTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleSearchByImageTaskGetAdvanced(Async)");
       }

       return googleSearchByImageTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleSearchByImageTaskGetAdvancedResponseInfo googleSearchByImageTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleSearchByImageTaskGetAdvancedResponseInfo> localVarResp = googleSearchByImageTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleSearchByImageTaskGetAdvancedResponseInfo> googleSearchByImageTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleSearchByImageTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleSearchByImageTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleSearchByImageTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleSearchByImageTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleSearchByImageTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleJobsTaskPostCall(List<SerpGoogleJobsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/jobs/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleJobsTaskPostValidateBeforeCall(List<SerpGoogleJobsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleJobsTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleJobsTaskPostResponseInfo googleJobsTaskPost(List<SerpGoogleJobsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleJobsTaskPostResponseInfo> localVarResp = googleJobsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleJobsTaskPostResponseInfo> googleJobsTaskPostWithHttpInfo(List<SerpGoogleJobsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleJobsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleJobsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleJobsTaskPostAsync(List<SerpGoogleJobsTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleJobsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleJobsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleJobsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleJobsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/jobs/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleJobsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleJobsTasksReadyCall(_callback);

    }

    public SerpGoogleJobsTasksReadyResponseInfo googleJobsTasksReady() throws ApiException {
       ApiResponse<SerpGoogleJobsTasksReadyResponseInfo> localVarResp = googleJobsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleJobsTasksReadyResponseInfo> googleJobsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleJobsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleJobsTasksReadyAsync(final ApiCallback<SerpGoogleJobsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleJobsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleJobsTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/jobs/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleJobsTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleJobsTasksFixedCall(_callback);

    }

    public SerpGoogleJobsTasksFixedResponseInfo googleJobsTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleJobsTasksFixedResponseInfo> localVarResp = googleJobsTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleJobsTasksFixedResponseInfo> googleJobsTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleJobsTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleJobsTasksFixedAsync(final ApiCallback<SerpGoogleJobsTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleJobsTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleJobsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/jobs/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleJobsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleJobsTaskGetAdvanced(Async)");
       }

       return googleJobsTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleJobsTaskGetAdvancedResponseInfo googleJobsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleJobsTaskGetAdvancedResponseInfo> localVarResp = googleJobsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleJobsTaskGetAdvancedResponseInfo> googleJobsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleJobsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleJobsTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleJobsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleJobsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleJobsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/jobs/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleJobsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleJobsTaskGetHtml(Async)");
       }

       return googleJobsTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleJobsTaskGetHtmlResponseInfo googleJobsTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleJobsTaskGetHtmlResponseInfo> localVarResp = googleJobsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleJobsTaskGetHtmlResponseInfo> googleJobsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleJobsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleJobsTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleJobsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleJobsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleJobsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAutocompleteTaskPostCall(List<SerpGoogleAutocompleteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/autocomplete/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAutocompleteTaskPostValidateBeforeCall(List<SerpGoogleAutocompleteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAutocompleteTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleAutocompleteTaskPostResponseInfo googleAutocompleteTaskPost(List<SerpGoogleAutocompleteTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAutocompleteTaskPostResponseInfo> localVarResp = googleAutocompleteTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAutocompleteTaskPostResponseInfo> googleAutocompleteTaskPostWithHttpInfo(List<SerpGoogleAutocompleteTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAutocompleteTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAutocompleteTaskPostAsync(List<SerpGoogleAutocompleteTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleAutocompleteTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAutocompleteTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAutocompleteTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/autocomplete/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAutocompleteTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAutocompleteTasksReadyCall(_callback);

    }

    public SerpGoogleAutocompleteTasksReadyResponseInfo googleAutocompleteTasksReady() throws ApiException {
       ApiResponse<SerpGoogleAutocompleteTasksReadyResponseInfo> localVarResp = googleAutocompleteTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAutocompleteTasksReadyResponseInfo> googleAutocompleteTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAutocompleteTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAutocompleteTasksReadyAsync(final ApiCallback<SerpGoogleAutocompleteTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAutocompleteTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAutocompleteTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/autocomplete/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAutocompleteTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAutocompleteTasksFixedCall(_callback);

    }

    public SerpGoogleAutocompleteTasksFixedResponseInfo googleAutocompleteTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleAutocompleteTasksFixedResponseInfo> localVarResp = googleAutocompleteTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAutocompleteTasksFixedResponseInfo> googleAutocompleteTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAutocompleteTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAutocompleteTasksFixedAsync(final ApiCallback<SerpGoogleAutocompleteTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAutocompleteTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAutocompleteTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/autocomplete/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAutocompleteTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAutocompleteTaskGetAdvanced(Async)");
       }

       return googleAutocompleteTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleAutocompleteTaskGetAdvancedResponseInfo googleAutocompleteTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleAutocompleteTaskGetAdvancedResponseInfo> localVarResp = googleAutocompleteTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAutocompleteTaskGetAdvancedResponseInfo> googleAutocompleteTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAutocompleteTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAutocompleteTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleAutocompleteTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAutocompleteTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAutocompleteLiveAdvancedCall(List<SerpGoogleAutocompleteLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/autocomplete/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAutocompleteLiveAdvancedValidateBeforeCall(List<SerpGoogleAutocompleteLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAutocompleteLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleAutocompleteLiveAdvancedResponseInfo googleAutocompleteLiveAdvanced(List<SerpGoogleAutocompleteLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAutocompleteLiveAdvancedResponseInfo> localVarResp = googleAutocompleteLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAutocompleteLiveAdvancedResponseInfo> googleAutocompleteLiveAdvancedWithHttpInfo(List<SerpGoogleAutocompleteLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAutocompleteLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAutocompleteLiveAdvancedAsync(List<SerpGoogleAutocompleteLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleAutocompleteLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAutocompleteLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAutocompleteLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDatasetSearchTaskPostCall(List<SerpGoogleDatasetSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/dataset_search/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleDatasetSearchTaskPostValidateBeforeCall(List<SerpGoogleDatasetSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDatasetSearchTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleDatasetSearchTaskPostResponseInfo googleDatasetSearchTaskPost(List<SerpGoogleDatasetSearchTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleDatasetSearchTaskPostResponseInfo> localVarResp = googleDatasetSearchTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleDatasetSearchTaskPostResponseInfo> googleDatasetSearchTaskPostWithHttpInfo(List<SerpGoogleDatasetSearchTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDatasetSearchTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDatasetSearchTaskPostAsync(List<SerpGoogleDatasetSearchTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleDatasetSearchTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDatasetSearchTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDatasetSearchTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/dataset_search/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleDatasetSearchTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleDatasetSearchTasksReadyCall(_callback);

    }

    public SerpGoogleDatasetSearchTasksReadyResponseInfo googleDatasetSearchTasksReady() throws ApiException {
       ApiResponse<SerpGoogleDatasetSearchTasksReadyResponseInfo> localVarResp = googleDatasetSearchTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleDatasetSearchTasksReadyResponseInfo> googleDatasetSearchTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleDatasetSearchTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleDatasetSearchTasksReadyAsync(final ApiCallback<SerpGoogleDatasetSearchTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleDatasetSearchTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleDatasetSearchTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/dataset_search/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleDatasetSearchTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleDatasetSearchTasksFixedCall(_callback);

    }

    public SerpGoogleDatasetSearchTasksFixedResponseInfo googleDatasetSearchTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleDatasetSearchTasksFixedResponseInfo> localVarResp = googleDatasetSearchTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleDatasetSearchTasksFixedResponseInfo> googleDatasetSearchTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleDatasetSearchTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleDatasetSearchTasksFixedAsync(final ApiCallback<SerpGoogleDatasetSearchTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleDatasetSearchTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleDatasetSearchTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/dataset_search/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleDatasetSearchTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleDatasetSearchTaskGetAdvanced(Async)");
       }

       return googleDatasetSearchTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo googleDatasetSearchTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo> localVarResp = googleDatasetSearchTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo> googleDatasetSearchTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleDatasetSearchTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleDatasetSearchTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleDatasetSearchTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleDatasetSearchLiveAdvancedCall(List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/dataset_search/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleDatasetSearchLiveAdvancedValidateBeforeCall(List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDatasetSearchLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleDatasetSearchLiveAdvancedResponseInfo googleDatasetSearchLiveAdvanced(List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleDatasetSearchLiveAdvancedResponseInfo> localVarResp = googleDatasetSearchLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleDatasetSearchLiveAdvancedResponseInfo> googleDatasetSearchLiveAdvancedWithHttpInfo(List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDatasetSearchLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDatasetSearchLiveAdvancedAsync(List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleDatasetSearchLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDatasetSearchLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetSearchLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDatasetInfoTaskPostCall(List<SerpGoogleDatasetInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/dataset_info/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleDatasetInfoTaskPostValidateBeforeCall(List<SerpGoogleDatasetInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDatasetInfoTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleDatasetInfoTaskPostResponseInfo googleDatasetInfoTaskPost(List<SerpGoogleDatasetInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleDatasetInfoTaskPostResponseInfo> localVarResp = googleDatasetInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleDatasetInfoTaskPostResponseInfo> googleDatasetInfoTaskPostWithHttpInfo(List<SerpGoogleDatasetInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDatasetInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDatasetInfoTaskPostAsync(List<SerpGoogleDatasetInfoTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleDatasetInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDatasetInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleDatasetInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/dataset_info/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleDatasetInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleDatasetInfoTasksReadyCall(_callback);

    }

    public SerpGoogleDatasetInfoTasksReadyResponseInfo googleDatasetInfoTasksReady() throws ApiException {
       ApiResponse<SerpGoogleDatasetInfoTasksReadyResponseInfo> localVarResp = googleDatasetInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleDatasetInfoTasksReadyResponseInfo> googleDatasetInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleDatasetInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleDatasetInfoTasksReadyAsync(final ApiCallback<SerpGoogleDatasetInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleDatasetInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleDatasetInfoTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/dataset_info/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleDatasetInfoTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleDatasetInfoTasksFixedCall(_callback);

    }

    public SerpGoogleDatasetInfoTasksFixedResponseInfo googleDatasetInfoTasksFixed() throws ApiException {
       ApiResponse<SerpGoogleDatasetInfoTasksFixedResponseInfo> localVarResp = googleDatasetInfoTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleDatasetInfoTasksFixedResponseInfo> googleDatasetInfoTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleDatasetInfoTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleDatasetInfoTasksFixedAsync(final ApiCallback<SerpGoogleDatasetInfoTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleDatasetInfoTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleDatasetInfoTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/dataset_info/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleDatasetInfoTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleDatasetInfoTaskGetAdvanced(Async)");
       }

       return googleDatasetInfoTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo googleDatasetInfoTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo> localVarResp = googleDatasetInfoTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo> googleDatasetInfoTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleDatasetInfoTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleDatasetInfoTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleDatasetInfoTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleDatasetInfoLiveAdvancedCall(List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/dataset_info/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleDatasetInfoLiveAdvancedValidateBeforeCall(List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleDatasetInfoLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleDatasetInfoLiveAdvancedResponseInfo googleDatasetInfoLiveAdvanced(List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleDatasetInfoLiveAdvancedResponseInfo> localVarResp = googleDatasetInfoLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleDatasetInfoLiveAdvancedResponseInfo> googleDatasetInfoLiveAdvancedWithHttpInfo(List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleDatasetInfoLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleDatasetInfoLiveAdvancedAsync(List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleDatasetInfoLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleDatasetInfoLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleDatasetInfoLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsAdvertisersLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ads_advertisers/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAdsAdvertisersLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsAdvertisersLocationsCall(_callback);

    }

    public SerpGoogleAdsAdvertisersLocationsResponseInfo googleAdsAdvertisersLocations() throws ApiException {
       ApiResponse<SerpGoogleAdsAdvertisersLocationsResponseInfo> localVarResp = googleAdsAdvertisersLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAdsAdvertisersLocationsResponseInfo> googleAdsAdvertisersLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsAdvertisersLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsAdvertisersLocationsAsync(final ApiCallback<SerpGoogleAdsAdvertisersLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsAdvertisersLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsAdvertisersTaskPostCall(List<SerpGoogleAdsAdvertisersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/ads_advertisers/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAdsAdvertisersTaskPostValidateBeforeCall(List<SerpGoogleAdsAdvertisersTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsAdvertisersTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleAdsAdvertisersTaskPostResponseInfo googleAdsAdvertisersTaskPost(List<SerpGoogleAdsAdvertisersTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAdsAdvertisersTaskPostResponseInfo> localVarResp = googleAdsAdvertisersTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAdsAdvertisersTaskPostResponseInfo> googleAdsAdvertisersTaskPostWithHttpInfo(List<SerpGoogleAdsAdvertisersTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsAdvertisersTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsAdvertisersTaskPostAsync(List<SerpGoogleAdsAdvertisersTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleAdsAdvertisersTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsAdvertisersTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsAdvertisersTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ads_advertisers/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAdsAdvertisersTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsAdvertisersTasksReadyCall(_callback);

    }

    public SerpGoogleAdsAdvertisersTasksReadyResponseInfo googleAdsAdvertisersTasksReady() throws ApiException {
       ApiResponse<SerpGoogleAdsAdvertisersTasksReadyResponseInfo> localVarResp = googleAdsAdvertisersTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAdsAdvertisersTasksReadyResponseInfo> googleAdsAdvertisersTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsAdvertisersTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsAdvertisersTasksReadyAsync(final ApiCallback<SerpGoogleAdsAdvertisersTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsAdvertisersTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsAdvertisersTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/ads_advertisers/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAdsAdvertisersTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAdsAdvertisersTaskGetAdvanced(Async)");
       }

       return googleAdsAdvertisersTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo googleAdsAdvertisersTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo> localVarResp = googleAdsAdvertisersTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo> googleAdsAdvertisersTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAdsAdvertisersTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsAdvertisersTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsAdvertisersTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsSearchLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ads_search/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAdsSearchLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsSearchLocationsCall(_callback);

    }

    public SerpGoogleAdsSearchLocationsResponseInfo googleAdsSearchLocations() throws ApiException {
       ApiResponse<SerpGoogleAdsSearchLocationsResponseInfo> localVarResp = googleAdsSearchLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAdsSearchLocationsResponseInfo> googleAdsSearchLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsSearchLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsSearchLocationsAsync(final ApiCallback<SerpGoogleAdsSearchLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsSearchLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsSearchTaskPostCall(List<SerpGoogleAdsSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/ads_search/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleAdsSearchTaskPostValidateBeforeCall(List<SerpGoogleAdsSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleAdsSearchTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleAdsSearchTaskPostResponseInfo googleAdsSearchTaskPost(List<SerpGoogleAdsSearchTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleAdsSearchTaskPostResponseInfo> localVarResp = googleAdsSearchTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleAdsSearchTaskPostResponseInfo> googleAdsSearchTaskPostWithHttpInfo(List<SerpGoogleAdsSearchTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleAdsSearchTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleAdsSearchTaskPostAsync(List<SerpGoogleAdsSearchTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleAdsSearchTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleAdsSearchTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleAdsSearchTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/ads_search/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAdsSearchTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleAdsSearchTasksReadyCall(_callback);

    }

    public SerpGoogleAdsSearchTasksReadyResponseInfo googleAdsSearchTasksReady() throws ApiException {
       ApiResponse<SerpGoogleAdsSearchTasksReadyResponseInfo> localVarResp = googleAdsSearchTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAdsSearchTasksReadyResponseInfo> googleAdsSearchTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleAdsSearchTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsSearchTasksReadyAsync(final ApiCallback<SerpGoogleAdsSearchTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsSearchTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleAdsSearchTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/ads_search/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleAdsSearchTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleAdsSearchTaskGetAdvanced(Async)");
       }

       return googleAdsSearchTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleAdsSearchTaskGetAdvancedResponseInfo googleAdsSearchTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleAdsSearchTaskGetAdvancedResponseInfo> localVarResp = googleAdsSearchTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleAdsSearchTaskGetAdvancedResponseInfo> googleAdsSearchTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleAdsSearchTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleAdsSearchTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleAdsSearchTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleAdsSearchTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleAdsSearchTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/bing/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingLocationsCall(_callback);

    }

    public SerpBingLocationsResponseInfo bingLocations() throws ApiException {
       ApiResponse<SerpBingLocationsResponseInfo> localVarResp = bingLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLocationsResponseInfo> bingLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBingLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLocationsAsync(final ApiCallback<SerpBingLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBingLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/bing/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling bingLocationsCountry(Async)");
       }

       return bingLocationsCountryCall(country, _callback);

    }

    public SerpBingLocationsCountryResponseInfo bingLocationsCountry(String country) throws ApiException {
       ApiResponse<SerpBingLocationsCountryResponseInfo> localVarResp = bingLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLocationsCountryResponseInfo> bingLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = bingLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<SerpBingLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLocationsCountryAsync(String country, final ApiCallback<SerpBingLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<SerpBingLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/bing/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingLanguagesCall(_callback);

    }

    public SerpBingLanguagesResponseInfo bingLanguages() throws ApiException {
       ApiResponse<SerpBingLanguagesResponseInfo> localVarResp = bingLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLanguagesResponseInfo> bingLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBingLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLanguagesAsync(final ApiCallback<SerpBingLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBingLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingOrganicTaskPostCall(List<SerpBingOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/organic/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingOrganicTaskPostValidateBeforeCall(List<SerpBingOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingOrganicTaskPostCall(payload, _callback);
 
        }
 
        public SerpBingOrganicTaskPostResponseInfo bingOrganicTaskPost(List<SerpBingOrganicTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingOrganicTaskPostResponseInfo> localVarResp = bingOrganicTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingOrganicTaskPostResponseInfo> bingOrganicTaskPostWithHttpInfo(List<SerpBingOrganicTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingOrganicTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingOrganicTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingOrganicTaskPostAsync(List<SerpBingOrganicTaskPostRequestInfo> payload, final ApiCallback<SerpBingOrganicTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingOrganicTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingOrganicTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingOrganicTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/bing/organic/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingOrganicTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingOrganicTasksReadyCall(_callback);

    }

    public SerpBingOrganicTasksReadyResponseInfo bingOrganicTasksReady() throws ApiException {
       ApiResponse<SerpBingOrganicTasksReadyResponseInfo> localVarResp = bingOrganicTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingOrganicTasksReadyResponseInfo> bingOrganicTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingOrganicTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingOrganicTasksReadyAsync(final ApiCallback<SerpBingOrganicTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingOrganicTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingOrganicTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/bing/organic/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingOrganicTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingOrganicTasksFixedCall(_callback);

    }

    public SerpBingOrganicTasksFixedResponseInfo bingOrganicTasksFixed() throws ApiException {
       ApiResponse<SerpBingOrganicTasksFixedResponseInfo> localVarResp = bingOrganicTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingOrganicTasksFixedResponseInfo> bingOrganicTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingOrganicTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingOrganicTasksFixedAsync(final ApiCallback<SerpBingOrganicTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingOrganicTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingOrganicTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/bing/organic/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingOrganicTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingOrganicTaskGetRegular(Async)");
       }

       return bingOrganicTaskGetRegularCall(id, _callback);

    }

    public SerpBingOrganicTaskGetRegularResponseInfo bingOrganicTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpBingOrganicTaskGetRegularResponseInfo> localVarResp = bingOrganicTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingOrganicTaskGetRegularResponseInfo> bingOrganicTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingOrganicTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingOrganicTaskGetRegularAsync(String id, final ApiCallback<SerpBingOrganicTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingOrganicTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingOrganicTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/bing/organic/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingOrganicTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingOrganicTaskGetAdvanced(Async)");
       }

       return bingOrganicTaskGetAdvancedCall(id, _callback);

    }

    public SerpBingOrganicTaskGetAdvancedResponseInfo bingOrganicTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpBingOrganicTaskGetAdvancedResponseInfo> localVarResp = bingOrganicTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingOrganicTaskGetAdvancedResponseInfo> bingOrganicTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingOrganicTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingOrganicTaskGetAdvancedAsync(String id, final ApiCallback<SerpBingOrganicTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingOrganicTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingOrganicTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/bing/organic/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingOrganicTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingOrganicTaskGetHtml(Async)");
       }

       return bingOrganicTaskGetHtmlCall(id, _callback);

    }

    public SerpBingOrganicTaskGetHtmlResponseInfo bingOrganicTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpBingOrganicTaskGetHtmlResponseInfo> localVarResp = bingOrganicTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingOrganicTaskGetHtmlResponseInfo> bingOrganicTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingOrganicTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingOrganicTaskGetHtmlAsync(String id, final ApiCallback<SerpBingOrganicTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingOrganicTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBingOrganicTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingOrganicLiveRegularCall(List<SerpBingOrganicLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/organic/live/regular";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingOrganicLiveRegularValidateBeforeCall(List<SerpBingOrganicLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingOrganicLiveRegularCall(payload, _callback);
 
        }
 
        public SerpBingOrganicLiveRegularResponseInfo bingOrganicLiveRegular(List<SerpBingOrganicLiveRegularRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingOrganicLiveRegularResponseInfo> localVarResp = bingOrganicLiveRegularWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingOrganicLiveRegularResponseInfo> bingOrganicLiveRegularWithHttpInfo(List<SerpBingOrganicLiveRegularRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingOrganicLiveRegularValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingOrganicLiveRegularResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingOrganicLiveRegularAsync(List<SerpBingOrganicLiveRegularRequestInfo> payload, final ApiCallback<SerpBingOrganicLiveRegularResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingOrganicLiveRegularValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingOrganicLiveRegularResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingOrganicLiveAdvancedCall(List<SerpBingOrganicLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/organic/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingOrganicLiveAdvancedValidateBeforeCall(List<SerpBingOrganicLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingOrganicLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpBingOrganicLiveAdvancedResponseInfo bingOrganicLiveAdvanced(List<SerpBingOrganicLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingOrganicLiveAdvancedResponseInfo> localVarResp = bingOrganicLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingOrganicLiveAdvancedResponseInfo> bingOrganicLiveAdvancedWithHttpInfo(List<SerpBingOrganicLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingOrganicLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingOrganicLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingOrganicLiveAdvancedAsync(List<SerpBingOrganicLiveAdvancedRequestInfo> payload, final ApiCallback<SerpBingOrganicLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingOrganicLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingOrganicLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingOrganicLiveHtmlCall(List<SerpBingOrganicLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/organic/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingOrganicLiveHtmlValidateBeforeCall(List<SerpBingOrganicLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingOrganicLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpBingOrganicLiveHtmlResponseInfo bingOrganicLiveHtml(List<SerpBingOrganicLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingOrganicLiveHtmlResponseInfo> localVarResp = bingOrganicLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingOrganicLiveHtmlResponseInfo> bingOrganicLiveHtmlWithHttpInfo(List<SerpBingOrganicLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingOrganicLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingOrganicLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingOrganicLiveHtmlAsync(List<SerpBingOrganicLiveHtmlRequestInfo> payload, final ApiCallback<SerpBingOrganicLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingOrganicLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingOrganicLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingLocalPackTaskPostCall(List<SerpBingLocalPackTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/local_pack/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingLocalPackTaskPostValidateBeforeCall(List<SerpBingLocalPackTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingLocalPackTaskPostCall(payload, _callback);
 
        }
 
        public SerpBingLocalPackTaskPostResponseInfo bingLocalPackTaskPost(List<SerpBingLocalPackTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingLocalPackTaskPostResponseInfo> localVarResp = bingLocalPackTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingLocalPackTaskPostResponseInfo> bingLocalPackTaskPostWithHttpInfo(List<SerpBingLocalPackTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingLocalPackTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingLocalPackTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingLocalPackTaskPostAsync(List<SerpBingLocalPackTaskPostRequestInfo> payload, final ApiCallback<SerpBingLocalPackTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingLocalPackTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingLocalPackTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingLocalPackTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/bing/local_pack/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLocalPackTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingLocalPackTasksReadyCall(_callback);

    }

    public SerpBingLocalPackTasksReadyResponseInfo bingLocalPackTasksReady() throws ApiException {
       ApiResponse<SerpBingLocalPackTasksReadyResponseInfo> localVarResp = bingLocalPackTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLocalPackTasksReadyResponseInfo> bingLocalPackTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingLocalPackTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLocalPackTasksReadyAsync(final ApiCallback<SerpBingLocalPackTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLocalPackTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLocalPackTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/bing/local_pack/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLocalPackTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return bingLocalPackTasksFixedCall(_callback);

    }

    public SerpBingLocalPackTasksFixedResponseInfo bingLocalPackTasksFixed() throws ApiException {
       ApiResponse<SerpBingLocalPackTasksFixedResponseInfo> localVarResp = bingLocalPackTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLocalPackTasksFixedResponseInfo> bingLocalPackTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = bingLocalPackTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLocalPackTasksFixedAsync(final ApiCallback<SerpBingLocalPackTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLocalPackTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLocalPackTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/bing/local_pack/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLocalPackTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingLocalPackTaskGetRegular(Async)");
       }

       return bingLocalPackTaskGetRegularCall(id, _callback);

    }

    public SerpBingLocalPackTaskGetRegularResponseInfo bingLocalPackTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpBingLocalPackTaskGetRegularResponseInfo> localVarResp = bingLocalPackTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLocalPackTaskGetRegularResponseInfo> bingLocalPackTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingLocalPackTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLocalPackTaskGetRegularAsync(String id, final ApiCallback<SerpBingLocalPackTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLocalPackTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLocalPackTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/bing/local_pack/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call bingLocalPackTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling bingLocalPackTaskGetHtml(Async)");
       }

       return bingLocalPackTaskGetHtmlCall(id, _callback);

    }

    public SerpBingLocalPackTaskGetHtmlResponseInfo bingLocalPackTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpBingLocalPackTaskGetHtmlResponseInfo> localVarResp = bingLocalPackTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBingLocalPackTaskGetHtmlResponseInfo> bingLocalPackTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = bingLocalPackTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call bingLocalPackTaskGetHtmlAsync(String id, final ApiCallback<SerpBingLocalPackTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = bingLocalPackTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBingLocalPackTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call bingLocalPackLiveRegularCall(List<SerpBingLocalPackLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/local_pack/live/regular";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingLocalPackLiveRegularValidateBeforeCall(List<SerpBingLocalPackLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingLocalPackLiveRegularCall(payload, _callback);
 
        }
 
        public SerpBingLocalPackLiveRegularResponseInfo bingLocalPackLiveRegular(List<SerpBingLocalPackLiveRegularRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingLocalPackLiveRegularResponseInfo> localVarResp = bingLocalPackLiveRegularWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingLocalPackLiveRegularResponseInfo> bingLocalPackLiveRegularWithHttpInfo(List<SerpBingLocalPackLiveRegularRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingLocalPackLiveRegularValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingLocalPackLiveRegularResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingLocalPackLiveRegularAsync(List<SerpBingLocalPackLiveRegularRequestInfo> payload, final ApiCallback<SerpBingLocalPackLiveRegularResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingLocalPackLiveRegularValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingLocalPackLiveRegularResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call bingLocalPackLiveHtmlCall(List<SerpBingLocalPackLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/bing/local_pack/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call bingLocalPackLiveHtmlValidateBeforeCall(List<SerpBingLocalPackLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return bingLocalPackLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpBingLocalPackLiveHtmlResponseInfo bingLocalPackLiveHtml(List<SerpBingLocalPackLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBingLocalPackLiveHtmlResponseInfo> localVarResp = bingLocalPackLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBingLocalPackLiveHtmlResponseInfo> bingLocalPackLiveHtmlWithHttpInfo(List<SerpBingLocalPackLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = bingLocalPackLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBingLocalPackLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call bingLocalPackLiveHtmlAsync(List<SerpBingLocalPackLiveHtmlRequestInfo> payload, final ApiCallback<SerpBingLocalPackLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = bingLocalPackLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBingLocalPackLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call youtubeLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeLocationsCall(_callback);

    }

    public SerpYoutubeLocationsResponseInfo youtubeLocations() throws ApiException {
       ApiResponse<SerpYoutubeLocationsResponseInfo> localVarResp = youtubeLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeLocationsResponseInfo> youtubeLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeLocationsAsync(final ApiCallback<SerpYoutubeLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/youtube/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling youtubeLocationsCountry(Async)");
       }

       return youtubeLocationsCountryCall(country, _callback);

    }

    public SerpYoutubeLocationsCountryResponseInfo youtubeLocationsCountry(String country) throws ApiException {
       ApiResponse<SerpYoutubeLocationsCountryResponseInfo> localVarResp = youtubeLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeLocationsCountryResponseInfo> youtubeLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = youtubeLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<SerpYoutubeLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeLocationsCountryAsync(String country, final ApiCallback<SerpYoutubeLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeLanguagesCall(_callback);

    }

    public SerpYoutubeLanguagesResponseInfo youtubeLanguages() throws ApiException {
       ApiResponse<SerpYoutubeLanguagesResponseInfo> localVarResp = youtubeLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeLanguagesResponseInfo> youtubeLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeLanguagesAsync(final ApiCallback<SerpYoutubeLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoInfoTaskPostCall(List<SerpYoutubeVideoInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/youtube/video_info/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call youtubeVideoInfoTaskPostValidateBeforeCall(List<SerpYoutubeVideoInfoTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return youtubeVideoInfoTaskPostCall(payload, _callback);
 
        }
 
        public SerpYoutubeVideoInfoTaskPostResponseInfo youtubeVideoInfoTaskPost(List<SerpYoutubeVideoInfoTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYoutubeVideoInfoTaskPostResponseInfo> localVarResp = youtubeVideoInfoTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYoutubeVideoInfoTaskPostResponseInfo> youtubeVideoInfoTaskPostWithHttpInfo(List<SerpYoutubeVideoInfoTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = youtubeVideoInfoTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call youtubeVideoInfoTaskPostAsync(List<SerpYoutubeVideoInfoTaskPostRequestInfo> payload, final ApiCallback<SerpYoutubeVideoInfoTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = youtubeVideoInfoTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call youtubeVideoInfoTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/video_info/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoInfoTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeVideoInfoTasksReadyCall(_callback);

    }

    public SerpYoutubeVideoInfoTasksReadyResponseInfo youtubeVideoInfoTasksReady() throws ApiException {
       ApiResponse<SerpYoutubeVideoInfoTasksReadyResponseInfo> localVarResp = youtubeVideoInfoTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoInfoTasksReadyResponseInfo> youtubeVideoInfoTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoInfoTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoInfoTasksReadyAsync(final ApiCallback<SerpYoutubeVideoInfoTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoInfoTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoInfoTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/video_info/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoInfoTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeVideoInfoTasksFixedCall(_callback);

    }

    public SerpYoutubeVideoInfoTasksFixedResponseInfo youtubeVideoInfoTasksFixed() throws ApiException {
       ApiResponse<SerpYoutubeVideoInfoTasksFixedResponseInfo> localVarResp = youtubeVideoInfoTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoInfoTasksFixedResponseInfo> youtubeVideoInfoTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoInfoTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoInfoTasksFixedAsync(final ApiCallback<SerpYoutubeVideoInfoTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoInfoTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoInfoTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/youtube/video_info/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoInfoTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling youtubeVideoInfoTaskGetAdvanced(Async)");
       }

       return youtubeVideoInfoTaskGetAdvancedCall(id, _callback);

    }

    public SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo youtubeVideoInfoTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo> localVarResp = youtubeVideoInfoTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo> youtubeVideoInfoTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoInfoTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoInfoTaskGetAdvancedAsync(String id, final ApiCallback<SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoInfoTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoInfoLiveAdvancedCall(List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/youtube/video_info/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call youtubeVideoInfoLiveAdvancedValidateBeforeCall(List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return youtubeVideoInfoLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpYoutubeVideoInfoLiveAdvancedResponseInfo youtubeVideoInfoLiveAdvanced(List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYoutubeVideoInfoLiveAdvancedResponseInfo> localVarResp = youtubeVideoInfoLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYoutubeVideoInfoLiveAdvancedResponseInfo> youtubeVideoInfoLiveAdvancedWithHttpInfo(List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = youtubeVideoInfoLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call youtubeVideoInfoLiveAdvancedAsync(List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo> payload, final ApiCallback<SerpYoutubeVideoInfoLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = youtubeVideoInfoLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoInfoLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call youtubeVideoSubtitlesTaskPostCall(List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/youtube/video_subtitles/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call youtubeVideoSubtitlesTaskPostValidateBeforeCall(List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return youtubeVideoSubtitlesTaskPostCall(payload, _callback);
 
        }
 
        public SerpYoutubeVideoSubtitlesTaskPostResponseInfo youtubeVideoSubtitlesTaskPost(List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYoutubeVideoSubtitlesTaskPostResponseInfo> localVarResp = youtubeVideoSubtitlesTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYoutubeVideoSubtitlesTaskPostResponseInfo> youtubeVideoSubtitlesTaskPostWithHttpInfo(List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = youtubeVideoSubtitlesTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call youtubeVideoSubtitlesTaskPostAsync(List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo> payload, final ApiCallback<SerpYoutubeVideoSubtitlesTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = youtubeVideoSubtitlesTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call youtubeVideoSubtitlesTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/video_subtitles/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoSubtitlesTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeVideoSubtitlesTasksReadyCall(_callback);

    }

    public SerpYoutubeVideoSubtitlesTasksReadyResponseInfo youtubeVideoSubtitlesTasksReady() throws ApiException {
       ApiResponse<SerpYoutubeVideoSubtitlesTasksReadyResponseInfo> localVarResp = youtubeVideoSubtitlesTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoSubtitlesTasksReadyResponseInfo> youtubeVideoSubtitlesTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoSubtitlesTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoSubtitlesTasksReadyAsync(final ApiCallback<SerpYoutubeVideoSubtitlesTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoSubtitlesTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoSubtitlesTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/video_subtitles/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoSubtitlesTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeVideoSubtitlesTasksFixedCall(_callback);

    }

    public SerpYoutubeVideoSubtitlesTasksFixedResponseInfo youtubeVideoSubtitlesTasksFixed() throws ApiException {
       ApiResponse<SerpYoutubeVideoSubtitlesTasksFixedResponseInfo> localVarResp = youtubeVideoSubtitlesTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoSubtitlesTasksFixedResponseInfo> youtubeVideoSubtitlesTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoSubtitlesTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoSubtitlesTasksFixedAsync(final ApiCallback<SerpYoutubeVideoSubtitlesTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoSubtitlesTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoSubtitlesTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/youtube/video_subtitles/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoSubtitlesTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling youtubeVideoSubtitlesTaskGetAdvanced(Async)");
       }

       return youtubeVideoSubtitlesTaskGetAdvancedCall(id, _callback);

    }

    public SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo youtubeVideoSubtitlesTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo> localVarResp = youtubeVideoSubtitlesTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo> youtubeVideoSubtitlesTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoSubtitlesTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoSubtitlesTaskGetAdvancedAsync(String id, final ApiCallback<SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoSubtitlesTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoSubtitlesLiveAdvancedCall(List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/youtube/video_subtitles/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call youtubeVideoSubtitlesLiveAdvancedValidateBeforeCall(List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return youtubeVideoSubtitlesLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo youtubeVideoSubtitlesLiveAdvanced(List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo> localVarResp = youtubeVideoSubtitlesLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo> youtubeVideoSubtitlesLiveAdvancedWithHttpInfo(List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = youtubeVideoSubtitlesLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call youtubeVideoSubtitlesLiveAdvancedAsync(List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo> payload, final ApiCallback<SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = youtubeVideoSubtitlesLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call youtubeVideoCommentsTaskPostCall(List<SerpYoutubeVideoCommentsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/youtube/video_comments/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call youtubeVideoCommentsTaskPostValidateBeforeCall(List<SerpYoutubeVideoCommentsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return youtubeVideoCommentsTaskPostCall(payload, _callback);
 
        }
 
        public SerpYoutubeVideoCommentsTaskPostResponseInfo youtubeVideoCommentsTaskPost(List<SerpYoutubeVideoCommentsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYoutubeVideoCommentsTaskPostResponseInfo> localVarResp = youtubeVideoCommentsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYoutubeVideoCommentsTaskPostResponseInfo> youtubeVideoCommentsTaskPostWithHttpInfo(List<SerpYoutubeVideoCommentsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = youtubeVideoCommentsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call youtubeVideoCommentsTaskPostAsync(List<SerpYoutubeVideoCommentsTaskPostRequestInfo> payload, final ApiCallback<SerpYoutubeVideoCommentsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = youtubeVideoCommentsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call youtubeVideoCommentsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/video_comments/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoCommentsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeVideoCommentsTasksReadyCall(_callback);

    }

    public SerpYoutubeVideoCommentsTasksReadyResponseInfo youtubeVideoCommentsTasksReady() throws ApiException {
       ApiResponse<SerpYoutubeVideoCommentsTasksReadyResponseInfo> localVarResp = youtubeVideoCommentsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoCommentsTasksReadyResponseInfo> youtubeVideoCommentsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoCommentsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoCommentsTasksReadyAsync(final ApiCallback<SerpYoutubeVideoCommentsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoCommentsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoCommentsTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/youtube/video_comments/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoCommentsTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return youtubeVideoCommentsTasksFixedCall(_callback);

    }

    public SerpYoutubeVideoCommentsTasksFixedResponseInfo youtubeVideoCommentsTasksFixed() throws ApiException {
       ApiResponse<SerpYoutubeVideoCommentsTasksFixedResponseInfo> localVarResp = youtubeVideoCommentsTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoCommentsTasksFixedResponseInfo> youtubeVideoCommentsTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoCommentsTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoCommentsTasksFixedAsync(final ApiCallback<SerpYoutubeVideoCommentsTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoCommentsTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoCommentsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/youtube/video_comments/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call youtubeVideoCommentsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling youtubeVideoCommentsTaskGetAdvanced(Async)");
       }

       return youtubeVideoCommentsTaskGetAdvancedCall(id, _callback);

    }

    public SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo youtubeVideoCommentsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo> localVarResp = youtubeVideoCommentsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo> youtubeVideoCommentsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = youtubeVideoCommentsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call youtubeVideoCommentsTaskGetAdvancedAsync(String id, final ApiCallback<SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = youtubeVideoCommentsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call youtubeVideoCommentsLiveAdvancedCall(List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/youtube/video_comments/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call youtubeVideoCommentsLiveAdvancedValidateBeforeCall(List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return youtubeVideoCommentsLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpYoutubeVideoCommentsLiveAdvancedResponseInfo youtubeVideoCommentsLiveAdvanced(List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYoutubeVideoCommentsLiveAdvancedResponseInfo> localVarResp = youtubeVideoCommentsLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYoutubeVideoCommentsLiveAdvancedResponseInfo> youtubeVideoCommentsLiveAdvancedWithHttpInfo(List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = youtubeVideoCommentsLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call youtubeVideoCommentsLiveAdvancedAsync(List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo> payload, final ApiCallback<SerpYoutubeVideoCommentsLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = youtubeVideoCommentsLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYoutubeVideoCommentsLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call yahooLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/yahoo/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return yahooLocationsCall(_callback);

    }

    public SerpYahooLocationsResponseInfo yahooLocations() throws ApiException {
       ApiResponse<SerpYahooLocationsResponseInfo> localVarResp = yahooLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooLocationsResponseInfo> yahooLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = yahooLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYahooLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooLocationsAsync(final ApiCallback<SerpYahooLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYahooLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/yahoo/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling yahooLocationsCountry(Async)");
       }

       return yahooLocationsCountryCall(country, _callback);

    }

    public SerpYahooLocationsCountryResponseInfo yahooLocationsCountry(String country) throws ApiException {
       ApiResponse<SerpYahooLocationsCountryResponseInfo> localVarResp = yahooLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooLocationsCountryResponseInfo> yahooLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = yahooLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<SerpYahooLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooLocationsCountryAsync(String country, final ApiCallback<SerpYahooLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<SerpYahooLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/yahoo/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return yahooLanguagesCall(_callback);

    }

    public SerpYahooLanguagesResponseInfo yahooLanguages() throws ApiException {
       ApiResponse<SerpYahooLanguagesResponseInfo> localVarResp = yahooLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooLanguagesResponseInfo> yahooLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = yahooLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYahooLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooLanguagesAsync(final ApiCallback<SerpYahooLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYahooLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooOrganicTaskPostCall(List<SerpYahooOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/yahoo/organic/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call yahooOrganicTaskPostValidateBeforeCall(List<SerpYahooOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return yahooOrganicTaskPostCall(payload, _callback);
 
        }
 
        public SerpYahooOrganicTaskPostResponseInfo yahooOrganicTaskPost(List<SerpYahooOrganicTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYahooOrganicTaskPostResponseInfo> localVarResp = yahooOrganicTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYahooOrganicTaskPostResponseInfo> yahooOrganicTaskPostWithHttpInfo(List<SerpYahooOrganicTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = yahooOrganicTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call yahooOrganicTaskPostAsync(List<SerpYahooOrganicTaskPostRequestInfo> payload, final ApiCallback<SerpYahooOrganicTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = yahooOrganicTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call yahooOrganicTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/yahoo/organic/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooOrganicTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return yahooOrganicTasksReadyCall(_callback);

    }

    public SerpYahooOrganicTasksReadyResponseInfo yahooOrganicTasksReady() throws ApiException {
       ApiResponse<SerpYahooOrganicTasksReadyResponseInfo> localVarResp = yahooOrganicTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooOrganicTasksReadyResponseInfo> yahooOrganicTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = yahooOrganicTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooOrganicTasksReadyAsync(final ApiCallback<SerpYahooOrganicTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooOrganicTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooOrganicTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/yahoo/organic/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooOrganicTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return yahooOrganicTasksFixedCall(_callback);

    }

    public SerpYahooOrganicTasksFixedResponseInfo yahooOrganicTasksFixed() throws ApiException {
       ApiResponse<SerpYahooOrganicTasksFixedResponseInfo> localVarResp = yahooOrganicTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooOrganicTasksFixedResponseInfo> yahooOrganicTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = yahooOrganicTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooOrganicTasksFixedAsync(final ApiCallback<SerpYahooOrganicTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooOrganicTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooOrganicTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/yahoo/organic/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooOrganicTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling yahooOrganicTaskGetRegular(Async)");
       }

       return yahooOrganicTaskGetRegularCall(id, _callback);

    }

    public SerpYahooOrganicTaskGetRegularResponseInfo yahooOrganicTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpYahooOrganicTaskGetRegularResponseInfo> localVarResp = yahooOrganicTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooOrganicTaskGetRegularResponseInfo> yahooOrganicTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = yahooOrganicTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooOrganicTaskGetRegularAsync(String id, final ApiCallback<SerpYahooOrganicTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooOrganicTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooOrganicTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/yahoo/organic/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooOrganicTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling yahooOrganicTaskGetAdvanced(Async)");
       }

       return yahooOrganicTaskGetAdvancedCall(id, _callback);

    }

    public SerpYahooOrganicTaskGetAdvancedResponseInfo yahooOrganicTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpYahooOrganicTaskGetAdvancedResponseInfo> localVarResp = yahooOrganicTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooOrganicTaskGetAdvancedResponseInfo> yahooOrganicTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = yahooOrganicTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooOrganicTaskGetAdvancedAsync(String id, final ApiCallback<SerpYahooOrganicTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooOrganicTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooOrganicTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/yahoo/organic/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call yahooOrganicTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling yahooOrganicTaskGetHtml(Async)");
       }

       return yahooOrganicTaskGetHtmlCall(id, _callback);

    }

    public SerpYahooOrganicTaskGetHtmlResponseInfo yahooOrganicTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpYahooOrganicTaskGetHtmlResponseInfo> localVarResp = yahooOrganicTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpYahooOrganicTaskGetHtmlResponseInfo> yahooOrganicTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = yahooOrganicTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call yahooOrganicTaskGetHtmlAsync(String id, final ApiCallback<SerpYahooOrganicTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = yahooOrganicTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpYahooOrganicTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call yahooOrganicLiveRegularCall(List<SerpYahooOrganicLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/yahoo/organic/live/regular";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call yahooOrganicLiveRegularValidateBeforeCall(List<SerpYahooOrganicLiveRegularRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return yahooOrganicLiveRegularCall(payload, _callback);
 
        }
 
        public SerpYahooOrganicLiveRegularResponseInfo yahooOrganicLiveRegular(List<SerpYahooOrganicLiveRegularRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYahooOrganicLiveRegularResponseInfo> localVarResp = yahooOrganicLiveRegularWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYahooOrganicLiveRegularResponseInfo> yahooOrganicLiveRegularWithHttpInfo(List<SerpYahooOrganicLiveRegularRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = yahooOrganicLiveRegularValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicLiveRegularResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call yahooOrganicLiveRegularAsync(List<SerpYahooOrganicLiveRegularRequestInfo> payload, final ApiCallback<SerpYahooOrganicLiveRegularResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = yahooOrganicLiveRegularValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicLiveRegularResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call yahooOrganicLiveAdvancedCall(List<SerpYahooOrganicLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/yahoo/organic/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call yahooOrganicLiveAdvancedValidateBeforeCall(List<SerpYahooOrganicLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return yahooOrganicLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpYahooOrganicLiveAdvancedResponseInfo yahooOrganicLiveAdvanced(List<SerpYahooOrganicLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYahooOrganicLiveAdvancedResponseInfo> localVarResp = yahooOrganicLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYahooOrganicLiveAdvancedResponseInfo> yahooOrganicLiveAdvancedWithHttpInfo(List<SerpYahooOrganicLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = yahooOrganicLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call yahooOrganicLiveAdvancedAsync(List<SerpYahooOrganicLiveAdvancedRequestInfo> payload, final ApiCallback<SerpYahooOrganicLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = yahooOrganicLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call yahooOrganicLiveHtmlCall(List<SerpYahooOrganicLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/yahoo/organic/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call yahooOrganicLiveHtmlValidateBeforeCall(List<SerpYahooOrganicLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return yahooOrganicLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpYahooOrganicLiveHtmlResponseInfo yahooOrganicLiveHtml(List<SerpYahooOrganicLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpYahooOrganicLiveHtmlResponseInfo> localVarResp = yahooOrganicLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpYahooOrganicLiveHtmlResponseInfo> yahooOrganicLiveHtmlWithHttpInfo(List<SerpYahooOrganicLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = yahooOrganicLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call yahooOrganicLiveHtmlAsync(List<SerpYahooOrganicLiveHtmlRequestInfo> payload, final ApiCallback<SerpYahooOrganicLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = yahooOrganicLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpYahooOrganicLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call baiduLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/baidu/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return baiduLocationsCall(_callback);

    }

    public SerpBaiduLocationsResponseInfo baiduLocations() throws ApiException {
       ApiResponse<SerpBaiduLocationsResponseInfo> localVarResp = baiduLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduLocationsResponseInfo> baiduLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = baiduLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBaiduLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduLocationsAsync(final ApiCallback<SerpBaiduLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBaiduLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/baidu/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling baiduLocationsCountry(Async)");
       }

       return baiduLocationsCountryCall(country, _callback);

    }

    public SerpBaiduLocationsCountryResponseInfo baiduLocationsCountry(String country) throws ApiException {
       ApiResponse<SerpBaiduLocationsCountryResponseInfo> localVarResp = baiduLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduLocationsCountryResponseInfo> baiduLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = baiduLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<SerpBaiduLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduLocationsCountryAsync(String country, final ApiCallback<SerpBaiduLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<SerpBaiduLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/baidu/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return baiduLanguagesCall(_callback);

    }

    public SerpBaiduLanguagesResponseInfo baiduLanguages() throws ApiException {
       ApiResponse<SerpBaiduLanguagesResponseInfo> localVarResp = baiduLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduLanguagesResponseInfo> baiduLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = baiduLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBaiduLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduLanguagesAsync(final ApiCallback<SerpBaiduLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBaiduLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduOrganicTaskPostCall(List<SerpBaiduOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/baidu/organic/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call baiduOrganicTaskPostValidateBeforeCall(List<SerpBaiduOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return baiduOrganicTaskPostCall(payload, _callback);
 
        }
 
        public SerpBaiduOrganicTaskPostResponseInfo baiduOrganicTaskPost(List<SerpBaiduOrganicTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpBaiduOrganicTaskPostResponseInfo> localVarResp = baiduOrganicTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpBaiduOrganicTaskPostResponseInfo> baiduOrganicTaskPostWithHttpInfo(List<SerpBaiduOrganicTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = baiduOrganicTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call baiduOrganicTaskPostAsync(List<SerpBaiduOrganicTaskPostRequestInfo> payload, final ApiCallback<SerpBaiduOrganicTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = baiduOrganicTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call baiduOrganicTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/baidu/organic/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduOrganicTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return baiduOrganicTasksReadyCall(_callback);

    }

    public SerpBaiduOrganicTasksReadyResponseInfo baiduOrganicTasksReady() throws ApiException {
       ApiResponse<SerpBaiduOrganicTasksReadyResponseInfo> localVarResp = baiduOrganicTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduOrganicTasksReadyResponseInfo> baiduOrganicTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = baiduOrganicTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduOrganicTasksReadyAsync(final ApiCallback<SerpBaiduOrganicTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduOrganicTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduOrganicTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/baidu/organic/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduOrganicTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return baiduOrganicTasksFixedCall(_callback);

    }

    public SerpBaiduOrganicTasksFixedResponseInfo baiduOrganicTasksFixed() throws ApiException {
       ApiResponse<SerpBaiduOrganicTasksFixedResponseInfo> localVarResp = baiduOrganicTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduOrganicTasksFixedResponseInfo> baiduOrganicTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = baiduOrganicTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduOrganicTasksFixedAsync(final ApiCallback<SerpBaiduOrganicTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduOrganicTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduOrganicTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/baidu/organic/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduOrganicTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling baiduOrganicTaskGetRegular(Async)");
       }

       return baiduOrganicTaskGetRegularCall(id, _callback);

    }

    public SerpBaiduOrganicTaskGetRegularResponseInfo baiduOrganicTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpBaiduOrganicTaskGetRegularResponseInfo> localVarResp = baiduOrganicTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduOrganicTaskGetRegularResponseInfo> baiduOrganicTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = baiduOrganicTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduOrganicTaskGetRegularAsync(String id, final ApiCallback<SerpBaiduOrganicTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduOrganicTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduOrganicTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/baidu/organic/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduOrganicTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling baiduOrganicTaskGetAdvanced(Async)");
       }

       return baiduOrganicTaskGetAdvancedCall(id, _callback);

    }

    public SerpBaiduOrganicTaskGetAdvancedResponseInfo baiduOrganicTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpBaiduOrganicTaskGetAdvancedResponseInfo> localVarResp = baiduOrganicTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduOrganicTaskGetAdvancedResponseInfo> baiduOrganicTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = baiduOrganicTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduOrganicTaskGetAdvancedAsync(String id, final ApiCallback<SerpBaiduOrganicTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduOrganicTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call baiduOrganicTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/baidu/organic/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call baiduOrganicTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling baiduOrganicTaskGetHtml(Async)");
       }

       return baiduOrganicTaskGetHtmlCall(id, _callback);

    }

    public SerpBaiduOrganicTaskGetHtmlResponseInfo baiduOrganicTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpBaiduOrganicTaskGetHtmlResponseInfo> localVarResp = baiduOrganicTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpBaiduOrganicTaskGetHtmlResponseInfo> baiduOrganicTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = baiduOrganicTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call baiduOrganicTaskGetHtmlAsync(String id, final ApiCallback<SerpBaiduOrganicTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = baiduOrganicTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpBaiduOrganicTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call naverOrganicTaskPostCall(List<SerpNaverOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/naver/organic/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call naverOrganicTaskPostValidateBeforeCall(List<SerpNaverOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return naverOrganicTaskPostCall(payload, _callback);
 
        }
 
        public SerpNaverOrganicTaskPostResponseInfo naverOrganicTaskPost(List<SerpNaverOrganicTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpNaverOrganicTaskPostResponseInfo> localVarResp = naverOrganicTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpNaverOrganicTaskPostResponseInfo> naverOrganicTaskPostWithHttpInfo(List<SerpNaverOrganicTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = naverOrganicTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call naverOrganicTaskPostAsync(List<SerpNaverOrganicTaskPostRequestInfo> payload, final ApiCallback<SerpNaverOrganicTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = naverOrganicTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call naverOrganicTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/naver/organic/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call naverOrganicTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return naverOrganicTasksReadyCall(_callback);

    }

    public SerpNaverOrganicTasksReadyResponseInfo naverOrganicTasksReady() throws ApiException {
       ApiResponse<SerpNaverOrganicTasksReadyResponseInfo> localVarResp = naverOrganicTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpNaverOrganicTasksReadyResponseInfo> naverOrganicTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = naverOrganicTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call naverOrganicTasksReadyAsync(final ApiCallback<SerpNaverOrganicTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = naverOrganicTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call naverOrganicTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/naver/organic/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call naverOrganicTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return naverOrganicTasksFixedCall(_callback);

    }

    public SerpNaverOrganicTasksFixedResponseInfo naverOrganicTasksFixed() throws ApiException {
       ApiResponse<SerpNaverOrganicTasksFixedResponseInfo> localVarResp = naverOrganicTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpNaverOrganicTasksFixedResponseInfo> naverOrganicTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = naverOrganicTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call naverOrganicTasksFixedAsync(final ApiCallback<SerpNaverOrganicTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = naverOrganicTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call naverOrganicTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/naver/organic/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call naverOrganicTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling naverOrganicTaskGetRegular(Async)");
       }

       return naverOrganicTaskGetRegularCall(id, _callback);

    }

    public SerpNaverOrganicTaskGetRegularResponseInfo naverOrganicTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpNaverOrganicTaskGetRegularResponseInfo> localVarResp = naverOrganicTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpNaverOrganicTaskGetRegularResponseInfo> naverOrganicTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = naverOrganicTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call naverOrganicTaskGetRegularAsync(String id, final ApiCallback<SerpNaverOrganicTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = naverOrganicTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call naverOrganicTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/naver/organic/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call naverOrganicTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling naverOrganicTaskGetAdvanced(Async)");
       }

       return naverOrganicTaskGetAdvancedCall(id, _callback);

    }

    public SerpNaverOrganicTaskGetAdvancedResponseInfo naverOrganicTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpNaverOrganicTaskGetAdvancedResponseInfo> localVarResp = naverOrganicTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpNaverOrganicTaskGetAdvancedResponseInfo> naverOrganicTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = naverOrganicTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call naverOrganicTaskGetAdvancedAsync(String id, final ApiCallback<SerpNaverOrganicTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = naverOrganicTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call naverOrganicTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/naver/organic/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call naverOrganicTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling naverOrganicTaskGetHtml(Async)");
       }

       return naverOrganicTaskGetHtmlCall(id, _callback);

    }

    public SerpNaverOrganicTaskGetHtmlResponseInfo naverOrganicTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpNaverOrganicTaskGetHtmlResponseInfo> localVarResp = naverOrganicTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpNaverOrganicTaskGetHtmlResponseInfo> naverOrganicTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = naverOrganicTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call naverOrganicTaskGetHtmlAsync(String id, final ApiCallback<SerpNaverOrganicTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = naverOrganicTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpNaverOrganicTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamLocationsCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/seznam/locations";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamLocationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return seznamLocationsCall(_callback);

    }

    public SerpSeznamLocationsResponseInfo seznamLocations() throws ApiException {
       ApiResponse<SerpSeznamLocationsResponseInfo> localVarResp = seznamLocationsWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamLocationsResponseInfo> seznamLocationsWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = seznamLocationsValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpSeznamLocationsResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamLocationsAsync(final ApiCallback<SerpSeznamLocationsResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamLocationsValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpSeznamLocationsResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamLocationsCountryCall( String country,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/seznam/locations/{country}".replace("{" + "country" + "}", localVarApiClient.escapeString(country.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamLocationsCountryValidateBeforeCall(String country, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'country' is set
       if (country == null) {
           throw new ApiException("Missing the required parameter 'country' when calling seznamLocationsCountry(Async)");
       }

       return seznamLocationsCountryCall(country, _callback);

    }

    public SerpSeznamLocationsCountryResponseInfo seznamLocationsCountry(String country) throws ApiException {
       ApiResponse<SerpSeznamLocationsCountryResponseInfo> localVarResp = seznamLocationsCountryWithHttpInfo(country);
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamLocationsCountryResponseInfo> seznamLocationsCountryWithHttpInfo(String country) throws ApiException {
       okhttp3.Call localVarCall = seznamLocationsCountryValidateBeforeCall(country, null);
       Type localVarReturnType = new TypeToken<SerpSeznamLocationsCountryResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamLocationsCountryAsync(String country, final ApiCallback<SerpSeznamLocationsCountryResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamLocationsCountryValidateBeforeCall(country, _callback);
       Type localVarReturnType = new TypeToken<SerpSeznamLocationsCountryResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamLanguagesCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/seznam/languages";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamLanguagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return seznamLanguagesCall(_callback);

    }

    public SerpSeznamLanguagesResponseInfo seznamLanguages() throws ApiException {
       ApiResponse<SerpSeznamLanguagesResponseInfo> localVarResp = seznamLanguagesWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamLanguagesResponseInfo> seznamLanguagesWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = seznamLanguagesValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpSeznamLanguagesResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamLanguagesAsync(final ApiCallback<SerpSeznamLanguagesResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamLanguagesValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpSeznamLanguagesResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamOrganicTaskPostCall(List<SerpSeznamOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/seznam/organic/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call seznamOrganicTaskPostValidateBeforeCall(List<SerpSeznamOrganicTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return seznamOrganicTaskPostCall(payload, _callback);
 
        }
 
        public SerpSeznamOrganicTaskPostResponseInfo seznamOrganicTaskPost(List<SerpSeznamOrganicTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpSeznamOrganicTaskPostResponseInfo> localVarResp = seznamOrganicTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpSeznamOrganicTaskPostResponseInfo> seznamOrganicTaskPostWithHttpInfo(List<SerpSeznamOrganicTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = seznamOrganicTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call seznamOrganicTaskPostAsync(List<SerpSeznamOrganicTaskPostRequestInfo> payload, final ApiCallback<SerpSeznamOrganicTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = seznamOrganicTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call seznamOrganicTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/seznam/organic/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamOrganicTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return seznamOrganicTasksReadyCall(_callback);

    }

    public SerpSeznamOrganicTasksReadyResponseInfo seznamOrganicTasksReady() throws ApiException {
       ApiResponse<SerpSeznamOrganicTasksReadyResponseInfo> localVarResp = seznamOrganicTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamOrganicTasksReadyResponseInfo> seznamOrganicTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = seznamOrganicTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamOrganicTasksReadyAsync(final ApiCallback<SerpSeznamOrganicTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamOrganicTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamOrganicTasksFixedCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/seznam/organic/tasks_fixed";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamOrganicTasksFixedValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return seznamOrganicTasksFixedCall(_callback);

    }

    public SerpSeznamOrganicTasksFixedResponseInfo seznamOrganicTasksFixed() throws ApiException {
       ApiResponse<SerpSeznamOrganicTasksFixedResponseInfo> localVarResp = seznamOrganicTasksFixedWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamOrganicTasksFixedResponseInfo> seznamOrganicTasksFixedWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = seznamOrganicTasksFixedValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTasksFixedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamOrganicTasksFixedAsync(final ApiCallback<SerpSeznamOrganicTasksFixedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamOrganicTasksFixedValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTasksFixedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamOrganicTaskGetRegularCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/seznam/organic/task_get/regular/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamOrganicTaskGetRegularValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling seznamOrganicTaskGetRegular(Async)");
       }

       return seznamOrganicTaskGetRegularCall(id, _callback);

    }

    public SerpSeznamOrganicTaskGetRegularResponseInfo seznamOrganicTaskGetRegular(String id) throws ApiException {
       ApiResponse<SerpSeznamOrganicTaskGetRegularResponseInfo> localVarResp = seznamOrganicTaskGetRegularWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamOrganicTaskGetRegularResponseInfo> seznamOrganicTaskGetRegularWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = seznamOrganicTaskGetRegularValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskGetRegularResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamOrganicTaskGetRegularAsync(String id, final ApiCallback<SerpSeznamOrganicTaskGetRegularResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamOrganicTaskGetRegularValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskGetRegularResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamOrganicTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/seznam/organic/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamOrganicTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling seznamOrganicTaskGetAdvanced(Async)");
       }

       return seznamOrganicTaskGetAdvancedCall(id, _callback);

    }

    public SerpSeznamOrganicTaskGetAdvancedResponseInfo seznamOrganicTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpSeznamOrganicTaskGetAdvancedResponseInfo> localVarResp = seznamOrganicTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamOrganicTaskGetAdvancedResponseInfo> seznamOrganicTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = seznamOrganicTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamOrganicTaskGetAdvancedAsync(String id, final ApiCallback<SerpSeznamOrganicTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamOrganicTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call seznamOrganicTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/seznam/organic/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call seznamOrganicTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling seznamOrganicTaskGetHtml(Async)");
       }

       return seznamOrganicTaskGetHtmlCall(id, _callback);

    }

    public SerpSeznamOrganicTaskGetHtmlResponseInfo seznamOrganicTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpSeznamOrganicTaskGetHtmlResponseInfo> localVarResp = seznamOrganicTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpSeznamOrganicTaskGetHtmlResponseInfo> seznamOrganicTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = seznamOrganicTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call seznamOrganicTaskGetHtmlAsync(String id, final ApiCallback<SerpSeznamOrganicTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = seznamOrganicTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpSeznamOrganicTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceExploreTaskPostCall(List<SerpGoogleFinanceExploreTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_explore/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceExploreTaskPostValidateBeforeCall(List<SerpGoogleFinanceExploreTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceExploreTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceExploreTaskPostResponseInfo googleFinanceExploreTaskPost(List<SerpGoogleFinanceExploreTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceExploreTaskPostResponseInfo> localVarResp = googleFinanceExploreTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceExploreTaskPostResponseInfo> googleFinanceExploreTaskPostWithHttpInfo(List<SerpGoogleFinanceExploreTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceExploreTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceExploreTaskPostAsync(List<SerpGoogleFinanceExploreTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleFinanceExploreTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceExploreTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceExploreTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/finance_explore/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceExploreTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleFinanceExploreTasksReadyCall(_callback);

    }

    public SerpGoogleFinanceExploreTasksReadyResponseInfo googleFinanceExploreTasksReady() throws ApiException {
       ApiResponse<SerpGoogleFinanceExploreTasksReadyResponseInfo> localVarResp = googleFinanceExploreTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceExploreTasksReadyResponseInfo> googleFinanceExploreTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleFinanceExploreTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceExploreTasksReadyAsync(final ApiCallback<SerpGoogleFinanceExploreTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceExploreTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceExploreTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_explore/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceExploreTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceExploreTaskGetAdvanced(Async)");
       }

       return googleFinanceExploreTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo googleFinanceExploreTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo> localVarResp = googleFinanceExploreTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo> googleFinanceExploreTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceExploreTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceExploreTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceExploreTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceExploreTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_explore/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceExploreTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceExploreTaskGetHtml(Async)");
       }

       return googleFinanceExploreTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleFinanceExploreTaskGetHtmlResponseInfo googleFinanceExploreTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceExploreTaskGetHtmlResponseInfo> localVarResp = googleFinanceExploreTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceExploreTaskGetHtmlResponseInfo> googleFinanceExploreTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceExploreTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceExploreTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleFinanceExploreTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceExploreTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceExploreLiveAdvancedCall(List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_explore/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceExploreLiveAdvancedValidateBeforeCall(List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceExploreLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceExploreLiveAdvancedResponseInfo googleFinanceExploreLiveAdvanced(List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceExploreLiveAdvancedResponseInfo> localVarResp = googleFinanceExploreLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceExploreLiveAdvancedResponseInfo> googleFinanceExploreLiveAdvancedWithHttpInfo(List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceExploreLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceExploreLiveAdvancedAsync(List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleFinanceExploreLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceExploreLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceExploreLiveHtmlCall(List<SerpGoogleFinanceExploreLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_explore/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceExploreLiveHtmlValidateBeforeCall(List<SerpGoogleFinanceExploreLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceExploreLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceExploreLiveHtmlResponseInfo googleFinanceExploreLiveHtml(List<SerpGoogleFinanceExploreLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceExploreLiveHtmlResponseInfo> localVarResp = googleFinanceExploreLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceExploreLiveHtmlResponseInfo> googleFinanceExploreLiveHtmlWithHttpInfo(List<SerpGoogleFinanceExploreLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceExploreLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceExploreLiveHtmlAsync(List<SerpGoogleFinanceExploreLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleFinanceExploreLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceExploreLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceExploreLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceMarketsTaskPostCall(List<SerpGoogleFinanceMarketsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_markets/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceMarketsTaskPostValidateBeforeCall(List<SerpGoogleFinanceMarketsTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceMarketsTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceMarketsTaskPostResponseInfo googleFinanceMarketsTaskPost(List<SerpGoogleFinanceMarketsTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceMarketsTaskPostResponseInfo> localVarResp = googleFinanceMarketsTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceMarketsTaskPostResponseInfo> googleFinanceMarketsTaskPostWithHttpInfo(List<SerpGoogleFinanceMarketsTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceMarketsTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceMarketsTaskPostAsync(List<SerpGoogleFinanceMarketsTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleFinanceMarketsTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceMarketsTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceMarketsTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/finance_markets/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceMarketsTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleFinanceMarketsTasksReadyCall(_callback);

    }

    public SerpGoogleFinanceMarketsTasksReadyResponseInfo googleFinanceMarketsTasksReady() throws ApiException {
       ApiResponse<SerpGoogleFinanceMarketsTasksReadyResponseInfo> localVarResp = googleFinanceMarketsTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceMarketsTasksReadyResponseInfo> googleFinanceMarketsTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleFinanceMarketsTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceMarketsTasksReadyAsync(final ApiCallback<SerpGoogleFinanceMarketsTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceMarketsTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceMarketsTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_markets/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceMarketsTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceMarketsTaskGetAdvanced(Async)");
       }

       return googleFinanceMarketsTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo googleFinanceMarketsTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo> localVarResp = googleFinanceMarketsTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo> googleFinanceMarketsTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceMarketsTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceMarketsTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceMarketsTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceMarketsTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_markets/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceMarketsTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceMarketsTaskGetHtml(Async)");
       }

       return googleFinanceMarketsTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo googleFinanceMarketsTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo> localVarResp = googleFinanceMarketsTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo> googleFinanceMarketsTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceMarketsTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceMarketsTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceMarketsTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceMarketsLiveAdvancedCall(List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_markets/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceMarketsLiveAdvancedValidateBeforeCall(List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceMarketsLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceMarketsLiveAdvancedResponseInfo googleFinanceMarketsLiveAdvanced(List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceMarketsLiveAdvancedResponseInfo> localVarResp = googleFinanceMarketsLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceMarketsLiveAdvancedResponseInfo> googleFinanceMarketsLiveAdvancedWithHttpInfo(List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceMarketsLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceMarketsLiveAdvancedAsync(List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleFinanceMarketsLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceMarketsLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceMarketsLiveHtmlCall(List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_markets/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceMarketsLiveHtmlValidateBeforeCall(List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceMarketsLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceMarketsLiveHtmlResponseInfo googleFinanceMarketsLiveHtml(List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceMarketsLiveHtmlResponseInfo> localVarResp = googleFinanceMarketsLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceMarketsLiveHtmlResponseInfo> googleFinanceMarketsLiveHtmlWithHttpInfo(List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceMarketsLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceMarketsLiveHtmlAsync(List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleFinanceMarketsLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceMarketsLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceMarketsLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceQuoteTaskPostCall(List<SerpGoogleFinanceQuoteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_quote/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceQuoteTaskPostValidateBeforeCall(List<SerpGoogleFinanceQuoteTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceQuoteTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceQuoteTaskPostResponseInfo googleFinanceQuoteTaskPost(List<SerpGoogleFinanceQuoteTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceQuoteTaskPostResponseInfo> localVarResp = googleFinanceQuoteTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceQuoteTaskPostResponseInfo> googleFinanceQuoteTaskPostWithHttpInfo(List<SerpGoogleFinanceQuoteTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceQuoteTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceQuoteTaskPostAsync(List<SerpGoogleFinanceQuoteTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleFinanceQuoteTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceQuoteTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceQuoteTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/finance_quote/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceQuoteTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleFinanceQuoteTasksReadyCall(_callback);

    }

    public SerpGoogleFinanceQuoteTasksReadyResponseInfo googleFinanceQuoteTasksReady() throws ApiException {
       ApiResponse<SerpGoogleFinanceQuoteTasksReadyResponseInfo> localVarResp = googleFinanceQuoteTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceQuoteTasksReadyResponseInfo> googleFinanceQuoteTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleFinanceQuoteTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceQuoteTasksReadyAsync(final ApiCallback<SerpGoogleFinanceQuoteTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceQuoteTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceQuoteTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_quote/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceQuoteTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceQuoteTaskGetAdvanced(Async)");
       }

       return googleFinanceQuoteTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo googleFinanceQuoteTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo> localVarResp = googleFinanceQuoteTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo> googleFinanceQuoteTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceQuoteTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceQuoteTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceQuoteTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceQuoteTaskGetHtmlCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_quote/task_get/html/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceQuoteTaskGetHtmlValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceQuoteTaskGetHtml(Async)");
       }

       return googleFinanceQuoteTaskGetHtmlCall(id, _callback);

    }

    public SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo googleFinanceQuoteTaskGetHtml(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo> localVarResp = googleFinanceQuoteTaskGetHtmlWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo> googleFinanceQuoteTaskGetHtmlWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceQuoteTaskGetHtmlValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceQuoteTaskGetHtmlAsync(String id, final ApiCallback<SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceQuoteTaskGetHtmlValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceQuoteLiveAdvancedCall(List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_quote/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceQuoteLiveAdvancedValidateBeforeCall(List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceQuoteLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceQuoteLiveAdvancedResponseInfo googleFinanceQuoteLiveAdvanced(List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceQuoteLiveAdvancedResponseInfo> localVarResp = googleFinanceQuoteLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceQuoteLiveAdvancedResponseInfo> googleFinanceQuoteLiveAdvancedWithHttpInfo(List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceQuoteLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceQuoteLiveAdvancedAsync(List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleFinanceQuoteLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceQuoteLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceQuoteLiveHtmlCall(List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_quote/live/html";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceQuoteLiveHtmlValidateBeforeCall(List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceQuoteLiveHtmlCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceQuoteLiveHtmlResponseInfo googleFinanceQuoteLiveHtml(List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceQuoteLiveHtmlResponseInfo> localVarResp = googleFinanceQuoteLiveHtmlWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceQuoteLiveHtmlResponseInfo> googleFinanceQuoteLiveHtmlWithHttpInfo(List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceQuoteLiveHtmlValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteLiveHtmlResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceQuoteLiveHtmlAsync(List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo> payload, final ApiCallback<SerpGoogleFinanceQuoteLiveHtmlResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceQuoteLiveHtmlValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceQuoteLiveHtmlResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceTickerSearchTaskPostCall(List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_ticker_search/task_post";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceTickerSearchTaskPostValidateBeforeCall(List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceTickerSearchTaskPostCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceTickerSearchTaskPostResponseInfo googleFinanceTickerSearchTaskPost(List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceTickerSearchTaskPostResponseInfo> localVarResp = googleFinanceTickerSearchTaskPostWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceTickerSearchTaskPostResponseInfo> googleFinanceTickerSearchTaskPostWithHttpInfo(List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceTickerSearchTaskPostValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchTaskPostResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceTickerSearchTaskPostAsync(List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo> payload, final ApiCallback<SerpGoogleFinanceTickerSearchTaskPostResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceTickerSearchTaskPostValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchTaskPostResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }

    public okhttp3.Call googleFinanceTickerSearchTasksReadyCall( final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
          String localVarPath = "/v3/serp/google/finance_ticker_search/tasks_ready";
   

       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceTickerSearchTasksReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {

       return googleFinanceTickerSearchTasksReadyCall(_callback);

    }

    public SerpGoogleFinanceTickerSearchTasksReadyResponseInfo googleFinanceTickerSearchTasksReady() throws ApiException {
       ApiResponse<SerpGoogleFinanceTickerSearchTasksReadyResponseInfo> localVarResp = googleFinanceTickerSearchTasksReadyWithHttpInfo();
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceTickerSearchTasksReadyResponseInfo> googleFinanceTickerSearchTasksReadyWithHttpInfo() throws ApiException {
       okhttp3.Call localVarCall = googleFinanceTickerSearchTasksReadyValidateBeforeCall(null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchTasksReadyResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceTickerSearchTasksReadyAsync(final ApiCallback<SerpGoogleFinanceTickerSearchTasksReadyResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceTickerSearchTasksReadyValidateBeforeCall(_callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchTasksReadyResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceTickerSearchTaskGetAdvancedCall( String id,  final ApiCallback _callback) throws ApiException {
       String basePath = null;
       // Operation Servers
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
   
       String localVarPath = "/v3/serp/google/finance_ticker_search/task_get/advanced/{id}".replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));


       List<Pair> localVarQueryParams = new ArrayList<Pair>();
       List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
       Map<String, String> localVarHeaderParams = new HashMap<String, String>();
       Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    private okhttp3.Call googleFinanceTickerSearchTaskGetAdvancedValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
       // verify the required parameter 'id' is set
       if (id == null) {
           throw new ApiException("Missing the required parameter 'id' when calling googleFinanceTickerSearchTaskGetAdvanced(Async)");
       }

       return googleFinanceTickerSearchTaskGetAdvancedCall(id, _callback);

    }

    public SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo googleFinanceTickerSearchTaskGetAdvanced(String id) throws ApiException {
       ApiResponse<SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo> localVarResp = googleFinanceTickerSearchTaskGetAdvancedWithHttpInfo(id);
       return localVarResp.getData();
    }

    public ApiResponse<SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo> googleFinanceTickerSearchTaskGetAdvancedWithHttpInfo(String id) throws ApiException {
       okhttp3.Call localVarCall = googleFinanceTickerSearchTaskGetAdvancedValidateBeforeCall(id, null);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo>(){}.getType();
       return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public okhttp3.Call googleFinanceTickerSearchTaskGetAdvancedAsync(String id, final ApiCallback<SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo> _callback) throws ApiException {

       okhttp3.Call localVarCall = googleFinanceTickerSearchTaskGetAdvancedValidateBeforeCall(id, _callback);
       Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo>(){}.getType();
       localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
       return localVarCall;
    }

    public okhttp3.Call googleFinanceTickerSearchLiveAdvancedCall(List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
           String basePath = null;
           // Operation Servers
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
           String localVarPath = "/v3/serp/google/finance_ticker_search/live/advanced";

           List<Pair> localVarQueryParams = new ArrayList<Pair>();
           List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
           Map<String, String> localVarHeaderParams = new HashMap<String, String>();
           Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        private okhttp3.Call googleFinanceTickerSearchLiveAdvancedValidateBeforeCall(List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo> payload, final ApiCallback _callback) throws ApiException {
            return googleFinanceTickerSearchLiveAdvancedCall(payload, _callback);
 
        }
 
        public SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo googleFinanceTickerSearchLiveAdvanced(List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo> payload) throws ApiException {
            ApiResponse<SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo> localVarResp = googleFinanceTickerSearchLiveAdvancedWithHttpInfo(payload);
            return localVarResp.getData();
        }
 
        public ApiResponse<SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo> googleFinanceTickerSearchLiveAdvancedWithHttpInfo(List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo> payload) throws ApiException {
            okhttp3.Call localVarCall = googleFinanceTickerSearchLiveAdvancedValidateBeforeCall(payload, null);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        }
 
        public okhttp3.Call googleFinanceTickerSearchLiveAdvancedAsync(List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo> payload, final ApiCallback<SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo> _callback) throws ApiException {
 
            okhttp3.Call localVarCall = googleFinanceTickerSearchLiveAdvancedValidateBeforeCall(payload, _callback);
            Type localVarReturnType = new TypeToken<SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo>(){}.getType();
            localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
        }


}