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



public class BaseSerpApiBingPeopleAlsoAskExpandedElementItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem type(String type) {
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


  public static final String SERIALIZED_NAME_FEATURED_TITLE = "featured_title";
  @SerializedName(SERIALIZED_NAME_FEATURED_TITLE)
  private String featuredTitle;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem featuredTitle(String featuredTitle) {
    this.featuredTitle = featuredTitle;
    return this;
  }

  /**
   * title
   * @return featuredTitle
   */
  @javax.annotation.Nullable
  public String getFeaturedTitle() {
    return featuredTitle;
  }

  public void setFeaturedTitle(String featuredTitle) {
    this.featuredTitle = featuredTitle;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem url(String url) {
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


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain in SERP
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

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the result in SERP
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the results element in SERP
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AiModeImagesElementInfo> images;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem images(List<AiModeImagesElementInfo> images) {
    this.images = images;
    return this;
  }

  /**
   * images of the element
   * @return images
   */
  @javax.annotation.Nullable
  public List<AiModeImagesElementInfo> getImages() {
    return images;
  }

  public void setImages(List<AiModeImagesElementInfo> images) {
    this.images = images;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the video was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example: 2009-01-01 00:00:00 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_TABLE = "table";
  @SerializedName(SERIALIZED_NAME_TABLE)
  private Table table;

  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem table(Table table) {
    this.table = table;
    return this;
  }

  /**
   * results table
* if there are none, equals null
   * @return table
   */
  @javax.annotation.Nullable
  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }



  public BaseSerpApiBingPeopleAlsoAskExpandedElementItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseSerpApiBingPeopleAlsoAskExpandedElementItem baseSerpApiBingPeopleAlsoAskExpandedElementItem = (BaseSerpApiBingPeopleAlsoAskExpandedElementItem) o;
    return

        Objects.equals(this.type, baseSerpApiBingPeopleAlsoAskExpandedElementItem.type) &&
        Objects.equals(this.featuredTitle, baseSerpApiBingPeopleAlsoAskExpandedElementItem.featuredTitle) &&
        Objects.equals(this.url, baseSerpApiBingPeopleAlsoAskExpandedElementItem.url) &&
        Objects.equals(this.domain, baseSerpApiBingPeopleAlsoAskExpandedElementItem.domain) &&
        Objects.equals(this.title, baseSerpApiBingPeopleAlsoAskExpandedElementItem.title) &&
        Objects.equals(this.description, baseSerpApiBingPeopleAlsoAskExpandedElementItem.description) &&
        Objects.equals(this.images, baseSerpApiBingPeopleAlsoAskExpandedElementItem.images) &&
        Objects.equals(this.timestamp, baseSerpApiBingPeopleAlsoAskExpandedElementItem.timestamp) &&
        Objects.equals(this.table, baseSerpApiBingPeopleAlsoAskExpandedElementItem.table);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, featuredTitle, url, domain, title, description, images, timestamp, table);
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
    sb.append("class BaseSerpApiBingPeopleAlsoAskExpandedElementItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    featuredTitle: ").append(toIndentedString(featuredTitle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
    
    openapiFields.add("featured_title");
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("description");
    
    openapiFields.add("images");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("table");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseSerpApiBingPeopleAlsoAskExpandedElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseSerpApiBingPeopleAlsoAskExpandedElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}