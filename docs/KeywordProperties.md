

# KeywordProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**coreKeyword** | **String** | main keyword in a group contains the main keyword in a group determined by the synonym clustering algorithm if the value is null, our database does not contain any keywords the corresponding algorithm could identify as synonymous with keyword |  [optional] |
|**synonymClusteringAlgorithm** | **String** | the algorithm used to identify synonyms possible values: keyword_metrics – indicates the algorithm based on keyword_info parameters text_processing – indicates the text-based algorithm if the value is null, our database does not contain any keywords the corresponding algorithm could identify as synonymous with keyword |  [optional] |
|**keywordDifficulty** | **BigDecimal** | difficulty of ranking in the first top-10 organic results for a keyword indicates the chance of getting in top-10 organic results for a keyword on a logarithmic scale from 0 to 100; calculated by analysing, among other parameters, link profiles of the first 10 pages in SERP; learn more about the metric in this help center guide |  [optional] |
|**detectedLanguage** | **String** | detected language of the keyword indicates the language of the keyword as identified by our system |  [optional] |
|**isAnotherLanguage** | **Boolean** | detected language of the keyword is different from the set language if true, the language set in the request does not match the language determined by our system for a given keyword |  [optional] |



