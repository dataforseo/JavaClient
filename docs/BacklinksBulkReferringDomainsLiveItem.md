# BacklinksBulkReferringDomainsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | domain, subdomain or webpage from a POST array |[optional]|
**referringDomains** | **Long** | number of referring domains pointing to the target<br>note that we calculate main domains (root domains, like example.com) and their subdomains (e.g. blog.example.com) separately for this metric |[optional]|
**referringDomainsNofollow** | **Long** | number of domains pointing at least one nofollow link to the target |[optional]|
**referringMainDomains** | **Long** | number of referring main domains pointing to the target<br>the number of primary (root) domains referring to your target |[optional]|
**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |[optional]|