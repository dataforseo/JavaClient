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



public class TechnologiesInfo  {


  public static final String SERIALIZED_NAME_ADD_ONS = "add_ons";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private Map<String, List<String>> addOns;

  public TechnologiesInfo addOns(Map<String, List<String>> addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * 
   * @return addOns
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getAddOns() {
    return addOns;
  }

  public void setAddOns(Map<String, List<String>> addOns) {
    this.addOns = addOns;
  }


  public static final String SERIALIZED_NAME_ANALYTICS = "analytics";
  @SerializedName(SERIALIZED_NAME_ANALYTICS)
  private Map<String, List<String>> analytics;

  public TechnologiesInfo analytics(Map<String, List<String>> analytics) {
    this.analytics = analytics;
    return this;
  }

  /**
   * 
   * @return analytics
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getAnalytics() {
    return analytics;
  }

  public void setAnalytics(Map<String, List<String>> analytics) {
    this.analytics = analytics;
  }


  public static final String SERIALIZED_NAME_WEB_DEVELOPMENT = "web_development";
  @SerializedName(SERIALIZED_NAME_WEB_DEVELOPMENT)
  private Map<String, List<String>> webDevelopment;

  public TechnologiesInfo webDevelopment(Map<String, List<String>> webDevelopment) {
    this.webDevelopment = webDevelopment;
    return this;
  }

  /**
   * 
   * @return webDevelopment
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getWebDevelopment() {
    return webDevelopment;
  }

  public void setWebDevelopment(Map<String, List<String>> webDevelopment) {
    this.webDevelopment = webDevelopment;
  }


  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private Map<String, List<String>> security;

  public TechnologiesInfo security(Map<String, List<String>> security) {
    this.security = security;
    return this;
  }

  /**
   * 
   * @return security
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getSecurity() {
    return security;
  }

  public void setSecurity(Map<String, List<String>> security) {
    this.security = security;
  }


  public static final String SERIALIZED_NAME_BUSINESS_TOOLS = "business_tools";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TOOLS)
  private Map<String, List<String>> businessTools;

  public TechnologiesInfo businessTools(Map<String, List<String>> businessTools) {
    this.businessTools = businessTools;
    return this;
  }

  /**
   * 
   * @return businessTools
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getBusinessTools() {
    return businessTools;
  }

  public void setBusinessTools(Map<String, List<String>> businessTools) {
    this.businessTools = businessTools;
  }


  public static final String SERIALIZED_NAME_SALES = "sales";
  @SerializedName(SERIALIZED_NAME_SALES)
  private Map<String, List<String>> sales;

  public TechnologiesInfo sales(Map<String, List<String>> sales) {
    this.sales = sales;
    return this;
  }

  /**
   * 
   * @return sales
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getSales() {
    return sales;
  }

  public void setSales(Map<String, List<String>> sales) {
    this.sales = sales;
  }


  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Map<String, List<String>> other;

  public TechnologiesInfo other(Map<String, List<String>> other) {
    this.other = other;
    return this;
  }

  /**
   * 
   * @return other
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getOther() {
    return other;
  }

  public void setOther(Map<String, List<String>> other) {
    this.other = other;
  }


  public static final String SERIALIZED_NAME_USER_GENERATED_CONTENT = "user_generated_content";
  @SerializedName(SERIALIZED_NAME_USER_GENERATED_CONTENT)
  private Map<String, List<String>> userGeneratedContent;

  public TechnologiesInfo userGeneratedContent(Map<String, List<String>> userGeneratedContent) {
    this.userGeneratedContent = userGeneratedContent;
    return this;
  }

  /**
   * 
   * @return userGeneratedContent
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getUserGeneratedContent() {
    return userGeneratedContent;
  }

  public void setUserGeneratedContent(Map<String, List<String>> userGeneratedContent) {
    this.userGeneratedContent = userGeneratedContent;
  }


  public static final String SERIALIZED_NAME_BOOKING = "booking";
  @SerializedName(SERIALIZED_NAME_BOOKING)
  private Map<String, List<String>> booking;

  public TechnologiesInfo booking(Map<String, List<String>> booking) {
    this.booking = booking;
    return this;
  }

  /**
   * 
   * @return booking
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getBooking() {
    return booking;
  }

  public void setBooking(Map<String, List<String>> booking) {
    this.booking = booking;
  }


  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private Map<String, List<String>> privacy;

  public TechnologiesInfo privacy(Map<String, List<String>> privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * 
   * @return privacy
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getPrivacy() {
    return privacy;
  }

  public void setPrivacy(Map<String, List<String>> privacy) {
    this.privacy = privacy;
  }


  public static final String SERIALIZED_NAME_SERVERS = "servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private Map<String, List<String>> servers;

  public TechnologiesInfo servers(Map<String, List<String>> servers) {
    this.servers = servers;
    return this;
  }

  /**
   * 
   * @return servers
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getServers() {
    return servers;
  }

  public void setServers(Map<String, List<String>> servers) {
    this.servers = servers;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Map<String, List<String>> location;

  public TechnologiesInfo location(Map<String, List<String>> location) {
    this.location = location;
    return this;
  }

  /**
   * 
   * @return location
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getLocation() {
    return location;
  }

  public void setLocation(Map<String, List<String>> location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Map<String, List<String>> content;

  public TechnologiesInfo content(Map<String, List<String>> content) {
    this.content = content;
    return this;
  }

  /**
   * 
   * @return content
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getContent() {
    return content;
  }

  public void setContent(Map<String, List<String>> content) {
    this.content = content;
  }


  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private Map<String, List<String>> media;

  public TechnologiesInfo media(Map<String, List<String>> media) {
    this.media = media;
    return this;
  }

  /**
   * 
   * @return media
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getMedia() {
    return media;
  }

  public void setMedia(Map<String, List<String>> media) {
    this.media = media;
  }


  public static final String SERIALIZED_NAME_MARKETING = "marketing";
  @SerializedName(SERIALIZED_NAME_MARKETING)
  private Map<String, List<String>> marketing;

  public TechnologiesInfo marketing(Map<String, List<String>> marketing) {
    this.marketing = marketing;
    return this;
  }

  /**
   * 
   * @return marketing
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getMarketing() {
    return marketing;
  }

  public void setMarketing(Map<String, List<String>> marketing) {
    this.marketing = marketing;
  }


  public static final String SERIALIZED_NAME_COMMUNICATION = "communication";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION)
  private Map<String, List<String>> communication;

  public TechnologiesInfo communication(Map<String, List<String>> communication) {
    this.communication = communication;
    return this;
  }

  /**
   * 
   * @return communication
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getCommunication() {
    return communication;
  }

  public void setCommunication(Map<String, List<String>> communication) {
    this.communication = communication;
  }


  public static final String SERIALIZED_NAME_UTILITIES = "utilities";
  @SerializedName(SERIALIZED_NAME_UTILITIES)
  private Map<String, List<String>> utilities;

  public TechnologiesInfo utilities(Map<String, List<String>> utilities) {
    this.utilities = utilities;
    return this;
  }

  /**
   * 
   * @return utilities
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getUtilities() {
    return utilities;
  }

  public void setUtilities(Map<String, List<String>> utilities) {
    this.utilities = utilities;
  }



  public TechnologiesInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public TechnologiesInfo putAdditionalProperty(String key, Object value) {
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


    
    TechnologiesInfo technologiesInfo = (TechnologiesInfo) o;
    return

        Objects.equals(this.addOns, technologiesInfo.addOns) &&
        Objects.equals(this.analytics, technologiesInfo.analytics) &&
        Objects.equals(this.webDevelopment, technologiesInfo.webDevelopment) &&
        Objects.equals(this.security, technologiesInfo.security) &&
        Objects.equals(this.businessTools, technologiesInfo.businessTools) &&
        Objects.equals(this.sales, technologiesInfo.sales) &&
        Objects.equals(this.other, technologiesInfo.other) &&
        Objects.equals(this.userGeneratedContent, technologiesInfo.userGeneratedContent) &&
        Objects.equals(this.booking, technologiesInfo.booking) &&
        Objects.equals(this.privacy, technologiesInfo.privacy) &&
        Objects.equals(this.servers, technologiesInfo.servers) &&
        Objects.equals(this.location, technologiesInfo.location) &&
        Objects.equals(this.content, technologiesInfo.content) &&
        Objects.equals(this.media, technologiesInfo.media) &&
        Objects.equals(this.marketing, technologiesInfo.marketing) &&
        Objects.equals(this.communication, technologiesInfo.communication) &&
        Objects.equals(this.utilities, technologiesInfo.utilities);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(addOns, analytics, webDevelopment, security, businessTools, sales, other, userGeneratedContent, booking, privacy, servers, location, content, media, marketing, communication, utilities);
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
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    utilities: ").append(toIndentedString(utilities)).append("\n");
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
    
    openapiFields.add("booking");
    
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


  public static TechnologiesInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TechnologiesInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}