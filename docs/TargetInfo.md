# TargetInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**server** | **String** | <em>server</em> |[optional]|
**cms** | **String** | <em>content management system</em> |[optional]|
**platformType** | **List<String>** | <em>platform type</em> |[optional]|
**ipAddress** | **String** | <em>IP address of the <code>target</code></em> |[optional]|
**country** | **String** | <em>country code that the <code>target</code> domain is determined to belong to</em> |[optional]|
**isIp** | **Boolean** | <em>indicates if the <code>target</code> is IP</em><br>if <code>true</code>, the domain, subdomain or webpage functions as an IP address and does not have a domain name |[optional]|
**targetSpamScore** | **Integer** | <em>spam score of the <code>target</code></em><br>if the <code>target</code> is a domain/subdomain, this fields indicates the average spam score of all pages of that domain/subdomain;<br>learn more about how the metric is calculated on <a href='https://dataforseo.com/help-center/what-is-spam-score-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>this help center page</a> |[optional]|