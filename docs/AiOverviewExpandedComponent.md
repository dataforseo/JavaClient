# AiOverviewExpandedComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>reference page title</em> |[optional]|
**text** | **String** | <em>reference text</em><br>text snippet from the page that was used to generate the <code>ai_overview_element</code> |[optional]|
**markdown** | **String** | <em>content of the element in markdown format</em> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em><br>if there is none, equals <code>null</code> |[optional]|
**links** | **List<LinkElement>** | <em>sitelinks</em><br>the links shown below some of Google's search results<br>if there are none, equals <code>null</code> |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | <em>references relevant to the element</em><br>includes references to webpages that were used to generate the <code>ai_overview_element</code> |[optional]|