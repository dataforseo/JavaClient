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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.dataforseo.client.model.ContentGenerationCheckGrammarLiveItem;
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
 * ContentGenerationCheckGrammarLiveResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class ContentGenerationCheckGrammarLiveResultInfo {
  public static final String SERIALIZED_NAME_INPUT_TOKENS = "input_tokens";
  @SerializedName(SERIALIZED_NAME_INPUT_TOKENS)
  private Integer inputTokens;

  public static final String SERIALIZED_NAME_OUTPUT_TOKENS = "output_tokens";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TOKENS)
  private Integer outputTokens;

  public static final String SERIALIZED_NAME_NEW_TOKENS = "new_tokens";
  @SerializedName(SERIALIZED_NAME_NEW_TOKENS)
  private Integer newTokens;

  public static final String SERIALIZED_NAME_INITIAL_TEXT = "initial_text";
  @SerializedName(SERIALIZED_NAME_INITIAL_TEXT)
  private String initialText;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ContentGenerationCheckGrammarLiveItem> items;

  public ContentGenerationCheckGrammarLiveResultInfo() {
  }

  public ContentGenerationCheckGrammarLiveResultInfo inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

   /**
   * number of input tokens in the POST request
   * @return inputTokens
  **/
  @javax.annotation.Nullable
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }


  public ContentGenerationCheckGrammarLiveResultInfo outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

   /**
   * number of output tokens in the response
   * @return outputTokens
  **/
  @javax.annotation.Nullable
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }


  public ContentGenerationCheckGrammarLiveResultInfo newTokens(Integer newTokens) {
    this.newTokens = newTokens;
    return this;
  }

   /**
   * number of new tokens in the response
   * @return newTokens
  **/
  @javax.annotation.Nullable
  public Integer getNewTokens() {
    return newTokens;
  }

  public void setNewTokens(Integer newTokens) {
    this.newTokens = newTokens;
  }


  public ContentGenerationCheckGrammarLiveResultInfo initialText(String initialText) {
    this.initialText = initialText;
    return this;
  }

   /**
   * initial text in the POST request
   * @return initialText
  **/
  @javax.annotation.Nullable
  public String getInitialText() {
    return initialText;
  }

  public void setInitialText(String initialText) {
    this.initialText = initialText;
  }


  public ContentGenerationCheckGrammarLiveResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * language code in the POST request
   * @return languageCode
  **/
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public ContentGenerationCheckGrammarLiveResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

   /**
   * the number of results returned in the items array
   * @return itemsCount
  **/
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public ContentGenerationCheckGrammarLiveResultInfo items(List<ContentGenerationCheckGrammarLiveItem> items) {
    this.items = items;
    return this;
  }

  public ContentGenerationCheckGrammarLiveResultInfo addItemsItem(ContentGenerationCheckGrammarLiveItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * contains grammar or spelling errors and related data
   * @return items
  **/
  @javax.annotation.Nullable
  public List<ContentGenerationCheckGrammarLiveItem> getItems() {
    return items;
  }

  public void setItems(List<ContentGenerationCheckGrammarLiveItem> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentGenerationCheckGrammarLiveResultInfo contentGenerationCheckGrammarLiveResultInfo = (ContentGenerationCheckGrammarLiveResultInfo) o;
    return Objects.equals(this.inputTokens, contentGenerationCheckGrammarLiveResultInfo.inputTokens) &&
        Objects.equals(this.outputTokens, contentGenerationCheckGrammarLiveResultInfo.outputTokens) &&
        Objects.equals(this.newTokens, contentGenerationCheckGrammarLiveResultInfo.newTokens) &&
        Objects.equals(this.initialText, contentGenerationCheckGrammarLiveResultInfo.initialText) &&
        Objects.equals(this.languageCode, contentGenerationCheckGrammarLiveResultInfo.languageCode) &&
        Objects.equals(this.itemsCount, contentGenerationCheckGrammarLiveResultInfo.itemsCount) &&
        Objects.equals(this.items, contentGenerationCheckGrammarLiveResultInfo.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputTokens, outputTokens, newTokens, initialText, languageCode, itemsCount, items);
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
    sb.append("class ContentGenerationCheckGrammarLiveResultInfo {\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    newTokens: ").append(toIndentedString(newTokens)).append("\n");
    sb.append("    initialText: ").append(toIndentedString(initialText)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
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
    openapiFields.add("input_tokens");
    openapiFields.add("output_tokens");
    openapiFields.add("new_tokens");
    openapiFields.add("initial_text");
    openapiFields.add("language_code");
    openapiFields.add("items_count");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContentGenerationCheckGrammarLiveResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContentGenerationCheckGrammarLiveResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentGenerationCheckGrammarLiveResultInfo is not found in the empty JSON string", ContentGenerationCheckGrammarLiveResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContentGenerationCheckGrammarLiveResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentGenerationCheckGrammarLiveResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("initial_text") != null && !jsonObj.get("initial_text").isJsonNull()) && !jsonObj.get("initial_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_text").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            ContentGenerationCheckGrammarLiveItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationCheckGrammarLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationCheckGrammarLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationCheckGrammarLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationCheckGrammarLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationCheckGrammarLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, ContentGenerationCheckGrammarLiveResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentGenerationCheckGrammarLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentGenerationCheckGrammarLiveResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentGenerationCheckGrammarLiveResultInfo
  * @throws IOException if the JSON string is invalid with respect to ContentGenerationCheckGrammarLiveResultInfo
  */
  public static ContentGenerationCheckGrammarLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationCheckGrammarLiveResultInfo.class);
  }

 /**
  * Convert an instance of ContentGenerationCheckGrammarLiveResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
