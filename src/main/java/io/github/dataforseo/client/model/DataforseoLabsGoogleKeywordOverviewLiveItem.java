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



public class DataforseoLabsGoogleKeywordOverviewLiveItem  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsGoogleKeywordOverviewLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public DataforseoLabsGoogleKeywordOverviewLiveItem keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword
* keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character)
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public DataforseoLabsGoogleKeywordOverviewLiveItem locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
* if there is no data, then the value is null
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public DataforseoLabsGoogleKeywordOverviewLiveItem languageCode(String languageCode) {
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


  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public DataforseoLabsGoogleKeywordOverviewLiveItem searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

  /**
   * indicates data for Google and partner sites
* if true, the results are returned for owned, operated, and syndicated networks across Google and partner sites that host Google search;
* if false, the results are returned for Google search sites only
   * @return searchPartners
   */
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public static final String SERIALIZED_NAME_KEYWORD_INFO = "keyword_info";
  @SerializedName(SERIALIZED_NAME_KEYWORD_INFO)
  private KeywordInfo keywordInfo;

  public DataforseoLabsGoogleKeywordOverviewLiveItem keywordInfo(KeywordInfo keywordInfo) {
    this.keywordInfo = keywordInfo;
    return this;
  }

  /**
   * keyword data for the returned keyword
   * @return keywordInfo
   */
  @javax.annotation.Nullable
  public KeywordInfo getKeywordInfo() {
    return keywordInfo;
  }

  public void setKeywordInfo(KeywordInfo keywordInfo) {
    this.keywordInfo = keywordInfo;
  }


  public static final String SERIALIZED_NAME_KEYWORD_INFO_NORMALIZED_WITH_BING = "keyword_info_normalized_with_bing";
  @SerializedName(SERIALIZED_NAME_KEYWORD_INFO_NORMALIZED_WITH_BING)
  private KeywordInfoNormalizedWithInfo keywordInfoNormalizedWithBing;

  public DataforseoLabsGoogleKeywordOverviewLiveItem keywordInfoNormalizedWithBing(KeywordInfoNormalizedWithInfo keywordInfoNormalizedWithBing) {
    this.keywordInfoNormalizedWithBing = keywordInfoNormalizedWithBing;
    return this;
  }

  /**
   * contains keyword search volume normalized with Bing search volume
   * @return keywordInfoNormalizedWithBing
   */
  @javax.annotation.Nullable
  public KeywordInfoNormalizedWithInfo getKeywordInfoNormalizedWithBing() {
    return keywordInfoNormalizedWithBing;
  }

  public void setKeywordInfoNormalizedWithBing(KeywordInfoNormalizedWithInfo keywordInfoNormalizedWithBing) {
    this.keywordInfoNormalizedWithBing = keywordInfoNormalizedWithBing;
  }


  public static final String SERIALIZED_NAME_KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM = "keyword_info_normalized_with_clickstream";
  @SerializedName(SERIALIZED_NAME_KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM)
  private KeywordInfoNormalizedWithInfo keywordInfoNormalizedWithClickstream;

  public DataforseoLabsGoogleKeywordOverviewLiveItem keywordInfoNormalizedWithClickstream(KeywordInfoNormalizedWithInfo keywordInfoNormalizedWithClickstream) {
    this.keywordInfoNormalizedWithClickstream = keywordInfoNormalizedWithClickstream;
    return this;
  }

  /**
   * contains keyword search volume normalized with clickstream data
   * @return keywordInfoNormalizedWithClickstream
   */
  @javax.annotation.Nullable
  public KeywordInfoNormalizedWithInfo getKeywordInfoNormalizedWithClickstream() {
    return keywordInfoNormalizedWithClickstream;
  }

  public void setKeywordInfoNormalizedWithClickstream(KeywordInfoNormalizedWithInfo keywordInfoNormalizedWithClickstream) {
    this.keywordInfoNormalizedWithClickstream = keywordInfoNormalizedWithClickstream;
  }


  public static final String SERIALIZED_NAME_CLICKSTREAM_KEYWORD_INFO = "clickstream_keyword_info";
  @SerializedName(SERIALIZED_NAME_CLICKSTREAM_KEYWORD_INFO)
  private ClickstreamKeywordInfo clickstreamKeywordInfo;

  public DataforseoLabsGoogleKeywordOverviewLiveItem clickstreamKeywordInfo(ClickstreamKeywordInfo clickstreamKeywordInfo) {
    this.clickstreamKeywordInfo = clickstreamKeywordInfo;
    return this;
  }

  /**
   * clickstream data for the returned keyword
* to retrieve results for this field, the parameter include_clickstream_data must be set to true
   * @return clickstreamKeywordInfo
   */
  @javax.annotation.Nullable
  public ClickstreamKeywordInfo getClickstreamKeywordInfo() {
    return clickstreamKeywordInfo;
  }

  public void setClickstreamKeywordInfo(ClickstreamKeywordInfo clickstreamKeywordInfo) {
    this.clickstreamKeywordInfo = clickstreamKeywordInfo;
  }


  public static final String SERIALIZED_NAME_KEYWORD_PROPERTIES = "keyword_properties";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PROPERTIES)
  private KeywordProperties keywordProperties;

  public DataforseoLabsGoogleKeywordOverviewLiveItem keywordProperties(KeywordProperties keywordProperties) {
    this.keywordProperties = keywordProperties;
    return this;
  }

  /**
   * additional information about the keyword
   * @return keywordProperties
   */
  @javax.annotation.Nullable
  public KeywordProperties getKeywordProperties() {
    return keywordProperties;
  }

  public void setKeywordProperties(KeywordProperties keywordProperties) {
    this.keywordProperties = keywordProperties;
  }


  public static final String SERIALIZED_NAME_SERP_INFO = "serp_info";
  @SerializedName(SERIALIZED_NAME_SERP_INFO)
  private SerpInfo serpInfo;

  public DataforseoLabsGoogleKeywordOverviewLiveItem serpInfo(SerpInfo serpInfo) {
    this.serpInfo = serpInfo;
    return this;
  }

  /**
   * SERP data
* the value will be null if you didn’t set the field include_serp_info to true in the POST array or if there is no SERP data for this keyword in our database
   * @return serpInfo
   */
  @javax.annotation.Nullable
  public SerpInfo getSerpInfo() {
    return serpInfo;
  }

  public void setSerpInfo(SerpInfo serpInfo) {
    this.serpInfo = serpInfo;
  }


  public static final String SERIALIZED_NAME_AVG_BACKLINKS_INFO = "avg_backlinks_info";
  @SerializedName(SERIALIZED_NAME_AVG_BACKLINKS_INFO)
  private AvgBacklinksInfo avgBacklinksInfo;

  public DataforseoLabsGoogleKeywordOverviewLiveItem avgBacklinksInfo(AvgBacklinksInfo avgBacklinksInfo) {
    this.avgBacklinksInfo = avgBacklinksInfo;
    return this;
  }

  /**
   * backlink data for the returned keyword
* this object provides the average number of backlinks, referring pages and domains, as well as the average rank values among the top-10 websites ranking organically for the keyword
   * @return avgBacklinksInfo
   */
  @javax.annotation.Nullable
  public AvgBacklinksInfo getAvgBacklinksInfo() {
    return avgBacklinksInfo;
  }

  public void setAvgBacklinksInfo(AvgBacklinksInfo avgBacklinksInfo) {
    this.avgBacklinksInfo = avgBacklinksInfo;
  }


  public static final String SERIALIZED_NAME_SEARCH_INTENT_INFO = "search_intent_info";
  @SerializedName(SERIALIZED_NAME_SEARCH_INTENT_INFO)
  private SearchIntentInfo searchIntentInfo;

  public DataforseoLabsGoogleKeywordOverviewLiveItem searchIntentInfo(SearchIntentInfo searchIntentInfo) {
    this.searchIntentInfo = searchIntentInfo;
    return this;
  }

  /**
   * search intent info for the returned keyword
* learn about search intent in this help center article
   * @return searchIntentInfo
   */
  @javax.annotation.Nullable
  public SearchIntentInfo getSearchIntentInfo() {
    return searchIntentInfo;
  }

  public void setSearchIntentInfo(SearchIntentInfo searchIntentInfo) {
    this.searchIntentInfo = searchIntentInfo;
  }



  public DataforseoLabsGoogleKeywordOverviewLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleKeywordOverviewLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleKeywordOverviewLiveItem dataforseoLabsGoogleKeywordOverviewLiveItem = (DataforseoLabsGoogleKeywordOverviewLiveItem) o;
    return

        Objects.equals(this.seType, dataforseoLabsGoogleKeywordOverviewLiveItem.seType) &&
        Objects.equals(this.keyword, dataforseoLabsGoogleKeywordOverviewLiveItem.keyword) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleKeywordOverviewLiveItem.locationCode) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleKeywordOverviewLiveItem.languageCode) &&
        Objects.equals(this.searchPartners, dataforseoLabsGoogleKeywordOverviewLiveItem.searchPartners) &&
        Objects.equals(this.keywordInfo, dataforseoLabsGoogleKeywordOverviewLiveItem.keywordInfo) &&
        Objects.equals(this.keywordInfoNormalizedWithBing, dataforseoLabsGoogleKeywordOverviewLiveItem.keywordInfoNormalizedWithBing) &&
        Objects.equals(this.keywordInfoNormalizedWithClickstream, dataforseoLabsGoogleKeywordOverviewLiveItem.keywordInfoNormalizedWithClickstream) &&
        Objects.equals(this.clickstreamKeywordInfo, dataforseoLabsGoogleKeywordOverviewLiveItem.clickstreamKeywordInfo) &&
        Objects.equals(this.keywordProperties, dataforseoLabsGoogleKeywordOverviewLiveItem.keywordProperties) &&
        Objects.equals(this.serpInfo, dataforseoLabsGoogleKeywordOverviewLiveItem.serpInfo) &&
        Objects.equals(this.avgBacklinksInfo, dataforseoLabsGoogleKeywordOverviewLiveItem.avgBacklinksInfo) &&
        Objects.equals(this.searchIntentInfo, dataforseoLabsGoogleKeywordOverviewLiveItem.searchIntentInfo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, keyword, locationCode, languageCode, searchPartners, keywordInfo, keywordInfoNormalizedWithBing, keywordInfoNormalizedWithClickstream, clickstreamKeywordInfo, keywordProperties, serpInfo, avgBacklinksInfo, searchIntentInfo);
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
    sb.append("class DataforseoLabsGoogleKeywordOverviewLiveItem {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
    sb.append("    keywordInfo: ").append(toIndentedString(keywordInfo)).append("\n");
    sb.append("    keywordInfoNormalizedWithBing: ").append(toIndentedString(keywordInfoNormalizedWithBing)).append("\n");
    sb.append("    keywordInfoNormalizedWithClickstream: ").append(toIndentedString(keywordInfoNormalizedWithClickstream)).append("\n");
    sb.append("    clickstreamKeywordInfo: ").append(toIndentedString(clickstreamKeywordInfo)).append("\n");
    sb.append("    keywordProperties: ").append(toIndentedString(keywordProperties)).append("\n");
    sb.append("    serpInfo: ").append(toIndentedString(serpInfo)).append("\n");
    sb.append("    avgBacklinksInfo: ").append(toIndentedString(avgBacklinksInfo)).append("\n");
    sb.append("    searchIntentInfo: ").append(toIndentedString(searchIntentInfo)).append("\n");
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
    
    openapiFields.add("keyword_info_normalized_with_bing");
    
    openapiFields.add("keyword_info_normalized_with_clickstream");
    
    openapiFields.add("clickstream_keyword_info");
    
    openapiFields.add("keyword_properties");
    
    openapiFields.add("serp_info");
    
    openapiFields.add("avg_backlinks_info");
    
    openapiFields.add("search_intent_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleKeywordOverviewLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleKeywordOverviewLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleKeywordOverviewLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleKeywordOverviewLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleKeywordOverviewLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleKeywordOverviewLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleKeywordOverviewLiveItem value) throws IOException {
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
           public DataforseoLabsGoogleKeywordOverviewLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleKeywordOverviewLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleKeywordOverviewLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleKeywordOverviewLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}