# DictionarySerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br><br>            position within a group of elements with identical <code>type</code> values<br><br>            positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br><br>            absolute position among all the elements in SERP |[optional]|
**title** | **String** | <em>title of the result in SERP</em> |[optional]|
**url** | **String** | <em> relevant URL of the Ad element in SERP</em> |[optional]|
**domain** | **String** | <em>domain in SERP</em> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb of the Ad element in SERP</em> |[optional]|
**keyword** | **String** | <em>keyword highlighted in the result</em> |[optional]|
**snippet** | **String** | <em>snippet of the element</em> |[optional]|
**text** | **String** | <em>description of the results element in SERP</em> |[optional]|
**links** | **List<LinkElement>** | <em>sitelinks</em><br><br>            the links shown below some of search results<br><br>            if there are none, equals <code>null</code> |[optional]|