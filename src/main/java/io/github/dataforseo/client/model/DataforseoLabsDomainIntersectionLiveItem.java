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



public class DataforseoLabsDomainIntersectionLiveItem  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsDomainIntersectionLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA = "keyword_data";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA)
  private KeywordDataInfo keywordData;

  public DataforseoLabsDomainIntersectionLiveItem keywordData(KeywordDataInfo keywordData) {
    this.keywordData = keywordData;
    return this;
  }

  /**
   * keyword data for the returned keyword
   * @return keywordData
   */
  @javax.annotation.Nullable
  public KeywordDataInfo getKeywordData() {
    return keywordData;
  }

  public void setKeywordData(KeywordDataInfo keywordData) {
    this.keywordData = keywordData;
  }


  public static final String SERIALIZED_NAME_FIRST_DOMAIN_SERP_ELEMENT = "first_domain_serp_element";
  @SerializedName(SERIALIZED_NAME_FIRST_DOMAIN_SERP_ELEMENT)
  private BaseDataforseoLabsApiElementItem firstDomainSerpElement;

  public DataforseoLabsDomainIntersectionLiveItem firstDomainSerpElement(BaseDataforseoLabsApiElementItem firstDomainSerpElement) {
    this.firstDomainSerpElement = firstDomainSerpElement;
    return this;
  }

  /**
   * contains data on the first domain’s SERP element found for the returned keyword
* the list of supported SERP elements can be found below
   * @return firstDomainSerpElement
   */
  @javax.annotation.Nullable
  public BaseDataforseoLabsApiElementItem getFirstDomainSerpElement() {
    return firstDomainSerpElement;
  }

  public void setFirstDomainSerpElement(BaseDataforseoLabsApiElementItem firstDomainSerpElement) {
    this.firstDomainSerpElement = firstDomainSerpElement;
  }


  public static final String SERIALIZED_NAME_SECOND_DOMAIN_SERP_ELEMENT = "second_domain_serp_element";
  @SerializedName(SERIALIZED_NAME_SECOND_DOMAIN_SERP_ELEMENT)
  private BaseDataforseoLabsApiElementItem secondDomainSerpElement;

  public DataforseoLabsDomainIntersectionLiveItem secondDomainSerpElement(BaseDataforseoLabsApiElementItem secondDomainSerpElement) {
    this.secondDomainSerpElement = secondDomainSerpElement;
    return this;
  }

  /**
   * contains data on the second domain’s SERP element found for the returned keyword
* the list of supported SERP elements can be found below
   * @return secondDomainSerpElement
   */
  @javax.annotation.Nullable
  public BaseDataforseoLabsApiElementItem getSecondDomainSerpElement() {
    return secondDomainSerpElement;
  }

  public void setSecondDomainSerpElement(BaseDataforseoLabsApiElementItem secondDomainSerpElement) {
    this.secondDomainSerpElement = secondDomainSerpElement;
  }



  public DataforseoLabsDomainIntersectionLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsDomainIntersectionLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsDomainIntersectionLiveItem dataforseoLabsDomainIntersectionLiveItem = (DataforseoLabsDomainIntersectionLiveItem) o;
    return

        Objects.equals(this.seType, dataforseoLabsDomainIntersectionLiveItem.seType) &&
        Objects.equals(this.keywordData, dataforseoLabsDomainIntersectionLiveItem.keywordData) &&
        Objects.equals(this.firstDomainSerpElement, dataforseoLabsDomainIntersectionLiveItem.firstDomainSerpElement) &&
        Objects.equals(this.secondDomainSerpElement, dataforseoLabsDomainIntersectionLiveItem.secondDomainSerpElement);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, keywordData, firstDomainSerpElement, secondDomainSerpElement);
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
    sb.append("class DataforseoLabsDomainIntersectionLiveItem {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    keywordData: ").append(toIndentedString(keywordData)).append("\n");
    sb.append("    firstDomainSerpElement: ").append(toIndentedString(firstDomainSerpElement)).append("\n");
    sb.append("    secondDomainSerpElement: ").append(toIndentedString(secondDomainSerpElement)).append("\n");
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
    
    openapiFields.add("keyword_data");
    
    openapiFields.add("first_domain_serp_element");
    
    openapiFields.add("second_domain_serp_element");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsDomainIntersectionLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsDomainIntersectionLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsDomainIntersectionLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsDomainIntersectionLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsDomainIntersectionLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsDomainIntersectionLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsDomainIntersectionLiveItem value) throws IOException {
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
           public DataforseoLabsDomainIntersectionLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsDomainIntersectionLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsDomainIntersectionLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsDomainIntersectionLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}