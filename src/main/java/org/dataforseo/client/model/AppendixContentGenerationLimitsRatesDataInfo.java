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


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.dataforseo.client.model.AppendixContentGenerationDayLimitsRatesDataInfo;
import org.dataforseo.client.model.AppendixInfo;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * AppendixContentGenerationLimitsRatesDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class AppendixContentGenerationLimitsRatesDataInfo {
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

  public AppendixContentGenerationLimitsRatesDataInfo() {
  }

  public AppendixContentGenerationLimitsRatesDataInfo generate(AppendixInfo generate) {
    this.generate = generate;
    return this;
  }

   /**
   * Get generate
   * @return generate
  **/
  @javax.annotation.Nullable
  public AppendixInfo getGenerate() {
    return generate;
  }

  public void setGenerate(AppendixInfo generate) {
    this.generate = generate;
  }


  public AppendixContentGenerationLimitsRatesDataInfo generateMetaTags(AppendixInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
    return this;
  }

   /**
   * Get generateMetaTags
   * @return generateMetaTags
  **/
  @javax.annotation.Nullable
  public AppendixInfo getGenerateMetaTags() {
    return generateMetaTags;
  }

  public void setGenerateMetaTags(AppendixInfo generateMetaTags) {
    this.generateMetaTags = generateMetaTags;
  }


  public AppendixContentGenerationLimitsRatesDataInfo generateText(AppendixInfo generateText) {
    this.generateText = generateText;
    return this;
  }

   /**
   * Get generateText
   * @return generateText
  **/
  @javax.annotation.Nullable
  public AppendixInfo getGenerateText() {
    return generateText;
  }

  public void setGenerateText(AppendixInfo generateText) {
    this.generateText = generateText;
  }


  public AppendixContentGenerationLimitsRatesDataInfo paraphrase(AppendixInfo paraphrase) {
    this.paraphrase = paraphrase;
    return this;
  }

   /**
   * Get paraphrase
   * @return paraphrase
  **/
  @javax.annotation.Nullable
  public AppendixInfo getParaphrase() {
    return paraphrase;
  }

  public void setParaphrase(AppendixInfo paraphrase) {
    this.paraphrase = paraphrase;
  }


  public AppendixContentGenerationLimitsRatesDataInfo checkGrammar(AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
    return this;
  }

   /**
   * Get checkGrammar
   * @return checkGrammar
  **/
  @javax.annotation.Nullable
  public AppendixContentGenerationDayLimitsRatesDataInfo getCheckGrammar() {
    return checkGrammar;
  }

  public void setCheckGrammar(AppendixContentGenerationDayLimitsRatesDataInfo checkGrammar) {
    this.checkGrammar = checkGrammar;
  }


  public AppendixContentGenerationLimitsRatesDataInfo textSummary(AppendixContentGenerationDayLimitsRatesDataInfo textSummary) {
    this.textSummary = textSummary;
    return this;
  }

   /**
   * Get textSummary
   * @return textSummary
  **/
  @javax.annotation.Nullable
  public AppendixContentGenerationDayLimitsRatesDataInfo getTextSummary() {
    return textSummary;
  }

  public void setTextSummary(AppendixContentGenerationDayLimitsRatesDataInfo textSummary) {
    this.textSummary = textSummary;
  }


  public AppendixContentGenerationLimitsRatesDataInfo generateSubTopics(AppendixInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
    return this;
  }

   /**
   * Get generateSubTopics
   * @return generateSubTopics
  **/
  @javax.annotation.Nullable
  public AppendixInfo getGenerateSubTopics() {
    return generateSubTopics;
  }

  public void setGenerateSubTopics(AppendixInfo generateSubTopics) {
    this.generateSubTopics = generateSubTopics;
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
    return Objects.equals(this.generate, appendixContentGenerationLimitsRatesDataInfo.generate) &&
        Objects.equals(this.generateMetaTags, appendixContentGenerationLimitsRatesDataInfo.generateMetaTags) &&
        Objects.equals(this.generateText, appendixContentGenerationLimitsRatesDataInfo.generateText) &&
        Objects.equals(this.paraphrase, appendixContentGenerationLimitsRatesDataInfo.paraphrase) &&
        Objects.equals(this.checkGrammar, appendixContentGenerationLimitsRatesDataInfo.checkGrammar) &&
        Objects.equals(this.textSummary, appendixContentGenerationLimitsRatesDataInfo.textSummary) &&
        Objects.equals(this.generateSubTopics, appendixContentGenerationLimitsRatesDataInfo.generateSubTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generate, generateMetaTags, generateText, paraphrase, checkGrammar, textSummary, generateSubTopics);
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
      if (jsonElement == null) {
        if (!AppendixContentGenerationLimitsRatesDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixContentGenerationLimitsRatesDataInfo is not found in the empty JSON string", AppendixContentGenerationLimitsRatesDataInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixContentGenerationLimitsRatesDataInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixContentGenerationLimitsRatesDataInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixContentGenerationLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixContentGenerationLimitsRatesDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixContentGenerationLimitsRatesDataInfo
  * @throws IOException if the JSON string is invalid with respect to AppendixContentGenerationLimitsRatesDataInfo
  */
  public static AppendixContentGenerationLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixContentGenerationLimitsRatesDataInfo.class);
  }

 /**
  * Convert an instance of AppendixContentGenerationLimitsRatesDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

