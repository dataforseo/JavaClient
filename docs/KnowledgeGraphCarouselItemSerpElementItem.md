# KnowledgeGraphCarouselItemSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**title** | **String** | <em>title of the row</em> |[optional]|
**dataAttrid** | **String** | <em>google defined data attribute ID</em><br>example:<br><code>action:listen_artist</code> |[optional]|
**link** | **LinkElement** | <em>link of the element</em> |[optional]|
**items** | **List<KnowledgeGraphListElement>** | <em>contains arrays of elements available in the list</em> |[optional]|