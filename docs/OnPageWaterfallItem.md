# OnPageWaterfallItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**pageUrl** | **String** | <em>URL of the page</em> |[optional]|
**timeToInteractive** | **Integer** | <em><a href='https://web.dev/interactive/'>Time To Interactive (TTI)</a> metric</em><br>the time it takes until the user can interact with a page (in milliseconds) |[optional]|
**domComplete** | **Integer** | <em>time to load resources</em><br>the time it takes until the page and all of its subresources are downloaded (in milliseconds) |[optional]|
**connectionTime** | **Integer** | <em>time to connect to a server</em><br>the time it takes until the connection with a server is established (in milliseconds) |[optional]|
**timeToSecureConnection** | **Integer** | <em>time to establish a secure connection</em><br>the time it takes until the secure connection with a server is established (in milliseconds) |[optional]|
**requestSentTime** | **Integer** | <em>time to send a request to a server</em><br>the time it takes until the request to a server is sent (in milliseconds) |[optional]|
**waitingTime** | **Integer** | <em>time to first byte <a href='https://en.wikipedia.org/wiki/Time_to_first_byte'>(TTFB)</a> in milliseconds</em> |[optional]|
**downloadTime** | **Integer** | <em>time it takes for a browser to receive a response (in milliseconds)</em> |[optional]|
**durationTime** | **Integer** | <em>total time it takes until a browser receives a complete response from a server (in milliseconds)</em> |[optional]|
**fetchStart** | **Integer** | <em>time to start downloading the HTML resource</em><br>the amount of time the browser needs to start downloading a page |[optional]|
**fetchEnd** | **Integer** | <em>time to complete downloading the HTML resource</em><br>the amount of time the browser needs to complete downloading a page |[optional]|
**resources** | **List<WaterfallResourceInfo>** | <em>resource-specific timing</em><br>contains separate arrays with timing for each resource found on the page |[optional]|