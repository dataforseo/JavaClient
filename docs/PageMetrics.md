# PageMetrics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**linksExternal** | **Integer** | number of external links<br>the number of links pointing to other websites |[optional]|
**linksInternal** | **Integer** | number of internal links<br>the number of links pointing to other pages within the target website |[optional]|
**duplicateTitle** | **Integer** | number of pages with duplicate titles |[optional]|
**duplicateDescription** | **Integer** | number of pages with duplicate descriptions |[optional]|
**duplicateContent** | **Integer** | number of pages with duplicate content |[optional]|
**brokenLinks** | **Integer** | number of broken links<br>number of broken links across all crawled pages on a target website |[optional]|
**brokenResources** | **Integer** | number of broken resources<br>the number of images and other resources with broken links |[optional]|
**linksRelationConflict** | **Integer** | number of links present on the target website that may have a conflict<br>for example, if 'links_relation_conflict': 2, the target website is referring to the same source by at least one internal link with the rel='nofollow' attribute and by at least one dofollow link |[optional]|
**redirectLoop** | **Integer** | number of redirect chains that start and end at the same URL<br>number of redirect chains where the destination URL redirects back to the original URL |[optional]|
**onpageScore** | **Double** | shows how website is optimized on a 100-point scale<br>this field shows how website is optimized considering critical on-page issues and warnings detected;<br>100 is the highest possible score that means website does not have any critical on-page issues and important warnings;<br>note that this value depends on the number of crawled pages;<br>learn more about how the metric is calculated in this help center article |[optional]|
**nonIndexable** | **Integer** | number of non-indexable pages<br>number of pages that are blocked from being indexed by Google and other search engines by robots.txt, HTTP headers, or meta tags settings;<br>you can receive a list of non-indexable URLs using this endpoint |[optional]|
**checks** | **Map<String, Long>** | page-specific on-page check-ups |[optional]|