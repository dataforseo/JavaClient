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



public class DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword
* required field
* UTF-8 encoding
* the keywords will be converted to lowercase format
* learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo locationName(String locationName) {
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo locationCode(Integer locationCode) {
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of the language
* required field if you don’t specify language_code
* Note: it is required to specify either language_name or language_code
* you can receive the list of available locations with their language_name by making a separate request to the
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code
* required field if you don’t specify language_name
* Note: it is required to specify either language_name or language_code
* you can receive the list of available locations with their language_code by making a separate request to the
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


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * keyword search depth
* optional field
* default value: 1
* number of the returned results depends on the value you set in this field
* you can specify a level from 0 to 4
* estimated number of keywords for each level (maximum):
* 0 – the keyword set in the keyword field
* 1 – 8 keywords
* 2 – 72 keywords
* 3 – 584 keywords
* 4 – 4680 keywords
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SEED_KEYWORD = "include_seed_keyword";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SEED_KEYWORD)
  private Boolean includeSeedKeyword;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo includeSeedKeyword(Boolean includeSeedKeyword) {
    this.includeSeedKeyword = includeSeedKeyword;
    return this;
  }

  /**
   * include data for the seed keyword
* optional field
* if set to true, data for the seed keyword specified in the keyword field will be provided in the seed_keyword_data array of the response
* default value: false
   * @return includeSeedKeyword
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSeedKeyword() {
    return includeSeedKeyword;
  }

  public void setIncludeSeedKeyword(Boolean includeSeedKeyword) {
    this.includeSeedKeyword = includeSeedKeyword;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SERP_INFO = "include_serp_info";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SERP_INFO)
  private Boolean includeSerpInfo;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo includeSerpInfo(Boolean includeSerpInfo) {
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo includeClickstreamData(Boolean includeClickstreamData) {
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


  public static final String SERIALIZED_NAME_IGNORE_SYNONYMS = "ignore_synonyms";
  @SerializedName(SERIALIZED_NAME_IGNORE_SYNONYMS)
  private Boolean ignoreSynonyms;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo ignoreSynonyms(Boolean ignoreSynonyms) {
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


  public static final String SERIALIZED_NAME_REPLACE_WITH_CORE_KEYWORD = "replace_with_core_keyword";
  @SerializedName(SERIALIZED_NAME_REPLACE_WITH_CORE_KEYWORD)
  private Boolean replaceWithCoreKeyword;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo replaceWithCoreKeyword(Boolean replaceWithCoreKeyword) {
    this.replaceWithCoreKeyword = replaceWithCoreKeyword;
    return this;
  }

  /**
   * return data for core keyword
* optional field
* if true, serp_info and related_keywords will be returned for the main keyword in the group that the specified keyword belongs to;
* if false, serp_info and related_keywords will be returned for the specified keyword (if available);
* refer to this help center article for more details;
* default value: false
   * @return replaceWithCoreKeyword
   */
  @javax.annotation.Nullable
  public Boolean getReplaceWithCoreKeyword() {
    return replaceWithCoreKeyword;
  }

  public void setReplaceWithCoreKeyword(Boolean replaceWithCoreKeyword) {
    this.replaceWithCoreKeyword = replaceWithCoreKeyword;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in, match, not_match, ilike, not_ilike, like,not_like
* you can use the % operator with like and not_like, as well as ilike and not_ilike to match any string of zero or more characters
* example:
* ['keyword_data.keyword_info.search_volume','>',0]
* [['keyword_info.search_volume','in',[0,1000]],
* 'and',
* ['keyword_data.keyword_info.competition_level','=','LOW']]
* [['keyword_data.keyword_info.search_volume','>',100],
* 'and',
* [['keyword_data.keyword_info.cpc','<',0.5],
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo orderBy(List<String> orderBy) {
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
* you should use a comma to set up a sorting type
* example:
* ['keyword_data.keyword_info.competition,desc']
* default rule:
* ['keyword_data.keyword_info.search_volume,desc']
* note that you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['keyword_data.keyword_info.search_volume,desc','keyword_data.keyword_info.cpc,desc']
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo limit(Integer limit) {
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo offset(Integer offset) {
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


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo tag(String tag) {
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



  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo = (DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo) o;
    return

        Objects.equals(this.keyword, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.keyword) &&
        Objects.equals(this.locationName, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.languageCode) &&
        Objects.equals(this.depth, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.depth) &&
        Objects.equals(this.includeSeedKeyword, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.includeSeedKeyword) &&
        Objects.equals(this.includeSerpInfo, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.includeSerpInfo) &&
        Objects.equals(this.includeClickstreamData, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.includeClickstreamData) &&
        Objects.equals(this.ignoreSynonyms, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.ignoreSynonyms) &&
        Objects.equals(this.replaceWithCoreKeyword, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.replaceWithCoreKeyword) &&
        Objects.equals(this.filters, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.orderBy) &&
        Objects.equals(this.limit, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.limit) &&
        Objects.equals(this.offset, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.offset) &&
        Objects.equals(this.tag, dataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationName, locationCode, languageName, languageCode, depth, includeSeedKeyword, includeSerpInfo, includeClickstreamData, ignoreSynonyms, replaceWithCoreKeyword, filters, orderBy, limit, offset, tag);
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
    sb.append("class DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    includeSeedKeyword: ").append(toIndentedString(includeSeedKeyword)).append("\n");
    sb.append("    includeSerpInfo: ").append(toIndentedString(includeSerpInfo)).append("\n");
    sb.append("    includeClickstreamData: ").append(toIndentedString(includeClickstreamData)).append("\n");
    sb.append("    ignoreSynonyms: ").append(toIndentedString(ignoreSynonyms)).append("\n");
    sb.append("    replaceWithCoreKeyword: ").append(toIndentedString(replaceWithCoreKeyword)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    
    openapiFields.add("keyword");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("include_seed_keyword");
    
    openapiFields.add("include_serp_info");
    
    openapiFields.add("include_clickstream_data");
    
    openapiFields.add("ignore_synonyms");
    
    openapiFields.add("replace_with_core_keyword");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}