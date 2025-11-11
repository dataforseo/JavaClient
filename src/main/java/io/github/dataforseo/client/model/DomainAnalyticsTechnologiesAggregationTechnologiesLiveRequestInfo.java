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
   * id of the target technology group
* required field if you don’t specify technology, category or keyword
* at least one field (group, category, keyword, technology) must be set
* you can find the full list of technology group ids on this page
* example:
* 'marketing'
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
   * id of the target technology category
* required field if you don’t specify group, keyword or technology
* at least one field (group, category, keyword, technology) must be set
* you can find the full list of technology category ids on this page
* example:
* 'crm'
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
   * target technology
* required field if you don’t specify group, keyword or category
* at least one field (group, category, keyword, technology) must be set
* you can find the full list of technologies on this page
* example:
* 'Salesforce'
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
   * target keyword in the domain’s meta keywords
* required field if you don’t specify group, category or technology
* at least one field (group, category, keyword, technology) must be set
* UTF-8 encoding
* example:
* 'seo'learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
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
   * search mode
* optional field
* possible search mode types:
* as_is – search for results exactly matching the specified group ids, category ids, or technology names
* entry – search for results matching a part of the specified group ids, category ids, or technology names
* default value: as_is
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
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* <, <=, >, >=, =, <>, in, not_in, like,not_like
* you can use the % operator with like and not_like to match any string of zero or more characters
* you can use the following parameters to filter the results: domain_rank, last_visited, country_iso_code, language_code, content_language_code
* Note: all filtering parameters are taken from the domain_technology_item of the domain_technologies endpoint;
* example:
* [['country_iso_code','=','US'],
* 'and',
* ['domain_rank','>',800]]for more information about filters, please refer to Domain Analytics Technologies API – Filters
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
   * results sorting rules
* optional field
* you can use the following values to sort the results: groups_count, categories_count, technologies_count
* possible sorting types:
* asc – results will be sorted in the ascending order
* desc – results will be sorted in the descending order
* you should use a comma to set up a sorting type
* example:
* ['groups_count,desc']
* note that you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['groups_count,desc','technologies_count,desc']
* default value:
* ['groups_count,desc','categories_count,desc','technologies_count,desc']
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
   * maximum number of returned technology groups
* optional field
* you can use this field to limit the number of items with identical 'group' in the results
* default value: 5
* minimum value: 1
* maximum value: 10000
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
   * maximum number of returned technology categories within the same group
* optional field
* you can use this field to limit the number of items with identical 'category' in the results
* default value: 5
* minimum value: 1
* maximum value: 10000
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
   * maximum number of returned technologies within the same category
* optional field
* you can use this field to limit the number of items with identical 'technology' in the results
* default value: 10
* minimum value: 1
* maximum value: 10000
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
   * maximum number of items with identical 'category', 'group', and 'technology'
* optional field
* if you use this field, the values specified in internal_groups_list_limit, internal_categories_list_limit and internal_technologies_list_limit will be ignored;
* you can use this field to limit the number of items with identical 'category', 'group', or 'technology'
* default value: 10
* minimum value: 1
* maximum value: 10000
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
   * the maximum number of returned technologies
* optional field
* default value: 100
* maximum value: 10000
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
   * offset in the results array of returned domains
* optional field
* default value: 0
* maximum value: 9999
* if you specify the 10 value, the first ten technologies in the results array will be omitted and the data will be provided for the successive technologies
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