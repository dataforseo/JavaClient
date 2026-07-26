# OnPageUncrawlableResourcesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **CrawlStatusInfo** | <em>details of the crawling session</em> |[optional]|
**currentOffset** | **Integer** |  |[optional]|
**totalItemsCount** | **Long** | <em>total number of uncrawlable resources found</em><br> total number of uncrawlable resources found during the crawl of the target domain |[optional]|
**itemsCount** | **Long** | <em>number of uncrawlable resources in the <code>items</code> array</em> |[optional]|
**items** | **List<OnPageUncrawlableResourcesItem>** | <em>array of uncrawlable resources</em> |[optional]|