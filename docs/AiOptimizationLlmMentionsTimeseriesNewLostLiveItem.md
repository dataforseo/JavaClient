# AiOptimizationLlmMentionsTimeseriesNewLostLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**date** | **String** | date timestamp<br> date format: 'yyyy-mm-dd' |[optional]|
**newMentions** | **Integer** | new LLM mentions<br>indicates the LLM responses that contain the target at the date_to timestamp, did not contain it at the date_from timestamp |[optional]|
**lostMentions** | **Integer** | lost LLM mentions<br>indicates the LLM responses that contained the specified target at the date_from timestamp, do not contain it at the date_to timestamp |[optional]|
**newAiSearchVolume** | **Long** | ai_search_volume increment<br>indicates the increase of ai_search_volume values between the current timestamp and the previous one<br>learn more about this metric here |[optional]|
**lostAiSearchVolume** | **Long** | ai_search_volume decrement<br>indicates the decrease of ai_search_volume values between the current timestamp and the previous one<br>learn more about this metric here |[optional]|