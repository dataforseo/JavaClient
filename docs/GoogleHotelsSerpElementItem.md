# GoogleHotelsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**hotelIdentifier** | **String** | <em>unique hotel identifier</em><br>unique hotel identifier assigned by Google;<br>example: <code>'CgoIjaeSlI6CnNpVEAE'</code> |[optional]|
**url** | **String** | <i>URL of the third-party review source</i> |[optional]|
**cid** | **String** | <em>google-defined client id</em> |[optional]|