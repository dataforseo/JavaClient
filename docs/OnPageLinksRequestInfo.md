

# OnPageLinksRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the task required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04” |  [optional] |
|**pageFrom** | **String** | relative page URL optional field if you use this field, the API response will contain only links from the specified page note that in this field you can specify relative URLs only |  [optional] |
|**pageTo** | **String** | relative page URL optional field if you use this field, the API response will contain only internal links pointing to the specified page note that in this field you can specify relative URLs only |  [optional] |
|**limit** | **Integer** | the maximum number of returned links optional field default value: 100 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned links optional field default value: 0 if you specify the 10 value, the first ten links in the results array will be omitted and the data will be provided for the successive links |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &#x3D;, &lt;&gt;, in, not_in, like, not_like you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;direction\&quot;,\&quot;&#x3D;\&quot;,\&quot;external\&quot;] [[\&quot;domain_to\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;example.com\&quot;], \&quot;and\&quot;, [\&quot;link_from\&quot;,\&quot;not_like\&quot;,\&quot;%example.com/blog%\&quot;]] [[\&quot;direction\&quot;,\&quot;&#x3D;\&quot;,\&quot;external\&quot;], \&quot;and\&quot;, [[\&quot;link_from\&quot;,\&quot;like\&quot;,\&quot;%example.com/blog%\&quot;],\&quot;or\&quot;,[\&quot;link_from\&quot;,\&quot;like\&quot;,\&quot;%example.com/help%\&quot;]]] The full list of possible filters is available by this link. |  [optional] |
|**searchAfterToken** | **String** | token for subsequent requests optional field provided in the identical filed of the response to each request; use this parameter to avoid timeouts while trying to obtain over 20,000 results in a single request; by specifying the unique search_after_token value from the response array, you will get the subsequent results of the initial task; search_after_token values are unique for each subsequent task ; Note: if the search_after_token is specified in the request, all other parameters should be identical to the previous request |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



