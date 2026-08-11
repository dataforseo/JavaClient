# BaseDataforseoLabsApiElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**seType** | **String** | <em>search engine type</em> |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>            positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>            absolute position among all the elements in SERP |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>            can take the following values:<br>            <code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|