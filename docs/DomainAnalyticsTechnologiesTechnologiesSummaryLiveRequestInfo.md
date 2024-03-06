[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**technologyPaths** | **List&lt;String&gt;** | target technology paths required field if you don’t specify groups, technologies and categories if you use this field, you don’t need to specify groups, technologies and categories each technology path should be specified as a separate object containing “path” and “name”, where “path” is specified as “$group_id.$category_id” and “name” – as the name of the target technology; each object with a technology path should be separated with a comma you can find the full list of technology group ids, category ids and technology names on this page note: you can specify up to 10 technology paths in this array example: [{\&quot;path\&quot;: \&quot;content.cms\&quot;,\&quot;name\&quot;: \&quot;wordpress\&quot;}, {\&quot;path\&quot;: \&quot;marketing.crm\&quot;,\&quot;name\&quot;: \&quot;salesforce\&quot;}] |  [optional] |
|**groups** | **List&lt;String&gt;** | ids of the target technology groups required field if you don’t specify technologies or categories you can find the full list of technology group ids on this page note: you can specify up to 10 technology groups in this array example: [\&quot;sales\&quot;, \&quot;marketing\&quot;] |  [optional] |
|**categories** | **List&lt;String&gt;** | ids of the target technology categories required field if you don’t specify groups or technologies you can find the full list of technology category ids on this page note: you can specify up to 10 technology categories in this array example: [\&quot;payment_processors\&quot;,\&quot;crm\&quot;] |  [optional] |
|**technologies** | **List&lt;String&gt;** | target technologies required field if you don’t specify groups or categories you can find the full list of technologies you can specify here on this page note: you can specify up to 10 technologies in this array example: [\&quot;Google Pay\&quot;,\&quot;Salesforce\&quot;] |  [optional] |
|**keywords** | **List&lt;String&gt;** | target keywords in the domain’s title, description or meta keywords optional field UTF-8 encoding each keyword should be at least 3 characters long example: [\&quot;seo\&quot;,\&quot;software\&quot;] |  [optional] |
|**mode** | **String** | search mode optional field possible search mode types: as_is – search for results exactly matching the specified group ids, category ids, or technology names entry – search for results matching a part of the specified group ids, category ids, or technology names default value: as_is |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, like,not_like you can use the % operator with like and not_like to match any string of zero or more characters you can use the following parameters to filter the results: domain_rank, last_visited, country_iso_code, language_code, content_language_code example: [[\&quot;country_iso_code\&quot;,\&quot;&#x3D;\&quot;,\&quot;US\&quot;], \&quot;and\&quot;, [\&quot;domain_rank\&quot;,\&quot;&gt;\&quot;,800]] for more information about filters, please refer to Domain Analytics Technologies API – Filters |  [optional] |
|**internalListLimit** | **Integer** | maximum number of elements within internal arrays optional field you can use this field to limit the number of elements within the following arrays: countries, languages, content_languages, keywords default value: 10 maximum value: 10000 |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")