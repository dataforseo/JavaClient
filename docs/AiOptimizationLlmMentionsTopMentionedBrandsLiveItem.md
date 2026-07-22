# AiOptimizationLlmMentionsTopMentionedBrandsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**brand** | **String** | brand name<br>name of the brand found in LLM mentions for the specified target |[optional]|
**location** | **List<AggregatedMetricsItemInfo>** | location-based grouping<br>array of objects containing mention metrics segmented by geographical location |[optional]|
**language** | **List<AggregatedMetricsItemInfo>** | language-based grouping<br>array of objects containing mention metrics segmented by content language |[optional]|
**platform** | **List<AggregatedMetricsItemInfo>** | platform-based grouping<br>array of group elements containing mention metrics segmented by AI platform |[optional]|
**sourcesDomain** | **List<AggregatedMetricsItemInfo>** | found top source domains relevant to the target<br>array of objects containing data on top domains that are cited as sources in LLM responses<br>learn more about the sources and how to retrieve LLM citation data at our Help Center |[optional]|
**searchResultsDomain** | **List<AggregatedMetricsItemInfo>** | found top search results domains relevant to the target<br>array of objects containing data on top domains that appear in search results related to LLM queries |[optional]|
**brandEntitiesTitle** | **List<AggregatedMetricsItemInfo>** | data on brand entities relevant to the target<br>array of objects containing data on brand entity titles that appear in search results related to LLM queries |[optional]|
**brandEntitiesCategory** | **List<AggregatedMetricsItemInfo>** | data on brand entities relevant to the target<br>array of objects containing data on brand entity categories that appear in search results related to LLM queries |[optional]|
**total** | **AggregatedMetricsInfoTotalInfo** | aggregated mentions metrics summary<br>contains overall aggregated LLM mention metrics across all dimensions |[optional]|