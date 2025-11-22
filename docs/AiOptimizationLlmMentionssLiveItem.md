# AiOptimizationLlmMentionssLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**key** | **String** | URL of a found page<br>the URL of a page found in LLM mentions for the specified target |[optional]|
**location** | **List<GroupElement>** | location-based grouping<br>array of objects containing page mention metrics segmented by geographical location |[optional]|
**language** | **List<GroupElement>** | language-based grouping<br>array of objects containing page mention metrics segmented by content language |[optional]|
**platform** | **List<GroupElement>** | platform-based grouping<br>array of group elements containing page mention metrics segmented by AI platform |[optional]|
**sourcesDomain** | **List<GroupElement>** | source domains relevant to the specific page<br>array of objects containing data on domains that are cited as sources in LLM responses |[optional]|
**searchResultsDomain** | **List<GroupElement>** | search results domains relevant to the specific page<br>array of objects containing data on domains that appear in search results related to LLM queries |[optional]|