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



public class HtmlContentInfo  {


  public static final String SERIALIZED_NAME_PLAIN_TEXT_SIZE = "plain_text_size";
  @SerializedName(SERIALIZED_NAME_PLAIN_TEXT_SIZE)
  private Integer plainTextSize;

  public HtmlContentInfo plainTextSize(Integer plainTextSize) {
    this.plainTextSize = plainTextSize;
    return this;
  }

  /**
   * total size of the text on the page measured in bytes
   * @return plainTextSize
   */
  @javax.annotation.Nullable
  public Integer getPlainTextSize() {
    return plainTextSize;
  }

  public void setPlainTextSize(Integer plainTextSize) {
    this.plainTextSize = plainTextSize;
  }


  public static final String SERIALIZED_NAME_PLAIN_TEXT_RATE = "plain_text_rate";
  @SerializedName(SERIALIZED_NAME_PLAIN_TEXT_RATE)
  private Double plainTextRate;

  public HtmlContentInfo plainTextRate(Double plainTextRate) {
    this.plainTextRate = plainTextRate;
    return this;
  }

  /**
   * plaintext rate value
* plain_text_size to size ratio
   * @return plainTextRate
   */
  @javax.annotation.Nullable
  public Double getPlainTextRate() {
    return plainTextRate;
  }

  public void setPlainTextRate(Double plainTextRate) {
    this.plainTextRate = plainTextRate;
  }


  public static final String SERIALIZED_NAME_PLAIN_TEXT_WORD_COUNT = "plain_text_word_count";
  @SerializedName(SERIALIZED_NAME_PLAIN_TEXT_WORD_COUNT)
  private Integer plainTextWordCount;

  public HtmlContentInfo plainTextWordCount(Integer plainTextWordCount) {
    this.plainTextWordCount = plainTextWordCount;
    return this;
  }

  /**
   * number of words on the page
   * @return plainTextWordCount
   */
  @javax.annotation.Nullable
  public Integer getPlainTextWordCount() {
    return plainTextWordCount;
  }

  public void setPlainTextWordCount(Integer plainTextWordCount) {
    this.plainTextWordCount = plainTextWordCount;
  }


  public static final String SERIALIZED_NAME_AUTOMATED_READABILITY_INDEX = "automated_readability_index";
  @SerializedName(SERIALIZED_NAME_AUTOMATED_READABILITY_INDEX)
  private Double automatedReadabilityIndex;

  public HtmlContentInfo automatedReadabilityIndex(Double automatedReadabilityIndex) {
    this.automatedReadabilityIndex = automatedReadabilityIndex;
    return this;
  }

  /**
   * Automated Readability Index
   * @return automatedReadabilityIndex
   */
  @javax.annotation.Nullable
  public Double getAutomatedReadabilityIndex() {
    return automatedReadabilityIndex;
  }

