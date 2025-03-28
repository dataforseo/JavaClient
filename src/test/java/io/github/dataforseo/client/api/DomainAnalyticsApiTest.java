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
import io.github.dataforseo.client.model.DomainAnalyticsErrorsRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsErrorsResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsIdListRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsIdListResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLanguagesResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLocationsResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsWhoisAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveRequestInfo;
import io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveResponseInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainAnalyticsApi
 */
@Disabled
public class DomainAnalyticsApiTest {

    private final DomainAnalyticsApi api = new DomainAnalyticsApi();

    /**
     * By calling this endpoint you will receive information about the Domain Analytics API tasks that returned an error within the past 7 days. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/errors/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainAnalyticsErrorsTest() throws ApiException {
        List<DomainAnalyticsErrorsRequestInfo> domainAnalyticsErrorsRequestInfo = null;
        DomainAnalyticsErrorsResponseInfo response = api.domainAnalyticsErrors(domainAnalyticsErrorsRequestInfo);
        // TODO: test validations
    }

    /**
     * This endpoint is designed to provide you with the list of IDs and metadata of the completed Domain Analytics tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/id_list/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainAnalyticsIdListTest() throws ApiException {
        List<DomainAnalyticsIdListRequestInfo> domainAnalyticsIdListRequestInfo = null;
        DomainAnalyticsIdListResponseInfo response = api.domainAnalyticsIdList(domainAnalyticsIdListRequestInfo);
        // TODO: test validations
    }

    /**
     * You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/languages/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainAnalyticsTechnologiesLanguagesTest() throws ApiException {
        DomainAnalyticsTechnologiesLanguagesResponseInfo response = api.domainAnalyticsTechnologiesLanguages();
        // TODO: test validations
    }

    /**
     * You will receive the list of locations by this API call. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/locations/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainAnalyticsTechnologiesLocationsTest() throws ApiException {
        DomainAnalyticsTechnologiesLocationsResponseInfo response = api.domainAnalyticsTechnologiesLocations();
        // TODO: test validations
    }

    /**
     * ‌‌ The Aggregation Technologies endpoint will provide you with a list of the most popular technologies websites use alongside the technologies you specify. Alternatively, you can specify technology categories or groups to obtain wider stats. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/aggregation_technologies/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesAggregationTechnologiesLiveTest() throws ApiException {
        List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo = null;
        DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo response = api.technologiesAggregationTechnologiesLive(domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ Here you will find all the necessary information about filters that can be used with Domain Analytics Technologies API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/filters/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesAvailableFiltersTest() throws ApiException {
        DomainAnalyticsTechnologiesAvailableFiltersResponseInfo response = api.technologiesAvailableFilters();
        // TODO: test validations
    }

    /**
     * ‌‌ Using this endpoint you will get a list of technologies used in a particular domain. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/domain_technologies/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesDomainTechnologiesLiveTest() throws ApiException {
        List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> domainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo = null;
        DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo response = api.technologiesDomainTechnologiesLive(domainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ This endpoint provides domains based on the HTML terms they use on their homepage. In addition to the list of domains, you will also get their technology profiles, the country and language they belong to, and other related data. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/domains_by_html_terms/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesDomainsByHtmlTermsLiveTest() throws ApiException {
        List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo = null;
        DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo response = api.technologiesDomainsByHtmlTermsLive(domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ This endpoint provides domains based on the technology they use. In addition to the list of domains, you will also get their technology profiles, the country and language they belong to, and other related data. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/domains_by_technology/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesDomainsByTechnologyLiveTest() throws ApiException {
        List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo = null;
        DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo response = api.technologiesDomainsByTechnologyLive(domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * This endpoint will provide you with the full list of available technologies structured by technology groups and categories each particular technology belongs to. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/technologies/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesTechnologiesTest() throws ApiException {
        DomainAnalyticsTechnologiesTechnologiesResponseInfo response = api.technologiesTechnologies();
        // TODO: test validations
    }

    /**
     * ‌‌ The Technologies Summary endpoint will provide you with the number of domains across different countries and languages that use the specified technology names, technology groups, or technology categories. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/technologies_summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesTechnologiesSummaryLiveTest() throws ApiException {
        List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo = null;
        DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo response = api.technologiesTechnologiesSummaryLive(domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ The Technology Stats endpoint will provide you with historical data on the number of domains across different countries and languages that use the specified technology. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/technology_stats/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void technologiesTechnologyStatsLiveTest() throws ApiException {
        List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> domainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo = null;
        DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo response = api.technologiesTechnologyStatsLive(domainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ Here you will find all the necessary information about filters that can be used with Domain Analytics Whois API. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/whois/filters/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void whoisAvailableFiltersTest() throws ApiException {
        DomainAnalyticsWhoisAvailableFiltersResponseInfo response = api.whoisAvailableFilters();
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with Whois data enriched with backlink stats, and ranking and traffic info from organic and paid search results. Using this endpoint you will be able to get all these data for the domains matching the parameters you specify in the request. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/whois/overview/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void whoisOverviewLiveTest() throws ApiException {
        List<DomainAnalyticsWhoisOverviewLiveRequestInfo> domainAnalyticsWhoisOverviewLiveRequestInfo = null;
        DomainAnalyticsWhoisOverviewLiveResponseInfo response = api.whoisOverviewLive(domainAnalyticsWhoisOverviewLiveRequestInfo);
        // TODO: test validations
    }

}
