

# BaseOnPageLinkItemInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**domainFrom** | **String** | referring domain the link was found on this domain |  [optional] |
|**domainTo** | **String** | referenced domain the link is pointing to this domain |  [optional] |
|**pageFrom** | **String** | referring page relative URL of the page on which the link was found |  [optional] |
|**pageTo** | **String** | referenced page relative URL of the page to which the link is pointing |  [optional] |
|**linkFrom** | **String** | referring page absolute URL of the page on which the link was found |  [optional] |
|**linkTo** | **String** | referenced page absolute URL of the page to which the link is pointing |  [optional] |
|**dofollow** | **Boolean** | indicates whether the link is dofollow if the value is true, the link doesn’t have a rel&#x3D;\&quot;nofollow\&quot; attribute |  [optional] |
|**pageFromScheme** | **String** | url scheme of the referring page |  [optional] |
|**pageToScheme** | **String** | url scheme of the referenced page |  [optional] |
|**direction** | **String** | direction of the link possible values: internal, external |  [optional] |
|**isBroken** | **Boolean** | link is broken indicates whether a link is directing to a broken page or resource |  [optional] |
|**isLinkRelationConflict** | **Boolean** | indicates that the link may have a conflict with another link if true, at least one link pointing to link_to has a rel&#x3D;\&quot;nofollow\&quot; attribute and at least one is dofollow |  [optional] |



