# OnPageRedirectChainsResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **CrawlStatusInfo** | <em>details of the crawling session</em> |[optional]|
**totalItemsCount** | **Long** | <em>total number of relevant items in the database</em> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**items** | **List<OnPageRedirectChainsItem>** | <em>items array</em> |[optional]|