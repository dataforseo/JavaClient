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
   * target URLs of pages
* required field
* you can set up to 20 pages in this object
* the pages should be specified with absolute URLs (including http:// or https://)
* example:
* 'pages': {
* '1':'https://www.apple.com/mac/*',
* '2':'https://dataforseo.com/*',
* '3':'https://support.microsoft.com/'
* }if you specify a single page here, we will return results only for this page;
* you can also use a wildcard (‘*’) character to specify the search pattern
* example:
* 'example.com'
* search for the exact URL
* 'example.com/eng/*'
* search for the example.com page and all its related URLs which start with ‘/eng/’, such as “example.com/eng/index.html” and “example.com/eng/help/”, etc.
* note: a wilcard should be placed after the slash (‘/’) character in the end of the URL, it is not possible to place it after the domain in the following way:
* https://dataforseo.com*
* use https://dataforseo.com/* instead
* Note: this endpoint will not provide results if the number of intersecting keywords exceeds 10 million
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
   * URLs of pages you want to exclude
* optional field
* you can set up to 10 pages in this array
* if you use this array, results will contain the keywords for which URLs from the pages object rank, but URLs from exclude_pages array do not;
* note that if you specify this field, the results will be based on the keywords any URL from pages ranks for regardless of intersections between them. However, you can set intersection_mode to intersect and results will contain the keywords all URLs from pages rank for in the same SERP and URLs from exclude_pages do not.
* use a wildcard (‘*’) character to specify the search pattern
* example:
* 'exclude_pages': [
* 'https://www.apple.com/iphone/*',
* 'https://dataforseo.com/apis/*',
* 'https://www.microsoft.com/en-us/industry/services/'
* ]
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
   * full name of the location
* required field if you don’t specify location_code
* Note: it is required to specify either location_name or location_code
* you can receive the list of available locations with their location_name by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* United Kingdom
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
   * location code
* required field if you don’t specify location_name
* Note: it is required to specify either location_name or location_code
* you can receive the list of available locations with their location_code by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* 2840
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
   * full name of the language
* required field if you don’t specify language_code
* Note: it is required to specify either language_name or language_code
* you can receive the list of available languages with their language_name by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* English
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
   * language code
* required field if you don’t specify language_name
* Note: it is required to specify either language_name or language_code
* you can receive the list of available languages with their language_code by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* en
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
   * search results type
* indicates type of search results included in the response
* optional field
* possible values:
* ['organic', 'paid', 'featured_snippet', 'local_pack']
* default value:
* ['organic', 'paid']
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
   * the maximum number of returned keywords
* optional field
* default value: 100
* maximum value: 1000
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
   * offset in the items array of returned keywords
* optional field
* default value: 0
* if you specify 10 here, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords
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
   * indicates if the subdomains will be included in the search
* optional field
* if set to false, the subdomains will be ignored
* default value: true
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
   * indicates whether to intersect keywords
* optional field
* use this field to intersect or merge results for the specified URLs
* possible values: union, intersect
* union – results are based on all keywords any URL from pages rank for;
* intersect – results are based on the keywords all URLs from pages rank for in the same SERP:
* by default, results are based on the intersect mode if you specify only pages array. If you specify exclude_pages as well, results are based on the union mode
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
   * include data from SERP for each keyword
* optional field
* if set to true, we will return a serp_info array containing SERP data (number of search results, relevant URL, and SERP features) for every keyword in the response
* default value: false
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
   * include or exclude data from clickstream-based metrics in the result
* optional field
* if the parameter is set to true, you will receive clickstream_keyword_info, clickstream_etv, keyword_info_normalized_with_clickstream, and keyword_info_normalized_with_bing fields in the response
* default value: false
* with this parameter enabled, you will be charged double the price for the request
* learn more about how clickstream-based metrics are calculated in this help center article
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
   * ignore highly similar keywords
* optional field
* if set to true only core keywords will be returned, all highly similar keywords will be excluded;
* default value: false
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
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in, ilike, not_ilike, like, not_like, match, not_match
* you can use the % operator with like and not_like, as well as ilike and not_ilike to match any string of zero or more characters
* note that if you want to filter by any field in the intersection_result array you need to specify the number of corresponding page
* for instance, if you want to filter results by the ranking of the first specified URL, you should set the following filter:
* [intersection_result.1.rank_absolute,'=',1]
* if you want to filter results and receive only organic listings for the third specified URL, you should set the following filter:
* [intersection_result.3.type,'=','organic'] , etc.example:
* ['keyword_data.keyword_info.search_volume','in',[100,1000]]
* [['intersection_result.1.etv','>',0],'and',['intersection_result.1.description','like','%goat%']][['keyword_data.keyword_info.search_volume','>',100],
* 'and',
* [['intersection_result.2.description','like','%goat%'],
* 'or',
* ['intersection_result.2.type','=','organic']]]
* for more information about filters, please refer to Dataforseo Labs – Filters or this help center guide
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
   * results sorting rules
* optional field
* you can use the same values as in the filters array to sort the results
* possible sorting types:
* asc – results will be sorted in the ascending order
* desc – results will be sorted in the descending order
* you should use a comma to set up a sorting parameter
* example:
* ['keyword_data.keyword_info.competition,desc']
* default rule:
* ['keyword_data.keyword_info.search_volume,desc']
* note that you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['intersection_result.1.rank_group,asc','intersection_result.2.rank_absolute,asc']
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
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
* you will find the specified tag value in the data object of the response
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