

# OnPageWaterfallItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageUrl** | **String** | URL of the page |  [optional] |
|**timeToInteractive** | **Integer** | Time To Interactive (TTI) metric the time it takes until the user can interact with a page (in milliseconds) |  [optional] |
|**domComplete** | **Integer** | time to load resources the time it takes until the page and all of its subresources are downloaded (in milliseconds) |  [optional] |
|**connectionTime** | **Integer** | time to connect to a server the time it takes until the connection with a server is established (in milliseconds) |  [optional] |
|**timeToSecureConnection** | **Integer** | time to establish a secure connection the time it takes until the secure connection with a server is established (in milliseconds) |  [optional] |
|**requestSentTime** | **Integer** | time to send a request to a server the time it takes until the request to a server is sent (in milliseconds) |  [optional] |
|**waitingTime** | **Integer** | time to first byte (TTFB) in milliseconds |  [optional] |
|**downloadTime** | **Integer** | time it takes for a browser to receive a response (in milliseconds) |  [optional] |
|**durationTime** | **Integer** | total time it takes until a browser receives a complete response from a server (in milliseconds) |  [optional] |
|**fetchStart** | **Integer** | time to start downloading the HTML resource the amount of time the browser needs to start downloading a page |  [optional] |
|**fetchEnd** | **Integer** | time to complete downloading the HTML resource the amount of time the browser needs to complete downloading a page |  [optional] |
|**resources** | [**List&lt;BaseOnPageResourceItemInfo&gt;**](BaseOnPageResourceItemInfo.md) | resource-specific timing contains separate arrays with timing for each resource found on the page |  [optional] |



