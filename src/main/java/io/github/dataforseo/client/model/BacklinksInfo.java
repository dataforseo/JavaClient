/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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

/**
 * BacklinksInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BacklinksInfo {
  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Long referringDomains;

  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS = "referring_main_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS)
  private Long referringMainDomains;

  public static final String SERIALIZED_NAME_REFERRING_PAGES = "referring_pages";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES)
  private Long referringPages;

  public static final String SERIALIZED_NAME_DOFOLLOW = "dofollow";
  @SerializedName(SERIALIZED_NAME_DOFOLLOW)
  private Long dofollow;

  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Long backlinks;

  public static final String SERIALIZED_NAME_TIME_UPDATE = "time_update";
  @SerializedName(SERIALIZED_NAME_TIME_UPDATE)
  private String timeUpdate;

  public BacklinksInfo() {
  }

  public BacklinksInfo referringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * number of referring domains
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public Long getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
  }


  public BacklinksInfo referringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

  /**
   * number of referring main domains
   * @return referringMainDomains
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomains() {
    return referringMainDomains;
  }

  public void setReferringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
  }


  public BacklinksInfo referringPages(Long referringPages) {
    this.referringPages = referringPages;
    return this;
  }

  /**
   * number of referring pages
   * @return referringPages
   */
  @javax.annotation.Nullable
  public Long getReferringPages() {
    return referringPages;
  }

  public void setReferringPages(Long referringPages) {
    this.referringPages = referringPages;
  }


  public BacklinksInfo dofollow(Long dofollow) {
    this.dofollow = dofollow;
    return this;
  }

  /**
   * number of dofollow links
   * @return dofollow
   */
  @javax.annotation.Nullable
  public Long getDofollow() {
    return dofollow;
  }

  public void setDofollow(Long dofollow) {
    this.dofollow = dofollow;
  }


  public BacklinksInfo backlinks(Long backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * total number of backlinks the total number of backlinks, including dofollow and nofollow links
   * @return backlinks
   */
  @javax.annotation.Nullable
  public Long getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(Long backlinks) {
    this.backlinks = backlinks;
  }


  public BacklinksInfo timeUpdate(String timeUpdate) {
    this.timeUpdate = timeUpdate;
    return this;
  }

  /**
   * date and time when backlink data was updated in the UTC format: \&quot;yyyy-mm-dd hh-mm-ss +00:00\&quot; example: 2019-11-15 12:57:46 +00:00
   * @return timeUpdate
   */
  @javax.annotation.Nullable
  public String getTimeUpdate() {
    return timeUpdate;
  }

  public void setTimeUpdate(String timeUpdate) {
    this.timeUpdate = timeUpdate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BacklinksInfo instance itself
   */
  public BacklinksInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    BacklinksInfo backlinksInfo = (BacklinksInfo) o;
    return Objects.equals(this.referringDomains, backlinksInfo.referringDomains) &&
        Objects.equals(this.referringMainDomains, backlinksInfo.referringMainDomains) &&
        Objects.equals(this.referringPages, backlinksInfo.referringPages) &&
        Objects.equals(this.dofollow, backlinksInfo.dofollow) &&
        Objects.equals(this.backlinks, backlinksInfo.backlinks) &&
        Objects.equals(this.timeUpdate, backlinksInfo.timeUpdate)&&
        Objects.equals(this.additionalProperties, backlinksInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(referringDomains, referringMainDomains, referringPages, dofollow, backlinks, timeUpdate, additionalProperties);
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
    sb.append("class BacklinksInfo {\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    referringMainDomains: ").append(toIndentedString(referringMainDomains)).append("\n");
    sb.append("    referringPages: ").append(toIndentedString(referringPages)).append("\n");
    sb.append("    dofollow: ").append(toIndentedString(dofollow)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    timeUpdate: ").append(toIndentedString(timeUpdate)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("referring_domains");
    openapiFields.add("referring_main_domains");
    openapiFields.add("referring_pages");
    openapiFields.add("dofollow");
    openapiFields.add("backlinks");
    openapiFields.add("time_update");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BacklinksInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BacklinksInfo is not found in the empty JSON string", BacklinksInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("time_update") != null && !jsonObj.get("time_update").isJsonNull()) && !jsonObj.get("time_update").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_update` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_update").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksInfo value) throws IOException {
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
           public BacklinksInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of BacklinksInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BacklinksInfo
   * @throws IOException if the JSON string is invalid with respect to BacklinksInfo
   */
  public static BacklinksInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksInfo.class);
  }

  /**
   * Convert an instance of BacklinksInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
