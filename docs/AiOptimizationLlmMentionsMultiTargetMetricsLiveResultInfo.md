# AiOptimizationLlmMentionsMultiTargetMetricsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total number of results |[optional]|
**offset** | **Integer** | offset in the results array of the returned mentions data<br>offset specified in the request |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**aggregatedMetrics** | **LlmMentionsAggregatedMetricsInfo** | aggregated mentions metrics summary<br>contains overall aggregated LLM mention metrics across all LLM mentions that match at least one target specified in the request |[optional]|
**items** | **List<AiOptimizationLlmMentionsMultiTargetMetricsLiveItem>** | contains relevant mentions data |[optional]|