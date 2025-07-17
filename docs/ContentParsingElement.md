# ContentParsingElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**fetchTime** | **String** | date and time when the content was fethced<br>example:<br>'2022-11-01 10:02:52 +00:00' |[optional]|
**statusCode** | **Integer** | status code of the page |[optional]|
**pageContent** | **PageContentInfo** | parsed content of the page |[optional]|
**pageAsMarkdown** | **String** | page content in the markdown format<br>page content in the text-to-HTML markdown format<br>specify markdown_view as true in the request to return the value |[optional]|