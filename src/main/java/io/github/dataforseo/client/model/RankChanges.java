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



public class RankChanges  {


  public static final String SERIALIZED_NAME_PREVIOUS_RANK_ABSOLUTE = "previous_rank_absolute";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_RANK_ABSOLUTE)
  private Integer previousRankAbsolute;

  public RankChanges previousRankAbsolute(Integer previousRankAbsolute) {
    this.previousRankAbsolute = previousRankAbsolute;
    return this;
  }

  /**
   * previous absolute rank in SERP
* indicates previous rank of the element in Google SERP;
* if this element is new, the value will be null
   * @return previousRankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getPreviousRankAbsolute() {
    return previousRankAbsolute;
  }

  public void setPreviousRankAbsolute(Integer previousRankAbsolute) {
    this.previousRankAbsolute = previousRankAbsolute;
  }


  public static final String SERIALIZED_NAME_IS_NEW = "is_new";
  @SerializedName(SERIALIZED_NAME_IS_NEW)
  private Boolean isNew;

  public RankChanges isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  /**
   * element was previously present in SERP
* if the value is true, previously collected SERP didn’t contain this element
   * @return isNew
   */
  @javax.annotation.Nullable
  public Boolean getIsNew() {
    return isNew;
  }

  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }


  public static final String SERIALIZED_NAME_IS_UP = "is_up";
  @SerializedName(SERIALIZED_NAME_IS_UP)
  private Boolean isUp;

  public RankChanges isUp(Boolean isUp) {
    this.isUp = isUp;
    return this;
  }

  /**
   * rank of this element went up
* if the value is true, position of the element in SERP is higher compared to the previous check
   * @return isUp
   */
  @javax.annotation.Nullable
  public Boolean getIsUp() {
    return isUp;
  }

  public void setIsUp(Boolean isUp) {
    this.isUp = isUp;
  }


  public static final String SERIALIZED_NAME_IS_DOWN = "is_down";
  @SerializedName(SERIALIZED_NAME_IS_DOWN)
  private Boolean isDown;

  public RankChanges isDown(Boolean isDown) {
    this.isDown = isDown;
    return this;
  }

  /**
   * rank of this element went down
* if the value is true, position of the element in SERP is lower compared to the previous check
   * @return isDown
   */
  @javax.annotation.Nullable
  public Boolean getIsDown() {
    return isDown;
  }

  public void setIsDown(Boolean isDown) {
    this.isDown = isDown;
  }



  public RankChanges() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public RankChanges putAdditionalProperty(String key, Object value) {
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


    
    RankChanges rankChanges = (RankChanges) o;
    return

        Objects.equals(this.previousRankAbsolute, rankChanges.previousRankAbsolute) &&
        Objects.equals(this.isNew, rankChanges.isNew) &&
        Objects.equals(this.isUp, rankChanges.isUp) &&
        Objects.equals(this.isDown, rankChanges.isDown);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(previousRankAbsolute, isNew, isUp, isDown);
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
    sb.append("class RankChanges {\n");

    sb.append("    previousRankAbsolute: ").append(toIndentedString(previousRankAbsolute)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    isUp: ").append(toIndentedString(isUp)).append("\n");
    sb.append("    isDown: ").append(toIndentedString(isDown)).append("\n");
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
    
    openapiFields.add("previous_rank_absolute");
    
    openapiFields.add("is_new");
    
    openapiFields.add("is_up");
    
    openapiFields.add("is_down");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RankChanges
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RankChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RankChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RankChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RankChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<RankChanges>() {
           @Override
           public void write(JsonWriter out, RankChanges value) throws IOException {
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
           public RankChanges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RankChanges instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static RankChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RankChanges.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}