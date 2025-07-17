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



public class AppendixContentGenerationLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_GENERATE = "generate";
  @SerializedName(SERIALIZED_NAME_GENERATE)
  private AppendixInfo generate;

  public AppendixContentGenerationLimitsRatesDataInfo generate(AppendixInfo generate) {
    this.generate = generate;
    return this;
  }

  /**
   * 
   * @return generate
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerate() {
    return generate;
  }

  public void setGenerate(AppendixInfo generate) {
    this.generate = generate;
  }


  public static final String SERIALIZED_NAME_GENERATE_META_TAGS = "generate_meta_tags";
  @SerializedName(SERIALIZED_NAME_GENERATE_META_TAGS)
  private AppendixInfo generateMetaTags;

  public AppendixContentGenerationLimitsRatesDataInfo generateMetaTags(AppendixInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
    return this;
  }

  /**
   * 
   * @return generateMetaTags
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerateMetaTags() {
    return generateMetaTags;
  }

  public void setGenerateMetaTags(AppendixInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
  }


  public static final String SERIALIZED_NAME_GENERATE_TEXT = "generate_text";
  @SerializedName(SERIALIZED_NAME_GENERATE_TEXT)
  private AppendixInfo generateText;

  public AppendixContentGenerationLimitsRatesDataInfo generateText(AppendixInfo generateText) {
    this.generateText = generateText;
    return this;
  }

  /**
   * 
   * @return generateText
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerateText() {
    return generateText;
  }

  public void setGenerateText(AppendixInfo generateText) {
    this.generateText = generateText;
  }


  public static final String SERIALIZED_NAME_PARAPHRASE = "paraphrase";
  @SerializedName(SERIALIZED_NAME_PARAPHRASE)
  private AppendixInfo paraphrase;

  public AppendixContentGenerationLimitsRatesDataInfo paraphrase(AppendixInfo paraphrase) {
    this.paraphrase = paraphrase;
    return this;
  }

  /**
   * 
   * @return paraphrase
   */
  @javax.annotation.Nullable
  public AppendixInfo getParaphrase() {
    return paraphrase;
  }

  public void setParaphrase(AppendixInfo paraphrase) {
    this.paraphrase = paraphrase;
  }


  public static final String SERIALIZED_NAME_CHECK_GRAMMAR = "check_grammar";
  @SerializedName(SERIALIZED_NAME_CHECK_GRAMMAR)
  private AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar;

  public AppendixContentGenerationLimitsRatesDataInfo checkGrammar(AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
    return this;
  }

  /**
   * 
   * @return checkGrammar
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationDayLimitsRatesDataInfo getCheckGrammar() {
    return checkGrammar;
  }

  public void setCheckGrammar(AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
  }


  public static final String SERIALIZED_NAME_TEXT_SUMMARY = "text_summary";
  @SerializedName(SERIALIZED_NAME_TEXT_SUMMARY)
  private AppendixContentGenerationDayLimitsRatesDataInfo textSummary;

  public AppendixContentGenerationLimitsRatesDataInfo textSummary(AppendixContentGenerationDayLimitsRatesDataInfo textSummary) {
    this.textSummary = textSummary;
    return this;
  }

  /**
   * 
   * @return textSummary
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationDayLimitsRatesDataInfo getTextSummary() {
    return textSummary;
  }

  public void setTextSummary(AppendixContentGenerationDayLimitsRatesDataInfo textSummary) {
    this.textSummary = textSummary;
  }


  public static final String SERIALIZED_NAME_GENERATE_SUB_TOPICS = "generate_sub_topics";
  @SerializedName(SERIALIZED_NAME_GENERATE_SUB_TOPICS)
  private AppendixInfo generateSubTopics;

  public AppendixContentGenerationLimitsRatesDataInfo generateSubTopics(AppendixInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
    return this;
  }

  /**
   * 
   * @return generateSubTopics
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerateSubTopics() {
    return generateSubTopics;
  }

  public void setGenerateSubTopics(AppendixInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
  }



  public AppendixContentGenerationLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixContentGenerationLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixContentGenerationLimitsRatesDataInfo appendixContentGenerationLimitsRatesDataInfo = (AppendixContentGenerationLimitsRatesDataInfo) o;
    return

        Objects.equals(this.generate, appendixContentGenerationLimitsRatesDataInfo.generate) &&
        Objects.equals(this.generateMetaTags, appendixContentGenerationLimitsRatesDataInfo.generateMetaTags) &&
        Objects.equals(this.generateText, appendixContentGenerationLimitsRatesDataInfo.generateText) &&
        Objects.equals(this.paraphrase, appendixContentGenerationLimitsRatesDataInfo.paraphrase) &&
        Objects.equals(this.checkGrammar, appendixContentGenerationLimitsRatesDataInfo.checkGrammar) &&
        Objects.equals(this.textSummary, appendixContentGenerationLimitsRatesDataInfo.textSummary) &&
        Objects.equals(this.generateSubTopics, appendixContentGenerationLimitsRatesDataInfo.generateSubTopics);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(generate, generateMetaTags, generateText, paraphrase, checkGrammar, textSummary, generateSubTopics);
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
    sb.append("class AppendixContentGenerationLimitsRatesDataInfo {\n");

    sb.append("    generate: ").append(toIndentedString(generate)).append("\n");
    sb.append("    generateMetaTags: ").append(toIndentedString(generateMetaTags)).append("\n");
    sb.append("    generateText: ").append(toIndentedString(generateText)).append("\n");
    sb.append("    paraphrase: ").append(toIndentedString(paraphrase)).append("\n");
    sb.append("    checkGrammar: ").append(toIndentedString(checkGrammar)).append("\n");
    sb.append("    textSummary: ").append(toIndentedString(textSummary)).append("\n");
    sb.append("    generateSubTopics: ").append(toIndentedString(generateSubTopics)).append("\n");
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
    
    openapiFields.add("generate");
    
    openapiFields.add("generate_meta_tags");
    
    openapiFields.add("generate_text");
    
    openapiFields.add("paraphrase");
    
    openapiFields.add("check_grammar");
    
    openapiFields.add("text_summary");
    
    openapiFields.add("generate_sub_topics");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixContentGenerationLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixContentGenerationLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixContentGenerationLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixContentGenerationLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixContentGenerationLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixContentGenerationLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixContentGenerationLimitsRatesDataInfo value) throws IOException {
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
           public AppendixContentGenerationLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixContentGenerationLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixContentGenerationLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixContentGenerationLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}