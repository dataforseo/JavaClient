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
import io.github.dataforseo.client.model.BaseOnPageResourceItemInfo;
import io.github.dataforseo.client.model.CacheControl;
import io.github.dataforseo.client.model.LastModified;
import io.github.dataforseo.client.model.OnPageResourceIssueInfo;
import io.github.dataforseo.client.model.PageMetaInfo;
import io.github.dataforseo.client.model.PageTiming;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * HtmlResourceElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class HtmlResourceElementItem extends BaseOnPageResourceItemInfo {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private PageMetaInfo meta;

  public static final String SERIALIZED_NAME_PAGE_TIMING = "page_timing";
  @SerializedName(SERIALIZED_NAME_PAGE_TIMING)
  private PageTiming pageTiming;

  public static final String SERIALIZED_NAME_ONPAGE_SCORE = "onpage_score";
  @SerializedName(SERIALIZED_NAME_ONPAGE_SCORE)
  private Float onpageScore;

  public static final String SERIALIZED_NAME_TOTAL_DOM_SIZE = "total_dom_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_DOM_SIZE)
  private Long totalDomSize;

  public static final String SERIALIZED_NAME_CUSTOM_JS_RESPONSE = "custom_js_response";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JS_RESPONSE)
  private Object customJsResponse;

  public static final String SERIALIZED_NAME_BROKEN_RESOURCES = "broken_resources";
  @SerializedName(SERIALIZED_NAME_BROKEN_RESOURCES)
  private Boolean brokenResources;

  public static final String SERIALIZED_NAME_BROKEN_LINKS = "broken_links";
  @SerializedName(SERIALIZED_NAME_BROKEN_LINKS)
  private Boolean brokenLinks;

  public static final String SERIALIZED_NAME_DUPLICATE_TITLE = "duplicate_title";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_TITLE)
  private Boolean duplicateTitle;

  public static final String SERIALIZED_NAME_DUPLICATE_DESCRIPTION = "duplicate_description";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_DESCRIPTION)
  private Boolean duplicateDescription;

  public static final String SERIALIZED_NAME_DUPLICATE_CONTENT = "duplicate_content";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_CONTENT)
  private Boolean duplicateContent;

  public static final String SERIALIZED_NAME_CLICK_DEPTH = "click_depth";
  @SerializedName(SERIALIZED_NAME_CLICK_DEPTH)
  private Integer clickDepth;

  public static final String SERIALIZED_NAME_IS_RESOURCE = "is_resource";
  @SerializedName(SERIALIZED_NAME_IS_RESOURCE)
  private Boolean isResource;

  public static final String SERIALIZED_NAME_URL_LENGTH = "url_length";
  @SerializedName(SERIALIZED_NAME_URL_LENGTH)
  private Integer urlLength;

  public static final String SERIALIZED_NAME_RELATIVE_URL_LENGTH = "relative_url_length";
  @SerializedName(SERIALIZED_NAME_RELATIVE_URL_LENGTH)
  private Integer relativeUrlLength;

  public HtmlResourceElementItem() {
    this.resourceType = this.getClass().getSimpleName();
  }

  public HtmlResourceElementItem meta(PageMetaInfo meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public PageMetaInfo getMeta() {
    return meta;
  }

  public void setMeta(PageMetaInfo meta) {
    this.meta = meta;
  }


  public HtmlResourceElementItem pageTiming(PageTiming pageTiming) {
    this.pageTiming = pageTiming;
    return this;
  }

  /**
   * Get pageTiming
   * @return pageTiming
   */
  @javax.annotation.Nullable
  public PageTiming getPageTiming() {
    return pageTiming;
  }

  public void setPageTiming(PageTiming pageTiming) {
    this.pageTiming = pageTiming;
  }


  public HtmlResourceElementItem onpageScore(Float onpageScore) {
    this.onpageScore = onpageScore;
    return this;
  }

  /**
   * shows how page is optimized on a 100-point scale this field shows how page is optimized considering critical on-page issues and warnings detected; 100 is the highest possible score that means the page does not have any critical on-page issues and important warnings; learn more about how the metric is calculated in this help center article
   * @return onpageScore
   */
  @javax.annotation.Nullable
  public Float getOnpageScore() {
    return onpageScore;
  }

  public void setOnpageScore(Float onpageScore) {
    this.onpageScore = onpageScore;
  }


  public HtmlResourceElementItem totalDomSize(Long totalDomSize) {
    this.totalDomSize = totalDomSize;
    return this;
  }

  /**
   * total DOM size of a page
   * @return totalDomSize
   */
  @javax.annotation.Nullable
  public Long getTotalDomSize() {
    return totalDomSize;
  }

  public void setTotalDomSize(Long totalDomSize) {
    this.totalDomSize = totalDomSize;
  }


  public HtmlResourceElementItem customJsResponse(Object customJsResponse) {
    this.customJsResponse = customJsResponse;
    return this;
  }

  /**
   * the result of executing a specified JS script note that you should specify a custom_js field when setting a task to receive this data and the field type and its value will totally depend on the script you specified;you can also filter the results by this value specifying filters in the following way: [\&quot;custom_js_response.url\&quot;, \&quot;like\&quot;, \&quot;pixel\&quot;]
   * @return customJsResponse
   */
  @javax.annotation.Nullable
  public Object getCustomJsResponse() {
    return customJsResponse;
  }

  public void setCustomJsResponse(Object customJsResponse) {
    this.customJsResponse = customJsResponse;
  }


  public HtmlResourceElementItem brokenResources(Boolean brokenResources) {
    this.brokenResources = brokenResources;
    return this;
  }

  /**
   * indicates whether a page contains broken resources
   * @return brokenResources
   */
  @javax.annotation.Nullable
  public Boolean getBrokenResources() {
    return brokenResources;
  }

  public void setBrokenResources(Boolean brokenResources) {
    this.brokenResources = brokenResources;
  }


  public HtmlResourceElementItem brokenLinks(Boolean brokenLinks) {
    this.brokenLinks = brokenLinks;
    return this;
  }

  /**
   * indicates whether a page contains broken links
   * @return brokenLinks
   */
  @javax.annotation.Nullable
  public Boolean getBrokenLinks() {
    return brokenLinks;
  }

  public void setBrokenLinks(Boolean brokenLinks) {
    this.brokenLinks = brokenLinks;
  }


  public HtmlResourceElementItem duplicateTitle(Boolean duplicateTitle) {
    this.duplicateTitle = duplicateTitle;
    return this;
  }

  /**
   * indicates whether a page has duplicate title tags
   * @return duplicateTitle
   */
  @javax.annotation.Nullable
  public Boolean getDuplicateTitle() {
    return duplicateTitle;
  }

  public void setDuplicateTitle(Boolean duplicateTitle) {
    this.duplicateTitle = duplicateTitle;
  }


  public HtmlResourceElementItem duplicateDescription(Boolean duplicateDescription) {
    this.duplicateDescription = duplicateDescription;
    return this;
  }

  /**
   * indicates whether a page has a duplicate description
   * @return duplicateDescription
   */
  @javax.annotation.Nullable
  public Boolean getDuplicateDescription() {
    return duplicateDescription;
  }

  public void setDuplicateDescription(Boolean duplicateDescription) {
    this.duplicateDescription = duplicateDescription;
  }


  public HtmlResourceElementItem duplicateContent(Boolean duplicateContent) {
    this.duplicateContent = duplicateContent;
    return this;
  }

  /**
   * indicates whether a page has duplicate content
   * @return duplicateContent
   */
  @javax.annotation.Nullable
  public Boolean getDuplicateContent() {
    return duplicateContent;
  }

  public void setDuplicateContent(Boolean duplicateContent) {
    this.duplicateContent = duplicateContent;
  }


  public HtmlResourceElementItem clickDepth(Integer clickDepth) {
    this.clickDepth = clickDepth;
    return this;
  }

  /**
   * number of clicks it takes to get to the page indicates the number of clicks from the homepage needed before landing at the target page
   * @return clickDepth
   */
  @javax.annotation.Nullable
  public Integer getClickDepth() {
    return clickDepth;
  }

  public void setClickDepth(Integer clickDepth) {
    this.clickDepth = clickDepth;
  }


  public HtmlResourceElementItem isResource(Boolean isResource) {
    this.isResource = isResource;
    return this;
  }

  /**
   * indicates whether a page is a single resource
   * @return isResource
   */
  @javax.annotation.Nullable
  public Boolean getIsResource() {
    return isResource;
  }

  public void setIsResource(Boolean isResource) {
    this.isResource = isResource;
  }


  public HtmlResourceElementItem urlLength(Integer urlLength) {
    this.urlLength = urlLength;
    return this;
  }

  /**
   * page URL length in characters
   * @return urlLength
   */
  @javax.annotation.Nullable
  public Integer getUrlLength() {
    return urlLength;
  }

  public void setUrlLength(Integer urlLength) {
    this.urlLength = urlLength;
  }


  public HtmlResourceElementItem relativeUrlLength(Integer relativeUrlLength) {
    this.relativeUrlLength = relativeUrlLength;
    return this;
  }

  /**
   * relative URL length in characters
   * @return relativeUrlLength
   */
  @javax.annotation.Nullable
  public Integer getRelativeUrlLength() {
    return relativeUrlLength;
  }

  public void setRelativeUrlLength(Integer relativeUrlLength) {
    this.relativeUrlLength = relativeUrlLength;
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
   * @return the HtmlResourceElementItem instance itself
   */
  public HtmlResourceElementItem putAdditionalProperty(String key, Object value) {
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
    HtmlResourceElementItem htmlResourceElementItem = (HtmlResourceElementItem) o;
    return Objects.equals(this.meta, htmlResourceElementItem.meta) &&
        Objects.equals(this.pageTiming, htmlResourceElementItem.pageTiming) &&
        Objects.equals(this.onpageScore, htmlResourceElementItem.onpageScore) &&
        Objects.equals(this.totalDomSize, htmlResourceElementItem.totalDomSize) &&
        Objects.equals(this.customJsResponse, htmlResourceElementItem.customJsResponse) &&
        Objects.equals(this.brokenResources, htmlResourceElementItem.brokenResources) &&
        Objects.equals(this.brokenLinks, htmlResourceElementItem.brokenLinks) &&
        Objects.equals(this.duplicateTitle, htmlResourceElementItem.duplicateTitle) &&
        Objects.equals(this.duplicateDescription, htmlResourceElementItem.duplicateDescription) &&
        Objects.equals(this.duplicateContent, htmlResourceElementItem.duplicateContent) &&
        Objects.equals(this.clickDepth, htmlResourceElementItem.clickDepth) &&
        Objects.equals(this.isResource, htmlResourceElementItem.isResource) &&
        Objects.equals(this.urlLength, htmlResourceElementItem.urlLength) &&
        Objects.equals(this.relativeUrlLength, htmlResourceElementItem.relativeUrlLength)&&
        Objects.equals(this.additionalProperties, htmlResourceElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, pageTiming, onpageScore, totalDomSize, customJsResponse, brokenResources, brokenLinks, duplicateTitle, duplicateDescription, duplicateContent, clickDepth, isResource, urlLength, relativeUrlLength, super.hashCode(), additionalProperties);
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
    sb.append("class HtmlResourceElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    pageTiming: ").append(toIndentedString(pageTiming)).append("\n");
    sb.append("    onpageScore: ").append(toIndentedString(onpageScore)).append("\n");
    sb.append("    totalDomSize: ").append(toIndentedString(totalDomSize)).append("\n");
    sb.append("    customJsResponse: ").append(toIndentedString(customJsResponse)).append("\n");
    sb.append("    brokenResources: ").append(toIndentedString(brokenResources)).append("\n");
    sb.append("    brokenLinks: ").append(toIndentedString(brokenLinks)).append("\n");
    sb.append("    duplicateTitle: ").append(toIndentedString(duplicateTitle)).append("\n");
    sb.append("    duplicateDescription: ").append(toIndentedString(duplicateDescription)).append("\n");
    sb.append("    duplicateContent: ").append(toIndentedString(duplicateContent)).append("\n");
    sb.append("    clickDepth: ").append(toIndentedString(clickDepth)).append("\n");
    sb.append("    isResource: ").append(toIndentedString(isResource)).append("\n");
    sb.append("    urlLength: ").append(toIndentedString(urlLength)).append("\n");
    sb.append("    relativeUrlLength: ").append(toIndentedString(relativeUrlLength)).append("\n");
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
    openapiFields.add("resource_type");
    openapiFields.add("status_code");
    openapiFields.add("location");
    openapiFields.add("url");
    openapiFields.add("resource_errors");
    openapiFields.add("size");
    openapiFields.add("encoded_size");
    openapiFields.add("total_transfer_size");
    openapiFields.add("fetch_time");
    openapiFields.add("cache_control");
    openapiFields.add("checks");
    openapiFields.add("content_encoding");
    openapiFields.add("media_type");
    openapiFields.add("server");
    openapiFields.add("last_modified");
    openapiFields.add("meta");
    openapiFields.add("page_timing");
    openapiFields.add("onpage_score");
    openapiFields.add("total_dom_size");
    openapiFields.add("custom_js_response");
    openapiFields.add("broken_resources");
    openapiFields.add("broken_links");
    openapiFields.add("duplicate_title");
    openapiFields.add("duplicate_description");
    openapiFields.add("duplicate_content");
    openapiFields.add("click_depth");
    openapiFields.add("is_resource");
    openapiFields.add("url_length");
    openapiFields.add("relative_url_length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HtmlResourceElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HtmlResourceElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HtmlResourceElementItem is not found in the empty JSON string", HtmlResourceElementItem.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HtmlResourceElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HtmlResourceElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HtmlResourceElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HtmlResourceElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<HtmlResourceElementItem>() {
           @Override
           public void write(JsonWriter out, HtmlResourceElementItem value) throws IOException {
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
           public HtmlResourceElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HtmlResourceElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of HtmlResourceElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HtmlResourceElementItem
   * @throws IOException if the JSON string is invalid with respect to HtmlResourceElementItem
   */
  public static HtmlResourceElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HtmlResourceElementItem.class);
  }

  /**
   * Convert an instance of HtmlResourceElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
