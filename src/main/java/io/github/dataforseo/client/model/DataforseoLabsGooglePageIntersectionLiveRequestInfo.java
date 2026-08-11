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


public class DataforseoLabsGooglePageIntersectionLiveRequestInfo  {


  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Map<String, String> pages;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo pages(Map<String, String> pages) {
    this.pages = pages;
    return this;
  }

  /**
   * <em>target URLs of pages</em><br><strong>required field</strong><br>you can set <strong>up to 20 pages</strong> in this object<br>the pages should be specified with absolute URLs (including http:// or https://)<br>example:<br>`'pages': {`<br>`'1':'https://www.apple.com/mac/*',`<br>`'2':'https://dataforseo.com/*',`<br>`'3':'https://support.microsoft.com/'`<br>`}`if you specify a single page here, we will return results only for this page;<br>you can also use a wildcard ('*') character to specify the search pattern<br>example:<br><code class='long-string'>'example.com'</code><br>search for the exact URL<br><code class='long-string'>'example.com/eng/*'</code><br>search for the <em>example.com</em> page and all its related URLs which start with <em>'/eng/'</em>, such as <em>'example.com/eng/index.html'</em> and <em>'example.com/eng/help/'</em>, etc.<br><strong>note:</strong> a wilcard should be placed after the slash ('/') character in the end of the URL, it is <strong>not possible</strong> to place it after the domain in the following way:<br>`https://dataforseo.com`<strong>*</strong><br>use `https://dataforseo.com`<strong>/*</strong> instead<p><strong>Note:</strong> this endpoint will not provide results if the number of intersecting keywords exceeds 10 million
   * @return pages
   */
  @javax.annotation.Nullable
  public Map<String, String> getPages() {
    return pages;
  }

  public void setPages(Map<String, String> pages) {
    this.pages = pages;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_PAGES = "exclude_pages";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PAGES)
  private List<String> excludePages;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo excludePages(List<String> excludePages) {
    this.excludePages = excludePages;
    return this;
  }

  /**
   * <em>URLs of pages you want to exclude</em><br>optional field<br>you can set <strong>up to 10 pages</strong> in this array<br>if you use this array, results will contain the keywords for which URLs from the <code>pages</code> object rank, but URLs from <code>exclude_pages</code> array do not;<p><strong>note</strong> that if you specify this field, the results will be based on the keywords <strong>any</strong> URL from <code>pages</code> ranks for regardless of intersections between them. However, you can set <code>intersection_mode</code> to <code>intersect</code> and results will contain the keywords <strong>all</strong> URLs from <code>pages</code> rank for in the same SERP and URLs from <code>exclude_pages</code> do not. <br>use a wildcard ('&ast;') character to specify the search pattern<br>example:<br>`'exclude_pages':`<br>`['https://www.apple.com/iphone/&ast;',`<br>`'https://dataforseo.com/apis/&ast;',`<br>`'https://www.microsoft.com/en-us/industry/services/']`
   * @return excludePages
   */
  @javax.annotation.Nullable
  public List<String> getExcludePages() {
    return excludePages;
  }

  public void setExcludePages(List<String> excludePages) {
    this.excludePages = excludePages;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of the location</em><br><strong>required field if you don't specify</strong> <code>location_code</code><br><strong>Note:</strong> it is required to specify either <code>location_name</code> or <code>location_code</code><br>you can receive the list of available locations with their <code>location_name</code> by making a separate request to the <br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>United Kingdom</code>
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

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code><br><strong>Note:</strong> it is required to specify either <code>location_name</code> or <code>location_code</code><br>you can receive the list of available locations with their <code>location_code</code> by making a separate request to the <br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>2840</code>
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

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of the language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code><br>you can receive the list of available languages with their <code>language_name</code> by making a separate request to the <br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>English</code>
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

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code><br>you can receive the list of available languages with their <code>language_code</code> by making a separate request to the <br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * <em>search results type</em><br>indicates type of search results included in the response<br>optional field<p>possible values: <br><code>['organic', 'paid', 'featured_snippet', 'local_pack']</code><br>default value: <br><code>['organic', 'paid']</code>
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned keywords</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the <code>items</code> array of returned keywords</em><br>optional field<br>default value: <code>0</code><br>if you specify <code>10</code> here, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * <em>indicates if the subdomains will be included in the search</em><br>optional field<br>if set to <code>false</code>, the subdomains will be ignored<br>default value: <code>true</code>
   * @return includeSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSubdomains() {
    return includeSubdomains;
  }

  public void setIncludeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_MODE = "intersection_mode";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_MODE)
  private String intersectionMode;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo intersectionMode(String intersectionMode) {
    this.intersectionMode = intersectionMode;
    return this;
  }

