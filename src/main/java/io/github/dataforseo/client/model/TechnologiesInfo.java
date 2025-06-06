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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * TechnologiesInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class TechnologiesInfo {
  public static final String SERIALIZED_NAME_ADD_ONS = "add_ons";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private Map<String, List<String>> addOns;

  public static final String SERIALIZED_NAME_ANALYTICS = "analytics";
  @SerializedName(SERIALIZED_NAME_ANALYTICS)
  private Map<String, List<String>> analytics;

  public static final String SERIALIZED_NAME_WEB_DEVELOPMENT = "web_development";
  @SerializedName(SERIALIZED_NAME_WEB_DEVELOPMENT)
  private Map<String, List<String>> webDevelopment;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private Map<String, List<String>> security;

  public static final String SERIALIZED_NAME_BUSINESS_TOOLS = "business_tools";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TOOLS)
  private Map<String, List<String>> businessTools;

  public static final String SERIALIZED_NAME_SALES = "sales";
  @SerializedName(SERIALIZED_NAME_SALES)
  private Map<String, List<String>> sales;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Map<String, List<String>> other;

  public static final String SERIALIZED_NAME_USER_GENERATED_CONTENT = "user_generated_content";
  @SerializedName(SERIALIZED_NAME_USER_GENERATED_CONTENT)
  private Map<String, List<String>> userGeneratedContent;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private Map<String, List<String>> privacy;

  public static final String SERIALIZED_NAME_SERVERS = "servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private Map<String, List<String>> servers;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Map<String, List<String>> location;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Map<String, List<String>> content;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private Map<String, List<String>> media;

  public static final String SERIALIZED_NAME_MARKETING = "marketing";
  @SerializedName(SERIALIZED_NAME_MARKETING)
  private Map<String, List<String>> marketing;

  public static final String SERIALIZED_NAME_COMMUNICATION = "communication";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION)
  private Map<String, List<String>> communication;

  public static final String SERIALIZED_NAME_UTILITIES = "utilities";
  @SerializedName(SERIALIZED_NAME_UTILITIES)
  private Map<String, List<String>> utilities;

  public TechnologiesInfo() {
  }

  public TechnologiesInfo addOns(Map<String, List<String>> addOns) {
    this.addOns = addOns;
    return this;
  }

  public TechnologiesInfo putAddOnsItem(String key, List<String> addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new HashMap<>();
    }
    this.addOns.put(key, addOnsItem);
    return this;
  }

  /**
   * Get addOns
   * @return addOns
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getAddOns() {
    return addOns;
  }

  public void setAddOns(Map<String, List<String>> addOns) {
    this.addOns = addOns;
  }


  public TechnologiesInfo analytics(Map<String, List<String>> analytics) {
    this.analytics = analytics;
    return this;
  }

  public TechnologiesInfo putAnalyticsItem(String key, List<String> analyticsItem) {
    if (this.analytics == null) {
      this.analytics = new HashMap<>();
    }
    this.analytics.put(key, analyticsItem);
    return this;
  }

  /**
   * Get analytics
   * @return analytics
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getAnalytics() {
    return analytics;
  }

  public void setAnalytics(Map<String, List<String>> analytics) {
    this.analytics = analytics;
  }


  public TechnologiesInfo webDevelopment(Map<String, List<String>> webDevelopment) {
    this.webDevelopment = webDevelopment;
    return this;
  }

  public TechnologiesInfo putWebDevelopmentItem(String key, List<String> webDevelopmentItem) {
    if (this.webDevelopment == null) {
      this.webDevelopment = new HashMap<>();
    }
    this.webDevelopment.put(key, webDevelopmentItem);
    return this;
  }

  /**
   * Get webDevelopment
   * @return webDevelopment
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getWebDevelopment() {
    return webDevelopment;
  }

  public void setWebDevelopment(Map<String, List<String>> webDevelopment) {
    this.webDevelopment = webDevelopment;
  }


  public TechnologiesInfo security(Map<String, List<String>> security) {
    this.security = security;
    return this;
  }

  public TechnologiesInfo putSecurityItem(String key, List<String> securityItem) {
    if (this.security == null) {
      this.security = new HashMap<>();
    }
    this.security.put(key, securityItem);
    return this;
  }

  /**
   * Get security
   * @return security
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getSecurity() {
    return security;
  }

  public void setSecurity(Map<String, List<String>> security) {
    this.security = security;
  }


  public TechnologiesInfo businessTools(Map<String, List<String>> businessTools) {
    this.businessTools = businessTools;
    return this;
  }

  public TechnologiesInfo putBusinessToolsItem(String key, List<String> businessToolsItem) {
    if (this.businessTools == null) {
      this.businessTools = new HashMap<>();
    }
    this.businessTools.put(key, businessToolsItem);
    return this;
  }

  /**
   * Get businessTools
   * @return businessTools
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getBusinessTools() {
    return businessTools;
  }

  public void setBusinessTools(Map<String, List<String>> businessTools) {
    this.businessTools = businessTools;
  }


  public TechnologiesInfo sales(Map<String, List<String>> sales) {
    this.sales = sales;
    return this;
  }

  public TechnologiesInfo putSalesItem(String key, List<String> salesItem) {
    if (this.sales == null) {
      this.sales = new HashMap<>();
    }
    this.sales.put(key, salesItem);
    return this;
  }

  /**
   * Get sales
   * @return sales
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getSales() {
    return sales;
  }

  public void setSales(Map<String, List<String>> sales) {
    this.sales = sales;
  }


  public TechnologiesInfo other(Map<String, List<String>> other) {
    this.other = other;
    return this;
  }

  public TechnologiesInfo putOtherItem(String key, List<String> otherItem) {
    if (this.other == null) {
      this.other = new HashMap<>();
    }
    this.other.put(key, otherItem);
    return this;
  }

  /**
   * Get other
   * @return other
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getOther() {
    return other;
  }

  public void setOther(Map<String, List<String>> other) {
    this.other = other;
  }


  public TechnologiesInfo userGeneratedContent(Map<String, List<String>> userGeneratedContent) {
    this.userGeneratedContent = userGeneratedContent;
    return this;
  }

  public TechnologiesInfo putUserGeneratedContentItem(String key, List<String> userGeneratedContentItem) {
    if (this.userGeneratedContent == null) {
      this.userGeneratedContent = new HashMap<>();
    }
    this.userGeneratedContent.put(key, userGeneratedContentItem);
    return this;
  }

  /**
   * Get userGeneratedContent
   * @return userGeneratedContent
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getUserGeneratedContent() {
    return userGeneratedContent;
  }

  public void setUserGeneratedContent(Map<String, List<String>> userGeneratedContent) {
    this.userGeneratedContent = userGeneratedContent;
  }


  public TechnologiesInfo privacy(Map<String, List<String>> privacy) {
    this.privacy = privacy;
    return this;
  }

  public TechnologiesInfo putPrivacyItem(String key, List<String> privacyItem) {
    if (this.privacy == null) {
      this.privacy = new HashMap<>();
    }
    this.privacy.put(key, privacyItem);
    return this;
  }

  /**
   * Get privacy
   * @return privacy
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getPrivacy() {
    return privacy;
  }

  public void setPrivacy(Map<String, List<String>> privacy) {
    this.privacy = privacy;
  }


  public TechnologiesInfo servers(Map<String, List<String>> servers) {
    this.servers = servers;
    return this;
  }

  public TechnologiesInfo putServersItem(String key, List<String> serversItem) {
    if (this.servers == null) {
      this.servers = new HashMap<>();
    }
    this.servers.put(key, serversItem);
    return this;
  }

  /**
   * Get servers
   * @return servers
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getServers() {
    return servers;
  }

  public void setServers(Map<String, List<String>> servers) {
    this.servers = servers;
  }


  public TechnologiesInfo location(Map<String, List<String>> location) {
    this.location = location;
    return this;
  }

  public TechnologiesInfo putLocationItem(String key, List<String> locationItem) {
    if (this.location == null) {
      this.location = new HashMap<>();
    }
    this.location.put(key, locationItem);
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getLocation() {
    return location;
  }

  public void setLocation(Map<String, List<String>> location) {
    this.location = location;
  }


  public TechnologiesInfo content(Map<String, List<String>> content) {
    this.content = content;
    return this;
  }

  public TechnologiesInfo putContentItem(String key, List<String> contentItem) {
    if (this.content == null) {
      this.content = new HashMap<>();
    }
    this.content.put(key, contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getContent() {
    return content;
  }

  public void setContent(Map<String, List<String>> content) {
    this.content = content;
  }


  public TechnologiesInfo media(Map<String, List<String>> media) {
    this.media = media;
    return this;
  }

  public TechnologiesInfo putMediaItem(String key, List<String> mediaItem) {
    if (this.media == null) {
      this.media = new HashMap<>();
    }
    this.media.put(key, mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getMedia() {
    return media;
  }

  public void setMedia(Map<String, List<String>> media) {
    this.media = media;
  }


  public TechnologiesInfo marketing(Map<String, List<String>> marketing) {
    this.marketing = marketing;
    return this;
  }

  public TechnologiesInfo putMarketingItem(String key, List<String> marketingItem) {
    if (this.marketing == null) {
      this.marketing = new HashMap<>();
    }
    this.marketing.put(key, marketingItem);
    return this;
  }

  /**
   * Get marketing
   * @return marketing
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getMarketing() {
    return marketing;
  }

  public void setMarketing(Map<String, List<String>> marketing) {
    this.marketing = marketing;
  }


  public TechnologiesInfo communication(Map<String, List<String>> communication) {
    this.communication = communication;
    return this;
  }

  public TechnologiesInfo putCommunicationItem(String key, List<String> communicationItem) {
    if (this.communication == null) {
      this.communication = new HashMap<>();
    }
    this.communication.put(key, communicationItem);
    return this;
  }

  /**
   * Get communication
   * @return communication
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getCommunication() {
    return communication;
  }

  public void setCommunication(Map<String, List<String>> communication) {
    this.communication = communication;
  }


  public TechnologiesInfo utilities(Map<String, List<String>> utilities) {
    this.utilities = utilities;
    return this;
  }

  public TechnologiesInfo putUtilitiesItem(String key, List<String> utilitiesItem) {
    if (this.utilities == null) {
      this.utilities = new HashMap<>();
    }
    this.utilities.put(key, utilitiesItem);
    return this;
  }

  /**
   * Get utilities
   * @return utilities
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getUtilities() {
    return utilities;
  }

  public void setUtilities(Map<String, List<String>> utilities) {
    this.utilities = utilities;
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
   * @return the TechnologiesInfo instance itself
   */
  public TechnologiesInfo putAdditionalProperty(String key, Object value) {
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
    TechnologiesInfo technologiesInfo = (TechnologiesInfo) o;
    return Objects.equals(this.addOns, technologiesInfo.addOns) &&
        Objects.equals(this.analytics, technologiesInfo.analytics) &&
        Objects.equals(this.webDevelopment, technologiesInfo.webDevelopment) &&
        Objects.equals(this.security, technologiesInfo.security) &&
        Objects.equals(this.businessTools, technologiesInfo.businessTools) &&
        Objects.equals(this.sales, technologiesInfo.sales) &&
        Objects.equals(this.other, technologiesInfo.other) &&
        Objects.equals(this.userGeneratedContent, technologiesInfo.userGeneratedContent) &&
        Objects.equals(this.privacy, technologiesInfo.privacy) &&
        Objects.equals(this.servers, technologiesInfo.servers) &&
        Objects.equals(this.location, technologiesInfo.location) &&
        Objects.equals(this.content, technologiesInfo.content) &&
        Objects.equals(this.media, technologiesInfo.media) &&
        Objects.equals(this.marketing, technologiesInfo.marketing) &&
        Objects.equals(this.communication, technologiesInfo.communication) &&
        Objects.equals(this.utilities, technologiesInfo.utilities)&&
        Objects.equals(this.additionalProperties, technologiesInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, analytics, webDevelopment, security, businessTools, sales, other, userGeneratedContent, privacy, servers, location, content, media, marketing, communication, utilities, additionalProperties);
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
    sb.append("class TechnologiesInfo {\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
    sb.append("    webDevelopment: ").append(toIndentedString(webDevelopment)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    businessTools: ").append(toIndentedString(businessTools)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    userGeneratedContent: ").append(toIndentedString(userGeneratedContent)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    utilities: ").append(toIndentedString(utilities)).append("\n");
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
    openapiFields.add("add_ons");
    openapiFields.add("analytics");
    openapiFields.add("web_development");
    openapiFields.add("security");
    openapiFields.add("business_tools");
    openapiFields.add("sales");
    openapiFields.add("other");
    openapiFields.add("user_generated_content");
    openapiFields.add("privacy");
    openapiFields.add("servers");
    openapiFields.add("location");
    openapiFields.add("content");
    openapiFields.add("media");
    openapiFields.add("marketing");
    openapiFields.add("communication");
    openapiFields.add("utilities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TechnologiesInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TechnologiesInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TechnologiesInfo is not found in the empty JSON string", TechnologiesInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TechnologiesInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TechnologiesInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TechnologiesInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TechnologiesInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TechnologiesInfo>() {
           @Override
           public void write(JsonWriter out, TechnologiesInfo value) throws IOException {
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
           public TechnologiesInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TechnologiesInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TechnologiesInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TechnologiesInfo
   * @throws IOException if the JSON string is invalid with respect to TechnologiesInfo
   */
  public static TechnologiesInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TechnologiesInfo.class);
  }

  /**
   * Convert an instance of TechnologiesInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

