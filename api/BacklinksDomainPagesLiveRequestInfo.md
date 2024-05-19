

# BacklinksDomainPagesLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | domain or subdomain required field a domain or a subdomain should be specified without https:// and www. example: forbes.com |  [optional] |
|**limit** | **Integer** | the maximum number of returned pages optional field default value: 100 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned pages optional field default value: 0 if you specify the 10 value, the first ten pages in the results array will be omitted and the data will be provided for the successive pages |  [optional] |
|**internalListLimit** | **Integer** | maximum number of elements within internal arrays optional field you can use this field to limit the number of elements within the following arrays: referring_links_tld referring_links_types referring_links_attributes referring_links_platform_types referring_links_semantic_locations default value: 10 maximum value: 1000 |  [optional] |
|**backlinksStatusType** | **String** | set what backlinks to return and count optional field you can use this field to choose what backlinks will be returned and used for aggregated metrics; possible values: all – all backlinks will be returned and counted; live – backlinks found during the last check will be returned and counted; lost – lost backlinks will be returned and counted; default value: live |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &#x3D;, &lt;&gt;, in, not_in, like, not_like, ilike, not_ilike you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;meta.internal_links_count\&quot;,\&quot;&gt;\&quot;,\&quot;1\&quot;] [[\&quot;meta.external_links_count\&quot;,\&quot;&gt;\&quot;,\&quot;2\&quot;], \&quot;and\&quot;, [\&quot;backlinks\&quot;,\&quot;&gt;\&quot;,\&quot;10\&quot;]] [[\&quot;first_visited\&quot;,\&quot;&gt;\&quot;,\&quot;2017-10-23 11:31:45 +00:00\&quot;], \&quot;and\&quot;, [[\&quot;title\&quot;,\&quot;like\&quot;,\&quot;%seo%\&quot;],\&quot;or\&quot;,[\&quot;referring_domains\&quot;,\&quot;&gt;\&quot;,\&quot;10\&quot;]]] The full list of possible filters is available here. |  [optional] |
|**orderBy** | **List&lt;String&gt;** | results sorting rules optional field you can use the same values as in the filters array to sort the results possible sorting types: asc – results will be sorted in the ascending order desc – results will be sorted in the descending order you should use a comma to set up a sorting type example: [\&quot;page_summary.backlinks,desc\&quot;] note that you can set no more than three sorting rules in a single request you should use a comma to separate several sorting rules example: [\&quot;page_summary.backlinks,desc\&quot;,\&quot;page_summary.rank,asc\&quot;] |  [optional] |
|**backlinksFilters** | **List&lt;Object&gt;** | filter the backlinks of your target optional field you can use this field to filter the initial backlinks that will be included in the dataset for aggregated metrics for your target you can filter the backlinks by all fields available in the response of this endpoint using this parameter, you can include only dofollow backlinks in the response and create a flexible backlinks dataset to calculate the metrics for example: \&quot;backlinks_filters\&quot;: [\&quot;dofollow\&quot;, \&quot;&#x3D;\&quot;, true] |  [optional] |
|**includeSubdomains** | **Boolean** | indicates if the subdomains of the target will be included in the search optional field if set to false, the subdomains will be ignored default value: true |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



