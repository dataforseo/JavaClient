package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;



public class BusinessDataGoogleHotelInfoTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_HOTEL_IDENTIFIER = "hotel_identifier";
  @SerializedName(SERIALIZED_NAME_HOTEL_IDENTIFIER)
  private String hotelIdentifier;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo hotelIdentifier(String hotelIdentifier) {
    this.hotelIdentifier = hotelIdentifier;
    return this;
  }

  /**
   * unique hotel identifier
* required field if you don’t specify keyword
* if you use this field, you don’t need to specify keyword
* unique identifier of a hotel entity in Google search;
* you can obtain the value by making a request to Advanced Google SERP API (enclosed in the hotels_pack element of the response), or the Hotel Searches endpoint of Business Data API
* example:
* ChYIq6SB--i6p6cpGgovbS8wN2s5ODZfEAE
   * @return hotelIdentifier
   */
  @javax.annotation.Nullable
  public String getHotelIdentifier() {
    return hotelIdentifier;
  }

  public void setHotelIdentifier(String hotelIdentifier) {
    this.hotelIdentifier = hotelIdentifier;
  }


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword
* required field if you don’t specify hotel_identifier
* if you use this field, you don’t need to specify hotel_identifier
* the keyword you specify should indicate the name of the hotel entity
* you can specify up to 700 characters in the keyword filed
* all %## will be decoded (plus character ‘+’ will be decoded to a space character)
* if you need to use the “%” character for your keyword, please specify it as “%25”
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * task priority
* optional field
* can take the following values:
* 1 – normal execution priority (set by default)
* 2 – high execution priority
* You will be additionally charged for the tasks with high execution priority.
* The cost can be calculated on the Pricing page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location
* required field if you don’t specify location_code or location_coordinate
* if you use this field, you don’t need to specify location_code or location_coordinate
* you can receive the list of available locations with location_name by making a separate request to https://api.dataforseo.com/v3/business_data/google/locations
* example:
* London,England,United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code
* required field if you don’t specify location_name or location_coordinate
* if you use this field, you don’t need to specify location_name or location_coordinate
* you can receive the list of available locations with location_code by making a separate request to the https://api.dataforseo.com/v3/business_data/google/locations
* example:
* 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * GPS coordinates of a location
* required field if you don’t specify location_name or location_code
* if you use this field, you don’t need to specify location_name or location_code
* location_coordinate parameter should be specified in the “latitude,longitude” format
* the maximum number of decimal digits for “latitude” and “longitude”: 7
* Note: if the coordinates are used to set a location, the search will occur in the nearest settlement;
* example:
* 53.476225,-2.243572
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language
* required field if you don’t specify language_code
* if you use this field, you don’t need to specify language_code
* you can receive the list of available languages with language_name by making a separate request to https://api.dataforseo.com/v3/business_data/google/languages
* example:
* English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code
* required field if you don’t specify language_name
* if you use this field, you don’t need to specify language_name
* you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/business_data/google/languages
* example:
* en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CHECK_IN = "check_in";
  @SerializedName(SERIALIZED_NAME_CHECK_IN)
  private String checkIn;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  /**
   * check-in date
* optional field
* if you don’t specify this field, tomorrow’s date will be used by default;
* the value must not be earlier than today’s date
* date format: 'yyyy-mm-dd'
* example:
* '2019-01-15'
   * @return checkIn
   */
  @javax.annotation.Nullable
  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }


  public static final String SERIALIZED_NAME_CHECK_OUT = "check_out";
  @SerializedName(SERIALIZED_NAME_CHECK_OUT)
  private String checkOut;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

  /**
   * check-out date
* optional field
* if you don’t specify this field, our system will apply the date of two days from now by default;
* Note: the value cannot be less than or equal to check_in;
* the range between check_in and check_out values cannot exceed 30 days
* date format: 'yyyy-mm-dd'
* example:
* '2019-01-15'
   * @return checkOut
   */
  @javax.annotation.Nullable
  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency
