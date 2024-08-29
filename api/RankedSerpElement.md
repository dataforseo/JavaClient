

# RankedSerpElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**serpItem** | [**BaseDataforseoLabsSerpElementItem**](BaseDataforseoLabsSerpElementItem.md) |  |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**serpItemTypes** | **List&lt;String&gt;** | types of search results in SERP contains types of search results (items) found in SERP possible item types: answer_box, app, carousel, multi_carousel, featured_snippet, google_flights, google_reviews, images, jobs, knowledge_graph, local_pack, map, organic, paid, people_also_ask, related_searches, people_also_search, shopping, top_stories, twitter, video, events, mention_carousel, recipes, top_sights, scholarly_articles, popular_products, podcasts, questions_and_answers, find_results_on, stocks_box; note that the actual results will be returned only for organic, paid, featured_snippet, and local_pack elements |  [optional] |
|**seResultsCount** | **String** | number of search results for the returned keyword |  [optional] |
|**keywordDifficulty** | **Integer** | difficulty of ranking in the first top-10 organic results for a keyword indicates the chance of getting in top-10 organic results for a keyword on a logarithmic scale from 0 to 100; calculated by analysing, among other parameters, link profiles of the first 10 pages in SERP; learn more about the metric in this help center guide |  [optional] |
|**isLost** | **Boolean** | lost ranked elements indicates how many ranked elements of this domain were previously presented in SERPs, but weren’t found during the last check |  [optional] |
|**lastUpdatedTime** | **String** | date and time when search intent data was last updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**previousUpdatedTime** | **String** | previous to the most recent date and time when SERP data was updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-10-15 12:57:46 +00:00 |  [optional] |



