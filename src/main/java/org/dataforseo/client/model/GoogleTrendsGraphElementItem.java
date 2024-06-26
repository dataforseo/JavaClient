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
import org.dataforseo.client.model.BaseGoogleTrendsItem;
import org.dataforseo.client.model.TrendsGraphDataInfo;
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
 * GoogleTrendsGraphElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
public class GoogleTrendsGraphElementItem extends BaseGoogleTrendsItem {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<TrendsGraphDataInfo> data;

  public static final String SERIALIZED_NAME_AVERAGES = "averages";
  @SerializedName(SERIALIZED_NAME_AVERAGES)
  private List<Double> averages;

  public GoogleTrendsGraphElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public GoogleTrendsGraphElementItem position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the element in Google Trends can take the following values: 1, 2, 3, 4, etc.
   * @return position
  **/
  @javax.annotation.Nullable
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  public GoogleTrendsGraphElementItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the element in Google Trends
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public GoogleTrendsGraphElementItem keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public GoogleTrendsGraphElementItem addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * relevant keywords the data included in the google_trends_graph element is based on the keywords listed in this array
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public GoogleTrendsGraphElementItem data(List<TrendsGraphDataInfo> data) {
    this.data = data;
    return this;
  }

  public GoogleTrendsGraphElementItem addDataItem(TrendsGraphDataInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Google Trends data for the specified parameters
   * @return data
  **/
  @javax.annotation.Nullable
  public List<TrendsGraphDataInfo> getData() {
    return data;
  }

  public void setData(List<TrendsGraphDataInfo> data) {
    this.data = data;
  }


  public GoogleTrendsGraphElementItem averages(List<Double> averages) {
    this.averages = averages;
    return this;
  }

  public GoogleTrendsGraphElementItem addAveragesItem(Double averagesItem) {
    if (this.averages == null) {
      this.averages = new ArrayList<>();
    }
    this.averages.add(averagesItem);
    return this;
  }

   /**
   * keyword popularity values averaged over the whole time range
   * @return averages
  **/
  @javax.annotation.Nullable
  public List<Double> getAverages() {
    return averages;
  }

  public void setAverages(List<Double> averages) {
    this.averages = averages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleTrendsGraphElementItem googleTrendsGraphElementItem = (GoogleTrendsGraphElementItem) o;
    return Objects.equals(this.position, googleTrendsGraphElementItem.position) &&
        Objects.equals(this.title, googleTrendsGraphElementItem.title) &&
        Objects.equals(this.keywords, googleTrendsGraphElementItem.keywords) &&
        Objects.equals(this.data, googleTrendsGraphElementItem.data) &&
        Objects.equals(this.averages, googleTrendsGraphElementItem.averages) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, title, keywords, data, averages, super.hashCode());
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
    sb.append("class GoogleTrendsGraphElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    averages: ").append(toIndentedString(averages)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("title");
    openapiFields.add("keywords");
    openapiFields.add("data");
    openapiFields.add("averages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GoogleTrendsGraphElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleTrendsGraphElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleTrendsGraphElementItem is not found in the empty JSON string", GoogleTrendsGraphElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleTrendsGraphElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleTrendsGraphElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleTrendsGraphElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleTrendsGraphElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleTrendsGraphElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleTrendsGraphElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleTrendsGraphElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleTrendsGraphElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleTrendsGraphElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoogleTrendsGraphElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoogleTrendsGraphElementItem
  * @throws IOException if the JSON string is invalid with respect to GoogleTrendsGraphElementItem
  */
  public static GoogleTrendsGraphElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleTrendsGraphElementItem.class);
  }

 /**
  * Convert an instance of GoogleTrendsGraphElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

