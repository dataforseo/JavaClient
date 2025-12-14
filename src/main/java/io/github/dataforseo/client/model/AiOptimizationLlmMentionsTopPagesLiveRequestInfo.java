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



public class AiOptimizationLlmMentionsTopPagesLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private List<BaseAiOptimizationLLmMentionsTargetElement> target;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo target(List<BaseAiOptimizationLLmMentionsTargetElement> target) {
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


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * target domain
* required field if you don’t specify keyword
* a domain should be specified without https:// and www.
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_SEARCH_FILTER = "search_filter";
  @SerializedName(SERIALIZED_NAME_SEARCH_FILTER)
  private String searchFilter;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo searchFilter(String searchFilter) {
    this.searchFilter = searchFilter;
    return this;
  }

  /**
   * target keyword search filter
* optional field
* possible values:
* include, exclude
* default value: include
   * @return searchFilter
   */
  @javax.annotation.Nullable
  public String getSearchFilter() {
    return searchFilter;
  }

  public void setSearchFilter(String searchFilter) {
    this.searchFilter = searchFilter;
  }


  public static final String SERIALIZED_NAME_SEARCH_SCOPE = "search_scope";
  @SerializedName(SERIALIZED_NAME_SEARCH_SCOPE)
  private List<String> searchScope;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo searchScope(List<String> searchScope) {
    this.searchScope = searchScope;
    return this;
  }

  /**
   * target keyword search scope
* optional field
* possible values:
* any, question, answer, brand_entities, fan_out_queries
* default value: any
   * @return searchScope
   */
  @javax.annotation.Nullable
  public List<String> getSearchScope() {
    return searchScope;
  }

  public void setSearchScope(List<String> searchScope) {
    this.searchScope = searchScope;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * indicates if the subdomains of the target domain will be included in the search
* optional field
* if set to true, the subdomains will be included in the search
* default value: false
   * @return includeSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSubdomains() {
    return includeSubdomains;
  }

  public void setIncludeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
  }


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * target keyword
* required field if you don’t specify domain
* you can specify up to 2000 characters in the keyword field
* all %## will be decoded (plus character ‘+’ will be decoded to a space character)
* if you need to use the “%” character for your keyword, please specify it as “%25”;
* if you need to use the “+” character for your keyword, please specify it as “%2B”
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


  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private String matchType;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * target keyword match type
* optional field
* possible values:
* word_match, partial_match
* word_match – full-text search for terms that match the specified seed keyword with additional words included before, after, or within the seed key phrase.
* partial_match – searches for any occurrence of the keyword or its parts within the content
* default value: word_match
   * @return matchType
   */
  @javax.annotation.Nullable
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search location
* optional field
* if you use this field, you don’t need to specify location_code
* if you don’t specify this field, the location_code with 2840 value will be used by default;
* you can receive the list of available locations of the search engine with their location_name by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages
* Note: chat_gpt data is available for United States only
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

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search location code
* optional field
* if you use this field, you don’t need to specify location_name
* you can receive the list of available locations of the search engine with their location_code by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages
* default value: 2840
* Note: chat_gpt data is available for 2840 only
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

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search language
* optional field
* if you use this field, you don’t need to specify language_code;
* if you don’t specify this field, the language_code with en value will be used by default;
* you can receive the list of available languages of the search engine with their language_name by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages
* Note: chat_gpt data is available for English only
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

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search language code
* optional field
* if you use this field, you don’t need to specify language_name;
* you can receive the list of available languages of the search engine with their language_code by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languages
* default value: en
* Note: chat_gpt data is available for en only
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

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * target platform
* optional field
* possible values:
* chat_gpt, google
* default value: google
* Note:chat_gpt data is available for the United States and English only
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

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo linksScope(String linksScope) {
    this.linksScope = linksScope;
    return this;
  }

  /**
   * links source scope
* optional field
* this parameter specifies which links will be used to extract pages and aggregation data
* possible values: sources, search_results
* default value: sources
   * @return linksScope
   */
  @javax.annotation.Nullable
  public String getLinksScope() {
    return linksScope;
  }

  public void setLinksScope(String linksScope) {
    this.linksScope = linksScope;
  }


