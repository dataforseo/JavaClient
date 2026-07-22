# AiOptimizationLlmMentionsTargetMetricsLiteLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total amount of results relevant the request |[optional]|
**offset** | **Integer** | the number of mentions objects that are omitted in the items array |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**aggregatedMetrics** | **Object** | aggregated mentions metrics<br>in this case, always returns null |[optional]|
**items** | **List<AiOptimizationLlmMentionsTargetMetricsLiteLiveItem>** | array of aggregated mentions metrics<br>contains objects with aggregated mention metrics for the specified target |[optional]|