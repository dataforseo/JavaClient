

# BusinessDataGoogleQuestionsAndAnswersLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) this field will contain the cid parameter if you specified it in the keyword field when setting a task; example: cid:2946633002421908862 learn more about the parameter in this help center article |  [optional] |
|**seDomain** | **String** | search engine domain as specified in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**cid** | **String** | google-defined client id unique id of a local establishment; learn more about the identifier in this help center article |  [optional] |
|**featureId** | **String** | unique identifier of the SERP feature |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | item types types of search engine results encountered in the items array; possible item types: google_business_question_item |  [optional] |
|**itemsWithoutAnswers** | [**List&lt;ItemsWithoutAnswers&gt;**](ItemsWithoutAnswers.md) | array of google business question items without answers |  [optional] |
|**itemsCount** | **Long** | the number of items in the items array |  [optional] |
|**items** | [**List&lt;BusinessDataGoogleQuestionsAndAnswersItem&gt;**](BusinessDataGoogleQuestionsAndAnswersItem.md) | array of items within google_business_question_item contains answers to the google business questions; possible item types google_business_answer_element |  [optional] |



