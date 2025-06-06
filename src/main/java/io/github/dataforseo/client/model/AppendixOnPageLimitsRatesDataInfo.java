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
import io.github.dataforseo.client.model.AppendixInfo;
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

/**
 * AppendixOnPageLimitsRatesDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixOnPageLimitsRatesDataInfo {
  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private Double taskPost;

  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private Double summary;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Double resources;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Double pages;

  public static final String SERIALIZED_NAME_NON_INDEXABLE = "non_indexable";
  @SerializedName(SERIALIZED_NAME_NON_INDEXABLE)
  private Double nonIndexable;

  public static final String SERIALIZED_NAME_DUPLICATE_TAGS = "duplicate_tags";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_TAGS)
  private Double duplicateTags;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Double links;

  public static final String SERIALIZED_NAME_WATERFALL = "waterfall";
  @SerializedName(SERIALIZED_NAME_WATERFALL)
  private Double waterfall;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public static final String SERIALIZED_NAME_PAGES_BY_RESOURCE = "pages_by_resource";
  @SerializedName(SERIALIZED_NAME_PAGES_BY_RESOURCE)
  private Double pagesByResource;

  public static final String SERIALIZED_NAME_DUPLICATE_CONTENT = "duplicate_content";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_CONTENT)
  private Double duplicateContent;

  public static final String SERIALIZED_NAME_RAW_HTML = "raw_html";
  @SerializedName(SERIALIZED_NAME_RAW_HTML)
  private Double rawHtml;

  public static final String SERIALIZED_NAME_INSTANT_PAGES = "instant_pages";
  @SerializedName(SERIALIZED_NAME_INSTANT_PAGES)
  private Double instantPages;

  public static final String SERIALIZED_NAME_REDIRECT_CHAINS = "redirect_chains";
  @SerializedName(SERIALIZED_NAME_REDIRECT_CHAINS)
  private Double redirectChains;

  public static final String SERIALIZED_NAME_LIGHTHOUSE = "lighthouse";
  @SerializedName(SERIALIZED_NAME_LIGHTHOUSE)
  private AppendixInfo lighthouse;

  public static final String SERIALIZED_NAME_KEYWORD_DENSITY = "keyword_density";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DENSITY)
  private Double keywordDensity;

  public static final String SERIALIZED_NAME_PAGE_SCREENSHOT = "page_screenshot";
  @SerializedName(SERIALIZED_NAME_PAGE_SCREENSHOT)
  private Double pageScreenshot;

  public static final String SERIALIZED_NAME_CONTENT_PARSING = "content_parsing";
  @SerializedName(SERIALIZED_NAME_CONTENT_PARSING)
  private Double contentParsing;

  public static final String SERIALIZED_NAME_CONTENT_PARSING_LIVE = "content_parsing_live";
  @SerializedName(SERIALIZED_NAME_CONTENT_PARSING_LIVE)
  private Double contentParsingLive;

  public AppendixOnPageLimitsRatesDataInfo() {
  }

  public AppendixOnPageLimitsRatesDataInfo taskPost(Double taskPost) {
    this.taskPost = taskPost;
    return this;
  }

  /**
   * Get taskPost
   * @return taskPost
   */
  @javax.annotation.Nullable
  public Double getTaskPost() {
    return taskPost;
  }

  public void setTaskPost(Double taskPost) {
    this.taskPost = taskPost;
  }


  public AppendixOnPageLimitsRatesDataInfo tasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * Get tasksReady
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public Double getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
  }


  public AppendixOnPageLimitsRatesDataInfo summary(Double summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nullable
  public Double getSummary() {
    return summary;
  }

  public void setSummary(Double summary) {
    this.summary = summary;
  }


  public AppendixOnPageLimitsRatesDataInfo resources(Double resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @javax.annotation.Nullable
  public Double getResources() {
    return resources;
  }

  public void setResources(Double resources) {
    this.resources = resources;
  }


  public AppendixOnPageLimitsRatesDataInfo pages(Double pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  @javax.annotation.Nullable
  public Double getPages() {
    return pages;
  }

  public void setPages(Double pages) {
    this.pages = pages;
  }


  public AppendixOnPageLimitsRatesDataInfo nonIndexable(Double nonIndexable) {
    this.nonIndexable = nonIndexable;
    return this;
  }

  /**
   * Get nonIndexable
   * @return nonIndexable
   */
  @javax.annotation.Nullable
  public Double getNonIndexable() {
    return nonIndexable;
  }

  public void setNonIndexable(Double nonIndexable) {
    this.nonIndexable = nonIndexable;
  }


  public AppendixOnPageLimitsRatesDataInfo duplicateTags(Double duplicateTags) {
    this.duplicateTags = duplicateTags;
    return this;
  }

  /**
   * Get duplicateTags
   * @return duplicateTags
   */
  @javax.annotation.Nullable
  public Double getDuplicateTags() {
    return duplicateTags;
  }

  public void setDuplicateTags(Double duplicateTags) {
    this.duplicateTags = duplicateTags;
  }


  public AppendixOnPageLimitsRatesDataInfo links(Double links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public Double getLinks() {
    return links;
  }

  public void setLinks(Double links) {
    this.links = links;
  }


  public AppendixOnPageLimitsRatesDataInfo waterfall(Double waterfall) {
    this.waterfall = waterfall;
    return this;
  }

  /**
   * Get waterfall
   * @return waterfall
   */
  @javax.annotation.Nullable
  public Double getWaterfall() {
    return waterfall;
  }

  public void setWaterfall(Double waterfall) {
    this.waterfall = waterfall;
  }


  public AppendixOnPageLimitsRatesDataInfo errors(Double errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public AppendixOnPageLimitsRatesDataInfo pagesByResource(Double pagesByResource) {
    this.pagesByResource = pagesByResource;
    return this;
  }

  /**
   * Get pagesByResource
   * @return pagesByResource
   */
  @javax.annotation.Nullable
  public Double getPagesByResource() {
    return pagesByResource;
  }

  public void setPagesByResource(Double pagesByResource) {
    this.pagesByResource = pagesByResource;
  }


  public AppendixOnPageLimitsRatesDataInfo duplicateContent(Double duplicateContent) {
    this.duplicateContent = duplicateContent;
    return this;
  }

  /**
   * Get duplicateContent
   * @return duplicateContent
   */
  @javax.annotation.Nullable
  public Double getDuplicateContent() {
    return duplicateContent;
  }

  public void setDuplicateContent(Double duplicateContent) {
    this.duplicateContent = duplicateContent;
  }


  public AppendixOnPageLimitsRatesDataInfo rawHtml(Double rawHtml) {
    this.rawHtml = rawHtml;
    return this;
  }

  /**
   * Get rawHtml
   * @return rawHtml
   */
  @javax.annotation.Nullable
  public Double getRawHtml() {
    return rawHtml;
  }

  public void setRawHtml(Double rawHtml) {
    this.rawHtml = rawHtml;
  }


  public AppendixOnPageLimitsRatesDataInfo instantPages(Double instantPages) {
    this.instantPages = instantPages;
    return this;
  }

  /**
   * Get instantPages
   * @return instantPages
   */
  @javax.annotation.Nullable
  public Double getInstantPages() {
    return instantPages;
  }

  public void setInstantPages(Double instantPages) {
    this.instantPages = instantPages;
  }


  public AppendixOnPageLimitsRatesDataInfo redirectChains(Double redirectChains) {
    this.redirectChains = redirectChains;
    return this;
  }

  /**
   * Get redirectChains
   * @return redirectChains
   */
  @javax.annotation.Nullable
  public Double getRedirectChains() {
    return redirectChains;
  }

  public void setRedirectChains(Double redirectChains) {
    this.redirectChains = redirectChains;
  }


  public AppendixOnPageLimitsRatesDataInfo lighthouse(AppendixInfo lighthouse) {
    this.lighthouse = lighthouse;
    return this;
  }

  /**
   * Get lighthouse
   * @return lighthouse
   */
  @javax.annotation.Nullable
  public AppendixInfo getLighthouse() {
    return lighthouse;
  }

  public void setLighthouse(AppendixInfo lighthouse) {
    this.lighthouse = lighthouse;
  }


  public AppendixOnPageLimitsRatesDataInfo keywordDensity(Double keywordDensity) {
    this.keywordDensity = keywordDensity;
    return this;
  }

  /**
   * Get keywordDensity
   * @return keywordDensity
   */
  @javax.annotation.Nullable
  public Double getKeywordDensity() {
    return keywordDensity;
  }

  public void setKeywordDensity(Double keywordDensity) {
    this.keywordDensity = keywordDensity;
  }


  public AppendixOnPageLimitsRatesDataInfo pageScreenshot(Double pageScreenshot) {
    this.pageScreenshot = pageScreenshot;
    return this;
  }

  /**
   * Get pageScreenshot
   * @return pageScreenshot
   */
  @javax.annotation.Nullable
  public Double getPageScreenshot() {
    return pageScreenshot;
  }

  public void setPageScreenshot(Double pageScreenshot) {
    this.pageScreenshot = pageScreenshot;
  }


  public AppendixOnPageLimitsRatesDataInfo contentParsing(Double contentParsing) {
    this.contentParsing = contentParsing;
    return this;
  }

  /**
   * Get contentParsing
   * @return contentParsing
   */
  @javax.annotation.Nullable
  public Double getContentParsing() {
    return contentParsing;
  }

  public void setContentParsing(Double contentParsing) {
    this.contentParsing = contentParsing;
  }


  public AppendixOnPageLimitsRatesDataInfo contentParsingLive(Double contentParsingLive) {
    this.contentParsingLive = contentParsingLive;
    return this;
  }

  /**
   * Get contentParsingLive
   * @return contentParsingLive
   */
  @javax.annotation.Nullable
  public Double getContentParsingLive() {
    return contentParsingLive;
  }

  public void setContentParsingLive(Double contentParsingLive) {
    this.contentParsingLive = contentParsingLive;
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
   * @return the AppendixOnPageLimitsRatesDataInfo instance itself
   */
  public AppendixOnPageLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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
    AppendixOnPageLimitsRatesDataInfo appendixOnPageLimitsRatesDataInfo = (AppendixOnPageLimitsRatesDataInfo) o;
    return Objects.equals(this.taskPost, appendixOnPageLimitsRatesDataInfo.taskPost) &&
        Objects.equals(this.tasksReady, appendixOnPageLimitsRatesDataInfo.tasksReady) &&
        Objects.equals(this.summary, appendixOnPageLimitsRatesDataInfo.summary) &&
        Objects.equals(this.resources, appendixOnPageLimitsRatesDataInfo.resources) &&
        Objects.equals(this.pages, appendixOnPageLimitsRatesDataInfo.pages) &&
        Objects.equals(this.nonIndexable, appendixOnPageLimitsRatesDataInfo.nonIndexable) &&
        Objects.equals(this.duplicateTags, appendixOnPageLimitsRatesDataInfo.duplicateTags) &&
        Objects.equals(this.links, appendixOnPageLimitsRatesDataInfo.links) &&
        Objects.equals(this.waterfall, appendixOnPageLimitsRatesDataInfo.waterfall) &&
        Objects.equals(this.errors, appendixOnPageLimitsRatesDataInfo.errors) &&
        Objects.equals(this.pagesByResource, appendixOnPageLimitsRatesDataInfo.pagesByResource) &&
        Objects.equals(this.duplicateContent, appendixOnPageLimitsRatesDataInfo.duplicateContent) &&
        Objects.equals(this.rawHtml, appendixOnPageLimitsRatesDataInfo.rawHtml) &&
        Objects.equals(this.instantPages, appendixOnPageLimitsRatesDataInfo.instantPages) &&
        Objects.equals(this.redirectChains, appendixOnPageLimitsRatesDataInfo.redirectChains) &&
        Objects.equals(this.lighthouse, appendixOnPageLimitsRatesDataInfo.lighthouse) &&
        Objects.equals(this.keywordDensity, appendixOnPageLimitsRatesDataInfo.keywordDensity) &&
        Objects.equals(this.pageScreenshot, appendixOnPageLimitsRatesDataInfo.pageScreenshot) &&
        Objects.equals(this.contentParsing, appendixOnPageLimitsRatesDataInfo.contentParsing) &&
        Objects.equals(this.contentParsingLive, appendixOnPageLimitsRatesDataInfo.contentParsingLive)&&
        Objects.equals(this.additionalProperties, appendixOnPageLimitsRatesDataInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskPost, tasksReady, summary, resources, pages, nonIndexable, duplicateTags, links, waterfall, errors, pagesByResource, duplicateContent, rawHtml, instantPages, redirectChains, lighthouse, keywordDensity, pageScreenshot, contentParsing, contentParsingLive, additionalProperties);
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
    sb.append("class AppendixOnPageLimitsRatesDataInfo {\n");
    sb.append("    taskPost: ").append(toIndentedString(taskPost)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    nonIndexable: ").append(toIndentedString(nonIndexable)).append("\n");
    sb.append("    duplicateTags: ").append(toIndentedString(duplicateTags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    waterfall: ").append(toIndentedString(waterfall)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    pagesByResource: ").append(toIndentedString(pagesByResource)).append("\n");
    sb.append("    duplicateContent: ").append(toIndentedString(duplicateContent)).append("\n");
    sb.append("    rawHtml: ").append(toIndentedString(rawHtml)).append("\n");
    sb.append("    instantPages: ").append(toIndentedString(instantPages)).append("\n");
    sb.append("    redirectChains: ").append(toIndentedString(redirectChains)).append("\n");
    sb.append("    lighthouse: ").append(toIndentedString(lighthouse)).append("\n");
    sb.append("    keywordDensity: ").append(toIndentedString(keywordDensity)).append("\n");
    sb.append("    pageScreenshot: ").append(toIndentedString(pageScreenshot)).append("\n");
    sb.append("    contentParsing: ").append(toIndentedString(contentParsing)).append("\n");
    sb.append("    contentParsingLive: ").append(toIndentedString(contentParsingLive)).append("\n");
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
    openapiFields.add("task_post");
    openapiFields.add("tasks_ready");
    openapiFields.add("summary");
    openapiFields.add("resources");
    openapiFields.add("pages");
    openapiFields.add("non_indexable");
    openapiFields.add("duplicate_tags");
    openapiFields.add("links");
    openapiFields.add("waterfall");
    openapiFields.add("errors");
    openapiFields.add("pages_by_resource");
    openapiFields.add("duplicate_content");
    openapiFields.add("raw_html");
    openapiFields.add("instant_pages");
    openapiFields.add("redirect_chains");
    openapiFields.add("lighthouse");
    openapiFields.add("keyword_density");
    openapiFields.add("page_screenshot");
    openapiFields.add("content_parsing");
    openapiFields.add("content_parsing_live");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixOnPageLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixOnPageLimitsRatesDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixOnPageLimitsRatesDataInfo is not found in the empty JSON string", AppendixOnPageLimitsRatesDataInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `lighthouse`
      if (jsonObj.get("lighthouse") != null && !jsonObj.get("lighthouse").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("lighthouse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixOnPageLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixOnPageLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixOnPageLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixOnPageLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixOnPageLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixOnPageLimitsRatesDataInfo value) throws IOException {
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
           public AppendixOnPageLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixOnPageLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppendixOnPageLimitsRatesDataInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixOnPageLimitsRatesDataInfo
   * @throws IOException if the JSON string is invalid with respect to AppendixOnPageLimitsRatesDataInfo
   */
  public static AppendixOnPageLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixOnPageLimitsRatesDataInfo.class);
  }

  /**
   * Convert an instance of AppendixOnPageLimitsRatesDataInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

