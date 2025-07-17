# BaseOnPageLinkItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**domainFrom** | **String** | referring domain<br>the link was found on this domain |[optional]|
**domainTo** | **String** | referenced domain<br>the link is pointing to this domain |[optional]|
**pageFrom** | **String** | referring page<br>relative URL of the page on which the link was found |[optional]|
**pageTo** | **String** | referenced page<br>relative URL of the page to which the link is pointing |[optional]|
**linkFrom** | **String** | referring page<br>absolute URL of the page on which the link was found |[optional]|
**linkTo** | **String** | referenced page<br>absolute URL of the page to which the link is pointing |[optional]|
**dofollow** | **Boolean** | indicates whether the link is dofollow<br>if the value is true, the link doesn’t have a rel='nofollow' attribute |[optional]|
**pageFromScheme** | **String** | url scheme of the referring page |[optional]|
**pageToScheme** | **String** | url scheme of the referenced page |[optional]|
**direction** | **String** | direction of the link<br>possible values: internal, external |[optional]|
**isBroken** | **Boolean** | link is broken<br>indicates whether a link is directing to a broken page or resource |[optional]|
**isLinkRelationConflict** | **Boolean** | indicates that the link may have a conflict with another link<br>if true, at least one link pointing to link_to has a rel='nofollow' attribute and at least one is dofollow |[optional]|
**pageToStatusCode** | **Integer** | status code of the referenced page<br>status code of the page to which the link is pointing |[optional]|