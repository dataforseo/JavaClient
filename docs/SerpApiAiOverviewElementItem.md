# SerpApiAiOverviewElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of a given link element |[optional]|
**text** | **String** | reference text<br>text snippet from the page that was used to generate the ai_overview_element |[optional]|
**markdown** | **String** | content of the element in markdown format |[optional]|
**links** | **List<LinkElement>** | website links featured in the element |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the component<br>if there are none, equals null |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | references relevant to the element<br>includes references to webpages that were used to generate the ai_overview_element |[optional]|