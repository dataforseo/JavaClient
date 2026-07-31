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


public class DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo  {


  public static final String SERIALIZED_NAME_CATEGORY_CODES = "category_codes";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODES)
  private List<String> categoryCodes;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo categoryCodes(List<String> categoryCodes) {
    this.categoryCodes = categoryCodes;
    return this;
  }

  /**
   * <em>product and service categories</em><br><strong>required field</strong><br>The maximum number of categories you can specify: 5<br>you can download <a href='https://cdn.dataforseo.com/v3/categories/categories_dataforseo_labs_2023_10_25.csv'>the full list of possible categories</a>
   * @return categoryCodes
   */
  @javax.annotation.Nullable
  public List<String> getCategoryCodes() {
    return categoryCodes;
  }

  public void setCategoryCodes(List<String> categoryCodes) {
    this.categoryCodes = categoryCodes;
  }


  public static final String SERIALIZED_NAME_FIRST_DATE = "first_date";
  @SerializedName(SERIALIZED_NAME_FIRST_DATE)
  private String firstDate;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo firstDate(String firstDate) {
    this.firstDate = firstDate;
    return this;
  }

  /**
   * <em>first date of comparison period</em><br><strong>required field</strong><br>first date for which domain metrics will be provided;<br>date format: <code>'yyyy-mm-dd'</code>;<br>example: <code>'2021-06-01'</code>;<br>the list available dates is available through the <a href='/v3/dataforseo_labs/google/available_history/live/' rel='noopener noreferrer' target='_blank'>available history endpoint</a>;<br><strong>Note:</strong> <code>first_date</code> cannot be greater than today's date;<br><strong>Also note:</strong> the dates specified in <code>first_date</code> and <code>second_date</code> cannot point to the same month of the same year;<br>you can specify the dates in any order: <code>first_date</code> can be greater than <code>second_date</code> and vice versa;<br>minimum date: <code>'2020-10-01'</code>
   * @return firstDate
   */
  @javax.annotation.Nullable
  public String getFirstDate() {
    return firstDate;
  }

  public void setFirstDate(String firstDate) {
    this.firstDate = firstDate;
  }


  public static final String SERIALIZED_NAME_SECOND_DATE = "second_date";
  @SerializedName(SERIALIZED_NAME_SECOND_DATE)
  private String secondDate;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo secondDate(String secondDate) {
    this.secondDate = secondDate;
    return this;
  }

  /**
   * <em>second date of comparison period</em><br><strong>required field</strong><br>second date for which domain metrics will be provided;<br>date format: <code>'yyyy-mm-dd'</code>;<br>example: <code>'2021-10-01'</code>;<br>the list available dates is available through the <a href='/v3/dataforseo_labs/google/available_history/live/' rel='noopener noreferrer' target='_blank'>available history endpoint</a>;<br><strong>Note:</strong> <code>second_date</code> cannot be greater than today's date;<br><strong>Also note:</strong> the dates specified in <code>first_date</code> and <code>second_date</code> cannot point to the same month of the same year;<br>you can specify the dates in any order: <code>second_date</code> can be greater than <code>first_date</code> and vice versa;<br>minimum date: <code>'2020-10-01'</code>
   * @return secondDate
   */
  @javax.annotation.Nullable
  public String getSecondDate() {
    return secondDate;
  }

  public void setSecondDate(String secondDate) {
    this.secondDate = secondDate;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of the location</em><br><strong>required field if you don't specify</strong> <code>location_code</code><br><strong>Note:</strong> it is required to specify either <code>location_name</code> or <code>location_code</code>;<br>you can receive the list of available locations with their <code>location_name</code> by making a separate request to<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code>;<br>example:<br><code class='long-string'>United Kingdom</code>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>unique location identifier</em><br><strong>required field if you don't specify</strong> <code>location_name</code><br><strong>Note:</strong> it is required to specify either <code>location_name</code> or <code>location_code</code>;<br>you can receive the list of available locations with their <code>location_code</code> by making a separate request to<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code>;<br>example:<br><code class='long-string'>2840</code>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of the language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code>;<br>you can receive the list of available languages with their <code>language_name</code> by making a separate request to<br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code>;<br>example:<br><code class='long-string'>English</code>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>unique language identifier</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code>;<br>you can receive the list of available languages with their <code>language_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code>;<br>example:<br><code class='long-string'>en</code>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * <em>display results by item type</em><br>optional field<br>indicates the type of search results included in the response;<p><strong>Note:</strong> if the <code>item_types</code> array contains item types that are different from the <code>organic</code> object, the results will be ordered by the first item type in the array; you will not be able to sort and filter results by the types of search results not included in the response;<p>possible values: <br><code>['organic', 'paid', 'featured_snippet', 'local_pack']</code>;<br>default value: <br><code>['organic', 'paid']</code>
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_TOP_CATEGORIES_COUNT = "top_categories_count";
  @SerializedName(SERIALIZED_NAME_TOP_CATEGORIES_COUNT)
  private Long topCategoriesCount;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo topCategoriesCount(Long topCategoriesCount) {
    this.topCategoriesCount = topCategoriesCount;
    return this;
  }

  /**
   * <em>number of additional domain categories</em><br>optional field<br>by using this parameter, you can receive domains relevant to additional categories that are not specified in <code>category_codes</code> above;<br>to learn more about the parameter, please refer to <a href='https://dataforseo.com/help-center/what-is-top_categories_count' rel='noopener noreferrer' target='_blank'>this help center article;</a><br>by default, <code>top_categories_count</code> is equal to the number of categories specified in the <code>category_codes</code> array;<br><strong>Note:</strong> <code>top_categories_count</code> cannot be less than the number of categories in the <code>category_codes</code> array;<br>maximum value: <code>5</code>
   * @return topCategoriesCount
   */
  @javax.annotation.Nullable
  public Long getTopCategoriesCount() {
    return topCategoriesCount;
  }

  public void setTopCategoriesCount(Long topCategoriesCount) {
    this.topCategoriesCount = topCategoriesCount;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * <em>return subdomains in the API response</em><br>optional field<br>if <code>false</code>, the API response will contain <code>main_domain</code> only;<br>if <code>true</code>, the API will return <code>main_domain</code> plus its subdomains (if available);<br>default value: <code>true</code>
   * @return includeSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSubdomains() {
    return includeSubdomains;
  }

  public void setIncludeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
  }


  public static final String SERIALIZED_NAME_ETV_MIN = "etv_min";
  @SerializedName(SERIALIZED_NAME_ETV_MIN)
  private Integer etvMin;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo etvMin(Integer etvMin) {
    this.etvMin = etvMin;
    return this;
  }

  /**
   * <em>minimum current organic ETV of the domain</em><br>optional field<br>if specified, the API will return only domains with <code>organic_etv</code> greater than the specified value
   * @return etvMin
   */
  @javax.annotation.Nullable
  public Integer getEtvMin() {
    return etvMin;
  }

  public void setEtvMin(Integer etvMin) {
    this.etvMin = etvMin;
  }


  public static final String SERIALIZED_NAME_ETV_MAX = "etv_max";
  @SerializedName(SERIALIZED_NAME_ETV_MAX)
  private Integer etvMax;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo etvMax(Integer etvMax) {
    this.etvMax = etvMax;
    return this;
  }

  /**
   * <em>maximum current organic ETV of the domain</em><br>optional field<br>if specified, the API will return only domains with <code>organic_etv</code> lesser than the specified value
   * @return etvMax
   */
  @javax.annotation.Nullable
  public Integer getEtvMax() {
    return etvMax;
  }

  public void setEtvMax(Integer etvMax) {
    this.etvMax = etvMax;
  }


  public static final String SERIALIZED_NAME_CORRELATE = "correlate";
  @SerializedName(SERIALIZED_NAME_CORRELATE)
  private Boolean correlate;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo correlate(Boolean correlate) {
    this.correlate = correlate;
    return this;
  }

  /**
   * <em>correlate data with previously obtained datasets</em><br>optional field<br>default value: <code>true</code>;<br>if you use this parameter, our system will correlate data you obtain now with previously obtained datasets;<br>this parameter is intended to mitigate any inconsistencies that may result from changes to our database;<br><strong>Note:</strong> we do not recommend setting <code>correlate</code> to <code>false</code>
   * @return correlate
   */
  @javax.annotation.Nullable
  public Boolean getCorrelate() {
    return correlate;
  }

  public void setCorrelate(Boolean correlate) {
    this.correlate = correlate;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of domains in the results array</em><br>optional field<br>default value: <code>100</code>;<br>maximum value: <code>1000</code>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned domains</em><br>optional field<br>default value: <code>0</code>;<br>if you specify the <code>10</code> value, the first ten domains in the results array will be omitted and the data will be provided for the successive domains
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong>;<br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>match</code>, <code>not_match</code>, <code>ilike</code>, <code>not_ilike</code>, <code>like</code>, <code>not_like</code>;<br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code>, as well as <code>ilike</code> and <code>not_ilike</code> to match any string of zero or more characters;<br>example:<br><code>['metrics_history.202110.organic.pos_1', '>', 15]</code>;<br>for more information about filters, please refer to <a href='/v3/dataforseo_labs/filters' target='_blank' rel='noopener noreferrer'>Dataforseo Labs - Filters</a> or this <a href='https://dataforseo.com/help-center/how-to-use-filters-in-dataforseo-labs-api' target='_blank' rel='noopener noreferrer'>help center guide</a>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results;<br>default rule: <code>['organic_etv,desc']</code>;<br>possible sorting types:<br><code>asc</code> - results will be sorted in ascending order<br><code>desc</code> - results will be sorted in descending order;<br>you should use a comma to set up a sorting type;<br>example:<br><code>['organic_count,desc']</code>;<br><strong>note that you can set no more than three sorting rules in a single request</strong>;<br>you should use a comma to separate several sorting rules;<br>example:<br><code>['organic_etv,desc','organic_count,asc']</code>
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <em>user-defined task identifier</em><br>optional field<br><em>the character limit is 255</em>;<br>you can use this parameter to identify the task and match it with the result;<br>you will find the specified <code>tag</code> value in the <code>data</code> object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo = (DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo) o;
    return

        Objects.equals(this.categoryCodes, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.categoryCodes) &&
        Objects.equals(this.firstDate, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.firstDate) &&
        Objects.equals(this.secondDate, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.secondDate) &&
        Objects.equals(this.locationName, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.languageCode) &&
        Objects.equals(this.itemTypes, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.itemTypes) &&
        Objects.equals(this.topCategoriesCount, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.topCategoriesCount) &&
        Objects.equals(this.includeSubdomains, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.etvMin, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.etvMin) &&
        Objects.equals(this.etvMax, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.etvMax) &&
        Objects.equals(this.correlate, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.correlate) &&
        Objects.equals(this.limit, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.limit) &&
        Objects.equals(this.offset, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.offset) &&
        Objects.equals(this.filters, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.orderBy) &&
        Objects.equals(this.tag, dataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(categoryCodes, firstDate, secondDate, locationName, locationCode, languageName, languageCode, itemTypes, topCategoriesCount, includeSubdomains, etvMin, etvMax, correlate, limit, offset, filters, orderBy, tag);
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
    sb.append("class DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo {\n");

    sb.append("    categoryCodes: ").append(toIndentedString(categoryCodes)).append("\n");
    sb.append("    firstDate: ").append(toIndentedString(firstDate)).append("\n");
    sb.append("    secondDate: ").append(toIndentedString(secondDate)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    topCategoriesCount: ").append(toIndentedString(topCategoriesCount)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    etvMin: ").append(toIndentedString(etvMin)).append("\n");
    sb.append("    etvMax: ").append(toIndentedString(etvMax)).append("\n");
    sb.append("    correlate: ").append(toIndentedString(correlate)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    
    openapiFields.add("first_date");
    
    openapiFields.add("second_date");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("item_types");
    
    openapiFields.add("top_categories_count");
    
    openapiFields.add("include_subdomains");
    
    openapiFields.add("etv_min");
    
    openapiFields.add("etv_max");
    
    openapiFields.add("correlate");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
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
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}