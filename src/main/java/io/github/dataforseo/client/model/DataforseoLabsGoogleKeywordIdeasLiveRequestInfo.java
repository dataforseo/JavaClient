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



public class DataforseoLabsGoogleKeywordIdeasLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * keywords
* required field
* UTF-8 encoding
* The maximum number of keywords you can specify: 200.
* The keywords will be converted to lowercase format
* learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
   * @return keywords
   */
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo locationName(String locationName) {
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * unique location identifier
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of the language
* optional field
* if you use this field, you don’t need to specify language_code
* you can receive the list of available languages with their language_name by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* English
* Note: if omitted, results default to the language with the most keyword records in the specified location;
* refer to the available_languages.keywords field of the Locations and Languages endpoint to determine the default language
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code
* optional field
* if you use this field, you don’t need to specify language_name
* you can receive the list of available languages with their language_code by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* en
* Note: if omitted, results default to the language with the most keyword records in the specified location;
* refer to the available_languages.keywords field of the Locations and Languages endpoint to determine the default language
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CLOSELY_VARIANTS = "closely_variants";
  @SerializedName(SERIALIZED_NAME_CLOSELY_VARIANTS)
  private Boolean closelyVariants;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo closelyVariants(Boolean closelyVariants) {
    this.closelyVariants = closelyVariants;
    return this;
  }

  /**
   * search mode
* optional field
* if set to true the results will be based on the phrase-match search algorithm
* if set to false the results will be based on the broad-match search algorithm
* default value: false
   * @return closelyVariants
   */
  @javax.annotation.Nullable
  public Boolean getCloselyVariants() {
    return closelyVariants;
  }

  public void setCloselyVariants(Boolean closelyVariants) {
    this.closelyVariants = closelyVariants;
  }


  public static final String SERIALIZED_NAME_IGNORE_SYNONYMS = "ignore_synonyms";
  @SerializedName(SERIALIZED_NAME_IGNORE_SYNONYMS)
  private Boolean ignoreSynonyms;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo ignoreSynonyms(Boolean ignoreSynonyms) {
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


  public static final String SERIALIZED_NAME_INCLUDE_SERP_INFO = "include_serp_info";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SERP_INFO)
  private Boolean includeSerpInfo;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo includeSerpInfo(Boolean includeSerpInfo) {
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo includeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
    return this;
  }

  /**
   * include or exclude data from clickstream-based metrics in the result
* optional field
* if the parameter is set to true, you will receive clickstream_keyword_info, keyword_info_normalized_with_clickstream, and keyword_info_normalized_with_bing fields in the response
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


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of keywords in the results array
* optional field
* default value: 700
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned keywords
* optional field
* default value: 0
* if you specify the 10 value, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo offsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
    return this;
  }

  /**
   * offset token for subsequent requests
* optional field
* provided in the identical filed of the response to each request;
* use this parameter to avoid timeouts while trying to obtain over 10,000 results in a single request;
* by specifying the unique offset_token value from the response array, you will get the subsequent results of the initial task;
* offset_token values are unique for each subsequent task
* Note: if the offset_token is specified in the request, all other parameters except limit will not be taken into account when processing a task.
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in, match, not_match, ilike, not_ilike, like, not_like
* you can use the % operator with like and not_like,as well as ilike, not_ilike to match any string of zero or more characters
* note that you can not filter the results by relevance
* example:
* ['keyword_info.search_volume','>',0]
* [['keyword_info.search_volume','in',[0,1000]],
* 'and',
* ['keyword_info.competition_level','=','LOW']]
* [['keyword_info.search_volume','>',100],
* 'and',
* [['keyword_info.cpc','<',0.5],
* 'or',
* ['keyword_info.high_top_of_page_bid','<=',0.5]]]
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo orderBy(List<String> orderBy) {
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
* default rule:
* ['relevance,desc']
* relevance is used as the default sorting rule to provide you with the closest keyword ideas. We recommend using this sorting rule to get highly-relevant search terms. Note that relevance is only our internal system identifier, so it can not be used as a filter, and you will not find this field in the result array. The relevance score is based on a similar principle as used in the Keywords For Keywords endpoint.
* note that you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['relevance,desc','keyword_info.search_volume,desc']
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

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo tag(String tag) {
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



  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleKeywordIdeasLiveRequestInfo dataforseoLabsGoogleKeywordIdeasLiveRequestInfo = (DataforseoLabsGoogleKeywordIdeasLiveRequestInfo) o;
    return

        Objects.equals(this.keywords, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.keywords) &&
        Objects.equals(this.locationName, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.languageCode) &&
        Objects.equals(this.closelyVariants, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.closelyVariants) &&
        Objects.equals(this.ignoreSynonyms, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.ignoreSynonyms) &&
        Objects.equals(this.includeSerpInfo, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.includeSerpInfo) &&
        Objects.equals(this.includeClickstreamData, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.includeClickstreamData) &&
        Objects.equals(this.limit, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.limit) &&
        Objects.equals(this.offset, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.offset) &&
        Objects.equals(this.offsetToken, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.offsetToken) &&
        Objects.equals(this.filters, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.orderBy) &&
        Objects.equals(this.tag, dataforseoLabsGoogleKeywordIdeasLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywords, locationName, locationCode, languageName, languageCode, closelyVariants, ignoreSynonyms, includeSerpInfo, includeClickstreamData, limit, offset, offsetToken, filters, orderBy, tag);
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
    sb.append("class DataforseoLabsGoogleKeywordIdeasLiveRequestInfo {\n");

    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    closelyVariants: ").append(toIndentedString(closelyVariants)).append("\n");
    sb.append("    ignoreSynonyms: ").append(toIndentedString(ignoreSynonyms)).append("\n");
    sb.append("    includeSerpInfo: ").append(toIndentedString(includeSerpInfo)).append("\n");
    sb.append("    includeClickstreamData: ").append(toIndentedString(includeClickstreamData)).append("\n");
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
    
    openapiFields.add("keywords");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("closely_variants");
    
    openapiFields.add("ignore_synonyms");
    
    openapiFields.add("include_serp_info");
    
    openapiFields.add("include_clickstream_data");
    
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
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleKeywordIdeasLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleKeywordIdeasLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleKeywordIdeasLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleKeywordIdeasLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleKeywordIdeasLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGoogleKeywordIdeasLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleKeywordIdeasLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleKeywordIdeasLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleKeywordIdeasLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}