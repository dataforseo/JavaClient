# OnPageStylesheetResourceItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**meta** | **ResourceMetaInfo** | page propertiesthe value depends on the resource_type |[optional]|
**fetchTiming** | **FetchTiming** | time range within which a result was fetched |[optional]|
**acceptType** | **String** | indicates the expected type of resourcefor example, if 'resource_type': 'broken', accept_type will indicate the type of the broken resourcepossible values:any, none, image, sitemap, robots, script, stylesheet, redirect, html, text, other, font |[optional]|