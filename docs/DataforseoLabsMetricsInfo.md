

# DataforseoLabsMetricsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pos1** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #1 |  [optional] |
|**pos23** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #2-3 |  [optional] |
|**pos410** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #4-10 |  [optional] |
|**pos1120** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #11-20 |  [optional] |
|**pos2130** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #21-30 |  [optional] |
|**pos3140** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #31-40 |  [optional] |
|**pos4150** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #41-50 |  [optional] |
|**pos5160** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #51-60 |  [optional] |
|**pos6170** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #61-70 |  [optional] |
|**pos7180** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #71-80 |  [optional] |
|**pos8190** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #81-90 |  [optional] |
|**pos91100** | **BigDecimal** | number of organic SERPs where the domain or subdomain ranks #91-100 |  [optional] |
|**etv** | **Float** | estimated traffic volume estimated organic monthly traffic to the domain or subdomain calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the domain or subdomain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**count** | **BigDecimal** | total count of organic SERPs that contain the domain or subdomain |  [optional] |
|**estimatedPaidTrafficCost** | **Float** | estimated cost of converting organic search traffic into paid represents the estimated monthly cost (USD) of running ads for all keywords in the category that the domain or subdomain ranks for the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search learn more about how the metric is calculated in this help center article |  [optional] |
|**isNew** | **BigDecimal** | number of new ranked elements indicates how many new ranked elements were found for the indicated target |  [optional] |
|**isUp** | **BigDecimal** | rank went up indicates how many ranked elements of the indicated target went up |  [optional] |
|**isDown** | **BigDecimal** | rank went down indicates how many ranked elements of the indicated target went down |  [optional] |
|**isLost** | **BigDecimal** | lost ranked elements indicates how many ranked elements of the indicated target were previously presented in SERPs, but weren’t found during the last check |  [optional] |
|**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for to retrieve results for this field, the parameter include_clickstream_data must be set to true learn more about how the metric is calculated in this help center article |  [optional] |
|**clickstreamGenderDistribution** | **Map&lt;String, Long&gt;** | distribution of estimated clickstream-based metrics by gender to retrieve results for this field, the parameter include_clickstream_data must be set to true learn more about how the metric is calculated in this help center article |  [optional] |
|**clickstreamAgeDistribution** | **Map&lt;String, Long&gt;** | distribution of clickstream-based metrics by age to retrieve results for this field, the parameter include_clickstream_data must be set to true learn more about how the metric is calculated in this help center article |  [optional] |



