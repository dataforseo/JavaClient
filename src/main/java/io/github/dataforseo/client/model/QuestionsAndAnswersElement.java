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



public class QuestionsAndAnswersElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public QuestionsAndAnswersElement type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public QuestionsAndAnswersElement url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_QUESTION_TEXT = "question_text";
  @SerializedName(SERIALIZED_NAME_QUESTION_TEXT)
  private String questionText;

  public QuestionsAndAnswersElement questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * question included in the item
   * @return questionText
   */
  @javax.annotation.Nullable
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }


  public static final String SERIALIZED_NAME_ANSWER_TEXT = "answer_text";
  @SerializedName(SERIALIZED_NAME_ANSWER_TEXT)
  private String answerText;

  public QuestionsAndAnswersElement answerText(String answerText) {
    this.answerText = answerText;
    return this;
  }

  /**
   * answer included in the item
   * @return answerText
   */
  @javax.annotation.Nullable
  public String getAnswerText() {
    return answerText;
  }

  public void setAnswerText(String answerText) {
    this.answerText = answerText;
  }


  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public QuestionsAndAnswersElement source(String source) {
    this.source = source;
    return this;
  }

  /**
   * source of the element
* indicates the source of information included in the top_stories_element
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public QuestionsAndAnswersElement domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * website domain
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  private Integer votes;

  public QuestionsAndAnswersElement votes(Integer votes) {
    this.votes = votes;
    return this;
  }

  /**
   * answer upvotes from the source
   * @return votes
   */
  @javax.annotation.Nullable
  public Integer getVotes() {
    return votes;
  }

  public void setVotes(Integer votes) {
    this.votes = votes;
  }



  public QuestionsAndAnswersElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public QuestionsAndAnswersElement putAdditionalProperty(String key, Object value) {
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


    
    QuestionsAndAnswersElement questionsAndAnswersElement = (QuestionsAndAnswersElement) o;
    return

        Objects.equals(this.type, questionsAndAnswersElement.type) &&
        Objects.equals(this.url, questionsAndAnswersElement.url) &&
        Objects.equals(this.questionText, questionsAndAnswersElement.questionText) &&
        Objects.equals(this.answerText, questionsAndAnswersElement.answerText) &&
        Objects.equals(this.source, questionsAndAnswersElement.source) &&
        Objects.equals(this.domain, questionsAndAnswersElement.domain) &&
        Objects.equals(this.votes, questionsAndAnswersElement.votes);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, url, questionText, answerText, source, domain, votes);
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
    sb.append("class QuestionsAndAnswersElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    answerText: ").append(toIndentedString(answerText)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("url");
    
    openapiFields.add("question_text");
    
    openapiFields.add("answer_text");
    
    openapiFields.add("source");
    
    openapiFields.add("domain");
    
    openapiFields.add("votes");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuestionsAndAnswersElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionsAndAnswersElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionsAndAnswersElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionsAndAnswersElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAndAnswersElement.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionsAndAnswersElement>() {
           @Override
           public void write(JsonWriter out, QuestionsAndAnswersElement value) throws IOException {
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
           public QuestionsAndAnswersElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             QuestionsAndAnswersElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static QuestionsAndAnswersElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionsAndAnswersElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}