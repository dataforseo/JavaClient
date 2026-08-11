# KeywordsDataGoogleTrendsCategoriesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**categoryCode** | **Integer** | <em>unique google trends category identifier</em> |[optional]|
**categoryName** | **String** | <em>name of the google trends category</em> |[optional]|
**categoryCodeParent** | **Integer** | <em>the code of the superordinate category</em><br>example:<br><code>'category_code': 1100,</code><br><code>'category_name': 'Superhero Films',</code><br><code>'category_code_parent': 1097</code> <br>where <code>category_code_parent</code> corresponds to: <br><code>'category_code': 1097,</code><br><code>'category_name': 'Action &amp; Adventure Films'</code> |[optional]|