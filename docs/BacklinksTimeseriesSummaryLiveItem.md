# BacklinksTimeseriesSummaryLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**date** | **String** | <em>date and time when the data for the target was stored</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**rank** | **Integer** | <em><code>target</code> rank for the given <code>date</code></em><br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a> |[optional]|
**backlinks** | **Long** | <em>number of backlinks for the given <code>date</code></em> |[optional]|
**backlinksNofollow** | **Long** | <em>number of nofollow backlinks for the given <code>date</code></em> |[optional]|
**referringPages** | **Long** | <em>number of pages pointing to <code>target</code> for the given <code>date</code></em> |[optional]|
**referringPagesNofollow** | **Long** | <em>number of referring pages pointing at least one nofollow link to the <code>target</code> for the given <code>date</code></em> |[optional]|
**referringDomains** | **Long** | <em>number of referring domains for the given <code>date</code></em><br>referring domains include subdomains that are counted as separate domains for this metric |[optional]|
**referringDomainsNofollow** | **Long** | <em>number of domains pointing at least one nofollow link to the <code>target</code> for the given <code>date</code></em> |[optional]|
**referringMainDomains** | **Long** | <em>number of referring main domains for the given <code>date</code></em> |[optional]|
**referringMainDomainsNofollow** | **Long** | <em>number of main domains pointing at least one nofollow link to the <code>target</code> for the given <code>date</code></em> |[optional]|
**referringIps** | **Long** | <em>number of referring IP addresses for the given <code>date</code></em><br>number of IP addresses pointing to this page |[optional]|
**referringSubnets** | **Long** | <em>number of referring subnetworks for the given <code>date</code></em> |[optional]|