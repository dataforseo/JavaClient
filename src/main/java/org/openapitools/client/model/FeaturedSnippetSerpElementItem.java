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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BaseSerpElementItem;
import org.openapitools.client.model.ImagesElement;
import org.openapitools.client.model.Rectangle;
import org.openapitools.client.model.Table;
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

import org.openapitools.client.JSON;

/**
 * FeaturedSnippetSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:03:59.388297468Z[Etc/UTC]")
public class FeaturedSnippetSerpElementItem extends BaseSerpElementItem {
  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private String breadcrumb;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_FEATURED_TITLE = "featured_title";
  @SerializedName(SERIALIZED_NAME_FEATURED_TITLE)
  private String featuredTitle;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImagesElement> images;

  public static final String SERIALIZED_NAME_TABLE = "table";
  @SerializedName(SERIALIZED_NAME_TABLE)
  private Table table;

  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private Rectangle rectangle;

  public FeaturedSnippetSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public FeaturedSnippetSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

   /**
   * group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
  **/
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public FeaturedSnippetSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

   /**
   * absolute rank in SERP absolute position among all the elements found in SERP note values are returned in the ascending order, with values corresponding to advanced SERP features omitted from the results; to get all items (including SERP features and rich snippets) with their positions, please refer to the Google Organiс Advanced SERP endpoint
   * @return rankAbsolute
  **/
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public FeaturedSnippetSerpElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * domain of the ad element in SERP
   * @return domain
  **/
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public FeaturedSnippetSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the ad element in SERP
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public FeaturedSnippetSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the ad element in SERP
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public FeaturedSnippetSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * relevant URL of the ad element in SERP
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public FeaturedSnippetSerpElementItem breadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

   /**
   * breadcrumb of the ad element in SERP
   * @return breadcrumb
  **/
  @javax.annotation.Nullable
  public String getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public FeaturedSnippetSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the element in SERP can take the following values: left, right
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public FeaturedSnippetSerpElementItem xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

   /**
   * the XPath of the element
   * @return xpath
  **/
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public FeaturedSnippetSerpElementItem featuredTitle(String featuredTitle) {
    this.featuredTitle = featuredTitle;
    return this;
  }

   /**
   * title
   * @return featuredTitle
  **/
  @javax.annotation.Nullable
  public String getFeaturedTitle() {
    return featuredTitle;
  }

  public void setFeaturedTitle(String featuredTitle) {
    this.featuredTitle = featuredTitle;
  }


  public FeaturedSnippetSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * date and time when the result was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public FeaturedSnippetSerpElementItem images(List<ImagesElement> images) {
    this.images = images;
    return this;
  }

  public FeaturedSnippetSerpElementItem addImagesItem(ImagesElement imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * images of the element
   * @return images
  **/
  @javax.annotation.Nullable
  public List<ImagesElement> getImages() {
    return images;
  }

  public void setImages(List<ImagesElement> images) {
    this.images = images;
  }


  public FeaturedSnippetSerpElementItem table(Table table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @javax.annotation.Nullable
  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }


  public FeaturedSnippetSerpElementItem rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Get rectangle
   * @return rectangle
  **/
  @javax.annotation.Nullable
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedSnippetSerpElementItem featuredSnippetSerpElementItem = (FeaturedSnippetSerpElementItem) o;
    return Objects.equals(this.rankGroup, featuredSnippetSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, featuredSnippetSerpElementItem.rankAbsolute) &&
        Objects.equals(this.domain, featuredSnippetSerpElementItem.domain) &&
        Objects.equals(this.title, featuredSnippetSerpElementItem.title) &&
        Objects.equals(this.description, featuredSnippetSerpElementItem.description) &&
        Objects.equals(this.url, featuredSnippetSerpElementItem.url) &&
        Objects.equals(this.breadcrumb, featuredSnippetSerpElementItem.breadcrumb) &&
        Objects.equals(this.position, featuredSnippetSerpElementItem.position) &&
        Objects.equals(this.xpath, featuredSnippetSerpElementItem.xpath) &&
        Objects.equals(this.featuredTitle, featuredSnippetSerpElementItem.featuredTitle) &&
        Objects.equals(this.timestamp, featuredSnippetSerpElementItem.timestamp) &&
        Objects.equals(this.images, featuredSnippetSerpElementItem.images) &&
        Objects.equals(this.table, featuredSnippetSerpElementItem.table) &&
        Objects.equals(this.rectangle, featuredSnippetSerpElementItem.rectangle) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, domain, title, description, url, breadcrumb, position, xpath, featuredTitle, timestamp, images, table, rectangle, super.hashCode());
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
    sb.append("class FeaturedSnippetSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    featuredTitle: ").append(toIndentedString(featuredTitle)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
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
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("domain");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("url");
    openapiFields.add("breadcrumb");
    openapiFields.add("position");
    openapiFields.add("xpath");
    openapiFields.add("featured_title");
    openapiFields.add("timestamp");
    openapiFields.add("images");
    openapiFields.add("table");
    openapiFields.add("rectangle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FeaturedSnippetSerpElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeaturedSnippetSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeaturedSnippetSerpElementItem is not found in the empty JSON string", FeaturedSnippetSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeaturedSnippetSerpElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeaturedSnippetSerpElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeaturedSnippetSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeaturedSnippetSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeaturedSnippetSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeaturedSnippetSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<FeaturedSnippetSerpElementItem>() {
           @Override
           public void write(JsonWriter out, FeaturedSnippetSerpElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeaturedSnippetSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeaturedSnippetSerpElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeaturedSnippetSerpElementItem
  * @throws IOException if the JSON string is invalid with respect to FeaturedSnippetSerpElementItem
  */
  public static FeaturedSnippetSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeaturedSnippetSerpElementItem.class);
  }

 /**
  * Convert an instance of FeaturedSnippetSerpElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

