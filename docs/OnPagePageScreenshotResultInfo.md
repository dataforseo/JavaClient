# OnPagePageScreenshotResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**errorMessage** | **String** | <em>error message</em><br>if the <code>url</code> you indicated returns a 404 status code or is not a valid URL, you will obtain <code>'error_message':'Screenshot is empty'</code><br>if no error is encountered, the value will be <code>null</code> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**items** | **List<ScreenshotItem>** | <em>items array</em> |[optional]|