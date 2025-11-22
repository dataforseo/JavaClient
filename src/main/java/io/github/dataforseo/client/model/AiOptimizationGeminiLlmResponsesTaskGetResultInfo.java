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



public class AiOptimizationGeminiLlmResponsesTaskGetResultInfo  {


  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * name of the AI model used
   * @return modelName
   */
  @javax.annotation.Nullable
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public static final String SERIALIZED_NAME_INPUT_TOKENS = "input_tokens";
  @SerializedName(SERIALIZED_NAME_INPUT_TOKENS)
  private Integer inputTokens;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * number of tokens in the input
* total count of tokens processed
   * @return inputTokens
   */
  @javax.annotation.Nullable
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }


  public static final String SERIALIZED_NAME_OUTPUT_TOKENS = "output_tokens";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TOKENS)
  private Integer outputTokens;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * number of tokens in the output
* total count of tokens generated in the AI response
   * @return outputTokens
   */
  @javax.annotation.Nullable
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }


  public static final String SERIALIZED_NAME_WEB_SEARCH = "web_search";
  @SerializedName(SERIALIZED_NAME_WEB_SEARCH)
  private Boolean webSearch;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo webSearch(Boolean webSearch) {
    this.webSearch = webSearch;
    return this;
  }

  /**
   * indicates if web search was used
   * @return webSearch
   */
  @javax.annotation.Nullable
  public Boolean getWebSearch() {
    return webSearch;
  }

  public void setWebSearch(Boolean webSearch) {
    this.webSearch = webSearch;
  }


  public static final String SERIALIZED_NAME_MONEY_SPENT = "money_spent";
  @SerializedName(SERIALIZED_NAME_MONEY_SPENT)
  private Double moneySpent;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo moneySpent(Double moneySpent) {
    this.moneySpent = moneySpent;
    return this;
  }

  /**
   * cost of AI tokens, USD
* the price charged by the third-party AI model provider for according to its Pricing
   * @return moneySpent
   */
  @javax.annotation.Nullable
  public Double getMoneySpent() {
    return moneySpent;
  }

  public void setMoneySpent(Double moneySpent) {
    this.moneySpent = moneySpent;
  }


  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when the result was received
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AiOptimizationItem> items;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo items(List<AiOptimizationItem> items) {
    this.items = items;
    return this;
  }

  /**
   * array of response items
* contains structured AI response data
   * @return items
   */
  @javax.annotation.Nullable
  public List<AiOptimizationItem> getItems() {
    return items;
  }

  public void setItems(List<AiOptimizationItem> items) {
    this.items = items;
  }



  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationGeminiLlmResponsesTaskGetResultInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationGeminiLlmResponsesTaskGetResultInfo aiOptimizationGeminiLlmResponsesTaskGetResultInfo = (AiOptimizationGeminiLlmResponsesTaskGetResultInfo) o;
    return

        Objects.equals(this.modelName, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.modelName) &&
        Objects.equals(this.inputTokens, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.inputTokens) &&
        Objects.equals(this.outputTokens, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.outputTokens) &&
        Objects.equals(this.webSearch, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.webSearch) &&
        Objects.equals(this.moneySpent, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.moneySpent) &&
        Objects.equals(this.datetime, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.datetime) &&
        Objects.equals(this.items, aiOptimizationGeminiLlmResponsesTaskGetResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(modelName, inputTokens, outputTokens, webSearch, moneySpent, datetime, items);
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
    sb.append("class AiOptimizationGeminiLlmResponsesTaskGetResultInfo {\n");

    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    webSearch: ").append(toIndentedString(webSearch)).append("\n");
    sb.append("    moneySpent: ").append(toIndentedString(moneySpent)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    
    openapiFields.add("model_name");
    
    openapiFields.add("input_tokens");
    
    openapiFields.add("output_tokens");
    
    openapiFields.add("web_search");
    
    openapiFields.add("money_spent");
    
    openapiFields.add("datetime");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationGeminiLlmResponsesTaskGetResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationGeminiLlmResponsesTaskGetResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationGeminiLlmResponsesTaskGetResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationGeminiLlmResponsesTaskGetResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationGeminiLlmResponsesTaskGetResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationGeminiLlmResponsesTaskGetResultInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationGeminiLlmResponsesTaskGetResultInfo value) throws IOException {
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
           public AiOptimizationGeminiLlmResponsesTaskGetResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationGeminiLlmResponsesTaskGetResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationGeminiLlmResponsesTaskGetResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationGeminiLlmResponsesTaskGetResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}