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



public class ContentGenerationGenerateLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public ContentGenerationGenerateLiveRequestInfo text(String text) {
    this.text = text;
    return this;
  }

  /**
   * initial target text
* required field
* text input for content generation;
* can contain from 1 to 500 tokens
* learn more about tokens on our help center
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public static final String SERIALIZED_NAME_MAX_NEW_TOKENS = "max_new_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_NEW_TOKENS)
  private Integer maxNewTokens;

  public ContentGenerationGenerateLiveRequestInfo maxNewTokens(Integer maxNewTokens) {
    this.maxNewTokens = maxNewTokens;
    return this;
  }

  /**
   * generation limit for new tokens
* required field if max_tokens is not specified
* the maximum number of new tokens for generated content;
* maximum value: 300;
* Note: the number does not include tokens specified in the text field;
* learn more about this parameter on our help center
   * @return maxNewTokens
   */
  @javax.annotation.Nullable
  public Integer getMaxNewTokens() {
    return maxNewTokens;
  }

  public void setMaxNewTokens(Integer maxNewTokens) {
    this.maxNewTokens = maxNewTokens;
  }


  public static final String SERIALIZED_NAME_MAX_TOKENS = "max_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_TOKENS)
  private Integer maxTokens;

  public ContentGenerationGenerateLiveRequestInfo maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  /**
   * generation limit for all tokens
* required field if max_new_tokens is not specified
* the maximum total number of tokens for generated content;
* maximum value: 1024;
* Note: the number includes tokens specified in the text field
* learn more about this parameter on our help center
   * @return maxTokens
   */
  @javax.annotation.Nullable
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }


  public static final String SERIALIZED_NAME_CREATIVITY_INDEX = "creativity_index";
  @SerializedName(SERIALIZED_NAME_CREATIVITY_INDEX)
  private Double creativityIndex;

  public ContentGenerationGenerateLiveRequestInfo creativityIndex(Double creativityIndex) {
    this.creativityIndex = creativityIndex;
    return this;
  }

  /**
   * creativity of content generation
* optional field
* if you use this field, you don’t need to use top_k / top_p / temperature
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


  public static final String SERIALIZED_NAME_TOKEN_REPETITION_PENALTY = "token_repetition_penalty";
  @SerializedName(SERIALIZED_NAME_TOKEN_REPETITION_PENALTY)
  private Double tokenRepetitionPenalty;

  public ContentGenerationGenerateLiveRequestInfo tokenRepetitionPenalty(Double tokenRepetitionPenalty) {
    this.tokenRepetitionPenalty = tokenRepetitionPenalty;
    return this;
  }

  /**
   * token repetition
* optional field
* limits the repetition of the same tokens in the generated content;
* can take values from 0.5 to 2;
* default value: 1
   * @return tokenRepetitionPenalty
   */
  @javax.annotation.Nullable
  public Double getTokenRepetitionPenalty() {
    return tokenRepetitionPenalty;
  }

  public void setTokenRepetitionPenalty(Double tokenRepetitionPenalty) {
    this.tokenRepetitionPenalty = tokenRepetitionPenalty;
  }


  public static final String SERIALIZED_NAME_TOP_K = "top_k";
  @SerializedName(SERIALIZED_NAME_TOP_K)
  private Integer topK;

  public ContentGenerationGenerateLiveRequestInfo topK(Integer topK) {
    this.topK = topK;
    return this;
  }

  /**
   * the number of initial tokens in each iteration for choosing a subsequent word
* optional field
* if you use creativity_index, this field will be ignored
* the higher the number, the more high-probability tokens will be shortlisted for generation;
* can take values from 1 to 100;
* default value: 40
* learn more about this parameter on our help center
   * @return topK
   */
  @javax.annotation.Nullable
  public Integer getTopK() {
    return topK;
  }

  public void setTopK(Integer topK) {
    this.topK = topK;
  }


  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private Double topP;

  public ContentGenerationGenerateLiveRequestInfo topP(Double topP) {
    this.topP = topP;
    return this;
  }

  /**
   * excludes initial tokens with probability lower than one
* optional field
* if you use creativity_index, this field will be ignored
* the higher the value, the less low-probability tokens may be shortlisted for generation;
* can take values from 0 to 1
* default value: 0.9
* Note:if both top_k and top_p are used, top_k acts first;
* learn more about this parameter on our help center
   * @return topP
   */
  @javax.annotation.Nullable
  public Double getTopP() {
    return topP;
  }

  public void setTopP(Double topP) {
    this.topP = topP;
  }


  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Double temperature;

  public ContentGenerationGenerateLiveRequestInfo temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * controls the randomness in the output
