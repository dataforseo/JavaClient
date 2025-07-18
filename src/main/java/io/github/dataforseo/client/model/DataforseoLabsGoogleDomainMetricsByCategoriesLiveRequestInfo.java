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
   * product and service categories
* required field
* The maximum number of categories you can specify: 5
* you can download the full list of possible categories
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
   * first date of comparison period
* required field
* first date for which domain metrics will be provided;
* date format: 'yyyy-mm-dd';
* example: '2021-06-01';
* the list available dates is available through the available history endpoint;
* Note: first_date cannot be greater than today’s date;
* Also note: the dates specified in first_date and second_date cannot point to the same month of the same year;
* you can specify the dates in any order: first_date can be greater than second_date and vice versa;
* minimum date: '2020-10-01'
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
   * second date of comparison period
* required field
* second date for which domain metrics will be provided;
* date format: 'yyyy-mm-dd';
* example: '2021-10-01';
* the list available dates is available through the available history endpoint;
* Note: second_date cannot be greater than today’s date;
* Also note: the dates specified in first_date and second_date cannot point to the same month of the same year;
* you can specify the dates in any order: second_date can be greater than first_date and vice versa;
* minimum date: '2020-10-01'
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
   * full name of the location
* required field if you don’t specify location_code
* Note: it is required to specify either location_name or location_code;
* you can receive the list of available locations with their location_name by making a separate request to
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages;
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * unique location identifier
* required field if you don’t specify location_name
* Note: it is required to specify either location_name or location_code;
* you can receive the list of available locations with their location_code by making a separate request to
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages;
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of the language
* required field if you don’t specify language_code
* Note: it is required to specify either language_name or language_code;
* you can receive the list of available languages with their language_name by making a separate request to
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages;
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * unique language identifier
* required field if you don’t specify language_name
* Note: it is required to specify either language_name or language_code;
* you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages;
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * display results by item type
* optional field
* indicates the type of search results included in the response;
* Note: if the item_types array contains item types that are different from the organic object, the results will be ordered by the first item type in the array; you will not be able to sort and filter results by the types of search results not included in the response;
* possible values:
* ['organic', 'paid', 'featured_snippet', 'local_pack'];
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


  public static final String SERIALIZED_NAME_TOP_CATEGORIES_COUNT = "top_categories_count";
  @SerializedName(SERIALIZED_NAME_TOP_CATEGORIES_COUNT)
  private Long topCategoriesCount;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo topCategoriesCount(Long topCategoriesCount) {
    this.topCategoriesCount = topCategoriesCount;
    return this;
  }

  /**
   * number of additional domain categories
* optional field
* by using this parameter, you can receive domains relevant to additional categories that are not specified in category_codes above;
* to learn more about the parameter, please refer to this help center article;
* by default, top_categories_count is equal to the number of categories specified in the category_codes array;
* Note: top_categories_count cannot be less than the number of categories in the category_codes array;
* maximum value: 5
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
   * return subdomains in the API response
* optional field
* if false, the API response will contain main_domain only;
* if true, the API will return main_domain plus its subdomains (if available);
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


  public static final String SERIALIZED_NAME_ETV_MIN = "etv_min";
  @SerializedName(SERIALIZED_NAME_ETV_MIN)
  private Integer etvMin;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo etvMin(Integer etvMin) {
    this.etvMin = etvMin;
    return this;
  }

  /**
   * minimum current organic ETV of the domain
* optional field
* if specified, the API will return only domains with organic_etv greater than the specified value
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
   * maximum current organic ETV of the domain
* optional field
* if specified, the API will return only domains with organic_etv lesser than the specified value
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
   * correlate data with previously obtained datasets
* optional field
* default value: true;
* if you use this parameter, our system will correlate data you obtain now with previously obtained datasets;
* this parameter is intended to mitigate any inconsistencies that may result from changes to our database;
* Note: we do not recommend setting correlate to false
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
   * the maximum number of domains in the results array
* optional field
* default value: 100;
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned domains
* optional field
* default value: 0;
* if you specify the 10 value, the first ten domains in the results array will be omitted and the data will be provided for the successive domains
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
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum);
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in, match, not_match, ilike, not_ilike, like, not_like;
* you can use the % operator with like and not_like, as well as ilike and not_ilike to match any string of zero or more characters;
* example:
* ['metrics_history.202110.organic.pos_1', '>', 15];
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

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * results sorting rules
* optional field
* you can use the same values as in the filters array to sort the results;
* default rule: ['organic_etv,desc'];
* possible sorting types:
* asc – results will be sorted in ascending order
* desc – results will be sorted in descending order;
* you should use a comma to set up a sorting type;
* example:
* ['organic_count,desc'];
* note that you can set no more than three sorting rules in a single request;
* you should use a comma to separate several sorting rules;
* example:
* ['organic_etv,desc','organic_count,asc']
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
   * user-defined task identifier
* optional field
* the character limit is 255;
* you can use this parameter to identify the task and match it with the result;
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