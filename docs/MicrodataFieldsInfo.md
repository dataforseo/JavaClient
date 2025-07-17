# MicrodataFieldsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**name** | **String** | field name<br>name of the data field |[optional]|
**types** | **List<String>** | list of microdata types |[optional]|
**value** | **String** | microdata value<br>microdata value specified on a target web page |[optional]|
**testResults** | **MessageInfo** | microdata validation test results<br>sub-type microdata test results that contain detected errors and related messages |[optional]|
**fields** | **List<MicrodataFieldsInfo>** | microdata fields<br>an array of objects containing data fields related to the certain microdata type |[optional]|