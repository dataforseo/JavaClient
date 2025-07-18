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



public class BacklinksTimeseriesNewLostSummaryLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksTimeseriesNewLostSummaryLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public BacklinksTimeseriesNewLostSummaryLiveItem date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date and time when the data for the target was stored
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public static final String SERIALIZED_NAME_NEW_BACKLINKS = "new_backlinks";
  @SerializedName(SERIALIZED_NAME_NEW_BACKLINKS)
  private Long newBacklinks;

  public BacklinksTimeseriesNewLostSummaryLiveItem newBacklinks(Long newBacklinks) {
    this.newBacklinks = newBacklinks;
    return this;
  }

  /**
   * number of new backlinks
* number of new backlinks pointing to the target
   * @return newBacklinks
   */
  @javax.annotation.Nullable
  public Long getNewBacklinks() {
    return newBacklinks;
  }

  public void setNewBacklinks(Long newBacklinks) {
    this.newBacklinks = newBacklinks;
  }


  public static final String SERIALIZED_NAME_LOST_BACKLINKS = "lost_backlinks";
  @SerializedName(SERIALIZED_NAME_LOST_BACKLINKS)
  private Long lostBacklinks;

  public BacklinksTimeseriesNewLostSummaryLiveItem lostBacklinks(Long lostBacklinks) {
    this.lostBacklinks = lostBacklinks;
    return this;
  }

  /**
   * number of lost backlinks
* number of lost backlinks of the target
   * @return lostBacklinks
   */
  @javax.annotation.Nullable
  public Long getLostBacklinks() {
    return lostBacklinks;
  }

  public void setLostBacklinks(Long lostBacklinks) {
    this.lostBacklinks = lostBacklinks;
  }


  public static final String SERIALIZED_NAME_NEW_REFERRING_DOMAINS = "new_referring_domains";
  @SerializedName(SERIALIZED_NAME_NEW_REFERRING_DOMAINS)
  private Long newReferringDomains;

  public BacklinksTimeseriesNewLostSummaryLiveItem newReferringDomains(Long newReferringDomains) {
    this.newReferringDomains = newReferringDomains;
    return this;
  }

  /**
   * number of new referring domains
* number of new referring domains pointing to the target
   * @return newReferringDomains
   */
  @javax.annotation.Nullable
  public Long getNewReferringDomains() {
    return newReferringDomains;
  }

  public void setNewReferringDomains(Long newReferringDomains) {
    this.newReferringDomains = newReferringDomains;
  }


  public static final String SERIALIZED_NAME_LOST_REFERRING_DOMAINS = "lost_referring_domains";
  @SerializedName(SERIALIZED_NAME_LOST_REFERRING_DOMAINS)
  private Long lostReferringDomains;

  public BacklinksTimeseriesNewLostSummaryLiveItem lostReferringDomains(Long lostReferringDomains) {
    this.lostReferringDomains = lostReferringDomains;
    return this;
  }

  /**
   * number of lost referring domains
* number of lost referring domains of the target
   * @return lostReferringDomains
   */
  @javax.annotation.Nullable
  public Long getLostReferringDomains() {
    return lostReferringDomains;
  }

  public void setLostReferringDomains(Long lostReferringDomains) {
    this.lostReferringDomains = lostReferringDomains;
  }


  public static final String SERIALIZED_NAME_NEW_REFERRING_MAIN_DOMAINS = "new_referring_main_domains";
  @SerializedName(SERIALIZED_NAME_NEW_REFERRING_MAIN_DOMAINS)
  private Long newReferringMainDomains;

  public BacklinksTimeseriesNewLostSummaryLiveItem newReferringMainDomains(Long newReferringMainDomains) {
    this.newReferringMainDomains = newReferringMainDomains;
    return this;
  }

  /**
   * number of new referring main domains
* number of new referring main domains pointing to the target
   * @return newReferringMainDomains
   */
  @javax.annotation.Nullable
  public Long getNewReferringMainDomains() {
    return newReferringMainDomains;
  }

  public void setNewReferringMainDomains(Long newReferringMainDomains) {
    this.newReferringMainDomains = newReferringMainDomains;
  }


  public static final String SERIALIZED_NAME_LOST_REFERRING_MAIN_DOMAINS = "lost_referring_main_domains";
  @SerializedName(SERIALIZED_NAME_LOST_REFERRING_MAIN_DOMAINS)
  private Long lostReferringMainDomains;

  public BacklinksTimeseriesNewLostSummaryLiveItem lostReferringMainDomains(Long lostReferringMainDomains) {
    this.lostReferringMainDomains = lostReferringMainDomains;
    return this;
  }

  /**
   * number of lost referring main domains
* number of lost referring main domains of the target
   * @return lostReferringMainDomains
   */
  @javax.annotation.Nullable
  public Long getLostReferringMainDomains() {
    return lostReferringMainDomains;
  }

  public void setLostReferringMainDomains(Long lostReferringMainDomains) {
    this.lostReferringMainDomains = lostReferringMainDomains;
  }



  public BacklinksTimeseriesNewLostSummaryLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksTimeseriesNewLostSummaryLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksTimeseriesNewLostSummaryLiveItem backlinksTimeseriesNewLostSummaryLiveItem = (BacklinksTimeseriesNewLostSummaryLiveItem) o;
    return

        Objects.equals(this.type, backlinksTimeseriesNewLostSummaryLiveItem.type) &&
        Objects.equals(this.date, backlinksTimeseriesNewLostSummaryLiveItem.date) &&
        Objects.equals(this.newBacklinks, backlinksTimeseriesNewLostSummaryLiveItem.newBacklinks) &&
        Objects.equals(this.lostBacklinks, backlinksTimeseriesNewLostSummaryLiveItem.lostBacklinks) &&
        Objects.equals(this.newReferringDomains, backlinksTimeseriesNewLostSummaryLiveItem.newReferringDomains) &&
        Objects.equals(this.lostReferringDomains, backlinksTimeseriesNewLostSummaryLiveItem.lostReferringDomains) &&
        Objects.equals(this.newReferringMainDomains, backlinksTimeseriesNewLostSummaryLiveItem.newReferringMainDomains) &&
        Objects.equals(this.lostReferringMainDomains, backlinksTimeseriesNewLostSummaryLiveItem.lostReferringMainDomains);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, date, newBacklinks, lostBacklinks, newReferringDomains, lostReferringDomains, newReferringMainDomains, lostReferringMainDomains);
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
    sb.append("class BacklinksTimeseriesNewLostSummaryLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    newBacklinks: ").append(toIndentedString(newBacklinks)).append("\n");
    sb.append("    lostBacklinks: ").append(toIndentedString(lostBacklinks)).append("\n");
    sb.append("    newReferringDomains: ").append(toIndentedString(newReferringDomains)).append("\n");
    sb.append("    lostReferringDomains: ").append(toIndentedString(lostReferringDomains)).append("\n");
    sb.append("    newReferringMainDomains: ").append(toIndentedString(newReferringMainDomains)).append("\n");
    sb.append("    lostReferringMainDomains: ").append(toIndentedString(lostReferringMainDomains)).append("\n");
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
    
    openapiFields.add("date");
    
    openapiFields.add("new_backlinks");
    
    openapiFields.add("lost_backlinks");
    
    openapiFields.add("new_referring_domains");
    
    openapiFields.add("lost_referring_domains");
    
    openapiFields.add("new_referring_main_domains");
    
    openapiFields.add("lost_referring_main_domains");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksTimeseriesNewLostSummaryLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksTimeseriesNewLostSummaryLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksTimeseriesNewLostSummaryLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksTimeseriesNewLostSummaryLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksTimeseriesNewLostSummaryLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksTimeseriesNewLostSummaryLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksTimeseriesNewLostSummaryLiveItem value) throws IOException {
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
           public BacklinksTimeseriesNewLostSummaryLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksTimeseriesNewLostSummaryLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksTimeseriesNewLostSummaryLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksTimeseriesNewLostSummaryLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}