  /**
   * <em>indicates whether to intersect keywords</em><br>optional field<br>use this field to intersect or merge results for the specified URLs<p>possible values: <code>union</code>, <code>intersect</code><p><code>union</code> - results are based on all keywords <strong>any</strong> URL from <code>pages</code> rank for;<p><code>intersect</code> - results are based on the keywords <strong>all</strong> URLs from <code>pages</code> rank for in the same SERP:<p>by default, results are based on the <code>intersect</code> mode if you specify only <code>pages</code> array. If you specify <code>exclude_pages</code> as well, results are based on the <code>union</code> mode
   * @return intersectionMode
   */
  @javax.annotation.Nullable
  public String getIntersectionMode() {
    return intersectionMode;
  }

  public void setIntersectionMode(String intersectionMode) {
    this.intersectionMode = intersectionMode;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SERP_INFO = "include_serp_info";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SERP_INFO)
  private Boolean includeSerpInfo;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo includeSerpInfo(Boolean includeSerpInfo) {
    this.includeSerpInfo = includeSerpInfo;
    return this;
  }

  /**
   * <em>include data from SERP for each keyword</em><br>optional field<br>if set to <code>true</code>, we will return a <code>serp_info</code> array containing SERP data (number of search results, relevant URL, and SERP features) for every keyword in the response<br>default value: <code>false</code>
   * @return includeSerpInfo
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSerpInfo() {
    return includeSerpInfo;
  }

  public void setIncludeSerpInfo(Boolean includeSerpInfo) {
    this.includeSerpInfo = includeSerpInfo;
  }


  public static final String SERIALIZED_NAME_INCLUDE_CLICKSTREAM_DATA = "include_clickstream_data";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CLICKSTREAM_DATA)
  private Boolean includeClickstreamData;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo includeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
    return this;
  }

  /**
   * <em>include or exclude data from clickstream-based metrics in the result</em><br>optional field<br>if the parameter is set to <code>true</code>, you will receive <code>clickstream_keyword_info</code>, <code>clickstream_etv</code>, <code>keyword_info_normalized_with_clickstream</code>, and <code>keyword_info_normalized_with_bing</code> fields in the response<br>default value: <code>false</code><br>with this parameter enabled, you will be charged double the price for the request<p>learn more about how clickstream-based metrics are calculated in this <a href='https://dataforseo.com/help-center/what-are-clickstream-based-metrics-and-how-do-we-calculate-them' rel='noopener noreferrer' target='_blank'>help center article</a>
   * @return includeClickstreamData
   */
  @javax.annotation.Nullable
  public Boolean getIncludeClickstreamData() {
    return includeClickstreamData;
  }

