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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * TargetInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class TargetInfo {
  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_CMS = "cms";
  @SerializedName(SERIALIZED_NAME_CMS)
  private String cms;

  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private List<String> platformType;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_IS_IP = "is_ip";
  @SerializedName(SERIALIZED_NAME_IS_IP)
  private Boolean isIp;

  public static final String SERIALIZED_NAME_TARGET_SPAM_SCORE = "target_spam_score";
  @SerializedName(SERIALIZED_NAME_TARGET_SPAM_SCORE)
  private Integer targetSpamScore;

  public TargetInfo() {
  }

  public TargetInfo server(String server) {
    this.server = server;
    return this;
  }

  /**
   * server
   * @return server
   */
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public TargetInfo cms(String cms) {
    this.cms = cms;
    return this;
  }

  /**
   * content management system
   * @return cms
   */
  @javax.annotation.Nullable
  public String getCms() {
    return cms;
  }

  public void setCms(String cms) {
    this.cms = cms;
  }


  public TargetInfo platformType(List<String> platformType) {
    this.platformType = platformType;
    return this;
  }

  public TargetInfo addPlatformTypeItem(String platformTypeItem) {
    if (this.platformType == null) {
      this.platformType = new ArrayList<>();
    }
    this.platformType.add(platformTypeItem);
    return this;
  }

  /**
   * platform type
   * @return platformType
   */
  @javax.annotation.Nullable
  public List<String> getPlatformType() {
    return platformType;
  }

  public void setPlatformType(List<String> platformType) {
    this.platformType = platformType;
  }


  public TargetInfo ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IP address of the target
   * @return ipAddress
   */
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public TargetInfo country(String country) {
    this.country = country;
    return this;
  }

  /**
   * country code that the target domain is determined to belong to
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public TargetInfo isIp(Boolean isIp) {
    this.isIp = isIp;
    return this;
  }

  /**
   * indicates if the target is IP if true, the domain, subdomain or webpage functions as an IP address and does not have a domain name
   * @return isIp
   */
  @javax.annotation.Nullable
  public Boolean getIsIp() {
    return isIp;
  }

  public void setIsIp(Boolean isIp) {
    this.isIp = isIp;
  }


  public TargetInfo targetSpamScore(Integer targetSpamScore) {
    this.targetSpamScore = targetSpamScore;
    return this;
  }

  /**
   * spam score of the target if the target is a domain/subdomain, this fields indicates the average spam score of all pages of that domain/subdomain; learn more about how the metric is calculated on this help center page
   * @return targetSpamScore
   */
  @javax.annotation.Nullable
  public Integer getTargetSpamScore() {
    return targetSpamScore;
  }

  public void setTargetSpamScore(Integer targetSpamScore) {
    this.targetSpamScore = targetSpamScore;
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
   * @return the TargetInfo instance itself
   */
  public TargetInfo putAdditionalProperty(String key, Object value) {
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
    TargetInfo targetInfo = (TargetInfo) o;
    return Objects.equals(this.server, targetInfo.server) &&
        Objects.equals(this.cms, targetInfo.cms) &&
        Objects.equals(this.platformType, targetInfo.platformType) &&
        Objects.equals(this.ipAddress, targetInfo.ipAddress) &&
        Objects.equals(this.country, targetInfo.country) &&
        Objects.equals(this.isIp, targetInfo.isIp) &&
        Objects.equals(this.targetSpamScore, targetInfo.targetSpamScore)&&
        Objects.equals(this.additionalProperties, targetInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(server, cms, platformType, ipAddress, country, isIp, targetSpamScore, additionalProperties);
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
    sb.append("class TargetInfo {\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    cms: ").append(toIndentedString(cms)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isIp: ").append(toIndentedString(isIp)).append("\n");
    sb.append("    targetSpamScore: ").append(toIndentedString(targetSpamScore)).append("\n");
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
    openapiFields.add("server");
    openapiFields.add("cms");
    openapiFields.add("platform_type");
    openapiFields.add("ip_address");
    openapiFields.add("country");
    openapiFields.add("is_ip");
    openapiFields.add("target_spam_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetInfo is not found in the empty JSON string", TargetInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("cms") != null && !jsonObj.get("cms").isJsonNull()) && !jsonObj.get("cms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cms").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("platform_type") != null && !jsonObj.get("platform_type").isJsonNull() && !jsonObj.get("platform_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_type` to be an array in the JSON string but got `%s`", jsonObj.get("platform_type").toString()));
      }
      if ((jsonObj.get("ip_address") != null && !jsonObj.get("ip_address").isJsonNull()) && !jsonObj.get("ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_address").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetInfo>() {
           @Override
           public void write(JsonWriter out, TargetInfo value) throws IOException {
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
           public TargetInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TargetInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TargetInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetInfo
   * @throws IOException if the JSON string is invalid with respect to TargetInfo
   */
  public static TargetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetInfo.class);
  }

  /**
   * Convert an instance of TargetInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
