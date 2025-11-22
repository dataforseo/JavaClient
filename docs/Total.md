# Total


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**location** | **List<GroupElement>** | location-based grouping<br>array of objects containing mention metrics segmented by geographical location |[optional]|
**language** | **List<GroupElement>** | language-based grouping<br>array of objects containing mention metrics segmented by content language |[optional]|
**platform** | **List<GroupElement>** | platform-based grouping<br>array of group elements containing mention metrics segmented by AI platform |[optional]|
**sourcesDomain** | **List<GroupElement>** | found source domains relevant to the target<br>array of objects containing data on top domains that are cited as sources in LLM responses |[optional]|
**searchResultsDomain** | **List<GroupElement>** | found search results domains relevant to the target<br>array of objects containing data on top domains that appear in search results related to LLM queries |[optional]|