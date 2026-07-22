# MetricsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**pos1** | **Integer** | number of organic SERPs where the domain ranks #1 |[optional]|
**pos23** | **Integer** | number of organic SERPs where the domain ranks #2-3 |[optional]|
**pos410** | **Integer** | number of organic SERPs where the domain ranks #4-10 |[optional]|
**pos1120** | **Integer** | number of organic SERPs where the domain ranks #11-20 |[optional]|
**pos2130** | **Integer** | number of organic SERPs where the domain ranks #21-30 |[optional]|
**pos3140** | **Integer** | number of organic SERPs where the domain ranks #31-40 |[optional]|
**pos4150** | **Integer** | number of organic SERPs where the domain ranks #41-50 |[optional]|
**pos5160** | **Integer** | number of organic SERPs where the domain ranks #51-60 |[optional]|
**pos6170** | **Integer** | number of organic SERPs where the domain ranks #61-70 |[optional]|
**pos7180** | **Integer** | number of organic SERPs where the domain ranks #71-80 |[optional]|
**pos8190** | **Integer** | number of organic SERPs where the domain ranks #81-90 |[optional]|
**pos91100** | **Integer** | number of organic SERPs where the domain ranks #91-100 |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated organic monthly traffic to the domain<br>calculated as the product of CTR (click-through-rate) and search volume values of all keywords the domain ranks for<br>learn more about how the metric is calculated in this help center article |[optional]|
**count** | **Long** | total count of organic SERPs that contain the domain |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of converting organic search traffic into paid<br>represents the estimated monthly cost of running ads (USD) for all keywords a domain ranks for<br>the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search<br>learn more about how the metric is calculated in this help center article |[optional]|
**isNew** | **Long** | number of new ranked elements<br>indicates how many new ranked elements were found for this domain |[optional]|
**isUp** | **Long** | rank went up<br>indicates how many ranked elements of this domain went up in Google Search |[optional]|
**isDown** | **Long** | rank went down<br>indicates how many ranked elements of this domain went down in Google Search |[optional]|
**isLost** | **Long** | lost ranked elements<br>indicates how many ranked elements of this domain were previously presented in SERPs, but weren’t found during the last check |[optional]|