# AiOptimizationGeminiLlmScraperLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>the keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character) |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**model** | **String** | indicates the model version |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**markdown** | **String** | content of the element in markdown format<br>content of the result formatted in the markdown markup language |[optional]|
**sources** | **List<SourceInfo>** | array of sources<br>the sources the model actually cited or relied on in its final answer |[optional]|
**seResultsCount** | **Long** | total number of results |[optional]|
**itemTypes** | **List<String>** | types of search results<br>contains types of search results (items) found in SERP.<br>possible item types:<br>gemini_text, gemini_table, gemini_images |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseGeminiLlmScraperElementItem>** | items present in the element |[optional]|