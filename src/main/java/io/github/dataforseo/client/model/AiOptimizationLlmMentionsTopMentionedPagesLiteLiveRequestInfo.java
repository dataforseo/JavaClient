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


public class AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private List<BaseAiOptimizationLLmMentionsTargetElement> target;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo target(List<BaseAiOptimizationLLmMentionsTargetElement> target) {
    this.target = target;
    return this;
  }

  /**
   * array of objects containing target entities
* required field
* you can specify up to 10 entities (objects) in the target field
* one target entity can contain either one domain or one keyword and related parameters
* examples:
* 
* target array with a domain entity
   * @return target
   */
  @javax.annotation.Nullable
  public List<BaseAiOptimizationLLmMentionsTargetElement> getTarget() {
    return target;
  }

  public void setTarget(List<BaseAiOptimizationLLmMentionsTargetElement> target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search location</em><br>optional field<br>if you use this field, you don't need to specify <code>location_code</code><br>if you don't specify this field, the <code>location_code</code> with <code class='long-string'>2840</code> value will be used by default;<br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages</code><br><strong>Note: <code>chat_gpt</code> data is available for <code class='long-string'>United States</code> only
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

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search location code</em><br>optional field<br>if you use this field, you don't need to specify <code>location_name</code><br>you can receive the list of available locations of the search engine with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages</code><br>default value: <code class='long-string'>2840</code><br><strong>Note: <code>chat_gpt</code> data is available for <code class='long-string'>2840</code> only
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

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search language</em><br>optional field<br>if you use this field, you don't need to specify <code>language_code</code>;<br>if you don't specify this field, the <code>language_code</code> with <code class='long-string'>en</code> value will be used by default;<br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages</code><br><strong>Note: <code>chat_gpt</code> data is available for <code class='long-string'>English</code> only
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

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search language code</em><br>optional field<br>if you use this field, you don't need to specify <code>language_name</code>;<br>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages</code><br>default value: <code class='long-string'>en</code><br><strong>Note: <code>chat_gpt</code> data is available for <code class='long-string'>en</code> only
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * <em>target platform</em><br>optional field<br>possible values:<br><code>chat_gpt</code>, <code>google</code><br>default value: <code class='long-string'>google</code><br><strong>Note:</strong> if the <code>platform</code> is not specified, the data is returned for both platforms<br><strong>Note #2:</strong><code>chat_gpt</code> data is available for the <code>United States</code> and <code>English</code> only
   * @return platform
   */
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_LINKS_SCOPE = "links_scope";
  @SerializedName(SERIALIZED_NAME_LINKS_SCOPE)
  private String linksScope;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo linksScope(String linksScope) {
    this.linksScope = linksScope;
    return this;
  }

  /**
   * <em>links source scope</em><br>optional field<br>this parameter specifies which links will be used to extract domains and aggregation data<br>possible values: <code>sources</code>, <code>search_results</code><br>default value: <code>sources</code>
   * @return linksScope
   */
  @javax.annotation.Nullable
  public String getLinksScope() {
    return linksScope;
  }

  public void setLinksScope(String linksScope) {
    this.linksScope = linksScope;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code>, <code>ilike</code>, <code>not_ilike</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['ai_search_volume','>',1000]</code><p>The full list of possible filters is available <a href='/v3/ai_optimization/llm_mentions/filters/' rel='noopener noreferrer' target='_blank'>here.</a>
   * @return filters
   */
  @javax.annotation.Nullable
  public List<Object> getFilters() {
    return filters;
  }

  public void setFilters(List<Object> filters) {
    this.filters = filters;
  }


  public static final String SERIALIZED_NAME_INITIAL_DATASET_FILTERS = "initial_dataset_filters";
  @SerializedName(SERIALIZED_NAME_INITIAL_DATASET_FILTERS)
  private List<Object> initialDatasetFilters;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo initialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
    return this;
  }

  /**
   * <em>array of filter expressions applied before aggregation</em><br>optional field<br>you can use this array to filter expressions applied to the raw mentions database before aggregation to limit the rows contributing to the result;<p><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code>, <code>ilike</code>, <code>not_ilike</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['ai_search_volume','>',1000]</code><p>the full list of possible filters is available <a href='/v3/ai_optimization/llm_mentions/filters' rel='noopener noreferrer' target='_blank'>here.</a><br>learn more about the initial dataset filters in <a href='https://dataforseo.com/help-center/what-are-the-initial-dataset-filters-and-how-do-they-work' rel='noopener noreferrer' target='_blank'>this help center article.</a>
   * @return initialDatasetFilters
   */
  @javax.annotation.Nullable
  public List<Object> getInitialDatasetFilters() {
    return initialDatasetFilters;
  }

  public void setInitialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>maximum number of results in the items array</em><br>optional field<br>you can use this parameter to limit the number of data objects you receive in the <code>items</code> array<br>minimum value: <code>1</code><br>maximum value: <code>1000</code><br>default value: <code>100</code>
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * <em>maximum number of elements within internal arrays</em><br>optional field<br>you can use this field to limit the number of elements within the following arrays:<br><code>sources_domain</code>, <code>search_results_domain</code>, <code>brand_entities_title</code>, <code>brand_entities_category</code><br>minimum value: <code>1</code><br>maximum value: <code>10</code><br>default value: <code>5</code>
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<String> orderBy;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['ai_search_volume,desc']</code><br><strong>Note:</strong> you can set no more than three sorting rules in a single request<br>you should use a comma to separate several sorting rules
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of the returned mentions data</em><br>optional field<p>default value: <code>0</code><br>example: if you specify the <code>10</code> value, the first ten mentions objects in the results array will be omitted and the data will be provided for the successive objects;<br><strong>Note:</strong> the maximum value is <code>1000000</code>
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_INCLUDE_PAGES = "include_pages";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAGES)
  private List<String> includePages;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo includePages(List<String> includePages) {
    this.includePages = includePages;
    return this;
  }

  /**
   * <em>array of page URLs to include in the response</em><br>optional field<br>if specified, only the listed pages will be returned in the <code>items</code> array<br>example:<br>`['https://dataforseo.com/apis/ai-optimization-api/llm-mentions-api', 'https://dataforseo.com/apis/ai-optimization-api']`
   * @return includePages
   */
  @javax.annotation.Nullable
  public List<String> getIncludePages() {
    return includePages;
  }

  public void setIncludePages(List<String> includePages) {
    this.includePages = includePages;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_PAGES = "exclude_pages";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PAGES)
  private List<String> excludePages;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo excludePages(List<String> excludePages) {
    this.excludePages = excludePages;
    return this;
  }

  /**
   * <em>array of page URLs to exclude from the response</em><br>optional field<br>if specified, the listed pages will be omitted from the <code>items</code> array<br>example:<br>`['https://dataforseo.com/apis/ai-optimization-api/llm-mentions-api', 'https://dataforseo.com/apis/ai-optimization-api']`
   * @return excludePages
   */
  @javax.annotation.Nullable
  public List<String> getExcludePages() {
    return excludePages;
  }

  public void setExcludePages(List<String> excludePages) {
    this.excludePages = excludePages;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo tag(String tag) {
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



  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo = (AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo) o;
    return

        Objects.equals(this.target, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.target) &&
        Objects.equals(this.locationName, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.languageCode) &&
        Objects.equals(this.platform, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.platform) &&
        Objects.equals(this.linksScope, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.linksScope) &&
        Objects.equals(this.filters, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.filters) &&
        Objects.equals(this.initialDatasetFilters, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.initialDatasetFilters) &&
        Objects.equals(this.limit, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.limit) &&
        Objects.equals(this.internalListLimit, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.orderBy, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.offset) &&
        Objects.equals(this.includePages, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.includePages) &&
        Objects.equals(this.excludePages, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.excludePages) &&
        Objects.equals(this.tag, aiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, locationName, locationCode, languageName, languageCode, platform, linksScope, filters, initialDatasetFilters, limit, internalListLimit, orderBy, offset, includePages, excludePages, tag);
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
    sb.append("class AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    linksScope: ").append(toIndentedString(linksScope)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    initialDatasetFilters: ").append(toIndentedString(initialDatasetFilters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    includePages: ").append(toIndentedString(includePages)).append("\n");
    sb.append("    excludePages: ").append(toIndentedString(excludePages)).append("\n");
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
    
    openapiFields.add("target");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("platform");
    
    openapiFields.add("links_scope");
    
    openapiFields.add("filters");
    
    openapiFields.add("initial_dataset_filters");
    
    openapiFields.add("limit");
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("order_by");
    
    openapiFields.add("offset");
    
    openapiFields.add("include_pages");
    
    openapiFields.add("exclude_pages");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo value) throws IOException {
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
           public AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}