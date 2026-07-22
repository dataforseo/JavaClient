# AiOptimizationLlmMentionsSearchMentionsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**platform** | **String** | platform received in a POST array |[optional]|
**modelName** | **String** | name of the AI model from which the data was retrieved<br>Note: for the google platform type, the value is always google_ai_overview |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**question** | **String** | relevant question |[optional]|
**answer** | **String** | relevant answer in markdown format<br>content of the result formatted in the markdown markup language |[optional]|
**sources** | **List<Sources>** | array of sources<br>the sources the model cited or relied on in its final answer<br>learn more about the sources and how to retrieve LLM citation data at our Help Center |[optional]|
**searchResults** | **List<SearchResults>** | array of search results<br>all web search outputs the model retrieved when looking up information, including duplicates and unused entries |[optional]|
**aiSearchVolume** | **Long** | current AI search volume rate of a keyword<br>learn more about this metric here |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly AI search volume rates<br>array of objects with AI search volume rates in a certain month of a year |[optional]|
**firstResponseAt** | **String** | date and time when the response data was first recorded<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2025-10-21 06:25:30 +00:00 |[optional]|
**lastResponseAt** | **String** | date and time when the response data was last updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2025-10-21 06:25:30 +00:00 |[optional]|
**brandEntities** | **List<BrandEntities>** | array of brand entities<br>contains information on brands mentioned in the response |[optional]|
**fanOutQueries** | **List<String>** | array of fan-out queries<br>contains related search queries derived from the main query to provide a more comprehensive response |[optional]|
**isWebSearchBased** | **Boolean** | indicates whether the response was generated using web search results<br>if true, the model retrieved live web search results to produce the response<br>if false, the response was generated from the model's internal knowledge |[optional]|