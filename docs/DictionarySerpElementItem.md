# DictionarySerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**url** | **String** | relevant URL of the Ad element in SERP |[optional]|
**domain** | **String** | domain in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb of the Ad element in SERP |[optional]|
**keyword** | **String** | keyword highlighted in the result |[optional]|
**snippet** | **String** | snippet of the element |[optional]|
**text** | **String** | description of the results element in SERP |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some of search results<br>if there are none, equals null |[optional]|