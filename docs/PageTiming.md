# PageTiming


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**timeToInteractive** | **Integer** | Time To Interactive (TTI) metricthe time it takes until the user can interact with a page (in milliseconds) |[optional]|
**domComplete** | **Integer** | time to load resourcesthe time it takes until the page and all of its subresources are downloaded (in milliseconds) |[optional]|
**largestContentfulPaint** | **Double** | Core Web Vitals metric measuring how fast the largest above-the-fold content element is displayedThe amount of time (in milliseconds) to render the largest content element visible in the viewport, from when the user requests the URL. Learn more. |[optional]|
**firstInputDelay** | **Double** | Core Web Vitals metric indicating the responsiveness of a pageThe time (in milliseconds) from when a user first interacts with your page to the time when the browser responds to that interaction. Learn more. |[optional]|
**connectionTime** | **Integer** | time to connect to a serverthe time it takes until the connection with a server is established (in milliseconds) |[optional]|
**timeToSecureConnection** | **Integer** | time to establish a secure connectionthe time it takes until the secure connection with a server is established (in milliseconds) |[optional]|
**requestSentTime** | **Integer** | time to send a request to a serverthe time it takes until the request to a server is sent (in milliseconds) |[optional]|
**waitingTime** | **Integer** | time to first byte (TTFB) in milliseconds |[optional]|
**downloadTime** | **Integer** | time it takes for a browser to receive a response (in milliseconds) |[optional]|
**durationTime** | **Integer** | total time it takes until a browser receives a complete response from a server (in milliseconds) |[optional]|
**fetchStart** | **Integer** | time to start downloading the HTML resourcethe amount of time the browser needs to start downloading a page |[optional]|
**fetchEnd** | **Integer** | time to complete downloading the HTML resourcethe amount of time the browser needs to complete downloading a page |[optional]|