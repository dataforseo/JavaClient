

# DataforseoLabsGoogleHistoricalSerpsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**keyword** | **String** | keyword obtained as a result of search engine autocorrection the results will be provided for the corrected keyword |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of search results in SERP contains types of search results (items) found in SERP. possible item types: answer_box, carousel, multi_carousel, featured_snippet, google_flights, google_reviews, google_posts, images, jobs, knowledge_graph, local_pack, hotels_pack, map, organic, paid, people_also_ask, related_searches, people_also_search, shopping, top_stories, twitter, video, events, mention_carousel, recipes, top_sights, scholarly_articles, popular_products, podcasts, questions_and_answers, find_results_on, stocks_box, visual_stories, commercial_units,  local_services, google_hotels, math_solver |  [optional] |
|**seResultsCount** | **Long** | total number of results in SERP |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseDataforseoLabsSerpElementItem&gt;**](BaseDataforseoLabsSerpElementItem.md) | additional items present in the element if there are none, equals null |  [optional] |
|**clickstreamEtv** | **Integer** | estimated traffic volume based on clickstream data calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for to retrieve results for this field, the parameter include_clickstream_data must be set to true learn more about how the metric is calculated in this help center article https://dataforseo.com/help-center/whats-clickstream-estimated-traffic-volume-and-how-is-it-calculated |  [optional] |



