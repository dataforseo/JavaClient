# FeaturedSnippetSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements found in SERP<br>note values are returned in the ascending order, with values corresponding to advanced SERP features omitted from the results;<br>to get all items (including SERP features and rich snippets) with their positions, please refer to the Google Organiс Advanced SERP endpoint |[optional]|
**domain** | **String** | domain of the ad element in SERP |[optional]|
**title** | **String** | title of the ad element in SERP |[optional]|
**description** | **String** | description of the ad element in SERP |[optional]|
**url** | **String** | relevant URL of the ad element in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb of the ad element in SERP |[optional]|
**featuredTitle** | **String** | title |[optional]|
**timestamp** | **String** | date and time when the result was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**images** | **List<AiModeImagesElement>** | images of the element |[optional]|
**table** | **Table** | results table<br>if there are none, equals null |[optional]|