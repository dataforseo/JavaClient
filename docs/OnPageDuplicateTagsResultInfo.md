# OnPageDuplicateTagsResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **CrawlStatusInfo** | <em>details of the crawling session</em> |[optional]|
**totalPagesCount** | **Long** | <em>total number of pages with duplicate tags</em><br>displays the total number of pages with duplicate tags of the target website |[optional]|
**pagesCount** | **Long** | <em>number of pages with duplicate tags in the response</em><br>displays the number of pages with duplicate tags returned in the response |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**items** | **List<OnPageDuplicateTagsItem>** | <em>items array</em> |[optional]|