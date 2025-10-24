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



public class RelatedResult  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RelatedResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public RelatedResult page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * search results page number
* indicates the number of the SERP page on which the element is located
   * @return page
   */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public RelatedResult xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public RelatedResult domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * website domain
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public RelatedResult title(String title) {
    this.title = title;
    return this;
  }

  /**
   * reference page title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public RelatedResult url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_CACHE_URL = "cache_url";
  @SerializedName(SERIALIZED_NAME_CACHE_URL)
  private String cacheUrl;

  public RelatedResult cacheUrl(String cacheUrl) {
    this.cacheUrl = cacheUrl;
    return this;
  }

  /**
   * cached version of the page
   * @return cacheUrl
   */
  @javax.annotation.Nullable
  public String getCacheUrl() {
    return cacheUrl;
  }

  public void setCacheUrl(String cacheUrl) {
    this.cacheUrl = cacheUrl;
  }


  public static final String SERIALIZED_NAME_RELATED_SEARCH_URL = "related_search_url";
  @SerializedName(SERIALIZED_NAME_RELATED_SEARCH_URL)
  private String relatedSearchUrl;

  public RelatedResult relatedSearchUrl(String relatedSearchUrl) {
    this.relatedSearchUrl = relatedSearchUrl;
    return this;
  }

  /**
   * URL to a similar search
* URL to a new search for the same keyword(s) on related sites
   * @return relatedSearchUrl
   */
  @javax.annotation.Nullable
  public String getRelatedSearchUrl() {
    return relatedSearchUrl;
  }

  public void setRelatedSearchUrl(String relatedSearchUrl) {
    this.relatedSearchUrl = relatedSearchUrl;
  }


  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private String breadcrumb;

  public RelatedResult breadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

  /**
   * breadcrumb in SERP
   * @return breadcrumb
   */
  @javax.annotation.Nullable
  public String getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public static final String SERIALIZED_NAME_WEBSITE_NAME = "website_name";
  @SerializedName(SERIALIZED_NAME_WEBSITE_NAME)
  private String websiteName;

  public RelatedResult websiteName(String websiteName) {
    this.websiteName = websiteName;
    return this;
  }

  /**
   * name of the website in the ad element
   * @return websiteName
   */
  @javax.annotation.Nullable
  public String getWebsiteName() {
    return websiteName;
  }

  public void setWebsiteName(String websiteName) {
    this.websiteName = websiteName;
  }


  public static final String SERIALIZED_NAME_IS_IMAGE = "is_image";
  @SerializedName(SERIALIZED_NAME_IS_IMAGE)
  private Boolean isImage;

  public RelatedResult isImage(Boolean isImage) {
    this.isImage = isImage;
    return this;
  }

  /**
   * indicates whether the element contains an image
   * @return isImage
   */
  @javax.annotation.Nullable
  public Boolean getIsImage() {
    return isImage;
  }

  public void setIsImage(Boolean isImage) {
    this.isImage = isImage;
  }


  public static final String SERIALIZED_NAME_IS_VIDEO = "is_video";
  @SerializedName(SERIALIZED_NAME_IS_VIDEO)
  private Boolean isVideo;

  public RelatedResult isVideo(Boolean isVideo) {
    this.isVideo = isVideo;
    return this;
  }

  /**
   * indicates whether the element contains a video
   * @return isVideo
   */
  @javax.annotation.Nullable
  public Boolean getIsVideo() {
    return isVideo;
  }

  public void setIsVideo(Boolean isVideo) {
    this.isVideo = isVideo;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public RelatedResult description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the hotel booking element
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_PRE_SNIPPET = "pre_snippet";
  @SerializedName(SERIALIZED_NAME_PRE_SNIPPET)
  private String preSnippet;

  public RelatedResult preSnippet(String preSnippet) {
    this.preSnippet = preSnippet;
    return this;
  }

  /**
   * includes additional information appended before the result description in SERP
   * @return preSnippet
   */
  @javax.annotation.Nullable
  public String getPreSnippet() {
    return preSnippet;
  }

  public void setPreSnippet(String preSnippet) {
    this.preSnippet = preSnippet;
  }


  public static final String SERIALIZED_NAME_EXTENDED_SNIPPET = "extended_snippet";
  @SerializedName(SERIALIZED_NAME_EXTENDED_SNIPPET)
  private String extendedSnippet;

  public RelatedResult extendedSnippet(String extendedSnippet) {
    this.extendedSnippet = extendedSnippet;
    return this;
  }

  /**
   * includes additional information appended after the result description in SERP
   * @return extendedSnippet
   */
  @javax.annotation.Nullable
  public String getExtendedSnippet() {
    return extendedSnippet;
  }

  public void setExtendedSnippet(String extendedSnippet) {
    this.extendedSnippet = extendedSnippet;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AiModeImagesElementInfo> images;

  public RelatedResult images(List<AiModeImagesElementInfo> images) {
    this.images = images;
    return this;
  }

  /**
   * images of the component
* if there are none, equals null
   * @return images
   */
  @javax.annotation.Nullable
  public List<AiModeImagesElementInfo> getImages() {
    return images;
  }

  public void setImages(List<AiModeImagesElementInfo> images) {
    this.images = images;
  }


  public static final String SERIALIZED_NAME_AMP_VERSION = "amp_version";
  @SerializedName(SERIALIZED_NAME_AMP_VERSION)
  private Boolean ampVersion;

  public RelatedResult ampVersion(Boolean ampVersion) {
    this.ampVersion = ampVersion;
    return this;
  }

  /**
   * Accelerated Mobile Pages
* indicates whether an item has the Accelerated Mobile Page (AMP) version
   * @return ampVersion
   */
  @javax.annotation.Nullable
  public Boolean getAmpVersion() {
    return ampVersion;
  }

  public void setAmpVersion(Boolean ampVersion) {
    this.ampVersion = ampVersion;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public RelatedResult rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the element’s rating
* the popularity rate based on reviews and displayed in SERP
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PriceInfo price;

  public RelatedResult price(PriceInfo price) {
    this.price = price;
    return this;
  }

  /**
   * price indicated in the element
   * @return price
   */
  @javax.annotation.Nullable
  public PriceInfo getPrice() {
    return price;
  }

  public void setPrice(PriceInfo price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_HIGHLIGHTED = "highlighted";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHTED)
  private List<String> highlighted;

  public RelatedResult highlighted(List<String> highlighted) {
    this.highlighted = highlighted;
    return this;
  }

  /**
   * words highlighted in bold within the results description
   * @return highlighted
   */
  @javax.annotation.Nullable
  public List<String> getHighlighted() {
    return highlighted;
  }

  public void setHighlighted(List<String> highlighted) {
    this.highlighted = highlighted;
  }


  public static final String SERIALIZED_NAME_ABOUT_THIS_RESULT = "about_this_result";
  @SerializedName(SERIALIZED_NAME_ABOUT_THIS_RESULT)
  private AboutThisResultElement aboutThisResult;

  public RelatedResult aboutThisResult(AboutThisResultElement aboutThisResult) {
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


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public RelatedResult timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the video was published or indexed
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



  public RelatedResult() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public RelatedResult putAdditionalProperty(String key, Object value) {
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


    
    RelatedResult relatedResult = (RelatedResult) o;
    return

        Objects.equals(this.type, relatedResult.type) &&
        Objects.equals(this.page, relatedResult.page) &&
        Objects.equals(this.xpath, relatedResult.xpath) &&
        Objects.equals(this.domain, relatedResult.domain) &&
        Objects.equals(this.title, relatedResult.title) &&
        Objects.equals(this.url, relatedResult.url) &&
        Objects.equals(this.cacheUrl, relatedResult.cacheUrl) &&
        Objects.equals(this.relatedSearchUrl, relatedResult.relatedSearchUrl) &&
        Objects.equals(this.breadcrumb, relatedResult.breadcrumb) &&
        Objects.equals(this.websiteName, relatedResult.websiteName) &&
        Objects.equals(this.isImage, relatedResult.isImage) &&
        Objects.equals(this.isVideo, relatedResult.isVideo) &&
        Objects.equals(this.description, relatedResult.description) &&
        Objects.equals(this.preSnippet, relatedResult.preSnippet) &&
        Objects.equals(this.extendedSnippet, relatedResult.extendedSnippet) &&
        Objects.equals(this.images, relatedResult.images) &&
        Objects.equals(this.ampVersion, relatedResult.ampVersion) &&
        Objects.equals(this.rating, relatedResult.rating) &&
        Objects.equals(this.price, relatedResult.price) &&
        Objects.equals(this.highlighted, relatedResult.highlighted) &&
        Objects.equals(this.aboutThisResult, relatedResult.aboutThisResult) &&
        Objects.equals(this.timestamp, relatedResult.timestamp);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, page, xpath, domain, title, url, cacheUrl, relatedSearchUrl, breadcrumb, websiteName, isImage, isVideo, description, preSnippet, extendedSnippet, images, ampVersion, rating, price, highlighted, aboutThisResult, timestamp);
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
    sb.append("class RelatedResult {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    cacheUrl: ").append(toIndentedString(cacheUrl)).append("\n");
    sb.append("    relatedSearchUrl: ").append(toIndentedString(relatedSearchUrl)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    websiteName: ").append(toIndentedString(websiteName)).append("\n");
    sb.append("    isImage: ").append(toIndentedString(isImage)).append("\n");
    sb.append("    isVideo: ").append(toIndentedString(isVideo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preSnippet: ").append(toIndentedString(preSnippet)).append("\n");
    sb.append("    extendedSnippet: ").append(toIndentedString(extendedSnippet)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    ampVersion: ").append(toIndentedString(ampVersion)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    highlighted: ").append(toIndentedString(highlighted)).append("\n");
    sb.append("    aboutThisResult: ").append(toIndentedString(aboutThisResult)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    
    openapiFields.add("page");
    
    openapiFields.add("xpath");
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("cache_url");
    
    openapiFields.add("related_search_url");
    
    openapiFields.add("breadcrumb");
    
    openapiFields.add("website_name");
    
    openapiFields.add("is_image");
    
    openapiFields.add("is_video");
    
    openapiFields.add("description");
    
    openapiFields.add("pre_snippet");
    
    openapiFields.add("extended_snippet");
    
    openapiFields.add("images");
    
    openapiFields.add("amp_version");
    
    openapiFields.add("rating");
    
    openapiFields.add("price");
    
    openapiFields.add("highlighted");
    
    openapiFields.add("about_this_result");
    
    openapiFields.add("timestamp");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelatedResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelatedResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelatedResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelatedResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelatedResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RelatedResult>() {
           @Override
           public void write(JsonWriter out, RelatedResult value) throws IOException {
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
           public RelatedResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RelatedResult instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static RelatedResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelatedResult.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}