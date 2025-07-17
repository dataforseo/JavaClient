# SerpApiKnowledgeGraphListItemElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of the link element |[optional]|
**dataAttrid** | **String** | google defined data attribute ID<br>example:<br>ss:/webfacts:net_worth |[optional]|
**link** | **LinkElement** | link of the element |[optional]|
**items** | **List<KnowledgeGraphListElement>** | additional items present in the element<br>if there are none, equals null |[optional]|