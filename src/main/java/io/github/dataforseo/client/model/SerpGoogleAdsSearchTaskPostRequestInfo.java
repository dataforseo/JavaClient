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


public class SerpGoogleAdsSearchTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds;

  public SerpGoogleAdsSearchTaskPostRequestInfo advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  /**
   * <p><em>advertiser identifiers</em><p><strong>required field if <code>target</code> is not specified</strong></p><br><p>you can specify the maximum of 25 values in this array;<p><code>advertiser_ids</code> values for this parameter can be found in the <a href='http://docs.dataforseo.com/v3/serp/google/ads_advertisers/task_get/advanced/' rel='noopener noreferrer' target='_blank'>Google Ads Advertisers</a> endpoint;</p>
   * @return advertiserIds
   */
  @javax.annotation.Nullable
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public SerpGoogleAdsSearchTaskPostRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p><em>domain name</em><p><strong>required field if <code>advertiser_ids</code> is not specified</strong><p>domain name associated with an advertiser account</p>
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public SerpGoogleAdsSearchTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <p><em>search engine location code</em><p>optional field<p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/ads_search/locations</code><p>example:<p><code class='long-string'>2840</code></p><br><p><strong>Note:</strong> if you don't specify <code>location_name</code>, <code>location_code</code>, or <code>location_coordinate</code>, the ads will be searched across all the available locations</p>
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public SerpGoogleAdsSearchTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <p><em>parsing depth</em><p>optional field<p>number of results in SERP<p>default value: <code>40</code><p>max value: <code>700</code></p><br><strong>Your account will be billed per each SERP containing up to 40 results;</strong><p>Setting depth above 40 may result in additional charges <a href='https://dataforseo.com/help-center/how-many-results-scraped' rel='noopener noreferrer' target='_blank'>if the search engine returns more than 40 results</a>;<p>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/serp/google-ads-search-serp-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public SerpGoogleAdsSearchTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p><em>task priority</em><p>optional field<p>can take the following values:<p>1 – normal execution priority (set by default)<p>2 – high execution priority</p><br>You will be additionally charged for the tasks with high execution priority.<p>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/serp/google-ads-search-serp-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public SerpGoogleAdsSearchTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <p><em>notification URL of a completed task</em><p>optional field<p>when a task is completed we will notify you by GET request sent to the URL you have specified<p>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<p>example:<p><code>http://your-server.com/pingscript?id=$id</code><p><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><p><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded;<p>i.a., the <code>#</code> character will be encoded into <code>%23</code></p><br><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a></p>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public SerpGoogleAdsSearchTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <p><em>URL for sending task results</em><p>optional field<p>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<p>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<p>example:<p><code>http://your-server.com/postbackscript?id=$id</code><p><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><p><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded;<p>i.a., the <code>#</code> character will be encoded into <code>%23</code></p><br><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a></p>
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_POSTBACK_DATA = "postback_data";
  @SerializedName(SERIALIZED_NAME_POSTBACK_DATA)
  private String postbackData;

  public SerpGoogleAdsSearchTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * <p><em>postback_url datatype</em><p><strong>required field if you specify <code>postback_url</code></strong><p>corresponds to the function you used for setting a task<p>possible values:<p><code>advanced</code></p>
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpGoogleAdsSearchTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <p><em>full name of search engine location</em><p>optional field<p><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/ads_search/locations</code><p>example:<p><code class='long-string'>London,England,United Kingdom</code></p><br><p><strong>Note:</strong> if you don't specify <code>location_name</code>, <code>location_code</code>, or <code>location_coordinate</code>, the ads will be searched across all the available locations</p>
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public SerpGoogleAdsSearchTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <p><em>GPS coordinates of a location</em><p>optional field<p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><p>example:<p><code class='long-string'>52.6178549,-155.352142</code></p><br><p><strong>Note:</strong> if you don't specify <code>location_name</code>, <code>location_code</code>, or <code>location_coordinate</code>, the ads will be searched across all the available locations</p>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpGoogleAdsSearchTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <p><em>user-defined task identifier</em><p>optional field<p><em>the character limit is 255</em><p>you can use this parameter to identify the task and match it with the result<p>you will find the specified <code>tag</code> value in the <code>data</code> object of the response</p>
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public SerpGoogleAdsSearchTaskPostRequestInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * <p><em>advertising platform</em><p>optional field<p>possible values: <code>all</code>, <code>google_play</code>, <code>google_maps</code>, <code>google_search</code>, <code>google_shopping</code>, <code>youtube</code><p>default value: <code>all</code></p>
   * @return platform
   */
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public SerpGoogleAdsSearchTaskPostRequestInfo format(String format) {
    this.format = format;
    return this;
  }

  /**
   * <p><em>ad format</em><p>optional field<p>possible values: <code>all</code>, <code>text</code>, <code>image</code>, <code>video</code></p>
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public SerpGoogleAdsSearchTaskPostRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * <p><em>starting date of the time range</em><p>optional field<p>required field if <code>date_to</code> is specified; </p><br><p>date format: <code>'yyyy-mm-dd'</code><p>minimum value: 2018-05-31<p>maximum value: today's date<p>example:<p><code>'2020-01-01'</code></p>
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

  public SerpGoogleAdsSearchTaskPostRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * <p><em>ending date of the time range</em><p>optional field<p>required field if <code>date_from</code> is specified; </p><br><p>date format: <code>'yyyy-mm-dd'</code><p>minimum value: 2018-05-31<p>maximum value: today's date<p>example:<p><code>'2020-01-01'</code></p>
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }



  public SerpGoogleAdsSearchTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleAdsSearchTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleAdsSearchTaskPostRequestInfo serpGoogleAdsSearchTaskPostRequestInfo = (SerpGoogleAdsSearchTaskPostRequestInfo) o;
    return

        Objects.equals(this.advertiserIds, serpGoogleAdsSearchTaskPostRequestInfo.advertiserIds) &&
        Objects.equals(this.target, serpGoogleAdsSearchTaskPostRequestInfo.target) &&
        Objects.equals(this.locationCode, serpGoogleAdsSearchTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.depth, serpGoogleAdsSearchTaskPostRequestInfo.depth) &&
        Objects.equals(this.priority, serpGoogleAdsSearchTaskPostRequestInfo.priority) &&
        Objects.equals(this.pingbackUrl, serpGoogleAdsSearchTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.postbackUrl, serpGoogleAdsSearchTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, serpGoogleAdsSearchTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.locationName, serpGoogleAdsSearchTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCoordinate, serpGoogleAdsSearchTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.tag, serpGoogleAdsSearchTaskPostRequestInfo.tag) &&
        Objects.equals(this.platform, serpGoogleAdsSearchTaskPostRequestInfo.platform) &&
        Objects.equals(this.format, serpGoogleAdsSearchTaskPostRequestInfo.format) &&
        Objects.equals(this.dateFrom, serpGoogleAdsSearchTaskPostRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, serpGoogleAdsSearchTaskPostRequestInfo.dateTo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(advertiserIds, target, locationCode, depth, priority, pingbackUrl, postbackUrl, postbackData, locationName, locationCoordinate, tag, platform, format, dateFrom, dateTo);
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
    sb.append("class SerpGoogleAdsSearchTaskPostRequestInfo {\n");

    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
    
    openapiFields.add("advertiser_ids");
    
    openapiFields.add("target");
    
    openapiFields.add("location_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("priority");
    
    openapiFields.add("pingback_url");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("postback_data");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("tag");
    
    openapiFields.add("platform");
    
    openapiFields.add("format");
    
    openapiFields.add("date_from");
    
    openapiFields.add("date_to");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleAdsSearchTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleAdsSearchTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleAdsSearchTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleAdsSearchTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleAdsSearchTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleAdsSearchTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleAdsSearchTaskPostRequestInfo value) throws IOException {
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
           public SerpGoogleAdsSearchTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleAdsSearchTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleAdsSearchTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleAdsSearchTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}