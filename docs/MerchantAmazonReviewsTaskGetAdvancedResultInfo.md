# MerchantAmazonReviewsTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**asin** | **String** | asin received in a POST array |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine<br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**title** | **String** | title of the product on Amazon<br>the title of the product for which the reviews are collected |[optional]|
**image** | **AiModeImagesElementInfo** | product image data |[optional]|
**rating** | **RatingElement** | rating of the product on Amazon<br>popularity rate based on reviews and displayed in SERP |[optional]|
**reviewsCount** | **Long** | the total number of reviews |[optional]|
**itemTypes** | **List<String>** | type of search results in Amazon SERP<br>contains types of search results (items) found in Amazon SERP;<br>possible item types:<br>amazon_review_item |[optional]|
**itemsCount** | **Long** | the number of reviews items in the results array<br>you can get more results by using the depth parameter when setting a task |[optional]|
**items** | **List<AmazonReviewItem>** | found reviews<br>you can get more results by using the depth parameter when setting a task |[optional]|