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



public class DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TECHNOLOGY_PATHS = "technology_paths";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY_PATHS)
  private List<String> technologyPaths;

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo technologyPaths(List<String> technologyPaths) {
    this.technologyPaths = technologyPaths;
    return this;
  }

  /**
   * target technology paths
* required field if you don’t specify groups, technologies and categories
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * ids of the target technology groups
* required field if you don’t specify technologies, technology_paths, categories, or keywords
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * ids of the target technology categories
* required field if you don’t specify groups, technology_paths, technologies, or keywords
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo technologies(List<String> technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * target technologies
* required field if you don’t specify groups, technology_paths, categories, or keywords
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * target keywords in the domain’s title, description or meta keywords
* required field if you don’t specify groups, technology_paths, categories, or technologies
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo mode(String mode) {
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo filters(List<Object> filters) {
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
* example:
* [['country_iso_code','=','US'],
* 'and',
* ['domain_rank','>',800]]
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


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * maximum number of elements within internal arrays
* optional field
* you can use this field to limit the number of elements within the following arrays:
* countries, languages, content_languages, keywords
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


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo tag(String tag) {
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



  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo = (DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo) o;
    return

        Objects.equals(this.technologyPaths, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.technologyPaths) &&
        Objects.equals(this.groups, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.groups) &&
        Objects.equals(this.categories, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.categories) &&
        Objects.equals(this.technologies, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.technologies) &&
        Objects.equals(this.keywords, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.keywords) &&
        Objects.equals(this.mode, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.mode) &&
        Objects.equals(this.filters, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.filters) &&
        Objects.equals(this.internalListLimit, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.tag, domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(technologyPaths, groups, categories, technologies, keywords, mode, filters, internalListLimit, tag);
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
    sb.append("class DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo {\n");

    sb.append("    technologyPaths: ").append(toIndentedString(technologyPaths)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    
    openapiFields.add("technology_paths");
    
    openapiFields.add("groups");
    
    openapiFields.add("categories");
    
    openapiFields.add("technologies");
    
    openapiFields.add("keywords");
    
    openapiFields.add("mode");
    
    openapiFields.add("filters");
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo value) throws IOException {
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
           public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}