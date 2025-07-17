# DataforseoLabsMetricsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**pos1** | **Integer** | number of organic SERPs where the domain or subdomain ranks #1 |[optional]|
**pos23** | **Integer** | number of organic SERPs where the domain or subdomain ranks #2-3 |[optional]|
**pos410** | **Integer** | number of organic SERPs where the domain or subdomain ranks #4-10 |[optional]|
**pos1120** | **Integer** | number of organic SERPs where the domain or subdomain ranks #11-20 |[optional]|
**pos2130** | **Integer** | number of organic SERPs where the domain or subdomain ranks #21-30 |[optional]|
**pos3140** | **Integer** | number of organic SERPs where the domain or subdomain ranks #31-40 |[optional]|
**pos4150** | **Integer** | number of organic SERPs where the domain or subdomain ranks #41-50 |[optional]|
**pos5160** | **Integer** | number of organic SERPs where the domain or subdomain ranks #51-60 |[optional]|
**pos6170** | **Integer** | number of organic SERPs where the domain or subdomain ranks #61-70 |[optional]|
**pos7180** | **Integer** | number of organic SERPs where the domain or subdomain ranks #71-80 |[optional]|
**pos8190** | **Integer** | number of organic SERPs where the domain or subdomain ranks #81-90 |[optional]|
**pos91100** | **Integer** | number of organic SERPs where the domain or subdomain ranks #91-100 |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated organic monthly traffic to the domain or subdomain<br>calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the domain or subdomain ranks for<br>learn more about how the metric is calculated in this help center article |[optional]|
**count** | **Long** | total count of organic SERPs that contain the domain or subdomain |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of converting organic search traffic into paid<br>represents the estimated monthly cost (USD) of running ads for all keywords in the category that the domain or subdomain ranks for<br>the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search<br>learn more about how the metric is calculated in this help center article |[optional]|
**isNew** | **Integer** | number of new ranked elements<br>indicates how many new ranked elements were found for the indicated target |[optional]|
**isUp** | **Integer** | rank went up<br>indicates how many ranked elements of the indicated target went up |[optional]|
**isDown** | **Integer** | rank went down<br>indicates how many ranked elements of the indicated target went down |[optional]|
**isLost** | **Integer** | lost ranked elements<br>indicates how many ranked elements of the indicated target were previously presented in SERPs, but weren’t found during the last check |[optional]|
**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data<br>calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamGenderDistribution** | **Map<String, Long>** | distribution of estimated clickstream-based metrics by gender<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamAgeDistribution** | **Map<String, Long>** | distribution of clickstream-based metrics by age<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true<br>learn more about how the metric is calculated in this help center article |[optional]|