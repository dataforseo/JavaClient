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



public class AppendixOnPagePriceData  {


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixOnPagePriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_LIGHTHOUSE = "lighthouse";
  @SerializedName(SERIALIZED_NAME_LIGHTHOUSE)
  private AppendixGoogleBusinessDataPriceDataInfo lighthouse;

  public AppendixOnPagePriceData lighthouse(AppendixGoogleBusinessDataPriceDataInfo lighthouse) {
    this.lighthouse = lighthouse;
    return this;
  }

  /**
   * 
   * @return lighthouse
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceDataInfo getLighthouse() {
    return lighthouse;
  }

  public void setLighthouse(AppendixGoogleBusinessDataPriceDataInfo lighthouse) {
    this.lighthouse = lighthouse;
  }


  public static final String SERIALIZED_NAME_CONTENT_PARSING = "content_parsing";
  @SerializedName(SERIALIZED_NAME_CONTENT_PARSING)
  private AppendixTaskKeywordsDataPriceDataInfo contentParsing;

  public AppendixOnPagePriceData contentParsing(AppendixTaskKeywordsDataPriceDataInfo contentParsing) {
    this.contentParsing = contentParsing;
    return this;
  }

  /**
   * 
   * @return contentParsing
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getContentParsing() {
    return contentParsing;
  }

  public void setContentParsing(AppendixTaskKeywordsDataPriceDataInfo contentParsing) {
    this.contentParsing = contentParsing;
  }


  public static final String SERIALIZED_NAME_CONTENT_PARSING_LIVE = "content_parsing_live";
  @SerializedName(SERIALIZED_NAME_CONTENT_PARSING_LIVE)
  private AppendixTaskKeywordsDataPriceDataInfo contentParsingLive;

  public AppendixOnPagePriceData contentParsingLive(AppendixTaskKeywordsDataPriceDataInfo contentParsingLive) {
    this.contentParsingLive = contentParsingLive;
    return this;
  }

  /**
   * 
   * @return contentParsingLive
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getContentParsingLive() {
    return contentParsingLive;
  }

  public void setContentParsingLive(AppendixTaskKeywordsDataPriceDataInfo contentParsingLive) {
    this.contentParsingLive = contentParsingLive;
  }


  public static final String SERIALIZED_NAME_DUPLICATE_CONTENT = "duplicate_content";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_CONTENT)
  private AppendixTaskKeywordsDataPriceDataInfo duplicateContent;

  public AppendixOnPagePriceData duplicateContent(AppendixTaskKeywordsDataPriceDataInfo duplicateContent) {
    this.duplicateContent = duplicateContent;
    return this;
  }

  /**
   * 
   * @return duplicateContent
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getDuplicateContent() {
    return duplicateContent;
  }

  public void setDuplicateContent(AppendixTaskKeywordsDataPriceDataInfo duplicateContent) {
    this.duplicateContent = duplicateContent;
  }


  public static final String SERIALIZED_NAME_DUPLICATE_TAGS = "duplicate_tags";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_TAGS)
  private AppendixTaskKeywordsDataPriceDataInfo duplicateTags;

  public AppendixOnPagePriceData duplicateTags(AppendixTaskKeywordsDataPriceDataInfo duplicateTags) {
    this.duplicateTags = duplicateTags;
    return this;
  }

  /**
   * 
   * @return duplicateTags
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getDuplicateTags() {
    return duplicateTags;
  }

  public void setDuplicateTags(AppendixTaskKeywordsDataPriceDataInfo duplicateTags) {
    this.duplicateTags = duplicateTags;
  }


  public static final String SERIALIZED_NAME_INSTANT_PAGES = "instant_pages";
  @SerializedName(SERIALIZED_NAME_INSTANT_PAGES)
  private AppendixTaskKeywordsDataPriceDataInfo instantPages;

  public AppendixOnPagePriceData instantPages(AppendixTaskKeywordsDataPriceDataInfo instantPages) {
    this.instantPages = instantPages;
    return this;
  }

  /**
   * 
   * @return instantPages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getInstantPages() {
    return instantPages;
  }

  public void setInstantPages(AppendixTaskKeywordsDataPriceDataInfo instantPages) {
    this.instantPages = instantPages;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DENSITY = "keyword_density";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DENSITY)
  private AppendixTaskKeywordsDataPriceDataInfo keywordDensity;

  public AppendixOnPagePriceData keywordDensity(AppendixTaskKeywordsDataPriceDataInfo keywordDensity) {
    this.keywordDensity = keywordDensity;
    return this;
  }

  /**
   * 
   * @return keywordDensity
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getKeywordDensity() {
    return keywordDensity;
  }

  public void setKeywordDensity(AppendixTaskKeywordsDataPriceDataInfo keywordDensity) {
    this.keywordDensity = keywordDensity;
  }


  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private AppendixTaskKeywordsDataPriceDataInfo links;

  public AppendixOnPagePriceData links(AppendixTaskKeywordsDataPriceDataInfo links) {
    this.links = links;
    return this;
  }

  /**
   * 
   * @return links
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLinks() {
    return links;
  }

  public void setLinks(AppendixTaskKeywordsDataPriceDataInfo links) {
    this.links = links;
  }


  public static final String SERIALIZED_NAME_NON_INDEXABLE = "non_indexable";
  @SerializedName(SERIALIZED_NAME_NON_INDEXABLE)
  private AppendixTaskKeywordsDataPriceDataInfo nonIndexable;

  public AppendixOnPagePriceData nonIndexable(AppendixTaskKeywordsDataPriceDataInfo nonIndexable) {
    this.nonIndexable = nonIndexable;
    return this;
  }

  /**
   * 
   * @return nonIndexable
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getNonIndexable() {
    return nonIndexable;
  }

  public void setNonIndexable(AppendixTaskKeywordsDataPriceDataInfo nonIndexable) {
    this.nonIndexable = nonIndexable;
  }


  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private AppendixTaskKeywordsDataPriceDataInfo pages;

  public AppendixOnPagePriceData pages(AppendixTaskKeywordsDataPriceDataInfo pages) {
    this.pages = pages;
    return this;
  }

  /**
   * 
   * @return pages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getPages() {
    return pages;
  }

  public void setPages(AppendixTaskKeywordsDataPriceDataInfo pages) {
    this.pages = pages;
  }


  public static final String SERIALIZED_NAME_PAGES_BY_RESOURCE = "pages_by_resource";
  @SerializedName(SERIALIZED_NAME_PAGES_BY_RESOURCE)
  private AppendixTaskKeywordsDataPriceDataInfo pagesByResource;

  public AppendixOnPagePriceData pagesByResource(AppendixTaskKeywordsDataPriceDataInfo pagesByResource) {
    this.pagesByResource = pagesByResource;
    return this;
  }

  /**
   * 
   * @return pagesByResource
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getPagesByResource() {
    return pagesByResource;
  }

  public void setPagesByResource(AppendixTaskKeywordsDataPriceDataInfo pagesByResource) {
    this.pagesByResource = pagesByResource;
  }


  public static final String SERIALIZED_NAME_PAGE_SCREENSHOT = "page_screenshot";
  @SerializedName(SERIALIZED_NAME_PAGE_SCREENSHOT)
  private AppendixTaskKeywordsDataPriceDataInfo pageScreenshot;

  public AppendixOnPagePriceData pageScreenshot(AppendixTaskKeywordsDataPriceDataInfo pageScreenshot) {
    this.pageScreenshot = pageScreenshot;
    return this;
  }

  /**
   * 
   * @return pageScreenshot
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getPageScreenshot() {
    return pageScreenshot;
  }

  public void setPageScreenshot(AppendixTaskKeywordsDataPriceDataInfo pageScreenshot) {
    this.pageScreenshot = pageScreenshot;
  }


  public static final String SERIALIZED_NAME_RAW_HTML = "raw_html";
  @SerializedName(SERIALIZED_NAME_RAW_HTML)
  private AppendixTaskKeywordsDataPriceDataInfo rawHtml;

  public AppendixOnPagePriceData rawHtml(AppendixTaskKeywordsDataPriceDataInfo rawHtml) {
    this.rawHtml = rawHtml;
    return this;
  }

  /**
   * 
   * @return rawHtml
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getRawHtml() {
    return rawHtml;
  }

  public void setRawHtml(AppendixTaskKeywordsDataPriceDataInfo rawHtml) {
    this.rawHtml = rawHtml;
  }


  public static final String SERIALIZED_NAME_REDIRECT_CHAINS = "redirect_chains";
  @SerializedName(SERIALIZED_NAME_REDIRECT_CHAINS)
  private AppendixTaskKeywordsDataPriceDataInfo redirectChains;

  public AppendixOnPagePriceData redirectChains(AppendixTaskKeywordsDataPriceDataInfo redirectChains) {
    this.redirectChains = redirectChains;
    return this;
  }

  /**
   * 
   * @return redirectChains
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getRedirectChains() {
    return redirectChains;
  }

  public void setRedirectChains(AppendixTaskKeywordsDataPriceDataInfo redirectChains) {
    this.redirectChains = redirectChains;
  }


  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private AppendixTaskKeywordsDataPriceDataInfo resources;

  public AppendixOnPagePriceData resources(AppendixTaskKeywordsDataPriceDataInfo resources) {
    this.resources = resources;
    return this;
  }

  /**
   * 
   * @return resources
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getResources() {
    return resources;
  }

  public void setResources(AppendixTaskKeywordsDataPriceDataInfo resources) {
    this.resources = resources;
  }


  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private AppendixTaskKeywordsDataPriceDataInfo summary;

  public AppendixOnPagePriceData summary(AppendixTaskKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
    return this;
  }

  /**
   * 
   * @return summary
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getSummary() {
    return summary;
  }

  public void setSummary(AppendixTaskKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
  }


  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private AppendixTaskKeywordsDataPriceDataInfo taskPost;

  public AppendixOnPagePriceData taskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
    this.taskPost = taskPost;
    return this;
  }

  /**
   * 
   * @return taskPost
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTaskPost() {
    return taskPost;
  }

  public void setTaskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
    this.taskPost = taskPost;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixOnPagePriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
  }


  public static final String SERIALIZED_NAME_WATERFALL = "waterfall";
  @SerializedName(SERIALIZED_NAME_WATERFALL)
  private AppendixTaskKeywordsDataPriceDataInfo waterfall;

  public AppendixOnPagePriceData waterfall(AppendixTaskKeywordsDataPriceDataInfo waterfall) {
    this.waterfall = waterfall;
    return this;
  }

  /**
   * 
   * @return waterfall
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getWaterfall() {
    return waterfall;
  }

  public void setWaterfall(AppendixTaskKeywordsDataPriceDataInfo waterfall) {
    this.waterfall = waterfall;
  }



  public AppendixOnPagePriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixOnPagePriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixOnPagePriceData appendixOnPagePriceData = (AppendixOnPagePriceData) o;
    return

        Objects.equals(this.errors, appendixOnPagePriceData.errors) &&
        Objects.equals(this.lighthouse, appendixOnPagePriceData.lighthouse) &&
        Objects.equals(this.contentParsing, appendixOnPagePriceData.contentParsing) &&
        Objects.equals(this.contentParsingLive, appendixOnPagePriceData.contentParsingLive) &&
        Objects.equals(this.duplicateContent, appendixOnPagePriceData.duplicateContent) &&
        Objects.equals(this.duplicateTags, appendixOnPagePriceData.duplicateTags) &&
        Objects.equals(this.instantPages, appendixOnPagePriceData.instantPages) &&
        Objects.equals(this.keywordDensity, appendixOnPagePriceData.keywordDensity) &&
        Objects.equals(this.links, appendixOnPagePriceData.links) &&
        Objects.equals(this.nonIndexable, appendixOnPagePriceData.nonIndexable) &&
        Objects.equals(this.pages, appendixOnPagePriceData.pages) &&
        Objects.equals(this.pagesByResource, appendixOnPagePriceData.pagesByResource) &&
        Objects.equals(this.pageScreenshot, appendixOnPagePriceData.pageScreenshot) &&
        Objects.equals(this.rawHtml, appendixOnPagePriceData.rawHtml) &&
        Objects.equals(this.redirectChains, appendixOnPagePriceData.redirectChains) &&
        Objects.equals(this.resources, appendixOnPagePriceData.resources) &&
        Objects.equals(this.summary, appendixOnPagePriceData.summary) &&
        Objects.equals(this.taskPost, appendixOnPagePriceData.taskPost) &&
        Objects.equals(this.tasksReady, appendixOnPagePriceData.tasksReady) &&
        Objects.equals(this.waterfall, appendixOnPagePriceData.waterfall);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(errors, lighthouse, contentParsing, contentParsingLive, duplicateContent, duplicateTags, instantPages, keywordDensity, links, nonIndexable, pages, pagesByResource, pageScreenshot, rawHtml, redirectChains, resources, summary, taskPost, tasksReady, waterfall);
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
    sb.append("class AppendixOnPagePriceData {\n");

    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    lighthouse: ").append(toIndentedString(lighthouse)).append("\n");
    sb.append("    contentParsing: ").append(toIndentedString(contentParsing)).append("\n");
    sb.append("    contentParsingLive: ").append(toIndentedString(contentParsingLive)).append("\n");
    sb.append("    duplicateContent: ").append(toIndentedString(duplicateContent)).append("\n");
    sb.append("    duplicateTags: ").append(toIndentedString(duplicateTags)).append("\n");
    sb.append("    instantPages: ").append(toIndentedString(instantPages)).append("\n");
    sb.append("    keywordDensity: ").append(toIndentedString(keywordDensity)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nonIndexable: ").append(toIndentedString(nonIndexable)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    pagesByResource: ").append(toIndentedString(pagesByResource)).append("\n");
    sb.append("    pageScreenshot: ").append(toIndentedString(pageScreenshot)).append("\n");
    sb.append("    rawHtml: ").append(toIndentedString(rawHtml)).append("\n");
    sb.append("    redirectChains: ").append(toIndentedString(redirectChains)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    taskPost: ").append(toIndentedString(taskPost)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    waterfall: ").append(toIndentedString(waterfall)).append("\n");
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
    
    openapiFields.add("errors");
    
    openapiFields.add("lighthouse");
    
    openapiFields.add("content_parsing");
    
    openapiFields.add("content_parsing_live");
    
    openapiFields.add("duplicate_content");
    
    openapiFields.add("duplicate_tags");
    
    openapiFields.add("instant_pages");
    
    openapiFields.add("keyword_density");
    
    openapiFields.add("links");
    
    openapiFields.add("non_indexable");
    
    openapiFields.add("pages");
    
    openapiFields.add("pages_by_resource");
    
    openapiFields.add("page_screenshot");
    
    openapiFields.add("raw_html");
    
    openapiFields.add("redirect_chains");
    
    openapiFields.add("resources");
    
    openapiFields.add("summary");
    
    openapiFields.add("task_post");
    
    openapiFields.add("tasks_ready");
    
    openapiFields.add("waterfall");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixOnPagePriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixOnPagePriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixOnPagePriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixOnPagePriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixOnPagePriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixOnPagePriceData>() {
           @Override
           public void write(JsonWriter out, AppendixOnPagePriceData value) throws IOException {
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
           public AppendixOnPagePriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixOnPagePriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixOnPagePriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixOnPagePriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}