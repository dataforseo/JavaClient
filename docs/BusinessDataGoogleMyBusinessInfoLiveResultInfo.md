# BusinessDataGoogleMyBusinessInfoLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character)<br>this field will contain the cid parameter if you specified it in the keyword field when setting a task;<br>example:<br>cid:2946633002421908862<br>learn more about the parameter in this help center article |[optional]|
**seDomain** | **String** | search engine domain as specified in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemTypes** | **List<String>** | item types<br>types of search engine results encountered in the items array;<br>possible item types: google_business_info |[optional]|
**itemsCount** | **Long** | item types<br>the number of items in the items array |[optional]|
**items** | **List<ItemsGoogleBusinessInfo>** | encountered item types<br>types of search engine results encountered in the items array;<br>possible item types: google_business_info |[optional]|