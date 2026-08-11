# OnPageResourcesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **CrawlStatusInfo** | <em>details of the crawling session</em> |[optional]|
**searchAfterToken** | **String** |  |[optional]|
**currentOffset** | **Integer** |  |[optional]|
**totalItemsCount** | **Long** | <em>total number of relevant items crawled</em> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**items** | **List<BaseOnPageResourceItem>** | <em>items array</em> |[optional]|