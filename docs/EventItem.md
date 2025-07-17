# EventItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**title** | **String** | title of the element |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**url** | **String** | search URL with refinement parameters |[optional]|
**imageUrl** | **String** | URL of the image featured in the element |[optional]|
**eventDates** | **EventDates** | dates when the event takes place<br>if there are none, equals null |[optional]|
**locationInfo** | **LocationInfo** | information about the event’s venue |[optional]|
**informationAndTickets** | **List<InformationAndTicketsElement>** | additional information and ticket purchase options |[optional]|