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



public class PageMetrics  {


  public static final String SERIALIZED_NAME_LINKS_EXTERNAL = "links_external";
  @SerializedName(SERIALIZED_NAME_LINKS_EXTERNAL)
  private Integer linksExternal;

  public PageMetrics linksExternal(Integer linksExternal) {
    this.linksExternal = linksExternal;
    return this;
  }

  /**
   * number of external links
* the number of links pointing to other websites
   * @return linksExternal
   */
  @javax.annotation.Nullable
  public Integer getLinksExternal() {
    return linksExternal;
  }

  public void setLinksExternal(Integer linksExternal) {
    this.linksExternal = linksExternal;
  }


  public static final String SERIALIZED_NAME_LINKS_INTERNAL = "links_internal";
  @SerializedName(SERIALIZED_NAME_LINKS_INTERNAL)
  private Integer linksInternal;

  public PageMetrics linksInternal(Integer linksInternal) {
    this.linksInternal = linksInternal;
    return this;
  }

  /**
   * number of internal links
* the number of links pointing to other pages within the target website
   * @return linksInternal
   */
  @javax.annotation.Nullable
  public Integer getLinksInternal() {
    return linksInternal;
  }

  public void setLinksInternal(Integer linksInternal) {
    this.linksInternal = linksInternal;
  }


