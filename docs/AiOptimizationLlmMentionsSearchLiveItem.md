# AiOptimizationLlmMentionsSearchLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**platform** | **String** | platform received in a POST array |[optional]|
**modelName** | **String** | name of the AI model from which the data was retrievedNote: for the google platform type, the value is always google_ai_overview |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**question** | **String** | relevant question |[optional]|
**answer** | **String** | relevant answer in markdown formatcontent of the result formatted in the markdown markup language |[optional]|
**sources** | **List<Sources>** | array of sourcesthe sources the model cited or relied on in its final answer |[optional]|
**searchResults** | **List<SearchResults>** | array of search resultsall web search outputs the model retrieved when looking up information, including duplicates and unused entries |[optional]|
**aiSearchVolume** | **Long** | current AI search volume rate of a keywordlearn more about this metric here |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly AI search volume ratesarray of objects with AI search volume rates in a certain month of a year |[optional]|
**firstResponseAt** | **String** | date and time when the response data was first recordedin the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”example:2025-10-21 06:25:30 +00:00 |[optional]|
**lastResponseAt** | **String** | date and time when the response data was last updatedin the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”example:2025-10-21 06:25:30 +00:00 |[optional]|
**brandEntities** | **List<BrandEntities>** | array of brand entitiescontains information on brands mentioned in the response |[optional]|
**fanOutQueries** | **List<String>** | array of fan-out queriescontains related search queries derived from the main query to provide a more comprehensive response |[optional]|