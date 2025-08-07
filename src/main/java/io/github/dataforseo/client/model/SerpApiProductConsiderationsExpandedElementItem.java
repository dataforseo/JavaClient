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



public class SerpApiProductConsiderationsExpandedElementItem  extends BaseSerpApiProductConsiderationExpandedElementItem  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SerpApiProductConsiderationsExpandedElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the row
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_FEATURED_TITLE = "featured_title";
  @SerializedName(SERIALIZED_NAME_FEATURED_TITLE)
  private String featuredTitle;

  public SerpApiProductConsiderationsExpandedElementItem featuredTitle(String featuredTitle) {
    this.featuredTitle = featuredTitle;
    return this;
  }

  /**
   * the title of the featured snippets source page
   * @return featuredTitle
   */
  @javax.annotation.Nullable
  public String getFeaturedTitle() {
    return featuredTitle;
  }

  public void setFeaturedTitle(String featuredTitle) {
    this.featuredTitle = featuredTitle;
  }


  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private String breadcrumb;

  public SerpApiProductConsiderationsExpandedElementItem breadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

  /**
   * breadcrumb of the Ad element in SERP
   * @return breadcrumb
   */
  @javax.annotation.Nullable
  public String getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public SerpApiProductConsiderationsExpandedElementItem snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * text alongside the title
   * @return snippet
   */
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public SerpApiProductConsiderationsExpandedElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain where a link points
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SerpApiProductConsiderationsExpandedElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of element
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public SerpApiProductConsiderationsExpandedElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the result was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_RELATED_SEARCHES = "related_searches";
  @SerializedName(SERIALIZED_NAME_RELATED_SEARCHES)
  private List<String> relatedSearches;

  public SerpApiProductConsiderationsExpandedElementItem relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  /**
   * search queries related to the elment
   * @return relatedSearches
   */
  @javax.annotation.Nullable
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }


  public static final String SERIALIZED_NAME_ABOUT_THIS_RESULT = "about_this_result";
  @SerializedName(SERIALIZED_NAME_ABOUT_THIS_RESULT)
  private AboutThisResultElement aboutThisResult;

  public SerpApiProductConsiderationsExpandedElementItem aboutThisResult(AboutThisResultElement aboutThisResult) {
    this.aboutThisResult = aboutThisResult;
    return this;
  }

  /**
   * contains information from the ‘About this result’ panel
* ‘About this result’ panel provides additional context about why Google returned this result for the given query;
* this feature appears after clicking on the three dots next to most results
   * @return aboutThisResult
   */
  @javax.annotation.Nullable
  public AboutThisResultElement getAboutThisResult() {
    return aboutThisResult;
  }

  public void setAboutThisResult(AboutThisResultElement aboutThisResult) {
    this.aboutThisResult = aboutThisResult;
  }



  public SerpApiProductConsiderationsExpandedElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiProductConsiderationsExpandedElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiProductConsiderationsExpandedElementItem serpApiProductConsiderationsExpandedElementItem = (SerpApiProductConsiderationsExpandedElementItem) o;
    return

        Objects.equals(this.title, serpApiProductConsiderationsExpandedElementItem.title) &&
        Objects.equals(this.featuredTitle, serpApiProductConsiderationsExpandedElementItem.featuredTitle) &&
        Objects.equals(this.breadcrumb, serpApiProductConsiderationsExpandedElementItem.breadcrumb) &&
        Objects.equals(this.snippet, serpApiProductConsiderationsExpandedElementItem.snippet) &&
        Objects.equals(this.domain, serpApiProductConsiderationsExpandedElementItem.domain) &&
        Objects.equals(this.url, serpApiProductConsiderationsExpandedElementItem.url) &&
        Objects.equals(this.timestamp, serpApiProductConsiderationsExpandedElementItem.timestamp) &&
        Objects.equals(this.relatedSearches, serpApiProductConsiderationsExpandedElementItem.relatedSearches) &&
        Objects.equals(this.aboutThisResult, serpApiProductConsiderationsExpandedElementItem.aboutThisResult) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, featuredTitle, breadcrumb, snippet, domain, url, timestamp, relatedSearches, aboutThisResult);
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
    sb.append("class SerpApiProductConsiderationsExpandedElementItem {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    featuredTitle: ").append(toIndentedString(featuredTitle)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    relatedSearches: ").append(toIndentedString(relatedSearches)).append("\n");
    sb.append("    aboutThisResult: ").append(toIndentedString(aboutThisResult)).append("\n");
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
    openapiFields.add("type");
    
    openapiFields.add("title");
    
    openapiFields.add("featured_title");
    
    openapiFields.add("breadcrumb");
    
    openapiFields.add("snippet");
    
    openapiFields.add("domain");
    
    openapiFields.add("url");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("related_searches");
    
    openapiFields.add("about_this_result");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpApiProductConsiderationsExpandedElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiProductConsiderationsExpandedElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiProductConsiderationsExpandedElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiProductConsiderationsExpandedElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiProductConsiderationsExpandedElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiProductConsiderationsExpandedElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiProductConsiderationsExpandedElementItem value) throws IOException {
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
           public SerpApiProductConsiderationsExpandedElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiProductConsiderationsExpandedElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiProductConsiderationsExpandedElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiProductConsiderationsExpandedElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}