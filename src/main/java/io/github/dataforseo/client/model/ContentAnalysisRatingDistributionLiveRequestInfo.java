/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

/**
 * ContentAnalysisRatingDistributionLiveRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class ContentAnalysisRatingDistributionLiveRequestInfo {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_KEYWORD_FIELDS = "keyword_fields";
  @SerializedName(SERIALIZED_NAME_KEYWORD_FIELDS)
  private Map<String, String> keywordFields;

  public static final String SERIALIZED_NAME_PAGE_TYPE = "page_type";
  @SerializedName(SERIALIZED_NAME_PAGE_TYPE)
  private List<String> pageType;

  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public static final String SERIALIZED_NAME_SEARCH_MODE = "search_mode";
  @SerializedName(SERIALIZED_NAME_SEARCH_MODE)
  private String searchMode;

  public static final String SERIALIZED_NAME_POSITIVE_CONNOTATION_THRESHOLD = "positive_connotation_threshold";
  @SerializedName(SERIALIZED_NAME_POSITIVE_CONNOTATION_THRESHOLD)
  private Float positiveConnotationThreshold;

  public static final String SERIALIZED_NAME_SENTIMENTS_CONNOTATION_THRESHOLD = "sentiments_connotation_threshold";
  @SerializedName(SERIALIZED_NAME_SENTIMENTS_CONNOTATION_THRESHOLD)
  private Float sentimentsConnotationThreshold;

  public static final String SERIALIZED_NAME_INITIAL_DATASET_FILTERS = "initial_dataset_filters";
  @SerializedName(SERIALIZED_NAME_INITIAL_DATASET_FILTERS)
  private List<Object> initialDatasetFilters;

  public static final String SERIALIZED_NAME_RANK_SCALE = "rank_scale";
  @SerializedName(SERIALIZED_NAME_RANK_SCALE)
  private String rankScale;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public ContentAnalysisRatingDistributionLiveRequestInfo() {
  }

  public ContentAnalysisRatingDistributionLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * target keyword required field UTF-8 encoding the keywords will be converted to a lowercase format; Note: to match an exact phrase instead of a stand-alone keyword, use double quotes and backslashes; example: \&quot;keyword\&quot;: \&quot;\\\&quot;tesla palo alto\\\&quot;\&quot; learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo keywordFields(Map<String, String> keywordFields) {
    this.keywordFields = keywordFields;
    return this;
  }

  public ContentAnalysisRatingDistributionLiveRequestInfo putKeywordFieldsItem(String key, String keywordFieldsItem) {
    if (this.keywordFields == null) {
      this.keywordFields = new HashMap<>();
    }
    this.keywordFields.put(key, keywordFieldsItem);
    return this;
  }

  /**
   * target keyword fields and target keywords optional field use this parameter to filter the dataset by keywords that certain fields should contain; fields you can specify: title, main_title, previous_title, snippet you can indicate several fields; Note: to match an exact phrase instead of a stand-alone keyword, use double quotes and backslashes; example: \&quot;keyword_fields\&quot;: {     \&quot;snippet\&quot;: \&quot;\\\&quot;logitech mouse\\\&quot;\&quot;,     \&quot;main_title\&quot;: \&quot;sale\&quot; }
   * @return keywordFields
   */
  @javax.annotation.Nullable
  public Map<String, String> getKeywordFields() {
    return keywordFields;
  }

  public void setKeywordFields(Map<String, String> keywordFields) {
    this.keywordFields = keywordFields;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo pageType(List<String> pageType) {
    this.pageType = pageType;
    return this;
  }

  public ContentAnalysisRatingDistributionLiveRequestInfo addPageTypeItem(String pageTypeItem) {
    if (this.pageType == null) {
      this.pageType = new ArrayList<>();
    }
    this.pageType.add(pageTypeItem);
    return this;
  }

  /**
   * target page types optional field use this parameter to filter the dataset by page types possible values: \&quot;ecommerce\&quot;, \&quot;news\&quot;, \&quot;blogs\&quot;, \&quot;message-boards\&quot;, \&quot;organization\&quot;
   * @return pageType
   */
  @javax.annotation.Nullable
  public List<String> getPageType() {
    return pageType;
  }

  public void setPageType(List<String> pageType) {
    this.pageType = pageType;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * maximum number of elements within internal arrays optional field you can use this field to limit the number of elements within the following arrays: top_domains text_categories page_categories countries languages default value: 1 maximum value: 20
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo searchMode(String searchMode) {
    this.searchMode = searchMode;
    return this;
  }

  /**
   * results grouping type optional field possible grouping types: as_is – returns all citations for the target keyword one_per_domain – returns one citation of the keyword per domain default value: as_is
   * @return searchMode
   */
  @javax.annotation.Nullable
  public String getSearchMode() {
    return searchMode;
  }

  public void setSearchMode(String searchMode) {
    this.searchMode = searchMode;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo positiveConnotationThreshold(Float positiveConnotationThreshold) {
    this.positiveConnotationThreshold = positiveConnotationThreshold;
    return this;
  }

  /**
   * positive connotation threshold optional field specified as the probability index threshold for positive sentiment related to the citation content if you specify this field, connotation_types object in the response will only contain data on citations with positive sentiment probability more than or equal to the specified value possible values: from 0 to 1 default value: 0.4
   * @return positiveConnotationThreshold
   */
  @javax.annotation.Nullable
  public Float getPositiveConnotationThreshold() {
    return positiveConnotationThreshold;
  }

  public void setPositiveConnotationThreshold(Float positiveConnotationThreshold) {
    this.positiveConnotationThreshold = positiveConnotationThreshold;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo sentimentsConnotationThreshold(Float sentimentsConnotationThreshold) {
    this.sentimentsConnotationThreshold = sentimentsConnotationThreshold;
    return this;
  }

  /**
   * sentiment connotation threshold optional field specified as the probability index threshold for sentiment connotations related to the citation content if you specify this field, sentiment_connotations object in the response will only contain data on citations where the probability per each sentiment is more than or equal to the specified value possible values: from 0 to 1 default value: 0.4
   * @return sentimentsConnotationThreshold
   */
  @javax.annotation.Nullable
  public Float getSentimentsConnotationThreshold() {
    return sentimentsConnotationThreshold;
  }

  public void setSentimentsConnotationThreshold(Float sentimentsConnotationThreshold) {
    this.sentimentsConnotationThreshold = sentimentsConnotationThreshold;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo initialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
    return this;
  }

  public ContentAnalysisRatingDistributionLiveRequestInfo addInitialDatasetFiltersItem(Object initialDatasetFiltersItem) {
    if (this.initialDatasetFilters == null) {
      this.initialDatasetFilters = new ArrayList<>();
    }
    this.initialDatasetFilters.add(initialDatasetFiltersItem);
    return this;
  }

  /**
   * initial dataset filtering parameters optional field initial filtering parameters that apply to fields in the Search endpoint you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, like,not_like, has, has_not, match, not_match you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;domain\&quot;,\&quot;&lt;&gt;\&quot;, \&quot;logitech.com\&quot;] [[\&quot;domain\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;logitech.com\&quot;],\&quot;and\&quot;,[\&quot;content_info.connotation_types.negative\&quot;,\&quot;&gt;\&quot;,1000]] [[\&quot;domain\&quot;,\&quot;&lt;&gt;\&quot;,\&quot;logitech.com\&quot;]], \&quot;and\&quot;, [[\&quot;content_info.connotation_types.negative\&quot;,\&quot;&gt;\&quot;,1000], \&quot;or\&quot;, [\&quot;content_info.text_category\&quot;,\&quot;has\&quot;,10994]]] for more information about filters, please refer to Content Analysis API – Filters
   * @return initialDatasetFilters
   */
  @javax.annotation.Nullable
  public List<Object> getInitialDatasetFilters() {
    return initialDatasetFilters;
  }

  public void setInitialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo rankScale(String rankScale) {
    this.rankScale = rankScale;
    return this;
  }

  /**
   * defines the scale used for calculating and displaying the rank values optional field you can use this parameter to choose whether rank values are presented on a 0–100 or 0–1000 scale possible values: one_hundred — rank values are displayed on a 0–100 scale one_thousand — rank values are displayed on a 0–1000 scale default value: one_thousand learn more about how this parameter works in this Help Center article
   * @return rankScale
   */
  @javax.annotation.Nullable
  public String getRankScale() {
    return rankScale;
  }

  public void setRankScale(String rankScale) {
    this.rankScale = rankScale;
  }


  public ContentAnalysisRatingDistributionLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ContentAnalysisRatingDistributionLiveRequestInfo instance itself
   */
  public ContentAnalysisRatingDistributionLiveRequestInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    return Objects.equals(this.keyword, contentAnalysisRatingDistributionLiveRequestInfo.keyword) &&
        Objects.equals(this.keywordFields, contentAnalysisRatingDistributionLiveRequestInfo.keywordFields) &&
        Objects.equals(this.pageType, contentAnalysisRatingDistributionLiveRequestInfo.pageType) &&
        Objects.equals(this.internalListLimit, contentAnalysisRatingDistributionLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.searchMode, contentAnalysisRatingDistributionLiveRequestInfo.searchMode) &&
        Objects.equals(this.positiveConnotationThreshold, contentAnalysisRatingDistributionLiveRequestInfo.positiveConnotationThreshold) &&
        Objects.equals(this.sentimentsConnotationThreshold, contentAnalysisRatingDistributionLiveRequestInfo.sentimentsConnotationThreshold) &&
        Objects.equals(this.initialDatasetFilters, contentAnalysisRatingDistributionLiveRequestInfo.initialDatasetFilters) &&
        Objects.equals(this.rankScale, contentAnalysisRatingDistributionLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, contentAnalysisRatingDistributionLiveRequestInfo.tag)&&
        Objects.equals(this.additionalProperties, contentAnalysisRatingDistributionLiveRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, keywordFields, pageType, internalListLimit, searchMode, positiveConnotationThreshold, sentimentsConnotationThreshold, initialDatasetFilters, rankScale, tag, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
      if (jsonElement == null) {
        if (!ContentAnalysisRatingDistributionLiveRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentAnalysisRatingDistributionLiveRequestInfo is not found in the empty JSON string", ContentAnalysisRatingDistributionLiveRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("page_type") != null && !jsonObj.get("page_type").isJsonNull() && !jsonObj.get("page_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_type` to be an array in the JSON string but got `%s`", jsonObj.get("page_type").toString()));
      }
      if ((jsonObj.get("search_mode") != null && !jsonObj.get("search_mode").isJsonNull()) && !jsonObj.get("search_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_mode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("initial_dataset_filters") != null && !jsonObj.get("initial_dataset_filters").isJsonNull() && !jsonObj.get("initial_dataset_filters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_dataset_filters` to be an array in the JSON string but got `%s`", jsonObj.get("initial_dataset_filters").toString()));
      }
      if ((jsonObj.get("rank_scale") != null && !jsonObj.get("rank_scale").isJsonNull()) && !jsonObj.get("rank_scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rank_scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rank_scale").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
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

  /**
   * Create an instance of ContentAnalysisRatingDistributionLiveRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContentAnalysisRatingDistributionLiveRequestInfo
   * @throws IOException if the JSON string is invalid with respect to ContentAnalysisRatingDistributionLiveRequestInfo
   */
  public static ContentAnalysisRatingDistributionLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisRatingDistributionLiveRequestInfo.class);
  }

  /**
   * Convert an instance of ContentAnalysisRatingDistributionLiveRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

