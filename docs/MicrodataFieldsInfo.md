# MicrodataFieldsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**name** | **String** | <em>field name</em><br>name of the data field |[optional]|
**types** | **List<String>** | list of microdata types |[optional]|
**value** | **String** | microdata value<br>microdata value specified on a target web page |[optional]|
**testResults** | **MessageInfo** | <em>microdata validation test results</em><br>sub-type microdata test results that contain detected errors and related messages |[optional]|
**fields** | **List<MicrodataFieldsInfo>** | <em>microdata fields</em><br>an array of objects containing data fields related to the certain microdata type |[optional]|