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


public class AppDataGoogleAppListTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_APP_COLLECTION = "app_collection";
  @SerializedName(SERIALIZED_NAME_APP_COLLECTION)
  private String appCollection;

  public AppDataGoogleAppListTaskPostRequestInfo appCollection(String appCollection) {
    this.appCollection = appCollection;
    return this;
  }

  /**
   * <em>app collection</em><br><strong>required field</strong><br>app collection on Google Play from which apps will be collected;<br>you can specify the following values:<br><code>featured</code>, <code>topselling_paid</code>, <code>topselling_free</code>, <code>topselling_new_free</code>, <code>topselling_new_paid</code>, <code>topgrossing</code>, <code>movers_shakers</code><br><strong>Note:</strong> if <code>featured</code> is selected, the <code>app_category</code> parameter cannot be used
   * @return appCollection
   */
  @javax.annotation.Nullable
  public String getAppCollection() {
    return appCollection;
  }

  public void setAppCollection(String appCollection) {
    this.appCollection = appCollection;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public AppDataGoogleAppListTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify <code>location_code</code></strong><br><strong>if you use this field, you don't need to specify <code>location_code</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/app_data/google/locations</code><br>example:<br><code class='long-string'>West Los Angeles,California,United States</code>
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

  public AppDataGoogleAppListTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify <code>location_name</code></strong><br><strong>if you use this field, you don't need to specify <code>location_name</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/app_data/google/locations</code><br>example:<br><code class='long-string'>9061121</code>
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public AppDataGoogleAppListTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if <code>language_code</code> is not specified</strong><br>if you use this field, you don't need to specify <code>language_code</code><br>you can receive the list of available languages with <code>language_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/app_data/google/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public AppDataGoogleAppListTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if <code>language_name</code> is not specified</strong><br>if you use this field, you don't need to specify <code>language_name</code><br>you can receive the list of available languages with their <code>language_code</code>_by making a separate request to <code>https://api.dataforseo.com/v3/app_data/google/languages</code><em><br></em>example:<em><br></em><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public AppDataGoogleAppListTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <em>task priority</em><br>optional field<br>can take the following values:<br>1 – normal execution priority (set by default)<br>2 – high execution priorityYou will be additionally charged for the tasks with high execution priority.<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/api/google-play' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public AppDataGoogleAppListTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <em>parsing depth</em><br>optional field<br>number of apps to be returned in the API response;<br>we strongly recommend setting the parsing depth in the multiples of 100, because our system processes 100 results in a row;<br>default value: <code>100</code>;<br>maximum value: <code>200</code>;<br><strong>Your account will be billed per each SERP containing up to 100 results;</strong> <br>Setting depth above 100 may result in additional charges if the search engine returns more than 100 results</a>;<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/app-data/google-play' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_APP_CATEGORY = "app_category";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY)
  private String appCategory;

  public AppDataGoogleAppListTaskPostRequestInfo appCategory(String appCategory) {
    this.appCategory = appCategory;
    return this;
  }

  /**
   * <em>application category on Google Play</em><br>optional field<br>you can filter the results by app category;<br>example:<br><code>family</code>;<br>you can receive the full list of available categories by making a separate request to <code>https://api.dataforseo.com/v3/app_data/google/categories</code><br><strong>Note:</strong> <code>app_category</code> cannot be used if <code>app_collection</code> parameter is set to <code>featured</code>
   * @return appCategory
   */
  @javax.annotation.Nullable
  public String getAppCategory() {
    return appCategory;
  }

  public void setAppCategory(String appCategory) {
    this.appCategory = appCategory;
  }


  public static final String SERIALIZED_NAME_AGE_RATING = "age_rating";
  @SerializedName(SERIALIZED_NAME_AGE_RATING)
  private String ageRating;

  public AppDataGoogleAppListTaskPostRequestInfo ageRating(String ageRating) {
    this.ageRating = ageRating;
    return this;
  }

  /**
   * <em>filter results by age rating</em><br>optional field<br>you can use this field to filter the results by age rating;<br>possible types of filtering:<br><code>ages_up_to_5</code> — return apps approved for children up to 5 years old;<br><code>ages_6_8</code> — return apps approved for children from 6 to 8 years old;<br><code>ages_9_12</code> — return apps approved for children from 9 to 12 years old;<br>by default, the API returns apps for all ages;<br><strong>Note:</strong> this filter works only in conjunction with the <code>'category': 'family'</code> parameter
   * @return ageRating
   */
  @javax.annotation.Nullable
  public String getAgeRating() {
    return ageRating;
  }

  public void setAgeRating(String ageRating) {
    this.ageRating = ageRating;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AppDataGoogleAppListTaskPostRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public AppDataGoogleAppListTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <em>URL for sending task results</em><br>optional field<br>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/postbackscript?id=$id</code><br><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded; <br>i.a., the <code>#</code> character will be encoded into <code>%23</code>
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

  public AppDataGoogleAppListTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * <em>postback_url datatype</em><br><strong>required field if you specify <code>postback_url</code></strong><br>corresponds to the datatype that will be sent to your server<br>possible values:<br><code>advanced</code>, <code>html</code>
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public AppDataGoogleAppListTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded; <br>i.a., the <code>#</code> character will be encoded into <code>%23</code>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public AppDataGoogleAppListTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppDataGoogleAppListTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AppDataGoogleAppListTaskPostRequestInfo appDataGoogleAppListTaskPostRequestInfo = (AppDataGoogleAppListTaskPostRequestInfo) o;
    return

        Objects.equals(this.appCollection, appDataGoogleAppListTaskPostRequestInfo.appCollection) &&
        Objects.equals(this.locationName, appDataGoogleAppListTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, appDataGoogleAppListTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.languageName, appDataGoogleAppListTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, appDataGoogleAppListTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.priority, appDataGoogleAppListTaskPostRequestInfo.priority) &&
        Objects.equals(this.depth, appDataGoogleAppListTaskPostRequestInfo.depth) &&
        Objects.equals(this.appCategory, appDataGoogleAppListTaskPostRequestInfo.appCategory) &&
        Objects.equals(this.ageRating, appDataGoogleAppListTaskPostRequestInfo.ageRating) &&
        Objects.equals(this.tag, appDataGoogleAppListTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, appDataGoogleAppListTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, appDataGoogleAppListTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.pingbackUrl, appDataGoogleAppListTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(appCollection, locationName, locationCode, languageName, languageCode, priority, depth, appCategory, ageRating, tag, postbackUrl, postbackData, pingbackUrl);
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
    sb.append("class AppDataGoogleAppListTaskPostRequestInfo {\n");

    sb.append("    appCollection: ").append(toIndentedString(appCollection)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    appCategory: ").append(toIndentedString(appCategory)).append("\n");
    sb.append("    ageRating: ").append(toIndentedString(ageRating)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
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
    
    openapiFields.add("app_collection");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("priority");
    
    openapiFields.add("depth");
    
    openapiFields.add("app_category");
    
    openapiFields.add("age_rating");
    
    openapiFields.add("tag");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("postback_data");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppDataGoogleAppListTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppDataGoogleAppListTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppDataGoogleAppListTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppDataGoogleAppListTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppDataGoogleAppListTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppDataGoogleAppListTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, AppDataGoogleAppListTaskPostRequestInfo value) throws IOException {
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
           public AppDataGoogleAppListTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppDataGoogleAppListTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppDataGoogleAppListTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppDataGoogleAppListTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}