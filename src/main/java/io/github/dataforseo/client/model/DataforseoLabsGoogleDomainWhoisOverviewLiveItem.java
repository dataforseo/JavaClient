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



public class DataforseoLabsGoogleDomainWhoisOverviewLiveItem  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain name
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_CREATED_DATETIME = "created_datetime";
  @SerializedName(SERIALIZED_NAME_CREATED_DATETIME)
  private String createdDatetime;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem createdDatetime(String createdDatetime) {
    this.createdDatetime = createdDatetime;
    return this;
  }

  /**
   * date and time of registration
* date and time (in the ISO 8601 format) when the domain was first registered
* example:
* '1997-03-29 03:00:00 +00:00'
   * @return createdDatetime
   */
  @javax.annotation.Nullable
  public String getCreatedDatetime() {
    return createdDatetime;
  }

  public void setCreatedDatetime(String createdDatetime) {
    this.createdDatetime = createdDatetime;
  }


  public static final String SERIALIZED_NAME_CHANGED_DATETIME = "changed_datetime";
  @SerializedName(SERIALIZED_NAME_CHANGED_DATETIME)
  private String changedDatetime;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem changedDatetime(String changedDatetime) {
    this.changedDatetime = changedDatetime;
    return this;
  }

  /**
   * date and time when the domain entry was changed
* date and time (in the ISO 8601 format) when the domain entry was last modified
* example:
* '2021-01-14 08:36:28 +00:00'
   * @return changedDatetime
   */
  @javax.annotation.Nullable
  public String getChangedDatetime() {
    return changedDatetime;
  }

  public void setChangedDatetime(String changedDatetime) {
    this.changedDatetime = changedDatetime;
  }


  public static final String SERIALIZED_NAME_EXPIRATION_DATETIME = "expiration_datetime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATETIME)
  private String expirationDatetime;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem expirationDatetime(String expirationDatetime) {
    this.expirationDatetime = expirationDatetime;
    return this;
  }

  /**
   * date and time when the domain will expire
* date and time (in the ISO 8601 format) when the domain is due to expire
* example:
* '2022-11-26 17:21:23 +00:00'
   * @return expirationDatetime
   */
  @javax.annotation.Nullable
  public String getExpirationDatetime() {
    return expirationDatetime;
  }

  public void setExpirationDatetime(String expirationDatetime) {
    this.expirationDatetime = expirationDatetime;
  }


  public static final String SERIALIZED_NAME_UPDATED_DATETIME = "updated_datetime";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATETIME)
  private String updatedDatetime;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem updatedDatetime(String updatedDatetime) {
    this.updatedDatetime = updatedDatetime;
    return this;
  }

  /**
   * date and time when the domain was updated
* date and time (in the ISO 8601 format) when the domain was last updated
* example:
* '2021-01-29 13:59:38 +00:00'
   * @return updatedDatetime
   */
  @javax.annotation.Nullable
  public String getUpdatedDatetime() {
    return updatedDatetime;
  }

  public void setUpdatedDatetime(String updatedDatetime) {
    this.updatedDatetime = updatedDatetime;
  }


  public static final String SERIALIZED_NAME_FIRST_SEEN = "first_seen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private String firstSeen;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * date and time when our crawler found the domain for the first time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* '2019-11-15 12:57:46 +00:00'
   * @return firstSeen
   */
  @javax.annotation.Nullable
  public String getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
  }


  public static final String SERIALIZED_NAME_EPP_STATUS_CODES = "epp_status_codes";
  @SerializedName(SERIALIZED_NAME_EPP_STATUS_CODES)
  private List<String> eppStatusCodes;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem eppStatusCodes(List<String> eppStatusCodes) {
    this.eppStatusCodes = eppStatusCodes;
    return this;
  }

  /**
   * extensive provisioning protocol status codes
* the status of a domain name registration as defined by ICANN
   * @return eppStatusCodes
   */
  @javax.annotation.Nullable
  public List<String> getEppStatusCodes() {
    return eppStatusCodes;
  }

  public void setEppStatusCodes(List<String> eppStatusCodes) {
    this.eppStatusCodes = eppStatusCodes;
  }


  public static final String SERIALIZED_NAME_TLD = "tld";
  @SerializedName(SERIALIZED_NAME_TLD)
  private String tld;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem tld(String tld) {
    this.tld = tld;
    return this;
  }

  /**
   * top-level domain
* top-level domain in the DNS root zone
   * @return tld
   */
  @javax.annotation.Nullable
  public String getTld() {
    return tld;
  }

  public void setTld(String tld) {
    this.tld = tld;
  }


  public static final String SERIALIZED_NAME_REGISTERED = "registered";
  @SerializedName(SERIALIZED_NAME_REGISTERED)
  private Boolean registered;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem registered(Boolean registered) {
    this.registered = registered;
    return this;
  }

  /**
   * domain registration status
* if false, the domain name registration has expired
* Note: expired domains will remain in the database for only a short period of time
   * @return registered
   */
  @javax.annotation.Nullable
  public Boolean getRegistered() {
    return registered;
  }

  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }


  public static final String SERIALIZED_NAME_REGISTRAR = "registrar";
  @SerializedName(SERIALIZED_NAME_REGISTRAR)
  private String registrar;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem registrar(String registrar) {
    this.registrar = registrar;
    return this;
  }

  /**
   * domain registrar
* if null, the domain registrar is unknown
* example:
* NameCheap, Inc.
   * @return registrar
   */
  @javax.annotation.Nullable
  public String getRegistrar() {
    return registrar;
  }

  public void setRegistrar(String registrar) {
    this.registrar = registrar;
  }


  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, DataforseoLabsMetricsInfo> metrics;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem metrics(Map<String, DataforseoLabsMetricsInfo> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * ranking data relevant to the specified domain
   * @return metrics
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, DataforseoLabsMetricsInfo> metrics) {
    this.metrics = metrics;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_INFO = "backlinks_info";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_INFO)
  private BacklinksInfo backlinksInfo;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem backlinksInfo(BacklinksInfo backlinksInfo) {
    this.backlinksInfo = backlinksInfo;
    return this;
  }

  /**
   * backlink data for the returned domain
   * @return backlinksInfo
   */
  @javax.annotation.Nullable
  public BacklinksInfo getBacklinksInfo() {
    return backlinksInfo;
  }

  public void setBacklinksInfo(BacklinksInfo backlinksInfo) {
    this.backlinksInfo = backlinksInfo;
  }



  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleDomainWhoisOverviewLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleDomainWhoisOverviewLiveItem dataforseoLabsGoogleDomainWhoisOverviewLiveItem = (DataforseoLabsGoogleDomainWhoisOverviewLiveItem) o;
    return

        Objects.equals(this.seType, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.seType) &&
        Objects.equals(this.domain, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.domain) &&
        Objects.equals(this.createdDatetime, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.createdDatetime) &&
        Objects.equals(this.changedDatetime, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.changedDatetime) &&
        Objects.equals(this.expirationDatetime, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.expirationDatetime) &&
        Objects.equals(this.updatedDatetime, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.updatedDatetime) &&
        Objects.equals(this.firstSeen, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.firstSeen) &&
        Objects.equals(this.eppStatusCodes, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.eppStatusCodes) &&
        Objects.equals(this.tld, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.tld) &&
        Objects.equals(this.registered, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.registered) &&
        Objects.equals(this.registrar, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.registrar) &&
        Objects.equals(this.metrics, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.metrics) &&
        Objects.equals(this.backlinksInfo, dataforseoLabsGoogleDomainWhoisOverviewLiveItem.backlinksInfo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, domain, createdDatetime, changedDatetime, expirationDatetime, updatedDatetime, firstSeen, eppStatusCodes, tld, registered, registrar, metrics, backlinksInfo);
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
    sb.append("class DataforseoLabsGoogleDomainWhoisOverviewLiveItem {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
    sb.append("    changedDatetime: ").append(toIndentedString(changedDatetime)).append("\n");
    sb.append("    expirationDatetime: ").append(toIndentedString(expirationDatetime)).append("\n");
    sb.append("    updatedDatetime: ").append(toIndentedString(updatedDatetime)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    eppStatusCodes: ").append(toIndentedString(eppStatusCodes)).append("\n");
    sb.append("    tld: ").append(toIndentedString(tld)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    backlinksInfo: ").append(toIndentedString(backlinksInfo)).append("\n");
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
    
    openapiFields.add("se_type");
    
    openapiFields.add("domain");
    
    openapiFields.add("created_datetime");
    
    openapiFields.add("changed_datetime");
    
    openapiFields.add("expiration_datetime");
    
    openapiFields.add("updated_datetime");
    
    openapiFields.add("first_seen");
    
    openapiFields.add("epp_status_codes");
    
    openapiFields.add("tld");
    
    openapiFields.add("registered");
    
    openapiFields.add("registrar");
    
    openapiFields.add("metrics");
    
    openapiFields.add("backlinks_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleDomainWhoisOverviewLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleDomainWhoisOverviewLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleDomainWhoisOverviewLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleDomainWhoisOverviewLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleDomainWhoisOverviewLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleDomainWhoisOverviewLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleDomainWhoisOverviewLiveItem value) throws IOException {
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
           public DataforseoLabsGoogleDomainWhoisOverviewLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleDomainWhoisOverviewLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleDomainWhoisOverviewLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleDomainWhoisOverviewLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}