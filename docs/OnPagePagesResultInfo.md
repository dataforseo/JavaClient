# OnPagePagesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling session<br>possible values: in_progress, finished |[optional]|
**crawlStatus** | **CrawlStatusInfo** | details of the crawling session |[optional]|
**searchAfterToken** | **String** |  |[optional]|
**currentOffset** | **Integer** |  |[optional]|
**totalItemsCount** | **Long** | total number of relevant items in the database |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**items** | **List<BaseOnPageResourceItem>** | items array |[optional]|