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
import io.github.dataforseo.client.model.AppendixContentGenerationDayLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixInfo;
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

/**
 * AppendixContentGenerationDayStatisticsRatesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-20T19:00:02.019506800+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixContentGenerationDayStatisticsRatesData {
  public static final String SERIALIZED_NAME_GENERATE = "generate";
  @SerializedName(SERIALIZED_NAME_GENERATE)
  private AppendixInfo generate;

  public static final String SERIALIZED_NAME_GENERATE_META_TAGS = "generate_meta_tags";
  @SerializedName(SERIALIZED_NAME_GENERATE_META_TAGS)
  private AppendixInfo generateMetaTags;

  public static final String SERIALIZED_NAME_GENERATE_TEXT = "generate_text";
  @SerializedName(SERIALIZED_NAME_GENERATE_TEXT)
  private AppendixInfo generateText;

  public static final String SERIALIZED_NAME_PARAPHRASE = "paraphrase";
  @SerializedName(SERIALIZED_NAME_PARAPHRASE)
  private AppendixInfo paraphrase;

  public static final String SERIALIZED_NAME_CHECK_GRAMMAR = "check_grammar";
  @SerializedName(SERIALIZED_NAME_CHECK_GRAMMAR)
  private AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar;

  public static final String SERIALIZED_NAME_TEXT_SUMMARY = "text_summary";
  @SerializedName(SERIALIZED_NAME_TEXT_SUMMARY)
  private AppendixContentGenerationDayLimitsRatesDataInfo textSummary;

  public static final String SERIALIZED_NAME_GENERATE_SUB_TOPICS = "generate_sub_topics";
  @SerializedName(SERIALIZED_NAME_GENERATE_SUB_TOPICS)
  private AppendixInfo generateSubTopics;

  public static final String SERIALIZED_NAME_GRAMMAR_RULES = "grammar_rules";
  @SerializedName(SERIALIZED_NAME_GRAMMAR_RULES)
  private Double grammarRules;

  public AppendixContentGenerationDayStatisticsRatesData() {
  }

  public AppendixContentGenerationDayStatisticsRatesData generate(AppendixInfo generate) {
    this.generate = generate;
    return this;
  }

  /**
   * Get generate
   * @return generate
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerate() {
    return generate;
  }

  public void setGenerate(AppendixInfo generate) {
    this.generate = generate;
  }


  public AppendixContentGenerationDayStatisticsRatesData generateMetaTags(AppendixInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
    return this;
  }

  /**
   * Get generateMetaTags
   * @return generateMetaTags
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerateMetaTags() {
    return generateMetaTags;
  }

  public void setGenerateMetaTags(AppendixInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
  }


  public AppendixContentGenerationDayStatisticsRatesData generateText(AppendixInfo generateText) {
    this.generateText = generateText;
    return this;
  }

  /**
   * Get generateText
   * @return generateText
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerateText() {
    return generateText;
  }

  public void setGenerateText(AppendixInfo generateText) {
    this.generateText = generateText;
  }


  public AppendixContentGenerationDayStatisticsRatesData paraphrase(AppendixInfo paraphrase) {
    this.paraphrase = paraphrase;
    return this;
  }

  /**
   * Get paraphrase
   * @return paraphrase
   */
  @javax.annotation.Nullable
  public AppendixInfo getParaphrase() {
    return paraphrase;
  }

  public void setParaphrase(AppendixInfo paraphrase) {
    this.paraphrase = paraphrase;
  }


  public AppendixContentGenerationDayStatisticsRatesData checkGrammar(AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
    return this;
  }

  /**
   * Get checkGrammar
   * @return checkGrammar
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationDayLimitsRatesDataInfo getCheckGrammar() {
    return checkGrammar;
  }

  public void setCheckGrammar(AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
  }


  public AppendixContentGenerationDayStatisticsRatesData textSummary(AppendixContentGenerationDayLimitsRatesDataInfo textSummary) {
    this.textSummary = textSummary;
    return this;
  }

  /**
   * Get textSummary
   * @return textSummary
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationDayLimitsRatesDataInfo getTextSummary() {
    return textSummary;
  }

  public void setTextSummary(AppendixContentGenerationDayLimitsRatesDataInfo textSummary) {
    this.textSummary = textSummary;
  }


  public AppendixContentGenerationDayStatisticsRatesData generateSubTopics(AppendixInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
    return this;
  }

  /**
   * Get generateSubTopics
   * @return generateSubTopics
   */
  @javax.annotation.Nullable
  public AppendixInfo getGenerateSubTopics() {
    return generateSubTopics;
  }

  public void setGenerateSubTopics(AppendixInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
  }


  public AppendixContentGenerationDayStatisticsRatesData grammarRules(Double grammarRules) {
    this.grammarRules = grammarRules;
    return this;
  }

  /**
   * Get grammarRules
   * @return grammarRules
   */
  @javax.annotation.Nullable
  public Double getGrammarRules() {
    return grammarRules;
  }

  public void setGrammarRules(Double grammarRules) {
    this.grammarRules = grammarRules;
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
   * @return the AppendixContentGenerationDayStatisticsRatesData instance itself
   */
  public AppendixContentGenerationDayStatisticsRatesData putAdditionalProperty(String key, Object value) {
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
    AppendixContentGenerationDayStatisticsRatesData appendixContentGenerationDayStatisticsRatesData = (AppendixContentGenerationDayStatisticsRatesData) o;
    return Objects.equals(this.generate, appendixContentGenerationDayStatisticsRatesData.generate) &&
        Objects.equals(this.generateMetaTags, appendixContentGenerationDayStatisticsRatesData.generateMetaTags) &&
        Objects.equals(this.generateText, appendixContentGenerationDayStatisticsRatesData.generateText) &&
        Objects.equals(this.paraphrase, appendixContentGenerationDayStatisticsRatesData.paraphrase) &&
        Objects.equals(this.checkGrammar, appendixContentGenerationDayStatisticsRatesData.checkGrammar) &&
        Objects.equals(this.textSummary, appendixContentGenerationDayStatisticsRatesData.textSummary) &&
        Objects.equals(this.generateSubTopics, appendixContentGenerationDayStatisticsRatesData.generateSubTopics) &&
        Objects.equals(this.grammarRules, appendixContentGenerationDayStatisticsRatesData.grammarRules)&&
        Objects.equals(this.additionalProperties, appendixContentGenerationDayStatisticsRatesData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(generate, generateMetaTags, generateText, paraphrase, checkGrammar, textSummary, generateSubTopics, grammarRules, additionalProperties);
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
    sb.append("class AppendixContentGenerationDayStatisticsRatesData {\n");
    sb.append("    generate: ").append(toIndentedString(generate)).append("\n");
    sb.append("    generateMetaTags: ").append(toIndentedString(generateMetaTags)).append("\n");
    sb.append("    generateText: ").append(toIndentedString(generateText)).append("\n");
    sb.append("    paraphrase: ").append(toIndentedString(paraphrase)).append("\n");
    sb.append("    checkGrammar: ").append(toIndentedString(checkGrammar)).append("\n");
    sb.append("    textSummary: ").append(toIndentedString(textSummary)).append("\n");
    sb.append("    generateSubTopics: ").append(toIndentedString(generateSubTopics)).append("\n");
    sb.append("    grammarRules: ").append(toIndentedString(grammarRules)).append("\n");
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
    openapiFields.add("generate");
    openapiFields.add("generate_meta_tags");
    openapiFields.add("generate_text");
    openapiFields.add("paraphrase");
    openapiFields.add("check_grammar");
    openapiFields.add("text_summary");
    openapiFields.add("generate_sub_topics");
    openapiFields.add("grammar_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixContentGenerationDayStatisticsRatesData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixContentGenerationDayStatisticsRatesData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixContentGenerationDayStatisticsRatesData is not found in the empty JSON string", AppendixContentGenerationDayStatisticsRatesData.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `generate`
      if (jsonObj.get("generate") != null && !jsonObj.get("generate").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("generate"));
      }
      // validate the optional field `generate_meta_tags`
      if (jsonObj.get("generate_meta_tags") != null && !jsonObj.get("generate_meta_tags").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("generate_meta_tags"));
      }
      // validate the optional field `generate_text`
      if (jsonObj.get("generate_text") != null && !jsonObj.get("generate_text").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("generate_text"));
      }
      // validate the optional field `paraphrase`
      if (jsonObj.get("paraphrase") != null && !jsonObj.get("paraphrase").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("paraphrase"));
      }
      // validate the optional field `check_grammar`
      if (jsonObj.get("check_grammar") != null && !jsonObj.get("check_grammar").isJsonNull()) {
        AppendixContentGenerationDayLimitsRatesDataInfo.validateJsonElement(jsonObj.get("check_grammar"));
      }
      // validate the optional field `text_summary`
      if (jsonObj.get("text_summary") != null && !jsonObj.get("text_summary").isJsonNull()) {
        AppendixContentGenerationDayLimitsRatesDataInfo.validateJsonElement(jsonObj.get("text_summary"));
      }
      // validate the optional field `generate_sub_topics`
      if (jsonObj.get("generate_sub_topics") != null && !jsonObj.get("generate_sub_topics").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("generate_sub_topics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixContentGenerationDayStatisticsRatesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixContentGenerationDayStatisticsRatesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixContentGenerationDayStatisticsRatesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixContentGenerationDayStatisticsRatesData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixContentGenerationDayStatisticsRatesData>() {
           @Override
           public void write(JsonWriter out, AppendixContentGenerationDayStatisticsRatesData value) throws IOException {
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
           public AppendixContentGenerationDayStatisticsRatesData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixContentGenerationDayStatisticsRatesData instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppendixContentGenerationDayStatisticsRatesData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixContentGenerationDayStatisticsRatesData
   * @throws IOException if the JSON string is invalid with respect to AppendixContentGenerationDayStatisticsRatesData
   */
  public static AppendixContentGenerationDayStatisticsRatesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixContentGenerationDayStatisticsRatesData.class);
  }

  /**
   * Convert an instance of AppendixContentGenerationDayStatisticsRatesData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

