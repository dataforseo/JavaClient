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
 * DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo {
  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<String> targets = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private String dateTo;

  public static final String SERIALIZED_NAME_IGNORE_SYNONYMS = "ignore_synonyms";
  @SerializedName(SERIALIZED_NAME_IGNORE_SYNONYMS)
  private Boolean ignoreSynonyms;

  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo() {
  }

  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * target domains and subdomains required field you can specify domains and subdomains in this field; domains and subdomains should be specified without https:// and www.; you can set up to 1000 domains or subdomains
   * @return targets
   */
  @javax.annotation.Nullable
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of the location if you use this field, you don’t have to specify location_code you can receive the list of available locations with their location_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available locations example: United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code if you use this field, you don’t have to specify location_name you can receive the list of available locations with their location_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available locations example: 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of the language if you use this field, you don’t need to specify language_code you can receive the list of available languages with their language_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available languages example: English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available languages example: en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * starting date of the time range optional field if you don’t specify this field, the data will be provided for the previous 12 months minimal possible value: 2020-10-01 date format: \&quot;yyyy-mm-dd\&quot;
   * @return dateFrom
   */
  @javax.annotation.Nullable
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * ending date of the time range optional field if you don’t specify this field, the today’s date will be used by default; date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2021-04-01\&quot;
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo ignoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
    return this;
  }

  /**
   * ignore highly similar keywords optional field if set to true only core keywords will be returned, all highly similar keywords will be excluded; default value: false
   * @return ignoreSynonyms
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreSynonyms() {
    return ignoreSynonyms;
  }

  public void setIgnoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo addItemTypesItem(String itemTypesItem) {
    if (this.itemTypes == null) {
      this.itemTypes = new ArrayList<>();
    }
    this.itemTypes.add(itemTypesItem);
    return this;
  }

  /**
   * display results by item type optional field indicates the type of search results included in the response; Note: if the item_types array contains item types that are different from organic, the results will be ordered by the first item type in the array; possible values: [\&quot;organic\&quot;, \&quot;paid\&quot;, \&quot;featured_snippet\&quot;, \&quot;local_pack\&quot;] default value: [\&quot;organic\&quot;, \&quot;paid\&quot;]
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo tag(String tag) {
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
   * @return the DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo instance itself
   */
  public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo putAdditionalProperty(String key, Object value) {
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
    DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo = (DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo) o;
    return Objects.equals(this.targets, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.targets) &&
        Objects.equals(this.locationName, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.languageCode) &&
        Objects.equals(this.dateFrom, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.dateTo) &&
        Objects.equals(this.ignoreSynonyms, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.ignoreSynonyms) &&
        Objects.equals(this.itemTypes, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.itemTypes) &&
        Objects.equals(this.tag, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.tag)&&
        Objects.equals(this.additionalProperties, dataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, locationName, locationCode, languageName, languageCode, dateFrom, dateTo, ignoreSynonyms, itemTypes, tag, additionalProperties);
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
    sb.append("class DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo {\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    ignoreSynonyms: ").append(toIndentedString(ignoreSynonyms)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("targets");
    openapiFields.add("location_name");
    openapiFields.add("location_code");
    openapiFields.add("language_name");
    openapiFields.add("language_code");
    openapiFields.add("date_from");
    openapiFields.add("date_to");
    openapiFields.add("ignore_synonyms");
    openapiFields.add("item_types");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo is not found in the empty JSON string", DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("targets") != null && !jsonObj.get("targets").isJsonNull() && !jsonObj.get("targets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targets` to be an array in the JSON string but got `%s`", jsonObj.get("targets").toString()));
      }
      if ((jsonObj.get("location_name") != null && !jsonObj.get("location_name").isJsonNull()) && !jsonObj.get("location_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_name").toString()));
      }
      if ((jsonObj.get("language_name") != null && !jsonObj.get("language_name").isJsonNull()) && !jsonObj.get("language_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_name").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("date_from") != null && !jsonObj.get("date_from").isJsonNull()) && !jsonObj.get("date_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_from").toString()));
      }
      if ((jsonObj.get("date_to") != null && !jsonObj.get("date_to").isJsonNull()) && !jsonObj.get("date_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_to").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("item_types") != null && !jsonObj.get("item_types").isJsonNull() && !jsonObj.get("item_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_types` to be an array in the JSON string but got `%s`", jsonObj.get("item_types").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo
   * @throws IOException if the JSON string is invalid with respect to DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo
   */
  public static DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.class);
  }

  /**
   * Convert an instance of DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
