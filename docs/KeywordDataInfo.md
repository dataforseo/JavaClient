# KeywordDataInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**keyword** | **String** | returned keyword idea |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**keywordInfo** | **KeywordInfo** | keyword data for the returned keyword idea |[optional]|
**keywordInfoNormalizedWithBing** | **KeywordInfoNormalizedWithInfo** | contains keyword search volume normalized with Bing search volume |[optional]|
**keywordInfoNormalizedWithClickstream** | **KeywordInfoNormalizedWithInfo** | contains keyword search volume normalized with clickstream data |[optional]|
**clickstreamKeywordInfo** | **ClickstreamKeywordInfo** | clickstream data for the returned keyword<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true |[optional]|
**keywordProperties** | **KeywordProperties** | additional information about the keyword |[optional]|
**serpInfo** | **SerpInfo** | SERP data<br>the value will be null if you didn’t set the field include_serp_info to true in the POST array or if there is no SERP data for this keyword in our database |[optional]|
**avgBacklinksInfo** | **AvgBacklinksInfo** | backlink data for the returned keyword<br>this object provides the average number of backlinks, referring pages and domains, as well as the average rank values among the top-10 webpages ranking organically for the keyword |[optional]|
**searchIntentInfo** | **SearchIntentInfo** | search intent info for the returned keyword<br>learn about search intent in this help center article |[optional]|