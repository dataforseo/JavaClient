# HotelReviewInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**value** | **Double** | overall hotel rating based on customer votes |[optional]|
**votesCount** | **Long** | number of customer votes<br>the number of customer votes included in the calculation of the hotel rating |[optional]|
**mentions** | **List<ReviewMentionInfo>** | hotel mentions<br>information about hotel reviews by criteria |[optional]|
**ratingDistribution** | **Map<String, Integer>** | rating distribution by votes<br>the distribution of votes across the rating in the range from 1 to 5 |[optional]|
**otherSitesReviews** | **List<OtherSitesReviewsInfo>** | reviews on third-party sites<br>reviews from third-paty sites |[optional]|