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


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.dataforseo.client.model.ImpressionsInfo;
import org.dataforseo.client.model.KeywordInfo;
import org.dataforseo.client.model.KeywordProperties;
import org.dataforseo.client.model.SerpInfo;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * DataforseoLabsGoogleHistoricalSearchVolumeLiveItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class DataforseoLabsGoogleHistoricalSearchVolumeLiveItem {
  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public static final String SERIALIZED_NAME_KEYWORD_INFO = "keyword_info";
  @SerializedName(SERIALIZED_NAME_KEYWORD_INFO)
  private KeywordInfo keywordInfo;

  public static final String SERIALIZED_NAME_KEYWORD_PROPERTIES = "keyword_properties";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PROPERTIES)
  private KeywordProperties keywordProperties;

  public static final String SERIALIZED_NAME_IMPRESSIONS_INFO = "impressions_info";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS_INFO)
  private ImpressionsInfo impressionsInfo;

  public static final String SERIALIZED_NAME_SERP_INFO = "serp_info";
  @SerializedName(SERIALIZED_NAME_SERP_INFO)
  private SerpInfo serpInfo;

  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem() {
  }

  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

   /**
   * search engine type
   * @return seType
  **/
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * keyword keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character)
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * location code in a POST array if there is no data, then the value is null
   * @return locationCode
  **/
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * language code in a POST array
   * @return languageCode
  **/
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

   /**
   * indicates data for Google and partner sites if true, the results are returned for owned, operated, and syndicated networks across Google and partner sites that host Google search; if false, the results are returned for Google search sites only
   * @return searchPartners
  **/
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem keywordInfo(KeywordInfo keywordInfo) {
    this.keywordInfo = keywordInfo;
    return this;
  }

   /**
   * Get keywordInfo
   * @return keywordInfo
  **/
  @javax.annotation.Nullable
  public KeywordInfo getKeywordInfo() {
    return keywordInfo;
  }

  public void setKeywordInfo(KeywordInfo keywordInfo) {
    this.keywordInfo = keywordInfo;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem keywordProperties(KeywordProperties keywordProperties) {
    this.keywordProperties = keywordProperties;
    return this;
  }

   /**
   * Get keywordProperties
   * @return keywordProperties
  **/
  @javax.annotation.Nullable
  public KeywordProperties getKeywordProperties() {
    return keywordProperties;
  }

  public void setKeywordProperties(KeywordProperties keywordProperties) {
    this.keywordProperties = keywordProperties;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem impressionsInfo(ImpressionsInfo impressionsInfo) {
    this.impressionsInfo = impressionsInfo;
    return this;
  }

   /**
   * Get impressionsInfo
   * @return impressionsInfo
  **/
  @javax.annotation.Nullable
  public ImpressionsInfo getImpressionsInfo() {
    return impressionsInfo;
  }

  public void setImpressionsInfo(ImpressionsInfo impressionsInfo) {
    this.impressionsInfo = impressionsInfo;
  }


  public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem serpInfo(SerpInfo serpInfo) {
    this.serpInfo = serpInfo;
    return this;
  }

   /**
   * Get serpInfo
   * @return serpInfo
  **/
  @javax.annotation.Nullable
  public SerpInfo getSerpInfo() {
    return serpInfo;
  }

  public void setSerpInfo(SerpInfo serpInfo) {
    this.serpInfo = serpInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataforseoLabsGoogleHistoricalSearchVolumeLiveItem dataforseoLabsGoogleHistoricalSearchVolumeLiveItem = (DataforseoLabsGoogleHistoricalSearchVolumeLiveItem) o;
    return Objects.equals(this.seType, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.seType) &&
        Objects.equals(this.keyword, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.keyword) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.locationCode) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.languageCode) &&
        Objects.equals(this.searchPartners, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.searchPartners) &&
        Objects.equals(this.keywordInfo, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.keywordInfo) &&
        Objects.equals(this.keywordProperties, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.keywordProperties) &&
        Objects.equals(this.impressionsInfo, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.impressionsInfo) &&
        Objects.equals(this.serpInfo, dataforseoLabsGoogleHistoricalSearchVolumeLiveItem.serpInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(seType, keyword, locationCode, languageCode, searchPartners, keywordInfo, keywordProperties, impressionsInfo, serpInfo);
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
    sb.append("class DataforseoLabsGoogleHistoricalSearchVolumeLiveItem {\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
    sb.append("    keywordInfo: ").append(toIndentedString(keywordInfo)).append("\n");
    sb.append("    keywordProperties: ").append(toIndentedString(keywordProperties)).append("\n");
    sb.append("    impressionsInfo: ").append(toIndentedString(impressionsInfo)).append("\n");
    sb.append("    serpInfo: ").append(toIndentedString(serpInfo)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("keyword");
    openapiFields.add("location_code");
    openapiFields.add("language_code");
    openapiFields.add("search_partners");
    openapiFields.add("keyword_info");
    openapiFields.add("keyword_properties");
    openapiFields.add("impressions_info");
    openapiFields.add("serp_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleHistoricalSearchVolumeLiveItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoLabsGoogleHistoricalSearchVolumeLiveItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoLabsGoogleHistoricalSearchVolumeLiveItem is not found in the empty JSON string", DataforseoLabsGoogleHistoricalSearchVolumeLiveItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataforseoLabsGoogleHistoricalSearchVolumeLiveItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataforseoLabsGoogleHistoricalSearchVolumeLiveItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("se_type") != null && !jsonObj.get("se_type").isJsonNull()) && !jsonObj.get("se_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `se_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("se_type").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      // validate the optional field `keyword_info`
      if (jsonObj.get("keyword_info") != null && !jsonObj.get("keyword_info").isJsonNull()) {
        KeywordInfo.validateJsonElement(jsonObj.get("keyword_info"));
      }
      // validate the optional field `keyword_properties`
      if (jsonObj.get("keyword_properties") != null && !jsonObj.get("keyword_properties").isJsonNull()) {
        KeywordProperties.validateJsonElement(jsonObj.get("keyword_properties"));
      }
      // validate the optional field `impressions_info`
      if (jsonObj.get("impressions_info") != null && !jsonObj.get("impressions_info").isJsonNull()) {
        ImpressionsInfo.validateJsonElement(jsonObj.get("impressions_info"));
      }
      // validate the optional field `serp_info`
      if (jsonObj.get("serp_info") != null && !jsonObj.get("serp_info").isJsonNull()) {
        SerpInfo.validateJsonElement(jsonObj.get("serp_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleHistoricalSearchVolumeLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleHistoricalSearchVolumeLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleHistoricalSearchVolumeLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleHistoricalSearchVolumeLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleHistoricalSearchVolumeLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleHistoricalSearchVolumeLiveItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataforseoLabsGoogleHistoricalSearchVolumeLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataforseoLabsGoogleHistoricalSearchVolumeLiveItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataforseoLabsGoogleHistoricalSearchVolumeLiveItem
  * @throws IOException if the JSON string is invalid with respect to DataforseoLabsGoogleHistoricalSearchVolumeLiveItem
  */
  public static DataforseoLabsGoogleHistoricalSearchVolumeLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleHistoricalSearchVolumeLiveItem.class);
  }

 /**
  * Convert an instance of DataforseoLabsGoogleHistoricalSearchVolumeLiveItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
