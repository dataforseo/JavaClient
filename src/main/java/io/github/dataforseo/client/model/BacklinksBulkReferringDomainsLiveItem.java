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



public class BacklinksBulkReferringDomainsLiveItem  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public BacklinksBulkReferringDomainsLiveItem target(String target) {
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


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Long referringDomains;

  public BacklinksBulkReferringDomainsLiveItem referringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * number of referring domains pointing to the target
* note that we calculate main domains (root domains, like example.com) and their subdomains (e.g. blog.example.com) separately for this metric
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public Long getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW = "referring_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW)
  private Long referringDomainsNofollow;

  public BacklinksBulkReferringDomainsLiveItem referringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
    return this;
  }

  /**
   * number of domains pointing at least one nofollow link to the target
   * @return referringDomainsNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringDomainsNofollow() {
    return referringDomainsNofollow;
  }

  public void setReferringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS = "referring_main_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS)
  private Long referringMainDomains;

  public BacklinksBulkReferringDomainsLiveItem referringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

  /**
   * number of referring main domains pointing to the target
* the number of primary (root) domains referring to your target
   * @return referringMainDomains
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomains() {
    return referringMainDomains;
  }

  public void setReferringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW = "referring_main_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW)
  private Long referringMainDomainsNofollow;

  public BacklinksBulkReferringDomainsLiveItem referringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
    return this;
  }

  /**
   * number of main domains pointing at least one nofollow link to the target
   * @return referringMainDomainsNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomainsNofollow() {
    return referringMainDomainsNofollow;
  }

  public void setReferringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
  }



  public BacklinksBulkReferringDomainsLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksBulkReferringDomainsLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksBulkReferringDomainsLiveItem backlinksBulkReferringDomainsLiveItem = (BacklinksBulkReferringDomainsLiveItem) o;
    return

        Objects.equals(this.target, backlinksBulkReferringDomainsLiveItem.target) &&
        Objects.equals(this.referringDomains, backlinksBulkReferringDomainsLiveItem.referringDomains) &&
        Objects.equals(this.referringDomainsNofollow, backlinksBulkReferringDomainsLiveItem.referringDomainsNofollow) &&
        Objects.equals(this.referringMainDomains, backlinksBulkReferringDomainsLiveItem.referringMainDomains) &&
        Objects.equals(this.referringMainDomainsNofollow, backlinksBulkReferringDomainsLiveItem.referringMainDomainsNofollow);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, referringDomains, referringDomainsNofollow, referringMainDomains, referringMainDomainsNofollow);
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
    sb.append("class BacklinksBulkReferringDomainsLiveItem {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    referringDomainsNofollow: ").append(toIndentedString(referringDomainsNofollow)).append("\n");
    sb.append("    referringMainDomains: ").append(toIndentedString(referringMainDomains)).append("\n");
    sb.append("    referringMainDomainsNofollow: ").append(toIndentedString(referringMainDomainsNofollow)).append("\n");
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
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("referring_domains_nofollow");
    
    openapiFields.add("referring_main_domains");
    
    openapiFields.add("referring_main_domains_nofollow");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBulkReferringDomainsLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBulkReferringDomainsLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBulkReferringDomainsLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBulkReferringDomainsLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBulkReferringDomainsLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBulkReferringDomainsLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksBulkReferringDomainsLiveItem value) throws IOException {
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
           public BacklinksBulkReferringDomainsLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBulkReferringDomainsLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksBulkReferringDomainsLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBulkReferringDomainsLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}