

# SerpGoogleDatasetInfoAdvancedItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**datasetId** | **String** | ID of the dataset |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**imageUrl** | **String** | URL of the image the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |  [optional] |
|**scholarlyCitationsCount** | **Long** | count of articles that refer to the dataset |  [optional] |
|**links** | [**List&lt;LinkElement&gt;**](LinkElement.md) | sitelinks the links shown below some of Google Dataset’s search results if there are none, equals null |  [optional] |
|**datasetProviders** | [**List&lt;LicensesElement&gt;**](LicensesElement.md) | the list of institutions that provided the dataset |  [optional] |
|**formats** | [**List&lt;FormatsElement&gt;**](FormatsElement.md) | the list of file formats of the dataset |  [optional] |
|**authors** | [**List&lt;AuthorsElement&gt;**](AuthorsElement.md) |  |  [optional] |
|**licenses** | [**List&lt;LicensesElement&gt;**](LicensesElement.md) | the list of licenses issued to the dataset |  [optional] |
|**updatedDate** | **String** | date and time when the result was last updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2022-11-27 02:00:00 +00:00 |  [optional] |
|**areaCovered** | **List&lt;String&gt;** | the list of areas covered in the dataset for example: Africa, Global |  [optional] |
|**periodCovered** | [**PeriodCovered**](PeriodCovered.md) |  |  [optional] |
|**datasetDescription** | [**DatasetDescription**](DatasetDescription.md) |  |  [optional] |



