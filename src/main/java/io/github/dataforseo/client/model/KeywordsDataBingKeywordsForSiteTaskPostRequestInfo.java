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


public class KeywordsDataBingKeywordsForSiteTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <em>domain or URL</em><br><strong>required field</strong><br>the URL of the webpage or the domain to scan for possible keywords
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/bing/locations</code><br>example:<br><code class='long-string'>London,England,United Kingdom</code>
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

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/keywords_data/bing/locations</code><br>example:<br><code class='long-string'>2840</code>
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

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_code</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude'</em> format<br><strong>the data will be provided for the country the specified coordinates belong to</strong><br>example:<br><code class='long-string'>52.6178549,-155.352142</code>
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

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br>if you use this field, you don't need to specify <code>language_code</code><br>supported languages:<br><code>English</code>, <code>French</code>, <code>German</code>
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

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br>if you use this field, you don't need to specify <code>language_name</code><br>supported languages:<br><code class='long-string'>en</code>, <code>fr</code>, <code>de</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_NEGATIVE = "keywords_negative";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_NEGATIVE)
  private List<String> keywordsNegative;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo keywordsNegative(List<String> keywordsNegative) {
    this.keywordsNegative = keywordsNegative;
    return this;
  }

  /**
   * <em>keywords negative array</em><br>optional field<br>These keywords will be ignored in the results array;<br>You can specify <strong>a maximum of 200 terms</strong> that you want to exclude from the results;<br>the specified keywords will be converted to lowercase format
   * @return keywordsNegative
   */
  @javax.annotation.Nullable
  public List<String> getKeywordsNegative() {
    return keywordsNegative;
  }

  public void setKeywordsNegative(List<String> keywordsNegative) {
    this.keywordsNegative = keywordsNegative;
  }


  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <em>device type</em><br>optional field<br>specify this field if you want to get the data for a particular device type<br>possible values: <code>all</code>, <code>mobile</code>, <code>desktop</code>, <code>tablet</code><br>default value: <code>all</code>
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * <em>results sorting parameters</em><br>optional field<br>Use these parameters to sort the results by <code>search_volume</code>, <code>cpc</code>, <code>competition</code> or <code>relevance</code> in the descending order<br>default value: <code>relevance</code>
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * <em>starting date of the time range</em><br>optional field<br>minimal value: 24 months from today's date;<br>if you don't specify this field, data will be provided for the last 12 months;<br>if <a href='/v3/keywords_data/bing/status/' target='_blank' rel='noopener noreferrer'>Status endpoint</a> returns <code>false</code> in the <code>actual_data</code> field, <code>date_from</code> can be set to the month before last and prior;<br>if <a href='/v3/keywords_data/bing/status/' target='_blank' rel='noopener noreferrer'>Status endpoint</a> returns <code>true</code> in the <code>actual_data</code> field, <code>date_from</code> can be set to the last month and prior;<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2020-01-01'</code><p><strong>Note:</strong> we do not recommend using a custom time range for the past year's dates
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

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * <em>ending date of the time range</em><br>optional field<br>if you don't specify this field, data will be provided for the last 12 months;<br>minimum value: two years back from today’s date;<br>maximum value: one month from today's date;<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2020-03-15'</code><p><strong>Note:</strong> we do not recommend using a custom time range for the past year's dates
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo postbackUrl(String postbackUrl) {
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

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

  /**
   * <em>Bing search partners type</em><br>optional field<br>if you specify <code class='prettyprint'>true</code>, the results will be delivered for owned, operated, and syndicated networks across Bing, Yahoo, AOL and partner sites that host Bing, AOL, and Yahoo search.<br>default value: <code>false</code> - results are returned for Bing, AOL, and Yahoo search networks
   * @return searchPartners
   */
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo tag(String tag) {
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



  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataBingKeywordsForSiteTaskPostRequestInfo keywordsDataBingKeywordsForSiteTaskPostRequestInfo = (KeywordsDataBingKeywordsForSiteTaskPostRequestInfo) o;
    return

        Objects.equals(this.target, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.target) &&
        Objects.equals(this.locationName, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.keywordsNegative, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.keywordsNegative) &&
        Objects.equals(this.device, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.device) &&
        Objects.equals(this.sortBy, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.sortBy) &&
        Objects.equals(this.dateFrom, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.dateTo) &&
        Objects.equals(this.postbackUrl, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.searchPartners, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.searchPartners) &&
        Objects.equals(this.tag, keywordsDataBingKeywordsForSiteTaskPostRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, locationName, locationCode, locationCoordinate, languageName, languageCode, keywordsNegative, device, sortBy, dateFrom, dateTo, postbackUrl, pingbackUrl, searchPartners, tag);
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
    sb.append("class KeywordsDataBingKeywordsForSiteTaskPostRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    keywordsNegative: ").append(toIndentedString(keywordsNegative)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
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
    
    openapiFields.add("target");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("keywords_negative");
    
    openapiFields.add("device");
    
    openapiFields.add("sort_by");
    
    openapiFields.add("date_from");
    
    openapiFields.add("date_to");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("pingback_url");
    
    openapiFields.add("search_partners");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataBingKeywordsForSiteTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataBingKeywordsForSiteTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataBingKeywordsForSiteTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataBingKeywordsForSiteTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataBingKeywordsForSiteTaskPostRequestInfo value) throws IOException {
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
           public KeywordsDataBingKeywordsForSiteTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataBingKeywordsForSiteTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataBingKeywordsForSiteTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataBingKeywordsForSiteTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}