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



public class ContentRatingInfo  {


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ContentRatingInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * rating name
* here you can find the following elements: Max5, Percents, CustomMax
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public static final String SERIALIZED_NAME_RATING_VALUE = "rating_value";
  @SerializedName(SERIALIZED_NAME_RATING_VALUE)
  private String ratingValue;

  public ContentRatingInfo ratingValue(String ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

  /**
   * the value of the rating
   * @return ratingValue
   */
  @javax.annotation.Nullable
  public String getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(String ratingValue) {
    this.ratingValue = ratingValue;
  }


  public static final String SERIALIZED_NAME_RATING_COUNT = "rating_count";
  @SerializedName(SERIALIZED_NAME_RATING_COUNT)
  private String ratingCount;

  public ContentRatingInfo ratingCount(String ratingCount) {
    this.ratingCount = ratingCount;
    return this;
  }

  /**
   * number of votes
   * @return ratingCount
   */
  @javax.annotation.Nullable
  public String getRatingCount() {
    return ratingCount;
  }

  public void setRatingCount(String ratingCount) {
    this.ratingCount = ratingCount;
  }


  public static final String SERIALIZED_NAME_MAX_RATING_VALUE = "max_rating_value";
  @SerializedName(SERIALIZED_NAME_MAX_RATING_VALUE)
  private String maxRatingValue;

  public ContentRatingInfo maxRatingValue(String maxRatingValue) {
    this.maxRatingValue = maxRatingValue;
    return this;
  }

  /**
   * maximum value for the rating name
   * @return maxRatingValue
   */
  @javax.annotation.Nullable
  public String getMaxRatingValue() {
    return maxRatingValue;
  }

  public void setMaxRatingValue(String maxRatingValue) {
    this.maxRatingValue = maxRatingValue;
  }


  public static final String SERIALIZED_NAME_RELATIVE_RATING = "relative_rating";
  @SerializedName(SERIALIZED_NAME_RELATIVE_RATING)
  private String relativeRating;

  public ContentRatingInfo relativeRating(String relativeRating) {
    this.relativeRating = relativeRating;
    return this;
  }

  /**
   * relative rating
   * @return relativeRating
   */
  @javax.annotation.Nullable
  public String getRelativeRating() {
    return relativeRating;
  }

  public void setRelativeRating(String relativeRating) {
    this.relativeRating = relativeRating;
  }



  public ContentRatingInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentRatingInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentRatingInfo contentRatingInfo = (ContentRatingInfo) o;
    return

        Objects.equals(this.name, contentRatingInfo.name) &&
        Objects.equals(this.ratingValue, contentRatingInfo.ratingValue) &&
        Objects.equals(this.ratingCount, contentRatingInfo.ratingCount) &&
        Objects.equals(this.maxRatingValue, contentRatingInfo.maxRatingValue) &&
        Objects.equals(this.relativeRating, contentRatingInfo.relativeRating);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(name, ratingValue, ratingCount, maxRatingValue, relativeRating);
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
    sb.append("class ContentRatingInfo {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratingValue: ").append(toIndentedString(ratingValue)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    maxRatingValue: ").append(toIndentedString(maxRatingValue)).append("\n");
    sb.append("    relativeRating: ").append(toIndentedString(relativeRating)).append("\n");
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
    
    openapiFields.add("name");
    
    openapiFields.add("rating_value");
    
    openapiFields.add("rating_count");
    
    openapiFields.add("max_rating_value");
    
    openapiFields.add("relative_rating");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentRatingInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentRatingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentRatingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentRatingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentRatingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentRatingInfo>() {
           @Override
           public void write(JsonWriter out, ContentRatingInfo value) throws IOException {
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
           public ContentRatingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentRatingInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentRatingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentRatingInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}