# TargetInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**server** | **String** | server |[optional]|
**cms** | **String** | content management system |[optional]|
**platformType** | **List<String>** | platform type |[optional]|
**ipAddress** | **String** | IP address of the target |[optional]|
**country** | **String** | country code that the target domain is determined to belong to |[optional]|
**isIp** | **Boolean** | indicates if the target is IP<br>if true, the domain, subdomain or webpage functions as an IP address and does not have a domain name |[optional]|
**targetSpamScore** | **Integer** | spam score of the target<br>if the target is a domain/subdomain, this fields indicates the average spam score of all pages of that domain/subdomain;<br>learn more about how the metric is calculated on this help center page |[optional]|