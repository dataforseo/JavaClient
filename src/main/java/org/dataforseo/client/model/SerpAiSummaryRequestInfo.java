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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * SerpAiSummaryRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class SerpAiSummaryRequestInfo {
  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private String prompt;

  public static final String SERIALIZED_NAME_SUPPORT_EXTRA = "support_extra";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EXTRA)
  private Boolean supportExtra;

  public static final String SERIALIZED_NAME_FETCH_CONTENT = "fetch_content";
  @SerializedName(SERIALIZED_NAME_FETCH_CONTENT)
  private Boolean fetchContent;

  public static final String SERIALIZED_NAME_INCLUDE_LINKS = "include_links";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LINKS)
  private Boolean includeLinks;

  public SerpAiSummaryRequestInfo() {
  }

  public SerpAiSummaryRequestInfo taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * task identifier required field unique identifier of the associated task in the UUID format you will be able to use it within 30 days to request the results of the task at any time
   * @return taskId
  **/
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public SerpAiSummaryRequestInfo prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * AI prompt optional field additional task for AI summarizer, also referred to as any form of text, question or information that communicates to AI what response you’re looking for; note: your prompt has to be relevant to the keyword specified in the POST request to SERP API
   * @return prompt
  **/
  @javax.annotation.Nullable
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  public SerpAiSummaryRequestInfo supportExtra(Boolean supportExtra) {
    this.supportExtra = supportExtra;
    return this;
  }

   /**
   * support extra SERP features optional field if set to true, the AI model will consider the following extra SERP features, in addition to organic results: answer_box, knowledge_graph, featured_snippet; default value: true
   * @return supportExtra
  **/
  @javax.annotation.Nullable
  public Boolean getSupportExtra() {
    return supportExtra;
  }

  public void setSupportExtra(Boolean supportExtra) {
    this.supportExtra = supportExtra;
  }


  public SerpAiSummaryRequestInfo fetchContent(Boolean fetchContent) {
    this.fetchContent = fetchContent;
    return this;
  }

   /**
   * fetch content from pages in SERPs optional field if set to true, the API will fetch the content from pages featured in SERP results, and the AI model will consider this content when generating the summary in the result; default value: false
   * @return fetchContent
  **/
  @javax.annotation.Nullable
  public Boolean getFetchContent() {
    return fetchContent;
  }

  public void setFetchContent(Boolean fetchContent) {
    this.fetchContent = fetchContent;
  }


  public SerpAiSummaryRequestInfo includeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * include source links in the summary optional field if set to true, the summary field in the API response will contain links to sources of the generated summary; default value: false
   * @return includeLinks
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeLinks() {
    return includeLinks;
  }

  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerpAiSummaryRequestInfo serpAiSummaryRequestInfo = (SerpAiSummaryRequestInfo) o;
    return Objects.equals(this.taskId, serpAiSummaryRequestInfo.taskId) &&
        Objects.equals(this.prompt, serpAiSummaryRequestInfo.prompt) &&
        Objects.equals(this.supportExtra, serpAiSummaryRequestInfo.supportExtra) &&
        Objects.equals(this.fetchContent, serpAiSummaryRequestInfo.fetchContent) &&
        Objects.equals(this.includeLinks, serpAiSummaryRequestInfo.includeLinks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, prompt, supportExtra, fetchContent, includeLinks);
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
    sb.append("class SerpAiSummaryRequestInfo {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    supportExtra: ").append(toIndentedString(supportExtra)).append("\n");
    sb.append("    fetchContent: ").append(toIndentedString(fetchContent)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
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
    openapiFields.add("task_id");
    openapiFields.add("prompt");
    openapiFields.add("support_extra");
    openapiFields.add("fetch_content");
    openapiFields.add("include_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SerpAiSummaryRequestInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SerpAiSummaryRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SerpAiSummaryRequestInfo is not found in the empty JSON string", SerpAiSummaryRequestInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SerpAiSummaryRequestInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SerpAiSummaryRequestInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("task_id") != null && !jsonObj.get("task_id").isJsonNull()) && !jsonObj.get("task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_id").toString()));
      }
      if ((jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) && !jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpAiSummaryRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpAiSummaryRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpAiSummaryRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpAiSummaryRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpAiSummaryRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpAiSummaryRequestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SerpAiSummaryRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SerpAiSummaryRequestInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SerpAiSummaryRequestInfo
  * @throws IOException if the JSON string is invalid with respect to SerpAiSummaryRequestInfo
  */
  public static SerpAiSummaryRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpAiSummaryRequestInfo.class);
  }

 /**
  * Convert an instance of SerpAiSummaryRequestInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
