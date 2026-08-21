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
   * <em>keyword</em><br><strong>required field</strong><br>UTF-8 encoding<br>the keywords will be converted to lowercase format<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo locationCode(Integer locationCode) {
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of the language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code><br>you can receive the list of available locations with their <code>language_name</code> by making a separate request to the <br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>English</code>
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
   * <em>language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>Note:</strong> it is required to specify either <code>language_name</code> or <code>language_code</code><br>you can receive the list of available locations with their <code>language_code</code> by making a separate request to the <br><code>https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages</code><br>example:<br><code class='long-string'>en</code>
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
   * <em>keyword search depth</em><br>optional field<br>default value: <code>1</code><p>number of the returned results depends on the value you set in this field<br>you can specify a level from 0 to 4<br>estimated number of keywords for each level (maximum):<br>0 - the keyword set in the <code>keyword</code> field<br>1 – 8 keywords<br>2 – 72 keywords<br>3 – 584 keywords<br>4 – 4680 keywords
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
   * <em>include data for the seed keyword</em><br>optional field<br>if set to <code>true</code>, data for the seed keyword specified in the <code>keyword</code> field will be provided in the <code>seed_keyword_data</code> array of the response<br>default value: <code>false</code>
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo includeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
    return this;
  }

  /**
   * 
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
   * 
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
   * <em>return data for core keyword</em><br>optional field<br>if <code>true</code>, <code>serp_info</code> and <code>related_keywords</code> will be returned for the main keyword in the group that the specified <code>keyword</code> belongs to;<br>if <code>false</code>, <code>serp_info</code> and <code>related_keywords</code> will be returned for the specified <code>keyword</code> (if available);<br>refer to <a href='https://dataforseo.com/help-center/replace_with_core_keyword' rel='noopener noreferrer' target='_blank'>this help center article</a> for more details;<br>default value: <code>false</code>
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
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>match</code>, <code>not_match</code>, <code>ilike</code>, <code>not_ilike</code>, <code>like</code>,<code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code>, as well as <code>ilike</code> and <code>not_ilike</code> to match any string of zero or more characters<br>example:<br><code>['keyword_data.keyword_info.search_volume','>',0]</code><p><code>[['keyword_info.search_volume','in',[0,1000]],<br>'and',<br>['keyword_data.keyword_info.competition_level','=','LOW']]</code><p><code>[['keyword_data.keyword_info.search_volume','>',100],<br>'and',<br>[['keyword_data.keyword_info.cpc','<',0.5],<br>'or',<p>['keyword_info.high_top_of_page_bid','<=',0.5]]]</code><br>for more information about filters, please refer to <a href='/v3/dataforseo_labs/filters' target='_blank' rel='noopener noreferrer'>Dataforseo Labs - Filters</a> or this <a href='https://dataforseo.com/help-center/how-to-use-filters-in-dataforseo-labs-api' rel='noopener noreferrer' target='_blank'>help center guide</a>
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
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['keyword_data.keyword_info.competition,desc']</code><br>default rule:<br><code>['keyword_data.keyword_info.search_volume,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['keyword_data.keyword_info.search_volume,desc','keyword_data.keyword_info.cpc,desc']</code>
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

  public DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned keywords</em><br>optional field<br>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords
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