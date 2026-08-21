# OnPageContentParsingResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>            possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **CrawlStatusInfo** | <em>details of the crawling session</em> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em><br> |[optional]|
**items** | **List<ContentParsingElement>** | <em>items array</em><br> |[optional]|