# AiOptimizationLlmMentionsTimeseriesNewLostLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**date** | **String** | <em>date timestamp</em><br> date format: <code>'yyyy-mm-dd'</code> |[optional]|
**newMentions** | **Integer** | <em>new LLM mentions</em><br>indicates the LLM responses that contain the target at the <code>date_to</code> timestamp, did not contain it at the <code>date_from</code> timestamp |[optional]|
**lostMentions** | **Integer** | <em>lost LLM mentions</em><br>indicates the LLM responses that contained the specified target at the <code>date_from</code> timestamp, do not contain it at the <code>date_to</code> timestamp |[optional]|
**newAiSearchVolume** | **Long** | <em>ai_search_volume increment</em><br>indicates the increase of <code>ai_search_volume</code> values between the current timestamp and the previous one<br>learn more about this metric <a href='https://dataforseo.com/help-center/how-ai-search-volume-metrics-work-in-the-llm-mentions-timeseries-endpoints' rel='noopener noreferrer' target='_blank'>here</a> |[optional]|
**lostAiSearchVolume** | **Long** | <em>ai_search_volume decrement</em><br>indicates the decrease of <code>ai_search_volume</code> values between the current timestamp and the previous one<br>learn more about this metric <a href='https://dataforseo.com/help-center/how-ai-search-volume-metrics-work-in-the-llm-mentions-timeseries-endpoints' rel='noopener noreferrer' target='_blank'>here</a> |[optional]|