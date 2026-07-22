# KnowledgeGraphSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**subtitle** | **String** | subtitle of the item |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**cardId** | **String** | card id |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**imageUrl** | **String** | URL of the image<br>the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**logoUrl** | **String** | URL of the logo from knowledge graph |[optional]|
**cid** | **String** | google-defined client id<br>unique id of a local establishment;<br>can be used with Google Reviews API to get a full list of reviews |[optional]|
**items** | **List<BaseSerpApiKnowledgeGraphElementItem>** | additional items present in the element<br>if there are none, equals null |[optional]|