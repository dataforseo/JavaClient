

# HotelReviewInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **Float** | overall hotel rating based on customer votes |  [optional] |
|**votesCount** | **BigDecimal** | number of customer votes the number of customer votes included in the calculation of the hotel rating |  [optional] |
|**mentions** | [**List&lt;ReviewMentionInfo&gt;**](ReviewMentionInfo.md) | hotel mentions information about hotel reviews by criteria |  [optional] |
|**ratingDistribution** | **Map&lt;String, Integer&gt;** | rating distribution by votes the distribution of votes across the rating in the range from 1 to 5 |  [optional] |
|**otherSitesReviews** | [**List&lt;OtherSitesReviewsInfo&gt;**](OtherSitesReviewsInfo.md) | reviews on third-party sites reviews from third-paty sites |  [optional] |