  public void setIncludeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
  }


  public static final String SERIALIZED_NAME_IGNORE_SYNONYMS = "ignore_synonyms";
  @SerializedName(SERIALIZED_NAME_IGNORE_SYNONYMS)
  private Boolean ignoreSynonyms;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo ignoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
    return this;
  }

  /**
   * <em>ignore highly similar keywords</em><br>optional field<br>if set to <code class='prettyprint'>true</code> only core keywords will be returned, all highly similar keywords will be excluded;  <br>default value: <code>false</code>
   * @return ignoreSynonyms
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreSynonyms() {
    return ignoreSynonyms;
  }

  public void setIgnoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>ilike</code>, <code>not_ilike</code>, <code>like</code>, <code>not_like</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code>, as well as <code>ilike</code> and <code>not_ilike</code> to match any string of zero or more characters<br><strong>note</strong> that if you want to filter by any field in the <code>intersection_result</code> array you need to specify the number of corresponding page<br>for instance, if you want to filter results by the ranking of the first specified URL, you should set the following filter:<br><code>[intersection_result.1.rank_absolute,'=',1]</code><br>if you want to filter results and receive only organic listings for the third specified URL, you should set the following filter:<br><code>[intersection_result.3.type,'=','organic']</code> , etc.example:<br><code>['keyword_data.keyword_info.search_volume','in',[100,1000]]</code><br><code>[['intersection_result.1.etv','>',0],'and',['intersection_result.1.description','like','%goat%']]</code><code>[['keyword_data.keyword_info.search_volume','>',100],<br>'and',<br>[['intersection_result.2.description','like','%goat%'],<br>'or',<br>['intersection_result.2.type','=','organic']]]</code><br>for more information about filters, please refer to <a href='/v3/dataforseo_labs/filters' target='_blank' rel='noopener noreferrer'>Dataforseo Labs - Filters</a> or this <a href='https://dataforseo.com/help-center/how-to-use-filters-in-dataforseo-labs-api' rel='noopener noreferrer' target='_blank'>help center guide</a>
   * @return filters
   */
  @javax.annotation.Nullable
  public List<Object> getFilters() {
    return filters;
  }

  public void setFilters(List<Object> filters) {
    this.filters = filters;
  }


  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<String> orderBy;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting parameter<br>example:<br><code>['keyword_data.keyword_info.competition,desc']</code><br>default rule:<br><code>['keyword_data.keyword_info.search_volume,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['intersection_result.1.rank_group,asc','intersection_result.2.rank_absolute,asc']</code>
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo tag(String tag) {
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



  public DataforseoLabsGooglePageIntersectionLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGooglePageIntersectionLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGooglePageIntersectionLiveRequestInfo dataforseoLabsGooglePageIntersectionLiveRequestInfo = (DataforseoLabsGooglePageIntersectionLiveRequestInfo) o;
    return

        Objects.equals(this.pages, dataforseoLabsGooglePageIntersectionLiveRequestInfo.pages) &&
        Objects.equals(this.excludePages, dataforseoLabsGooglePageIntersectionLiveRequestInfo.excludePages) &&
        Objects.equals(this.locationName, dataforseoLabsGooglePageIntersectionLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGooglePageIntersectionLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGooglePageIntersectionLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGooglePageIntersectionLiveRequestInfo.languageCode) &&
        Objects.equals(this.itemTypes, dataforseoLabsGooglePageIntersectionLiveRequestInfo.itemTypes) &&
        Objects.equals(this.limit, dataforseoLabsGooglePageIntersectionLiveRequestInfo.limit) &&
        Objects.equals(this.offset, dataforseoLabsGooglePageIntersectionLiveRequestInfo.offset) &&
        Objects.equals(this.includeSubdomains, dataforseoLabsGooglePageIntersectionLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.intersectionMode, dataforseoLabsGooglePageIntersectionLiveRequestInfo.intersectionMode) &&
        Objects.equals(this.includeSerpInfo, dataforseoLabsGooglePageIntersectionLiveRequestInfo.includeSerpInfo) &&
        Objects.equals(this.includeClickstreamData, dataforseoLabsGooglePageIntersectionLiveRequestInfo.includeClickstreamData) &&
        Objects.equals(this.ignoreSynonyms, dataforseoLabsGooglePageIntersectionLiveRequestInfo.ignoreSynonyms) &&
        Objects.equals(this.filters, dataforseoLabsGooglePageIntersectionLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsGooglePageIntersectionLiveRequestInfo.orderBy) &&
        Objects.equals(this.tag, dataforseoLabsGooglePageIntersectionLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(pages, excludePages, locationName, locationCode, languageName, languageCode, itemTypes, limit, offset, includeSubdomains, intersectionMode, includeSerpInfo, includeClickstreamData, ignoreSynonyms, filters, orderBy, tag);
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
    sb.append("class DataforseoLabsGooglePageIntersectionLiveRequestInfo {\n");

    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    excludePages: ").append(toIndentedString(excludePages)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    intersectionMode: ").append(toIndentedString(intersectionMode)).append("\n");
    sb.append("    includeSerpInfo: ").append(toIndentedString(includeSerpInfo)).append("\n");
    sb.append("    includeClickstreamData: ").append(toIndentedString(includeClickstreamData)).append("\n");
    sb.append("    ignoreSynonyms: ").append(toIndentedString(ignoreSynonyms)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
    
    openapiFields.add("pages");
    
    openapiFields.add("exclude_pages");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("item_types");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("include_subdomains");
    
    openapiFields.add("intersection_mode");
    
    openapiFields.add("include_serp_info");
    
    openapiFields.add("include_clickstream_data");
    
    openapiFields.add("ignore_synonyms");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGooglePageIntersectionLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGooglePageIntersectionLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGooglePageIntersectionLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGooglePageIntersectionLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGooglePageIntersectionLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGooglePageIntersectionLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGooglePageIntersectionLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGooglePageIntersectionLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGooglePageIntersectionLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGooglePageIntersectionLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGooglePageIntersectionLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}