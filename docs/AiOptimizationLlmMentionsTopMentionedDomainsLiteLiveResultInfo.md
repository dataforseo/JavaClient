# AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>total number of results</em> |[optional]|
**offset** | **Integer** | <em>offset in the results array of the returned mentions data</em><br><code>offset</code> specified in the reqest |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**aggregatedMetrics** | **Object** | <em>aggregated mentions metrics summary</em><br>contains overall aggregated LLM mention metrics across all found domains, grouped by various dimensions</br>in this case, the value will be <code>null</code> |[optional]|
**items** | **List<AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem>** | <em>contains relevant mentions data</em> |[optional]|