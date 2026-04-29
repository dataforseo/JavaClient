# KnowledgeGraphShoppingItemSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values;<br>positions of elements with different type values are omitted from rank_group;<br>always equals 0 for desktop |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP<br>always equals 0 for desktop |[optional]|
**title** | **String** | reference page title |[optional]|
**dataAttrid** | **String** | google defined data attribute ID<br>example:<br>action:listen_artist |[optional]|
**items** | **List<KnowledgeGraphShoppingElement>** | contains arrays of specific images |[optional]|