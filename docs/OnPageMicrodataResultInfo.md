# OnPageMicrodataResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling session<br>possible values: in_progress, finished |[optional]|
**crawlStatus** | **CrawlStatusInfo** | details of the crawling session |[optional]|
**testSummary** | **TestSummary** | microdata validation test results |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**items** | **List<OnPageMicrodataInfoItem>** | items array |[optional]|