# OnPageRedirectChainsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**isRedirectLoop** | **Boolean** | <em>indicates if redirects in <code>chain</code> start and end at the same URL</em><br>if <code>true</code>, the last URL from the chain redirects back to the original URL |[optional]|
**chain** | **List<OnPageRedirectLinkItem>** | <em>contains links that form a chain</em> |[optional]|