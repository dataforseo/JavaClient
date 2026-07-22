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


public class AiOptimizationLlmMentionsTimeseriesNewLostLiveItem  {


  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date timestamp
*  date format: 'yyyy-mm-dd'
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public static final String SERIALIZED_NAME_NEW_MENTIONS = "new_mentions";
  @SerializedName(SERIALIZED_NAME_NEW_MENTIONS)
  private Integer newMentions;

  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem newMentions(Integer newMentions) {
    this.newMentions = newMentions;
    return this;
  }

  /**
   * new LLM mentions
* indicates the LLM responses that contain the target at the date_to timestamp, did not contain it at the date_from timestamp
   * @return newMentions
   */
  @javax.annotation.Nullable
  public Integer getNewMentions() {
    return newMentions;
  }

  public void setNewMentions(Integer newMentions) {
    this.newMentions = newMentions;
  }


  public static final String SERIALIZED_NAME_LOST_MENTIONS = "lost_mentions";
  @SerializedName(SERIALIZED_NAME_LOST_MENTIONS)
  private Integer lostMentions;

  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem lostMentions(Integer lostMentions) {
    this.lostMentions = lostMentions;
    return this;
  }

  /**
   * lost LLM mentions
* indicates the LLM responses that contained the specified target at the date_from timestamp, do not contain it at the date_to timestamp
   * @return lostMentions
   */
  @javax.annotation.Nullable
  public Integer getLostMentions() {
    return lostMentions;
  }

  public void setLostMentions(Integer lostMentions) {
    this.lostMentions = lostMentions;
  }


  public static final String SERIALIZED_NAME_NEW_AI_SEARCH_VOLUME = "new_ai_search_volume";
  @SerializedName(SERIALIZED_NAME_NEW_AI_SEARCH_VOLUME)
  private Long newAiSearchVolume;

  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem newAiSearchVolume(Long newAiSearchVolume) {
    this.newAiSearchVolume = newAiSearchVolume;
    return this;
  }

  /**
   * ai_search_volume increment
* indicates the increase of ai_search_volume values between the current timestamp and the previous one
* learn more about this metric here
   * @return newAiSearchVolume
   */
  @javax.annotation.Nullable
  public Long getNewAiSearchVolume() {
    return newAiSearchVolume;
  }

  public void setNewAiSearchVolume(Long newAiSearchVolume) {
    this.newAiSearchVolume = newAiSearchVolume;
  }


  public static final String SERIALIZED_NAME_LOST_AI_SEARCH_VOLUME = "lost_ai_search_volume";
  @SerializedName(SERIALIZED_NAME_LOST_AI_SEARCH_VOLUME)
  private Long lostAiSearchVolume;

  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem lostAiSearchVolume(Long lostAiSearchVolume) {
    this.lostAiSearchVolume = lostAiSearchVolume;
    return this;
  }

  /**
   * ai_search_volume decrement
* indicates the decrease of ai_search_volume values between the current timestamp and the previous one
* learn more about this metric here
   * @return lostAiSearchVolume
   */
  @javax.annotation.Nullable
  public Long getLostAiSearchVolume() {
    return lostAiSearchVolume;
  }

  public void setLostAiSearchVolume(Long lostAiSearchVolume) {
    this.lostAiSearchVolume = lostAiSearchVolume;
  }



  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsTimeseriesNewLostLiveItem aiOptimizationLlmMentionsTimeseriesNewLostLiveItem = (AiOptimizationLlmMentionsTimeseriesNewLostLiveItem) o;
    return

        Objects.equals(this.date, aiOptimizationLlmMentionsTimeseriesNewLostLiveItem.date) &&
        Objects.equals(this.newMentions, aiOptimizationLlmMentionsTimeseriesNewLostLiveItem.newMentions) &&
        Objects.equals(this.lostMentions, aiOptimizationLlmMentionsTimeseriesNewLostLiveItem.lostMentions) &&
        Objects.equals(this.newAiSearchVolume, aiOptimizationLlmMentionsTimeseriesNewLostLiveItem.newAiSearchVolume) &&
        Objects.equals(this.lostAiSearchVolume, aiOptimizationLlmMentionsTimeseriesNewLostLiveItem.lostAiSearchVolume);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(date, newMentions, lostMentions, newAiSearchVolume, lostAiSearchVolume);
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
    sb.append("class AiOptimizationLlmMentionsTimeseriesNewLostLiveItem {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    newMentions: ").append(toIndentedString(newMentions)).append("\n");
    sb.append("    lostMentions: ").append(toIndentedString(lostMentions)).append("\n");
    sb.append("    newAiSearchVolume: ").append(toIndentedString(newAiSearchVolume)).append("\n");
    sb.append("    lostAiSearchVolume: ").append(toIndentedString(lostAiSearchVolume)).append("\n");
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
    
    openapiFields.add("date");
    
    openapiFields.add("new_mentions");
    
    openapiFields.add("lost_mentions");
    
    openapiFields.add("new_ai_search_volume");
    
    openapiFields.add("lost_ai_search_volume");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsTimeseriesNewLostLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsTimeseriesNewLostLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsTimeseriesNewLostLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsTimeseriesNewLostLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsTimeseriesNewLostLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsTimeseriesNewLostLiveItem>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsTimeseriesNewLostLiveItem value) throws IOException {
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
           public AiOptimizationLlmMentionsTimeseriesNewLostLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsTimeseriesNewLostLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsTimeseriesNewLostLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsTimeseriesNewLostLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}