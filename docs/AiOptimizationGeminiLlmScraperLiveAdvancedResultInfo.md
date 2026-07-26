# AiOptimizationGeminiLlmScraperLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array<br></em><strong>the keyword is returned with decoded %## (plus symbol '+' will be decoded to a space character)</strong> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**model** | **String** | <em>indicates the model version</em> |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**markdown** | **String** | <em>content of the element in markdown format</em><br>content of the result formatted in the <a href='https://en.wikipedia.org/wiki/Markdown' target='_blank'>markdown markup language</a> |[optional]|
**sources** | **List<SourceInfo>** | <em>array of sources</em><br>the sources the model actually cited or relied on in its final answer |[optional]|
**seResultsCount** | **Long** | <em> total number of results</em> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results</em><br>contains types of search results (<code>items</code>) found in SERP.<br>possible item types:<br><code>gemini_text</code>, <code>gemini_table</code>, <code>gemini_images</code> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseGeminiLlmScraperElementItem>** | <em>elements of Gemini results</em> |[optional]|