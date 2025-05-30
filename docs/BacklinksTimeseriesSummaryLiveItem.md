

# BacklinksTimeseriesSummaryLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**date** | **String** | date and time when the data for the target was stored in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**rank** | **BigDecimal** | target rank for the given date learn more about the metric and how it is calculated in this help center article |  [optional] |
|**backlinks** | **BigDecimal** | number of backlinks for the given date |  [optional] |
|**backlinksNofollow** | **BigDecimal** | number of nofollow backlinks for the given date |  [optional] |
|**referringPages** | **BigDecimal** | number of pages pointing to target for the given date |  [optional] |
|**referringPagesNofollow** | **BigDecimal** | number of referring pages pointing at least one nofollow link to the target for the given date |  [optional] |
|**referringDomains** | **BigDecimal** | number of referring domains for the given date referring domains include subdomains that are counted as separate domains for this metric |  [optional] |
|**referringDomainsNofollow** | **BigDecimal** | number of domains pointing at least one nofollow link to the target for the given date |  [optional] |
|**referringMainDomains** | **BigDecimal** | number of referring main domains for the given date |  [optional] |
|**referringMainDomainsNofollow** | **BigDecimal** | number of main domains pointing at least one nofollow link to the target for the given date |  [optional] |
|**referringIps** | **BigDecimal** | number of referring IP addresses for the given date number of IP addresses pointing to this page |  [optional] |
|**referringSubnets** | **BigDecimal** | number of referring subnetworks for the given date |  [optional] |



