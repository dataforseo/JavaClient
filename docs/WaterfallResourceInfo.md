# WaterfallResourceInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**resourceType** | **String** |  |[optional]|
**url** | **String** | <em>resource URL</em> |[optional]|
**initiator** | **String** | <em>resource initiator</em> |[optional]|
**durationTime** | **Integer** | <em>total time it takes until a browser receives a complete response from a server (in milliseconds)</em> |[optional]|
**fetchStart** | **Integer** | <em>time to start downloading the HTML resource</em><br>the amount of time the browser needs to start downloading a page |[optional]|
**fetchEnd** | **Integer** | <em>time to complete downloading the HTML resource</em><br>the amount of time the browser needs to complete downloading a page |[optional]|
**location** | **OnPageResourceLocationInfo** | <em>location of the resource in the document</em><br>parameters defining the location of the specific resource within the document's HTML |[optional]|
**isRenderBlocking** | **Boolean** | <em>indicates whether the resource blocks rendering</em> |[optional]|