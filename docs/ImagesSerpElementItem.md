# ImagesSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**title** | **String** | <em>title of the row</em> |[optional]|
**url** | **String** | <i>URL of the third-party review source</i> |[optional]|
**items** | **List<AiModeImagesElementInfo>** | <em>contains arrays of elements available in the list</em> |[optional]|
**relatedImageSearches** | **List<RelatedImageSearchesElement>** | <em>contains keywords and images related to the specified search term</em><br><strong>Note:</strong> this array is deprecated and always returns <code>null</code> |[optional]|