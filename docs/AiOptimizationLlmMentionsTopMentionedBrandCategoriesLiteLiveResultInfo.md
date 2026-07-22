# AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total number of results |[optional]|
**offset** | **Integer** | offset in the results array of the returned mentions data<br>offset specified in the request |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**aggregatedMetrics** | **Object** | aggregated mentions metrics summary<br>contains overall aggregated LLM mention metrics across all found domains, grouped by various dimensionsin this case, the value will be null |[optional]|
**items** | **List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveItem>** | contains relevant mentions data |[optional]|