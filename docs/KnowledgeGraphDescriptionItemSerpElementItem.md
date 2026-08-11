# KnowledgeGraphDescriptionItemSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**text** | **String** | <em>reference text</em><br>text snippet from the page that was used to generate the <code>ai_overview_element</code> |[optional]|
**links** | **List<LinkElement>** | <em>sitelinks</em><br>the links shown below some of Google's search results<br>if there are none, equals <code>null</code> |[optional]|