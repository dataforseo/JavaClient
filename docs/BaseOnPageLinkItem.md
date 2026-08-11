# BaseOnPageLinkItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**domainFrom** | **String** | <em>referring domain</em><br>the link was found on this domain |[optional]|
**domainTo** | **String** | <em>referenced domain</em><br>the link is pointing to this domain |[optional]|
**pageFrom** | **String** | <em>referring page</em><br>relative URL of the page on which the link was found |[optional]|
**pageTo** | **String** | <em>referenced page</em><br>relative URL of the page to which the link is pointing |[optional]|
**linkFrom** | **String** | <em>referring page</em><br>absolute URL of the page on which the link was found |[optional]|
**linkTo** | **String** | <em>referenced page</em><br>absolute URL of the page to which the link is pointing |[optional]|
**dofollow** | **Boolean** | <em>indicates whether the link is dofollow</em><br>if the value is <code>true</code>, the link doesn't have a <code>rel='nofollow'</code> attribute |[optional]|
**pageFromScheme** | **String** | <em><a href='https://en.wikipedia.org/wiki/List_of_URI_schemes' target='_blank' rel='noopener noreferrer'>url scheme</a> of the referring page</em> |[optional]|
**pageToScheme** | **String** | <em><a href='https://en.wikipedia.org/wiki/List_of_URI_schemes' target='_blank' rel='noopener noreferrer'>url scheme</a> of the referenced page</em> |[optional]|
**direction** | **String** | <em>direction of the link</em><br>possible values: <code>internal</code>, <code>external</code> |[optional]|
**isBroken** | **Boolean** | <em>link is broken</em><br>indicates whether a link is directing to a broken page or resource |[optional]|
**isLinkRelationConflict** | **Boolean** | <em>indicates that the link may have a conflict with another link</em><br>if <code>true</code>, at least one link pointing to <code>link_to</code> has a <code>rel='nofollow'</code> attribute <strong>and</strong> at least one is dofollow |[optional]|
**pageToStatusCode** | **Integer** | <em>status code of the referenced page</em><br>status code of the page to which the link is pointing |[optional]|