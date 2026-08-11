# CurrencyBoxSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**value** | **Double** | <em>the value of the rating</em> |[optional]|
**convertedValue** | **Double** | <i>value converted to a requested currency</i><br>indicates the exact value based on Google Fincance data at the time when our API pulled the results<br>note that exchange rates displayed in the <code>currency_box</code> element may be delayed according to <a href='https://www.google.com/intl/en_us/googlefinance/disclaimer/'>the Google Finance disclaimer</a> |[optional]|
**currency** | **String** | <i>currency of the listed price</i><br>ISO code of the currency applied to the price |[optional]|
**convertedCurrency** | **String** | <em>converted currency</em> |[optional]|
**timestamp** | **String** | <em>date and time when the result was published</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**table** | **Table** | <em>table present in the element</em><br>the header and content of the table present in the element |[optional]|
**graph** | **Graph** | <em>contains data provided in the graph of the element</em> |[optional]|