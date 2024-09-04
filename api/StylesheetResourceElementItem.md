

# StylesheetResourceElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meta** | [**ResourceMetaInfo**](ResourceMetaInfo.md) |  |  [optional] |
|**fetchTiming** | [**FetchTiming**](FetchTiming.md) |  |  [optional] |
|**acceptType** | **String** | indicates the expected type of resource for example, if \&quot;resource_type\&quot;: \&quot;broken\&quot;, accept_type will indicate the type of the broken resource possible values: any, none, image, sitemap, robots, script, stylesheet, redirect, html, text, other, font |  [optional] |
|**initiator** | **String** | resource initiator |  [optional] |
|**durationTime** | **Integer** | total time it takes until a browser receives a complete response from a server (in milliseconds) |  [optional] |
|**fetchStart** | **Integer** | time to start downloading the resource the amount of time the browser needs to start downloading a resource |  [optional] |
|**fetchEnd** | **Integer** | time to complete downloading the resource the amount of time the browser needs to complete downloading a resource |  [optional] |
|**isRenderBlocking** | **Boolean** | indicates whether the resource blocks rendering |  [optional] |



