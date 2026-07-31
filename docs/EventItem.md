# EventItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath' rel='noopener noreferrer' target='_blank'>XPath</a> of the element</em> |[optional]|
**title** | **String** | <em>title of the element</em> |[optional]|
**description** | **String** | <em>description of the results element in SERP</em> |[optional]|
**url** | **String** | <em>search URL with refinement parameters</em> |[optional]|
**imageUrl** | **String** | <em>URL of the image featured in the element</em> |[optional]|
**eventDates** | **EventDates** | <em>dates when the event takes place</em><br>if there are none, equals <code>null</code> |[optional]|
**locationInfo** | **LocationInfo** | <em>information about the event's venue</em> |[optional]|
**informationAndTickets** | **List<AiModeLinkElementInfo>** | <em>additional information and ticket purchase options</em> |[optional]|