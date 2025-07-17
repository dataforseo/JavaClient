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



public class ContentGenerationParaphraseLiveResultInfo  {


  public static final String SERIALIZED_NAME_INPUT_TOKENS = "input_tokens";
  @SerializedName(SERIALIZED_NAME_INPUT_TOKENS)
  private Integer inputTokens;

  public ContentGenerationParaphraseLiveResultInfo inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * number of input tokens in the POST request
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

  public ContentGenerationParaphraseLiveResultInfo outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * number of output tokens in the response
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

  public ContentGenerationParaphraseLiveResultInfo newTokens(Integer newTokens) {
    this.newTokens = newTokens;
    return this;
  }

  /**
   * number of new tokens in the response
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

  public ContentGenerationParaphraseLiveResultInfo generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

  /**
   * paraphrased version of the given text
   * @return generatedText
   */
  @javax.annotation.Nullable
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }



  public ContentGenerationParaphraseLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentGenerationParaphraseLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentGenerationParaphraseLiveResultInfo contentGenerationParaphraseLiveResultInfo = (ContentGenerationParaphraseLiveResultInfo) o;
    return

        Objects.equals(this.inputTokens, contentGenerationParaphraseLiveResultInfo.inputTokens) &&
        Objects.equals(this.outputTokens, contentGenerationParaphraseLiveResultInfo.outputTokens) &&
        Objects.equals(this.newTokens, contentGenerationParaphraseLiveResultInfo.newTokens) &&
        Objects.equals(this.generatedText, contentGenerationParaphraseLiveResultInfo.generatedText);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(inputTokens, outputTokens, newTokens, generatedText);
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
    sb.append("class ContentGenerationParaphraseLiveResultInfo {\n");

    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    newTokens: ").append(toIndentedString(newTokens)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
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
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentGenerationParaphraseLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationParaphraseLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationParaphraseLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationParaphraseLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationParaphraseLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationParaphraseLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, ContentGenerationParaphraseLiveResultInfo value) throws IOException {
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
           public ContentGenerationParaphraseLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentGenerationParaphraseLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentGenerationParaphraseLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationParaphraseLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}