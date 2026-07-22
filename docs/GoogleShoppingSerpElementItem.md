# GoogleShoppingSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | domain of the URLdomain of the URL where a special offer is postedNote: this field is deprecated and will return null |[optional]|
**title** | **String** | title of the element |[optional]|
**description** | **String** | description of the product in Google Shopping SERP |[optional]|
**url** | **String** | URL pointing at special offer pageURL where a special offer is postedNote: this field is deprecated and will return null |[optional]|
**shoppingUrl** | **String** | URL to the product page on Google Shopping |[optional]|
**tags** | **List<String>** | tags assigned to the product |[optional]|
**price** | **Double** | product priceexample:384.99 |[optional]|
**priceMultiplier** | **Integer** | price multiplier for instalment planindicates the number of months covered by the monthly payment for the product |[optional]|
**oldPrice** | **Double** | product old pricedisplayed if the product price has been changedexample:499 |[optional]|
**currency** | **String** | currency in the ISO formatexample:USD |[optional]|
**productId** | **String** | unique product identifier on Google Shoppingnote that there is no full list of possible values as the product_id is a dynamic value assigned by Googleif there are no values, you will get nullexample:4485466949985702538learn more about the parameter in this help center guide |[optional]|
**dataDocid** | **String** | unique identifier of the SERP data elementnote that there is no full list of possible values as the data_docid is a dynamic value assigned by Googleexample:17363035694596624076 |[optional]|
**seller** | **String** | name of the sellerthe name of the company that placed a corresponding product on Google Shopping |[optional]|
**additionalSpecifications** | **Map<String, String>** | object containing additional url parametersyou can get more details about the product by using this object in the POST request to the Google Shopping Product Specification and Google Shopping Sellers endpoint |[optional]|
**reviewsCount** | **Long** | number of product reviewsindicates the number of reviews left by users on Google Shoppingif there are no values, you will get null |[optional]|
**isBestMatch** | **Boolean** | 'best match' labelif the value is true, the product is marked with the 'best match' labelif there are no values, you will get null |[optional]|
**productRating** | **RatingElement** | product ratingthe product popularity rate based on product reviews |[optional]|
**shopRating** | **RatingElement** | shop ratingthe popularity rate of the seller based on user reviews |[optional]|
**productImages** | **List<String>** | URLs to the images of the productthe first URL in the array is the featured image of the product |[optional]|
**shopAdAclk** | **String** | unique ad click referral parameterusing this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |[optional]|
**gid** | **String** | global product identifier on Google Shoppingnote that there is no full list of possible values as the gid is a dynamic value assigned by Googleif there are no values, you will get nullexample:4702526954592161872learn more about gid parameter in this help center guide |[optional]|
**deliveryInfo** | **DeliveryInfo** | delivery informationdelivery information including free and fast delivery date ranges |[optional]|
**storesCountInfo** | **StoresCountInfo** | stores count informationcontains information about the number of stores that offer the same product |[optional]|