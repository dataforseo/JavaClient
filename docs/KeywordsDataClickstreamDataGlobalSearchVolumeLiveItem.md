# KeywordsDataClickstreamDataGlobalSearchVolumeLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword</em><br><strong>keyword is returned with decoded %## (plus symbol '+' will be decoded to a space character)</strong> |[optional]|
**searchVolume** | **Long** | <em>clickstream-based average monthly search volume rate</em><br>represents the (approximate) number of searches for the given keyword idea based on clickstream<br>you can learn more about clickstream search volume in <a href='https://dataforseo.com/help-center/what-is-clickstream-search-volume-and-how-to-get-it-with-dataforseo'>this Help Center article</a> |[optional]|
**countryDistribution** | **List<CountryDistribution>** | <em>distribution of clickstream by countries</em><br>represents clickstream-based search volume in available countries, as well as its respective percentage of global search volume |[optional]|