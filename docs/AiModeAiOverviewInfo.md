# AiModeAiOverviewInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**page** | **Integer** | <em>SERP page</em><br>SERP page on which the element ranks |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath' rel='noopener noreferrer' target='_blank'>XPath</a> of the element</em> |[optional]|
**markdown** | **String** | <em>content of the element in markdown format</em><br>the text of the <code>ai_overview</code> formatted in the <a href='https://en.wikipedia.org/wiki/Markdown' target='_blank'>markdown markup language</a> |[optional]|
**items** | **List<BaseSerpApiAiModeAiOverviewElementItem>** | <em>items present in the element</em> |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | <em>additional references relevant to the item</em><br>includes references to webpages that may have been used to generate the <code>ai_overview</code> |[optional]|
**rectangle** | **AiModeRectangleInfo** | <em>rectangle parameters</em><br>contains cartesian coordinates and pixel dimensions of the result's snippet in SERP<br>equals <code>null</code> if <code>calculate_rectangles</code> in the POST request is not set to <code>true</code> |[optional]|