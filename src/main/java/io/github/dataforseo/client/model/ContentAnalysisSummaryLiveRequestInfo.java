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



public class ContentAnalysisSummaryLiveRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public ContentAnalysisSummaryLiveRequestInfo keyword(String keyword) {
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

  public ContentAnalysisSummaryLiveRequestInfo keywordFields(Map<String, String> keywordFields) {
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

  public ContentAnalysisSummaryLiveRequestInfo pageType(List<String> pageType) {
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


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public ContentAnalysisSummaryLiveRequestInfo internalListLimit(Integer internalListLimit) {
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


  public static final String SERIALIZED_NAME_POSITIVE_CONNOTATION_THRESHOLD = "positive_connotation_threshold";
  @SerializedName(SERIALIZED_NAME_POSITIVE_CONNOTATION_THRESHOLD)
  private Double positiveConnotationThreshold;

  public ContentAnalysisSummaryLiveRequestInfo positiveConnotationThreshold(Double positiveConnotationThreshold) {
    this.positiveConnotationThreshold = positiveConnotationThreshold;
    return this;
  }

  /**
   * positive connotation threshold
* optional field
* specified as the probability index threshold for positive sentiment related to the citation content
* if you specify this field, connotation_types object in the response will only contain data on citations with positive sentiment probability more than or equal to the specified value
* possible values: from 0 to 1
* default value: 0.4
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

  public ContentAnalysisSummaryLiveRequestInfo sentimentsConnotationThreshold(Double sentimentsConnotationThreshold) {
    this.sentimentsConnotationThreshold = sentimentsConnotationThreshold;
    return this;
  }

  /**
   * sentiment connotation threshold
* optional field
* specified as the probability index threshold for sentiment connotations related to the citation content
* if you specify this field, sentiment_connotations object in the response will only contain data on citations where the
* probability per each sentiment is more than or equal to the specified value
* possible values: from 0 to 1
* default value: 0.4
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

  public ContentAnalysisSummaryLiveRequestInfo initialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
    return this;
  }

  /**
   * initial dataset filtering parameters
* optional field
* initial filtering parameters that apply to fields in the Search endpoint
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in, like,not_like, has, has_not
* you can use the % operator with like and not_like to match any string of zero or more characters
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

  public ContentAnalysisSummaryLiveRequestInfo rankScale(String rankScale) {
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

  public ContentAnalysisSummaryLiveRequestInfo tag(String tag) {
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



  public ContentAnalysisSummaryLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentAnalysisSummaryLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentAnalysisSummaryLiveRequestInfo contentAnalysisSummaryLiveRequestInfo = (ContentAnalysisSummaryLiveRequestInfo) o;
    return

        Objects.equals(this.keyword, contentAnalysisSummaryLiveRequestInfo.keyword) &&
        Objects.equals(this.keywordFields, contentAnalysisSummaryLiveRequestInfo.keywordFields) &&
        Objects.equals(this.pageType, contentAnalysisSummaryLiveRequestInfo.pageType) &&
        Objects.equals(this.internalListLimit, contentAnalysisSummaryLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.positiveConnotationThreshold, contentAnalysisSummaryLiveRequestInfo.positiveConnotationThreshold) &&
        Objects.equals(this.sentimentsConnotationThreshold, contentAnalysisSummaryLiveRequestInfo.sentimentsConnotationThreshold) &&
        Objects.equals(this.initialDatasetFilters, contentAnalysisSummaryLiveRequestInfo.initialDatasetFilters) &&
        Objects.equals(this.rankScale, contentAnalysisSummaryLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, contentAnalysisSummaryLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, keywordFields, pageType, internalListLimit, positiveConnotationThreshold, sentimentsConnotationThreshold, initialDatasetFilters, rankScale, tag);
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
    sb.append("class ContentAnalysisSummaryLiveRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordFields: ").append(toIndentedString(keywordFields)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ContentAnalysisSummaryLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentAnalysisSummaryLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentAnalysisSummaryLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentAnalysisSummaryLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentAnalysisSummaryLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentAnalysisSummaryLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, ContentAnalysisSummaryLiveRequestInfo value) throws IOException {
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
           public ContentAnalysisSummaryLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentAnalysisSummaryLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentAnalysisSummaryLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisSummaryLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}