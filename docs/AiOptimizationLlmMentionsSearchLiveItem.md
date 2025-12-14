# AiOptimizationLlmMentionsSearchLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**platform** | **String** | platform received in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**question** | **String** | relevant question |[optional]|
**answer** | **String** | relevant answer in markdown format<br>content of the result formatted in the markdown markup language |[optional]|
**sources** | **List<Sources>** | array of sources<br>the sources the model cited or relied on in its final answer |[optional]|
**searchResults** | **List<SearchResults>** | array of search results<br>all web search outputs the model retrieved when looking up information, including duplicates and unused entries |[optional]|
**aiSearchVolume** | **Long** | current AI search volume rate of a keyword<br>learn more about this metric here |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** |  |[optional]|
**firstResponseAt** | **String** | date and time when the response data was first recorded<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2025-10-21 06:25:30 +00:00 |[optional]|
**lastResponseAt** | **String** | date and time when the response data was last updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2025-10-21 06:25:30 +00:00 |[optional]|
**brandEntities** | **List<BrandEntities>** | array of brand entities<br>contains information on brands mentioned in the response |[optional]|
**fanOutQueries** | **List<String>** | array of fan-out queries<br>contains related search queries derived from the main query to provide a more comprehensive response |[optional]|