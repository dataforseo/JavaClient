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
import org.dataforseo.client.model.BaseDataforseoTrendsItem;
import org.dataforseo.client.model.Interests;
import org.dataforseo.client.model.InterestsComparison;
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
 * DataforseoTrendsSubregionInterestsElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class DataforseoTrendsSubregionInterestsElementItem extends BaseDataforseoTrendsItem {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public static final String SERIALIZED_NAME_INTERESTS = "interests";
  @SerializedName(SERIALIZED_NAME_INTERESTS)
  private List<Interests> interests;

  public static final String SERIALIZED_NAME_INTERESTS_COMPARISON = "interests_comparison";
  @SerializedName(SERIALIZED_NAME_INTERESTS_COMPARISON)
  private InterestsComparison interestsComparison;

  public DataforseoTrendsSubregionInterestsElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public DataforseoTrendsSubregionInterestsElementItem position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the element can take the following values: 1, 2, 3, 4, etc.
   * @return position
  **/
  @javax.annotation.Nullable
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  public DataforseoTrendsSubregionInterestsElementItem keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public DataforseoTrendsSubregionInterestsElementItem addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * relevant keywords the data included in the interests and interests_comparison is based on the keywords listed in this array
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public DataforseoTrendsSubregionInterestsElementItem interests(List<Interests> interests) {
    this.interests = interests;
    return this;
  }

  public DataforseoTrendsSubregionInterestsElementItem addInterestsItem(Interests interestsItem) {
    if (this.interests == null) {
      this.interests = new ArrayList<>();
    }
    this.interests.add(interestsItem);
    return this;
  }

   /**
   * subregional keyword popuarity data for each specified term
   * @return interests
  **/
  @javax.annotation.Nullable
  public List<Interests> getInterests() {
    return interests;
  }

  public void setInterests(List<Interests> interests) {
    this.interests = interests;
  }


  public DataforseoTrendsSubregionInterestsElementItem interestsComparison(InterestsComparison interestsComparison) {
    this.interestsComparison = interestsComparison;
    return this;
  }

   /**
   * Get interestsComparison
   * @return interestsComparison
  **/
  @javax.annotation.Nullable
  public InterestsComparison getInterestsComparison() {
    return interestsComparison;
  }

  public void setInterestsComparison(InterestsComparison interestsComparison) {
    this.interestsComparison = interestsComparison;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataforseoTrendsSubregionInterestsElementItem dataforseoTrendsSubregionInterestsElementItem = (DataforseoTrendsSubregionInterestsElementItem) o;
    return Objects.equals(this.position, dataforseoTrendsSubregionInterestsElementItem.position) &&
        Objects.equals(this.keywords, dataforseoTrendsSubregionInterestsElementItem.keywords) &&
        Objects.equals(this.interests, dataforseoTrendsSubregionInterestsElementItem.interests) &&
        Objects.equals(this.interestsComparison, dataforseoTrendsSubregionInterestsElementItem.interestsComparison) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, keywords, interests, interestsComparison, super.hashCode());
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
    sb.append("class DataforseoTrendsSubregionInterestsElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    interestsComparison: ").append(toIndentedString(interestsComparison)).append("\n");
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
    openapiFields.add("keywords");
    openapiFields.add("interests");
    openapiFields.add("interests_comparison");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataforseoTrendsSubregionInterestsElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoTrendsSubregionInterestsElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoTrendsSubregionInterestsElementItem is not found in the empty JSON string", DataforseoTrendsSubregionInterestsElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataforseoTrendsSubregionInterestsElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataforseoTrendsSubregionInterestsElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoTrendsSubregionInterestsElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoTrendsSubregionInterestsElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoTrendsSubregionInterestsElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoTrendsSubregionInterestsElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoTrendsSubregionInterestsElementItem>() {
           @Override
           public void write(JsonWriter out, DataforseoTrendsSubregionInterestsElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataforseoTrendsSubregionInterestsElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataforseoTrendsSubregionInterestsElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataforseoTrendsSubregionInterestsElementItem
  * @throws IOException if the JSON string is invalid with respect to DataforseoTrendsSubregionInterestsElementItem
  */
  public static DataforseoTrendsSubregionInterestsElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoTrendsSubregionInterestsElementItem.class);
  }

 /**
  * Convert an instance of DataforseoTrendsSubregionInterestsElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
