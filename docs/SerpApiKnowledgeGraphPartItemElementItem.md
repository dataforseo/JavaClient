# SerpApiKnowledgeGraphPartItemElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**dataAttrid** | **String** | google defined data attribute ID<br>example:<br>kc:/local:place qa |[optional]|
**text** | **String** | reference text<br>text snippet from the page that was used to generate the ai_overview_element |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some of Google’s search results<br>if there are none, equals null |[optional]|