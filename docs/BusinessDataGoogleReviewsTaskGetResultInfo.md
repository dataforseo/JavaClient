# BusinessDataGoogleReviewsTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**title** | **String** | title of the ‘reviews’ element in SERP<br>the name of the local establishment for which the reviews are collected |[optional]|
**subTitle** | **String** | subtitle of the ‘reviews’ element in SERP<br>additional information (e.g., address) on the ‘reviews’ element for which the reviews are collected |[optional]|
**rating** | **RatingElement** | rating of the corresponding local establishment<br>popularity rate based on reviews and displayed in SERP |[optional]|
**featureId** | **String** | the unique identifier of the ‘reviews’ element in SERP<br>learn more about the identifier in this help center article |[optional]|
**placeId** | **String** | unique identifier of a business location assigned by Google<br>learn more about the identifier in this help center article |[optional]|
**cid** | **String** | google-defined client id<br>unique id of a local establishment<br>learn more about the identifier in this help center article |[optional]|
**reviewsCount** | **Long** | the total number of reviews |[optional]|
**itemsCount** | **Long** | the number of reviews items in the results array<br>you can get more results by using the depth parameter when setting a task |[optional]|
**items** | **List<GoogleReviewsSearch>** | found reviews<br>you can get more results by using the depth parameter when setting a task |[optional]|