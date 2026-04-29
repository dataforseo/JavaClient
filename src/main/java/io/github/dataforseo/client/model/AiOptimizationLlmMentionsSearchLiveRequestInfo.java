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



public class AiOptimizationLlmMentionsSearchLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private List<BaseAiOptimizationLLmMentionsTargetElement> target;

  public AiOptimizationLlmMentionsSearchLiveRequestInfo target(List<BaseAiOptimizationLLmMentionsTargetElement> target) {
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search locationoptional fieldif you use this field, you don't need to specify location_codeif you don't specify this field, the location_code with 2840 value will be used by default;you can receive the list of available locations of the search engine with their location_name by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languagesNote: chat_gpt data is available for United States only
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search location codeoptional fieldif you use this field, you don't need to specify location_nameyou can receive the list of available locations of the search engine with their location_code by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languagesdefault value: 2840Note: chat_gpt data is available for 2840 only
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search languageoptional fieldif you use this field, you don't need to specify language_code;if you don't specify this field, the language_code with en value will be used by default;you can receive the list of available languages of the search engine with their language_name by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languagesNote: chat_gpt data is available for English only
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search language codeoptional fieldif you use this field, you don't need to specify language_name;you can receive the list of available languages of the search engine with their language_code_by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/llm_mentions/locations_and_languagesdefault value: enNote: chat_gpt data is available for en onlyn
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * target platformoptional fieldpossible values:chat_gpt, googledefault value: googleNote: the data returned depends on the selected platformNote #2:chat_gpt data is available for the United States and English only
   * @return platform
   */
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public AiOptimizationLlmMentionsSearchLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * array of results filtering parametersoptional fieldyou can add several filters at once (8 filters maximum)you should set a logical operator and, or between the conditionsthe following operators are supported:=, <>, in, not_in, like, not_like, ilike, not_ilike, match, not_matchyou can use the % operator with like and not_like to match any string of zero or more charactersexample:['ai_search_volume','>','1000']The full list of possible filters is available here.
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * results sorting rulesoptional fieldyou can use the same values as in the filters array to sort the resultspossible sorting types:asc - results will be sorted in the ascending orderdesc - results will be sorted in the descending orderyou should use a comma to set up a sorting typeexample:['ai_search_volume,desc']note that you can set no more than three sorting rules in a single requestyou should use a comma to separate several sorting rules
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

  public AiOptimizationLlmMentionsSearchLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of the returned mentions dataoptional fielddefault value: 0example: if you specify the 10 value, the first ten mentions objects in the results array will be omitted and the data will be provided for the successive objects;Note: the maximum value is 9,000, use the search_after_token if you would like to offset more results
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_SEARCH_AFTER_TOKEN = "search_after_token";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFTER_TOKEN)
  private String searchAfterToken;

  public AiOptimizationLlmMentionsSearchLiveRequestInfo searchAfterToken(String searchAfterToken) {
    this.searchAfterToken = searchAfterToken;
    return this;
  }

  /**
   * token for subsequent requestsoptional fieldprovided in the identical filed of the response to each request;use this parameter to avoid timeouts while trying to obtain over 20,000 results in a single request;by specifying the unique search_after_token value from the response array, you will get the subsequent results of the initial task;search_after_token values are unique for each subsequent task ;Note: if the search_after_token is specified in the request, all other parameters should be identical to the previous request
   * @return searchAfterToken
   */
  @javax.annotation.Nullable
  public String getSearchAfterToken() {
    return searchAfterToken;
  }

  public void setSearchAfterToken(String searchAfterToken) {
    this.searchAfterToken = searchAfterToken;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public AiOptimizationLlmMentionsSearchLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of returned objectsoptional fielddefault value: 100maximum value: 1000
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationLlmMentionsSearchLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifieroptional fieldthe character limit is 255you can use this parameter to identify the task and match it with the resultyou will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  public AiOptimizationLlmMentionsSearchLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsSearchLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsSearchLiveRequestInfo aiOptimizationLlmMentionsSearchLiveRequestInfo = (AiOptimizationLlmMentionsSearchLiveRequestInfo) o;
    return

        Objects.equals(this.target, aiOptimizationLlmMentionsSearchLiveRequestInfo.target) &&
        Objects.equals(this.locationName, aiOptimizationLlmMentionsSearchLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, aiOptimizationLlmMentionsSearchLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, aiOptimizationLlmMentionsSearchLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, aiOptimizationLlmMentionsSearchLiveRequestInfo.languageCode) &&
        Objects.equals(this.platform, aiOptimizationLlmMentionsSearchLiveRequestInfo.platform) &&
        Objects.equals(this.filters, aiOptimizationLlmMentionsSearchLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, aiOptimizationLlmMentionsSearchLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, aiOptimizationLlmMentionsSearchLiveRequestInfo.offset) &&
        Objects.equals(this.searchAfterToken, aiOptimizationLlmMentionsSearchLiveRequestInfo.searchAfterToken) &&
        Objects.equals(this.limit, aiOptimizationLlmMentionsSearchLiveRequestInfo.limit) &&
        Objects.equals(this.tag, aiOptimizationLlmMentionsSearchLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, locationName, locationCode, languageName, languageCode, platform, filters, orderBy, offset, searchAfterToken, limit, tag);
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
    sb.append("class AiOptimizationLlmMentionsSearchLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    searchAfterToken: ").append(toIndentedString(searchAfterToken)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("offset");
    
    openapiFields.add("search_after_token");
    
    openapiFields.add("limit");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsSearchLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsSearchLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsSearchLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsSearchLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsSearchLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsSearchLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsSearchLiveRequestInfo value) throws IOException {
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
           public AiOptimizationLlmMentionsSearchLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsSearchLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsSearchLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsSearchLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}