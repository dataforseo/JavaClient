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



public class OnPageResourceLocationInfo  {


  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private Integer line;

  public OnPageResourceLocationInfo line(Integer line) {
    this.line = line;
    return this;
  }

  /**
   * line number
* the number of the line on which the resource is located
   * @return line
   */
  @javax.annotation.Nullable
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }


  public static final String SERIALIZED_NAME_OFFSET_LEFT = "offset_left";
  @SerializedName(SERIALIZED_NAME_OFFSET_LEFT)
  private Integer offsetLeft;

  public OnPageResourceLocationInfo offsetLeft(Integer offsetLeft) {
    this.offsetLeft = offsetLeft;
    return this;
  }

  /**
   * position in line
* the number of line characters before the resource;
* sometimes referred to as column
* Note: counts from 1, i.e. if the resource doesn’t have any characters to the left, the value will be 1
   * @return offsetLeft
   */
  @javax.annotation.Nullable
  public Integer getOffsetLeft() {
    return offsetLeft;
  }

  public void setOffsetLeft(Integer offsetLeft) {
    this.offsetLeft = offsetLeft;
  }


  public static final String SERIALIZED_NAME_OFFSET_TOP = "offset_top";
  @SerializedName(SERIALIZED_NAME_OFFSET_TOP)
  private Integer offsetTop;

  public OnPageResourceLocationInfo offsetTop(Integer offsetTop) {
    this.offsetTop = offsetTop;
    return this;
  }

  /**
   * position in the document
* the total number of characters between the resource and the top of HTML
   * @return offsetTop
   */
  @javax.annotation.Nullable
  public Integer getOffsetTop() {
    return offsetTop;
  }

  public void setOffsetTop(Integer offsetTop) {
    this.offsetTop = offsetTop;
  }



  public OnPageResourceLocationInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageResourceLocationInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageResourceLocationInfo onPageResourceLocationInfo = (OnPageResourceLocationInfo) o;
    return

        Objects.equals(this.line, onPageResourceLocationInfo.line) &&
        Objects.equals(this.offsetLeft, onPageResourceLocationInfo.offsetLeft) &&
        Objects.equals(this.offsetTop, onPageResourceLocationInfo.offsetTop);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(line, offsetLeft, offsetTop);
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
    sb.append("class OnPageResourceLocationInfo {\n");

    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    offsetLeft: ").append(toIndentedString(offsetLeft)).append("\n");
    sb.append("    offsetTop: ").append(toIndentedString(offsetTop)).append("\n");
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
    
    openapiFields.add("line");
    
    openapiFields.add("offset_left");
    
    openapiFields.add("offset_top");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageResourceLocationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageResourceLocationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageResourceLocationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageResourceLocationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageResourceLocationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageResourceLocationInfo>() {
           @Override
           public void write(JsonWriter out, OnPageResourceLocationInfo value) throws IOException {
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
           public OnPageResourceLocationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageResourceLocationInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageResourceLocationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageResourceLocationInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}