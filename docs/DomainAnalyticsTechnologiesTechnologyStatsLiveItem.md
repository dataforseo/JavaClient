# DomainAnalyticsTechnologiesTechnologyStatsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**date** | **String** | date for which the data is provided |[optional]|
**domainsCount** | **Long** | number of domains that use the specified technology |[optional]|
**countries** | **Map<String, Long>** | distribution of websites by country<br>contains country codes and number of websites per country |[optional]|
**languages** | **Map<String, Long>** | distribution of websites by language<br>contains language codes and number of websites per language |[optional]|
**domainsRank** | **Map<String, Long>** | distribution of websites by backlink rank<br>contains domain rank ranges and number of websites per range<br>learn more about rank and how it is calculated in this help center article |[optional]|