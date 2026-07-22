# AiOptimizationLlmMentionsTargetMetricsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total amount of results relevant to the request<br>in this case, always equals 0 |[optional]|
**offset** | **Integer** | the number of mentions objects that are omitted in the items array<br>in this case, always equals 0 |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array<br>in this case, always equals 0 |[optional]|
**aggregatedMetrics** | **LlmMentionsAggregatedMetricsInfo** | aggregated mentions metrics<br>contains aggregated LLM mention metrics across all found domains, grouped by various dimensions |[optional]|
**items** | **List<Object>** | individual target results<br>in this case, equals null |[optional]|