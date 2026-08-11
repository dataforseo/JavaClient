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


public class DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo  {


  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo group(String group) {
    this.group = group;
    return this;
  }

  /**
   * <em>id of the target technology group</em><br><strong>required field if you don't specify <code>technology</code>, <code>category</code> or <code>keyword</code></strong><br>at least one field (<code>group</code>, <code>category</code>, <code>keyword</code>, <code>technology</code>) must be set<br>you can find the full list of technology group ids <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br>example:<br><code>'marketing'</code>
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <em>id of the target technology category</em><br><strong>required field if you don't specify <code>group</code>, <code>keyword</code> or <code>technology</code></strong><br>at least one field (<code>group</code>, <code>category</code>, <code>keyword</code>, <code>technology</code>) must be set<br>you can find the full list of technology category ids <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br>example:<br><code>'crm'</code>
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGY = "technology";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY)
  private String technology;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo technology(String technology) {
    this.technology = technology;
    return this;
  }

  /**
   * <em>target technology</em><br><strong>required field if you don't specify <code>group</code>, <code>keyword</code> or <code>category</code></strong><br>at least one field (<code>group</code>, <code>category</code>, <code>keyword</code>, <code>technology</code>) must be set<br>you can find the full list of technologies <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br>example:<br><code>'Salesforce'</code>
   * @return technology
   */
  @javax.annotation.Nullable
  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <em>target keyword in the domain's meta keywords</em><br><strong>required field if you don't specify <code>group</code>, <code>category</code> or <code>technology</code></strong><br>at least one field (<code>group</code>, <code>category</code>, <code>keyword</code>, <code>technology</code>) must be set<br>UTF-8 encoding<br>example:<br><code>'seo'</code>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' target='_blank' rel='noopener noreferrer'>Help Center article</a>
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * <em>search mode</em><br>optional field<br>possible search mode types:<br><code>as_is</code> - search for results exactly matching the specified group ids, category ids, or technology names<br><code>entry</code> - search for results matching a part of the specified group ids, category ids, or technology names<br>default value: <code>as_is</code>
   * @return mode
   */
  @javax.annotation.Nullable
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>,<code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>you can use the following parameters to filter the results: <code>domain_rank</code>, <code>last_visited</code>, <code>country_iso_code</code>, <code>language_code</code>, <code>content_language_code</code><br><strong>Note:</strong> all filtering parameters are taken from the <code>domain_technology_item</code> of the <a href='/v3/domain_analytics/technologies/filters' target='_blank' rel='noopener noreferrer'>domain_technologies</a> endpoint;<br>example:<br><code>[['country_iso_code','=','US'],<br>'and',<br>['domain_rank','>',800]]</code>for more information about filters, please refer to <a href='/v3/domain_analytics/technologies/filters' target='_blank' rel='noopener noreferrer'>Domain Analytics Technologies API - Filters</a>
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

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the following values to sort the results: <code>groups_count</code>, <code>categories_count</code>, <code>technologies_count</code><br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['groups_count,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['groups_count,desc','technologies_count,desc']</code><br>default value:<br><code>['groups_count,desc','categories_count,desc','technologies_count,desc']</code>
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_INTERNAL_GROUPS_LIST_LIMIT = "internal_groups_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_GROUPS_LIST_LIMIT)
  private Integer internalGroupsListLimit;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo internalGroupsListLimit(Integer internalGroupsListLimit) {
    this.internalGroupsListLimit = internalGroupsListLimit;
    return this;
  }

  /**
   * <em>maximum number of returned technology groups</em><br>optional field<br>you can use this field to limit the number of items with identical <code>'group'</code> in the results<br>default value: <code>5</code><br>minimum value: <code>1</code><br>maximum value: <code>10000</code>
   * @return internalGroupsListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalGroupsListLimit() {
    return internalGroupsListLimit;
  }

  public void setInternalGroupsListLimit(Integer internalGroupsListLimit) {
    this.internalGroupsListLimit = internalGroupsListLimit;
  }


  public static final String SERIALIZED_NAME_INTERNAL_CATEGORIES_LIST_LIMIT = "internal_categories_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_CATEGORIES_LIST_LIMIT)
  private Integer internalCategoriesListLimit;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo internalCategoriesListLimit(Integer internalCategoriesListLimit) {
    this.internalCategoriesListLimit = internalCategoriesListLimit;
    return this;
  }

  /**
   * <em>maximum number of returned technology categories within the same group</em><br>optional field<br>you can use this field to limit the number of items with identical <code>'category'</code> in the results<br>default value: <code>5</code><br>minimum value: <code>1</code><br>maximum value: <code>10000</code>
   * @return internalCategoriesListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalCategoriesListLimit() {
    return internalCategoriesListLimit;
  }

  public void setInternalCategoriesListLimit(Integer internalCategoriesListLimit) {
    this.internalCategoriesListLimit = internalCategoriesListLimit;
  }


  public static final String SERIALIZED_NAME_INTERNAL_TECHNOLOGIES_LIST_LIMIT = "internal_technologies_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_TECHNOLOGIES_LIST_LIMIT)
  private Integer internalTechnologiesListLimit;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo internalTechnologiesListLimit(Integer internalTechnologiesListLimit) {
    this.internalTechnologiesListLimit = internalTechnologiesListLimit;
    return this;
  }

  /**
   * <em>maximum number of returned technologies within the same category</em><br>optional field<br>you can use this field to limit the number of items with identical <code>'technology'</code> in the results<br>default value: <code>10</code><br>minimum value: <code>1</code><br>maximum value: <code>10000</code>
   * @return internalTechnologiesListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalTechnologiesListLimit() {
    return internalTechnologiesListLimit;
  }

  public void setInternalTechnologiesListLimit(Integer internalTechnologiesListLimit) {
    this.internalTechnologiesListLimit = internalTechnologiesListLimit;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * <em>maximum number of items with identical <code>'category'</code>, <code>'group'</code>, and <code>'technology'</code></em><br>optional field<br>if you use this field, the values specified in <code>internal_groups_list_limit</code>, <code>internal_categories_list_limit</code> and <code>internal_technologies_list_limit</code> will be ignored;<br>you can use this field to limit the number of items with identical <code>'category'</code>, <code>'group'</code>, or <code>'technology'</code><br>default value: <code>10</code><br>minimum value: <code>1</code><br>maximum value: <code>10000</code>
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned technologies</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>10000</code>
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

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned domains</em><br>optional field<br>default value: <code>0</code><br>maximum value: <code>9999</code><br>if you specify the <code>10</code> value, the first ten technologies in the results array will be omitted and the data will be provided for the successive technologies
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

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo tag(String tag) {
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



  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo = (DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo) o;
    return

        Objects.equals(this.group, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.group) &&
        Objects.equals(this.category, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.category) &&
        Objects.equals(this.technology, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.technology) &&
        Objects.equals(this.keyword, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.keyword) &&
        Objects.equals(this.mode, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.mode) &&
        Objects.equals(this.filters, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.orderBy) &&
        Objects.equals(this.internalGroupsListLimit, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.internalGroupsListLimit) &&
        Objects.equals(this.internalCategoriesListLimit, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.internalCategoriesListLimit) &&
        Objects.equals(this.internalTechnologiesListLimit, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.internalTechnologiesListLimit) &&
        Objects.equals(this.internalListLimit, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.limit, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.limit) &&
        Objects.equals(this.offset, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.offset) &&
        Objects.equals(this.tag, domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(group, category, technology, keyword, mode, filters, orderBy, internalGroupsListLimit, internalCategoriesListLimit, internalTechnologiesListLimit, internalListLimit, limit, offset, tag);
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
    sb.append("class DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo {\n");

    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    internalGroupsListLimit: ").append(toIndentedString(internalGroupsListLimit)).append("\n");
    sb.append("    internalCategoriesListLimit: ").append(toIndentedString(internalCategoriesListLimit)).append("\n");
    sb.append("    internalTechnologiesListLimit: ").append(toIndentedString(internalTechnologiesListLimit)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
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
    
    openapiFields.add("group");
    
    openapiFields.add("category");
    
    openapiFields.add("technology");
    
    openapiFields.add("keyword");
    
    openapiFields.add("mode");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("internal_groups_list_limit");
    
    openapiFields.add("internal_categories_list_limit");
    
    openapiFields.add("internal_technologies_list_limit");
    
    openapiFields.add("internal_list_limit");
    
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
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo value) throws IOException {
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
           public DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}