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
 * HotelAmenityItemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class HotelAmenityItemInfo {
  public static final String SERIALIZED_NAME_AMENITY = "amenity";
  @SerializedName(SERIALIZED_NAME_AMENITY)
  private String amenity;

  public static final String SERIALIZED_NAME_AMENITY_LABEL = "amenity_label";
  @SerializedName(SERIALIZED_NAME_AMENITY_LABEL)
  private String amenityLabel;

  public static final String SERIALIZED_NAME_HINT = "hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public static final String SERIALIZED_NAME_HINT_LABEL = "hint_label";
  @SerializedName(SERIALIZED_NAME_HINT_LABEL)
  private String hintLabel;

  public HotelAmenityItemInfo() {
  }

  public HotelAmenityItemInfo amenity(String amenity) {
    this.amenity = amenity;
    return this;
  }

   /**
   * standardised amenity name
   * @return amenity
  **/
  @javax.annotation.Nullable
  public String getAmenity() {
    return amenity;
  }

  public void setAmenity(String amenity) {
    this.amenity = amenity;
  }


  public HotelAmenityItemInfo amenityLabel(String amenityLabel) {
    this.amenityLabel = amenityLabel;
    return this;
  }

   /**
   * displayed amenity name
   * @return amenityLabel
  **/
  @javax.annotation.Nullable
  public String getAmenityLabel() {
    return amenityLabel;
  }

  public void setAmenityLabel(String amenityLabel) {
    this.amenityLabel = amenityLabel;
  }


  public HotelAmenityItemInfo hint(String hint) {
    this.hint = hint;
    return this;
  }

   /**
   * standardised details about the amenity
   * @return hint
  **/
  @javax.annotation.Nullable
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }


  public HotelAmenityItemInfo hintLabel(String hintLabel) {
    this.hintLabel = hintLabel;
    return this;
  }

   /**
   * displayed details about the amenity
   * @return hintLabel
  **/
  @javax.annotation.Nullable
  public String getHintLabel() {
    return hintLabel;
  }

  public void setHintLabel(String hintLabel) {
    this.hintLabel = hintLabel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAmenityItemInfo hotelAmenityItemInfo = (HotelAmenityItemInfo) o;
    return Objects.equals(this.amenity, hotelAmenityItemInfo.amenity) &&
        Objects.equals(this.amenityLabel, hotelAmenityItemInfo.amenityLabel) &&
        Objects.equals(this.hint, hotelAmenityItemInfo.hint) &&
        Objects.equals(this.hintLabel, hotelAmenityItemInfo.hintLabel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amenity, amenityLabel, hint, hintLabel);
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
    sb.append("class HotelAmenityItemInfo {\n");
    sb.append("    amenity: ").append(toIndentedString(amenity)).append("\n");
    sb.append("    amenityLabel: ").append(toIndentedString(amenityLabel)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    hintLabel: ").append(toIndentedString(hintLabel)).append("\n");
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
    openapiFields.add("amenity");
    openapiFields.add("amenity_label");
    openapiFields.add("hint");
    openapiFields.add("hint_label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HotelAmenityItemInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HotelAmenityItemInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelAmenityItemInfo is not found in the empty JSON string", HotelAmenityItemInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HotelAmenityItemInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelAmenityItemInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("amenity") != null && !jsonObj.get("amenity").isJsonNull()) && !jsonObj.get("amenity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amenity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amenity").toString()));
      }
      if ((jsonObj.get("amenity_label") != null && !jsonObj.get("amenity_label").isJsonNull()) && !jsonObj.get("amenity_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amenity_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amenity_label").toString()));
      }
      if ((jsonObj.get("hint") != null && !jsonObj.get("hint").isJsonNull()) && !jsonObj.get("hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hint").toString()));
      }
      if ((jsonObj.get("hint_label") != null && !jsonObj.get("hint_label").isJsonNull()) && !jsonObj.get("hint_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hint_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hint_label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelAmenityItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelAmenityItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelAmenityItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelAmenityItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelAmenityItemInfo>() {
           @Override
           public void write(JsonWriter out, HotelAmenityItemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelAmenityItemInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HotelAmenityItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HotelAmenityItemInfo
  * @throws IOException if the JSON string is invalid with respect to HotelAmenityItemInfo
  */
  public static HotelAmenityItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelAmenityItemInfo.class);
  }

 /**
  * Convert an instance of HotelAmenityItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
