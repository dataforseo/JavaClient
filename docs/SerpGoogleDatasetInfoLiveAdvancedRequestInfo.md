# SerpGoogleDatasetInfoLiveAdvancedRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**datasetId** | **String** | ID of the datasetrequired fieldyou can find dataset ID in the dataset URL or dataset item of Google Dataset Search resultexample:L2cvMTFqbl85ZHN6MQ== |[optional]|
**languageCode** | **String** | search engine language codeoptional fieldif you use this field, you don't need to specify language_namepossible value:en |[optional]|
**device** | **String** | device typeoptional fieldreturn results for a specific device typepossible value: desktop |[optional]|
**languageName** | **String** | full name of search engine languageoptional fieldif you use this field, you don't need to specify language_codepossible value:English |[optional]|
**os** | **String** | device operating systemoptional fieldpossible values: windows, macosdefault value: windows |[optional]|
**tag** | **String** | user-defined task identifieroptional fieldthe character limit is 255you can use this parameter to identify the task and match it with the resultyou will find the specified tag value in the data object of the response |[optional]|