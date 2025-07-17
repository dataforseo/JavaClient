# TripadvisorSearchOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed results<br>absolute position among all reviews on the list |[optional]|
**title** | **String** | name of the business entity |[optional]|
**urlPath** | **String** | URL path of the business entity<br>URL path to the Tripadvisor page of the business entity<br>you can use this identifier to collect reviews for the business entity using Tripadvisor Reviews |[optional]|
**isSponsored** | **Boolean** | indicates a sponsored placement<br>if true, related tripadvisor_search_organic item is a paid advertising on Tripadvisor |[optional]|
**reviewsCount** | **Long** | the total number of reviews |[optional]|
**category** | **String** | place category |[optional]|
**priceRate** | **String** | average price rate |[optional]|
**rating** | **RatingElement** | the rating score of the establishment submitted by the reviewers |[optional]|