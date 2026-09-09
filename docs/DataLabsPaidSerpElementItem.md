# DataLabsPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | <em>title of the result in SERP</em> |[optional]|
**domain** | **String** | <em>subdomain in SERP</em> |[optional]|
**description** | **String** | <em>description of the results element in SERP</em> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb in SERP</em> |[optional]|
**url** | **String** | <em> relevant URL in SERP</em> |[optional]|
**highlighted** | **List<String>** | <em>words highlighted in bold within the results <code>description</code></em> |[optional]|
**extra** | **Map<String, String>** |  |[optional]|
**descriptionRows** | **List<String>** | <em>extended description</em><br>            if there is none, equals <code>null</code> |[optional]|
**links** | **List<AdLinkElement>** | <em>sitelinks</em><br>            the links shown below some of Google's search results<br>            if there are none, equals <code>null</code> |[optional]|
**mainDomain** | **String** | <em>primary domain name in SERP</em> |[optional]|
**relativeUrl** | **String** | <em>URL in SERP that does not specify the HTTPs protocol and domain name</em> |[optional]|
**etv** | **Double** | <em>estimated traffic volume</em><br>            estimated organic monthly traffic to the domain<br>            calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword<br>            learn more about how the metric is calculated in <a href='https://dataforseo.com/help-center/how-is-etv-calculated' rel='noopener noreferrer' target='_blank'>this help center article</a> |[optional]|
**estimatedPaidTrafficCost** | **Double** | <em>estimated cost of converting organic search traffic into paid</em><br>            represents the estimated monthly cost of running ads (USD) for the returned keyword<br>            the metric is calculated as the product of organic <code>etv</code> and paid <code>cpc</code> values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search<br>            learn more about how the metric is calculated in <a href='https://dataforseo.com/help-center/how-is-traffic-cost-calculated' rel='noopener noreferrer' target='_blank'>this help center article</a> |[optional]|
**clickstreamEtv** | **Double** | <em>estimated traffic volume based on clickstream data</em><br>            calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for<br>            to retrieve results for this field, the parameter <code>include_clickstream_data</code> must be set to <code>true</code><br>            learn more about how the metric is calculated in this <a href='https://dataforseo.com/help-center/whats-clickstream-estimated-traffic-volume-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>help center article</a> |[optional]|
**rankChanges** | **RankChanges** | <em>changes in rankings</em><br>            contains information about the ranking changes of the SERP element since the <code>previous_updated_time</code> |[optional]|
**backlinksInfo** | **BacklinksInfo** | <em>backlinks information for the ranked website</em> |[optional]|
**rankInfo** | **RankInfo** | <em>page and domain rank information</em> |[optional]|