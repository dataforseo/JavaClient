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



public class SslInfo  {


  public static final String SERIALIZED_NAME_VALID_CERTIFICATE = "valid_certificate";
  @SerializedName(SERIALIZED_NAME_VALID_CERTIFICATE)
  private Boolean validCertificate;

  public SslInfo validCertificate(Boolean validCertificate) {
    this.validCertificate = validCertificate;
    return this;
  }

  /**
   * ssl certificate validity
* indicates whether the ssl certificate detected on a website is not expired, suspended, revoked or invalid
   * @return validCertificate
   */
  @javax.annotation.Nullable
  public Boolean getValidCertificate() {
    return validCertificate;
  }

  public void setValidCertificate(Boolean validCertificate) {
    this.validCertificate = validCertificate;
  }


  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER = "certificate_issuer";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER)
  private String certificateIssuer;

  public SslInfo certificateIssuer(String certificateIssuer) {
    this.certificateIssuer = certificateIssuer;
    return this;
  }

  /**
   * ssl certificate authority
* the entity that issued the detected ssl certificate
   * @return certificateIssuer
   */
  @javax.annotation.Nullable
  public String getCertificateIssuer() {
    return certificateIssuer;
  }

  public void setCertificateIssuer(String certificateIssuer) {
    this.certificateIssuer = certificateIssuer;
  }


  public static final String SERIALIZED_NAME_CERTIFICATE_SUBJECT = "certificate_subject";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_SUBJECT)
  private String certificateSubject;

  public SslInfo certificateSubject(String certificateSubject) {
    this.certificateSubject = certificateSubject;
    return this;
  }

  /**
   * ssl certificate subject
* the entity associated with the public key
   * @return certificateSubject
   */
  @javax.annotation.Nullable
  public String getCertificateSubject() {
    return certificateSubject;
  }

  public void setCertificateSubject(String certificateSubject) {
    this.certificateSubject = certificateSubject;
  }


  public static final String SERIALIZED_NAME_CERTIFICATE_VERSION = "certificate_version";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_VERSION)
  private Integer certificateVersion;

  public SslInfo certificateVersion(Integer certificateVersion) {
    this.certificateVersion = certificateVersion;
    return this;
  }

  /**
   * ssl certificate version
* indicates the version of X.509 used by an ssl certificate
   * @return certificateVersion
   */
  @javax.annotation.Nullable
  public Integer getCertificateVersion() {
    return certificateVersion;
  }

  public void setCertificateVersion(Integer certificateVersion) {
    this.certificateVersion = certificateVersion;
  }


  public static final String SERIALIZED_NAME_CERTIFICATE_HASH = "certificate_hash";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_HASH)
  private String certificateHash;

  public SslInfo certificateHash(String certificateHash) {
    this.certificateHash = certificateHash;
    return this;
  }

  /**
   * ssl certificate hash
* the version of the ssl certificate’s hash function
   * @return certificateHash
   */
  @javax.annotation.Nullable
  public String getCertificateHash() {
    return certificateHash;
  }

  public void setCertificateHash(String certificateHash) {
    this.certificateHash = certificateHash;
  }


  public static final String SERIALIZED_NAME_CERTIFICATE_EXPIRATION_DATE = "certificate_expiration_date";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_EXPIRATION_DATE)
  private String certificateExpirationDate;

  public SslInfo certificateExpirationDate(String certificateExpirationDate) {
    this.certificateExpirationDate = certificateExpirationDate;
    return this;
  }

  /**
   * ssl certificate expiration date
* the date and time when the ssl certificate expires
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return certificateExpirationDate
   */
  @javax.annotation.Nullable
  public String getCertificateExpirationDate() {
    return certificateExpirationDate;
  }

  public void setCertificateExpirationDate(String certificateExpirationDate) {
    this.certificateExpirationDate = certificateExpirationDate;
  }



  public SslInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SslInfo putAdditionalProperty(String key, Object value) {
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


    
    SslInfo sslInfo = (SslInfo) o;
    return

        Objects.equals(this.validCertificate, sslInfo.validCertificate) &&
        Objects.equals(this.certificateIssuer, sslInfo.certificateIssuer) &&
        Objects.equals(this.certificateSubject, sslInfo.certificateSubject) &&
        Objects.equals(this.certificateVersion, sslInfo.certificateVersion) &&
        Objects.equals(this.certificateHash, sslInfo.certificateHash) &&
        Objects.equals(this.certificateExpirationDate, sslInfo.certificateExpirationDate);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(validCertificate, certificateIssuer, certificateSubject, certificateVersion, certificateHash, certificateExpirationDate);
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
    sb.append("class SslInfo {\n");

    sb.append("    validCertificate: ").append(toIndentedString(validCertificate)).append("\n");
    sb.append("    certificateIssuer: ").append(toIndentedString(certificateIssuer)).append("\n");
    sb.append("    certificateSubject: ").append(toIndentedString(certificateSubject)).append("\n");
    sb.append("    certificateVersion: ").append(toIndentedString(certificateVersion)).append("\n");
    sb.append("    certificateHash: ").append(toIndentedString(certificateHash)).append("\n");
    sb.append("    certificateExpirationDate: ").append(toIndentedString(certificateExpirationDate)).append("\n");
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
    
    openapiFields.add("valid_certificate");
    
    openapiFields.add("certificate_issuer");
    
    openapiFields.add("certificate_subject");
    
    openapiFields.add("certificate_version");
    
    openapiFields.add("certificate_hash");
    
    openapiFields.add("certificate_expiration_date");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SslInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SslInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SslInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SslInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SslInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SslInfo>() {
           @Override
           public void write(JsonWriter out, SslInfo value) throws IOException {
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
           public SslInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SslInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SslInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SslInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}