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



public class AppendixDomainAnalyticsPriceData  {


  public static final String SERIALIZED_NAME_WHOIS = "whois";
  @SerializedName(SERIALIZED_NAME_WHOIS)
  private AppendixWhoisDomainAnalyticsPriceData whois;

  public AppendixDomainAnalyticsPriceData whois(AppendixWhoisDomainAnalyticsPriceData whois) {
    this.whois = whois;
    return this;
  }

  /**
   * 
   * @return whois
   */
  @javax.annotation.Nullable
  public AppendixWhoisDomainAnalyticsPriceData getWhois() {
    return whois;
  }

  public void setWhois(AppendixWhoisDomainAnalyticsPriceData whois) {
    this.whois = whois;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private AppendixTechnologiesDomainAnalyticsPriceData technologies;

  public AppendixDomainAnalyticsPriceData technologies(AppendixTechnologiesDomainAnalyticsPriceData technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * 
   * @return technologies
   */
  @javax.annotation.Nullable
  public AppendixTechnologiesDomainAnalyticsPriceData getTechnologies() {
    return technologies;
  }

  public void setTechnologies(AppendixTechnologiesDomainAnalyticsPriceData technologies) {
    this.technologies = technologies;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixDomainAnalyticsPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixDomainAnalyticsPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
  }



  public AppendixDomainAnalyticsPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixDomainAnalyticsPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixDomainAnalyticsPriceData appendixDomainAnalyticsPriceData = (AppendixDomainAnalyticsPriceData) o;
    return

        Objects.equals(this.whois, appendixDomainAnalyticsPriceData.whois) &&
        Objects.equals(this.technologies, appendixDomainAnalyticsPriceData.technologies) &&
        Objects.equals(this.errors, appendixDomainAnalyticsPriceData.errors) &&
        Objects.equals(this.tasksReady, appendixDomainAnalyticsPriceData.tasksReady);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(whois, technologies, errors, tasksReady);
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
    sb.append("class AppendixDomainAnalyticsPriceData {\n");

    sb.append("    whois: ").append(toIndentedString(whois)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
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
    
    openapiFields.add("whois");
    
    openapiFields.add("technologies");
    
    openapiFields.add("errors");
    
    openapiFields.add("tasks_ready");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixDomainAnalyticsPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDomainAnalyticsPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDomainAnalyticsPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDomainAnalyticsPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDomainAnalyticsPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDomainAnalyticsPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixDomainAnalyticsPriceData value) throws IOException {
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
           public AppendixDomainAnalyticsPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixDomainAnalyticsPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixDomainAnalyticsPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDomainAnalyticsPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}