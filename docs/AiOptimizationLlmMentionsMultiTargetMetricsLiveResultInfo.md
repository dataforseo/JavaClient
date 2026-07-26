# AiOptimizationLlmMentionsMultiTargetMetricsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>total number of results</em> |[optional]|
**offset** | **Integer** | <em>offset in the results array of the returned mentions data</em><br><code>offset</code> specified in the request |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**aggregatedMetrics** | **LlmMentionsAggregatedMetricsInfo** | <em>aggregated mentions metrics summary</em><br>contains overall aggregated LLM mention metrics across all LLM mentions that match at least one target specified in the request |[optional]|
**items** | **List<AiOptimizationLlmMentionsMultiTargetMetricsLiveItem>** | <em>contains relevant mentions data</em> |[optional]|