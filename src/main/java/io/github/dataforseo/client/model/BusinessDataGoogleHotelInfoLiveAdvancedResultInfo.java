/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.client.model.HotelAboutInfo;
import io.github.dataforseo.client.model.HotelPriceInfo;
import io.github.dataforseo.client.model.HotelReviewInfo;
import io.github.dataforseo.client.model.Location;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

/**
 * BusinessDataGoogleHotelInfoLiveAdvancedResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BusinessDataGoogleHotelInfoLiveAdvancedResultInfo {
  public static final String SERIALIZED_NAME_HOTEL_IDENTIFIER = "hotel_identifier";
  @SerializedName(SERIALIZED_NAME_HOTEL_IDENTIFIER)
  private String hotelIdentifier;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STARS = "stars";
  @SerializedName(SERIALIZED_NAME_STARS)
  private Integer stars;

  public static final String SERIALIZED_NAME_STARS_DESCRIPTION = "stars_description";
  @SerializedName(SERIALIZED_NAME_STARS_DESCRIPTION)
  private String starsDescription;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_ABOUT = "about";
  @SerializedName(SERIALIZED_NAME_ABOUT)
  private HotelAboutInfo about;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_REVIEWS = "reviews";
  @SerializedName(SERIALIZED_NAME_REVIEWS)
  private HotelReviewInfo reviews;

  public static final String SERIALIZED_NAME_OVERVIEW_IMAGES = "overview_images";
  @SerializedName(SERIALIZED_NAME_OVERVIEW_IMAGES)
  private List<String> overviewImages;

  public static final String SERIALIZED_NAME_PRICES = "prices";
  @SerializedName(SERIALIZED_NAME_PRICES)
  private HotelPriceInfo prices;

  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo() {
  }

  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo hotelIdentifier(String hotelIdentifier) {
    this.hotelIdentifier = hotelIdentifier;
    return this;
  }

  /**
   * identifier received in a POST array this field will contain the hotel_identifier parameter specified when setting a task; example: CgoI-KWyzenM_MV3EAE
   * @return hotelIdentifier
   */
  @javax.annotation.Nullable
  public String getHotelIdentifier() {
    return hotelIdentifier;
  }

  public void setHotelIdentifier(String hotelIdentifier) {
    this.hotelIdentifier = hotelIdentifier;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results you can use it to make sure that we provided accurate results
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * hotel title the title of the hotel entity for which the results are collected
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo stars(Integer stars) {
    this.stars = stars;
    return this;
  }

  /**
   * hotel class rating class rating that ranges between 1-5 stars and displayed after review ratings in hotel summary
   * @return stars
   */
  @javax.annotation.Nullable
  public Integer getStars() {
    return stars;
  }

  public void setStars(Integer stars) {
    this.stars = stars;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo starsDescription(String starsDescription) {
    this.starsDescription = starsDescription;
    return this;
  }

  /**
   * hotel class rating class rating that ranges between 1-5 stars and displayed after review ratings in the hotel summary
   * @return starsDescription
   */
  @javax.annotation.Nullable
  public String getStarsDescription() {
    return starsDescription;
  }

  public void setStarsDescription(String starsDescription) {
    this.starsDescription = starsDescription;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo address(String address) {
    this.address = address;
    return this;
  }

  /**
   * hotel address physical address of the hotel
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * hotel phone number contact phone number of the hotel
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo about(HotelAboutInfo about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   * @return about
   */
  @javax.annotation.Nullable
  public HotelAboutInfo getAbout() {
    return about;
  }

  public void setAbout(HotelAboutInfo about) {
    this.about = about;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo reviews(HotelReviewInfo reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * Get reviews
   * @return reviews
   */
  @javax.annotation.Nullable
  public HotelReviewInfo getReviews() {
    return reviews;
  }

  public void setReviews(HotelReviewInfo reviews) {
    this.reviews = reviews;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo overviewImages(List<String> overviewImages) {
    this.overviewImages = overviewImages;
    return this;
  }

  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo addOverviewImagesItem(String overviewImagesItem) {
    if (this.overviewImages == null) {
      this.overviewImages = new ArrayList<>();
    }
    this.overviewImages.add(overviewImagesItem);
    return this;
  }

  /**
   * images displayed in the hotel overview array containing URLs to images displayed in the hotel overview
   * @return overviewImages
   */
  @javax.annotation.Nullable
  public List<String> getOverviewImages() {
    return overviewImages;
  }

  public void setOverviewImages(List<String> overviewImages) {
    this.overviewImages = overviewImages;
  }


  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo prices(HotelPriceInfo prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
   */
  @javax.annotation.Nullable
  public HotelPriceInfo getPrices() {
    return prices;
  }

  public void setPrices(HotelPriceInfo prices) {
    this.prices = prices;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BusinessDataGoogleHotelInfoLiveAdvancedResultInfo instance itself
   */
  public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    BusinessDataGoogleHotelInfoLiveAdvancedResultInfo businessDataGoogleHotelInfoLiveAdvancedResultInfo = (BusinessDataGoogleHotelInfoLiveAdvancedResultInfo) o;
    return Objects.equals(this.hotelIdentifier, businessDataGoogleHotelInfoLiveAdvancedResultInfo.hotelIdentifier) &&
        Objects.equals(this.locationCode, businessDataGoogleHotelInfoLiveAdvancedResultInfo.locationCode) &&
        Objects.equals(this.languageCode, businessDataGoogleHotelInfoLiveAdvancedResultInfo.languageCode) &&
        Objects.equals(this.checkUrl, businessDataGoogleHotelInfoLiveAdvancedResultInfo.checkUrl) &&
        Objects.equals(this.datetime, businessDataGoogleHotelInfoLiveAdvancedResultInfo.datetime) &&
        Objects.equals(this.title, businessDataGoogleHotelInfoLiveAdvancedResultInfo.title) &&
        Objects.equals(this.stars, businessDataGoogleHotelInfoLiveAdvancedResultInfo.stars) &&
        Objects.equals(this.starsDescription, businessDataGoogleHotelInfoLiveAdvancedResultInfo.starsDescription) &&
        Objects.equals(this.address, businessDataGoogleHotelInfoLiveAdvancedResultInfo.address) &&
        Objects.equals(this.phone, businessDataGoogleHotelInfoLiveAdvancedResultInfo.phone) &&
        Objects.equals(this.about, businessDataGoogleHotelInfoLiveAdvancedResultInfo.about) &&
        Objects.equals(this.location, businessDataGoogleHotelInfoLiveAdvancedResultInfo.location) &&
        Objects.equals(this.reviews, businessDataGoogleHotelInfoLiveAdvancedResultInfo.reviews) &&
        Objects.equals(this.overviewImages, businessDataGoogleHotelInfoLiveAdvancedResultInfo.overviewImages) &&
        Objects.equals(this.prices, businessDataGoogleHotelInfoLiveAdvancedResultInfo.prices)&&
        Objects.equals(this.additionalProperties, businessDataGoogleHotelInfoLiveAdvancedResultInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelIdentifier, locationCode, languageCode, checkUrl, datetime, title, stars, starsDescription, address, phone, about, location, reviews, overviewImages, prices, additionalProperties);
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
    sb.append("class BusinessDataGoogleHotelInfoLiveAdvancedResultInfo {\n");
    sb.append("    hotelIdentifier: ").append(toIndentedString(hotelIdentifier)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    starsDescription: ").append(toIndentedString(starsDescription)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    overviewImages: ").append(toIndentedString(overviewImages)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("location_code");
    openapiFields.add("language_code");
    openapiFields.add("check_url");
    openapiFields.add("datetime");
    openapiFields.add("title");
    openapiFields.add("stars");
    openapiFields.add("stars_description");
    openapiFields.add("address");
    openapiFields.add("phone");
    openapiFields.add("about");
    openapiFields.add("location");
    openapiFields.add("reviews");
    openapiFields.add("overview_images");
    openapiFields.add("prices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataGoogleHotelInfoLiveAdvancedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessDataGoogleHotelInfoLiveAdvancedResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessDataGoogleHotelInfoLiveAdvancedResultInfo is not found in the empty JSON string", BusinessDataGoogleHotelInfoLiveAdvancedResultInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hotel_identifier") != null && !jsonObj.get("hotel_identifier").isJsonNull()) && !jsonObj.get("hotel_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotel_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotel_identifier").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("check_url") != null && !jsonObj.get("check_url").isJsonNull()) && !jsonObj.get("check_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_url").toString()));
      }
      if ((jsonObj.get("datetime") != null && !jsonObj.get("datetime").isJsonNull()) && !jsonObj.get("datetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetime").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("stars_description") != null && !jsonObj.get("stars_description").isJsonNull()) && !jsonObj.get("stars_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stars_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stars_description").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `about`
      if (jsonObj.get("about") != null && !jsonObj.get("about").isJsonNull()) {
        HotelAboutInfo.validateJsonElement(jsonObj.get("about"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `reviews`
      if (jsonObj.get("reviews") != null && !jsonObj.get("reviews").isJsonNull()) {
        HotelReviewInfo.validateJsonElement(jsonObj.get("reviews"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("overview_images") != null && !jsonObj.get("overview_images").isJsonNull() && !jsonObj.get("overview_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `overview_images` to be an array in the JSON string but got `%s`", jsonObj.get("overview_images").toString()));
      }
      // validate the optional field `prices`
      if (jsonObj.get("prices") != null && !jsonObj.get("prices").isJsonNull()) {
        HotelPriceInfo.validateJsonElement(jsonObj.get("prices"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataGoogleHotelInfoLiveAdvancedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataGoogleHotelInfoLiveAdvancedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataGoogleHotelInfoLiveAdvancedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataGoogleHotelInfoLiveAdvancedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataGoogleHotelInfoLiveAdvancedResultInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataGoogleHotelInfoLiveAdvancedResultInfo value) throws IOException {
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
           public BusinessDataGoogleHotelInfoLiveAdvancedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataGoogleHotelInfoLiveAdvancedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of BusinessDataGoogleHotelInfoLiveAdvancedResultInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessDataGoogleHotelInfoLiveAdvancedResultInfo
   * @throws IOException if the JSON string is invalid with respect to BusinessDataGoogleHotelInfoLiveAdvancedResultInfo
   */
  public static BusinessDataGoogleHotelInfoLiveAdvancedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataGoogleHotelInfoLiveAdvancedResultInfo.class);
  }

  /**
   * Convert an instance of BusinessDataGoogleHotelInfoLiveAdvancedResultInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
