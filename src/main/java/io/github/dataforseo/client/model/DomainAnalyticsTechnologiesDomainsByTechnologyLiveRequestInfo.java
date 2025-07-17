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



public class DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TECHNOLOGY_PATHS = "technology_paths";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY_PATHS)
  private List<String> technologyPaths;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo technologyPaths(List<String> technologyPaths) {
    this.technologyPaths = technologyPaths;
    return this;
  }

  /**
   * target technology paths
* required field if you don’t specify groups, technologies, keywords or categories
* at least one field (technology_paths, groups, technologies, keywords or categories) must be set;
* each technology path should be specified as a separate object containing “path” and “name”, where “path” is specified as “$group_id.$category_id” and “name” – as the name of the target technology;
* each object with a technology path should be separated with a comma
* you can find the full list of technology group ids, category ids and technology names on this page
* note: you can specify up to 10 technology paths in this array
* example:
* [{'path': 'content.cms','name': 'wordpress'}, {'path': 'marketing.crm','name': 'salesforce'}]
   * @return technologyPaths
   */
  @javax.annotation.Nullable
  public List<String> getTechnologyPaths() {
    return technologyPaths;
  }

  public void setTechnologyPaths(List<String> technologyPaths) {
    this.technologyPaths = technologyPaths;
  }


  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * ids of the target technology groups
* required field if you don’t specify technologies, technology_paths, keywords or categories
* you can find the full list of technology group ids on this page
* note: you can specify up to 10 technology groups in this array
* example:
* ['sales', 'marketing']
   * @return groups
   */
  @javax.annotation.Nullable
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * ids of the target technology categories
* required field if you don’t specify groups, technology_paths, keywords or technologies
* you can find the full list of technology category ids on this page
* note: you can specify up to 10 technology categories in this array
* example:
* ['payment_processors','crm']
   * @return categories
   */
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private List<String> technologies;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo technologies(List<String> technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * target technologies
* required field if you don’t specify groups, technology_paths, keywords or categories
* you can find the full list of technologies you can specify here on this page
* note: you can specify up to 10 technologies in this array
* example:
* ['Google Pay','Salesforce']
   * @return technologies
   */
  @javax.annotation.Nullable
  public List<String> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(List<String> technologies) {
    this.technologies = technologies;
  }


  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * target keywords in the domain’s title, description or meta keywords
* required field if you don’t specify groups, technology_paths, technologies or categories
* optional field
* you can specify the maximum of 10 keywords;
* UTF-8 encoding;
* example:
* ['seo','software']
* learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
   * @return keywords
   */
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo mode(String mode) {
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

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* <, <=, >, >=, =, <>, in, not_in, like, not_like
* you can use the % operator with like and not_like to match any string of zero or more characters
* example:
* ['country_iso_code','=','US']
* [['country_iso_code','=','US'],
* 'and',
* ['domain_rank','>',100]]
* [['domain_rank','>',100],
* 'and',
* [['country_iso_code','=','US'],'or',['country_iso_code','=','CA']]]
* for more information about filters, please refer to Domain Analytics Technologies API – Filters
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

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * results sorting rules
* optional field
* available fields:
* domain_rank, domain, last_visited, country_iso_code, language_code, content_language_code
* possible sorting types:
* asc – results will be sorted in the ascending order
* desc – results will be sorted in the descending order
* you should use a comma to set up a sorting type
* example:
* ['last_visited,desc']
* default rule:
* ['domain_rank,desc']
* note that you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['last_visited,desc','domain_rank,desc']
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

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of returned domains
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

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned domains
* optional field
* default value: 0
* if you specify the 10 value, the first ten domains in the results array will be omitted and the data will be provided for the successive domains;
* Note: the maximum value is 9999, the sum of limit and offset must not exceed 10000;
* use the offset_token if you would like to offset more results
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_OFFSET_TOKEN = "offset_token";
  @SerializedName(SERIALIZED_NAME_OFFSET_TOKEN)
  private String offsetToken;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo offsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
    return this;
  }

  /**
   * token for subsequent requests
* optional field
* provided in the identical filed of the response to each request;
* use this parameter to avoid timeouts while trying to obtain over 100,000 results in a single request;
* by specifying the unique offset_token value from the response array, you will get the subsequent results of the initial task;
* offset_token values are unique for each subsequent task
* Note: if the offset_token is specified in the request, all other parameters should be identical to the previous request
   * @return offsetToken
   */
  @javax.annotation.Nullable
  public String getOffsetToken() {
    return offsetToken;
  }

  public void setOffsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
  }



  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo = (DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo) o;
    return

        Objects.equals(this.technologyPaths, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.technologyPaths) &&
        Objects.equals(this.groups, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.groups) &&
        Objects.equals(this.categories, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.categories) &&
        Objects.equals(this.technologies, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.technologies) &&
        Objects.equals(this.keywords, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.keywords) &&
        Objects.equals(this.mode, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.mode) &&
        Objects.equals(this.filters, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.orderBy) &&
        Objects.equals(this.limit, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.limit) &&
        Objects.equals(this.offset, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.offset) &&
        Objects.equals(this.offsetToken, domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.offsetToken);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(technologyPaths, groups, categories, technologies, keywords, mode, filters, orderBy, limit, offset, offsetToken);
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
    sb.append("class DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo {\n");

    sb.append("    technologyPaths: ").append(toIndentedString(technologyPaths)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    offsetToken: ").append(toIndentedString(offsetToken)).append("\n");
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
    
    openapiFields.add("technology_paths");
    
    openapiFields.add("groups");
    
    openapiFields.add("categories");
    
    openapiFields.add("technologies");
    
    openapiFields.add("keywords");
    
    openapiFields.add("mode");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("offset_token");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo value) throws IOException {
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
           public DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}