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



public class ContentGenerationGenerateTextLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public ContentGenerationGenerateTextLiveRequestInfo topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * main topic of the content to generate
* required field
* main topic for generating content;
* can contain from 1 to 50 tokens
   * @return topic
   */
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public static final String SERIALIZED_NAME_WORD_COUNT = "word_count";
  @SerializedName(SERIALIZED_NAME_WORD_COUNT)
  private Long wordCount;

  public ContentGenerationGenerateTextLiveRequestInfo wordCount(Long wordCount) {
    this.wordCount = wordCount;
    return this;
  }

  /**
   * number of words in content
* required field
* the number of tokens in the generated text;
* can take values from 1 to 1000
   * @return wordCount
   */
  @javax.annotation.Nullable
  public Long getWordCount() {
    return wordCount;
  }

  public void setWordCount(Long wordCount) {
    this.wordCount = wordCount;
  }


  public static final String SERIALIZED_NAME_SUB_TOPICS = "sub_topics";
  @SerializedName(SERIALIZED_NAME_SUB_TOPICS)
  private List<String> subTopics;

  public ContentGenerationGenerateTextLiveRequestInfo subTopics(List<String> subTopics) {
    this.subTopics = subTopics;
    return this;
  }

  /**
   * secondary topics of the content to generate
* optional field
* secondary topics for generating content;
* can contain up to 10 terms;
* example: 'sub_topics': ['Apple','Pixar','Amazing Products']
   * @return subTopics
   */
  @javax.annotation.Nullable
  public List<String> getSubTopics() {
    return subTopics;
  }

  public void setSubTopics(List<String> subTopics) {
    this.subTopics = subTopics;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public ContentGenerationGenerateTextLiveRequestInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * meta description of the content to generate
* optional field
* can contain from 1 to 1000 tokens
* learn more about this parameter on our help center
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_META_KEYWORDS = "meta_keywords";
  @SerializedName(SERIALIZED_NAME_META_KEYWORDS)
  private List<String> metaKeywords;

  public ContentGenerationGenerateTextLiveRequestInfo metaKeywords(List<String> metaKeywords) {
    this.metaKeywords = metaKeywords;
    return this;
  }

  /**
   * keywords for the content to generate
* optional field
* can contain up to 10 terms;
* learn more about this parameter on our help center
* example: 'meta_keywords': ['iPhone','sell','CEO']
   * @return metaKeywords
   */
  @javax.annotation.Nullable
  public List<String> getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(List<String> metaKeywords) {
    this.metaKeywords = metaKeywords;
  }


  public static final String SERIALIZED_NAME_CREATIVITY_INDEX = "creativity_index";
  @SerializedName(SERIALIZED_NAME_CREATIVITY_INDEX)
  private Double creativityIndex;

  public ContentGenerationGenerateTextLiveRequestInfo creativityIndex(Double creativityIndex) {
    this.creativityIndex = creativityIndex;
    return this;
  }

  /**
   * creativity of content generation
* optional field
* the randomness of the selection of equally probable subsequent tokens;
* can take values from 0 to 1
* default value: 0.8
* learn more about this parameter on our help center
   * @return creativityIndex
   */
  @javax.annotation.Nullable
  public Double getCreativityIndex() {
    return creativityIndex;
  }

  public void setCreativityIndex(Double creativityIndex) {
    this.creativityIndex = creativityIndex;
  }


  public static final String SERIALIZED_NAME_INCLUDE_CONCLUSION = "include_conclusion";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CONCLUSION)
  private Boolean includeConclusion;

  public ContentGenerationGenerateTextLiveRequestInfo includeConclusion(Boolean includeConclusion) {
    this.includeConclusion = includeConclusion;
    return this;
  }

  /**
   * include conclusion in generated text
* optional field
* if set to true, generated content will include a logical conclusion
   * @return includeConclusion
   */
  @javax.annotation.Nullable
  public Boolean getIncludeConclusion() {
    return includeConclusion;
  }

  public void setIncludeConclusion(Boolean includeConclusion) {
    this.includeConclusion = includeConclusion;
  }


  public static final String SERIALIZED_NAME_SUPPLEMENT_TOKEN = "supplement_token";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_TOKEN)
  private String supplementToken;

  public ContentGenerationGenerateTextLiveRequestInfo supplementToken(String supplementToken) {
    this.supplementToken = supplementToken;
    return this;
  }

  /**
   * token for generating subsequent results
* optional field
* provided in the identical filed of the response to each request;
* you can use this parameter to continue the generation of text from the initial response
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


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public ContentGenerationGenerateTextLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
* you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  public ContentGenerationGenerateTextLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentGenerationGenerateTextLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentGenerationGenerateTextLiveRequestInfo contentGenerationGenerateTextLiveRequestInfo = (ContentGenerationGenerateTextLiveRequestInfo) o;
    return

        Objects.equals(this.topic, contentGenerationGenerateTextLiveRequestInfo.topic) &&
        Objects.equals(this.wordCount, contentGenerationGenerateTextLiveRequestInfo.wordCount) &&
        Objects.equals(this.subTopics, contentGenerationGenerateTextLiveRequestInfo.subTopics) &&
        Objects.equals(this.description, contentGenerationGenerateTextLiveRequestInfo.description) &&
        Objects.equals(this.metaKeywords, contentGenerationGenerateTextLiveRequestInfo.metaKeywords) &&
        Objects.equals(this.creativityIndex, contentGenerationGenerateTextLiveRequestInfo.creativityIndex) &&
        Objects.equals(this.includeConclusion, contentGenerationGenerateTextLiveRequestInfo.includeConclusion) &&
        Objects.equals(this.supplementToken, contentGenerationGenerateTextLiveRequestInfo.supplementToken) &&
        Objects.equals(this.tag, contentGenerationGenerateTextLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(topic, wordCount, subTopics, description, metaKeywords, creativityIndex, includeConclusion, supplementToken, tag);
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
    sb.append("class ContentGenerationGenerateTextLiveRequestInfo {\n");

    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    subTopics: ").append(toIndentedString(subTopics)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
    sb.append("    creativityIndex: ").append(toIndentedString(creativityIndex)).append("\n");
    sb.append("    includeConclusion: ").append(toIndentedString(includeConclusion)).append("\n");
    sb.append("    supplementToken: ").append(toIndentedString(supplementToken)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    
    openapiFields.add("topic");
    
    openapiFields.add("word_count");
    
    openapiFields.add("sub_topics");
    
    openapiFields.add("description");
    
    openapiFields.add("meta_keywords");
    
    openapiFields.add("creativity_index");
    
    openapiFields.add("include_conclusion");
    
    openapiFields.add("supplement_token");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentGenerationGenerateTextLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationGenerateTextLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationGenerateTextLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationGenerateTextLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationGenerateTextLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationGenerateTextLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, ContentGenerationGenerateTextLiveRequestInfo value) throws IOException {
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
           public ContentGenerationGenerateTextLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentGenerationGenerateTextLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentGenerationGenerateTextLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationGenerateTextLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}