# DomainAnalyticsTechnologiesDomainTechnologiesLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**domain** | **String** | specified domain name |[optional]|
**title** | **String** | domain meta title |[optional]|
**description** | **String** | domain meta description |[optional]|
**metaKeywords** | **List<String>** | domain meta keywords |[optional]|
**domainRank** | **Integer** | backlink rank of the target domain<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**lastVisited** | **String** | most recent date when our crawler visited the domain<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2022-10-10 12:57:46 +00:00 |[optional]|
**countryIsoCode** | **String** | domain ISO code<br>ISO code of the country that the target domain is determined to belong to |[optional]|
**languageCode** | **String** | domain language<br>code of the language that the target domain is determined to be associated with |[optional]|
**contentLanguageCode** | **String** | content language<br>code of the language that content on the target domain is written in |[optional]|
**phoneNumbers** | **List<String>** | phone numbers of the target<br>contact phone numbers indicated on the target website |[optional]|
**emails** | **List<String>** | emails of the target<br>emails indicated on the target website |[optional]|
**socialGraphUrls** | **List<String>** | social media links and handles<br>social media URLs detected in the social graphs of the target website |[optional]|
**technologies** | **TechnologiesInfo** | technologies used by target domain<br>contains objects with the names of technologies used on the website<br>see the full list of available technologies structured by groups and categories |[optional]|