# ContentGenerationParaphraseLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**text** | **String** | target text<br>required field<br>can contain from 1 to 500 tokens<br>learn more about tokens on our help center |[optional]|
**creativityIndex** | **Double** | creativity of content generation<br>required field<br>the randomness of the selection of equally probable subsequent tokens;<br>can take values from 0 to 1;<br>default value: 0.8<br>learn more about this parameter on our help center |[optional]|
**tag** | **String** | user-defined task identifier<br>optional field<br>the character limit is 255<br>you can use this parameter to identify the task and match it with the result<br>you will find the specified tag value in the data object of the response |[optional]|