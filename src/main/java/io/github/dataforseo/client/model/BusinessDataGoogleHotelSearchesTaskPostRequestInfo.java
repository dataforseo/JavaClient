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


public class BusinessDataGoogleHotelSearchesTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <em>keyword</em><br>optional field<br>the keyword you specify is used to search for the list of hotels;<br>if you don't use this field, we will return the list of hotels found in a specified location;<br>you can specify <strong>up to 700 characters</strong> in the <code>keyword</code> filed<br><strong>all %## will be decoded (plus character ‘+’ will be decoded to a space character)</strong><br>if you need to use the “%” character for your <code>keyword</code>, please specify it as “%25”; <br><strong>Note:</strong> in order to obtain accurate search results, the location name is appended to the keyword automatically<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <em>task priority</em><br>optional field<br>can take the following values:<br>1 – normal execution priority (set by default)<br>2 – high execution priorityYou will be additionally charged for the tasks with high execution priority.<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/business-data/google-hotels-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify <code>location_code</code> or <code>location_coordinate</code></strong><br><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations with <code>location_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/business_data/google/locations</code><br>example:<br><code class='long-string'>London,England,United Kingdom</code><br><strong>Note:</strong> in order to obtain accurate search results, the <code>location_name</code> you specify will be automatically appended to the keyword
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify <code>location_name</code>_or <code>location_coordinate</code></strong><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations with <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/business_data/google/locations</code><br>example:<br><code class='long-string'>2840</code>n
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br><strong>required field if you don't specify <code>location_name</code>_or <code>location_code</code></strong><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude'</em> format<br>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<br><strong>Note</strong>: if the coordinates are used to set a location, the search will occur in the nearest settlement;<br>example:<br><code class='long-string'>53.476225,-2.243572</code>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_SEARCH_THIS_AREA = "search_this_area";
  @SerializedName(SERIALIZED_NAME_SEARCH_THIS_AREA)
  private Boolean searchThisArea;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo searchThisArea(Boolean searchThisArea) {
    this.searchThisArea = searchThisArea;
    return this;
  }

  /**
   * <em>show hotels from the displayed area</em><br>optional field<br>can take the values: <code>true</code>, <code>false</code><br>default value: <code>true</code><br>if set to <code>false</code> the <code>search_this_area</code> mode will be turned off<br><strong>Note:</strong> if the <code>search_this_area</code> mode is turned off, the <code>location_name</code> won't be appended to the <code>keyword</code> during search<br>learn more about this parameter <a href='https://dataforseo.com/help-center/how-to-use-search_this_area-parameter-in-google-hotel-searches' target='_blank'>on our Help Center</a>
   * @return searchThisArea
   */
  @javax.annotation.Nullable
  public Boolean getSearchThisArea() {
    return searchThisArea;
  }

  public void setSearchThisArea(Boolean searchThisArea) {
    this.searchThisArea = searchThisArea;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if you don't specify <code>language_code</code></strong><br><strong>if you use this field, you don't need to specify <code>language_code</code></strong><br>you can receive the list of available languages with <code>language_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/business_data/google/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if you don't specify <code>language_name</code></strong><br><strong>if you use this field, you don't need to specify <code>language_name</code></strong><br>you can receive the list of available languages with their <code>language_code</code>_by making a separate request to <code>https://api.dataforseo.com/v3/business_data/google/languages</code><em><br></em>example:<em><br></em><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <em>parsing depth</em><br>optional field<br>number of results in Google Hotels<br>default value: <code>18</code> organic results<br>max value: <code>140</code><br><strong>Note:</strong> your account will be billed per each 18 organic results regardless of paid listings in the response;<br>thus, setting a depth above <code>18</code> may result in additional charges if Google Hotels return more than 18 results;<br>if the specified depth is higher than the number of results in the response, the difference will be refunded automatically to your account balance
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_CHECK_IN = "check_in";
  @SerializedName(SERIALIZED_NAME_CHECK_IN)
  private String checkIn;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  /**
   * <em>check-in date</em><br>optional field<br>if you don't specify this field, tomorrow's date will be used by default;<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2019-01-15'</code><br><strong>Note:</strong> the value cannot precede the today's date
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

  /**
   * <em>check-out date</em><br>optional field<br>if you don't specify this field, our system will apply the date of two days from now by default;<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2019-01-15'</code><br><strong>Note:</strong> the value cannot be less than or equal to <code>check_in</code>;<br>the range between <code>check_in</code> and <code>check_out</code> values cannot exceed 30 days
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * <em>currency</em><br>optional field<br>example:<br><code>'USD'</code>
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo adults(Integer adults) {
    this.adults = adults;
    return this;
  }

  /**
   * <em>number of adults</em><br>optional field<br>if you don't specify this field, the default value of <code>2</code> will be applied;<br><strong>note</strong> that you can specify up to 6 persons including both adults and children<br>example:<br><code>1</code>
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo children(List<String> children) {
    this.children = children;
    return this;
  }

  /**
   * <em>number and age of children</em><br>optional field<br>if you don't specify this field, no children will be included in the search;<br>age of child can be from <code>0</code> to <code>17</code>;<br><strong>note</strong> that you can specify up to 6 persons including both adults and children<br>set the following value if you want to include one 14-year-old child:<br><code>[14]</code><br>set the following value if you want to include one 13-year-old child and one 8-year-old child:<br><code>[13,8]</code>
   * @return children
   */
  @javax.annotation.Nullable
  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }


  public static final String SERIALIZED_NAME_STARS = "stars";
  @SerializedName(SERIALIZED_NAME_STARS)
  private List<String> stars;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo stars(List<String> stars) {
    this.stars = stars;
    return this;
  }

  /**
   * <em>hotel stars</em><br>optional field<br>set this field to <code>[5]</code> if you want to get the list of 5-star hotels only<br>example:<br><code>[3,4,5]</code>
   * @return stars
   */
  @javax.annotation.Nullable
  public List<String> getStars() {
    return stars;
  }

  public void setStars(List<String> stars) {
    this.stars = stars;
  }


  public static final String SERIALIZED_NAME_MIN_RATING = "min_rating";
  @SerializedName(SERIALIZED_NAME_MIN_RATING)
  private Double minRating;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo minRating(Double minRating) {
    this.minRating = minRating;
    return this;
  }

  /**
   * <em>minimum rating</em><br>optional field<br>you can use this field to specify guest rating higher than a certain value<br>example:<br><code>2.5</code>
   * @return minRating
   */
  @javax.annotation.Nullable
  public Double getMinRating() {
    return minRating;
  }

  public void setMinRating(Double minRating) {
    this.minRating = minRating;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * <em>results sorting parameters</em><br>optional field<br>you can use this field to sort the results<br>possible types of sorting:<br><code>relevance</code> – sort by most relevant<br><code>lowest_price</code> – sort by the lowest price<br><code>highest_rating</code> – sort by highest rating<br><code>most_reviewed</code> – sort by most reviewed<br>default value: <code>relevance</code>
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_MIN_PRICE = "min_price";
  @SerializedName(SERIALIZED_NAME_MIN_PRICE)
  private Integer minPrice;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo minPrice(Integer minPrice) {
    this.minPrice = minPrice;
    return this;
  }

  /**
   * <em>minimum price per night</em><br>optional field<br>the currency of this value depends on the <code>currency</code> field<br>example:<br><code>100</code>
   * @return minPrice
   */
  @javax.annotation.Nullable
  public Integer getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(Integer minPrice) {
    this.minPrice = minPrice;
  }


  public static final String SERIALIZED_NAME_MAX_PRICE = "max_price";
  @SerializedName(SERIALIZED_NAME_MAX_PRICE)
  private Integer maxPrice;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo maxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  /**
   * <em>maximum price per night</em><br>optional field<br>the currency of this value depends on the <code>currency</code> field<br>example:<br><code>600</code>
   * @return maxPrice
   */
  @javax.annotation.Nullable
  public Integer getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
  }


  public static final String SERIALIZED_NAME_FREE_CANCELLATION = "free_cancellation";
  @SerializedName(SERIALIZED_NAME_FREE_CANCELLATION)
  private Boolean freeCancellation;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo freeCancellation(Boolean freeCancellation) {
    this.freeCancellation = freeCancellation;
    return this;
  }

  /**
   * <em>hotels with a free cancellation</em><br>optional field<br>set this field to <code>true</code> if you want to get the list of hotels with free cancellation of reservations<br>default value: <code>false</code>
   * @return freeCancellation
   */
  @javax.annotation.Nullable
  public Boolean getFreeCancellation() {
    return freeCancellation;
  }

  public void setFreeCancellation(Boolean freeCancellation) {
    this.freeCancellation = freeCancellation;
  }


  public static final String SERIALIZED_NAME_IS_VACATION_RENTALS = "is_vacation_rentals";
  @SerializedName(SERIALIZED_NAME_IS_VACATION_RENTALS)
  private Boolean isVacationRentals;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo isVacationRentals(Boolean isVacationRentals) {
    this.isVacationRentals = isVacationRentals;
    return this;
  }

  /**
   * <em>search for vacation rentals</em><br>optional field<br>set this field to <code>true</code> if you want to get the list of vacation rentals instead of hotels<br>default value: <code>false</code>
   * @return isVacationRentals
   */
  @javax.annotation.Nullable
  public Boolean getIsVacationRentals() {
    return isVacationRentals;
  }

  public void setIsVacationRentals(Boolean isVacationRentals) {
    this.isVacationRentals = isVacationRentals;
  }


  public static final String SERIALIZED_NAME_AMENITIES = "amenities";
  @SerializedName(SERIALIZED_NAME_AMENITIES)
  private List<String> amenities;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo amenities(List<String> amenities) {
    this.amenities = amenities;
    return this;
  }

  /**
   * <em>hotel amenities</em><br>optional field<br>you can use this field to specify different hotel amenities<br>example:<br><code>  [<br>            'free_parking',<br>            'pets_allowed'<br>        ]<br></code><br>possible values:<br><code>'air_conditioning',<br>'all_inclusive_available',<br>'bar',<br>'free_breakfast',<br>'fitness_center',<br>'kid_friendly',<br>'free_parking',<br>'pets_allowed',<br>'pool',<br>'restaurant',<br>'room_service',<br>'spa',<br>'free_wifi',<br>'parking',<br>'indoor_pool',<br>'outdoor_pool',<br>'wheelchair_accessible',<br>'beach_access'</code>
   * @return amenities
   */
  @javax.annotation.Nullable
  public List<String> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<String> amenities) {
    this.amenities = amenities;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <em>user-defined task identifier</em><br>optional field<br><em>the character limit is 255</em><br>you can use this parameter to identify the task and match it with the result<br>you will find the specified <code>tag</code> value in the <code>data</code> object of the response
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

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <em>URL for sending task results</em><br>optional field<br>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/postbackscript?id=$id</code><br><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded; <br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded; <br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataGoogleHotelSearchesTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataGoogleHotelSearchesTaskPostRequestInfo businessDataGoogleHotelSearchesTaskPostRequestInfo = (BusinessDataGoogleHotelSearchesTaskPostRequestInfo) o;
    return

        Objects.equals(this.keyword, businessDataGoogleHotelSearchesTaskPostRequestInfo.keyword) &&
        Objects.equals(this.priority, businessDataGoogleHotelSearchesTaskPostRequestInfo.priority) &&
        Objects.equals(this.locationName, businessDataGoogleHotelSearchesTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, businessDataGoogleHotelSearchesTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, businessDataGoogleHotelSearchesTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.searchThisArea, businessDataGoogleHotelSearchesTaskPostRequestInfo.searchThisArea) &&
        Objects.equals(this.languageName, businessDataGoogleHotelSearchesTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, businessDataGoogleHotelSearchesTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.depth, businessDataGoogleHotelSearchesTaskPostRequestInfo.depth) &&
        Objects.equals(this.checkIn, businessDataGoogleHotelSearchesTaskPostRequestInfo.checkIn) &&
        Objects.equals(this.checkOut, businessDataGoogleHotelSearchesTaskPostRequestInfo.checkOut) &&
        Objects.equals(this.currency, businessDataGoogleHotelSearchesTaskPostRequestInfo.currency) &&
        Objects.equals(this.adults, businessDataGoogleHotelSearchesTaskPostRequestInfo.adults) &&
        Objects.equals(this.children, businessDataGoogleHotelSearchesTaskPostRequestInfo.children) &&
        Objects.equals(this.stars, businessDataGoogleHotelSearchesTaskPostRequestInfo.stars) &&
        Objects.equals(this.minRating, businessDataGoogleHotelSearchesTaskPostRequestInfo.minRating) &&
        Objects.equals(this.sortBy, businessDataGoogleHotelSearchesTaskPostRequestInfo.sortBy) &&
        Objects.equals(this.minPrice, businessDataGoogleHotelSearchesTaskPostRequestInfo.minPrice) &&
        Objects.equals(this.maxPrice, businessDataGoogleHotelSearchesTaskPostRequestInfo.maxPrice) &&
        Objects.equals(this.freeCancellation, businessDataGoogleHotelSearchesTaskPostRequestInfo.freeCancellation) &&
        Objects.equals(this.isVacationRentals, businessDataGoogleHotelSearchesTaskPostRequestInfo.isVacationRentals) &&
        Objects.equals(this.amenities, businessDataGoogleHotelSearchesTaskPostRequestInfo.amenities) &&
        Objects.equals(this.tag, businessDataGoogleHotelSearchesTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, businessDataGoogleHotelSearchesTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, businessDataGoogleHotelSearchesTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, priority, locationName, locationCode, locationCoordinate, searchThisArea, languageName, languageCode, depth, checkIn, checkOut, currency, adults, children, stars, minRating, sortBy, minPrice, maxPrice, freeCancellation, isVacationRentals, amenities, tag, postbackUrl, pingbackUrl);
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
    sb.append("class BusinessDataGoogleHotelSearchesTaskPostRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    searchThisArea: ").append(toIndentedString(searchThisArea)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    minRating: ").append(toIndentedString(minRating)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    freeCancellation: ").append(toIndentedString(freeCancellation)).append("\n");
    sb.append("    isVacationRentals: ").append(toIndentedString(isVacationRentals)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
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
    
    openapiFields.add("keyword");
    
    openapiFields.add("priority");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("search_this_area");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("check_in");
    
    openapiFields.add("check_out");
    
    openapiFields.add("currency");
    
    openapiFields.add("adults");
    
    openapiFields.add("children");
    
    openapiFields.add("stars");
    
    openapiFields.add("min_rating");
    
    openapiFields.add("sort_by");
    
    openapiFields.add("min_price");
    
    openapiFields.add("max_price");
    
    openapiFields.add("free_cancellation");
    
    openapiFields.add("is_vacation_rentals");
    
    openapiFields.add("amenities");
    
    openapiFields.add("tag");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataGoogleHotelSearchesTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataGoogleHotelSearchesTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataGoogleHotelSearchesTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataGoogleHotelSearchesTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataGoogleHotelSearchesTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataGoogleHotelSearchesTaskPostRequestInfo value) throws IOException {
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
           public BusinessDataGoogleHotelSearchesTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataGoogleHotelSearchesTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessDataGoogleHotelSearchesTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataGoogleHotelSearchesTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}