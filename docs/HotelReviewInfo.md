# HotelReviewInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**value** | **Double** | <em>overall hotel rating based on customer votes</em> |[optional]|
**votesCount** | **Long** | <em>number of customer votes</em><br>the number of customer votes included in the calculation of the hotel rating |[optional]|
**mentions** | **List<ReviewMentionInfo>** | <em>hotel mentions</em><br>information about hotel reviews by criteria |[optional]|
**ratingDistribution** | **Map<String, Integer>** | <em>rating distribution by votes</em><br>the distribution of votes across the rating in the range from 1 to 5 |[optional]|
**otherSitesReviews** | **List<OtherSitesReviewsInfo>** | <em>reviews on third-party sites</em><br>reviews from third-party sites |[optional]|