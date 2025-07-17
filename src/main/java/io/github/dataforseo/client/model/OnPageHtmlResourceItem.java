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



public class OnPageHtmlResourceItem  extends BaseOnPageResourceItem  {


  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private PageMetaInfo meta;

  public OnPageHtmlResourceItem meta(PageMetaInfo meta) {
    this.meta = meta;
    return this;
  }

  /**
   * page properties
* the value depends on the resource_type
   * @return meta
   */
  @javax.annotation.Nullable
  public PageMetaInfo getMeta() {
    return meta;
  }

  public void setMeta(PageMetaInfo meta) {
    this.meta = meta;
  }


  public static final String SERIALIZED_NAME_PAGE_TIMING = "page_timing";
  @SerializedName(SERIALIZED_NAME_PAGE_TIMING)
  private PageTiming pageTiming;

  public OnPageHtmlResourceItem pageTiming(PageTiming pageTiming) {
    this.pageTiming = pageTiming;
    return this;
  }

  /**
   * object of page load metrics
   * @return pageTiming
   */
  @javax.annotation.Nullable
  public PageTiming getPageTiming() {
    return pageTiming;
  }

  public void setPageTiming(PageTiming pageTiming) {
    this.pageTiming = pageTiming;
  }


  public static final String SERIALIZED_NAME_ONPAGE_SCORE = "onpage_score";
  @SerializedName(SERIALIZED_NAME_ONPAGE_SCORE)
  private Double onpageScore;

  public OnPageHtmlResourceItem onpageScore(Double onpageScore) {
    this.onpageScore = onpageScore;
    return this;
  }

  /**
   * shows how page is optimized on a 100-point scale
* this field shows how page is optimized considering critical on-page issues and warnings detected;
* 100 is the highest possible score that means the page does not have any critical on-page issues and important warnings;
* learn more about how the metric is calculated in this help center article
   * @return onpageScore
   */
  @javax.annotation.Nullable
  public Double getOnpageScore() {
    return onpageScore;
  }

  public void setOnpageScore(Double onpageScore) {
    this.onpageScore = onpageScore;
  }


  public static final String SERIALIZED_NAME_TOTAL_DOM_SIZE = "total_dom_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_DOM_SIZE)
  private Long totalDomSize;

  public OnPageHtmlResourceItem totalDomSize(Long totalDomSize) {
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


  public static final String SERIALIZED_NAME_CUSTOM_JS_RESPONSE = "custom_js_response";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JS_RESPONSE)
  private Object customJsResponse;

  public OnPageHtmlResourceItem customJsResponse(Object customJsResponse) {
    this.customJsResponse = customJsResponse;
    return this;
  }

  /**
   * the result of executing a specified JS script
* note that you should specify a custom_js field when setting a task to receive this data and the field type and its value will totally depend on the script you specified;
* you can also filter the results by this value specifying filters in the following way:
* ['custom_js_response.url', 'like', 'pixel']
   * @return customJsResponse
   */
  @javax.annotation.Nullable
  public Object getCustomJsResponse() {
    return customJsResponse;
  }

  public void setCustomJsResponse(Object customJsResponse) {
    this.customJsResponse = customJsResponse;
  }


