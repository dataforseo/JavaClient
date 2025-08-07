# SerpApiKnowledgeGraphAiOverviewElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of the element |[optional]|
**text** | **String** | additional text of the element in SERP |[optional]|
**markdown** | **String** | content of the element in markdown format |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some of Google’s search results<br>if there are none, equals null |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the element |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | references relevant to the element<br>includes references to webpages that were used to generate the ai_overview_element |[optional]|