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



public class BacklinksBulkNewLostReferringDomainsLiveItem  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public BacklinksBulkNewLostReferringDomainsLiveItem target(String target) {
    this.target = target;
    return this;
  }

  /**
   * domain, subdomain or webpage from a POST array
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_NEW_REFERRING_DOMAINS = "new_referring_domains";
  @SerializedName(SERIALIZED_NAME_NEW_REFERRING_DOMAINS)
  private Long newReferringDomains;

  public BacklinksBulkNewLostReferringDomainsLiveItem newReferringDomains(Long newReferringDomains) {
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

  public BacklinksBulkNewLostReferringDomainsLiveItem lostReferringDomains(Long lostReferringDomains) {
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

  public BacklinksBulkNewLostReferringDomainsLiveItem newReferringMainDomains(Long newReferringMainDomains) {
    this.newReferringMainDomains = newReferringMainDomains;
    return this;
  }

  /**
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

  public BacklinksBulkNewLostReferringDomainsLiveItem lostReferringMainDomains(Long lostReferringMainDomains) {
    this.lostReferringMainDomains = lostReferringMainDomains;
    return this;
  }

  /**
   * number of lost referring main domains pointing to the target
   * @return lostReferringMainDomains
   */
  @javax.annotation.Nullable
  public Long getLostReferringMainDomains() {
    return lostReferringMainDomains;
  }

  public void setLostReferringMainDomains(Long lostReferringMainDomains) {
    this.lostReferringMainDomains = lostReferringMainDomains;
  }



  public BacklinksBulkNewLostReferringDomainsLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksBulkNewLostReferringDomainsLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksBulkNewLostReferringDomainsLiveItem backlinksBulkNewLostReferringDomainsLiveItem = (BacklinksBulkNewLostReferringDomainsLiveItem) o;
    return

        Objects.equals(this.target, backlinksBulkNewLostReferringDomainsLiveItem.target) &&
        Objects.equals(this.newReferringDomains, backlinksBulkNewLostReferringDomainsLiveItem.newReferringDomains) &&
        Objects.equals(this.lostReferringDomains, backlinksBulkNewLostReferringDomainsLiveItem.lostReferringDomains) &&
        Objects.equals(this.newReferringMainDomains, backlinksBulkNewLostReferringDomainsLiveItem.newReferringMainDomains) &&
        Objects.equals(this.lostReferringMainDomains, backlinksBulkNewLostReferringDomainsLiveItem.lostReferringMainDomains);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, newReferringDomains, lostReferringDomains, newReferringMainDomains, lostReferringMainDomains);
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
    sb.append("class BacklinksBulkNewLostReferringDomainsLiveItem {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
    
    openapiFields.add("target");
    
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
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBulkNewLostReferringDomainsLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBulkNewLostReferringDomainsLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBulkNewLostReferringDomainsLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBulkNewLostReferringDomainsLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBulkNewLostReferringDomainsLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBulkNewLostReferringDomainsLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksBulkNewLostReferringDomainsLiveItem value) throws IOException {
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
           public BacklinksBulkNewLostReferringDomainsLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBulkNewLostReferringDomainsLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksBulkNewLostReferringDomainsLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBulkNewLostReferringDomainsLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}