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



public class AppMetricsInfo  {


  public static final String SERIALIZED_NAME_POS_1 = "pos_1";
  @SerializedName(SERIALIZED_NAME_POS_1)
  private Integer pos1;

  public AppMetricsInfo pos1(Integer pos1) {
    this.pos1 = pos1;
    return this;
  }

  /**
   * number of organic SERPs where the product ranks #1
   * @return pos1
   */
  @javax.annotation.Nullable
  public Integer getPos1() {
    return pos1;
  }

  public void setPos1(Integer pos1) {
    this.pos1 = pos1;
  }


  public static final String SERIALIZED_NAME_POS_2_3 = "pos_2_3";
  @SerializedName(SERIALIZED_NAME_POS_2_3)
  private Integer pos23;

  public AppMetricsInfo pos23(Integer pos23) {
    this.pos23 = pos23;
    return this;
  }

  /**
   * number of organic SERPs where the product ranks #2-3
   * @return pos23
   */
  @javax.annotation.Nullable
  public Integer getPos23() {
    return pos23;
  }

  public void setPos23(Integer pos23) {
    this.pos23 = pos23;
  }


  public static final String SERIALIZED_NAME_POS_4_10 = "pos_4_10";
  @SerializedName(SERIALIZED_NAME_POS_4_10)
  private Integer pos410;

  public AppMetricsInfo pos410(Integer pos410) {
    this.pos410 = pos410;
    return this;
  }

  /**
   * number of organic SERPs where the product ranks #4-10
   * @return pos410
   */
  @javax.annotation.Nullable
  public Integer getPos410() {
    return pos410;
  }

  public void setPos410(Integer pos410) {
    this.pos410 = pos410;
  }


  public static final String SERIALIZED_NAME_POS_11_100 = "pos_11_100";
  @SerializedName(SERIALIZED_NAME_POS_11_100)
  private Integer pos11100;

  public AppMetricsInfo pos11100(Integer pos11100) {
    this.pos11100 = pos11100;
    return this;
  }

  /**
   * number of organic SERPs where the product ranks #11-100
   * @return pos11100
   */
  @javax.annotation.Nullable
  public Integer getPos11100() {
    return pos11100;
  }

  public void setPos11100(Integer pos11100) {
    this.pos11100 = pos11100;
  }


  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public AppMetricsInfo count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * total count of Amazon organic SERPs that contain the product
   * @return count
   */
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private Long searchVolume;

  public AppMetricsInfo searchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * total search volume of the product’s ranking keywords in organic SERP
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public Long getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
  }



  public AppMetricsInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppMetricsInfo putAdditionalProperty(String key, Object value) {
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


    
    AppMetricsInfo appMetricsInfo = (AppMetricsInfo) o;
    return

        Objects.equals(this.pos1, appMetricsInfo.pos1) &&
        Objects.equals(this.pos23, appMetricsInfo.pos23) &&
        Objects.equals(this.pos410, appMetricsInfo.pos410) &&
        Objects.equals(this.pos11100, appMetricsInfo.pos11100) &&
        Objects.equals(this.count, appMetricsInfo.count) &&
        Objects.equals(this.searchVolume, appMetricsInfo.searchVolume);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(pos1, pos23, pos410, pos11100, count, searchVolume);
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
    sb.append("class AppMetricsInfo {\n");

    sb.append("    pos1: ").append(toIndentedString(pos1)).append("\n");
    sb.append("    pos23: ").append(toIndentedString(pos23)).append("\n");
    sb.append("    pos410: ").append(toIndentedString(pos410)).append("\n");
    sb.append("    pos11100: ").append(toIndentedString(pos11100)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
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
    
    openapiFields.add("pos_1");
    
    openapiFields.add("pos_2_3");
    
    openapiFields.add("pos_4_10");
    
    openapiFields.add("pos_11_100");
    
    openapiFields.add("count");
    
    openapiFields.add("search_volume");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppMetricsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppMetricsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppMetricsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppMetricsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppMetricsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppMetricsInfo>() {
           @Override
           public void write(JsonWriter out, AppMetricsInfo value) throws IOException {
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
           public AppMetricsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppMetricsInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppMetricsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppMetricsInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}