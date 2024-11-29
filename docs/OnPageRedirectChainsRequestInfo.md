

# OnPageRedirectChainsRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the task required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04” |  [optional] |
|**url** | **String** | page URL optional field absolute URL of the target page if you use this field, the API response will return only redirect chains which contain the specified URL |  [optional] |
|**limit** | **Integer** | the maximum number of returned redirect chains optional field default value: 100 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned redirect chains optional field default value: 0 if you specify the 10 value, the first ten redirect chains in the results array will be omitted and the data will be provided for the successive redirect chains |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can use only one filtering parameter with this endpoint the following filtering parameter is supported: is_redirect_loop the following operators are supported: regex, not_regex, &#x3D;, &lt;&gt; examples: [\&quot;is_redirect_loop\&quot;,\&quot;&#x3D;\&quot;,\&quot;true\&quot;] [\&quot;is_redirect_loop\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;false\&quot;] |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



