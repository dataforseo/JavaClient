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



public class KeywordProperties  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public KeywordProperties seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_CORE_KEYWORD = "core_keyword";
  @SerializedName(SERIALIZED_NAME_CORE_KEYWORD)
  private String coreKeyword;

  public KeywordProperties coreKeyword(String coreKeyword) {
    this.coreKeyword = coreKeyword;
    return this;
  }

  /**
   * main keyword in a group
* contains the main keyword in a group determined by the synonym clustering algorithm
* if the value is null, our database does not contain any keywords the corresponding algorithm could identify as synonymous with keyword
   * @return coreKeyword
   */
  @javax.annotation.Nullable
  public String getCoreKeyword() {
    return coreKeyword;
  }

  public void setCoreKeyword(String coreKeyword) {
    this.coreKeyword = coreKeyword;
  }


  public static final String SERIALIZED_NAME_SYNONYM_CLUSTERING_ALGORITHM = "synonym_clustering_algorithm";
  @SerializedName(SERIALIZED_NAME_SYNONYM_CLUSTERING_ALGORITHM)
  private String synonymClusteringAlgorithm;

  public KeywordProperties synonymClusteringAlgorithm(String synonymClusteringAlgorithm) {
    this.synonymClusteringAlgorithm = synonymClusteringAlgorithm;
    return this;
  }

  /**
   * the algorithm used to identify synonyms
* possible values:
* keyword_metrics – indicates the algorithm based on keyword_info parameters
* text_processing – indicates the text-based algorithm
* if the value is null, our database does not contain any keywords the corresponding algorithm could identify as synonymous with keyword
   * @return synonymClusteringAlgorithm
   */
  @javax.annotation.Nullable
  public String getSynonymClusteringAlgorithm() {
    return synonymClusteringAlgorithm;
  }

  public void setSynonymClusteringAlgorithm(String synonymClusteringAlgorithm) {
    this.synonymClusteringAlgorithm = synonymClusteringAlgorithm;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DIFFICULTY = "keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DIFFICULTY)
  private Integer keywordDifficulty;

  public KeywordProperties keywordDifficulty(Integer keywordDifficulty) {
    this.keywordDifficulty = keywordDifficulty;
    return this;
  }

  /**
   * difficulty of ranking in the first top-10 organic results for a keyword
* indicates the chance of getting in top-10 organic results for a keyword on a logarithmic scale from 0 to 100;
* calculated by analysing, among other parameters, link profiles of the first 10 pages in SERP;
* learn more about the metric in this help center guide
   * @return keywordDifficulty
   */
  @javax.annotation.Nullable
  public Integer getKeywordDifficulty() {
    return keywordDifficulty;
  }

  public void setKeywordDifficulty(Integer keywordDifficulty) {
    this.keywordDifficulty = keywordDifficulty;
  }


  public static final String SERIALIZED_NAME_DETECTED_LANGUAGE = "detected_language";
  @SerializedName(SERIALIZED_NAME_DETECTED_LANGUAGE)
  private String detectedLanguage;

  public KeywordProperties detectedLanguage(String detectedLanguage) {
    this.detectedLanguage = detectedLanguage;
    return this;
  }

  /**
   * detected language of the keyword
* indicates the language of the keyword as identified by our system
   * @return detectedLanguage
   */
  @javax.annotation.Nullable
  public String getDetectedLanguage() {
    return detectedLanguage;
  }

  public void setDetectedLanguage(String detectedLanguage) {
    this.detectedLanguage = detectedLanguage;
  }


  public static final String SERIALIZED_NAME_IS_ANOTHER_LANGUAGE = "is_another_language";
  @SerializedName(SERIALIZED_NAME_IS_ANOTHER_LANGUAGE)
  private Boolean isAnotherLanguage;

  public KeywordProperties isAnotherLanguage(Boolean isAnotherLanguage) {
    this.isAnotherLanguage = isAnotherLanguage;
    return this;
  }

  /**
   * detected language of the keyword is different from the set language
* if true, the language set in the request does not match the language determined by our system for a given keyword
   * @return isAnotherLanguage
   */
  @javax.annotation.Nullable
  public Boolean getIsAnotherLanguage() {
    return isAnotherLanguage;
  }

  public void setIsAnotherLanguage(Boolean isAnotherLanguage) {
    this.isAnotherLanguage = isAnotherLanguage;
  }



  public KeywordProperties() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordProperties putAdditionalProperty(String key, Object value) {
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


    
    KeywordProperties keywordProperties = (KeywordProperties) o;
    return

        Objects.equals(this.seType, keywordProperties.seType) &&
        Objects.equals(this.coreKeyword, keywordProperties.coreKeyword) &&
        Objects.equals(this.synonymClusteringAlgorithm, keywordProperties.synonymClusteringAlgorithm) &&
        Objects.equals(this.keywordDifficulty, keywordProperties.keywordDifficulty) &&
        Objects.equals(this.detectedLanguage, keywordProperties.detectedLanguage) &&
        Objects.equals(this.isAnotherLanguage, keywordProperties.isAnotherLanguage);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, coreKeyword, synonymClusteringAlgorithm, keywordDifficulty, detectedLanguage, isAnotherLanguage);
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
    sb.append("class KeywordProperties {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    coreKeyword: ").append(toIndentedString(coreKeyword)).append("\n");
    sb.append("    synonymClusteringAlgorithm: ").append(toIndentedString(synonymClusteringAlgorithm)).append("\n");
    sb.append("    keywordDifficulty: ").append(toIndentedString(keywordDifficulty)).append("\n");
    sb.append("    detectedLanguage: ").append(toIndentedString(detectedLanguage)).append("\n");
    sb.append("    isAnotherLanguage: ").append(toIndentedString(isAnotherLanguage)).append("\n");
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
    
    openapiFields.add("se_type");
    
    openapiFields.add("core_keyword");
    
    openapiFields.add("synonym_clustering_algorithm");
    
    openapiFields.add("keyword_difficulty");
    
    openapiFields.add("detected_language");
    
    openapiFields.add("is_another_language");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordProperties>() {
           @Override
           public void write(JsonWriter out, KeywordProperties value) throws IOException {
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
           public KeywordProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordProperties instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordProperties.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}