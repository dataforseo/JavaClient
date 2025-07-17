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



public class BacklinksAvailableFiltersResultInfo  {


  public static final String SERIALIZED_NAME_CONTENT_DUPLICATES = "content_duplicates";
  @SerializedName(SERIALIZED_NAME_CONTENT_DUPLICATES)
  private Map<String, String> contentDuplicates;

  public BacklinksAvailableFiltersResultInfo contentDuplicates(Map<String, String> contentDuplicates) {
    this.contentDuplicates = contentDuplicates;
    return this;
  }

  /**
   * 
   * @return contentDuplicates
   */
  @javax.annotation.Nullable
  public Map<String, String> getContentDuplicates() {
    return contentDuplicates;
  }

  public void setContentDuplicates(Map<String, String> contentDuplicates) {
    this.contentDuplicates = contentDuplicates;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Map<String, String> backlinks;

  public BacklinksAvailableFiltersResultInfo backlinks(Map<String, String> backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * 
   * @return backlinks
   */
  @javax.annotation.Nullable
  public Map<String, String> getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(Map<String, String> backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_DOMAIN_PAGES = "domain_pages";
  @SerializedName(SERIALIZED_NAME_DOMAIN_PAGES)
  private Map<String, String> domainPages;

  public BacklinksAvailableFiltersResultInfo domainPages(Map<String, String> domainPages) {
    this.domainPages = domainPages;
    return this;
  }

  /**
   * 
   * @return domainPages
   */
  @javax.annotation.Nullable
  public Map<String, String> getDomainPages() {
    return domainPages;
  }

  public void setDomainPages(Map<String, String> domainPages) {
    this.domainPages = domainPages;
  }


  public static final String SERIALIZED_NAME_ANCHORS = "anchors";
  @SerializedName(SERIALIZED_NAME_ANCHORS)
  private Map<String, String> anchors;

  public BacklinksAvailableFiltersResultInfo anchors(Map<String, String> anchors) {
    this.anchors = anchors;
    return this;
  }

  /**
   * 
   * @return anchors
   */
  @javax.annotation.Nullable
  public Map<String, String> getAnchors() {
    return anchors;
  }

  public void setAnchors(Map<String, String> anchors) {
    this.anchors = anchors;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Map<String, String> referringDomains;

  public BacklinksAvailableFiltersResultInfo referringDomains(Map<String, String> referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * 
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public Map<String, String> getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Map<String, String> referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INTERSECTION = "domain_intersection";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INTERSECTION)
  private Map<String, String> domainIntersection;

  public BacklinksAvailableFiltersResultInfo domainIntersection(Map<String, String> domainIntersection) {
    this.domainIntersection = domainIntersection;
    return this;
  }

  /**
   * 
   * @return domainIntersection
   */
  @javax.annotation.Nullable
  public Map<String, String> getDomainIntersection() {
    return domainIntersection;
  }

  public void setDomainIntersection(Map<String, String> domainIntersection) {
    this.domainIntersection = domainIntersection;
  }


  public static final String SERIALIZED_NAME_PAGE_INTERSECTION = "page_intersection";
  @SerializedName(SERIALIZED_NAME_PAGE_INTERSECTION)
  private Map<String, String> pageIntersection;

  public BacklinksAvailableFiltersResultInfo pageIntersection(Map<String, String> pageIntersection) {
    this.pageIntersection = pageIntersection;
    return this;
  }

  /**
   * 
   * @return pageIntersection
   */
  @javax.annotation.Nullable
  public Map<String, String> getPageIntersection() {
    return pageIntersection;
  }

  public void setPageIntersection(Map<String, String> pageIntersection) {
    this.pageIntersection = pageIntersection;
  }


  public static final String SERIALIZED_NAME_REFERRING_NETWORKS = "referring_networks";
  @SerializedName(SERIALIZED_NAME_REFERRING_NETWORKS)
  private Map<String, String> referringNetworks;

  public BacklinksAvailableFiltersResultInfo referringNetworks(Map<String, String> referringNetworks) {
    this.referringNetworks = referringNetworks;
    return this;
  }

  /**
   * 
   * @return referringNetworks
   */
  @javax.annotation.Nullable
  public Map<String, String> getReferringNetworks() {
    return referringNetworks;
  }

  public void setReferringNetworks(Map<String, String> referringNetworks) {
    this.referringNetworks = referringNetworks;
  }


  public static final String SERIALIZED_NAME_DOMAIN_PAGES_SUMMARY = "domain_pages_summary";
  @SerializedName(SERIALIZED_NAME_DOMAIN_PAGES_SUMMARY)
  private Map<String, String> domainPagesSummary;

  public BacklinksAvailableFiltersResultInfo domainPagesSummary(Map<String, String> domainPagesSummary) {
    this.domainPagesSummary = domainPagesSummary;
    return this;
  }

  /**
   * 
   * @return domainPagesSummary
   */
  @javax.annotation.Nullable
  public Map<String, String> getDomainPagesSummary() {
    return domainPagesSummary;
  }

  public void setDomainPagesSummary(Map<String, String> domainPagesSummary) {
    this.domainPagesSummary = domainPagesSummary;
  }


  public static final String SERIALIZED_NAME_COMPETITORS = "competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private Map<String, String> competitors;

  public BacklinksAvailableFiltersResultInfo competitors(Map<String, String> competitors) {
    this.competitors = competitors;
    return this;
  }

  /**
   * 
   * @return competitors
   */
  @javax.annotation.Nullable
  public Map<String, String> getCompetitors() {
    return competitors;
  }

  public void setCompetitors(Map<String, String> competitors) {
    this.competitors = competitors;
  }



  public BacklinksAvailableFiltersResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksAvailableFiltersResultInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksAvailableFiltersResultInfo backlinksAvailableFiltersResultInfo = (BacklinksAvailableFiltersResultInfo) o;
    return

        Objects.equals(this.contentDuplicates, backlinksAvailableFiltersResultInfo.contentDuplicates) &&
        Objects.equals(this.backlinks, backlinksAvailableFiltersResultInfo.backlinks) &&
        Objects.equals(this.domainPages, backlinksAvailableFiltersResultInfo.domainPages) &&
        Objects.equals(this.anchors, backlinksAvailableFiltersResultInfo.anchors) &&
        Objects.equals(this.referringDomains, backlinksAvailableFiltersResultInfo.referringDomains) &&
        Objects.equals(this.domainIntersection, backlinksAvailableFiltersResultInfo.domainIntersection) &&
        Objects.equals(this.pageIntersection, backlinksAvailableFiltersResultInfo.pageIntersection) &&
        Objects.equals(this.referringNetworks, backlinksAvailableFiltersResultInfo.referringNetworks) &&
        Objects.equals(this.domainPagesSummary, backlinksAvailableFiltersResultInfo.domainPagesSummary) &&
        Objects.equals(this.competitors, backlinksAvailableFiltersResultInfo.competitors);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(contentDuplicates, backlinks, domainPages, anchors, referringDomains, domainIntersection, pageIntersection, referringNetworks, domainPagesSummary, competitors);
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
    sb.append("class BacklinksAvailableFiltersResultInfo {\n");

    sb.append("    contentDuplicates: ").append(toIndentedString(contentDuplicates)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    domainPages: ").append(toIndentedString(domainPages)).append("\n");
    sb.append("    anchors: ").append(toIndentedString(anchors)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    domainIntersection: ").append(toIndentedString(domainIntersection)).append("\n");
    sb.append("    pageIntersection: ").append(toIndentedString(pageIntersection)).append("\n");
    sb.append("    referringNetworks: ").append(toIndentedString(referringNetworks)).append("\n");
    sb.append("    domainPagesSummary: ").append(toIndentedString(domainPagesSummary)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
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
    
    openapiFields.add("content_duplicates");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("domain_pages");
    
    openapiFields.add("anchors");
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("domain_intersection");
    
    openapiFields.add("page_intersection");
    
    openapiFields.add("referring_networks");
    
    openapiFields.add("domain_pages_summary");
    
    openapiFields.add("competitors");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksAvailableFiltersResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksAvailableFiltersResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksAvailableFiltersResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksAvailableFiltersResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksAvailableFiltersResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksAvailableFiltersResultInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksAvailableFiltersResultInfo value) throws IOException {
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
           public BacklinksAvailableFiltersResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksAvailableFiltersResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksAvailableFiltersResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksAvailableFiltersResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}