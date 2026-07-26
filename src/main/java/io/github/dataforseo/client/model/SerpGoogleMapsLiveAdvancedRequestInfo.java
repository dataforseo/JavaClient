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


public class SerpGoogleMapsLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public SerpGoogleMapsLiveAdvancedRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <p><em>keyword</em><p><strong>required field</strong><p>you can specify <strong>up to 700 characters</strong> in the <code>keyword</code> field<p>all %## will be decoded (plus character '+' will be decoded to a space character)<p>if you need to use the '%' character for your <code>keyword</code>, please specify it as '%25';<p>if you need to use the “+” character for your <code>keyword</code>, please specify it as “%2B”;<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a></p>
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

  public SerpGoogleMapsLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <p><em>search engine location code</em><p><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_coordinate</code><p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/locations</code><p>example:<p><code class='long-string'>2840</code></p>
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

  public SerpGoogleMapsLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <p><em>search engine language code</em><p><strong>required field if you don't specify</strong> <code>language_name</code><p><strong>if you use this field, you don't need to specify <code>language_name</code></strong><p>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/languages</code><em><p></em>example:<em><p></em><code class='long-string'>en</code></p>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public SerpGoogleMapsLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <p><em>parsing depth</em><p>optional field<p>number of results in SERP<p>default value: <code>100</code><p>max value: <code>700</code></p><br><strong>Your account will be billed per each SERP containing up to 100 results;</strong><p>Setting depth above 100 may result in additional charges <a href='https://dataforseo.com/help-center/how-many-results-scraped' rel='noopener noreferrer' target='_blank'>if the search engine returns more than 100 results</a>;<p>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/serp/google-maps-serp-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public SerpGoogleMapsLiveAdvancedRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <p><em>device type</em><p>optional field<p>return results for a specific device type<p>can take the values:<code>desktop</code>, <code>mobile</code><p>default value: <code>desktop</code><p><strong>note:</strong> for <code>mobile</code> device, only 20 results are returned for every SERP</p>
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpGoogleMapsLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <p><em>full name of search engine location</em><p><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><p><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/locations</code><p>example:<p><code class='long-string'>London,England,United Kingdom</code></p>
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public SerpGoogleMapsLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <p><em>full name of search engine language</em><p><strong>required field if you don't specify</strong> <code>language_code</code><p><strong>if you use this field, you don't need to specify <code>language_code</code></strong><p>you can receive the list of available languages  of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/languages</code><p>example:<p><code class='long-string'>English</code></p>
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public SerpGoogleMapsLiveAdvancedRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * <p><em>device operating system</em><p>optional field<p>if you specify <code>desktop</code> in the <code>device</code> field, choose from the following values: <code>windows</code>, <code>macos</code><p>default value: <code>windows</code><p>if you specify <code>mobile</code> in the <code>device</code> field, choose from the following values: <code>android</code>, <code>ios</code><p>default value: <code>android</code></p>
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpGoogleMapsLiveAdvancedRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_MAX_CRAWL_PAGES = "max_crawl_pages";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_PAGES)
  private Integer maxCrawlPages;

  public SerpGoogleMapsLiveAdvancedRequestInfo maxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * <p><em>page crawl limit</em><p>optional field<p>number of search results pages to crawl<p>max value: <code>100</code><p><strong>Note:</strong> the <code>max_crawl_pages</code> and <code>depth</code> parameters complement each other;<p>learn more at <a href='https://dataforseo.com/help-center/what-is-max-crawl-pages-and-how-does-it-work' rel='noopener noreferrer' target='_blank'>our help center</a></p>
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SerpGoogleMapsLiveAdvancedRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p><em>direct URL of the search query</em><p>optional field<p>you can specify a direct URL and we will sort it out to the necessary fields. Note that this method is the most difficult for our API to process and also requires you to specify the exact language and location in the URL. In most cases, we wouldn’t recommend using this method.<p>example:<p><code class='long-string'>https://google.com/maps/search/pizza/@37.09024,-95.712891,4z</code></p><br><strong>Note:</strong> the following search engine parameters are not supported and will be automatically unset if specified in the URL: <code>allinanchor:</code>, <code>allintext:</code>, <code>allintitle:</code>, <code>allinurl:</code>, <code>cache:</code>, <code>define:</code>, <code>definition:</code>, <code>filetype:</code>, <code>id:</code>, <code>inanchor:</code>, <code>info:</code>, <code>intext:</code>, <code>intitle:</code>, <code>inurl:</code>, <code>link:</code>, <code>site:</code>.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public SerpGoogleMapsLiveAdvancedRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <p><em>GPS coordinates of a location</em><p><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_code</code><p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><p><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,zoom'</em> format<p>if <em>'zoom'</em> is not specified, <em>17z</em> will be applied as a default value<p>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<p>the minimum value for <em>'zoom'</em>: 3z<p>the maximum value for <em>'zoom'</em>: 21z<p>example:<p><code class='long-string'>52.6178549,-155.352142,20z</code></p>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public SerpGoogleMapsLiveAdvancedRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <p><em>search engine domain</em><p>optional field<p>we choose the relevant search engine domain automatically according to the location and language you specify<p>however, you can set a custom search engine domain in this field<p>example:<p><code><em>google.co.uk</em></code>, <code><em>google.com.au</em></code>, <code><em>google.de</em></code>, etc.</p>
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_SEARCH_THIS_AREA = "search_this_area";
  @SerializedName(SERIALIZED_NAME_SEARCH_THIS_AREA)
  private Boolean searchThisArea;

  public SerpGoogleMapsLiveAdvancedRequestInfo searchThisArea(Boolean searchThisArea) {
    this.searchThisArea = searchThisArea;
    return this;
  }

  /**
   * <p><em>show results from the displayed area</em><p>optional field<p>can take the values:<code>true</code>, <code>false</code><p>default value: <code>true</code></p><br><p>if set to <code>false</code>, the <code>search_this_area</code> mode will be turned off</p><br><p><strong>Note:</strong> if the <code>search_this_area</code> mode is turned off, Google Maps listings might contain results beyond the displayed area</p>
   * @return searchThisArea
   */
  @javax.annotation.Nullable
  public Boolean getSearchThisArea() {
    return searchThisArea;
  }

  public void setSearchThisArea(Boolean searchThisArea) {
    this.searchThisArea = searchThisArea;
  }


  public static final String SERIALIZED_NAME_SEARCH_PLACES = "search_places";
  @SerializedName(SERIALIZED_NAME_SEARCH_PLACES)
  private Boolean searchPlaces;

  public SerpGoogleMapsLiveAdvancedRequestInfo searchPlaces(Boolean searchPlaces) {
    this.searchPlaces = searchPlaces;
    return this;
  }

  /**
   * <p><em>search places mode</em><p>optional field<p>the search places mode allows to obtain Google Maps results on a certain place (e.g., Apple Store in New York)<p>however, due to the pecularities of our data mining algorithm, this mode might interfere with some local-intent queries - and display results for a location that is different from that specified in the request;<p>to prevent this interference and obtain correct results for keywords with local intent you may set this parameter to <code>false</code>;</p><br><p>default value: <code>true</code><p><strong>Note:</strong> if the <code>search_places</code> mode is turned off and no results were found in the search area, the <code>results</code> array will be empty</p>
   * @return searchPlaces
   */
  @javax.annotation.Nullable
  public Boolean getSearchPlaces() {
    return searchPlaces;
  }

  public void setSearchPlaces(Boolean searchPlaces) {
    this.searchPlaces = searchPlaces;
  }



  public SerpGoogleMapsLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleMapsLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleMapsLiveAdvancedRequestInfo serpGoogleMapsLiveAdvancedRequestInfo = (SerpGoogleMapsLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.keyword, serpGoogleMapsLiveAdvancedRequestInfo.keyword) &&
        Objects.equals(this.locationCode, serpGoogleMapsLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.languageCode, serpGoogleMapsLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.depth, serpGoogleMapsLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.device, serpGoogleMapsLiveAdvancedRequestInfo.device) &&
        Objects.equals(this.locationName, serpGoogleMapsLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.languageName, serpGoogleMapsLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.os, serpGoogleMapsLiveAdvancedRequestInfo.os) &&
        Objects.equals(this.tag, serpGoogleMapsLiveAdvancedRequestInfo.tag) &&
        Objects.equals(this.maxCrawlPages, serpGoogleMapsLiveAdvancedRequestInfo.maxCrawlPages) &&
        Objects.equals(this.url, serpGoogleMapsLiveAdvancedRequestInfo.url) &&
        Objects.equals(this.locationCoordinate, serpGoogleMapsLiveAdvancedRequestInfo.locationCoordinate) &&
        Objects.equals(this.seDomain, serpGoogleMapsLiveAdvancedRequestInfo.seDomain) &&
        Objects.equals(this.searchThisArea, serpGoogleMapsLiveAdvancedRequestInfo.searchThisArea) &&
        Objects.equals(this.searchPlaces, serpGoogleMapsLiveAdvancedRequestInfo.searchPlaces);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationCode, languageCode, depth, device, locationName, languageName, os, tag, maxCrawlPages, url, locationCoordinate, seDomain, searchThisArea, searchPlaces);
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
    sb.append("class SerpGoogleMapsLiveAdvancedRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    searchThisArea: ").append(toIndentedString(searchThisArea)).append("\n");
    sb.append("    searchPlaces: ").append(toIndentedString(searchPlaces)).append("\n");
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
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("device");
    
    openapiFields.add("location_name");
    
    openapiFields.add("language_name");
    
    openapiFields.add("os");
    
    openapiFields.add("tag");
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("url");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("search_this_area");
    
    openapiFields.add("search_places");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleMapsLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleMapsLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleMapsLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleMapsLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleMapsLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleMapsLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleMapsLiveAdvancedRequestInfo value) throws IOException {
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
           public SerpGoogleMapsLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleMapsLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleMapsLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleMapsLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}