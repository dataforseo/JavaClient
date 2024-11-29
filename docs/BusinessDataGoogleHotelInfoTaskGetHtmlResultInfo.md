

# BusinessDataGoogleHotelInfoTaskGetHtmlResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | identifier received in a POST array this field will contain the hotel_identifier parameter specified when setting a task; example: CgoI-KWyzenM_MV3EAE |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;HtmlItem&gt;**](HtmlItem.md) | HTML pages |  [optional] |
|**type** | **String** |  |  [optional] |
|**seDomain** | **String** |  |  [optional] |



