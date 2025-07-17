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



public class EventDates  {


  public static final String SERIALIZED_NAME_START_DATETIME = "start_datetime";
  @SerializedName(SERIALIZED_NAME_START_DATETIME)
  private String startDatetime;

  public EventDates startDatetime(String startDatetime) {
    this.startDatetime = startDatetime;
    return this;
  }

  /**
   * date and time when the event starts
* if time zone is specified in the event, value will be returned in the UTC format:
* “yyyy-mm-ddThh-mm-ss+00:00”
* example:
* 2019-11-15T12:57:46+00:00
* if time zone is not specified in the event, unspecified local time will be returned in the following format:
* “yyyy-mm-ddThh-mm-ss”
* example:
* 2019-11-15T12:57:46
   * @return startDatetime
   */
  @javax.annotation.Nullable
  public String getStartDatetime() {
    return startDatetime;
  }

  public void setStartDatetime(String startDatetime) {
    this.startDatetime = startDatetime;
  }


  public static final String SERIALIZED_NAME_END_DATETIME = "end_datetime";
  @SerializedName(SERIALIZED_NAME_END_DATETIME)
  private String endDatetime;

  public EventDates endDatetime(String endDatetime) {
    this.endDatetime = endDatetime;
    return this;
  }

  /**
   * date and time when the event ends
* if time zone is specified in the event, value will be returned in the UTC format:
* “yyyy-mm-ddThh-mm-ss+00:00”
* example:
* 2019-11-15T12:57:46+00:00
* if time zone is not specified in the event, unspecified local time will be returned in the following format:
* “yyyy-mm-ddThh-mm-ss”
* example:
* 2019-11-15T12:57:46
   * @return endDatetime
   */
  @javax.annotation.Nullable
  public String getEndDatetime() {
    return endDatetime;
  }

  public void setEndDatetime(String endDatetime) {
    this.endDatetime = endDatetime;
  }


  public static final String SERIALIZED_NAME_DISPLAYED_DATES = "displayed_dates";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_DATES)
  private String displayedDates;

  public EventDates displayedDates(String displayedDates) {
    this.displayedDates = displayedDates;
    return this;
  }

  /**
   * date or date range as it is displayed in SERP
   * @return displayedDates
   */
  @javax.annotation.Nullable
  public String getDisplayedDates() {
    return displayedDates;
  }

  public void setDisplayedDates(String displayedDates) {
    this.displayedDates = displayedDates;
  }



  public EventDates() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public EventDates putAdditionalProperty(String key, Object value) {
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


    
    EventDates eventDates = (EventDates) o;
    return

        Objects.equals(this.startDatetime, eventDates.startDatetime) &&
        Objects.equals(this.endDatetime, eventDates.endDatetime) &&
        Objects.equals(this.displayedDates, eventDates.displayedDates);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(startDatetime, endDatetime, displayedDates);
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
    sb.append("class EventDates {\n");

    sb.append("    startDatetime: ").append(toIndentedString(startDatetime)).append("\n");
    sb.append("    endDatetime: ").append(toIndentedString(endDatetime)).append("\n");
    sb.append("    displayedDates: ").append(toIndentedString(displayedDates)).append("\n");
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
    
    openapiFields.add("start_datetime");
    
    openapiFields.add("end_datetime");
    
    openapiFields.add("displayed_dates");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventDates
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventDates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventDates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventDates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventDates.class));

       return (TypeAdapter<T>) new TypeAdapter<EventDates>() {
           @Override
           public void write(JsonWriter out, EventDates value) throws IOException {
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
           public EventDates read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EventDates instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static EventDates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventDates.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}