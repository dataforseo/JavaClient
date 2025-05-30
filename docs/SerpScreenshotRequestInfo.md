

# SerpScreenshotRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskId** | **String** | task identifier required field unique identifier of the associated task in the UUID format you will be able to use it within 7 days to request the results of the task at any time |  [optional] |
|**browserPreset** | **String** | browser resolution preset optional field browser preset associated with a certain device type can take the following values: desktop, tablet, mobile note: by default, browser preset corresponds to the device type specified in the POST request |  [optional] |
|**browserScreenWidth** | **Long** | width of the browser resolution optional field can be specified in the following range: 240-9999 |  [optional] |
|**browserScreenHeight** | **Integer** | height of the browser resolution optional field can be specified in the following range: 240-9999 |  [optional] |
|**browserScreenScaleFactor** | **Float** | browser scale factor optional field can be specified in the following range: 0.5-3 |  [optional] |
|**page** | **Integer** | number of SERP pages optional field if depth in the corresponding Task POST request exceeds 100 results (or 1 SERP page), specify the number of SERP pages to screenshot; default value: 1 |  [optional] |



