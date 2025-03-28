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
import io.github.dataforseo.client.model.BacklinksAnchorsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksAnchorsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksAvailableFiltersResponseInfo;
import io.github.dataforseo.client.model.BacklinksBacklinksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBacklinksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkRanksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkRanksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksCompetitorsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksCompetitorsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksErrorsRequestInfo;
import io.github.dataforseo.client.model.BacklinksErrorsResponseInfo;
import io.github.dataforseo.client.model.BacklinksHistoryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksHistoryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksIdListRequestInfo;
import io.github.dataforseo.client.model.BacklinksIdListResponseInfo;
import io.github.dataforseo.client.model.BacklinksIndexResponseInfo;
import io.github.dataforseo.client.model.BacklinksPageIntersectionLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksPageIntersectionLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksReferringDomainsLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksReferringDomainsLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksReferringNetworksLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksReferringNetworksLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveResponseInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveRequestInfo;
import io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveResponseInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BacklinksApi
 */
@Disabled
public class BacklinksApiTest {

    private final BacklinksApi api = new BacklinksApi();

    /**
     * ‌‌ This endpoint will provide you with a detailed overview of anchors used when linking to the specified website with relevant backlink data for each of them. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/anchors/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void anchorsLiveTest() throws ApiException {
        List<BacklinksAnchorsLiveRequestInfo> backlinksAnchorsLiveRequestInfo = null;
        BacklinksAnchorsLiveResponseInfo response = api.anchorsLive(backlinksAnchorsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * Backlinks API features plenty of parameters that support custom filtration. By applying filters to your POST requests, you will be able to effortlessly extract data that matches your requirements. Note that we do not charge any fees for using data filtering or sorting rules. ‌‌ Here you will find all the necessary information about filters that can be used with DataForSEO Backlinks API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/filters/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backlinksAvailableFiltersTest() throws ApiException {
        BacklinksAvailableFiltersResponseInfo response = api.backlinksAvailableFilters();
        // TODO: test validations
    }

    /**
     * By calling this endpoint you will receive information about the Backlinks API tasks that returned an error within the past 7 days. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/errors/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backlinksErrorsTest() throws ApiException {
        List<BacklinksErrorsRequestInfo> backlinksErrorsRequestInfo = null;
        BacklinksErrorsResponseInfo response = api.backlinksErrors(backlinksErrorsRequestInfo);
        // TODO: test validations
    }

    /**
     * This endpoint is designed to provide you with the list of IDs and metadata of the completed Backlinks tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/id_list/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backlinksIdListTest() throws ApiException {
        List<BacklinksIdListRequestInfo> backlinksIdListRequestInfo = null;
        BacklinksIdListResponseInfo response = api.backlinksIdList(backlinksIdListRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with a list of backlinks and relevant data for the specified domain, subdomain, or webpage. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/backlinks/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backlinksLiveTest() throws ApiException {
        List<BacklinksBacklinksLiveRequestInfo> backlinksBacklinksLiveRequestInfo = null;
        BacklinksBacklinksLiveResponseInfo response = api.backlinksLive(backlinksBacklinksLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the number of backlinks pointing to domains, subdomains, and pages specified in the targets array. The returned numbers correspond to all live backlinks, that is, total number of referring links with all attributes (e.g., nofollow, noreferrer, ugc, sponsored etc) that were found during the latest check. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_backlinks/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkBacklinksLiveTest() throws ApiException {
        List<BacklinksBulkBacklinksLiveRequestInfo> backlinksBulkBacklinksLiveRequestInfo = null;
        BacklinksBulkBacklinksLiveResponseInfo response = api.bulkBacklinksLive(backlinksBulkBacklinksLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the number of new and lost backlinks for the domains, subdomains, and pages specified in the targets array. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_new_lost_backlinks/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkNewLostBacklinksLiveTest() throws ApiException {
        List<BacklinksBulkNewLostBacklinksLiveRequestInfo> backlinksBulkNewLostBacklinksLiveRequestInfo = null;
        BacklinksBulkNewLostBacklinksLiveResponseInfo response = api.bulkNewLostBacklinksLive(backlinksBulkNewLostBacklinksLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the number of referring domains pointing to the domains, subdomains and pages specified in the targets array. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_new_lost_referring_domains/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkNewLostReferringDomainsLiveTest() throws ApiException {
        List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> backlinksBulkNewLostReferringDomainsLiveRequestInfo = null;
        BacklinksBulkNewLostReferringDomainsLiveResponseInfo response = api.bulkNewLostReferringDomainsLive(backlinksBulkNewLostReferringDomainsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * This endpoint will provide you with a comprehensive overview of backlinks and related data for a bulk of up to 1000 pages, domains, or subdomains. If you indicate a single page as a target, you will get comprehensive summary data on all backlinks for that page. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_pages_summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkPagesSummaryLiveTest() throws ApiException {
        List<BacklinksBulkPagesSummaryLiveRequestInfo> backlinksBulkPagesSummaryLiveRequestInfo = null;
        BacklinksBulkPagesSummaryLiveResponseInfo response = api.bulkPagesSummaryLive(backlinksBulkPagesSummaryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with rank scores of the domains, subdomains, and pages specified in the targets array. The score is based on the number of referring domains pointing to the specified domains, subdomains, or pages. The rank values represent real-time data for the date of the request and range from 0 (no backlinks detected) to 1,000 (highest rank). A similar scoring system is used in Google’s Page Rank algorithm. You can learn more about rank scores in this help center article for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_ranks/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkRanksLiveTest() throws ApiException {
        List<BacklinksBulkRanksLiveRequestInfo> backlinksBulkRanksLiveRequestInfo = null;
        BacklinksBulkRanksLiveResponseInfo response = api.bulkRanksLive(backlinksBulkRanksLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the number of referring domains pointing to domains, subdomains, and pages specified in the targets array. The returned numbers are based on all live referring domains, that is, total number of domains pointing to the target with any type of backlinks (e.g., nofollow, noreferrer, ugc, sponsored etc) that were found during the latest check. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_referring_domains/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkReferringDomainsLiveTest() throws ApiException {
        List<BacklinksBulkReferringDomainsLiveRequestInfo> backlinksBulkReferringDomainsLiveRequestInfo = null;
        BacklinksBulkReferringDomainsLiveResponseInfo response = api.bulkReferringDomainsLive(backlinksBulkReferringDomainsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with spam scores of the domains, subdomains, and pages you specified in the targets array. Spam Score is DataForSEO’s proprietary metric that indicates how “spammy” your target is on a scale from 0 to 100. You can learn more about Spam Score, how it is calculated, and signals it takes into account in this help center article for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_spam_score/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkSpamScoreLiveTest() throws ApiException {
        List<BacklinksBulkSpamScoreLiveRequestInfo> backlinksBulkSpamScoreLiveRequestInfo = null;
        BacklinksBulkSpamScoreLiveResponseInfo response = api.bulkSpamScoreLive(backlinksBulkSpamScoreLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ This endpoint will provide you with a list of competitors that share some part of the backlink profile with a target website, along with a number of backlink intersections and the rank of every competing website. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/competitors/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void competitorsLiveTest() throws ApiException {
        List<BacklinksCompetitorsLiveRequestInfo> backlinksCompetitorsLiveRequestInfo = null;
        BacklinksCompetitorsLiveResponseInfo response = api.competitorsLive(backlinksCompetitorsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the list of domains pointing to the specified websites. This endpoint is especially useful for creating a Link Gap feature that shows what domains link to your competitors but do not link out to your website. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/domain_intersection/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainIntersectionLiveTest() throws ApiException {
        List<BacklinksDomainIntersectionLiveRequestInfo> backlinksDomainIntersectionLiveRequestInfo = null;
        BacklinksDomainIntersectionLiveResponseInfo response = api.domainIntersectionLive(backlinksDomainIntersectionLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ This endpoint will provide you with a detailed overview of domain pages with backlink data for each page. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/domain_pages/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainPagesLiveTest() throws ApiException {
        List<BacklinksDomainPagesLiveRequestInfo> backlinksDomainPagesLiveRequestInfo = null;
        BacklinksDomainPagesLiveResponseInfo response = api.domainPagesLive(backlinksDomainPagesLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * This endpoint will provide you with detailed summary data on all backlinks and related metrics for each page of the target domain or subdomain you specify. If you indicate a single page as a target, you will get comprehensive summary data on all backlinks for that page. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/domain_pages_summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainPagesSummaryLiveTest() throws ApiException {
        List<BacklinksDomainPagesSummaryLiveRequestInfo> backlinksDomainPagesSummaryLiveRequestInfo = null;
        BacklinksDomainPagesSummaryLiveResponseInfo response = api.domainPagesSummaryLive(backlinksDomainPagesSummaryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with historical backlinks data back to the beginning of 2019. You can receive the number of backlinks a given domain had in a specific time period, the number of new &amp; lost backlinks, referring domains, and more. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/history/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void historyLiveTest() throws ApiException {
        List<BacklinksHistoryLiveRequestInfo> backlinksHistoryLiveRequestInfo = null;
        BacklinksHistoryLiveResponseInfo response = api.historyLive(backlinksHistoryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the total number of backlinks, domains, and pages our database contains for the moment when you make a request. You will also get stats for the last 12 months. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/index/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void indexTest() throws ApiException {
        BacklinksIndexResponseInfo response = api.index();
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the list of referring pages pointing to the specified targets. It is especially useful for finding the backlinks that point to your competitors but don’t point to your website. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/page_intersection/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageIntersectionLiveTest() throws ApiException {
        List<BacklinksPageIntersectionLiveRequestInfo> backlinksPageIntersectionLiveRequestInfo = null;
        BacklinksPageIntersectionLiveResponseInfo response = api.pageIntersectionLive(backlinksPageIntersectionLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ This endpoint will provide you with a detailed overview of referring domains pointing to the target you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/referring_domains/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void referringDomainsLiveTest() throws ApiException {
        List<BacklinksReferringDomainsLiveRequestInfo> backlinksReferringDomainsLiveRequestInfo = null;
        BacklinksReferringDomainsLiveResponseInfo response = api.referringDomainsLive(backlinksReferringDomainsLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌‌ This endpoint will provide you with a detailed overview of referring IPs and subnets pointing to the target you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/referring_networks/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void referringNetworksLiveTest() throws ApiException {
        List<BacklinksReferringNetworksLiveRequestInfo> backlinksReferringNetworksLiveRequestInfo = null;
        BacklinksReferringNetworksLiveResponseInfo response = api.referringNetworksLive(backlinksReferringNetworksLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with an overview of backlinks data available for a given domain, subdomain, or webpage. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summaryLiveTest() throws ApiException {
        List<BacklinksSummaryLiveRequestInfo> backlinksSummaryLiveRequestInfo = null;
        BacklinksSummaryLiveResponseInfo response = api.summaryLive(backlinksSummaryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with the number of new and lost backlinks and referring domains for the domain specified in the target field. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/timeseries_new_lost_summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void timeseriesNewLostSummaryLiveTest() throws ApiException {
        List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> backlinksTimeseriesNewLostSummaryLiveRequestInfo = null;
        BacklinksTimeseriesNewLostSummaryLiveResponseInfo response = api.timeseriesNewLostSummaryLive(backlinksTimeseriesNewLostSummaryLiveRequestInfo);
        // TODO: test validations
    }

    /**
     * ‌ This endpoint will provide you with an overview of backlink data for the target domain available during a period between the two indicated dates. Backlink metrics will be grouped by the time range that you define: day, week, month, or year. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/timeseries_summary/live/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void timeseriesSummaryLiveTest() throws ApiException {
        List<BacklinksTimeseriesSummaryLiveRequestInfo> backlinksTimeseriesSummaryLiveRequestInfo = null;
        BacklinksTimeseriesSummaryLiveResponseInfo response = api.timeseriesSummaryLive(backlinksTimeseriesSummaryLiveRequestInfo);
        // TODO: test validations
    }

}
