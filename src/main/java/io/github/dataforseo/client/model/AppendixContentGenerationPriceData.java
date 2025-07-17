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



public class AppendixContentGenerationPriceData  {


  public static final String SERIALIZED_NAME_CHECK_GRAMMAR = "check_grammar";
  @SerializedName(SERIALIZED_NAME_CHECK_GRAMMAR)
  private AppendixContentGenerationPriceDataInfo checkGrammar;

  public AppendixContentGenerationPriceData checkGrammar(AppendixContentGenerationPriceDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
    return this;
  }

  /**
   * 
   * @return checkGrammar
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationPriceDataInfo getCheckGrammar() {
    return checkGrammar;
  }

  public void setCheckGrammar(AppendixContentGenerationPriceDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
  }


  public static final String SERIALIZED_NAME_GENERATE = "generate";
  @SerializedName(SERIALIZED_NAME_GENERATE)
  private AppendixBingKeywordsDataPriceDataInfo generate;

  public AppendixContentGenerationPriceData generate(AppendixBingKeywordsDataPriceDataInfo generate) {
    this.generate = generate;
    return this;
  }

  /**
   * 
   * @return generate
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getGenerate() {
    return generate;
  }

  public void setGenerate(AppendixBingKeywordsDataPriceDataInfo generate) {
    this.generate = generate;
  }


  public static final String SERIALIZED_NAME_GENERATE_META_TAGS = "generate_meta_tags";
  @SerializedName(SERIALIZED_NAME_GENERATE_META_TAGS)
  private AppendixBingKeywordsDataPriceDataInfo generateMetaTags;

  public AppendixContentGenerationPriceData generateMetaTags(AppendixBingKeywordsDataPriceDataInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
    return this;
  }

  /**
   * 
   * @return generateMetaTags
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getGenerateMetaTags() {
    return generateMetaTags;
  }

  public void setGenerateMetaTags(AppendixBingKeywordsDataPriceDataInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
  }


  public static final String SERIALIZED_NAME_GENERATE_SUB_TOPICS = "generate_sub_topics";
  @SerializedName(SERIALIZED_NAME_GENERATE_SUB_TOPICS)
  private AppendixBingKeywordsDataPriceDataInfo generateSubTopics;

  public AppendixContentGenerationPriceData generateSubTopics(AppendixBingKeywordsDataPriceDataInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
    return this;
  }

  /**
   * 
   * @return generateSubTopics
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getGenerateSubTopics() {
    return generateSubTopics;
  }

  public void setGenerateSubTopics(AppendixBingKeywordsDataPriceDataInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
  }


  public static final String SERIALIZED_NAME_GENERATE_TEXT = "generate_text";
  @SerializedName(SERIALIZED_NAME_GENERATE_TEXT)
  private AppendixBingKeywordsDataPriceDataInfo generateText;

  public AppendixContentGenerationPriceData generateText(AppendixBingKeywordsDataPriceDataInfo generateText) {
    this.generateText = generateText;
    return this;
  }

  /**
   * 
   * @return generateText
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getGenerateText() {
    return generateText;
  }

  public void setGenerateText(AppendixBingKeywordsDataPriceDataInfo generateText) {
    this.generateText = generateText;
  }


  public static final String SERIALIZED_NAME_PARAPHRASE = "paraphrase";
  @SerializedName(SERIALIZED_NAME_PARAPHRASE)
  private AppendixBingKeywordsDataPriceDataInfo paraphrase;

  public AppendixContentGenerationPriceData paraphrase(AppendixBingKeywordsDataPriceDataInfo paraphrase) {
    this.paraphrase = paraphrase;
    return this;
  }

  /**
   * 
   * @return paraphrase
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getParaphrase() {
    return paraphrase;
  }

  public void setParaphrase(AppendixBingKeywordsDataPriceDataInfo paraphrase) {
    this.paraphrase = paraphrase;
  }


  public static final String SERIALIZED_NAME_TEXT_SUMMARY = "text_summary";
  @SerializedName(SERIALIZED_NAME_TEXT_SUMMARY)
  private AppendixContentGenerationPriceDataInfo textSummary;

  public AppendixContentGenerationPriceData textSummary(AppendixContentGenerationPriceDataInfo textSummary) {
    this.textSummary = textSummary;
    return this;
  }

  /**
   * 
   * @return textSummary
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationPriceDataInfo getTextSummary() {
    return textSummary;
  }

  public void setTextSummary(AppendixContentGenerationPriceDataInfo textSummary) {
    this.textSummary = textSummary;
  }



  public AppendixContentGenerationPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixContentGenerationPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixContentGenerationPriceData appendixContentGenerationPriceData = (AppendixContentGenerationPriceData) o;
    return

        Objects.equals(this.checkGrammar, appendixContentGenerationPriceData.checkGrammar) &&
        Objects.equals(this.generate, appendixContentGenerationPriceData.generate) &&
        Objects.equals(this.generateMetaTags, appendixContentGenerationPriceData.generateMetaTags) &&
        Objects.equals(this.generateSubTopics, appendixContentGenerationPriceData.generateSubTopics) &&
        Objects.equals(this.generateText, appendixContentGenerationPriceData.generateText) &&
        Objects.equals(this.paraphrase, appendixContentGenerationPriceData.paraphrase) &&
        Objects.equals(this.textSummary, appendixContentGenerationPriceData.textSummary);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(checkGrammar, generate, generateMetaTags, generateSubTopics, generateText, paraphrase, textSummary);
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
    sb.append("class AppendixContentGenerationPriceData {\n");

    sb.append("    checkGrammar: ").append(toIndentedString(checkGrammar)).append("\n");
    sb.append("    generate: ").append(toIndentedString(generate)).append("\n");
    sb.append("    generateMetaTags: ").append(toIndentedString(generateMetaTags)).append("\n");
    sb.append("    generateSubTopics: ").append(toIndentedString(generateSubTopics)).append("\n");
    sb.append("    generateText: ").append(toIndentedString(generateText)).append("\n");
    sb.append("    paraphrase: ").append(toIndentedString(paraphrase)).append("\n");
    sb.append("    textSummary: ").append(toIndentedString(textSummary)).append("\n");
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
    
    openapiFields.add("check_grammar");
    
    openapiFields.add("generate");
    
    openapiFields.add("generate_meta_tags");
    
    openapiFields.add("generate_sub_topics");
    
    openapiFields.add("generate_text");
    
    openapiFields.add("paraphrase");
    
    openapiFields.add("text_summary");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixContentGenerationPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixContentGenerationPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixContentGenerationPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixContentGenerationPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixContentGenerationPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixContentGenerationPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixContentGenerationPriceData value) throws IOException {
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
           public AppendixContentGenerationPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixContentGenerationPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixContentGenerationPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixContentGenerationPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}