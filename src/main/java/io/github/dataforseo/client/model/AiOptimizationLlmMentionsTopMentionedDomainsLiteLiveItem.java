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


public class AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem  {


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * <em>domain name</em><br>domain of aggregated metrics
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Integer location;

  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem location(Integer location) {
    this.location = location;
    return this;
  }

  /**
   * <em>location identifier</em><br>location of aggregated metrics
   * @return location
   */
  @javax.annotation.Nullable
  public Integer getLocation() {
    return location;
  }

  public void setLocation(Integer location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem language(String language) {
    this.language = language;
    return this;
  }

  /**
   * <em>language identifier</em><br>language of aggregated metrics
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * <em>LLM platform identifiers</em><br>LLM platform of aggregated metrics
   * @return platform
   */
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private AggregatedMetricsInfoTotalInfo metrics;

  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem metrics(AggregatedMetricsInfoTotalInfo metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * <em>LLM metrics</em><br>metrics aggregated by specific parameters and respective identifiers
   * @return metrics
   */
  @javax.annotation.Nullable
  public AggregatedMetricsInfoTotalInfo getMetrics() {
    return metrics;
  }

  public void setMetrics(AggregatedMetricsInfoTotalInfo metrics) {
    this.metrics = metrics;
  }



  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem aiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem = (AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem) o;
    return

        Objects.equals(this.domain, aiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.domain) &&
        Objects.equals(this.location, aiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.location) &&
        Objects.equals(this.language, aiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.language) &&
        Objects.equals(this.platform, aiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.platform) &&
        Objects.equals(this.metrics, aiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.metrics);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(domain, location, language, platform, metrics);
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
    sb.append("class AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem {\n");

    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    
    openapiFields.add("domain");
    
    openapiFields.add("location");
    
    openapiFields.add("language");
    
    openapiFields.add("platform");
    
    openapiFields.add("metrics");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem value) throws IOException {
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
           public AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}