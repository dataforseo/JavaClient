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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.dataforseo.client.model.BaseBusinessDataSerpElementItem;
import org.dataforseo.client.model.LinkElement;
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
 * GoogleBusinessPostBusinessDataSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class GoogleBusinessPostBusinessDataSerpElementItem extends BaseBusinessDataSerpElementItem {
  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public static final String SERIALIZED_NAME_POST_TEXT = "post_text";
  @SerializedName(SERIALIZED_NAME_POST_TEXT)
  private String postText;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IMAGES_URL = "images_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_URL)
  private String imagesUrl;

  public static final String SERIALIZED_NAME_POST_DATE = "post_date";
  @SerializedName(SERIALIZED_NAME_POST_DATE)
  private String postDate;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkElement> links;

  public GoogleBusinessPostBusinessDataSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public GoogleBusinessPostBusinessDataSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

   /**
   * position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
  **/
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

   /**
   * absolute rank among all the listed updates absolute position among all present elements
   * @return rankAbsolute
  **/
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the element in SERP can take the following values: right
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem xpath(String xpath) {
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


  public GoogleBusinessPostBusinessDataSerpElementItem author(String author) {
    this.author = author;
    return this;
  }

   /**
   * author of the post
   * @return author
  **/
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * additional content of a post
   * @return snippet
  **/
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem postText(String postText) {
    this.postText = postText;
    return this;
  }

   /**
   * main content of a post
   * @return postText
  **/
  @javax.annotation.Nullable
  public String getPostText() {
    return postText;
  }

  public void setPostText(String postText) {
    this.postText = postText;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url of a post
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem imagesUrl(String imagesUrl) {
    this.imagesUrl = imagesUrl;
    return this;
  }

   /**
   * url of an image included in the post
   * @return imagesUrl
  **/
  @javax.annotation.Nullable
  public String getImagesUrl() {
    return imagesUrl;
  }

  public void setImagesUrl(String imagesUrl) {
    this.imagesUrl = imagesUrl;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem postDate(String postDate) {
    this.postDate = postDate;
    return this;
  }

   /**
   * date when a post was published in the following format: \&quot;mm/dd/yyyy hh:mm:ss\&quot;
   * @return postDate
  **/
  @javax.annotation.Nullable
  public String getPostDate() {
    return postDate;
  }

  public void setPostDate(String postDate) {
    this.postDate = postDate;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * time when a post was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public GoogleBusinessPostBusinessDataSerpElementItem links(List<LinkElement> links) {
    this.links = links;
    return this;
  }

  public GoogleBusinessPostBusinessDataSerpElementItem addLinksItem(LinkElement linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * links included in the post
   * @return links
  **/
  @javax.annotation.Nullable
  public List<LinkElement> getLinks() {
    return links;
  }

  public void setLinks(List<LinkElement> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleBusinessPostBusinessDataSerpElementItem googleBusinessPostBusinessDataSerpElementItem = (GoogleBusinessPostBusinessDataSerpElementItem) o;
    return Objects.equals(this.rankGroup, googleBusinessPostBusinessDataSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, googleBusinessPostBusinessDataSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, googleBusinessPostBusinessDataSerpElementItem.position) &&
        Objects.equals(this.xpath, googleBusinessPostBusinessDataSerpElementItem.xpath) &&
        Objects.equals(this.author, googleBusinessPostBusinessDataSerpElementItem.author) &&
        Objects.equals(this.snippet, googleBusinessPostBusinessDataSerpElementItem.snippet) &&
        Objects.equals(this.postText, googleBusinessPostBusinessDataSerpElementItem.postText) &&
        Objects.equals(this.url, googleBusinessPostBusinessDataSerpElementItem.url) &&
        Objects.equals(this.imagesUrl, googleBusinessPostBusinessDataSerpElementItem.imagesUrl) &&
        Objects.equals(this.postDate, googleBusinessPostBusinessDataSerpElementItem.postDate) &&
        Objects.equals(this.timestamp, googleBusinessPostBusinessDataSerpElementItem.timestamp) &&
        Objects.equals(this.links, googleBusinessPostBusinessDataSerpElementItem.links) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, position, xpath, author, snippet, postText, url, imagesUrl, postDate, timestamp, links, super.hashCode());
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
    sb.append("class GoogleBusinessPostBusinessDataSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    postText: ").append(toIndentedString(postText)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imagesUrl: ").append(toIndentedString(imagesUrl)).append("\n");
    sb.append("    postDate: ").append(toIndentedString(postDate)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("xpath");
    openapiFields.add("author");
    openapiFields.add("snippet");
    openapiFields.add("post_text");
    openapiFields.add("url");
    openapiFields.add("images_url");
    openapiFields.add("post_date");
    openapiFields.add("timestamp");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GoogleBusinessPostBusinessDataSerpElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleBusinessPostBusinessDataSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleBusinessPostBusinessDataSerpElementItem is not found in the empty JSON string", GoogleBusinessPostBusinessDataSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleBusinessPostBusinessDataSerpElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleBusinessPostBusinessDataSerpElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleBusinessPostBusinessDataSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleBusinessPostBusinessDataSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleBusinessPostBusinessDataSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleBusinessPostBusinessDataSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleBusinessPostBusinessDataSerpElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleBusinessPostBusinessDataSerpElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleBusinessPostBusinessDataSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoogleBusinessPostBusinessDataSerpElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoogleBusinessPostBusinessDataSerpElementItem
  * @throws IOException if the JSON string is invalid with respect to GoogleBusinessPostBusinessDataSerpElementItem
  */
  public static GoogleBusinessPostBusinessDataSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleBusinessPostBusinessDataSerpElementItem.class);
  }

 /**
  * Convert an instance of GoogleBusinessPostBusinessDataSerpElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
