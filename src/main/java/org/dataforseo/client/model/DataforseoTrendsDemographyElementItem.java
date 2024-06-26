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
import org.dataforseo.client.model.Demography;
import org.dataforseo.client.model.DemographyComparisonInfo;
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
 * DataforseoTrendsDemographyElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
public class DataforseoTrendsDemographyElementItem extends BaseDataforseoTrendsItem {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public static final String SERIALIZED_NAME_DEMOGRAPHY = "demography";
  @SerializedName(SERIALIZED_NAME_DEMOGRAPHY)
  private Demography demography;

  public static final String SERIALIZED_NAME_DEMOGRAPHY_COMPARISON = "demography_comparison";
  @SerializedName(SERIALIZED_NAME_DEMOGRAPHY_COMPARISON)
  private DemographyComparisonInfo demographyComparison;

  public DataforseoTrendsDemographyElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public DataforseoTrendsDemographyElementItem position(Integer position) {
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


  public DataforseoTrendsDemographyElementItem keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public DataforseoTrendsDemographyElementItem addKeywordsItem(String keywordsItem) {
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


  public DataforseoTrendsDemographyElementItem demography(Demography demography) {
    this.demography = demography;
    return this;
  }

   /**
   * Get demography
   * @return demography
  **/
  @javax.annotation.Nullable
  public Demography getDemography() {
    return demography;
  }

  public void setDemography(Demography demography) {
    this.demography = demography;
  }


  public DataforseoTrendsDemographyElementItem demographyComparison(DemographyComparisonInfo demographyComparison) {
    this.demographyComparison = demographyComparison;
    return this;
  }

   /**
   * Get demographyComparison
   * @return demographyComparison
  **/
  @javax.annotation.Nullable
  public DemographyComparisonInfo getDemographyComparison() {
    return demographyComparison;
  }

  public void setDemographyComparison(DemographyComparisonInfo demographyComparison) {
    this.demographyComparison = demographyComparison;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataforseoTrendsDemographyElementItem dataforseoTrendsDemographyElementItem = (DataforseoTrendsDemographyElementItem) o;
    return Objects.equals(this.position, dataforseoTrendsDemographyElementItem.position) &&
        Objects.equals(this.keywords, dataforseoTrendsDemographyElementItem.keywords) &&
        Objects.equals(this.demography, dataforseoTrendsDemographyElementItem.demography) &&
        Objects.equals(this.demographyComparison, dataforseoTrendsDemographyElementItem.demographyComparison) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, keywords, demography, demographyComparison, super.hashCode());
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
    sb.append("class DataforseoTrendsDemographyElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    demography: ").append(toIndentedString(demography)).append("\n");
    sb.append("    demographyComparison: ").append(toIndentedString(demographyComparison)).append("\n");
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
    openapiFields.add("demography");
    openapiFields.add("demography_comparison");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataforseoTrendsDemographyElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoTrendsDemographyElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoTrendsDemographyElementItem is not found in the empty JSON string", DataforseoTrendsDemographyElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataforseoTrendsDemographyElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataforseoTrendsDemographyElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoTrendsDemographyElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoTrendsDemographyElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoTrendsDemographyElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoTrendsDemographyElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoTrendsDemographyElementItem>() {
           @Override
           public void write(JsonWriter out, DataforseoTrendsDemographyElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataforseoTrendsDemographyElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataforseoTrendsDemographyElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataforseoTrendsDemographyElementItem
  * @throws IOException if the JSON string is invalid with respect to DataforseoTrendsDemographyElementItem
  */
  public static DataforseoTrendsDemographyElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoTrendsDemographyElementItem.class);
  }

 /**
  * Convert an instance of DataforseoTrendsDemographyElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

