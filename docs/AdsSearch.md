# AdsSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**advertiserId** | **String** | unique identifier of the advertiser account |[optional]|
**creativeId** | **String** | unique identifier of the advertisement |[optional]|
**title** | **String** | title of the element |[optional]|
**url** | **String** | search URL with refinement parameters |[optional]|
**verified** | **Boolean** | verified advertiser account<br>equals true if advertiser account is verified by Google Ads |[optional]|
**format** | **String** | format of the advertisement<br>possible values: text, image, video |[optional]|
**previewImage** | **PreviewImage** | preview image of the advertisement |[optional]|
**previewUrl** | **String** | url pointing to the ad preview |[optional]|
**firstShown** | **String** | date and time when the ad was shown for the first time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” |[optional]|
**lastShown** | **String** | date and time when the ad was shown the last time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” |[optional]|