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


public class KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <em>domain or page</em><br><strong>required field</strong><br>the domain name of the target website or the url of the target page;<br><strong>note:</strong> to obtain keywords for the target website, use the <code>target_type</code> parameter
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * <em>search keywords for site or url</em><br>optional field<br>possible values: <code>site</code>, <code>page</code>;<br>default value: <code>page</code><br>if set to <code>site</code>, keywords will be provided for the entire site;<br>if set to <code>page</code>, keywords will be provided for the specified webpage
   * @return targetType
   */
  @javax.annotation.Nullable
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo locationName(String locationName) {
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo locationCode(Integer locationCode) {
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo languageName(String languageName) {
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo languageCode(String languageCode) {
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


  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

  /**
   * <em>include Google search partners</em><br>optional field<br>if you specify <code class='prettyprint'>true</code>, the results will be delivered for owned, operated, and syndicated networks across <a href='https://support.google.com/google-ads/answer/1722047?hl=en' target='_blank' rel='noopener noreferrer'>Google and partner sites</a> that host Google search;<br>default value: <code>false</code> - results are returned for Google search sites
   * @return searchPartners
   */
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * <em>starting date of the time range</em><br>optional field<br>date format: <code>'yyyy-mm-dd'</code><br>minimal value: 4 years from the current date<br>by default, data is returned for the past 12 months;<br><strong>Note</strong>: the indicated date cannot be greater than that specified in <code>date_to</code> and/or yesterday's date;if <a href='/v3/keywords_data/google_ads/status/' target='_blank' rel='noopener noreferrer'>Status endpoint</a> returns <code>false</code> in the <code>actual_data</code> field, <code>date_from</code> can be set to the month before last and prior;<br>if <a href='/v3/keywords_data/google_ads/status/' target='_blank' rel='noopener noreferrer'>Status endpoint</a> returns <code>true</code> in the <code>actual_data</code> field, <code>date_from</code> can be set to the last month and prior
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * <em>ending date of the time range</em><br>optional field<br><strong>Note:</strong> the indicated date cannot be greater than yesterday's date;<br>if you don't specify this field, yesterday's date will be used by default<br>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2022-11-30'</code>
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public static final String SERIALIZED_NAME_INCLUDE_ADULT_KEYWORDS = "include_adult_keywords";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ADULT_KEYWORDS)
  private Boolean includeAdultKeywords;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo includeAdultKeywords(Boolean includeAdultKeywords) {
    this.includeAdultKeywords = includeAdultKeywords;
    return this;
  }

  /**
   * <em>include keywords associated with adult content</em><br>optional field<br>if set to <code>true</code>, adult keywords will be included in the response<br>default value: <code>false</code><br><strong>note</strong> that the API may return no data for such keywords due to <a href='https://support.google.com/adspolicy/answer/6008942?hl=en' target='_blank' rel='noopener noreferrer'>Google Ads restrictions</a>
   * @return includeAdultKeywords
   */
  @javax.annotation.Nullable
  public Boolean getIncludeAdultKeywords() {
    return includeAdultKeywords;
  }

  public void setIncludeAdultKeywords(Boolean includeAdultKeywords) {
    this.includeAdultKeywords = includeAdultKeywords;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * <em>results sorting parameters</em><br>optional field<br>Use these parameters to sort the results by <code>relevance</code>, <code>search_volume</code>, <code>competition_index</code>, <code>low_top_of_page_bid</code>, or <code>high_top_of_page_bid</code> in descending order<br>default value: <code>relevance</code>
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo postbackUrl(String postbackUrl) {
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
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

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo tag(String tag) {
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



  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo = (KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo) o;
    return

        Objects.equals(this.target, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.target) &&
        Objects.equals(this.targetType, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.targetType) &&
        Objects.equals(this.locationName, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.searchPartners, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.searchPartners) &&
        Objects.equals(this.dateFrom, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.dateTo) &&
        Objects.equals(this.includeAdultKeywords, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.includeAdultKeywords) &&
        Objects.equals(this.sortBy, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.sortBy) &&
        Objects.equals(this.postbackUrl, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.tag, keywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, targetType, locationName, locationCode, locationCoordinate, languageName, languageCode, searchPartners, dateFrom, dateTo, includeAdultKeywords, sortBy, postbackUrl, pingbackUrl, tag);
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
    sb.append("class KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    includeAdultKeywords: ").append(toIndentedString(includeAdultKeywords)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    
    openapiFields.add("target");
    
    openapiFields.add("target_type");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("search_partners");
    
    openapiFields.add("date_from");
    
    openapiFields.add("date_to");
    
    openapiFields.add("include_adult_keywords");
    
    openapiFields.add("sort_by");
    
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
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo value) throws IOException {
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
           public KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}