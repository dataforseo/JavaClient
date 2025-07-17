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



public class HotelAmenityItemInfo  {


  public static final String SERIALIZED_NAME_AMENITY = "amenity";
  @SerializedName(SERIALIZED_NAME_AMENITY)
  private String amenity;

  public HotelAmenityItemInfo amenity(String amenity) {
    this.amenity = amenity;
    return this;
  }

  /**
   * standardised amenity name
   * @return amenity
   */
  @javax.annotation.Nullable
  public String getAmenity() {
    return amenity;
  }

  public void setAmenity(String amenity) {
    this.amenity = amenity;
  }


  public static final String SERIALIZED_NAME_AMENITY_LABEL = "amenity_label";
  @SerializedName(SERIALIZED_NAME_AMENITY_LABEL)
  private String amenityLabel;

  public HotelAmenityItemInfo amenityLabel(String amenityLabel) {
    this.amenityLabel = amenityLabel;
    return this;
  }

  /**
   * displayed amenity name
   * @return amenityLabel
   */
  @javax.annotation.Nullable
  public String getAmenityLabel() {
    return amenityLabel;
  }

  public void setAmenityLabel(String amenityLabel) {
    this.amenityLabel = amenityLabel;
  }


  public static final String SERIALIZED_NAME_HINT = "hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public HotelAmenityItemInfo hint(String hint) {
    this.hint = hint;
    return this;
  }

  /**
   * standardised details about the amenity
   * @return hint
   */
  @javax.annotation.Nullable
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }


  public static final String SERIALIZED_NAME_HINT_LABEL = "hint_label";
  @SerializedName(SERIALIZED_NAME_HINT_LABEL)
  private String hintLabel;

  public HotelAmenityItemInfo hintLabel(String hintLabel) {
    this.hintLabel = hintLabel;
    return this;
  }

  /**
   * displayed details about the amenity
   * @return hintLabel
   */
  @javax.annotation.Nullable
  public String getHintLabel() {
    return hintLabel;
  }

  public void setHintLabel(String hintLabel) {
    this.hintLabel = hintLabel;
  }


  public static final String SERIALIZED_NAME_IS_AVAILABLE = "is_available";
  @SerializedName(SERIALIZED_NAME_IS_AVAILABLE)
  private Boolean isAvailable;

  public HotelAmenityItemInfo isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * indicates whether the amenity is available in the hotel
   * @return isAvailable
   */
  @javax.annotation.Nullable
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }



  public HotelAmenityItemInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HotelAmenityItemInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

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


    
    HotelAmenityItemInfo hotelAmenityItemInfo = (HotelAmenityItemInfo) o;
    return

        Objects.equals(this.amenity, hotelAmenityItemInfo.amenity) &&
        Objects.equals(this.amenityLabel, hotelAmenityItemInfo.amenityLabel) &&
        Objects.equals(this.hint, hotelAmenityItemInfo.hint) &&
        Objects.equals(this.hintLabel, hotelAmenityItemInfo.hintLabel) &&
        Objects.equals(this.isAvailable, hotelAmenityItemInfo.isAvailable);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(amenity, amenityLabel, hint, hintLabel, isAvailable);
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
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
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
    
    openapiFields.add("is_available");
    

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
           public HotelAmenityItemInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HotelAmenityItemInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static HotelAmenityItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelAmenityItemInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}