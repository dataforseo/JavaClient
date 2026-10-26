# OnPageInstantPagesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling sessionpossible values: in_progress, finished |[optional]|
**crawlStatus** | **Object** | details of the crawling sessionin this case the value will be null |[optional]|
**crawlGatewayAddress** | **String** | crawler ip addressdisplays the IP address used by the crawler to initiate the current crawling sessionyou can find the full list of IPs used by our crawler in the Overview section |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**items** | **List<BaseOnPageResourceItem>** | items array |[optional]|