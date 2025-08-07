# OnPageInstantPagesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | status of the crawling session<br>possible values: in_progress, finished |[optional]|
**crawlStatus** | **CrawlStatusInfo** | details of the crawling session<br>in this case the value will be null |[optional]|
**crawlGatewayAddress** | **String** | crawler ip address<br>displays the IP address used by the crawler to initiate the current crawling session<br>you can find the full list of IPs used by our crawler in the Overview section |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**items** | **List<OnPageStylesheetResourceItem>** | items array |[optional]|