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


public class DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo  {


  public static final String SERIALIZED_NAME_CATEGORY_CODES = "category_codes";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODES)
  private List<String> categoryCodes;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo categoryCodes(List<String> categoryCodes) {
    this.categoryCodes = categoryCodes;
    return this;
  }

  /**
   * <em>product and service categories</em><br><strong>required field</strong><br>The maximum number of categories you can specify: 20<br>you can download <a href='https://cdn.dataforseo.com/v3/categories/categories_dataforseo_labs_2023_10_25.csv'>the full list of possible categories</a>
   * @return categoryCodes
   */
  @javax.annotation.Nullable
  public List<String> getCategoryCodes() {
    return categoryCodes;
  }

  public void setCategoryCodes(List<String> categoryCodes) {
    this.categoryCodes = categoryCodes;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of the location</em><br><strong>required field if you don't specify</strong> <code>location_code</code><br><strong>Note:</strong> it is required to specify either <code>location_name</code> or <code>location_code</code><br>you can receive the list of available locations with their <code>location_name</code> by making a separate request to the<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>United Kingdom</code>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>unique location identifier</em><br><strong>required field if you don't specify</strong> <code>location_name</code><br><strong>Note:</strong> it is required to specify either <code>location_name</code> or <code>location_code</code><br>you can receive the list of available locations with their <code>location_code</code> by making a separate request to the<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>2840</code>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of the language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code><br>you can receive the list of available languages with their <code>language_name</code> by making a separate request to the<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>English</code>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>unique language identifier</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code><br>you can receive the list of available languages with their <code>language_code</code> by making a separate request to the<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CATEGORY_INTERSECTION = "category_intersection";
  @SerializedName(SERIALIZED_NAME_CATEGORY_INTERSECTION)
  private Boolean categoryIntersection;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo categoryIntersection(Boolean categoryIntersection) {
    this.categoryIntersection = categoryIntersection;
    return this;
  }

  /**
   * <em>category intersections</em><br>optional field<br>if set to <code class='prettyprint'>true</code>, you will get keywords featured in all specified categories;<br>if set to <code class='prettyprint'>false</code>, you will keywords that are specified in any of the specified categories;<br>default value: <code>true</code>
   * @return categoryIntersection
   */
  @javax.annotation.Nullable
  public Boolean getCategoryIntersection() {
    return categoryIntersection;
  }

  public void setCategoryIntersection(Boolean categoryIntersection) {
    this.categoryIntersection = categoryIntersection;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SERP_INFO = "include_serp_info";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SERP_INFO)
  private Boolean includeSerpInfo;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo includeSerpInfo(Boolean includeSerpInfo) {
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo includeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
    return this;
  }

  /**
   * <em>include or exclude data from clickstream-based metrics in the result</em><br>optional field<br>if the parameter is set to <code>true</code>, you will receive <code>clickstream_keyword_info</code>, <code>keyword_info_normalized_with_clickstream</code>, and <code>keyword_info_normalized_with_bing</code> fields in the response<br>default value: <code>false</code><br>with this parameter enabled, you will be charged double the price for the request<p>learn more about how clickstream-based metrics are calculated in this <a href='https://dataforseo.com/help-center/what-are-clickstream-based-metrics-and-how-do-we-calculate-them' rel='noopener noreferrer' target='_blank'>help center article</a>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo ignoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
    return this;
  }

  /**
   * <em>ignore highly similar keywords</em><br>optional field<br>if set to <code class='prettyprint'>true</code> only core keywords will be returned, all highly similar keywords will be excluded;<br>default value: <code>false</code>
   * @return ignoreSynonyms
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreSynonyms() {
    return ignoreSynonyms;
  }

  public void setIgnoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of keywords in the results array</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned keywords</em><br>optional field<br>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords<br><strong>Note:</strong> we recommend using this parameter only when retrieving up to 10,000 results<br>for retrieving over 10,000 results, use the <code>offset_token</code> instead.
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_OFFSET_TOKEN = "offset_token";
  @SerializedName(SERIALIZED_NAME_OFFSET_TOKEN)
  private String offsetToken;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo offsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
    return this;
  }

  /**
   * <em>offset token for subsequent requests</em><br>optional field<br>provided in the identical filed of the response to each request;<br>use this parameter to avoid timeouts while trying to obtain over 10,000 results in a single request;<br>by specifying the unique <code>offset_token</code> value from the response array, you will get the subsequent results of the initial task;<br><code>offset_token</code> values are unique for each subsequent task<br><strong>Note:</strong> if the <code>offset_token</code> is specified in the request, all other parameters except <code>limit</code> will not be taken into account when processing a task.<br>learn more about this parameter on our <a href='https://dataforseo.com/help-center/what-is-the-difference-between-the-offset-and-offset_token-parameters#offset_token' target='_blank'>Help Center</a>
   * @return offsetToken
   */
  @javax.annotation.Nullable
  public String getOffsetToken() {
    return offsetToken;
  }

  public void setOffsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>match</code>, <code>not_match</code>, <code>ilike</code>, <code>not_ilike</code>, <code>like</code>, <code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code>,as well as <code>ilike</code>, <code>not_ilike</code> to match any string of zero or more characters<br>example:<br><code>['keyword_info.search_volume','>',0]</code><br><code>[['keyword_info.search_volume','in',[0,1000]],<br>'and',<br>['keyword_info.competition_level','=','LOW']]</code><p><code>[['keyword_info.search_volume','>',100],<br>'and',<br>[['keyword_info.cpc','<',0.5],<br>'or',<br>['keyword_info.high_top_of_page_bid','<=',0.5]]]</code><br>for more information about filters, please refer to <a href='/v3/dataforseo_labs/filters' target='_blank' rel='noopener noreferrer'>Dataforseo Labs - Filters</a> or this <a href='https://dataforseo.com/help-center/how-to-use-filters-in-dataforseo-labs-api' target='_blank' rel='noopener noreferrer'>help center guide</a>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['keyword_info.competition,desc']</code><br>default rule:<br><code>['keyword_info.search_volume,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['keyword_info.search_volume,desc','keyword_info.competition,asc']</code>
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

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo tag(String tag) {
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



  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo = (DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo) o;
    return

        Objects.equals(this.categoryCodes, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.categoryCodes) &&
        Objects.equals(this.locationName, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.languageCode) &&
        Objects.equals(this.categoryIntersection, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.categoryIntersection) &&
        Objects.equals(this.includeSerpInfo, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.includeSerpInfo) &&
        Objects.equals(this.includeClickstreamData, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.includeClickstreamData) &&
        Objects.equals(this.ignoreSynonyms, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.ignoreSynonyms) &&
        Objects.equals(this.limit, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.limit) &&
        Objects.equals(this.offset, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.offset) &&
        Objects.equals(this.offsetToken, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.offsetToken) &&
        Objects.equals(this.filters, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.orderBy) &&
        Objects.equals(this.tag, dataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(categoryCodes, locationName, locationCode, languageName, languageCode, categoryIntersection, includeSerpInfo, includeClickstreamData, ignoreSynonyms, limit, offset, offsetToken, filters, orderBy, tag);
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
    sb.append("class DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo {\n");

    sb.append("    categoryCodes: ").append(toIndentedString(categoryCodes)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    categoryIntersection: ").append(toIndentedString(categoryIntersection)).append("\n");
    sb.append("    includeSerpInfo: ").append(toIndentedString(includeSerpInfo)).append("\n");
    sb.append("    includeClickstreamData: ").append(toIndentedString(includeClickstreamData)).append("\n");
    sb.append("    ignoreSynonyms: ").append(toIndentedString(ignoreSynonyms)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    offsetToken: ").append(toIndentedString(offsetToken)).append("\n");
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
    
    openapiFields.add("category_codes");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("category_intersection");
    
    openapiFields.add("include_serp_info");
    
    openapiFields.add("include_clickstream_data");
    
    openapiFields.add("ignore_synonyms");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("offset_token");
    
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
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}