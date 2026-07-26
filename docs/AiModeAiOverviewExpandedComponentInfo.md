# AiModeAiOverviewExpandedComponentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>reference page title</em> |[optional]|
**text** | **String** | <em>additional text of the element in SERP</em> |[optional]|
**markdown** | **String** | <em>content of the element in markdown format</em> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the component</em><br>if there are none, equals <code>null</code> |[optional]|
**links** | **List<AiModeLinkElementInfo>** | <em>sitelinks</em><br>the links shown below some of Google's search results<br>if there are none, equals <code>null</code> |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | <em>references relevant to the element</em><br>includes references to webpages that were used to generate the <code>ai_overview_element</code> |[optional]|