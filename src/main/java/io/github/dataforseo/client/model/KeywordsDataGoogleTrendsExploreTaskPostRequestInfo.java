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


public class KeywordsDataGoogleTrendsExploreTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * <em>keywords</em><br><strong>required field</strong><br>the maximum number of keywords you can specify: 5<br>the maximum number of characters you can specify in a keyword: 100<br>the minimum number of characters must be greater than 1<br>comma characters (<code>,</code>) in the specified keywords will be unset and ignored<p><strong>Note:</strong> keywords cannot consist of a combination of the following characters: <code>< > |  ' - + = ~ ! : * ( ) [ ] { }</code><p><strong>Note:</strong> to obtain <code>google_trends_topics_list</code> and <code>google_trends_queries_list</code> items, specify no more than 1 keyword<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
   * @return keywords
   */
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br>optional field<br>if you don't use this field, you will recieve global results<br><strong>if you use this field, you don't need to specify <code>location_code</code></strong><br>you can use this field as an array to set several locations, each corresponding to a specific keyword - <a href='https://dataforseo.com/help-center/multiple-locations-in-google-trends-api' rel='noopener noreferrer' target='_blank'>learn more</a>;<br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_trends/locations</code><br>example:<br><code class='long-string'>United Kingdom</code>
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
  private String locationCode;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br>optional field<br>if you don't use this field, you will recieve global results<br><strong>if you use this field, you don't need to specify <code>location_name</code></strong><br>you can use this field as an array to set several locations, each corresponding to a specific keyword - <a href='https://dataforseo.com/help-center/multiple-locations-in-google-trends-api' rel='noopener noreferrer' target='_blank'>learn more</a>;<br>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_trends/locations</code><br>example:<br><code class='long-string'>2840</code>
   * @return locationCode
   */
  @javax.annotation.Nullable
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br>optional field<br>default value: <code>English</code><br>if you use this field, you don't need to specify <code>language_code</code><br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_trends/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br>optional field<br>default value: <code>en</code><br>if you use this field, you don't need to specify <code>language_name</code><br>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/google_trends/languages</code><br>example:<br><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_CATEGORY_CODE = "category_code";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private Integer categoryCode;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo categoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

  /**
   * <em>google trends search category</em><br>optional field<br>if you don't specify this field, the <code>0</code> value will be applied by default and the search will be carried out across all available categories<br>you can receive the list of available categories with their <code>category_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/keywords_data/google_trends/categories</code>
   * @return categoryCode
   */
  @javax.annotation.Nullable
  public Integer getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * <em>starting date of the time range</em><br>optional field<br>if you don't specify this field, the current day and month of the preceding year will be used by default<br>minimal value for the <code>web</code> type: <code>2004-01-01</code><br>minimal value for other types: <code>2008-01-01</code><br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2019-01-15'</code>
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

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * <em>ending date of the time range</em><br>optional field<br>if you don't specify this field, the today's date will be used by default<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2019-01-15'</code>
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public static final String SERIALIZED_NAME_TIME_RANGE = "time_range";
  @SerializedName(SERIALIZED_NAME_TIME_RANGE)
  private String timeRange;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo timeRange(String timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * <em>preset time ranges</em><br>optional field<br>if you specify <code>date_from</code> or <code>date_to</code> parameters, this field will be ignored when setting a task<br><em>possible values for all <code>type</code> parameters:</em><br><code>past_hour</code>, <code>past_4_hours</code>, <code>past_day</code>, <code>past_7_days</code>, <code>past_30_days</code>, <code>past_90_days</code>, <code>past_12_months</code>, <code>past_5_years</code><br><em>possible values for <code>web</code> only:</em><br><code>2004_present</code><br><em>possible values for <code>news</code>, <code>youtube</code>, <code>images</code>, <code>froogle</code>:</em><br><code>2008_present</code>
   * @return timeRange
   */
  @javax.annotation.Nullable
  public String getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(String timeRange) {
    this.timeRange = timeRange;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * <em>types of items returned</em><br>optional field<br>to speed up the execution of the request, specify one item at a time;<br>possible values:<br><code>'google_trends_graph'</code>, <code>'google_trends_map'</code>, <code>'google_trends_topics_list'</code>,<code>'google_trends_queries_list'</code><br>default value:<br><code>'google_trends_graph'</code><p><strong>Note:</strong> to obtain <code>google_trends_topics_list</code> and <code>google_trends_queries_list</code> items, specify no more than 1 keyword in the <code>keywords</code> field
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <em>URL for sending task results</em><br>optional field<br>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/postbackscript?id=$id</code><br><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
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

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo tag(String tag) {
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



  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataGoogleTrendsExploreTaskPostRequestInfo keywordsDataGoogleTrendsExploreTaskPostRequestInfo = (KeywordsDataGoogleTrendsExploreTaskPostRequestInfo) o;
    return

        Objects.equals(this.keywords, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.keywords) &&
        Objects.equals(this.locationName, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.languageName, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.type, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.type) &&
        Objects.equals(this.categoryCode, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.categoryCode) &&
        Objects.equals(this.dateFrom, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.dateTo) &&
        Objects.equals(this.timeRange, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.timeRange) &&
        Objects.equals(this.itemTypes, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.itemTypes) &&
        Objects.equals(this.postbackUrl, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.tag, keywordsDataGoogleTrendsExploreTaskPostRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywords, locationName, locationCode, languageName, languageCode, type, categoryCode, dateFrom, dateTo, timeRange, itemTypes, postbackUrl, pingbackUrl, tag);
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
    sb.append("class KeywordsDataGoogleTrendsExploreTaskPostRequestInfo {\n");

    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
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
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("type");
    
    openapiFields.add("category_code");
    
    openapiFields.add("date_from");
    
    openapiFields.add("date_to");
    
    openapiFields.add("time_range");
    
    openapiFields.add("item_types");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("pingback_url");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleTrendsExploreTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleTrendsExploreTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleTrendsExploreTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleTrendsExploreTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleTrendsExploreTaskPostRequestInfo value) throws IOException {
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
           public KeywordsDataGoogleTrendsExploreTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataGoogleTrendsExploreTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataGoogleTrendsExploreTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleTrendsExploreTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}