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
 * DataforseoLabsBBulkKeywordDifficultyLiveItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class DataforseoLabsBBulkKeywordDifficultyLiveItem {
  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_KEYWORD_DIFFICULTY = "keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DIFFICULTY)
  private Integer keywordDifficulty;

  public DataforseoLabsBBulkKeywordDifficultyLiveItem() {
  }

  public DataforseoLabsBBulkKeywordDifficultyLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

   /**
   * search engine type
   * @return seType
  **/
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public DataforseoLabsBBulkKeywordDifficultyLiveItem keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * keyword in a POST array
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public DataforseoLabsBBulkKeywordDifficultyLiveItem keywordDifficulty(Integer keywordDifficulty) {
    this.keywordDifficulty = keywordDifficulty;
    return this;
  }

   /**
   * difficulty of ranking in the first top-10 organic results for a keyword indicates the chance of getting in top-10 organic results for a keyword on a logarithmic scale from 0 to 100; calculated by analysing, among other parameters, link profiles of the first 10 pages in SERP; learn more about the metric in this help center guide
   * @return keywordDifficulty
  **/
  @javax.annotation.Nullable
  public Integer getKeywordDifficulty() {
    return keywordDifficulty;
  }

  public void setKeywordDifficulty(Integer keywordDifficulty) {
    this.keywordDifficulty = keywordDifficulty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataforseoLabsBBulkKeywordDifficultyLiveItem dataforseoLabsBBulkKeywordDifficultyLiveItem = (DataforseoLabsBBulkKeywordDifficultyLiveItem) o;
    return Objects.equals(this.seType, dataforseoLabsBBulkKeywordDifficultyLiveItem.seType) &&
        Objects.equals(this.keyword, dataforseoLabsBBulkKeywordDifficultyLiveItem.keyword) &&
        Objects.equals(this.keywordDifficulty, dataforseoLabsBBulkKeywordDifficultyLiveItem.keywordDifficulty);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(seType, keyword, keywordDifficulty);
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
    sb.append("class DataforseoLabsBBulkKeywordDifficultyLiveItem {\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordDifficulty: ").append(toIndentedString(keywordDifficulty)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("keyword");
    openapiFields.add("keyword_difficulty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsBBulkKeywordDifficultyLiveItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoLabsBBulkKeywordDifficultyLiveItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoLabsBBulkKeywordDifficultyLiveItem is not found in the empty JSON string", DataforseoLabsBBulkKeywordDifficultyLiveItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataforseoLabsBBulkKeywordDifficultyLiveItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataforseoLabsBBulkKeywordDifficultyLiveItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("se_type") != null && !jsonObj.get("se_type").isJsonNull()) && !jsonObj.get("se_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `se_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("se_type").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsBBulkKeywordDifficultyLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsBBulkKeywordDifficultyLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsBBulkKeywordDifficultyLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsBBulkKeywordDifficultyLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsBBulkKeywordDifficultyLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsBBulkKeywordDifficultyLiveItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataforseoLabsBBulkKeywordDifficultyLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataforseoLabsBBulkKeywordDifficultyLiveItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataforseoLabsBBulkKeywordDifficultyLiveItem
  * @throws IOException if the JSON string is invalid with respect to DataforseoLabsBBulkKeywordDifficultyLiveItem
  */
  public static DataforseoLabsBBulkKeywordDifficultyLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsBBulkKeywordDifficultyLiveItem.class);
  }

 /**
  * Convert an instance of DataforseoLabsBBulkKeywordDifficultyLiveItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
