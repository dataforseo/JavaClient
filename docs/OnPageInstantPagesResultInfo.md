# OnPageInstantPagesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**crawlProgress** | **String** | <em>status of the crawling session</em><br>possible values: <code>in_progress</code>, <code>finished</code> |[optional]|
**crawlStatus** | **Object** | <em>details of the crawling session</em><br>in this case the value will be <code>null</code> |[optional]|
**crawlGatewayAddress** | **String** | <em>crawler ip address</em><br>displays the IP address used by the crawler to initiate the current crawling session<br>you can find the full list of IPs used by our crawler in the <a href='/v3/on_page/overview' target='_blank' rel='noopener noreferrer'>Overview section</a> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**items** | **List<BaseOnPageResourceItem>** | <em>items array</em> |[optional]|