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

/**
 * BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo() {
  }

  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword required field the keyword you specify should indicate the name of the local establishment you can specify up to 700 symbols in the keyword filed all %## will be decoded (plus symbol ‘+’ will be decoded to a space character) if you need to use the “%” symbol for your keyword, please specify it as “%25”;  this field can also be used to pass the following parameters: cid – a unique, google-defined id of the business entity; place_id – an identifier of the business entity in Google Maps; spp – a unique identifier of local services featured in the local_pack element of Google SERP example: cid:194604053573767737 place_id:GhIJQWDl0CIeQUARxks3icF8U8A spp:CgsvZy8xdGN4cWRraBoUChIJPZDrEzLsZIgRoNrpodC5P30 learn more about the cid and place_id identifiers in this help center article
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location required field if you don’t specify location_code or location_coordinate if you use this field, you don’t need to specify location_code or location_coordinate you can receive the list of available locations with location_name by making a separate request to https://api.dataforseo.com/v3/business_data/google/locations example: London,England,United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code required field if you don’t specify location_name or location_coordinate if you use this field, you don’t need to specify location_name or location_coordinate you can receive the list of available locations with location_code by making a separate request to the https://api.dataforseo.com/v3/business_data/google/locations example: 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * GPS coordinates of a location required field if you don’t specify location_name or location_code if you use this field, you don’t need to specify location_name or location_code location_coordinate parameter should be specified in the “latitude,longitude,radius” format the maximum number of decimal digits for “latitude” and “longitude”: 7 the minimum value for “radius”: 199.9 (mm) the maximum value for “radius”: 199999 (mm) example: 53.476225,-2.243572,200
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language required field if you don’t specify language_code if you use this field, you don’t need to specify language_code you can receive the list of available languages with language_name by making a separate request to https://api.dataforseo.com/v3/business_data/google/languages example: English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code required field if you don’t specify language_name if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/business_data/google/languages example: en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special symbols in postback_url will be urlencoded; i.a., the # symbol will be encoded into %23
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special symbols in pingback_url will be urlencoded; i.a., the # symbol will be encoded into %23
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }


  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * parsing depth optional field number of updates in SERP we strongly recommend setting the parsing depth in the multiples of ten, because our systems processes ten updates in a row please note that Google returns 4490 updates maximum default value: 10
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
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
   * @return the BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo instance itself
   */
  public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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
    BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo = (BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo) o;
    return Objects.equals(this.keyword, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.keyword) &&
        Objects.equals(this.priority, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.priority) &&
        Objects.equals(this.locationName, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.tag, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.depth, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.depth)&&
        Objects.equals(this.additionalProperties, businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, priority, locationName, locationCode, locationCoordinate, languageName, languageCode, tag, postbackUrl, pingbackUrl, depth, additionalProperties);
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
    sb.append("class BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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
    openapiFields.add("keyword");
    openapiFields.add("priority");
    openapiFields.add("location_name");
    openapiFields.add("location_code");
    openapiFields.add("location_coordinate");
    openapiFields.add("language_name");
    openapiFields.add("language_code");
    openapiFields.add("tag");
    openapiFields.add("postback_url");
    openapiFields.add("pingback_url");
    openapiFields.add("depth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo is not found in the empty JSON string", BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      if ((jsonObj.get("location_name") != null && !jsonObj.get("location_name").isJsonNull()) && !jsonObj.get("location_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_name").toString()));
      }
      if ((jsonObj.get("location_coordinate") != null && !jsonObj.get("location_coordinate").isJsonNull()) && !jsonObj.get("location_coordinate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_coordinate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_coordinate").toString()));
      }
      if ((jsonObj.get("language_name") != null && !jsonObj.get("language_name").isJsonNull()) && !jsonObj.get("language_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_name").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("postback_url") != null && !jsonObj.get("postback_url").isJsonNull()) && !jsonObj.get("postback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postback_url").toString()));
      }
      if ((jsonObj.get("pingback_url") != null && !jsonObj.get("pingback_url").isJsonNull()) && !jsonObj.get("pingback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pingback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pingback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo value) throws IOException {
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
           public BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo
   * @throws IOException if the JSON string is invalid with respect to BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo
   */
  public static BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.class);
  }

  /**
   * Convert an instance of BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
