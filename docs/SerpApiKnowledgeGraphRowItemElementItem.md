# SerpApiKnowledgeGraphRowItemElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of the item |[optional]|
**dataAttrid** | **String** | google defined data attribute ID<br>example:<br>kc:/common/topic:social media presence |[optional]|
**text** | **String** | reference text<br>text snippet from the page that was used to generate the ai_overview_element |[optional]|
**links** | **List<LinkElement>** | links featured in the faq_box_element |[optional]|