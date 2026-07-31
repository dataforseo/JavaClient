# TripadvisorSearchOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed results</em><br>absolute position among all reviews on the list |[optional]|
**title** | **String** | <em>name of the business entity</em> |[optional]|
**urlPath** | **String** | <em>URL path of the business entity</em><br>URL path to the Tripadvisor page of the business entity<br>you can use this identifier to collect reviews for the business entity using <a href='/v3/business_data/tripadvisor/reviews/task_post/' rel='noopener noreferrer' target='_blank'>Tripadvisor Reviews</a> |[optional]|
**isSponsored** | **Boolean** | <em>indicates a sponsored placement</em><br>if <code>true</code>, related <code>tripadvisor_search_organic</code> item is a paid advertising on Tripadvisor |[optional]|
**reviewsCount** | **Long** | <em>the total number of reviews</em> |[optional]|
**category** | **String** | <em>place category</em> |[optional]|
**priceRate** | **String** | <em>average price rate</em> |[optional]|
**rating** | **RatingInfo** | <em>the rating score of the establishment submitted by the reviewers</em> |[optional]|