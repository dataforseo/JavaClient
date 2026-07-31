# GoogleBusinessQuestionItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the elements</em> |[optional]|
**questionId** | **String** | <em>ID of the question</em> |[optional]|
**url** | **String** | <em>URL of the question</em> |[optional]|
**profileImageUrl** | **String** | <em>URL of the user's profile image</em> |[optional]|
**profileUrl** | **String** | <em>URL of the user's profile</em> |[optional]|
**profileName** | **String** | <em>displayed name of the user</em> |[optional]|
**questionText** | **String** | <em>current text of the question</em> |[optional]|
**originalQuestionText** | **String** | <em>original text of the question</em> |[optional]|
**timeAgo** | **String** | <em>estimated time when the question was posted</em> |[optional]|
**timestamp** | **String** | <em>exact time when the question was posted</em> |[optional]|
**items** | **List<GoogleBusinessAnswerElement>** | <em>array of items</em><br>items within <code>google_business_question_item</code> |[optional]|