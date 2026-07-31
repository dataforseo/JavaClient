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


public class ContentAnalysisRatingDistributionLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public ContentAnalysisRatingDistributionLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <em>target keyword</em><br><strong>required field</strong><br>UTF-8 encoding<br>the keywords will be converted to a lowercase format;<br><strong>Note</strong>: to match an exact phrase instead of a stand-alone keyword, use double quotes and backslashes; <br>example: <br><code>'keyword': '\'tesla palo alto\''</code><p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
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

  public ContentAnalysisRatingDistributionLiveRequestInfo keywordFields(Map<String, String> keywordFields) {
    this.keywordFields = keywordFields;
    return this;
  }

  /**
   * <em>target keyword fields and target keywords</em><br>optional field<br>use this parameter to filter the dataset by keywords that certain fields should contain;<br>fields you can specify: <code>title</code>, <code>main_title</code>, <code>previous_title</code>, <code>snippet</code><br>you can indicate several fields;<br><strong>Note</strong>: to match an exact phrase instead of a stand-alone keyword, use double quotes and backslashes; <br>example:<br>`'keyword_fields': {<br>'snippet': '\'logitech mouse\'',<br>'main_title': 'sale'<br>}`
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

  public ContentAnalysisRatingDistributionLiveRequestInfo pageType(List<String> pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * <em>target page types</em><br>optional field<br>use this parameter to filter the dataset by page types<br>possible values: <br><code>'ecommerce'</code>, <code>'news'</code>, <code>'blogs'</code>, <code>'message-boards'</code>, <code>'organization'</code>
   * @return pageType
   */
  @javax.annotation.Nullable
  public List<String> getPageType() {
    return pageType;
  }

  public void setPageType(List<String> pageType) {
    this.pageType = pageType;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public ContentAnalysisRatingDistributionLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * <em>maximum number of elements within internal arrays</em><br>optional field<br>you can use this field to limit the number of elements within the following arrays:<br><code>top_domains</code><br><code>text_categories</code><br><code>page_categories</code><br><code>countries</code><br><code>languages</code><br>default value: <code>1</code><br>maximum value: <code>20</code>
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_SEARCH_MODE = "search_mode";
  @SerializedName(SERIALIZED_NAME_SEARCH_MODE)
  private String searchMode;

  public ContentAnalysisRatingDistributionLiveRequestInfo searchMode(String searchMode) {
    this.searchMode = searchMode;
    return this;
  }

  /**
   * <em>results grouping type</em><br>optional field<br>possible grouping types:<br><code>as_is</code> - returns all citations for the target <code>keyword</code><br><code>one_per_domain</code> - returns one citation of the <code>keyword</code> per domain<br>default value: <code>as_is</code>
   * @return searchMode
   */
  @javax.annotation.Nullable
  public String getSearchMode() {
    return searchMode;
  }

  public void setSearchMode(String searchMode) {
    this.searchMode = searchMode;
  }


  public static final String SERIALIZED_NAME_POSITIVE_CONNOTATION_THRESHOLD = "positive_connotation_threshold";
  @SerializedName(SERIALIZED_NAME_POSITIVE_CONNOTATION_THRESHOLD)
  private Double positiveConnotationThreshold;

  public ContentAnalysisRatingDistributionLiveRequestInfo positiveConnotationThreshold(Double positiveConnotationThreshold) {
    this.positiveConnotationThreshold = positiveConnotationThreshold;
    return this;
  }

  /**
   * <em>positive connotation threshold</em><br>optional field<br>specified as the probability index threshold for positive sentiment related to the citation content<br>if you specify this field, <code>connotation_types</code> object in the response will only contain data on citations with <code>positive</code> sentiment probability more than or equal to the specified value<br>possible values: from <code>0</code> to <code>1</code><br>default value: <code>0.4</code>
   * @return positiveConnotationThreshold
   */
  @javax.annotation.Nullable
  public Double getPositiveConnotationThreshold() {
    return positiveConnotationThreshold;
  }

  public void setPositiveConnotationThreshold(Double positiveConnotationThreshold) {
    this.positiveConnotationThreshold = positiveConnotationThreshold;
  }


  public static final String SERIALIZED_NAME_SENTIMENTS_CONNOTATION_THRESHOLD = "sentiments_connotation_threshold";
  @SerializedName(SERIALIZED_NAME_SENTIMENTS_CONNOTATION_THRESHOLD)
  private Double sentimentsConnotationThreshold;

  public ContentAnalysisRatingDistributionLiveRequestInfo sentimentsConnotationThreshold(Double sentimentsConnotationThreshold) {
    this.sentimentsConnotationThreshold = sentimentsConnotationThreshold;
    return this;
  }

  /**
   * <em>sentiment connotation threshold</em><br>optional field<br>specified as the probability index threshold for sentiment connotations related to the citation content<br>if you specify this field, <code>sentiment_connotations</code> object in the response will only contain data on citations where the probability per each sentiment is more than or equal to the specified value<br>possible values: from <code>0</code> to <code>1</code><br>default value: <code>0.4</code>
   * @return sentimentsConnotationThreshold
   */
  @javax.annotation.Nullable
  public Double getSentimentsConnotationThreshold() {
    return sentimentsConnotationThreshold;
  }

  public void setSentimentsConnotationThreshold(Double sentimentsConnotationThreshold) {
    this.sentimentsConnotationThreshold = sentimentsConnotationThreshold;
  }


  public static final String SERIALIZED_NAME_INITIAL_DATASET_FILTERS = "initial_dataset_filters";
  @SerializedName(SERIALIZED_NAME_INITIAL_DATASET_FILTERS)
  private List<Object> initialDatasetFilters;

  public ContentAnalysisRatingDistributionLiveRequestInfo initialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
    return this;
  }

  /**
   * <em>initial dataset filtering parameters</em><br>optional field<br>initial filtering parameters that apply to fields in the <a href='/v3/content_analysis/search/live/?bash' target='_blank'>Search endpoint</a><br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>,<code>not_like</code>, <code>has</code>, <code>has_not</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['domain','<>', 'logitech.com']</code><p><code>[['domain','<>','logitech.com'],'and',['content_info.connotation_types.negative','>',1000]]</code><p><code>[['domain','<&gt','logitech.com']],<br>'and',<br>[['content_info.connotation_types.negative','>',1000],<br>'or',<p>['content_info.text_category','has',10994]]]</code><br>for more information about filters, please refer to <a href='/v3/content_analysis/filters' target='_blank' rel='noopener noreferrer'>Content Analysis API - Filters</a><br>learn more about the initial dataset filters in <a href='https://dataforseo.com/help-center/what-are-the-initial-dataset-filters-and-how-do-they-work' rel='noopener noreferrer' target='_blank'>this help center article.</a>
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

  public ContentAnalysisRatingDistributionLiveRequestInfo rankScale(String rankScale) {
    this.rankScale = rankScale;
    return this;
  }

  /**
   * <em>defines the scale used for calculating and displaying the <code>rank</code> values</em><br>optional field<p>you can use this parameter to choose whether rank values are presented on a 0–100 or 0–1000 scale<p>possible values:<br><code>one_hundred</code> — rank values are displayed on a 0–100 scale<br><code>one_thousand</code> — rank values are displayed on a 0–1000 scale<p>default value: <code>one_thousand</code><p>learn more about how this parameter works in <a href='https://dataforseo.com/help-center/using-the-rank_scale-parameter-in-content-analysis-api'>this Help Center article</a>
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

  public ContentAnalysisRatingDistributionLiveRequestInfo tag(String tag) {
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



  public ContentAnalysisRatingDistributionLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentAnalysisRatingDistributionLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentAnalysisRatingDistributionLiveRequestInfo contentAnalysisRatingDistributionLiveRequestInfo = (ContentAnalysisRatingDistributionLiveRequestInfo) o;
    return

        Objects.equals(this.keyword, contentAnalysisRatingDistributionLiveRequestInfo.keyword) &&
        Objects.equals(this.keywordFields, contentAnalysisRatingDistributionLiveRequestInfo.keywordFields) &&
        Objects.equals(this.pageType, contentAnalysisRatingDistributionLiveRequestInfo.pageType) &&
        Objects.equals(this.internalListLimit, contentAnalysisRatingDistributionLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.searchMode, contentAnalysisRatingDistributionLiveRequestInfo.searchMode) &&
        Objects.equals(this.positiveConnotationThreshold, contentAnalysisRatingDistributionLiveRequestInfo.positiveConnotationThreshold) &&
        Objects.equals(this.sentimentsConnotationThreshold, contentAnalysisRatingDistributionLiveRequestInfo.sentimentsConnotationThreshold) &&
        Objects.equals(this.initialDatasetFilters, contentAnalysisRatingDistributionLiveRequestInfo.initialDatasetFilters) &&
        Objects.equals(this.rankScale, contentAnalysisRatingDistributionLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, contentAnalysisRatingDistributionLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, keywordFields, pageType, internalListLimit, searchMode, positiveConnotationThreshold, sentimentsConnotationThreshold, initialDatasetFilters, rankScale, tag);
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
    sb.append("class ContentAnalysisRatingDistributionLiveRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordFields: ").append(toIndentedString(keywordFields)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
    sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
    sb.append("    positiveConnotationThreshold: ").append(toIndentedString(positiveConnotationThreshold)).append("\n");
    sb.append("    sentimentsConnotationThreshold: ").append(toIndentedString(sentimentsConnotationThreshold)).append("\n");
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
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("search_mode");
    
    openapiFields.add("positive_connotation_threshold");
    
    openapiFields.add("sentiments_connotation_threshold");
    
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
   * @throws IOException if the JSON Element is invalid with respect to ContentAnalysisRatingDistributionLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentAnalysisRatingDistributionLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentAnalysisRatingDistributionLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentAnalysisRatingDistributionLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentAnalysisRatingDistributionLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentAnalysisRatingDistributionLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, ContentAnalysisRatingDistributionLiveRequestInfo value) throws IOException {
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
           public ContentAnalysisRatingDistributionLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentAnalysisRatingDistributionLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentAnalysisRatingDistributionLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisRatingDistributionLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}