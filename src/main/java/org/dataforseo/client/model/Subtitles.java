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
 * Subtitles
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T10:30:03.431691300+03:00[Europe/Kiev]")
public class Subtitles {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_IS_TRANSLATABLE = "is_translatable";
  @SerializedName(SERIALIZED_NAME_IS_TRANSLATABLE)
  private Boolean isTranslatable;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATED = "is_auto_generated";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATED)
  private Boolean isAutoGenerated;

  public Subtitles() {
  }

  public Subtitles language(String language) {
    this.language = language;
    return this;
  }

   /**
   * language of subtitles
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public Subtitles isTranslatable(Boolean isTranslatable) {
    this.isTranslatable = isTranslatable;
    return this;
  }

   /**
   * defines if subtitles are translatable
   * @return isTranslatable
  **/
  @javax.annotation.Nullable
  public Boolean getIsTranslatable() {
    return isTranslatable;
  }

  public void setIsTranslatable(Boolean isTranslatable) {
    this.isTranslatable = isTranslatable;
  }


  public Subtitles isAutoGenerated(Boolean isAutoGenerated) {
    this.isAutoGenerated = isAutoGenerated;
    return this;
  }

   /**
   * defines if subtitles are auto generated
   * @return isAutoGenerated
  **/
  @javax.annotation.Nullable
  public Boolean getIsAutoGenerated() {
    return isAutoGenerated;
  }

  public void setIsAutoGenerated(Boolean isAutoGenerated) {
    this.isAutoGenerated = isAutoGenerated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subtitles subtitles = (Subtitles) o;
    return Objects.equals(this.language, subtitles.language) &&
        Objects.equals(this.isTranslatable, subtitles.isTranslatable) &&
        Objects.equals(this.isAutoGenerated, subtitles.isAutoGenerated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, isTranslatable, isAutoGenerated);
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
    sb.append("class Subtitles {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    isTranslatable: ").append(toIndentedString(isTranslatable)).append("\n");
    sb.append("    isAutoGenerated: ").append(toIndentedString(isAutoGenerated)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("is_translatable");
    openapiFields.add("is_auto_generated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Subtitles
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Subtitles.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subtitles is not found in the empty JSON string", Subtitles.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Subtitles.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subtitles` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subtitles.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subtitles' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subtitles> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subtitles.class));

       return (TypeAdapter<T>) new TypeAdapter<Subtitles>() {
           @Override
           public void write(JsonWriter out, Subtitles value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subtitles read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Subtitles given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Subtitles
  * @throws IOException if the JSON string is invalid with respect to Subtitles
  */
  public static Subtitles fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subtitles.class);
  }

 /**
  * Convert an instance of Subtitles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
