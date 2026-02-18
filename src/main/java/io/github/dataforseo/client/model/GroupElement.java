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



public class GroupElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GroupElement type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public GroupElement key(String key) {
    this.key = key;
    return this;
  }

  /**
   * grouping identifier
* the specific identifier for the grouping dimension
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  private Integer mentions;

  public GroupElement mentions(Integer mentions) {
    this.mentions = mentions;
    return this;
  }

  /**
   * total LLM mentions count
* the number of times the target keyword or domain were mentioned in relation to this specific grouping key
   * @return mentions
   */
  @javax.annotation.Nullable
  public Integer getMentions() {
    return mentions;
  }

  public void setMentions(Integer mentions) {
    this.mentions = mentions;
  }


  public static final String SERIALIZED_NAME_AI_SEARCH_VOLUME = "ai_search_volume";
  @SerializedName(SERIALIZED_NAME_AI_SEARCH_VOLUME)
  private Long aiSearchVolume;

  public GroupElement aiSearchVolume(Long aiSearchVolume) {
    this.aiSearchVolume = aiSearchVolume;
    return this;
  }

  /**
   * current AI search volume rate of a keyword
* learn more about this metric here
   * @return aiSearchVolume
   */
  @javax.annotation.Nullable
  public Long getAiSearchVolume() {
    return aiSearchVolume;
  }

  public void setAiSearchVolume(Long aiSearchVolume) {
    this.aiSearchVolume = aiSearchVolume;
  }


  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Integer impressions;

  public GroupElement impressions(Integer impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * current AI impressions rate of a keyword
   * @return impressions
   */
  @javax.annotation.Nullable
  public Integer getImpressions() {
    return impressions;
  }

  public void setImpressions(Integer impressions) {
    this.impressions = impressions;
  }



  public GroupElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GroupElement putAdditionalProperty(String key, Object value) {
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


    
    GroupElement groupElement = (GroupElement) o;
    return

        Objects.equals(this.type, groupElement.type) &&
        Objects.equals(this.key, groupElement.key) &&
        Objects.equals(this.mentions, groupElement.mentions) &&
        Objects.equals(this.aiSearchVolume, groupElement.aiSearchVolume) &&
        Objects.equals(this.impressions, groupElement.impressions);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, key, mentions, aiSearchVolume, impressions);
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
    sb.append("class GroupElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    aiSearchVolume: ").append(toIndentedString(aiSearchVolume)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("key");
    
    openapiFields.add("mentions");
    
    openapiFields.add("ai_search_volume");
    
    openapiFields.add("impressions");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupElement.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupElement>() {
           @Override
           public void write(JsonWriter out, GroupElement value) throws IOException {
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
           public GroupElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GroupElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GroupElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}