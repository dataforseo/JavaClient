# SerpApiBingAiOverviewElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**position** | **String** | <em>the alignment of the element in SERP</em><br>            can take the following values:<br>            <code>left</code>, <code>right</code> |[optional]|
**title** | **String** | <em>title of the result in SERP</em> |[optional]|
**text** | **String** | <em>text or description of the element in SERP</em> |[optional]|
**markdown** | **String** | <em>content of the element in markdown format</em> |[optional]|
**links** | **List<LinkElement>** | <em>sitelinks</em><br>            the links shown below some search results<br>            if there are none, equals <code>null</code> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em> |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | <em>references relevant to the element</em><br>            includes references to webpages that were used to generate the <code>ai_overview_element</code> |[optional]|