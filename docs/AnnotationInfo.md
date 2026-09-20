# AnnotationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | <em>the domain name or title of the quoted source</em> |[optional]|
**url** | **String** | <em>redirect URL to the quoted source</em><br>contains a Vertex AI redirect that leads to the original source |[optional]|
**directUrl** | **String** | <em>direct URL to the quoted source</em><br>contains the original source URL that the Vertex AI redirect in the `url` field leads to |[optional]|
**startIndex** | **Integer** | <em>start of the annotation indexing</em> |[optional]|
**endIndex** | **Integer** | <em>end of the annotation indexing</em> |[optional]|
**text** | **String** | <em>text of the reasoning chain section</em><br>text of the reasoning chain  section summarizing the model's thought process |[optional]|