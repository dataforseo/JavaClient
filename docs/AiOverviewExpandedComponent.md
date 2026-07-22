# AiOverviewExpandedComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | reference page title |[optional]|
**text** | **String** | reference text<br>text snippet from the page that was used to generate the ai_overview_element |[optional]|
**markdown** | **String** | content of the element in markdown format |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the element<br>if there is none, equals null |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some of Google’s search results<br>if there are none, equals null |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | references relevant to the element<br>includes references to webpages that were used to generate the ai_overview_element |[optional]|