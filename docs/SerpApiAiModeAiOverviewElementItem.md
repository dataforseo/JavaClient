# SerpApiAiModeAiOverviewElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of the element |[optional]|
**text** | **String** | text or description of the element in SERP |[optional]|
**markdown** | **String** | content of the element in markdown format |[optional]|
**links** | **List<AiModeLinkElementInfo>** | website links featured in the elementif there are none, equals null |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the elementif there are none, equals null |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | references relevant to the elementincludes references to webpages that were used to generate the ai_overview_element |[optional]|