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



public class ContentGenerationGenerateTextLiveResultInfo  {


  public static final String SERIALIZED_NAME_INPUT_TOKENS = "input_tokens";
  @SerializedName(SERIALIZED_NAME_INPUT_TOKENS)
  private Integer inputTokens;

  public ContentGenerationGenerateTextLiveResultInfo inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * number of input tokens
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

  public ContentGenerationGenerateTextLiveResultInfo outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * number of output tokens
   * @return outputTokens
   */
  @javax.annotation.Nullable
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }


  public static final String SERIALIZED_NAME_NEW_TOKENS = "new_tokens";
  @SerializedName(SERIALIZED_NAME_NEW_TOKENS)
  private Integer newTokens;

  public ContentGenerationGenerateTextLiveResultInfo newTokens(Integer newTokens) {
    this.newTokens = newTokens;
    return this;
  }

  /**
   * number of new tokens
   * @return newTokens
   */
  @javax.annotation.Nullable
  public Integer getNewTokens() {
    return newTokens;
  }

  public void setNewTokens(Integer newTokens) {
    this.newTokens = newTokens;
  }


  public static final String SERIALIZED_NAME_GENERATED_TEXT = "generated_text";
  @SerializedName(SERIALIZED_NAME_GENERATED_TEXT)
  private String generatedText;

  public ContentGenerationGenerateTextLiveResultInfo generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

  /**
   * resulting text
   * @return generatedText
   */
  @javax.annotation.Nullable
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }


  public static final String SERIALIZED_NAME_SUPPLEMENT_TOKEN = "supplement_token";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_TOKEN)
  private String supplementToken;

  public ContentGenerationGenerateTextLiveResultInfo supplementToken(String supplementToken) {
    this.supplementToken = supplementToken;
    return this;
  }

  /**
   * token for generating subsequent results
* you can use this parameter to continue the generation from the end of the current result;
* supplement_token values are unique for each subsequent task
   * @return supplementToken
   */
  @javax.annotation.Nullable
  public String getSupplementToken() {
    return supplementToken;
  }

  public void setSupplementToken(String supplementToken) {
    this.supplementToken = supplementToken;
  }



  public ContentGenerationGenerateTextLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentGenerationGenerateTextLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentGenerationGenerateTextLiveResultInfo contentGenerationGenerateTextLiveResultInfo = (ContentGenerationGenerateTextLiveResultInfo) o;
    return

        Objects.equals(this.inputTokens, contentGenerationGenerateTextLiveResultInfo.inputTokens) &&
        Objects.equals(this.outputTokens, contentGenerationGenerateTextLiveResultInfo.outputTokens) &&
        Objects.equals(this.newTokens, contentGenerationGenerateTextLiveResultInfo.newTokens) &&
        Objects.equals(this.generatedText, contentGenerationGenerateTextLiveResultInfo.generatedText) &&
        Objects.equals(this.supplementToken, contentGenerationGenerateTextLiveResultInfo.supplementToken);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(inputTokens, outputTokens, newTokens, generatedText, supplementToken);
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
    sb.append("class ContentGenerationGenerateTextLiveResultInfo {\n");

    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    newTokens: ").append(toIndentedString(newTokens)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    supplementToken: ").append(toIndentedString(supplementToken)).append("\n");
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
    
    openapiFields.add("input_tokens");
    
    openapiFields.add("output_tokens");
    
    openapiFields.add("new_tokens");
    
    openapiFields.add("generated_text");
    
    openapiFields.add("supplement_token");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentGenerationGenerateTextLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationGenerateTextLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationGenerateTextLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationGenerateTextLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationGenerateTextLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationGenerateTextLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, ContentGenerationGenerateTextLiveResultInfo value) throws IOException {
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
           public ContentGenerationGenerateTextLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentGenerationGenerateTextLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentGenerationGenerateTextLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationGenerateTextLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}