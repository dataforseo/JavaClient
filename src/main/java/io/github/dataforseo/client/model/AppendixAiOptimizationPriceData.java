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


public class AppendixAiOptimizationPriceData  {


  public static final String SERIALIZED_NAME_LLM_SCRAPER = "llm_scraper";
  @SerializedName(SERIALIZED_NAME_LLM_SCRAPER)
  private AppendixLlmScraperAiOptimizationPriceData llmScraper;

  public AppendixAiOptimizationPriceData llmScraper(AppendixLlmScraperAiOptimizationPriceData llmScraper) {
    this.llmScraper = llmScraper;
    return this;
  }

  /**
   * 
   * @return llmScraper
   */
  @javax.annotation.Nullable
  public AppendixLlmScraperAiOptimizationPriceData getLlmScraper() {
    return llmScraper;
  }

  public void setLlmScraper(AppendixLlmScraperAiOptimizationPriceData llmScraper) {
    this.llmScraper = llmScraper;
  }


  public static final String SERIALIZED_NAME_LLM_MENTIONS = "llm_mentions";
  @SerializedName(SERIALIZED_NAME_LLM_MENTIONS)
  private AppendixLlmMentionsAiOptimizationPriceData llmMentions;

  public AppendixAiOptimizationPriceData llmMentions(AppendixLlmMentionsAiOptimizationPriceData llmMentions) {
    this.llmMentions = llmMentions;
    return this;
  }

  /**
   * 
   * @return llmMentions
   */
  @javax.annotation.Nullable
  public AppendixLlmMentionsAiOptimizationPriceData getLlmMentions() {
    return llmMentions;
  }

  public void setLlmMentions(AppendixLlmMentionsAiOptimizationPriceData llmMentions) {
    this.llmMentions = llmMentions;
  }


  public static final String SERIALIZED_NAME_AI_KEYWORD_DATA = "ai_keyword_data";
  @SerializedName(SERIALIZED_NAME_AI_KEYWORD_DATA)
  private AppendixAiKeywordDataAiOptimizationPriceData aiKeywordData;

  public AppendixAiOptimizationPriceData aiKeywordData(AppendixAiKeywordDataAiOptimizationPriceData aiKeywordData) {
    this.aiKeywordData = aiKeywordData;
    return this;
  }

  /**
   * 
   * @return aiKeywordData
   */
  @javax.annotation.Nullable
  public AppendixAiKeywordDataAiOptimizationPriceData getAiKeywordData() {
    return aiKeywordData;
  }

  public void setAiKeywordData(AppendixAiKeywordDataAiOptimizationPriceData aiKeywordData) {
    this.aiKeywordData = aiKeywordData;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixAiOptimizationPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
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


  public static final String SERIALIZED_NAME_ID_LIST = "id_list";
  @SerializedName(SERIALIZED_NAME_ID_LIST)
  private AppendixTaskKeywordsDataPriceDataInfo idList;

  public AppendixAiOptimizationPriceData idList(AppendixTaskKeywordsDataPriceDataInfo idList) {
    this.idList = idList;
    return this;
  }

  /**
   * 
   * @return idList
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getIdList() {
    return idList;
  }

  public void setIdList(AppendixTaskKeywordsDataPriceDataInfo idList) {
    this.idList = idList;
  }


  public static final String SERIALIZED_NAME_LLM_RESPONSES = "llm_responses";
  @SerializedName(SERIALIZED_NAME_LLM_RESPONSES)
  private AppendixLlmResponsesAiOptimizationPriceData llmResponses;

  public AppendixAiOptimizationPriceData llmResponses(AppendixLlmResponsesAiOptimizationPriceData llmResponses) {
    this.llmResponses = llmResponses;
    return this;
  }

  /**
   * 
   * @return llmResponses
   */
  @javax.annotation.Nullable
  public AppendixLlmResponsesAiOptimizationPriceData getLlmResponses() {
    return llmResponses;
  }

  public void setLlmResponses(AppendixLlmResponsesAiOptimizationPriceData llmResponses) {
    this.llmResponses = llmResponses;
  }



  public AppendixAiOptimizationPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixAiOptimizationPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixAiOptimizationPriceData appendixAiOptimizationPriceData = (AppendixAiOptimizationPriceData) o;
    return

        Objects.equals(this.llmScraper, appendixAiOptimizationPriceData.llmScraper) &&
        Objects.equals(this.llmMentions, appendixAiOptimizationPriceData.llmMentions) &&
        Objects.equals(this.aiKeywordData, appendixAiOptimizationPriceData.aiKeywordData) &&
        Objects.equals(this.errors, appendixAiOptimizationPriceData.errors) &&
        Objects.equals(this.idList, appendixAiOptimizationPriceData.idList) &&
        Objects.equals(this.llmResponses, appendixAiOptimizationPriceData.llmResponses);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(llmScraper, llmMentions, aiKeywordData, errors, idList, llmResponses);
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
    sb.append("class AppendixAiOptimizationPriceData {\n");

    sb.append("    llmScraper: ").append(toIndentedString(llmScraper)).append("\n");
    sb.append("    llmMentions: ").append(toIndentedString(llmMentions)).append("\n");
    sb.append("    aiKeywordData: ").append(toIndentedString(aiKeywordData)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    llmResponses: ").append(toIndentedString(llmResponses)).append("\n");
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
    
    openapiFields.add("llm_scraper");
    
    openapiFields.add("llm_mentions");
    
    openapiFields.add("ai_keyword_data");
    
    openapiFields.add("errors");
    
    openapiFields.add("id_list");
    
    openapiFields.add("llm_responses");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixAiOptimizationPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixAiOptimizationPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixAiOptimizationPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixAiOptimizationPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixAiOptimizationPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixAiOptimizationPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixAiOptimizationPriceData value) throws IOException {
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
           public AppendixAiOptimizationPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixAiOptimizationPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixAiOptimizationPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixAiOptimizationPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}