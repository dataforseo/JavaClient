# AiOptimizationLlmMentionsTargetMetricsLiteLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>total amount of results relevant the request</em> |[optional]|
**offset** | **Integer** | <em>the number of mentions objects that are omitted in the <code>items</code> array</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**aggregatedMetrics** | **Object** | <em>aggregated mentions metrics</em><br>in this case, always returns <code>null</code> |[optional]|
**items** | **List<AiOptimizationLlmMentionsTargetMetricsLiteLiveItem>** | <em>array of aggregated mentions metrics</em><br>contains objects with aggregated mention metrics for the specified target |[optional]|