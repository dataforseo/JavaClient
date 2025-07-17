# SerpApiKnowledgeGraphHotelsBookingItemElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of a given link element |[optional]|
**dateFrom** | **String** | starting date of stay<br>in the format “year-month-date”<br>example:<br>2019-11-15 |[optional]|
**dateTo** | **String** | ending date of stay<br>in the format “year-month-date”<br>example:<br>2019-11-17 |[optional]|
**dataAttrid** | **String** | google defined data attribute ID<br>example:<br>kc:/local:hotel booking |[optional]|
**items** | **List<KnowledgeGraphHotelsBookingElement>** | additional items present in the element<br>if there are none, equals null |[optional]|