

# PageMetrics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**linksExternal** | **Integer** | number of external links the number of links pointing to other websites |  [optional] |
|**linksInternal** | **Integer** | number of internal links the number of links pointing to other pages within the target website |  [optional] |
|**duplicateTitle** | **Integer** | number of pages with duplicate titles |  [optional] |
|**duplicateDescription** | **Integer** | number of pages with duplicate descriptions |  [optional] |
|**duplicateContent** | **Integer** | number of pages with duplicate content |  [optional] |
|**brokenLinks** | **Integer** | number of broken links number of broken links across all crawled pages on a target website |  [optional] |
|**brokenResources** | **Integer** | number of broken resources the number of images and other resources with broken links |  [optional] |
|**linksRelationConflict** | **Integer** | number of links present on the target website that may have a conflict for example, if \&quot;links_relation_conflict\&quot;: 2, the target website is referring to the same source by at least one internal link with the rel&#x3D;\&quot;nofollow\&quot; attribute and by at least one dofollow link |  [optional] |
|**redirectLoop** | **Integer** | number of redirect chains that start and end at the same URL number of redirect chains where the destination URL redirects back to the original URL |  [optional] |
|**onpageScore** | **Float** | shows how website is optimized on a 100-point scale this field shows how website is optimized considering critical on-page issues and warnings detected; 100 is the highest possible score that means website does not have any critical on-page issues and important warnings; note that this value depends on the number of crawled pages; learn more about how the metric is calculated in this help center article |  [optional] |
|**nonIndexable** | **Integer** | number of non-indexable pages number of pages that are blocked from being indexed by Google and other search engines by robots.txt, HTTP headers, or meta tags settings; you can receive a list of non-indexable URLs using this endpoint |  [optional] |
|**checks** | **Map&lt;String, Long&gt;** | page-specific on-page check-ups |  [optional] |