* optional field
* if you use creativity_index, this field will be ignored
* the lower the temperature, the more likely the model will choose words with a higher probability of occurrence;
* can take values from 0 to 1;
* default value: 0.7
* learn more about this parameter on our help center
   * @return temperature
   */
  @javax.annotation.Nullable
  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }


  public static final String SERIALIZED_NAME_AVOID_WORDS = "avoid_words";
  @SerializedName(SERIALIZED_NAME_AVOID_WORDS)
  private List<String> avoidWords;

  public ContentGenerationGenerateLiveRequestInfo avoidWords(List<String> avoidWords) {
    this.avoidWords = avoidWords;
    return this;
  }

  /**
   * words or phrases to avoid when generating a text
* optional field
* you can specify up to 50 terms;
* example:
* ['term', 'optimization']
   * @return avoidWords
   */
  @javax.annotation.Nullable
  public List<String> getAvoidWords() {
    return avoidWords;
  }

  public void setAvoidWords(List<String> avoidWords) {
    this.avoidWords = avoidWords;
  }


  public static final String SERIALIZED_NAME_AVOID_STARTING_WORDS = "avoid_starting_words";
  @SerializedName(SERIALIZED_NAME_AVOID_STARTING_WORDS)
  private List<String> avoidStartingWords;

  public ContentGenerationGenerateLiveRequestInfo avoidStartingWords(List<String> avoidStartingWords) {
    this.avoidStartingWords = avoidStartingWords;
    return this;
  }

  /**
   * words or phrases to avoid in the beginning of the generated text
* optional field
* you can specify up to 50 terms;
* example:
* ['SEO', 'search engine optimization']
   * @return avoidStartingWords
   */
  @javax.annotation.Nullable
  public List<String> getAvoidStartingWords() {
    return avoidStartingWords;
  }

  public void setAvoidStartingWords(List<String> avoidStartingWords) {
    this.avoidStartingWords = avoidStartingWords;
  }


  public static final String SERIALIZED_NAME_STOP_WORDS = "stop_words";
  @SerializedName(SERIALIZED_NAME_STOP_WORDS)
  private List<String> stopWords;

  public ContentGenerationGenerateLiveRequestInfo stopWords(List<String> stopWords) {
    this.stopWords = stopWords;
    return this;
  }

  /**
   * words or phrases to end the text
* optional field
* you can specify up to 50 terms;
* example:
* ['now','subscribe']
   * @return stopWords
   */
  @javax.annotation.Nullable
  public List<String> getStopWords() {
    return stopWords;
  }

  public void setStopWords(List<String> stopWords) {
    this.stopWords = stopWords;
  }


  public static final String SERIALIZED_NAME_SUPPLEMENT_TOKEN = "supplement_token";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_TOKEN)
  private String supplementToken;

  public ContentGenerationGenerateLiveRequestInfo supplementToken(String supplementToken) {
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

  public ContentGenerationGenerateLiveRequestInfo tag(String tag) {
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



  public ContentGenerationGenerateLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentGenerationGenerateLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentGenerationGenerateLiveRequestInfo contentGenerationGenerateLiveRequestInfo = (ContentGenerationGenerateLiveRequestInfo) o;
    return

        Objects.equals(this.text, contentGenerationGenerateLiveRequestInfo.text) &&
        Objects.equals(this.maxNewTokens, contentGenerationGenerateLiveRequestInfo.maxNewTokens) &&
        Objects.equals(this.maxTokens, contentGenerationGenerateLiveRequestInfo.maxTokens) &&
        Objects.equals(this.creativityIndex, contentGenerationGenerateLiveRequestInfo.creativityIndex) &&
        Objects.equals(this.tokenRepetitionPenalty, contentGenerationGenerateLiveRequestInfo.tokenRepetitionPenalty) &&
        Objects.equals(this.topK, contentGenerationGenerateLiveRequestInfo.topK) &&
        Objects.equals(this.topP, contentGenerationGenerateLiveRequestInfo.topP) &&
        Objects.equals(this.temperature, contentGenerationGenerateLiveRequestInfo.temperature) &&
        Objects.equals(this.avoidWords, contentGenerationGenerateLiveRequestInfo.avoidWords) &&
        Objects.equals(this.avoidStartingWords, contentGenerationGenerateLiveRequestInfo.avoidStartingWords) &&
        Objects.equals(this.stopWords, contentGenerationGenerateLiveRequestInfo.stopWords) &&
        Objects.equals(this.supplementToken, contentGenerationGenerateLiveRequestInfo.supplementToken) &&
        Objects.equals(this.tag, contentGenerationGenerateLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(text, maxNewTokens, maxTokens, creativityIndex, tokenRepetitionPenalty, topK, topP, temperature, avoidWords, avoidStartingWords, stopWords, supplementToken, tag);
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
    sb.append("class ContentGenerationGenerateLiveRequestInfo {\n");

    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    maxNewTokens: ").append(toIndentedString(maxNewTokens)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    creativityIndex: ").append(toIndentedString(creativityIndex)).append("\n");
    sb.append("    tokenRepetitionPenalty: ").append(toIndentedString(tokenRepetitionPenalty)).append("\n");
    sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    avoidWords: ").append(toIndentedString(avoidWords)).append("\n");
    sb.append("    avoidStartingWords: ").append(toIndentedString(avoidStartingWords)).append("\n");
    sb.append("    stopWords: ").append(toIndentedString(stopWords)).append("\n");
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
    
    openapiFields.add("text");
    
    openapiFields.add("max_new_tokens");
    
    openapiFields.add("max_tokens");
    
    openapiFields.add("creativity_index");
    
    openapiFields.add("token_repetition_penalty");
    
    openapiFields.add("top_k");
    
    openapiFields.add("top_p");
    
    openapiFields.add("temperature");
    
    openapiFields.add("avoid_words");
    
    openapiFields.add("avoid_starting_words");
    
    openapiFields.add("stop_words");
    
    openapiFields.add("supplement_token");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentGenerationGenerateLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationGenerateLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationGenerateLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationGenerateLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationGenerateLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationGenerateLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, ContentGenerationGenerateLiveRequestInfo value) throws IOException {
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
           public ContentGenerationGenerateLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentGenerationGenerateLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentGenerationGenerateLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationGenerateLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}