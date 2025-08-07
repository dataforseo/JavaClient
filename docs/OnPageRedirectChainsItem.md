# OnPageRedirectChainsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**isRedirectLoop** | **Boolean** | indicates if redirects in chain start and end at the same URL<br>if true, the last URL from the chain redirects back to the original URL |[optional]|
**chain** | **List<OnPageRedirectLinkItem>** | contains links that form a chain |[optional]|