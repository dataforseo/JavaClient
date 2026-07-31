# BusinessDataTrustpilotReviewsTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | <em>domain of the business entity</em> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**title** | **String** | <em>title of the 'reviews' element on Trustpilot</em><br>the name of the business entity for which the reviews are collected |[optional]|
**location** | **String** | <em>location of the business entity as specified on Trustpilot</em><br>address of the business entity for which the reviews are collected |[optional]|
**reviewsCount** | **String** | <em>the total number of reviews</em> |[optional]|
**rating** | **Object** | <em>rating of the corresponding business entity</em><br>popularity rate based on reviews and displayed in SERP |[optional]|
**itemsCount** | **Long** | <em>the number of items in the results array</em><br>you can get more results by using the <code>depth</code> parameter when setting a task |[optional]|
**items** | **List<TrustpilotReviewSearch>** | <em>found reviews</em><br>you can get more results by using the <code>depth</code> parameter when setting a task |[optional]|