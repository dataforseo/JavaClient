# AiOptimizationLlmMentionsTopMentionedDomainsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total amount of results relevant the request |[optional]|
**offset** | **Integer** | the number of mentions objects that are omitted in the items array |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**aggregatedMetrics** | **LlmMentionsAggregatedMetricsInfo** | aggregated mentions metrics<br>contains aggregated LLM mention metrics across all found domains, grouped by various dimensions |[optional]|
**items** | **List<AiOptimizationLlmMentionsTopMentionedDomainsLiveItem>** | individual domain results<br>array containing detailed mention metrics for each of the found top domains |[optional]|