# AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>total amount of results relevant the request</em> |[optional]|
**offset** | **Integer** | <em>the number of mentions objects that are omitted in the <code>items</code> array</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**aggregatedMetrics** | **LlmMentionsAggregatedMetricsInfo** | <em>aggregated mentions metrics</em><br>contains aggregated LLM mention metrics across all found brand categories, grouped by various dimensions |[optional]|
**items** | **List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveItem>** | <em>individual brand categories results</em><br>array containing detailed mention metrics for each of the found brand categories |[optional]|