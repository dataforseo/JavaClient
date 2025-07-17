# RankChanges


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**previousRankAbsolute** | **Integer** | previous absolute rank in SERP<br>indicates previous rank of the element in Google SERP;<br>if this element is new, the value will be null |[optional]|
**isNew** | **Boolean** | element was previously present in SERP<br>if the value is true, previously collected SERP didn’t contain this element |[optional]|
**isUp** | **Boolean** | rank of this element went up<br>if the value is true, position of the element in SERP is higher compared to the previous check |[optional]|
**isDown** | **Boolean** | rank of this element went down<br>if the value is true, position of the element in SERP is lower compared to the previous check |[optional]|