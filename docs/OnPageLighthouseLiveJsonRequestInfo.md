

# OnPageLighthouseLiveJsonRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | target URL required field target page should be specified with its absolute URL (including http:// or https://) example: https://dataforseo.com/ |  [optional] |
|**forMobile** | **Boolean** | applies mobile emulation optional field if set to true, Lighthouse will use mobile device and screen emulation to test the page against mobile environment if set to false, the results will be provided for desktop default value: false |  [optional] |
|**categories** | **List&lt;String&gt;** | categories of Lighthouse audits optional field each category is a collection of audits and audit groups that applies weighting and scoring to the section (see official definition) if you ignore this field, we will return data for all categories unless you specify audits use this field to get data for specific categories you indicate here possible values: seo, pwa, performance, best_practices, accessibility |  [optional] |
|**audits** | **List&lt;String&gt;** | Lighthouse audits optional field audits are individual tests Lighthouse runs for each specific feature/optimization/metric to produce a numeric score (see official definition);   if you ignore this field, we will return data for all audits; use this field to get data for specific audits you indicate here; Note: that some audits do not belong to a specific category and are stand-alone page quality measurements; in general, there can be several use cases: 1. if you ignore categories, you can use this field to get data for the specified audits only for example, if you ignore \&quot;categories\&quot; and specify \&quot;audits\&quot;: [\&quot;metrics/cumulative-layout-shift\&quot;,\&quot;metrics/largest-contentful-paint\&quot;,\&quot;metrics/total-blocking-time\&quot;], you will get data only for these audits 2. if you specify a category, you can use this field to additionally receive audits that do not belong to the category(-ies) you specified for example, if you specify \&quot;categories\&quot;: [\&quot;seo\&quot;] and \&quot;audits\&quot;: [\&quot;metrics/cumulative-layout-shift\&quot;,\&quot;metrics/largest-contentful-paint\&quot;,\&quot;metrics/total-blocking-time\&quot;], you will get only these audits under “performance” and all audits under “seo” you can get the full list of possible audits here |  [optional] |
|**version** | **String** | lighthouse version optional field you can obtain the results specific to a certain Lighthouse version by specifying its number the list of available versions is available through the Lighthouse Versions endpoint |  [optional] |
|**languageName** | **String** | lighthouse language name optional field you can receive the list of available languages of the search engine with their language_name by making a separate request to https://api.dataforseo.com/v3/on_page/lighthouse/languages default value: English |  [optional] |
|**languageCode** | **String** | lighthouse language code optional field you can receive the list of available languages of the search engine with their language_code by making a separate request to https://api.dataforseo.com/v3/on_page/lighthouse/languages default value: en |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



