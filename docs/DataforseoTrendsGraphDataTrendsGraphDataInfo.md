# DataforseoTrendsGraphDataTrendsGraphDataInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**dateFrom** | **String** | <em>start date of the corresponding time range</em><br>in the UTC format: 'yyyy-mm-dd' |[optional]|
**dateTo** | **String** | <em>end date of the corresponding time range</em><br>in the UTC format: 'yyyy-mm-dd' |[optional]|
**timestamp** | **Integer** | <em>a point in time in the <a href='https://en.wikipedia.org/wiki/Unix_time'>Unix time format</a></em> |[optional]|
**values** | **List<Integer>** | <em>relative keyword popularity rate at a specific timestamp</em><br>represents the keyword popularity rate over the given time range<br><strong>if you specify more than one keyword, the values will be averaged to the highest value across all specified keywords</strong><br>a value of 100 is the peak popularity for the term. A value of 50 means that the term is half as popular. A score of 0 means there was not enough data for this term |[optional]|