

# OnPageKeywordDensityRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the task required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04” |  [optional] |
|**keywordLength** | **Integer** | number of words for a keyword required field possible values: 1, 2, 3, 4, 5 |  [optional] |
|**url** | **String** | page URL optional field if you do not specify a page here, the results will be provided for the whole website if you use this field, the API response will contain only keywords from the specified page a page should be specified with absolute URL (including http:// or https://) |  [optional] |
|**limit** | **Integer** | the maximum number of returned keywords optional field default value: 100 maximum value: 1000 |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &#x3D;, &lt;&gt;, in, not_in, like, not_like you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;keyword\&quot;,\&quot;&#x3D;\&quot;,\&quot;%seo%\&quot;] [[\&quot;keyword\&quot;,\&quot;&#x3D;\&quot;,\&quot;%seo%\&quot;], \&quot;and\&quot;, [\&quot;frequency\&quot;,\&quot;&lt;\&quot;,\&quot;6\&quot;]] [[\&quot;keyword\&quot;,\&quot;not_like\&quot;,\&quot;%seo%\&quot;], \&quot;and\&quot;, [[\&quot;frequency\&quot;,\&quot;&gt;\&quot;,\&quot;6\&quot;],\&quot;or\&quot;,[\&quot;density\&quot;,\&quot;&gt;\&quot;,\&quot;0.02\&quot;]]] The full list of possible filters is available by this link. |  [optional] |
|**orderBy** | **List&lt;String&gt;** | results sorting rules optional field you can use the same values as in the filters array to sort the results possible sorting types: asc – results will be sorted in the ascending order desc – results will be sorted in the descending order you should use a comma to set up a sorting type example: [\&quot;frequency,desc\&quot;] note that you can set no more than three sorting rules in a single request you should use a comma to separate several sorting rules example: [\&quot;keyword,asc\&quot;,\&quot;frequency,desc\&quot;] |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



