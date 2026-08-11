# SerpApiKnowledgeGraphListItemElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | <em>title of the item</em> |[optional]|
**dataAttrid** | **String** | <em>google defined data attribute ID</em><br>example:<br><code>ss:/webfacts:net_worth</code> |[optional]|
**link** | **LinkElement** | <em>link of the element</em> |[optional]|
**items** | **List<KnowledgeGraphListElement>** | <em>additional items present in the element</em><br>if there are none, equals <code>null</code> |[optional]|