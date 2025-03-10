

# SerpGoogleOrganicLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array the keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**refinementChips** | [**RefinementChipsInfo**](RefinementChipsInfo.md) |  |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of search results in SERP contains types of search results (items) found in SERP. possible item types: answer_box, app, carousel, multi_carousel, featured_snippet, google_flights, google_reviews, third_party_reviews, google_posts, images, jobs, knowledge_graph, local_pack, hotels_pack, map, organic, paid, people_also_ask, related_searches, people_also_search, shopping, top_stories, twitter, video, events, mention_carousel, recipes, top_sights, scholarly_articles, popular_products, podcasts, questions_and_answers, find_results_on, stocks_box, visual_stories, commercial_units, local_services, google_hotels, math_solver, currency_box, product_considerations, found_on_web, short_videos, refine_products, explore_brands, perspectives, discussions_and_forums, compare_sites, courses, ai_overview |  [optional] |
|**seResultsCount** | **Long** | total number of results in SERP |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseSerpElementItem&gt;**](BaseSerpElementItem.md) | additional items present in the element if there are none, equals null |  [optional] |