  public static final String SERIALIZED_NAME_DUPLICATE_TITLE = "duplicate_title";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_TITLE)
  private Integer duplicateTitle;

  public PageMetrics duplicateTitle(Integer duplicateTitle) {
    this.duplicateTitle = duplicateTitle;
    return this;
  }

  /**
   * number of pages with duplicate titles
   * @return duplicateTitle
   */
  @javax.annotation.Nullable
  public Integer getDuplicateTitle() {
    return duplicateTitle;
  }

  public void setDuplicateTitle(Integer duplicateTitle) {
    this.duplicateTitle = duplicateTitle;
  }


  public static final String SERIALIZED_NAME_DUPLICATE_DESCRIPTION = "duplicate_description";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_DESCRIPTION)
  private Integer duplicateDescription;

  public PageMetrics duplicateDescription(Integer duplicateDescription) {
    this.duplicateDescription = duplicateDescription;
    return this;
  }

  /**
   * number of pages with duplicate descriptions
   * @return duplicateDescription
   */
  @javax.annotation.Nullable
  public Integer getDuplicateDescription() {
    return duplicateDescription;
  }

  public void setDuplicateDescription(Integer duplicateDescription) {
    this.duplicateDescription = duplicateDescription;
  }


  public static final String SERIALIZED_NAME_DUPLICATE_CONTENT = "duplicate_content";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_CONTENT)
  private Integer duplicateContent;

  public PageMetrics duplicateContent(Integer duplicateContent) {
    this.duplicateContent = duplicateContent;
    return this;
  }

  /**
   * number of pages with duplicate content
   * @return duplicateContent
   */
  @javax.annotation.Nullable
  public Integer getDuplicateContent() {
    return duplicateContent;
  }

  public void setDuplicateContent(Integer duplicateContent) {
    this.duplicateContent = duplicateContent;
  }


  public static final String SERIALIZED_NAME_BROKEN_LINKS = "broken_links";
  @SerializedName(SERIALIZED_NAME_BROKEN_LINKS)
  private Integer brokenLinks;

  public PageMetrics brokenLinks(Integer brokenLinks) {
    this.brokenLinks = brokenLinks;
    return this;
  }

  /**
   * number of broken links
* number of broken links across all crawled pages on a target website
   * @return brokenLinks
   */
  @javax.annotation.Nullable
  public Integer getBrokenLinks() {
    return brokenLinks;
  }

  public void setBrokenLinks(Integer brokenLinks) {
    this.brokenLinks = brokenLinks;
  }


  public static final String SERIALIZED_NAME_BROKEN_RESOURCES = "broken_resources";
  @SerializedName(SERIALIZED_NAME_BROKEN_RESOURCES)
  private Integer brokenResources;

  public PageMetrics brokenResources(Integer brokenResources) {
    this.brokenResources = brokenResources;
    return this;
  }

  /**
   * number of broken resources
* the number of images and other resources with broken links
   * @return brokenResources
   */
  @javax.annotation.Nullable
  public Integer getBrokenResources() {
    return brokenResources;
  }

  public void setBrokenResources(Integer brokenResources) {
    this.brokenResources = brokenResources;
  }


  public static final String SERIALIZED_NAME_LINKS_RELATION_CONFLICT = "links_relation_conflict";
  @SerializedName(SERIALIZED_NAME_LINKS_RELATION_CONFLICT)
  private Integer linksRelationConflict;

  public PageMetrics linksRelationConflict(Integer linksRelationConflict) {
    this.linksRelationConflict = linksRelationConflict;
    return this;
  }

  /**
   * number of links present on the target website that may have a conflict
* for example, if 'links_relation_conflict': 2, the target website is referring to the same source by at least one internal link with the rel='nofollow' attribute and by at least one dofollow link
   * @return linksRelationConflict
   */
  @javax.annotation.Nullable
  public Integer getLinksRelationConflict() {
    return linksRelationConflict;
  }

  public void setLinksRelationConflict(Integer linksRelationConflict) {
    this.linksRelationConflict = linksRelationConflict;
  }


  public static final String SERIALIZED_NAME_REDIRECT_LOOP = "redirect_loop";
  @SerializedName(SERIALIZED_NAME_REDIRECT_LOOP)
  private Integer redirectLoop;

  public PageMetrics redirectLoop(Integer redirectLoop) {
    this.redirectLoop = redirectLoop;
    return this;
  }

  /**
   * number of redirect chains that start and end at the same URL
* number of redirect chains where the destination URL redirects back to the original URL
   * @return redirectLoop
   */
  @javax.annotation.Nullable
  public Integer getRedirectLoop() {
    return redirectLoop;
  }

  public void setRedirectLoop(Integer redirectLoop) {
    this.redirectLoop = redirectLoop;
  }


  public static final String SERIALIZED_NAME_ONPAGE_SCORE = "onpage_score";
  @SerializedName(SERIALIZED_NAME_ONPAGE_SCORE)
  private Double onpageScore;

  public PageMetrics onpageScore(Double onpageScore) {
    this.onpageScore = onpageScore;
    return this;
  }

  /**
   * shows how website is optimized on a 100-point scale
* this field shows how website is optimized considering critical on-page issues and warnings detected;
* 100 is the highest possible score that means website does not have any critical on-page issues and important warnings;
* note that this value depends on the number of crawled pages;
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


  public static final String SERIALIZED_NAME_NON_INDEXABLE = "non_indexable";
  @SerializedName(SERIALIZED_NAME_NON_INDEXABLE)
  private Integer nonIndexable;

  public PageMetrics nonIndexable(Integer nonIndexable) {
    this.nonIndexable = nonIndexable;
    return this;
  }

  /**
   * number of non-indexable pages
* number of pages that are blocked from being indexed by Google and other search engines by robots.txt, HTTP headers, or meta tags settings;
* you can receive a list of non-indexable URLs using this endpoint
   * @return nonIndexable
   */
  @javax.annotation.Nullable
  public Integer getNonIndexable() {
    return nonIndexable;
  }

  public void setNonIndexable(Integer nonIndexable) {
    this.nonIndexable = nonIndexable;
  }


  public static final String SERIALIZED_NAME_CHECKS = "checks";
  @SerializedName(SERIALIZED_NAME_CHECKS)
  private Map<String, Long> checks;

  public PageMetrics checks(Map<String, Long> checks) {
    this.checks = checks;
    return this;
  }

  /**
   * page-specific on-page check-ups
   * @return checks
   */
  @javax.annotation.Nullable
  public Map<String, Long> getChecks() {
    return checks;
  }

  public void setChecks(Map<String, Long> checks) {
    this.checks = checks;
  }



  public PageMetrics() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public PageMetrics putAdditionalProperty(String key, Object value) {
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


    
    PageMetrics pageMetrics = (PageMetrics) o;
    return

        Objects.equals(this.linksExternal, pageMetrics.linksExternal) &&
        Objects.equals(this.linksInternal, pageMetrics.linksInternal) &&
        Objects.equals(this.duplicateTitle, pageMetrics.duplicateTitle) &&
        Objects.equals(this.duplicateDescription, pageMetrics.duplicateDescription) &&
        Objects.equals(this.duplicateContent, pageMetrics.duplicateContent) &&
        Objects.equals(this.brokenLinks, pageMetrics.brokenLinks) &&
        Objects.equals(this.brokenResources, pageMetrics.brokenResources) &&
        Objects.equals(this.linksRelationConflict, pageMetrics.linksRelationConflict) &&
        Objects.equals(this.redirectLoop, pageMetrics.redirectLoop) &&
        Objects.equals(this.onpageScore, pageMetrics.onpageScore) &&
        Objects.equals(this.nonIndexable, pageMetrics.nonIndexable) &&
        Objects.equals(this.checks, pageMetrics.checks);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(linksExternal, linksInternal, duplicateTitle, duplicateDescription, duplicateContent, brokenLinks, brokenResources, linksRelationConflict, redirectLoop, onpageScore, nonIndexable, checks);
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
    sb.append("class PageMetrics {\n");

    sb.append("    linksExternal: ").append(toIndentedString(linksExternal)).append("\n");
    sb.append("    linksInternal: ").append(toIndentedString(linksInternal)).append("\n");
    sb.append("    duplicateTitle: ").append(toIndentedString(duplicateTitle)).append("\n");
    sb.append("    duplicateDescription: ").append(toIndentedString(duplicateDescription)).append("\n");
    sb.append("    duplicateContent: ").append(toIndentedString(duplicateContent)).append("\n");
    sb.append("    brokenLinks: ").append(toIndentedString(brokenLinks)).append("\n");
    sb.append("    brokenResources: ").append(toIndentedString(brokenResources)).append("\n");
    sb.append("    linksRelationConflict: ").append(toIndentedString(linksRelationConflict)).append("\n");
    sb.append("    redirectLoop: ").append(toIndentedString(redirectLoop)).append("\n");
    sb.append("    onpageScore: ").append(toIndentedString(onpageScore)).append("\n");
    sb.append("    nonIndexable: ").append(toIndentedString(nonIndexable)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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
    
    openapiFields.add("links_external");
    
    openapiFields.add("links_internal");
    
    openapiFields.add("duplicate_title");
    
    openapiFields.add("duplicate_description");
    
    openapiFields.add("duplicate_content");
    
    openapiFields.add("broken_links");
    
    openapiFields.add("broken_resources");
    
    openapiFields.add("links_relation_conflict");
    
    openapiFields.add("redirect_loop");
    
    openapiFields.add("onpage_score");
    
    openapiFields.add("non_indexable");
    
    openapiFields.add("checks");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageMetrics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<PageMetrics>() {
           @Override
           public void write(JsonWriter out, PageMetrics value) throws IOException {
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
           public PageMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PageMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static PageMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageMetrics.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}