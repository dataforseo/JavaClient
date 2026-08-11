# SerpApiKnowledgeGraphShoppingItemElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | <em>title of a given link element</em> |[optional]|
**dataAttrid** | **String** | <em>google defined data attribute ID</em><br>example:<br><code>kc:/shopping/gpc:organic-offers</code> |[optional]|
**items** | **List<KnowledgeGraphShoppingElement>** | <em>keywords relevant to the initial search query</em><br>if there are none, equals <code>null</code> |[optional]|