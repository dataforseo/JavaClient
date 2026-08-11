# KnowledgeGraphExpandedElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**featuredTitle** | **String** | <em>title of a given element</em> |[optional]|
**url** | **String** | <em>relevant URL </em> |[optional]|
**domain** | **String** | <em>domain where a link points</em> |[optional]|
**title** | **String** | <em>title of the result in SERP</em> |[optional]|
**snippet** | **String** | <em>text alongside the link title</em> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em><br>if there are none, equals <code>null</code> |[optional]|
**timestamp** | **String** | <em>date and time when the result was published</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**table** | **Table** | <em>table present in the element</em><br>the header and content of the table present in the element |[optional]|