[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# OnPageNonIndexableRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the task required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04” |  [optional] |
|**limit** | **Integer** | the maximum number of returned pages optional field default value: 100 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned pages optional field default value: 0 if you specify the 10 value, the first ten pages in the results array will be omitted and the data will be provided for the successive pages |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, like, not_like you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;reason\&quot;,\&quot;&#x3D;\&quot;,\&quot;robots_txt\&quot;][[\&quot;reason\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;robots_txt\&quot;], \&quot;and\&quot;, [\&quot;url\&quot;,\&quot;not_like\&quot;,\&quot;%/wp-admin/%\&quot;]] [[\&quot;url\&quot;,\&quot;not_like\&quot;,\&quot;%/wp-admin/%\&quot;], \&quot;and\&quot;, [[\&quot;reason\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;meta_tag\&quot;],\&quot;or\&quot;,[\&quot;reason\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;http_header\&quot;]]] The full list of possible filters is available by this link. |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")