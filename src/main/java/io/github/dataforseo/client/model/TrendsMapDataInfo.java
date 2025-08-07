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



public class TrendsMapDataInfo  {


  public static final String SERIALIZED_NAME_GEO_ID = "geo_id";
  @SerializedName(SERIALIZED_NAME_GEO_ID)
  private String geoId;

  public TrendsMapDataInfo geoId(String geoId) {
    this.geoId = geoId;
    return this;
  }

  /**
   * Google Trends location identifier
* you can use this field for matching obtained results with location parameters specified in the request
* example:
* US-NY
   * @return geoId
   */
  @javax.annotation.Nullable
  public String getGeoId() {
    return geoId;
  }

  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }


  public static final String SERIALIZED_NAME_GEO_NAME = "geo_name";
  @SerializedName(SERIALIZED_NAME_GEO_NAME)
  private String geoName;

  public TrendsMapDataInfo geoName(String geoName) {
    this.geoName = geoName;
    return this;
  }

  /**
   * Google Trends location name
* you can use this field for matching obtained results with location parameters specified in the request
   * @return geoName
   */
  @javax.annotation.Nullable
  public String getGeoName() {
    return geoName;
  }

  public void setGeoName(String geoName) {
    this.geoName = geoName;
  }


  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Double> values;

  public TrendsMapDataInfo values(List<Double> values) {
    this.values = values;
    return this;
  }

  /**
   * relative keyword popularity rate in a given location
* represents the location-specific keyword popularity rate over the given time range
* if you specify more than one keyword, the values will be averaged to the highest value across all specified keywords
* a value of 100 is the peak popularity for the term
* a value of 50 means that the term is half as popular
* a value of 0 means there was not enough data for this term
   * @return values
   */
  @javax.annotation.Nullable
  public List<Double> getValues() {
    return values;
  }

  public void setValues(List<Double> values) {
    this.values = values;
  }


  public static final String SERIALIZED_NAME_MAX_VALUE_INDEX = "max_value_index";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE_INDEX)
  private Integer maxValueIndex;

  public TrendsMapDataInfo maxValueIndex(Integer maxValueIndex) {
    this.maxValueIndex = maxValueIndex;
    return this;
  }

  /**
   * max value among comparable terms
* represents the maximum value if you specified more than two keywords in a POST array
* if you specified only one keyword, the value will be null
   * @return maxValueIndex
   */
  @javax.annotation.Nullable
  public Integer getMaxValueIndex() {
    return maxValueIndex;
  }

  public void setMaxValueIndex(Integer maxValueIndex) {
    this.maxValueIndex = maxValueIndex;
  }



  public TrendsMapDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public TrendsMapDataInfo putAdditionalProperty(String key, Object value) {
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


    
    TrendsMapDataInfo trendsMapDataInfo = (TrendsMapDataInfo) o;
    return

        Objects.equals(this.geoId, trendsMapDataInfo.geoId) &&
        Objects.equals(this.geoName, trendsMapDataInfo.geoName) &&
        Objects.equals(this.values, trendsMapDataInfo.values) &&
        Objects.equals(this.maxValueIndex, trendsMapDataInfo.maxValueIndex);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(geoId, geoName, values, maxValueIndex);
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
    sb.append("class TrendsMapDataInfo {\n");

    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
    sb.append("    geoName: ").append(toIndentedString(geoName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    maxValueIndex: ").append(toIndentedString(maxValueIndex)).append("\n");
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
    
    openapiFields.add("geo_id");
    
    openapiFields.add("geo_name");
    
    openapiFields.add("values");
    
    openapiFields.add("max_value_index");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrendsMapDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrendsMapDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrendsMapDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrendsMapDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrendsMapDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TrendsMapDataInfo>() {
           @Override
           public void write(JsonWriter out, TrendsMapDataInfo value) throws IOException {
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
           public TrendsMapDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TrendsMapDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static TrendsMapDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrendsMapDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}