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


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * OnPageAvailableFiltersResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class OnPageAvailableFiltersResultInfo {
  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Map<String, String> resources;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Map<String, String> pages;

  public static final String SERIALIZED_NAME_NON_INDEXABLE = "non_indexable";
  @SerializedName(SERIALIZED_NAME_NON_INDEXABLE)
  private Map<String, String> nonIndexable;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links;

  public static final String SERIALIZED_NAME_PAGES_BY_RESOURCE = "pages_by_resource";
  @SerializedName(SERIALIZED_NAME_PAGES_BY_RESOURCE)
  private Map<String, String> pagesByResource;

  public static final String SERIALIZED_NAME_REDIRECT_CHAINS = "redirect_chains";
  @SerializedName(SERIALIZED_NAME_REDIRECT_CHAINS)
  private Map<String, String> redirectChains;

  public static final String SERIALIZED_NAME_KEYWORD_DENSITY = "keyword_density";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DENSITY)
  private Map<String, String> keywordDensity;

  public OnPageAvailableFiltersResultInfo() {
  }

  public OnPageAvailableFiltersResultInfo resources(Map<String, String> resources) {
    this.resources = resources;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putResourcesItem(String key, String resourcesItem) {
    if (this.resources == null) {
      this.resources = new HashMap<>();
    }
    this.resources.put(key, resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public Map<String, String> getResources() {
    return resources;
  }

  public void setResources(Map<String, String> resources) {
    this.resources = resources;
  }


  public OnPageAvailableFiltersResultInfo pages(Map<String, String> pages) {
    this.pages = pages;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putPagesItem(String key, String pagesItem) {
    if (this.pages == null) {
      this.pages = new HashMap<>();
    }
    this.pages.put(key, pagesItem);
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  public Map<String, String> getPages() {
    return pages;
  }

  public void setPages(Map<String, String> pages) {
    this.pages = pages;
  }


  public OnPageAvailableFiltersResultInfo nonIndexable(Map<String, String> nonIndexable) {
    this.nonIndexable = nonIndexable;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putNonIndexableItem(String key, String nonIndexableItem) {
    if (this.nonIndexable == null) {
      this.nonIndexable = new HashMap<>();
    }
    this.nonIndexable.put(key, nonIndexableItem);
    return this;
  }

   /**
   * Get nonIndexable
   * @return nonIndexable
  **/
  @javax.annotation.Nullable
  public Map<String, String> getNonIndexable() {
    return nonIndexable;
  }

  public void setNonIndexable(Map<String, String> nonIndexable) {
    this.nonIndexable = nonIndexable;
  }


  public OnPageAvailableFiltersResultInfo links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  public OnPageAvailableFiltersResultInfo pagesByResource(Map<String, String> pagesByResource) {
    this.pagesByResource = pagesByResource;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putPagesByResourceItem(String key, String pagesByResourceItem) {
    if (this.pagesByResource == null) {
      this.pagesByResource = new HashMap<>();
    }
    this.pagesByResource.put(key, pagesByResourceItem);
    return this;
  }

   /**
   * Get pagesByResource
   * @return pagesByResource
  **/
  @javax.annotation.Nullable
  public Map<String, String> getPagesByResource() {
    return pagesByResource;
  }

  public void setPagesByResource(Map<String, String> pagesByResource) {
    this.pagesByResource = pagesByResource;
  }


  public OnPageAvailableFiltersResultInfo redirectChains(Map<String, String> redirectChains) {
    this.redirectChains = redirectChains;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putRedirectChainsItem(String key, String redirectChainsItem) {
    if (this.redirectChains == null) {
      this.redirectChains = new HashMap<>();
    }
    this.redirectChains.put(key, redirectChainsItem);
    return this;
  }

   /**
   * Get redirectChains
   * @return redirectChains
  **/
  @javax.annotation.Nullable
  public Map<String, String> getRedirectChains() {
    return redirectChains;
  }

  public void setRedirectChains(Map<String, String> redirectChains) {
    this.redirectChains = redirectChains;
  }


  public OnPageAvailableFiltersResultInfo keywordDensity(Map<String, String> keywordDensity) {
    this.keywordDensity = keywordDensity;
    return this;
  }

  public OnPageAvailableFiltersResultInfo putKeywordDensityItem(String key, String keywordDensityItem) {
    if (this.keywordDensity == null) {
      this.keywordDensity = new HashMap<>();
    }
    this.keywordDensity.put(key, keywordDensityItem);
    return this;
  }

   /**
   * Get keywordDensity
   * @return keywordDensity
  **/
  @javax.annotation.Nullable
  public Map<String, String> getKeywordDensity() {
    return keywordDensity;
  }

  public void setKeywordDensity(Map<String, String> keywordDensity) {
    this.keywordDensity = keywordDensity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnPageAvailableFiltersResultInfo onPageAvailableFiltersResultInfo = (OnPageAvailableFiltersResultInfo) o;
    return Objects.equals(this.resources, onPageAvailableFiltersResultInfo.resources) &&
        Objects.equals(this.pages, onPageAvailableFiltersResultInfo.pages) &&
        Objects.equals(this.nonIndexable, onPageAvailableFiltersResultInfo.nonIndexable) &&
        Objects.equals(this.links, onPageAvailableFiltersResultInfo.links) &&
        Objects.equals(this.pagesByResource, onPageAvailableFiltersResultInfo.pagesByResource) &&
        Objects.equals(this.redirectChains, onPageAvailableFiltersResultInfo.redirectChains) &&
        Objects.equals(this.keywordDensity, onPageAvailableFiltersResultInfo.keywordDensity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, pages, nonIndexable, links, pagesByResource, redirectChains, keywordDensity);
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
    sb.append("class OnPageAvailableFiltersResultInfo {\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    nonIndexable: ").append(toIndentedString(nonIndexable)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    pagesByResource: ").append(toIndentedString(pagesByResource)).append("\n");
    sb.append("    redirectChains: ").append(toIndentedString(redirectChains)).append("\n");
    sb.append("    keywordDensity: ").append(toIndentedString(keywordDensity)).append("\n");
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
    openapiFields.add("resources");
    openapiFields.add("pages");
    openapiFields.add("non_indexable");
    openapiFields.add("links");
    openapiFields.add("pages_by_resource");
    openapiFields.add("redirect_chains");
    openapiFields.add("keyword_density");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OnPageAvailableFiltersResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnPageAvailableFiltersResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnPageAvailableFiltersResultInfo is not found in the empty JSON string", OnPageAvailableFiltersResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnPageAvailableFiltersResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnPageAvailableFiltersResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageAvailableFiltersResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageAvailableFiltersResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageAvailableFiltersResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageAvailableFiltersResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageAvailableFiltersResultInfo>() {
           @Override
           public void write(JsonWriter out, OnPageAvailableFiltersResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnPageAvailableFiltersResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnPageAvailableFiltersResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnPageAvailableFiltersResultInfo
  * @throws IOException if the JSON string is invalid with respect to OnPageAvailableFiltersResultInfo
  */
  public static OnPageAvailableFiltersResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageAvailableFiltersResultInfo.class);
  }

 /**
  * Convert an instance of OnPageAvailableFiltersResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
