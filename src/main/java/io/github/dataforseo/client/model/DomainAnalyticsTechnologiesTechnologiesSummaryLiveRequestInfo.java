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
   * <em>target technology paths</em><br><strong>required field if you don't specify <code>groups</code>, <code>technologies</code> and <code>categories</code></strong><br>each technology path should be specified as a separate object containing 'path' and 'name', where 'path' is specified as '$group_id.$category_id' and 'name' - as the name of the target technology; <br>each object with a technology path should be separated with a comma<br>you can find the full list of technology group ids, category ids and technology names <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br><strong>note:</strong> you can specify up to 10 technology paths in this array<br>example:<br><code>[{'path': 'content.cms','name': 'wordpress'}, {'path': 'marketing.crm','name': 'salesforce'}]</code>
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
   * <em>ids of the target technology groups</em><br><strong>required field if you don't specify <code>technologies</code>, <code>technology_paths</code>, <code>categories</code>, or <code>keywords</code></strong><br>you can find the full list of technology group ids <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br><strong>note:</strong> you can specify up to 10 technology groups in this array<br>example:<br><code>['sales', 'marketing']</code>
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
   * <em>ids of the target technology categories</em><br><strong>required field if you don't specify <code>groups</code>, <code>technology_paths</code>, <code>technologies</code>, or <code>keywords</code></strong><br>you can find the full list of technology category ids <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br><strong>note:</strong> you can specify up to 10 technology categories in this array<br>example:<br><code>['payment_processors','crm']</code>
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
   * <em>target technologies</em><br><strong>required field if you don't specify <code>groups</code>, <code>technology_paths</code>, <code>categories</code>, or <code>keywords</code></strong><br>you can find the full list of technologies you can specify here <a href='/v3/domain_analytics/technologies/technologies' target='_blank' rel='noopener noreferrer'>on this page</a><br><strong>note:</strong> you can specify up to 10 technologies in this array<br>example:<br><code>['Google Pay','Salesforce']</code>
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
   * <em>target keywords in the domain's title, description or meta keywords</em><br><strong>required field if you don't specify <code>groups</code>, <code>technology_paths</code>, <code>categories</code>, or <code>technologies</code></strong><br>you can specify the maximum of 10 keywords;<br>UTF-8 encoding;<br>example:<br><code>['seo','software']</code><p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
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

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>,<code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>you can use the following parameters to filter the results: <code>domain_rank</code>, <code>last_visited</code>, <code>country_iso_code</code>, <code>language_code</code>, <code>content_language_code</code><br>example:<br><code>[['country_iso_code','=','US'],<br>'and',<br>['domain_rank','>',800]]</code><p>for more information about filters, please refer to <a href='/v3/domain_analytics/technologies/filters' target='_blank' rel='noopener noreferrer'>Domain Analytics Technologies API - Filters</a>
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
   * <em>maximum number of elements within internal arrays</em><br>optional field<br>you can use this field to limit the number of elements within the following arrays:<br><code>countries</code>, <code>languages</code>, <code>content_languages</code>, <code>keywords</code><br>default value: <code>10</code><br>minimum value: <code>1</code><br>maximum value: <code>10000</code>
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