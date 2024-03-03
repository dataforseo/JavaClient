

# ContentGenerationTextSummaryLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | target text required field can contain from 1 to 10000 tokens learn more about tokens on our help center |  [optional] |
|**languageName** | **String** | name of the text language required field if you do not specify language_code see the List of Languages for Content Generation Text Summary API |  [optional] |
|**languageCode** | **String** | code of the text language required field if you do not specify language_name see the List of Languages for Content Generation Text Summary API |  [optional] |
|**internalListLimit** | **Integer** | maximum number of elements within internal arrays optional field you can use this field to limit the number of elements within the keyword_density array default value: 10 |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |



