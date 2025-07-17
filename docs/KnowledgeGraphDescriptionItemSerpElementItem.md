# KnowledgeGraphDescriptionItemSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values;<br>positions of elements with different type values are omitted from rank_group;<br>always equals 0 for desktop |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP<br>always equals 0 for desktop |[optional]|
**text** | **String** | reference text<br>text snippet from the page that was used to generate the ai_overview_element |[optional]|
**links** | **List<LinkElement>** | link of the element |[optional]|