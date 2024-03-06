[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# OnPageSummaryResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**crawlProgress** | **String** | status of the crawling session possible values: in_progress, finished |  [optional] |
|**crawlStatus** | [**CrawlStatusInfo**](CrawlStatusInfo.md) |  |  [optional] |
|**crawlGatewayAddress** | **String** | crawler ip address displays the IP address used by the crawler to initiate the current crawling session you can find the full list of IPs used by our crawler in the Overview section |  [optional] |
|**crawlStopReason** | **String** | reason why the crawling stopped information about the reason why the crawling process stopped; possible values: limit_exceeded – the limit set in the max_crawl_pages was exceeded; empty_queue – all URLs in the queue were crawled; force_stopped – the crawling process was halted using the On Page API Force Stop function; unexpected_exception – an internal error was encountered while crawling the target, contact support for more info |  [optional] |
|**domainInfo** | [**DomainInfo**](DomainInfo.md) |  |  [optional] |
|**pageMetrics** | [**PageMetrics**](PageMetrics.md) |  |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")