# Autocomplete


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**relevance** | **Integer** | relevance of suggested keyword<br>represents the relevant of the autocomplete suggestion to the target keyword<br>can take values from 500 to 2000<br>the higher the value, the more relevant is the suggestion<br>Note: only available for the following client:<br>chrome/chrome-omni |[optional]|
**suggestion** | **String** | google autocomplete keyword suggestion |[optional]|
**suggestionType** | **String** | google autocomplete suggestion type<br>Note: only available for the following client:<br>chrome/chrome-omni |[optional]|
**searchQueryUrl** | **String** | url to search results<br>url to search results relevant to the google autocomplete suggestion |[optional]|
**thumbnailUrl** | **String** | url of the thumbnail image<br>url of the thumbnail image of the google autocomplete suggestion<br>Note: only available for the following client:<br>gws-wiz<br>gws-wiz-serp |[optional]|
**highlighted** | **List<String>** | keywords highlighted in autocomplete<br>contains a list of google autocomplete suggestions that are highlighted in the search bar;<br>Note: array is only available for the following client:<br>gws-wiz<br>psy-ab<br>gws-wiz-local |[optional]|