  public void setAutomatedReadabilityIndex(Double automatedReadabilityIndex) {
    this.automatedReadabilityIndex = automatedReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_COLEMAN_LIAU_READABILITY_INDEX = "coleman_liau_readability_index";
  @SerializedName(SERIALIZED_NAME_COLEMAN_LIAU_READABILITY_INDEX)
  private Double colemanLiauReadabilityIndex;

  public HtmlContentInfo colemanLiauReadabilityIndex(Double colemanLiauReadabilityIndex) {
    this.colemanLiauReadabilityIndex = colemanLiauReadabilityIndex;
    return this;
  }

  /**
   * Coleman–Liau Index
   * @return colemanLiauReadabilityIndex
   */
  @javax.annotation.Nullable
  public Double getColemanLiauReadabilityIndex() {
    return colemanLiauReadabilityIndex;
  }

  public void setColemanLiauReadabilityIndex(Double colemanLiauReadabilityIndex) {
    this.colemanLiauReadabilityIndex = colemanLiauReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_DALE_CHALL_READABILITY_INDEX = "dale_chall_readability_index";
  @SerializedName(SERIALIZED_NAME_DALE_CHALL_READABILITY_INDEX)
  private Double daleChallReadabilityIndex;

  public HtmlContentInfo daleChallReadabilityIndex(Double daleChallReadabilityIndex) {
    this.daleChallReadabilityIndex = daleChallReadabilityIndex;
    return this;
  }

  /**
   * Dale–Chall Readability Index
   * @return daleChallReadabilityIndex
   */
  @javax.annotation.Nullable
  public Double getDaleChallReadabilityIndex() {
    return daleChallReadabilityIndex;
  }

  public void setDaleChallReadabilityIndex(Double daleChallReadabilityIndex) {
    this.daleChallReadabilityIndex = daleChallReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_FLESCH_KINCAID_READABILITY_INDEX = "flesch_kincaid_readability_index";
  @SerializedName(SERIALIZED_NAME_FLESCH_KINCAID_READABILITY_INDEX)
  private Double fleschKincaidReadabilityIndex;

  public HtmlContentInfo fleschKincaidReadabilityIndex(Double fleschKincaidReadabilityIndex) {
    this.fleschKincaidReadabilityIndex = fleschKincaidReadabilityIndex;
    return this;
  }

  /**
   * Flesch–Kincaid Readability Index
   * @return fleschKincaidReadabilityIndex
   */
  @javax.annotation.Nullable
  public Double getFleschKincaidReadabilityIndex() {
    return fleschKincaidReadabilityIndex;
  }

  public void setFleschKincaidReadabilityIndex(Double fleschKincaidReadabilityIndex) {
    this.fleschKincaidReadabilityIndex = fleschKincaidReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_SMOG_READABILITY_INDEX = "smog_readability_index";
  @SerializedName(SERIALIZED_NAME_SMOG_READABILITY_INDEX)
  private Double smogReadabilityIndex;

  public HtmlContentInfo smogReadabilityIndex(Double smogReadabilityIndex) {
    this.smogReadabilityIndex = smogReadabilityIndex;
    return this;
  }

  /**
   * SMOG Readability Index
   * @return smogReadabilityIndex
   */
  @javax.annotation.Nullable
  public Double getSmogReadabilityIndex() {
    return smogReadabilityIndex;
  }

  public void setSmogReadabilityIndex(Double smogReadabilityIndex) {
    this.smogReadabilityIndex = smogReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION_TO_CONTENT_CONSISTENCY = "description_to_content_consistency";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_TO_CONTENT_CONSISTENCY)
  private Double descriptionToContentConsistency;

  public HtmlContentInfo descriptionToContentConsistency(Double descriptionToContentConsistency) {
    this.descriptionToContentConsistency = descriptionToContentConsistency;
    return this;
  }

  /**
   * consistency of the meta description tag with the page content
* measured from 0 to 1
   * @return descriptionToContentConsistency
   */
  @javax.annotation.Nullable
  public Double getDescriptionToContentConsistency() {
    return descriptionToContentConsistency;
  }

  public void setDescriptionToContentConsistency(Double descriptionToContentConsistency) {
    this.descriptionToContentConsistency = descriptionToContentConsistency;
  }


  public static final String SERIALIZED_NAME_TITLE_TO_CONTENT_CONSISTENCY = "title_to_content_consistency";
  @SerializedName(SERIALIZED_NAME_TITLE_TO_CONTENT_CONSISTENCY)
  private Double titleToContentConsistency;

  public HtmlContentInfo titleToContentConsistency(Double titleToContentConsistency) {
    this.titleToContentConsistency = titleToContentConsistency;
    return this;
  }

  /**
   * consistency of the meta title tag with the page content
* measured from 0 to 1
   * @return titleToContentConsistency
   */
  @javax.annotation.Nullable
  public Double getTitleToContentConsistency() {
    return titleToContentConsistency;
  }

  public void setTitleToContentConsistency(Double titleToContentConsistency) {
    this.titleToContentConsistency = titleToContentConsistency;
  }


  public static final String SERIALIZED_NAME_META_KEYWORDS_TO_CONTENT_CONSISTENCY = "meta_keywords_to_content_consistency";
  @SerializedName(SERIALIZED_NAME_META_KEYWORDS_TO_CONTENT_CONSISTENCY)
  private Double metaKeywordsToContentConsistency;

  public HtmlContentInfo metaKeywordsToContentConsistency(Double metaKeywordsToContentConsistency) {
    this.metaKeywordsToContentConsistency = metaKeywordsToContentConsistency;
    return this;
  }

  /**
   * consistency of meta keywordstag with the page content
* measured from 0 to 1
   * @return metaKeywordsToContentConsistency
   */
  @javax.annotation.Nullable
  public Double getMetaKeywordsToContentConsistency() {
    return metaKeywordsToContentConsistency;
  }

  public void setMetaKeywordsToContentConsistency(Double metaKeywordsToContentConsistency) {
    this.metaKeywordsToContentConsistency = metaKeywordsToContentConsistency;
  }



  public HtmlContentInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HtmlContentInfo putAdditionalProperty(String key, Object value) {
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


    
    HtmlContentInfo htmlContentInfo = (HtmlContentInfo) o;
    return

        Objects.equals(this.plainTextSize, htmlContentInfo.plainTextSize) &&
        Objects.equals(this.plainTextRate, htmlContentInfo.plainTextRate) &&
        Objects.equals(this.plainTextWordCount, htmlContentInfo.plainTextWordCount) &&
        Objects.equals(this.automatedReadabilityIndex, htmlContentInfo.automatedReadabilityIndex) &&
        Objects.equals(this.colemanLiauReadabilityIndex, htmlContentInfo.colemanLiauReadabilityIndex) &&
        Objects.equals(this.daleChallReadabilityIndex, htmlContentInfo.daleChallReadabilityIndex) &&
        Objects.equals(this.fleschKincaidReadabilityIndex, htmlContentInfo.fleschKincaidReadabilityIndex) &&
        Objects.equals(this.smogReadabilityIndex, htmlContentInfo.smogReadabilityIndex) &&
        Objects.equals(this.descriptionToContentConsistency, htmlContentInfo.descriptionToContentConsistency) &&
        Objects.equals(this.titleToContentConsistency, htmlContentInfo.titleToContentConsistency) &&
        Objects.equals(this.metaKeywordsToContentConsistency, htmlContentInfo.metaKeywordsToContentConsistency);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(plainTextSize, plainTextRate, plainTextWordCount, automatedReadabilityIndex, colemanLiauReadabilityIndex, daleChallReadabilityIndex, fleschKincaidReadabilityIndex, smogReadabilityIndex, descriptionToContentConsistency, titleToContentConsistency, metaKeywordsToContentConsistency);
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
    sb.append("class HtmlContentInfo {\n");

    sb.append("    plainTextSize: ").append(toIndentedString(plainTextSize)).append("\n");
    sb.append("    plainTextRate: ").append(toIndentedString(plainTextRate)).append("\n");
    sb.append("    plainTextWordCount: ").append(toIndentedString(plainTextWordCount)).append("\n");
    sb.append("    automatedReadabilityIndex: ").append(toIndentedString(automatedReadabilityIndex)).append("\n");
    sb.append("    colemanLiauReadabilityIndex: ").append(toIndentedString(colemanLiauReadabilityIndex)).append("\n");
    sb.append("    daleChallReadabilityIndex: ").append(toIndentedString(daleChallReadabilityIndex)).append("\n");
    sb.append("    fleschKincaidReadabilityIndex: ").append(toIndentedString(fleschKincaidReadabilityIndex)).append("\n");
    sb.append("    smogReadabilityIndex: ").append(toIndentedString(smogReadabilityIndex)).append("\n");
    sb.append("    descriptionToContentConsistency: ").append(toIndentedString(descriptionToContentConsistency)).append("\n");
    sb.append("    titleToContentConsistency: ").append(toIndentedString(titleToContentConsistency)).append("\n");
    sb.append("    metaKeywordsToContentConsistency: ").append(toIndentedString(metaKeywordsToContentConsistency)).append("\n");
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
    
    openapiFields.add("plain_text_size");
    
    openapiFields.add("plain_text_rate");
    
    openapiFields.add("plain_text_word_count");
    
    openapiFields.add("automated_readability_index");
    
    openapiFields.add("coleman_liau_readability_index");
    
    openapiFields.add("dale_chall_readability_index");
    
    openapiFields.add("flesch_kincaid_readability_index");
    
    openapiFields.add("smog_readability_index");
    
    openapiFields.add("description_to_content_consistency");
    
    openapiFields.add("title_to_content_consistency");
    
    openapiFields.add("meta_keywords_to_content_consistency");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HtmlContentInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HtmlContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HtmlContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HtmlContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HtmlContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HtmlContentInfo>() {
           @Override
           public void write(JsonWriter out, HtmlContentInfo value) throws IOException {
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
           public HtmlContentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HtmlContentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static HtmlContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HtmlContentInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}