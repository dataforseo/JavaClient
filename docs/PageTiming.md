

# PageTiming


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeToInteractive** | **BigDecimal** | Time To Interactive (TTI) metric the time it takes until the user can interact with a page (in milliseconds) |  [optional] |
|**domComplete** | **BigDecimal** | time to load resources the time it takes until the page and all of its subresources are downloaded (in milliseconds) |  [optional] |
|**largestContentfulPaint** | **Float** | Core Web Vitals metric measuring how fast the largest above-the-fold content element is displayed The amount of time (in milliseconds) to render the largest content element visible in the viewport, from when the user requests the URL. Learn more. |  [optional] |
|**firstInputDelay** | **Float** | Core Web Vitals metric indicating the responsiveness of a page The time (in milliseconds) from when a user first interacts with your page to the time when the browser responds to that interaction. Learn more. |  [optional] |
|**connectionTime** | **BigDecimal** | time to connect to a server the time it takes until the connection with a server is established (in milliseconds) |  [optional] |
|**timeToSecureConnection** | **BigDecimal** | time to establish a secure connection the time it takes until the secure connection with a server is established (in milliseconds) |  [optional] |
|**requestSentTime** | **BigDecimal** | time to send a request to a server the time it takes until the request to a server is sent (in milliseconds) |  [optional] |
|**waitingTime** | **BigDecimal** | time to first byte (TTFB) in milliseconds |  [optional] |
|**downloadTime** | **BigDecimal** | time it takes for a browser to receive a response (in milliseconds) |  [optional] |
|**durationTime** | **BigDecimal** | total time it takes until a browser receives a complete response from a server (in milliseconds) |  [optional] |
|**fetchStart** | **BigDecimal** | time to start downloading the HTML resource the amount of time the browser needs to start downloading a page |  [optional] |
|**fetchEnd** | **BigDecimal** | time to complete downloading the HTML resource the amount of time the browser needs to complete downloading a page |  [optional] |



