# OnPageKeywordDensityResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling session<br>possible values: in_progress, finished |[optional]|
**crawlStatus** | **CrawlStatusInfo** | details of the crawling session |[optional]|
**totalItemsCount** | **Long** | total number of relevant items<br>total number of keywords on the specified website or web page matching the set keyword_length and filters |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**items** | **List<OnPageKeywordDensityItem>** | items array |[optional]|