  public static final String SERIALIZED_NAME_INITIAL_DATASET_FILTERS = "initial_dataset_filters";
  @SerializedName(SERIALIZED_NAME_INITIAL_DATASET_FILTERS)
  private List<Object> initialDatasetFilters;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo initialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
    return this;
  }

  /**
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* =, <>, in, not_in, like, not_like, ilike, not_ilike, match, not_match
* you can use the % operator with like and not_like to match any string of zero or more characters
* example:
* ['ai_search_volume','>','1000']
* The full list of possible filters is available here.
   * @return initialDatasetFilters
   */
  @javax.annotation.Nullable
  public List<Object> getInitialDatasetFilters() {
    return initialDatasetFilters;
  }

  public void setInitialDatasetFilters(List<Object> initialDatasetFilters) {
    this.initialDatasetFilters = initialDatasetFilters;
  }


  public static final String SERIALIZED_NAME_ITEMS_LIST_LIMIT = "items_list_limit";
  @SerializedName(SERIALIZED_NAME_ITEMS_LIST_LIMIT)
  private Integer itemsListLimit;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo itemsListLimit(Integer itemsListLimit) {
    this.itemsListLimit = itemsListLimit;
    return this;
  }

  /**
   * maximum number of results in the items array
* optional field
* you can use this parameter to limit the number of data objects you receive in the items array
* minimum value: 1
* maximum value: 10
* default value: 5
   * @return itemsListLimit
   */
  @javax.annotation.Nullable
  public Integer getItemsListLimit() {
    return itemsListLimit;
  }

  public void setItemsListLimit(Integer itemsListLimit) {
    this.itemsListLimit = itemsListLimit;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * maximum number of elements within internal arrays
* optional field
* you can use this field to limit the number of elements within the following arrays:
* sources_domain
* search_results_domain
* minimum value: 1
* maximum value: 10
* default value: 5
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo tag(String tag) {
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



  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsTopPagesLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsTopPagesLiveRequestInfo aiOptimizationLlmMentionsTopPagesLiveRequestInfo = (AiOptimizationLlmMentionsTopPagesLiveRequestInfo) o;
    return

        Objects.equals(this.target, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.target) &&
        Objects.equals(this.domain, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.domain) &&
        Objects.equals(this.searchFilter, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.searchFilter) &&
        Objects.equals(this.searchScope, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.searchScope) &&
        Objects.equals(this.includeSubdomains, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.keyword, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.keyword) &&
        Objects.equals(this.matchType, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.matchType) &&
        Objects.equals(this.locationName, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.languageCode) &&
        Objects.equals(this.platform, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.platform) &&
        Objects.equals(this.linksScope, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.linksScope) &&
        Objects.equals(this.initialDatasetFilters, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.initialDatasetFilters) &&
        Objects.equals(this.itemsListLimit, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.itemsListLimit) &&
        Objects.equals(this.internalListLimit, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.tag, aiOptimizationLlmMentionsTopPagesLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, domain, searchFilter, searchScope, includeSubdomains, keyword, matchType, locationName, locationCode, languageName, languageCode, platform, linksScope, initialDatasetFilters, itemsListLimit, internalListLimit, tag);
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
    sb.append("class AiOptimizationLlmMentionsTopPagesLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    searchFilter: ").append(toIndentedString(searchFilter)).append("\n");
    sb.append("    searchScope: ").append(toIndentedString(searchScope)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    linksScope: ").append(toIndentedString(linksScope)).append("\n");
    sb.append("    initialDatasetFilters: ").append(toIndentedString(initialDatasetFilters)).append("\n");
    sb.append("    itemsListLimit: ").append(toIndentedString(itemsListLimit)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
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
    
    openapiFields.add("domain");
    
    openapiFields.add("search_filter");
    
    openapiFields.add("search_scope");
    
    openapiFields.add("include_subdomains");
    
    openapiFields.add("keyword");
    
    openapiFields.add("match_type");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("platform");
    
    openapiFields.add("links_scope");
    
    openapiFields.add("initial_dataset_filters");
    
    openapiFields.add("items_list_limit");
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsTopPagesLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsTopPagesLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsTopPagesLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsTopPagesLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsTopPagesLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsTopPagesLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsTopPagesLiveRequestInfo value) throws IOException {
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
           public AiOptimizationLlmMentionsTopPagesLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsTopPagesLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsTopPagesLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsTopPagesLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}