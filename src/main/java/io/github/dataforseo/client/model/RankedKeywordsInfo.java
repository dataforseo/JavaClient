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

/**
 * RankedKeywordsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class RankedKeywordsInfo {
  public static final String SERIALIZED_NAME_PAGE_FROM_KEYWORDS_COUNT_TOP3 = "page_from_keywords_count_top_3";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_KEYWORDS_COUNT_TOP3)
  private Long pageFromKeywordsCountTop3;

  public static final String SERIALIZED_NAME_PAGE_FROM_KEYWORDS_COUNT_TOP10 = "page_from_keywords_count_top_10";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_KEYWORDS_COUNT_TOP10)
  private Long pageFromKeywordsCountTop10;

  public static final String SERIALIZED_NAME_PAGE_FROM_KEYWORDS_COUNT_TOP100 = "page_from_keywords_count_top_100";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_KEYWORDS_COUNT_TOP100)
  private Long pageFromKeywordsCountTop100;

  public RankedKeywordsInfo() {
  }

  public RankedKeywordsInfo pageFromKeywordsCountTop3(Long pageFromKeywordsCountTop3) {
    this.pageFromKeywordsCountTop3 = pageFromKeywordsCountTop3;
    return this;
  }

  /**
   * number of keywords for which the page is ranked in top 3 search results
   * @return pageFromKeywordsCountTop3
   */
  @javax.annotation.Nullable
  public Long getPageFromKeywordsCountTop3() {
    return pageFromKeywordsCountTop3;
  }

  public void setPageFromKeywordsCountTop3(Long pageFromKeywordsCountTop3) {
    this.pageFromKeywordsCountTop3 = pageFromKeywordsCountTop3;
  }


  public RankedKeywordsInfo pageFromKeywordsCountTop10(Long pageFromKeywordsCountTop10) {
    this.pageFromKeywordsCountTop10 = pageFromKeywordsCountTop10;
    return this;
  }

  /**
   * number of keywords for which the page is ranked in top 10 search results
   * @return pageFromKeywordsCountTop10
   */
  @javax.annotation.Nullable
  public Long getPageFromKeywordsCountTop10() {
    return pageFromKeywordsCountTop10;
  }

  public void setPageFromKeywordsCountTop10(Long pageFromKeywordsCountTop10) {
    this.pageFromKeywordsCountTop10 = pageFromKeywordsCountTop10;
  }


  public RankedKeywordsInfo pageFromKeywordsCountTop100(Long pageFromKeywordsCountTop100) {
    this.pageFromKeywordsCountTop100 = pageFromKeywordsCountTop100;
    return this;
  }

  /**
   * number of keywords for which the page is ranked in top 100 search results
   * @return pageFromKeywordsCountTop100
   */
  @javax.annotation.Nullable
  public Long getPageFromKeywordsCountTop100() {
    return pageFromKeywordsCountTop100;
  }

  public void setPageFromKeywordsCountTop100(Long pageFromKeywordsCountTop100) {
    this.pageFromKeywordsCountTop100 = pageFromKeywordsCountTop100;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RankedKeywordsInfo instance itself
   */
  public RankedKeywordsInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    RankedKeywordsInfo rankedKeywordsInfo = (RankedKeywordsInfo) o;
    return Objects.equals(this.pageFromKeywordsCountTop3, rankedKeywordsInfo.pageFromKeywordsCountTop3) &&
        Objects.equals(this.pageFromKeywordsCountTop10, rankedKeywordsInfo.pageFromKeywordsCountTop10) &&
        Objects.equals(this.pageFromKeywordsCountTop100, rankedKeywordsInfo.pageFromKeywordsCountTop100)&&
        Objects.equals(this.additionalProperties, rankedKeywordsInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageFromKeywordsCountTop3, pageFromKeywordsCountTop10, pageFromKeywordsCountTop100, additionalProperties);
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
    sb.append("class RankedKeywordsInfo {\n");
    sb.append("    pageFromKeywordsCountTop3: ").append(toIndentedString(pageFromKeywordsCountTop3)).append("\n");
    sb.append("    pageFromKeywordsCountTop10: ").append(toIndentedString(pageFromKeywordsCountTop10)).append("\n");
    sb.append("    pageFromKeywordsCountTop100: ").append(toIndentedString(pageFromKeywordsCountTop100)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("page_from_keywords_count_top_3");
    openapiFields.add("page_from_keywords_count_top_10");
    openapiFields.add("page_from_keywords_count_top_100");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RankedKeywordsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RankedKeywordsInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RankedKeywordsInfo is not found in the empty JSON string", RankedKeywordsInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RankedKeywordsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RankedKeywordsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RankedKeywordsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RankedKeywordsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RankedKeywordsInfo>() {
           @Override
           public void write(JsonWriter out, RankedKeywordsInfo value) throws IOException {
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
           public RankedKeywordsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RankedKeywordsInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of RankedKeywordsInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RankedKeywordsInfo
   * @throws IOException if the JSON string is invalid with respect to RankedKeywordsInfo
   */
  public static RankedKeywordsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RankedKeywordsInfo.class);
  }

  /**
   * Convert an instance of RankedKeywordsInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
