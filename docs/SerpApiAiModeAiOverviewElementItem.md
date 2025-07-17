# SerpApiAiModeAiOverviewElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of the element |[optional]|
**text** | **String** | text or description of the element in SERP |[optional]|
**markdown** | **String** | content of the element in markdown format |[optional]|
**links** | **List<InformationAndTicketsElement>** | website links featured in the element |[optional]|
**images** | **List<AiModeImagesElement>** | images of the element<br>if there are none, equals null |[optional]|
**references** | **List<AiAiOverviewReferenceInfo>** | references relevant to the element<br>includes references to webpages that were used to generate the ai_overview_element |[optional]|