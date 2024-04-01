

# AutocompleteSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**relevance** | **Integer** | relevance of suggested keyword represents the relevant of the autocomplete suggestion to the target keyword can take values from 500 to 2000 the higher the value, the more relevant is the suggestion Note: only available for the following client: chrome/chrome-omni |  [optional] |
|**suggestion** | **String** | google autocomplete keyword suggestion |  [optional] |
|**suggestionType** | **String** | google autocomplete suggestion type Note: only available for the following client: chrome/chrome-omni |  [optional] |
|**searchQueryUrl** | **String** | url to search results url to search results relevant to the google autocomplete suggestion |  [optional] |
|**highlighted** | **List&lt;String&gt;** |  |  [optional] |



