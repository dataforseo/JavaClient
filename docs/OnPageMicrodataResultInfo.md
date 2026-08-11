# OnPageMicrodataResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **CrawlStatusInfo** | <em>details of the crawling session</em> |[optional]|
**testSummary** | **TestSummary** | <em>microdata validation test results</em> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**items** | **List<OnPageMicrodataInfoItem>** | <em>items array</em> |[optional]|