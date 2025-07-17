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



public class TargetInfo  {


  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

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


  public static final String SERIALIZED_NAME_CMS = "cms";
  @SerializedName(SERIALIZED_NAME_CMS)
  private String cms;

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


  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private List<String> platformType;

  public TargetInfo platformType(List<String> platformType) {
    this.platformType = platformType;
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


  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

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


  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

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


  public static final String SERIALIZED_NAME_IS_IP = "is_ip";
  @SerializedName(SERIALIZED_NAME_IS_IP)
  private Boolean isIp;

  public TargetInfo isIp(Boolean isIp) {
    this.isIp = isIp;
    return this;
  }

  /**
   * indicates if the target is IP
* if true, the domain, subdomain or webpage functions as an IP address and does not have a domain name
   * @return isIp
   */
  @javax.annotation.Nullable
  public Boolean getIsIp() {
    return isIp;
  }

  public void setIsIp(Boolean isIp) {
    this.isIp = isIp;
  }


  public static final String SERIALIZED_NAME_TARGET_SPAM_SCORE = "target_spam_score";
  @SerializedName(SERIALIZED_NAME_TARGET_SPAM_SCORE)
  private Integer targetSpamScore;

  public TargetInfo targetSpamScore(Integer targetSpamScore) {
    this.targetSpamScore = targetSpamScore;
    return this;
  }

  /**
   * spam score of the target
* if the target is a domain/subdomain, this fields indicates the average spam score of all pages of that domain/subdomain;
* learn more about how the metric is calculated on this help center page
   * @return targetSpamScore
   */
  @javax.annotation.Nullable
  public Integer getTargetSpamScore() {
    return targetSpamScore;
  }

  public void setTargetSpamScore(Integer targetSpamScore) {
    this.targetSpamScore = targetSpamScore;
  }



  public TargetInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public TargetInfo putAdditionalProperty(String key, Object value) {
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


    
    TargetInfo targetInfo = (TargetInfo) o;
    return

        Objects.equals(this.server, targetInfo.server) &&
        Objects.equals(this.cms, targetInfo.cms) &&
        Objects.equals(this.platformType, targetInfo.platformType) &&
        Objects.equals(this.ipAddress, targetInfo.ipAddress) &&
        Objects.equals(this.country, targetInfo.country) &&
        Objects.equals(this.isIp, targetInfo.isIp) &&
        Objects.equals(this.targetSpamScore, targetInfo.targetSpamScore);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(server, cms, platformType, ipAddress, country, isIp, targetSpamScore);
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


  public static TargetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}