[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# BacklinksBulkNewLostReferringDomainsLiveRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targets** | **List&lt;String&gt;** | domains, subdomains or webpages to get  new &amp; lost referring domains for required field you can set up to 1000 domains, subdomains or webpages the domain or subdomain should be specified without https:// and www. the page should be specified with absolute URL (including http:// or https://) example: \&quot;targets\&quot;: [   \&quot;forbes.com\&quot;,   \&quot;cnn.com\&quot;,   \&quot;bbc.com\&quot;,   \&quot;yelp.com\&quot;,   \&quot;https://www.apple.com/iphone/\&quot;,   \&quot;https://ahrefs.com/blog/\&quot;,   \&quot;ibm.com\&quot;,   \&quot;https://variety.com/\&quot;,   \&quot;https://stackoverflow.com/\&quot;,   \&quot;www.trustpilot.com\&quot; ] |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field this field indicates the date which will be used as a threshold for new and lost referring domains; the referring domains that appeared in our index after the specified date will be considered as new; the referring domains that weren’t found after the specified date, but were present before, will be considered as lost; default value: today’s date -(minus) one month; e.g. if today is 2021-10-13, default date_from will be 2021-09-13. minimum value equals today’s date -(minus) one year; e.g. if today is 2021-10-13, minimum date_from will be 2020-10-13. date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2021-01-01\&quot; |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")