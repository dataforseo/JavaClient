# AdsSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**advertiserId** | **String** | <em>unique identifier of the advertiser account</em> |[optional]|
**creativeId** | **String** | <em>unique identifier of the advertisement</em> |[optional]|
**title** | **String** | <em>title of the element</em> |[optional]|
**url** | **String** | <em>search URL with refinement parameters</em> |[optional]|
**verified** | **Boolean** | <em>verified advertiser account</em><br>equals <code>true</code> if advertiser account is verified by Google Ads |[optional]|
**format** | **String** | <em>format of the advertisement</em><br>possible values: <code>text</code>, <code>image</code>, <code>video</code> |[optional]|
**previewImage** | **PreviewImage** | <em>preview image of the advertisement</em> |[optional]|
**previewUrl** | **String** | <em>url pointing to the ad preview</em> |[optional]|
**firstShown** | **String** | <em>date and time when the ad was shown for the first time</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” |[optional]|
**lastShown** | **String** | <em>date and time when the ad was shown the last time</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” |[optional]|