# AiModeAiOverviewPaidElementInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>title of the element in SERP</em> |[optional]|
**url** | **String** | <em>reference page URL</em> |[optional]|
**domain** | **String** | <em>domain name of the reference</em> |[optional]|
**adAclk** | **String** | <em>unique ad click referral parameter</em><br>using this parameter you can get a URL of the advertisement in <a href='https://docs.dataforseo.com/v3/merchant/google/sellers/ad_url/' rel='noopener noreferrer' target='_blank'>Google Shopping Sellers Ad URL</a> |[optional]|
**websiteName** | **String** | <em>displayed name of the advertiser's website</em> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb path displayed in the ad</em> |[optional]|
**snippet** | **String** | <em>description text of the ad</em> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images present in the ad</em><br>if there are none, equals <code>null</code> |[optional]|