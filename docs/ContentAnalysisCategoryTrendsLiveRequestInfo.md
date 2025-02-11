

# ContentAnalysisCategoryTrendsLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categoryCode** | **String** | target category code required field to obtain a full list of available categories, refer to the Categories endpoint |  [optional] |
|**pageType** | **List&lt;String&gt;** | target page types optional field use this parameter to filter the dataset by page types possible values: \&quot;ecommerce\&quot;, \&quot;news\&quot;, \&quot;blogs\&quot;, \&quot;message-boards\&quot;, \&quot;organization\&quot; |  [optional] |
|**searchMode** | **String** | results grouping type optional field possible grouping types: as_is – returns data on all citations for the target category_code one_per_domain – returns data on one citation of the category_code per domain default value: as_is |  [optional] |
|**internalListLimit** | **Integer** | maximum number of elements within internal arrays optional field you can use this field to limit the number of elements within the following arrays: top_domains text_categories page_categories countries languages default value: 1 maximum value: 20 |  [optional] |
|**dateFrom** | **String** | starting date of the time range required field date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field if you don’t specify this field, today’s date will be used by default date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**dateGroup** | **String** | time range which will be used to group the results optional field default value: month possible values: day, week, month |  [optional] |
|**initialDatasetFilters** | **List&lt;Object&gt;** | initial dataset filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, like,not_like, has, has_not, match, not_match you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;domain\&quot;,\&quot;&lt;&gt;\&quot;, \&quot;logitech.com\&quot;] [[\&quot;domain\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;logitech.com\&quot;],\&quot;and\&quot;,[\&quot;content_info.connotation_types.negative\&quot;,\&quot;&gt;\&quot;,1000]] [[\&quot;domain\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;logitech.com\&quot;]], \&quot;and\&quot;, [[\&quot;content_info.connotation_types.negative\&quot;,\&quot;&gt;\&quot;,1000], \&quot;or\&quot;, [\&quot;content_info.text_category\&quot;,\&quot;has\&quot;,10994]]] for more information about filters, please refer to Content Analysis API – Filters |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