* optional field
* example:
* 'USD'
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public static final String SERIALIZED_NAME_ADULTS = "adults";
  @SerializedName(SERIALIZED_NAME_ADULTS)
  private Integer adults;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo adults(Integer adults) {
    this.adults = adults;
    return this;
  }

  /**
   * number of adults
* optional field
* if you don’t specify this field, two adults will be used by default
* example:
* 1
   * @return adults
   */
  @javax.annotation.Nullable
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }


  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<String> children;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo children(List<String> children) {
    this.children = children;
    return this;
  }

  /**
   * number and age of children
* optional field
* if you don’t specify this field, no children will be included in the search;
* set the following value if you want to include one 14-years-old child:
* [14]
* set the following value if you want to include one 13-years-old child and one 8-years-old child:
* [13,8]
   * @return children
   */
  @javax.annotation.Nullable
  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }


  public static final String SERIALIZED_NAME_LOAD_PRICES_BY_DATES = "load_prices_by_dates";
  @SerializedName(SERIALIZED_NAME_LOAD_PRICES_BY_DATES)
  private Boolean loadPricesByDates;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo loadPricesByDates(Boolean loadPricesByDates) {
    this.loadPricesByDates = loadPricesByDates;
    return this;
  }

  /**
   * load hotel stay prices by dates
* optional field
* if you specify this parameter with true, the response will include the prices_by_dates array with hotel stay prices divided by dates
* if you use this parameter, you will be charged double the base price for a request
   * @return loadPricesByDates
   */
  @javax.annotation.Nullable
  public Boolean getLoadPricesByDates() {
    return loadPricesByDates;
  }

  public void setLoadPricesByDates(Boolean loadPricesByDates) {
    this.loadPricesByDates = loadPricesByDates;
  }


  public static final String SERIALIZED_NAME_PRICES_START_DATE = "prices_start_date";
  @SerializedName(SERIALIZED_NAME_PRICES_START_DATE)
  private String pricesStartDate;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo pricesStartDate(String pricesStartDate) {
    this.pricesStartDate = pricesStartDate;
    return this;
  }

  /**
   * start date to load prices by dates
* optional field
* to use this parameter, you must specify load_prices_by_dates with true
* if this parameter is not specified, the start date is set to check_in date
* date format: yyyy-mm-dd
* example:
* 2025-05-20
   * @return pricesStartDate
   */
  @javax.annotation.Nullable
  public String getPricesStartDate() {
    return pricesStartDate;
  }

  public void setPricesStartDate(String pricesStartDate) {
    this.pricesStartDate = pricesStartDate;
  }


  public static final String SERIALIZED_NAME_PRICES_END_DATE = "prices_end_date";
  @SerializedName(SERIALIZED_NAME_PRICES_END_DATE)
  private String pricesEndDate;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo pricesEndDate(String pricesEndDate) {
    this.pricesEndDate = pricesEndDate;
    return this;
  }

  /**
   * end date to load prices by dates
* optional field
* to use this parameter, you must specify load_prices_by_dates with true
* if this parameter is not specified, you will get prices by date for the month
* date format: yyyy-mm-dd
* example:
* 2025-05-21
   * @return pricesEndDate
   */
  @javax.annotation.Nullable
  public String getPricesEndDate() {
    return pricesEndDate;
  }

  public void setPricesEndDate(String pricesEndDate) {
    this.pricesEndDate = pricesEndDate;
  }


  public static final String SERIALIZED_NAME_PRICES_DATE_RANGE = "prices_date_range";
  @SerializedName(SERIALIZED_NAME_PRICES_DATE_RANGE)
  private String pricesDateRange;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo pricesDateRange(String pricesDateRange) {
    this.pricesDateRange = pricesDateRange;
    return this;
  }

  /**
   * predefined period for retrieving daily price data
* optional field
* to use this parameter, you must specify load_prices_by_dates with true
* if the prices_start_date is not specified, the start date is set to check_in date
* possible values: month, three_months, six_months, year
* default value: month
   * @return pricesDateRange
   */
  @javax.annotation.Nullable
  public String getPricesDateRange() {
    return pricesDateRange;
  }

  public void setPricesDateRange(String pricesDateRange) {
    this.pricesDateRange = pricesDateRange;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255;
* you can use this parameter to identify the task and match it with the result;
* you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results
* optional field
* once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified;
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request;
* example:
* http://your-server.com/postbackscript?id=$id
* http://your-server.com/postbackscript?id=$id&tag=$tag
* Note: special characters in postback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_POSTBACK_DATA = "postback_data";
  @SerializedName(SERIALIZED_NAME_POSTBACK_DATA)
  private String postbackData;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * postback_url datatype
* required field if you specify postback_url
* corresponds to the datatype that will be sent to your server
* possible values:
* advanced, html
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task
* optional field
* when a task is completed we will notify you by GET request sent to the URL you have specified;
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable;
* we will set the necessary values before sending the request;
* example:
* http://your-server.com/pingscript?id=$id
* http://your-server.com/pingscript?id=$id&tag=$tag
* Note: special characters in pingback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public BusinessDataGoogleHotelInfoTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataGoogleHotelInfoTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BusinessDataGoogleHotelInfoTaskPostRequestInfo businessDataGoogleHotelInfoTaskPostRequestInfo = (BusinessDataGoogleHotelInfoTaskPostRequestInfo) o;
    return

        Objects.equals(this.hotelIdentifier, businessDataGoogleHotelInfoTaskPostRequestInfo.hotelIdentifier) &&
        Objects.equals(this.keyword, businessDataGoogleHotelInfoTaskPostRequestInfo.keyword) &&
        Objects.equals(this.priority, businessDataGoogleHotelInfoTaskPostRequestInfo.priority) &&
        Objects.equals(this.locationName, businessDataGoogleHotelInfoTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, businessDataGoogleHotelInfoTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, businessDataGoogleHotelInfoTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, businessDataGoogleHotelInfoTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, businessDataGoogleHotelInfoTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.checkIn, businessDataGoogleHotelInfoTaskPostRequestInfo.checkIn) &&
        Objects.equals(this.checkOut, businessDataGoogleHotelInfoTaskPostRequestInfo.checkOut) &&
        Objects.equals(this.currency, businessDataGoogleHotelInfoTaskPostRequestInfo.currency) &&
        Objects.equals(this.adults, businessDataGoogleHotelInfoTaskPostRequestInfo.adults) &&
        Objects.equals(this.children, businessDataGoogleHotelInfoTaskPostRequestInfo.children) &&
        Objects.equals(this.loadPricesByDates, businessDataGoogleHotelInfoTaskPostRequestInfo.loadPricesByDates) &&
        Objects.equals(this.pricesStartDate, businessDataGoogleHotelInfoTaskPostRequestInfo.pricesStartDate) &&
        Objects.equals(this.pricesEndDate, businessDataGoogleHotelInfoTaskPostRequestInfo.pricesEndDate) &&
        Objects.equals(this.pricesDateRange, businessDataGoogleHotelInfoTaskPostRequestInfo.pricesDateRange) &&
        Objects.equals(this.tag, businessDataGoogleHotelInfoTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, businessDataGoogleHotelInfoTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, businessDataGoogleHotelInfoTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.pingbackUrl, businessDataGoogleHotelInfoTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(hotelIdentifier, keyword, priority, locationName, locationCode, locationCoordinate, languageName, languageCode, checkIn, checkOut, currency, adults, children, loadPricesByDates, pricesStartDate, pricesEndDate, pricesDateRange, tag, postbackUrl, postbackData, pingbackUrl);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDataGoogleHotelInfoTaskPostRequestInfo {\n");

    sb.append("    hotelIdentifier: ").append(toIndentedString(hotelIdentifier)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    loadPricesByDates: ").append(toIndentedString(loadPricesByDates)).append("\n");
    sb.append("    pricesStartDate: ").append(toIndentedString(pricesStartDate)).append("\n");
    sb.append("    pricesEndDate: ").append(toIndentedString(pricesEndDate)).append("\n");
    sb.append("    pricesDateRange: ").append(toIndentedString(pricesDateRange)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    
    openapiFields.add("hotel_identifier");
    
    openapiFields.add("keyword");
    
    openapiFields.add("priority");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("check_in");
    
    openapiFields.add("check_out");
    
    openapiFields.add("currency");
    
    openapiFields.add("adults");
    
    openapiFields.add("children");
    
    openapiFields.add("load_prices_by_dates");
    
    openapiFields.add("prices_start_date");
    
    openapiFields.add("prices_end_date");
    
    openapiFields.add("prices_date_range");
    
    openapiFields.add("tag");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("postback_data");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataGoogleHotelInfoTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataGoogleHotelInfoTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataGoogleHotelInfoTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataGoogleHotelInfoTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataGoogleHotelInfoTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataGoogleHotelInfoTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataGoogleHotelInfoTaskPostRequestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessDataGoogleHotelInfoTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataGoogleHotelInfoTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }


  public static BusinessDataGoogleHotelInfoTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataGoogleHotelInfoTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}