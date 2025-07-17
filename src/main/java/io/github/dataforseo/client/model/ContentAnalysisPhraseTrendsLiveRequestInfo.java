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



public class ContentAnalysisPhraseTrendsLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public ContentAnalysisPhraseTrendsLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * target keyword
* required field
* UTF-8 encoding
* the keywords will be converted to a lowercase format;
* Note: to match an exact phrase instead of a stand-alone keyword, use double quotes and backslashes;
* example:
* 'keyword': '\'tesla palo alto\''
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


  public static final String SERIALIZED_NAME_KEYWORD_FIELDS = "keyword_fields";
  @SerializedName(SERIALIZED_NAME_KEYWORD_FIELDS)
  private Map<String, String> keywordFields;

  public ContentAnalysisPhraseTrendsLiveRequestInfo keywordFields(Map<String, String> keywordFields) {
    this.keywordFields = keywordFields;
    return this;
  }

  /**
   * target keyword fields and target keywords
* optional field
* use this parameter to filter the dataset by keywords that certain fields should contain;
* fields you can specify: title, main_title, previous_title, snippet
* you can indicate several fields;
* Note: to match an exact phrase instead of a stand-alone keyword, use double quotes and backslashes;
* example:
* 'keyword_fields': {
*     'snippet': '\'logitech mouse\'',
*     'main_title': 'sale'
* }
   * @return keywordFields
   */
  @javax.annotation.Nullable
  public Map<String, String> getKeywordFields() {
    return keywordFields;
  }

  public void setKeywordFields(Map<String, String> keywordFields) {
    this.keywordFields = keywordFields;
  }


  public static final String SERIALIZED_NAME_PAGE_TYPE = "page_type";
  @SerializedName(SERIALIZED_NAME_PAGE_TYPE)
  private List<String> pageType;

  public ContentAnalysisPhraseTrendsLiveRequestInfo pageType(List<String> pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * target page types
* optional field
* use this parameter to filter the dataset by page types
* possible values:
* 'ecommerce', 'news', 'blogs', 'message-boards', 'organization'
   * @return pageType
   */
  @javax.annotation.Nullable
  public List<String> getPageType() {
    return pageType;
  }

  public void setPageType(List<String> pageType) {
    this.pageType = pageType;
  }


  public static final String SERIALIZED_NAME_SEARCH_MODE = "search_mode";
  @SerializedName(SERIALIZED_NAME_SEARCH_MODE)
  private String searchMode;

  public ContentAnalysisPhraseTrendsLiveRequestInfo searchMode(String searchMode) {
    this.searchMode = searchMode;
    return this;
  }

  /**
   * results grouping type
* optional field
* possible grouping types:
* as_is – returns data on all citations for the target keyword
* one_per_domain – returns data on one citation of the keyword per domain
* default value: as_is
   * @return searchMode
   */
  @javax.annotation.Nullable
  public String getSearchMode() {
    return searchMode;
  }

  public void setSearchMode(String searchMode) {
    this.searchMode = searchMode;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public ContentAnalysisPhraseTrendsLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * maximum number of elements within internal arrays
* optional field
* you can use this field to limit the number of elements within the following arrays:
* top_domains
* text_categories
* page_categories
* countries
* languages
* default value: 1
* maximum value: 20
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public ContentAnalysisPhraseTrendsLiveRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * starting date of the time range
* required field
* date format: 'yyyy-mm-dd'
* example:
* '2019-01-15'
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

  public ContentAnalysisPhraseTrendsLiveRequestInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * ending date of the time range
* optional field
* if you don’t specify this field, today’s date will be used by default
* date format: 'yyyy-mm-dd'
* example:
* '2019-01-15'
   * @return dateTo
   */
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public static final String SERIALIZED_NAME_DATE_GROUP = "date_group";
  @SerializedName(SERIALIZED_NAME_DATE_GROUP)
  private String dateGroup;

  public ContentAnalysisPhraseTrendsLiveRequestInfo dateGroup(String dateGroup) {
    this.dateGroup = dateGroup;
    return this;
  }

  /**
   * time range which will be used to group the results
* optional field
* default value: month
* possible values: day, week, month
   * @return dateGroup
   */
  @javax.annotation.Nullable
  public String getDateGroup() {
    return dateGroup;
  }

  public void setDateGroup(String dateGroup) {
    this.dateGroup = dateGroup;
  }


  public static final String SERIALIZED_NAME_INITIAL_DATASET_FILTERS = "initial_dataset_filters";
  @SerializedName(SERIALIZED_NAME_INITIAL_DATASET_FILTERS)
  private List<Object> initialDatasetFilters;

  public ContentAnalysisPhraseTrendsLiveRequestInfo initialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
    return this;
  }

  /**
   * initial dataset filtering parameters
* optional field
* initial filtering parameters that apply to fields in the Search endpoint;
* you can add several filters at once (8 filters maximum);
* you should set a logical operator and, or between the conditions;
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in, like,not_like, has, has_not, match, not_match
* you can use the % operator with like and not_like to match any string of zero or more characters;
* example:
* ['domain','<>', 'logitech.com']
* [['domain','<>','logitech.com'],'and',['content_info.connotation_types.negative','>',1000]]
* [['domain','<>','logitech.com']],
* 'and',
* [['content_info.connotation_types.negative','>',1000],
* 'or',
* ['content_info.text_category','has',10994]]]
* for more information about filters, please refer to Content Analysis API – Filters
   * @return initialDatasetFilters
   */
  @javax.annotation.Nullable
  public List<Object> getInitialDatasetFilters() {
    return initialDatasetFilters;
  }

  public void setInitialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
  }


  public static final String SERIALIZED_NAME_RANK_SCALE = "rank_scale";
  @SerializedName(SERIALIZED_NAME_RANK_SCALE)
  private String rankScale;

  public ContentAnalysisPhraseTrendsLiveRequestInfo rankScale(String rankScale) {
    this.rankScale = rankScale;
    return this;
  }

  /**
   * defines the scale used for calculating and displaying the rank values
* optional field
* you can use this parameter to choose whether rank values are presented on a 0–100 or 0–1000 scale
* possible values:
* one_hundred — rank values are displayed on a 0–100 scale
* one_thousand — rank values are displayed on a 0–1000 scale
* default value: one_thousand
* learn more about how this parameter works in this Help Center article
   * @return rankScale
   */
  @javax.annotation.Nullable
  public String getRankScale() {
    return rankScale;
  }

  public void setRankScale(String rankScale) {
    this.rankScale = rankScale;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public ContentAnalysisPhraseTrendsLiveRequestInfo tag(String tag) {
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



  public ContentAnalysisPhraseTrendsLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentAnalysisPhraseTrendsLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentAnalysisPhraseTrendsLiveRequestInfo contentAnalysisPhraseTrendsLiveRequestInfo = (ContentAnalysisPhraseTrendsLiveRequestInfo) o;
    return

        Objects.equals(this.keyword, contentAnalysisPhraseTrendsLiveRequestInfo.keyword) &&
        Objects.equals(this.keywordFields, contentAnalysisPhraseTrendsLiveRequestInfo.keywordFields) &&
        Objects.equals(this.pageType, contentAnalysisPhraseTrendsLiveRequestInfo.pageType) &&
        Objects.equals(this.searchMode, contentAnalysisPhraseTrendsLiveRequestInfo.searchMode) &&
        Objects.equals(this.internalListLimit, contentAnalysisPhraseTrendsLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.dateFrom, contentAnalysisPhraseTrendsLiveRequestInfo.dateFrom) &&
        Objects.equals(this.dateTo, contentAnalysisPhraseTrendsLiveRequestInfo.dateTo) &&
        Objects.equals(this.dateGroup, contentAnalysisPhraseTrendsLiveRequestInfo.dateGroup) &&
        Objects.equals(this.initialDatasetFilters, contentAnalysisPhraseTrendsLiveRequestInfo.initialDatasetFilters) &&
        Objects.equals(this.rankScale, contentAnalysisPhraseTrendsLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, contentAnalysisPhraseTrendsLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, keywordFields, pageType, searchMode, internalListLimit, dateFrom, dateTo, dateGroup, initialDatasetFilters, rankScale, tag);
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
    sb.append("class ContentAnalysisPhraseTrendsLiveRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordFields: ").append(toIndentedString(keywordFields)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    dateGroup: ").append(toIndentedString(dateGroup)).append("\n");
    sb.append("    initialDatasetFilters: ").append(toIndentedString(initialDatasetFilters)).append("\n");
    sb.append("    rankScale: ").append(toIndentedString(rankScale)).append("\n");
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
    
    openapiFields.add("keyword_fields");
    
    openapiFields.add("page_type");
    
    openapiFields.add("search_mode");
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("date_from");
    
    openapiFields.add("date_to");
    
    openapiFields.add("date_group");
    
    openapiFields.add("initial_dataset_filters");
    
    openapiFields.add("rank_scale");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentAnalysisPhraseTrendsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentAnalysisPhraseTrendsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentAnalysisPhraseTrendsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentAnalysisPhraseTrendsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentAnalysisPhraseTrendsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentAnalysisPhraseTrendsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, ContentAnalysisPhraseTrendsLiveRequestInfo value) throws IOException {
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
           public ContentAnalysisPhraseTrendsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentAnalysisPhraseTrendsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentAnalysisPhraseTrendsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisPhraseTrendsLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}