# GoogleShoppingSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | domain of the URL<br>domain of the URL where a special offer is posted |[optional]|
**title** | **String** | title of the element |[optional]|
**description** | **String** | description of the product in Google Shopping SERP |[optional]|
**url** | **String** | URL pointing at special offer page<br>URL where a special offer is posted |[optional]|
**shoppingUrl** | **String** | URL to the product page on Google Shopping |[optional]|
**tags** | **List<String>** | tags assigned to the product |[optional]|
**price** | **Double** | product price<br>example:<br>384.99 |[optional]|
**priceMultiplier** | **Integer** | price multiplier for instalment plan<br>indicates the number of months covered by the monthly payment for the product |[optional]|
**oldPrice** | **Double** | product old price<br>displayed if the product price has been changed<br>example:<br>499 |[optional]|
**currency** | **String** | currency in the ISO format<br>example:<br>USD |[optional]|
**productId** | **String** | unique product identifier on Google Shopping<br>note that there is no full list of possible values as the product_id is a dynamic value assigned by Google<br>if there are no values, you will get null<br>example:<br>4485466949985702538<br>learn more about the parameter in this help center guide |[optional]|
**dataDocid** | **String** | unique identifier of the SERP data element<br>note that there is no full list of possible values as the data_docid is a dynamic value assigned by Google<br>example:<br>17363035694596624076 |[optional]|
**seller** | **String** | name of the seller<br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**additionalSpecifications** | **Map<String, String>** | object containing additional url parameters<br>you can get more details about the product by using this object in the POST request to the Google Shopping Product Specification and Google Shopping Sellers endpoint |[optional]|
**reviewsCount** | **Long** | number of product reviews<br>indicates the number of reviews left by users on Google Shopping<br>if there are no values, you will get null |[optional]|
**isBestMatch** | **Boolean** | “best match” label<br>if the value is true, the product is marked with the “best match” label<br>if there are no values, you will get null |[optional]|
**productRating** | **RatingElement** | product rating<br>the product popularity rate based on product reviews |[optional]|
**shopRating** | **RatingElement** | shop rating<br>the popularity rate of the seller based on user reviews |[optional]|
**productImages** | **List<String>** | URLs to the images of the product<br>the first URL in the array is the featured image of the product |[optional]|
**shopAdAclk** | **String** | unique ad click referral parameter<br>using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |[optional]|
**gid** | **String** | global product identifier on Google Shopping<br>note that there is no full list of possible values as the gid is a dynamic value assigned by Google<br>if there are no values, you will get null<br>example:<br>4702526954592161872<br>learn more about gid parameter in this help center guide |[optional]|
**deliveryInfo** | **DeliveryInfo** | delivery information<br>delivery information including free and fast delivery date ranges |[optional]|
**storesCountInfo** | **StoresCountInfo** | stores count information<br>contains information about the number of stores that offer the same product |[optional]|