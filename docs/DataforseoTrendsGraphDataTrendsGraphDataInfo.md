# DataforseoTrendsGraphDataTrendsGraphDataInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**dateFrom** | **String** | start date of the corresponding time range<br>in the UTC format: “yyyy-mm-dd” |[optional]|
**dateTo** | **String** | end date of the corresponding time range<br>in the UTC format: “yyyy-mm-dd” |[optional]|
**timestamp** | **Integer** | a point in time in the Unix time format |[optional]|
**values** | **List<Integer>** | relative keyword popularity rate at a specific timestamp<br>represents the keyword popularity rate over the given time range<br>if you specify more than one keyword, the values will be averaged to the highest value across all specified keywords<br>a value of 100 is the peak popularity for the term. A value of 50 means that the term is half as popular. A score of 0 means there was not enough data for this term |[optional]|