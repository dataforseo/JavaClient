# AggregatedMetricsItemInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**key** | **String** | <em>grouping identifier</em><br>the specific identifier for the grouping dimension |[optional]|
**mentions** | **Integer** | <em>total LLM mentions count</em><br>the number of times the target keyword or domain were mentioned in relation to this specific grouping key |[optional]|
**aiSearchVolume** | **Long** | <em>aggregated AI search volume for mentions within this grouping</em><br>learn more about this metric <a href='https://dataforseo.com/help-center/how-the-ai-search-volume-metric-works-in-llm-mentions' rel='noopener noreferrer' target='_blank'>here</a> |[optional]|