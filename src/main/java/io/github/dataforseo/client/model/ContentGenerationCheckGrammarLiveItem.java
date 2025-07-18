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



public class ContentGenerationCheckGrammarLiveItem  {


  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ContentGenerationCheckGrammarLiveItem message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message of the grammar or spelling error
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public ContentGenerationCheckGrammarLiveItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the grammar or spelling error
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private List<String> suggestions;

  public ContentGenerationCheckGrammarLiveItem suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * suggested corrections
   * @return suggestions
   */
  @javax.annotation.Nullable
  public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public ContentGenerationCheckGrammarLiveItem offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset token for subsequent requests
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public ContentGenerationCheckGrammarLiveItem length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * offset token for subsequent requests
   * @return length
   */
  @javax.annotation.Nullable
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ContentGenerationCheckGrammarLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public ContentGenerationCheckGrammarLiveItem ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * id of the grammar or spelling rule
* see the List of Grammar Rules for Content Generation API
   * @return ruleId
   */
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public static final String SERIALIZED_NAME_RULE_DESCRIPTION = "rule_description";
  @SerializedName(SERIALIZED_NAME_RULE_DESCRIPTION)
  private String ruleDescription;

  public ContentGenerationCheckGrammarLiveItem ruleDescription(String ruleDescription) {
    this.ruleDescription = ruleDescription;
    return this;
  }

  /**
   * description of the grammar or spelling rule
   * @return ruleDescription
   */
  @javax.annotation.Nullable
  public String getRuleDescription() {
    return ruleDescription;
  }

  public void setRuleDescription(String ruleDescription) {
    this.ruleDescription = ruleDescription;
  }


  public static final String SERIALIZED_NAME_RULE_ISSUE_TYPE = "rule_issue_type";
  @SerializedName(SERIALIZED_NAME_RULE_ISSUE_TYPE)
  private String ruleIssueType;

  public ContentGenerationCheckGrammarLiveItem ruleIssueType(String ruleIssueType) {
    this.ruleIssueType = ruleIssueType;
    return this;
  }

  /**
   * type of the issue found by the relevant rule
   * @return ruleIssueType
   */
  @javax.annotation.Nullable
  public String getRuleIssueType() {
    return ruleIssueType;
  }

  public void setRuleIssueType(String ruleIssueType) {
    this.ruleIssueType = ruleIssueType;
  }


  public static final String SERIALIZED_NAME_RULE_CATEGORY_ID = "rule_category_id";
  @SerializedName(SERIALIZED_NAME_RULE_CATEGORY_ID)
  private String ruleCategoryId;

  public ContentGenerationCheckGrammarLiveItem ruleCategoryId(String ruleCategoryId) {
    this.ruleCategoryId = ruleCategoryId;
    return this;
  }

  /**
   * id of the rule category
   * @return ruleCategoryId
   */
  @javax.annotation.Nullable
  public String getRuleCategoryId() {
    return ruleCategoryId;
  }

  public void setRuleCategoryId(String ruleCategoryId) {
    this.ruleCategoryId = ruleCategoryId;
  }


  public static final String SERIALIZED_NAME_RULE_CATEGORY_NAME = "rule_category_name";
  @SerializedName(SERIALIZED_NAME_RULE_CATEGORY_NAME)
  private String ruleCategoryName;

  public ContentGenerationCheckGrammarLiveItem ruleCategoryName(String ruleCategoryName) {
    this.ruleCategoryName = ruleCategoryName;
    return this;
  }

  /**
   * name of the rule category
   * @return ruleCategoryName
   */
  @javax.annotation.Nullable
  public String getRuleCategoryName() {
    return ruleCategoryName;
  }

  public void setRuleCategoryName(String ruleCategoryName) {
    this.ruleCategoryName = ruleCategoryName;
  }



  public ContentGenerationCheckGrammarLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentGenerationCheckGrammarLiveItem putAdditionalProperty(String key, Object value) {
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


    
    ContentGenerationCheckGrammarLiveItem contentGenerationCheckGrammarLiveItem = (ContentGenerationCheckGrammarLiveItem) o;
    return

        Objects.equals(this.message, contentGenerationCheckGrammarLiveItem.message) &&
        Objects.equals(this.description, contentGenerationCheckGrammarLiveItem.description) &&
        Objects.equals(this.suggestions, contentGenerationCheckGrammarLiveItem.suggestions) &&
        Objects.equals(this.offset, contentGenerationCheckGrammarLiveItem.offset) &&
        Objects.equals(this.length, contentGenerationCheckGrammarLiveItem.length) &&
        Objects.equals(this.type, contentGenerationCheckGrammarLiveItem.type) &&
        Objects.equals(this.ruleId, contentGenerationCheckGrammarLiveItem.ruleId) &&
        Objects.equals(this.ruleDescription, contentGenerationCheckGrammarLiveItem.ruleDescription) &&
        Objects.equals(this.ruleIssueType, contentGenerationCheckGrammarLiveItem.ruleIssueType) &&
        Objects.equals(this.ruleCategoryId, contentGenerationCheckGrammarLiveItem.ruleCategoryId) &&
        Objects.equals(this.ruleCategoryName, contentGenerationCheckGrammarLiveItem.ruleCategoryName);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(message, description, suggestions, offset, length, type, ruleId, ruleDescription, ruleIssueType, ruleCategoryId, ruleCategoryName);
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
    sb.append("class ContentGenerationCheckGrammarLiveItem {\n");

    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleDescription: ").append(toIndentedString(ruleDescription)).append("\n");
    sb.append("    ruleIssueType: ").append(toIndentedString(ruleIssueType)).append("\n");
    sb.append("    ruleCategoryId: ").append(toIndentedString(ruleCategoryId)).append("\n");
    sb.append("    ruleCategoryName: ").append(toIndentedString(ruleCategoryName)).append("\n");
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
    
    openapiFields.add("message");
    
    openapiFields.add("description");
    
    openapiFields.add("suggestions");
    
    openapiFields.add("offset");
    
    openapiFields.add("length");
    
    openapiFields.add("type");
    
    openapiFields.add("rule_id");
    
    openapiFields.add("rule_description");
    
    openapiFields.add("rule_issue_type");
    
    openapiFields.add("rule_category_id");
    
    openapiFields.add("rule_category_name");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentGenerationCheckGrammarLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationCheckGrammarLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationCheckGrammarLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationCheckGrammarLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationCheckGrammarLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationCheckGrammarLiveItem>() {
           @Override
           public void write(JsonWriter out, ContentGenerationCheckGrammarLiveItem value) throws IOException {
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
           public ContentGenerationCheckGrammarLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentGenerationCheckGrammarLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentGenerationCheckGrammarLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationCheckGrammarLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}