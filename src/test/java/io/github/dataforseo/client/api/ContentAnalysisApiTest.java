/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.api;

import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.model.ContentAnalysisAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisCategoriesResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisIdListRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisIdListResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisLanguagesResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisLocationsResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisSearchLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisSearchLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveResponseInfo;
import io.github.dataforseo.client.model.ContentAnalysisSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.ContentAnalysisSummaryLiveResponseInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentAnalysisApi
 */
@Disabled
public class ContentAnalysisApiTest {

    private final ContentAnalysisApi api = new ContentAnalysisApi();

    /**
     * ‌ This endpoint will provide you with data on all citations in the target category for the indicated date range. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/category_trends/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void categoryTrendsLiveTest() throws ApiException {
        List<ContentAnalysisCategoryTrendsLiveRequestInfo> contentAnalysisCategoryTrendsLiveRequestInfo = null;
        ContentAnalysisCategoryTrendsLiveResponseInfo response = api.categoryTrendsLive(contentAnalysisCategoryTrendsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ Here you will find all the necessary information about filters that can be used with Content Analysis API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/filters/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void contentAnalysisAvailableFiltersTest() throws ApiException {
        ContentAnalysisAvailableFiltersResponseInfo response = api.contentAnalysisAvailableFilters();
        // TODO: test validations
    }

    /**
     * We use Google product and service categories. This endpoint will provide you with the full list of available categories. You can also download the CSV file by this link. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/categories/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void contentAnalysisCategoriesTest() throws ApiException {
        ContentAnalysisCategoriesResponseInfo response = api.contentAnalysisCategories();
        // TODO: test validations
    }

    /**
     * This endpoint is designed to provide you with the list of IDs and metadata of the completed Content Analysis tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/id_list/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void contentAnalysisIdListTest() throws ApiException {
        List<ContentAnalysisIdListRequestInfo> contentAnalysisIdListRequestInfo = null;
        ContentAnalysisIdListResponseInfo response = api.contentAnalysisIdList(contentAnalysisIdListRequestInfo);
        // TODO: test validations
    }

    /**
     * You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/languages/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void contentAnalysisLanguagesTest() throws ApiException {
        ContentAnalysisLanguagesResponseInfo response = api.contentAnalysisLanguages();
        // TODO: test validations
    }

    /**
     * You will receive the list of locations by this API call. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/locations/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void contentAnalysisLocationsTest() throws ApiException {
        ContentAnalysisLocationsResponseInfo response = api.contentAnalysisLocations();
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with an overview of citation data available for the target keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void contentAnalysisSummaryLiveTest() throws ApiException {
        List<ContentAnalysisSummaryLiveRequestInfo> contentAnalysisSummaryLiveRequestInfo = null;
        ContentAnalysisSummaryLiveResponseInfo response = api.contentAnalysisSummaryLive(contentAnalysisSummaryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with data on all citations of the target keyword for the indicated date range. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/phrase_trends/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void phraseTrendsLiveTest() throws ApiException {
        List<ContentAnalysisPhraseTrendsLiveRequestInfo> contentAnalysisPhraseTrendsLiveRequestInfo = null;
        ContentAnalysisPhraseTrendsLiveResponseInfo response = api.phraseTrendsLive(contentAnalysisPhraseTrendsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with rating distribution data for the keyword and other parameters specified in the request. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/rating_distribution/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ratingDistributionLiveTest() throws ApiException {
        List<ContentAnalysisRatingDistributionLiveRequestInfo> contentAnalysisRatingDistributionLiveRequestInfo = null;
        ContentAnalysisRatingDistributionLiveResponseInfo response = api.ratingDistributionLive(contentAnalysisRatingDistributionLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with detailed citation data available for the target keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/search/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchLiveTest() throws ApiException {
        List<ContentAnalysisSearchLiveRequestInfo> contentAnalysisSearchLiveRequestInfo = null;
        ContentAnalysisSearchLiveResponseInfo response = api.searchLive(contentAnalysisSearchLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with sentiment analysis data for the citations available for the target keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/sentiment_analysis/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sentimentAnalysisLiveTest() throws ApiException {
        List<ContentAnalysisSentimentAnalysisLiveRequestInfo> contentAnalysisSentimentAnalysisLiveRequestInfo = null;
        ContentAnalysisSentimentAnalysisLiveResponseInfo response = api.sentimentAnalysisLive(contentAnalysisSentimentAnalysisLiveRequestInfo);
        // TODO: test validations
    }

}
