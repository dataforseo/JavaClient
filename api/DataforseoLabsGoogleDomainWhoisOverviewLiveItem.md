

# DataforseoLabsGoogleDomainWhoisOverviewLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**domain** | **String** | domain name |  [optional] |
|**createdDatetime** | **String** | date and time of registration date and time (in the ISO 8601 format) when the domain was first registered example: \&quot;1997-03-29 03:00:00 +00:00\&quot; |  [optional] |
|**changedDatetime** | **String** | date and time when the domain entry was changed date and time (in the ISO 8601 format) when the domain entry was last modified example: \&quot;2021-01-14 08:36:28 +00:00\&quot; |  [optional] |
|**expirationDatetime** | **String** | date and time when the domain will expire date and time (in the ISO 8601 format) when the domain is due to expire example: \&quot;2022-11-26 17:21:23 +00:00\&quot; |  [optional] |
|**updatedDatetime** | **String** | date and time when the domain was updated date and time (in the ISO 8601 format) when the domain was last updated example: \&quot;2021-01-29 13:59:38 +00:00\&quot; |  [optional] |
|**firstSeen** | **String** | date and time when our crawler found the domain for the first time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: \&quot;2019-11-15 12:57:46 +00:00\&quot; |  [optional] |
|**eppStatusCodes** | **List&lt;String&gt;** | extensive provisioning protocol status codes the status of a domain name registration as defined by ICANN |  [optional] |
|**tld** | **String** | top-level domain top-level domain in the DNS root zone |  [optional] |
|**registered** | **Boolean** | domain registration status if false, the domain name registration has expired Note: expired domains will remain in the database for only a short period of time |  [optional] |
|**registrar** | **String** | domain registrar if null, the domain registrar is unknown example: NameCheap, Inc. |  [optional] |
|**metrics** | [**Map&lt;String, DataforseoLabsMetricsInfo&gt;**](DataforseoLabsMetricsInfo.md) | ranking data relevant to the specified domain |  [optional] |
|**backlinksInfo** | [**BacklinksInfo**](BacklinksInfo.md) |  |  [optional] |



