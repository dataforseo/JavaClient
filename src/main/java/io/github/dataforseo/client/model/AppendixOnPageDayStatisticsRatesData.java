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
import io.github.dataforseo.client.model.AppendixLighthouseOnPageDayStatisticsRatesData;
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
 * AppendixOnPageDayStatisticsRatesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixOnPageDayStatisticsRatesData {
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
  private AppendixLighthouseOnPageDayStatisticsRatesData lighthouse;

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

  public static final String SERIALIZED_NAME_MICRODATA = "microdata";
  @SerializedName(SERIALIZED_NAME_MICRODATA)
  private Double microdata;

  public static final String SERIALIZED_NAME_FORCE_STOP = "force_stop";
  @SerializedName(SERIALIZED_NAME_FORCE_STOP)
  private Double forceStop;

  public static final String SERIALIZED_NAME_ID_LIST = "id_list";
  @SerializedName(SERIALIZED_NAME_ID_LIST)
  private Double idList;

  public static final String SERIALIZED_NAME_AVAILABLE_FILTERS = "available_filters";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FILTERS)
  private Double availableFilters;

  public AppendixOnPageDayStatisticsRatesData() {
  }

  public AppendixOnPageDayStatisticsRatesData taskPost(Double taskPost) {
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


  public AppendixOnPageDayStatisticsRatesData tasksReady(Double tasksReady) {
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


  public AppendixOnPageDayStatisticsRatesData summary(Double summary) {
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


  public AppendixOnPageDayStatisticsRatesData resources(Double resources) {
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


  public AppendixOnPageDayStatisticsRatesData pages(Double pages) {
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


  public AppendixOnPageDayStatisticsRatesData nonIndexable(Double nonIndexable) {
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


  public AppendixOnPageDayStatisticsRatesData duplicateTags(Double duplicateTags) {
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


  public AppendixOnPageDayStatisticsRatesData links(Double links) {
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


  public AppendixOnPageDayStatisticsRatesData waterfall(Double waterfall) {
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


  public AppendixOnPageDayStatisticsRatesData errors(Double errors) {
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


  public AppendixOnPageDayStatisticsRatesData pagesByResource(Double pagesByResource) {
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


  public AppendixOnPageDayStatisticsRatesData duplicateContent(Double duplicateContent) {
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


  public AppendixOnPageDayStatisticsRatesData rawHtml(Double rawHtml) {
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


  public AppendixOnPageDayStatisticsRatesData instantPages(Double instantPages) {
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


  public AppendixOnPageDayStatisticsRatesData redirectChains(Double redirectChains) {
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


  public AppendixOnPageDayStatisticsRatesData lighthouse(AppendixLighthouseOnPageDayStatisticsRatesData lighthouse) {
    this.lighthouse = lighthouse;
    return this;
  }

  /**
   * Get lighthouse
   * @return lighthouse
   */
  @javax.annotation.Nullable
  public AppendixLighthouseOnPageDayStatisticsRatesData getLighthouse() {
    return lighthouse;
  }

  public void setLighthouse(AppendixLighthouseOnPageDayStatisticsRatesData lighthouse) {
    this.lighthouse = lighthouse;
  }


  public AppendixOnPageDayStatisticsRatesData keywordDensity(Double keywordDensity) {
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


  public AppendixOnPageDayStatisticsRatesData pageScreenshot(Double pageScreenshot) {
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


  public AppendixOnPageDayStatisticsRatesData contentParsing(Double contentParsing) {
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


  public AppendixOnPageDayStatisticsRatesData contentParsingLive(Double contentParsingLive) {
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


  public AppendixOnPageDayStatisticsRatesData microdata(Double microdata) {
    this.microdata = microdata;
    return this;
  }

  /**
   * Get microdata
   * @return microdata
   */
  @javax.annotation.Nullable
  public Double getMicrodata() {
    return microdata;
  }

  public void setMicrodata(Double microdata) {
    this.microdata = microdata;
  }


  public AppendixOnPageDayStatisticsRatesData forceStop(Double forceStop) {
    this.forceStop = forceStop;
    return this;
  }

  /**
   * Get forceStop
   * @return forceStop
   */
  @javax.annotation.Nullable
  public Double getForceStop() {
    return forceStop;
  }

  public void setForceStop(Double forceStop) {
    this.forceStop = forceStop;
  }


  public AppendixOnPageDayStatisticsRatesData idList(Double idList) {
    this.idList = idList;
    return this;
  }

  /**
   * Get idList
   * @return idList
   */
  @javax.annotation.Nullable
  public Double getIdList() {
    return idList;
  }

  public void setIdList(Double idList) {
    this.idList = idList;
  }


  public AppendixOnPageDayStatisticsRatesData availableFilters(Double availableFilters) {
    this.availableFilters = availableFilters;
    return this;
  }

  /**
   * Get availableFilters
   * @return availableFilters
   */
  @javax.annotation.Nullable
  public Double getAvailableFilters() {
    return availableFilters;
  }

  public void setAvailableFilters(Double availableFilters) {
    this.availableFilters = availableFilters;
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
   * @return the AppendixOnPageDayStatisticsRatesData instance itself
   */
  public AppendixOnPageDayStatisticsRatesData putAdditionalProperty(String key, Object value) {
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
    AppendixOnPageDayStatisticsRatesData appendixOnPageDayStatisticsRatesData = (AppendixOnPageDayStatisticsRatesData) o;
    return Objects.equals(this.taskPost, appendixOnPageDayStatisticsRatesData.taskPost) &&
        Objects.equals(this.tasksReady, appendixOnPageDayStatisticsRatesData.tasksReady) &&
        Objects.equals(this.summary, appendixOnPageDayStatisticsRatesData.summary) &&
        Objects.equals(this.resources, appendixOnPageDayStatisticsRatesData.resources) &&
        Objects.equals(this.pages, appendixOnPageDayStatisticsRatesData.pages) &&
        Objects.equals(this.nonIndexable, appendixOnPageDayStatisticsRatesData.nonIndexable) &&
        Objects.equals(this.duplicateTags, appendixOnPageDayStatisticsRatesData.duplicateTags) &&
        Objects.equals(this.links, appendixOnPageDayStatisticsRatesData.links) &&
        Objects.equals(this.waterfall, appendixOnPageDayStatisticsRatesData.waterfall) &&
        Objects.equals(this.errors, appendixOnPageDayStatisticsRatesData.errors) &&
        Objects.equals(this.pagesByResource, appendixOnPageDayStatisticsRatesData.pagesByResource) &&
        Objects.equals(this.duplicateContent, appendixOnPageDayStatisticsRatesData.duplicateContent) &&
        Objects.equals(this.rawHtml, appendixOnPageDayStatisticsRatesData.rawHtml) &&
        Objects.equals(this.instantPages, appendixOnPageDayStatisticsRatesData.instantPages) &&
        Objects.equals(this.redirectChains, appendixOnPageDayStatisticsRatesData.redirectChains) &&
        Objects.equals(this.lighthouse, appendixOnPageDayStatisticsRatesData.lighthouse) &&
        Objects.equals(this.keywordDensity, appendixOnPageDayStatisticsRatesData.keywordDensity) &&
        Objects.equals(this.pageScreenshot, appendixOnPageDayStatisticsRatesData.pageScreenshot) &&
        Objects.equals(this.contentParsing, appendixOnPageDayStatisticsRatesData.contentParsing) &&
        Objects.equals(this.contentParsingLive, appendixOnPageDayStatisticsRatesData.contentParsingLive) &&
        Objects.equals(this.microdata, appendixOnPageDayStatisticsRatesData.microdata) &&
        Objects.equals(this.forceStop, appendixOnPageDayStatisticsRatesData.forceStop) &&
        Objects.equals(this.idList, appendixOnPageDayStatisticsRatesData.idList) &&
        Objects.equals(this.availableFilters, appendixOnPageDayStatisticsRatesData.availableFilters)&&
        Objects.equals(this.additionalProperties, appendixOnPageDayStatisticsRatesData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskPost, tasksReady, summary, resources, pages, nonIndexable, duplicateTags, links, waterfall, errors, pagesByResource, duplicateContent, rawHtml, instantPages, redirectChains, lighthouse, keywordDensity, pageScreenshot, contentParsing, contentParsingLive, microdata, forceStop, idList, availableFilters, additionalProperties);
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
    sb.append("class AppendixOnPageDayStatisticsRatesData {\n");
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
    sb.append("    microdata: ").append(toIndentedString(microdata)).append("\n");
    sb.append("    forceStop: ").append(toIndentedString(forceStop)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    availableFilters: ").append(toIndentedString(availableFilters)).append("\n");
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
    openapiFields.add("microdata");
    openapiFields.add("force_stop");
    openapiFields.add("id_list");
    openapiFields.add("available_filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixOnPageDayStatisticsRatesData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixOnPageDayStatisticsRatesData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixOnPageDayStatisticsRatesData is not found in the empty JSON string", AppendixOnPageDayStatisticsRatesData.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `lighthouse`
      if (jsonObj.get("lighthouse") != null && !jsonObj.get("lighthouse").isJsonNull()) {
        AppendixLighthouseOnPageDayStatisticsRatesData.validateJsonElement(jsonObj.get("lighthouse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixOnPageDayStatisticsRatesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixOnPageDayStatisticsRatesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixOnPageDayStatisticsRatesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixOnPageDayStatisticsRatesData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixOnPageDayStatisticsRatesData>() {
           @Override
           public void write(JsonWriter out, AppendixOnPageDayStatisticsRatesData value) throws IOException {
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
           public AppendixOnPageDayStatisticsRatesData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixOnPageDayStatisticsRatesData instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppendixOnPageDayStatisticsRatesData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixOnPageDayStatisticsRatesData
   * @throws IOException if the JSON string is invalid with respect to AppendixOnPageDayStatisticsRatesData
   */
  public static AppendixOnPageDayStatisticsRatesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixOnPageDayStatisticsRatesData.class);
  }

  /**
   * Convert an instance of AppendixOnPageDayStatisticsRatesData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
