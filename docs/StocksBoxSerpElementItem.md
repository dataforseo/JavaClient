# StocksBoxSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values;<br>positions of elements with different type values are omitted from rank_group;<br>always equals 0 for desktop |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP<br>always equals 0 for desktop |[optional]|
**title** | **String** | title of a given link element |[optional]|
**source** | **String** | reference source name or title |[optional]|
**snippet** | **String** | description of the shopping element |[optional]|
**price** | **PriceInfo** | price of the shopping element |[optional]|
**url** | **String** | URL |[optional]|
**domain** | **String** | domain name of the reference |[optional]|
**table** | **Table** | table present in the element<br>the header and content of the table present in the element |[optional]|
**graph** | **Graph** | contains data provided in the graph of the element |[optional]|