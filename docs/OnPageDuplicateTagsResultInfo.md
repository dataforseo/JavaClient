# OnPageDuplicateTagsResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling session<br>possible values: in_progress, finished |[optional]|
**crawlStatus** | **CrawlStatusInfo** | details of the crawling session |[optional]|
**totalPagesCount** | **Long** | total number of pages with duplicate tags<br>displays the total number of pages with duplicate tags of the target website |[optional]|
**pagesCount** | **Long** | number of pages with duplicate tags in the response<br>displays the number of pages with duplicate tags returned in the response |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**items** | **List<OnPageDuplicateTagsItem>** | items array |[optional]|