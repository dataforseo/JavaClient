# DataforseoLabsSerpCompetitorsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**domain** | **String** | domain name of the detected SERP competitor |[optional]|
**avgPosition** | **Float** | the average position of the domain for the specified keywords<br>the arithmetic mean of values in the keywords_positions array |[optional]|
**medianPosition** | **Double** | the median position of the domain for the specified keywords<br>the median of the values in the keywords_positions array |[optional]|
**rating** | **Double** | the margin between the greatest possible and actual keyword positions<br>represents the relative visibility rate of the domain in SERP for the specified keywords<br>calculated as sum(100-keywords_positions) |[optional]|
**etv** | **Double** | estimated traffic volume<br>represents the estimated monthly traffic that specified keywords are driving to the website<br>calculated as the sum of the products of the specified keywords’ search volume values and CTR (click-through-rate) rates at certain positions in SERP<br>learn more about how the metric is calculated in this help center article |[optional]|
**keywordsCount** | **Long** | the number of specified keywords the domain has positions for in SERPs |[optional]|
**visibility** | **Double** | SERP visibility rate<br>represents the website visibility rate based on the SERP positions of the specified keywords<br>Keywords with positions in the range from 1 to 10 are assigned the visibility index from 1 to 0.1, respectively<br>Keywords with positions in the range from 11 to 20 have the fixed visibility index of 0.05<br>keywords with positions from 20 to 100 have the visibility index equal to 0 |[optional]|
**relevantSerpItems** | **Integer** | the number of SERP elements relevant to the domain<br>represents the number of search results in SERP relevant to the domain for the specified keywords |[optional]|
**keywordsPositions** | **Map<String, List<Integer>>** | keyword positions<br>SERP positions the related domain holds in SERP for the specified keywords |[optional]|