  public static final String SERIALIZED_NAME_CUSTOM_JS_CLIENT_EXCEPTION = "custom_js_client_exception";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JS_CLIENT_EXCEPTION)
  private String customJsClientException;

  public OnPageHtmlResourceItem customJsClientException(String customJsClientException) {
    this.customJsClientException = customJsClientException;
    return this;
  }

  /**
   * error when executing a custom js
* if the error occurred when executing the script you specified in the custom_js field, the error message would be displayed here
   * @return customJsClientException
   */
  @javax.annotation.Nullable
  public String getCustomJsClientException() {
    return customJsClientException;
  }

  public void setCustomJsClientException(String customJsClientException) {
    this.customJsClientException = customJsClientException;
  }


  public static final String SERIALIZED_NAME_BROKEN_RESOURCES = "broken_resources";
  @SerializedName(SERIALIZED_NAME_BROKEN_RESOURCES)
  private Boolean brokenResources;

  public OnPageHtmlResourceItem brokenResources(Boolean brokenResources) {
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


  public static final String SERIALIZED_NAME_BROKEN_LINKS = "broken_links";
  @SerializedName(SERIALIZED_NAME_BROKEN_LINKS)
  private Boolean brokenLinks;

  public OnPageHtmlResourceItem brokenLinks(Boolean brokenLinks) {
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


  public static final String SERIALIZED_NAME_DUPLICATE_TITLE = "duplicate_title";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_TITLE)
  private Boolean duplicateTitle;

  public OnPageHtmlResourceItem duplicateTitle(Boolean duplicateTitle) {
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


  public static final String SERIALIZED_NAME_DUPLICATE_DESCRIPTION = "duplicate_description";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_DESCRIPTION)
  private Boolean duplicateDescription;

  public OnPageHtmlResourceItem duplicateDescription(Boolean duplicateDescription) {
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


  public static final String SERIALIZED_NAME_DUPLICATE_CONTENT = "duplicate_content";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_CONTENT)
  private Boolean duplicateContent;

  public OnPageHtmlResourceItem duplicateContent(Boolean duplicateContent) {
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


  public static final String SERIALIZED_NAME_CLICK_DEPTH = "click_depth";
  @SerializedName(SERIALIZED_NAME_CLICK_DEPTH)
  private Integer clickDepth;

  public OnPageHtmlResourceItem clickDepth(Integer clickDepth) {
    this.clickDepth = clickDepth;
    return this;
  }

  /**
   * number of clicks it takes to get to the page
* indicates the number of clicks from the homepage needed before landing at the target page
   * @return clickDepth
   */
  @javax.annotation.Nullable
  public Integer getClickDepth() {
    return clickDepth;
  }

  public void setClickDepth(Integer clickDepth) {
    this.clickDepth = clickDepth;
  }


  public static final String SERIALIZED_NAME_IS_RESOURCE = "is_resource";
  @SerializedName(SERIALIZED_NAME_IS_RESOURCE)
  private Boolean isResource;

  public OnPageHtmlResourceItem isResource(Boolean isResource) {
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


  public static final String SERIALIZED_NAME_URL_LENGTH = "url_length";
  @SerializedName(SERIALIZED_NAME_URL_LENGTH)
  private Integer urlLength;

  public OnPageHtmlResourceItem urlLength(Integer urlLength) {
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


  public static final String SERIALIZED_NAME_RELATIVE_URL_LENGTH = "relative_url_length";
  @SerializedName(SERIALIZED_NAME_RELATIVE_URL_LENGTH)
  private Integer relativeUrlLength;

  public OnPageHtmlResourceItem relativeUrlLength(Integer relativeUrlLength) {
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



  public OnPageHtmlResourceItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageHtmlResourceItem putAdditionalProperty(String key, Object value) {
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


    
    OnPageHtmlResourceItem onPageHtmlResourceItem = (OnPageHtmlResourceItem) o;
    return

        Objects.equals(this.meta, onPageHtmlResourceItem.meta) &&
        Objects.equals(this.pageTiming, onPageHtmlResourceItem.pageTiming) &&
        Objects.equals(this.onpageScore, onPageHtmlResourceItem.onpageScore) &&
        Objects.equals(this.totalDomSize, onPageHtmlResourceItem.totalDomSize) &&
        Objects.equals(this.customJsResponse, onPageHtmlResourceItem.customJsResponse) &&
        Objects.equals(this.customJsClientException, onPageHtmlResourceItem.customJsClientException) &&
        Objects.equals(this.brokenResources, onPageHtmlResourceItem.brokenResources) &&
        Objects.equals(this.brokenLinks, onPageHtmlResourceItem.brokenLinks) &&
        Objects.equals(this.duplicateTitle, onPageHtmlResourceItem.duplicateTitle) &&
        Objects.equals(this.duplicateDescription, onPageHtmlResourceItem.duplicateDescription) &&
        Objects.equals(this.duplicateContent, onPageHtmlResourceItem.duplicateContent) &&
        Objects.equals(this.clickDepth, onPageHtmlResourceItem.clickDepth) &&
        Objects.equals(this.isResource, onPageHtmlResourceItem.isResource) &&
        Objects.equals(this.urlLength, onPageHtmlResourceItem.urlLength) &&
        Objects.equals(this.relativeUrlLength, onPageHtmlResourceItem.relativeUrlLength) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(meta, pageTiming, onpageScore, totalDomSize, customJsResponse, customJsClientException, brokenResources, brokenLinks, duplicateTitle, duplicateDescription, duplicateContent, clickDepth, isResource, urlLength, relativeUrlLength);
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
    sb.append("class OnPageHtmlResourceItem {\n");

    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    pageTiming: ").append(toIndentedString(pageTiming)).append("\n");
    sb.append("    onpageScore: ").append(toIndentedString(onpageScore)).append("\n");
    sb.append("    totalDomSize: ").append(toIndentedString(totalDomSize)).append("\n");
    sb.append("    customJsResponse: ").append(toIndentedString(customJsResponse)).append("\n");
    sb.append("    customJsClientException: ").append(toIndentedString(customJsClientException)).append("\n");
    sb.append("    brokenResources: ").append(toIndentedString(brokenResources)).append("\n");
    sb.append("    brokenLinks: ").append(toIndentedString(brokenLinks)).append("\n");
    sb.append("    duplicateTitle: ").append(toIndentedString(duplicateTitle)).append("\n");
    sb.append("    duplicateDescription: ").append(toIndentedString(duplicateDescription)).append("\n");
    sb.append("    duplicateContent: ").append(toIndentedString(duplicateContent)).append("\n");
    sb.append("    clickDepth: ").append(toIndentedString(clickDepth)).append("\n");
    sb.append("    isResource: ").append(toIndentedString(isResource)).append("\n");
    sb.append("    urlLength: ").append(toIndentedString(urlLength)).append("\n");
    sb.append("    relativeUrlLength: ").append(toIndentedString(relativeUrlLength)).append("\n");
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
    
    openapiFields.add("custom_js_client_exception");
    
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
   * @throws IOException if the JSON Element is invalid with respect to OnPageHtmlResourceItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageHtmlResourceItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageHtmlResourceItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageHtmlResourceItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageHtmlResourceItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageHtmlResourceItem>() {
           @Override
           public void write(JsonWriter out, OnPageHtmlResourceItem value) throws IOException {
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
           public OnPageHtmlResourceItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageHtmlResourceItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageHtmlResourceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageHtmlResourceItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}