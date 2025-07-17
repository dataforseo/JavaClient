# Dataset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**datasetId** | **String** | ID of the dataset |[optional]|
**title** | **String** | title of the element |[optional]|
**imageUrl** | **String** | URL of the image<br>the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**scholarlyCitationsCount** | **Long** | count of articles that refer to the dataset |[optional]|
**scholarlyArticlesUrl** | **String** | url of scholarly articles<br>link to the list of scholarly articles on Google Scholar<br>example: https://scholar.google.com/scholar?q=%2210.6084%20m9%20figshare%207427933%20v1%22 |[optional]|
**uniqueIdentifier** | **String** | digital identifier of an object<br>unique digital identifier of the dataset<br>example: https://doi.org/10.5061/dryad.hmgqnk9m3 |[optional]|
**relatedArticle** | **String** | link to related article<br>link to the published article that is related to the dataset |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some of Google Dataset’s search results<br>if there are none, equals null |[optional]|
**datasetProviders** | **List<LicensesElement>** | the list of institutions that provided the dataset |[optional]|
**formats** | **List<FormatsElement>** | the list of file formats of the dataset |[optional]|
**authors** | **List<AuthorsElement>** | the list of authors of the dataset |[optional]|
**licenses** | **List<LicensesElement>** | the list of licenses issued to the dataset |[optional]|
**updatedDate** | **String** | date and time when the result was last updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2022-11-27 02:00:00 +00:00 |[optional]|
**areaCovered** | **List<String>** | the list of areas covered in the dataset<br>for example: Africa, Global |[optional]|
**periodCovered** | **PeriodCovered** | period covered in the dataset |[optional]|
**datasetDescription** | **DatasetDescription** | description of the dataset |[optional]|