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


public class KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * <em>keywords</em><br><strong>required field</strong><br>The maximum number of keywords you can specify: 1000<br>The maximum number of characters for each keyword: 80<br>The maximum number of words for each keyword phrase: 10<br>the keywords you specify will be converted to a lowercase format<br><strong>Note:</strong> Google Ads may return no data for certain groups of keywords<br><a href='https://dataforseo.com/help-center/no-search-volume-data-for-some-keywords' target='_blank' rel='noopener noreferrer'>visit our Help Center to learn more</a><br><strong>Also note</strong> that Google Ads doesn't allow using certain symbols and characters (e.g., UTF symbols, emojis), so you can't use them when setting a task;<br>to learn more about which symbols and characters can be used, please refer to <a href='https://dataforseo.com/help-center/using-symbols-in-keywords-when-setting-a-google-ads-task' target='_blank' rel='noopener noreferrer'>this article</a><p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
   * @return keywords
   */
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Long bid;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo bid(Long bid) {
    this.bid = bid;
    return this;
  }

  /**
   * <em>the maximum custom bid</em><br><strong>required field</strong><br>the collected data will be based on this value<br>it stands for the price you are willing to pay for an ad; the higher value you specify here, the higher values you will get in the returned metrics<br>learn more in <a href='https://dataforseo.com/help-center/configuring-bid'>this help center article</a>
   * @return bid
   */
  @javax.annotation.Nullable
  public Long getBid() {
    return bid;
  }

  public void setBid(Long bid) {
    this.bid = bid;
  }


  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private String match;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo match(String match) {
    this.match = match;
    return this;
  }

  /**
   * <em>keywords match-type</em><br><strong>required field</strong><br>can take the following values: <code>exact</code>, <code>broad</code>, <code>phrase</code>
   * @return match
   */
  @javax.annotation.Nullable
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br>optional field<br>if you do not indicate the location, you will receive worldwide results, i.e., for all available locations;<br><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_ads/locations</code><br>example:<br><code class='long-string'>London,England,United Kingdom</code>
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

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br>optional field<br>if you do not indicate the location, you will receive worldwide results, i.e., for all available locations;<br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong>;<br>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_ads/locations</code><br>example:<br><code class='long-string'>2840</code>
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

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br>optional field<br>if you do not indicate the location, you will receive worldwide results, i.e., for all available locations;<br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong>;<br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude'</em> format;<br><strong>the data will be provided for the country the specified coordinates belong to</strong>;<br>example:<br><code class='long-string'>52.6178549,-155.352142</code>
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

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br>optional field<br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_ads/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br>optional field<br>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_ads/languages</code><br>example:<br><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * <em>starting date of the forecasting time range</em><br>required field if you specify <code>date_to</code><br><strong>if you indicate <code>date_from</code> and <code>date_to</code>, you don't need to specify <code>date_interval</code></strong><br>minimum value is tomorrow's date<br>the value you specify in <code>date_from</code> shouldn't be further than <code>date_to</code><br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2021-10-30'</code>if <a href='/v3/keywords_data/google_ads/status/' target='_blank' rel='noopener noreferrer'>Status endpoint</a> returns <code>false</code> in the <code>actual_data</code> field, <code>date_from</code> can be set to the month before last and prior;<br>if <a href='/v3/keywords_data/google_ads/status/' target='_blank' rel='noopener noreferrer'>Status endpoint</a> returns <code>true</code> in the <code>actual_data</code> field, <code>date_from</code> can be set to the last month and prior
   * @return dateFrom
   */
  @javax.annotation.Nullable
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }


  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private String dateTo;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * <em>ending date of the forecasting time range</em><br>required field if you specify <code>date_from</code><br><strong>if you indicate <code>date_from</code> and <code>date_to</code>, you don't need to specify <code>date_interval</code></strong><br>minimum value is <code>date_from</code> +1 day<br>maximum value is current day and month of the next year<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2022-10-30'</code>
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public static final String SERIALIZED_NAME_DATE_INTERVAL = "date_interval";
  @SerializedName(SERIALIZED_NAME_DATE_INTERVAL)
  private String dateInterval;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo dateInterval(String dateInterval) {
    this.dateInterval = dateInterval;
    return this;
  }

  /**
   * <em>forecasting date interval</em><br>optional field<br><strong>if you specify <code>date_interval</code>, you don't need to indicate <code>date_from</code> and <code>date_to</code></strong><br>possible values: <code>next_week</code>, <code>next_month</code>, <code>next_quarter</code><br>default value: <code>next_month</code>
   * @return dateInterval
   */
  @javax.annotation.Nullable
  public String getDateInterval() {
    return dateInterval;
  }

  public void setDateInterval(String dateInterval) {
    this.dateInterval = dateInterval;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * <em>results sorting parameters</em><br>optional field<br>Use these parameters to sort the results by <code>relevance</code>, <code>impressions</code>, <code>ctr</code>, <code>average_cpc</code>, <code>cost</code>, or <code>clicks</code> in the descending order<br>default value: <code>relevance</code>
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo tag(String tag) {
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



  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo = (KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo) o;
    return

        Objects.equals(this.keywords, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.keywords) &&
        Objects.equals(this.bid, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.bid) &&
        Objects.equals(this.match, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.match) &&
        Objects.equals(this.locationName, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.languageCode) &&
        Objects.equals(this.dateFrom, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.dateTo) &&
        Objects.equals(this.dateInterval, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.dateInterval) &&
        Objects.equals(this.sortBy, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.sortBy) &&
        Objects.equals(this.tag, keywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywords, bid, match, locationName, locationCode, locationCoordinate, languageName, languageCode, dateFrom, dateTo, dateInterval, sortBy, tag);
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
    sb.append("class KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo {\n");

    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    dateInterval: ").append(toIndentedString(dateInterval)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    
    openapiFields.add("keywords");
    
    openapiFields.add("bid");
    
    openapiFields.add("match");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("date_from");
    
    openapiFields.add("date_to");
    
    openapiFields.add("date_interval");
    
    openapiFields.add("sort_by");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo value) throws IOException {
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
           public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}