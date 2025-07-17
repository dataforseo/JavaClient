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



public class BusinessDataGoogleHotelSearchesLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public BusinessDataGoogleHotelSearchesLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword
* optional field
* the keyword you specify is used to search for the list of hotels;
* if you don’t use this field, we will return the list of hotels found in a specified location;
* you can specify up to 700 characters in the keyword filed
* all %## will be decoded (plus character ‘+’ will be decoded to a space character)
* if you need to use the “%” character for your keyword, please specify it as “%25”;
* Note: in order to obtain accurate search results, the location name is appended to the keyword automatically
* learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public BusinessDataGoogleHotelSearchesLiveRequestInfo locationName(String locationName) {
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
* Note: in order to obtain accurate search results, the location_name you specify will be automatically appended to the keyword
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo locationCode(Integer locationCode) {
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * GPS coordinates of a location
* required field if you don’t specify location_name or location_code
* if you use this field, you don’t need to specify location_name or location_code
* location_coordinate parameter should be specified in the “latitude,longitude” format
* the maximum number of decimal digits for “latitude” and “longitude”: 7
* Note: if the coordinates are used to set a location, the search will occur in the nearest settlement
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo languageName(String languageName) {
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo languageCode(String languageCode) {
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


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public BusinessDataGoogleHotelSearchesLiveRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * parsing depth
* optional field
* number of results in Google Hotels
* default value: 20 organic results
* max value: 140
* Note: your account will be billed per each 20 organic results regardless of paid listings in the response;
* thus, setting a depth above 20 may result in additional charges if Google Hotels return more than 20 results;
* if the specified depth is higher than the number of results in the response, the difference will be refunded automatically to your account balance
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  /**
   * check-in date
* optional field
* if you don’t specify this field, tomorrow’s date will be used by default;
* date format: 'yyyy-mm-dd'
* example:
* '2019-01-15'
* Note: the value cannot precede the today’s date
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

  /**
   * check-out date
* optional field
* if you don’t specify this field, our system will apply the date of two days from now by default;
* date format: 'yyyy-mm-dd'
* example:
* '2019-01-15'
* Note: the value cannot be less than or equal to check_in;
* the range between check_in and check_out values cannot exceed 30 days
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo currency(String currency) {
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo adults(Integer adults) {
    this.adults = adults;
    return this;
  }

  /**
   * number of adults
* optional field
* if you don’t specify this field, the default value of 2 will be applied;
* note that you can specify up to 6 persons including both adults and children
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo children(List<String> children) {
    this.children = children;
    return this;
  }

  /**
   * number and age of children
* optional field
* if you don’t specify this field, no children will be included in the search;
* age of child can be from 0 to 17;
* note that you can specify up to 6 persons including both adults and children
* set the following value if you want to include one 14-year-old child:
* [14]
* set the following value if you want to include one 13-year-old child and one 8-year-old child:
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


  public static final String SERIALIZED_NAME_STARS = "stars";
  @SerializedName(SERIALIZED_NAME_STARS)
  private List<String> stars;

  public BusinessDataGoogleHotelSearchesLiveRequestInfo stars(List<String> stars) {
    this.stars = stars;
    return this;
  }

  /**
   * hotel stars
* optional field
* set this field to [5] if you want to get the list of 5-star hotels only
* example:
* [3,4,5]
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo minRating(Double minRating) {
    this.minRating = minRating;
    return this;
  }

  /**
   * minimum rating
* optional field
* you can use this field to specify guest rating higher than a certain value
* example:
* 2.5
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * results sorting parameters
* optional field
* you can use this field to sort the results
* possible types of sorting:
* relevance – sort by most relevant
* lowest_price – sort by the lowest price
* highest_rating – sort by highest rating
* most_reviewed – sort by most reviewed
* default value: relevance
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo minPrice(Integer minPrice) {
    this.minPrice = minPrice;
    return this;
  }

  /**
   * minimum price per night
* optional field
* the currency of this value depends on the currency field
* example:
* 100
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo maxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  /**
   * maximum price per night
* optional field
* the currency of this value depends on the currency field
* example:
* 600
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo freeCancellation(Boolean freeCancellation) {
    this.freeCancellation = freeCancellation;
    return this;
  }

  /**
   * hotels with a free cancellation
* optional field
* set this field to true if you want to get the list of hotels with free cancellation of reservations
* default value: false
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo isVacationRentals(Boolean isVacationRentals) {
    this.isVacationRentals = isVacationRentals;
    return this;
  }

  /**
   * search for vacation rentals
* optional field
* set this field to true if you want to get the list of vacation rentals instead of hotels
* default value: false
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo amenities(List<String> amenities) {
    this.amenities = amenities;
    return this;
  }

  /**
   * hotel amenities
* optional field
* you can use this field to specify different hotel amenities
* example:
*   [
*             'free_parking',
*             'pets_allowed'
*         ]
* 
* possible values:
* 'air_conditioning',
* 'all_inclusive_available',
* 'bar',
* 'free_breakfast',
* 'fitness_center',
* 'kid_friendly',
* 'free_parking',
* 'pets_allowed',
* 'pool',
* 'restaurant',
* 'room_service',
* 'spa',
* 'free_wifi',
* 'parking',
* 'indoor_pool',
* 'outdoor_pool',
* 'wheelchair_accessible',
* 'beach_access'
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

  public BusinessDataGoogleHotelSearchesLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
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



  public BusinessDataGoogleHotelSearchesLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataGoogleHotelSearchesLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataGoogleHotelSearchesLiveRequestInfo businessDataGoogleHotelSearchesLiveRequestInfo = (BusinessDataGoogleHotelSearchesLiveRequestInfo) o;
    return

        Objects.equals(this.keyword, businessDataGoogleHotelSearchesLiveRequestInfo.keyword) &&
        Objects.equals(this.locationName, businessDataGoogleHotelSearchesLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, businessDataGoogleHotelSearchesLiveRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, businessDataGoogleHotelSearchesLiveRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, businessDataGoogleHotelSearchesLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, businessDataGoogleHotelSearchesLiveRequestInfo.languageCode) &&
        Objects.equals(this.depth, businessDataGoogleHotelSearchesLiveRequestInfo.depth) &&
        Objects.equals(this.checkIn, businessDataGoogleHotelSearchesLiveRequestInfo.checkIn) &&
        Objects.equals(this.checkOut, businessDataGoogleHotelSearchesLiveRequestInfo.checkOut) &&
        Objects.equals(this.currency, businessDataGoogleHotelSearchesLiveRequestInfo.currency) &&
        Objects.equals(this.adults, businessDataGoogleHotelSearchesLiveRequestInfo.adults) &&
        Objects.equals(this.children, businessDataGoogleHotelSearchesLiveRequestInfo.children) &&
        Objects.equals(this.stars, businessDataGoogleHotelSearchesLiveRequestInfo.stars) &&
        Objects.equals(this.minRating, businessDataGoogleHotelSearchesLiveRequestInfo.minRating) &&
        Objects.equals(this.sortBy, businessDataGoogleHotelSearchesLiveRequestInfo.sortBy) &&
        Objects.equals(this.minPrice, businessDataGoogleHotelSearchesLiveRequestInfo.minPrice) &&
        Objects.equals(this.maxPrice, businessDataGoogleHotelSearchesLiveRequestInfo.maxPrice) &&
        Objects.equals(this.freeCancellation, businessDataGoogleHotelSearchesLiveRequestInfo.freeCancellation) &&
        Objects.equals(this.isVacationRentals, businessDataGoogleHotelSearchesLiveRequestInfo.isVacationRentals) &&
        Objects.equals(this.amenities, businessDataGoogleHotelSearchesLiveRequestInfo.amenities) &&
        Objects.equals(this.tag, businessDataGoogleHotelSearchesLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationName, locationCode, locationCoordinate, languageName, languageCode, depth, checkIn, checkOut, currency, adults, children, stars, minRating, sortBy, minPrice, maxPrice, freeCancellation, isVacationRentals, amenities, tag);
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
    sb.append("class BusinessDataGoogleHotelSearchesLiveRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
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
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
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
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataGoogleHotelSearchesLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataGoogleHotelSearchesLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataGoogleHotelSearchesLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataGoogleHotelSearchesLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataGoogleHotelSearchesLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataGoogleHotelSearchesLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataGoogleHotelSearchesLiveRequestInfo value) throws IOException {
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
           public BusinessDataGoogleHotelSearchesLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataGoogleHotelSearchesLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessDataGoogleHotelSearchesLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataGoogleHotelSearchesLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}