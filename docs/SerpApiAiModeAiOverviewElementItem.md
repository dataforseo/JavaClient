# SerpApiAiModeAiOverviewElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | <em>title of the element</em> |[optional]|
**text** | **String** | <em>text or description of the element in SERP</em> |[optional]|
**markdown** | **String** | <em>content of the element in markdown format</em> |[optional]|
**links** | **List<AiModeLinkElementInfo>** | <em>website links featured in the element</em><br>if there are none, equals <code>null</code> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em><br>if there are none, equals <code>null</code> |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | <em>references relevant to the element</em><br>includes references to webpages that were used to generate the <code>ai_overview_element</code> |[optional]|