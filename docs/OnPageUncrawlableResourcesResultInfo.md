# OnPageUncrawlableResourcesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling sessionpossible values: in_progress, finished |[optional]|
**crawlStatus** | **CrawlStatusInfo** | details of the crawling session |[optional]|
**currentOffset** | **Integer** |  |[optional]|
**totalItemsCount** | **Long** | total number of uncrawlable resources found total number of uncrawlable resources found during the crawl of the target domain |[optional]|
**itemsCount** | **Long** | number of uncrawlable resources in the items array |[optional]|
**items** | **List<OnPageUncrawlableResourcesItem>** | array of uncrawlable resources |[optional]|