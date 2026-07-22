# WaterfallResourceInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**resourceType** | **String** |  |[optional]|
**url** | **String** | resource URL |[optional]|
**initiator** | **String** | resource initiator |[optional]|
**durationTime** | **Integer** | total time it takes until a browser receives a complete response from a server (in milliseconds) |[optional]|
**fetchStart** | **Integer** | time to start downloading the HTML resource<br>the amount of time the browser needs to start downloading a page |[optional]|
**fetchEnd** | **Integer** | time to complete downloading the HTML resource<br>the amount of time the browser needs to complete downloading a page |[optional]|
**location** | **OnPageResourceLocationInfo** | location of the resource in the document<br>parameters defining the location of the specific resource within the document’s HTML |[optional]|
**isRenderBlocking** | **Boolean** | indicates whether the resource blocks rendering |[optional]|