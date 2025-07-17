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



public class ContentGenerationTextSummaryLiveResultInfo  {


  public static final String SERIALIZED_NAME_SENTENCES = "sentences";
  @SerializedName(SERIALIZED_NAME_SENTENCES)
  private Integer sentences;

  public ContentGenerationTextSummaryLiveResultInfo sentences(Integer sentences) {
    this.sentences = sentences;
    return this;
  }

  /**
   * number of sentences found in the target text
   * @return sentences
   */
  @javax.annotation.Nullable
  public Integer getSentences() {
    return sentences;
  }

  public void setSentences(Integer sentences) {
    this.sentences = sentences;
  }


  public static final String SERIALIZED_NAME_PARAGRAPHS = "paragraphs";
  @SerializedName(SERIALIZED_NAME_PARAGRAPHS)
  private Integer paragraphs;

  public ContentGenerationTextSummaryLiveResultInfo paragraphs(Integer paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  /**
   * number of paragraphs found in the target text
   * @return paragraphs
   */
  @javax.annotation.Nullable
  public Integer getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(Integer paragraphs) {
    this.paragraphs = paragraphs;
  }


  public static final String SERIALIZED_NAME_WORDS = "words";
  @SerializedName(SERIALIZED_NAME_WORDS)
  private Integer words;

  public ContentGenerationTextSummaryLiveResultInfo words(Integer words) {
    this.words = words;
    return this;
  }

  /**
   * number of words found in the target text
   * @return words
   */
  @javax.annotation.Nullable
  public Integer getWords() {
    return words;
  }

  public void setWords(Integer words) {
    this.words = words;
  }


  public static final String SERIALIZED_NAME_CHARACTERS_WITHOUT_SPACES = "characters_without_spaces";
  @SerializedName(SERIALIZED_NAME_CHARACTERS_WITHOUT_SPACES)
  private Integer charactersWithoutSpaces;

  public ContentGenerationTextSummaryLiveResultInfo charactersWithoutSpaces(Integer charactersWithoutSpaces) {
    this.charactersWithoutSpaces = charactersWithoutSpaces;
    return this;
  }

  /**
   * number of characters without spaces found in the target text
   * @return charactersWithoutSpaces
   */
  @javax.annotation.Nullable
  public Integer getCharactersWithoutSpaces() {
    return charactersWithoutSpaces;
  }

  public void setCharactersWithoutSpaces(Integer charactersWithoutSpaces) {
    this.charactersWithoutSpaces = charactersWithoutSpaces;
  }


  public static final String SERIALIZED_NAME_CHARACTERS_WITH_SPACES = "characters_with_spaces";
  @SerializedName(SERIALIZED_NAME_CHARACTERS_WITH_SPACES)
  private Integer charactersWithSpaces;

  public ContentGenerationTextSummaryLiveResultInfo charactersWithSpaces(Integer charactersWithSpaces) {
    this.charactersWithSpaces = charactersWithSpaces;
    return this;
  }

  /**
   * number of characters with spaces found in the target text
   * @return charactersWithSpaces
   */
  @javax.annotation.Nullable
  public Integer getCharactersWithSpaces() {
    return charactersWithSpaces;
  }

  public void setCharactersWithSpaces(Integer charactersWithSpaces) {
    this.charactersWithSpaces = charactersWithSpaces;
  }


  public static final String SERIALIZED_NAME_WORDS_PER_SENTENCE = "words_per_sentence";
  @SerializedName(SERIALIZED_NAME_WORDS_PER_SENTENCE)
  private Integer wordsPerSentence;

  public ContentGenerationTextSummaryLiveResultInfo wordsPerSentence(Integer wordsPerSentence) {
    this.wordsPerSentence = wordsPerSentence;
    return this;
  }

  /**
   * average number of words per sentence in the target text
   * @return wordsPerSentence
   */
  @javax.annotation.Nullable
  public Integer getWordsPerSentence() {
    return wordsPerSentence;
  }

  public void setWordsPerSentence(Integer wordsPerSentence) {
    this.wordsPerSentence = wordsPerSentence;
  }


  public static final String SERIALIZED_NAME_CHARACTERS_PER_WORD = "characters_per_word";
  @SerializedName(SERIALIZED_NAME_CHARACTERS_PER_WORD)
  private Integer charactersPerWord;

  public ContentGenerationTextSummaryLiveResultInfo charactersPerWord(Integer charactersPerWord) {
    this.charactersPerWord = charactersPerWord;
    return this;
  }

  /**
   * average number of characters per word in the target text
   * @return charactersPerWord
   */
  @javax.annotation.Nullable
  public Integer getCharactersPerWord() {
    return charactersPerWord;
  }

  public void setCharactersPerWord(Integer charactersPerWord) {
    this.charactersPerWord = charactersPerWord;
  }


  public static final String SERIALIZED_NAME_VOCABULARY_DENSITY = "vocabulary_density";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_DENSITY)
  private Integer vocabularyDensity;

  public ContentGenerationTextSummaryLiveResultInfo vocabularyDensity(Integer vocabularyDensity) {
    this.vocabularyDensity = vocabularyDensity;
    return this;
  }

  /**
   * vocabulary density of the target text
   * @return vocabularyDensity
   */
  @javax.annotation.Nullable
  public Integer getVocabularyDensity() {
    return vocabularyDensity;
  }

  public void setVocabularyDensity(Integer vocabularyDensity) {
    this.vocabularyDensity = vocabularyDensity;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DENSITY = "keyword_density";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DENSITY)
  private Map<String, Long> keywordDensity;

  public ContentGenerationTextSummaryLiveResultInfo keywordDensity(Map<String, Long> keywordDensity) {
    this.keywordDensity = keywordDensity;
    return this;
  }

  /**
   * keyword density of the target text
* contains most common words and their count
   * @return keywordDensity
   */
  @javax.annotation.Nullable
  public Map<String, Long> getKeywordDensity() {
    return keywordDensity;
  }

  public void setKeywordDensity(Map<String, Long> keywordDensity) {
    this.keywordDensity = keywordDensity;
  }


  public static final String SERIALIZED_NAME_AUTOMATED_READABILITY_INDEX = "automated_readability_index";
  @SerializedName(SERIALIZED_NAME_AUTOMATED_READABILITY_INDEX)
  private Integer automatedReadabilityIndex;

  public ContentGenerationTextSummaryLiveResultInfo automatedReadabilityIndex(Integer automatedReadabilityIndex) {
    this.automatedReadabilityIndex = automatedReadabilityIndex;
    return this;
  }

  /**
   * Automated Readability Index
   * @return automatedReadabilityIndex
   */
  @javax.annotation.Nullable
  public Integer getAutomatedReadabilityIndex() {
    return automatedReadabilityIndex;
  }

  public void setAutomatedReadabilityIndex(Integer automatedReadabilityIndex) {
    this.automatedReadabilityIndex = automatedReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_COLEMAN_LIAU_INDEX = "coleman_liau_index";
  @SerializedName(SERIALIZED_NAME_COLEMAN_LIAU_INDEX)
  private Integer colemanLiauIndex;

  public ContentGenerationTextSummaryLiveResultInfo colemanLiauIndex(Integer colemanLiauIndex) {
    this.colemanLiauIndex = colemanLiauIndex;
    return this;
  }

  /**
   * Coleman–Liau Index
   * @return colemanLiauIndex
   */
  @javax.annotation.Nullable
  public Integer getColemanLiauIndex() {
    return colemanLiauIndex;
  }

  public void setColemanLiauIndex(Integer colemanLiauIndex) {
    this.colemanLiauIndex = colemanLiauIndex;
  }


  public static final String SERIALIZED_NAME_FLESCH_KINCAID_GRADE_LEVEL = "flesch_kincaid_grade_level";
  @SerializedName(SERIALIZED_NAME_FLESCH_KINCAID_GRADE_LEVEL)
  private Integer fleschKincaidGradeLevel;

  public ContentGenerationTextSummaryLiveResultInfo fleschKincaidGradeLevel(Integer fleschKincaidGradeLevel) {
    this.fleschKincaidGradeLevel = fleschKincaidGradeLevel;
    return this;
  }

  /**
   * Flesch–Kincaid Readability Index
   * @return fleschKincaidGradeLevel
   */
  @javax.annotation.Nullable
  public Integer getFleschKincaidGradeLevel() {
    return fleschKincaidGradeLevel;
  }

  public void setFleschKincaidGradeLevel(Integer fleschKincaidGradeLevel) {
    this.fleschKincaidGradeLevel = fleschKincaidGradeLevel;
  }


  public static final String SERIALIZED_NAME_SMOG_READABILITY_INDEX = "smog_readability_index";
  @SerializedName(SERIALIZED_NAME_SMOG_READABILITY_INDEX)
  private Integer smogReadabilityIndex;

  public ContentGenerationTextSummaryLiveResultInfo smogReadabilityIndex(Integer smogReadabilityIndex) {
    this.smogReadabilityIndex = smogReadabilityIndex;
    return this;
  }

  /**
   * SMOG Readability Index
   * @return smogReadabilityIndex
   */
  @javax.annotation.Nullable
  public Integer getSmogReadabilityIndex() {
    return smogReadabilityIndex;
  }

  public void setSmogReadabilityIndex(Integer smogReadabilityIndex) {
    this.smogReadabilityIndex = smogReadabilityIndex;
  }


  public static final String SERIALIZED_NAME_SPELLING_ERRORS = "spelling_errors";
  @SerializedName(SERIALIZED_NAME_SPELLING_ERRORS)
  private Integer spellingErrors;

  public ContentGenerationTextSummaryLiveResultInfo spellingErrors(Integer spellingErrors) {
    this.spellingErrors = spellingErrors;
    return this;
  }

  /**
   * number of spelling errors found in the target text
   * @return spellingErrors
   */
  @javax.annotation.Nullable
  public Integer getSpellingErrors() {
    return spellingErrors;
  }

  public void setSpellingErrors(Integer spellingErrors) {
    this.spellingErrors = spellingErrors;
  }


  public static final String SERIALIZED_NAME_GRAMMAR_ERRORS = "grammar_errors";
  @SerializedName(SERIALIZED_NAME_GRAMMAR_ERRORS)
  private Integer grammarErrors;

  public ContentGenerationTextSummaryLiveResultInfo grammarErrors(Integer grammarErrors) {
    this.grammarErrors = grammarErrors;
    return this;
  }

  /**
   * number of grammar errors found in the target text
   * @return grammarErrors
   */
  @javax.annotation.Nullable
  public Integer getGrammarErrors() {
    return grammarErrors;
  }

  public void setGrammarErrors(Integer grammarErrors) {
    this.grammarErrors = grammarErrors;
  }



  public ContentGenerationTextSummaryLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentGenerationTextSummaryLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentGenerationTextSummaryLiveResultInfo contentGenerationTextSummaryLiveResultInfo = (ContentGenerationTextSummaryLiveResultInfo) o;
    return

        Objects.equals(this.sentences, contentGenerationTextSummaryLiveResultInfo.sentences) &&
        Objects.equals(this.paragraphs, contentGenerationTextSummaryLiveResultInfo.paragraphs) &&
        Objects.equals(this.words, contentGenerationTextSummaryLiveResultInfo.words) &&
        Objects.equals(this.charactersWithoutSpaces, contentGenerationTextSummaryLiveResultInfo.charactersWithoutSpaces) &&
        Objects.equals(this.charactersWithSpaces, contentGenerationTextSummaryLiveResultInfo.charactersWithSpaces) &&
        Objects.equals(this.wordsPerSentence, contentGenerationTextSummaryLiveResultInfo.wordsPerSentence) &&
        Objects.equals(this.charactersPerWord, contentGenerationTextSummaryLiveResultInfo.charactersPerWord) &&
        Objects.equals(this.vocabularyDensity, contentGenerationTextSummaryLiveResultInfo.vocabularyDensity) &&
        Objects.equals(this.keywordDensity, contentGenerationTextSummaryLiveResultInfo.keywordDensity) &&
        Objects.equals(this.automatedReadabilityIndex, contentGenerationTextSummaryLiveResultInfo.automatedReadabilityIndex) &&
        Objects.equals(this.colemanLiauIndex, contentGenerationTextSummaryLiveResultInfo.colemanLiauIndex) &&
        Objects.equals(this.fleschKincaidGradeLevel, contentGenerationTextSummaryLiveResultInfo.fleschKincaidGradeLevel) &&
        Objects.equals(this.smogReadabilityIndex, contentGenerationTextSummaryLiveResultInfo.smogReadabilityIndex) &&
        Objects.equals(this.spellingErrors, contentGenerationTextSummaryLiveResultInfo.spellingErrors) &&
        Objects.equals(this.grammarErrors, contentGenerationTextSummaryLiveResultInfo.grammarErrors);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(sentences, paragraphs, words, charactersWithoutSpaces, charactersWithSpaces, wordsPerSentence, charactersPerWord, vocabularyDensity, keywordDensity, automatedReadabilityIndex, colemanLiauIndex, fleschKincaidGradeLevel, smogReadabilityIndex, spellingErrors, grammarErrors);
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
    sb.append("class ContentGenerationTextSummaryLiveResultInfo {\n");

    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
    sb.append("    charactersWithoutSpaces: ").append(toIndentedString(charactersWithoutSpaces)).append("\n");
    sb.append("    charactersWithSpaces: ").append(toIndentedString(charactersWithSpaces)).append("\n");
    sb.append("    wordsPerSentence: ").append(toIndentedString(wordsPerSentence)).append("\n");
    sb.append("    charactersPerWord: ").append(toIndentedString(charactersPerWord)).append("\n");
    sb.append("    vocabularyDensity: ").append(toIndentedString(vocabularyDensity)).append("\n");
    sb.append("    keywordDensity: ").append(toIndentedString(keywordDensity)).append("\n");
    sb.append("    automatedReadabilityIndex: ").append(toIndentedString(automatedReadabilityIndex)).append("\n");
    sb.append("    colemanLiauIndex: ").append(toIndentedString(colemanLiauIndex)).append("\n");
    sb.append("    fleschKincaidGradeLevel: ").append(toIndentedString(fleschKincaidGradeLevel)).append("\n");
    sb.append("    smogReadabilityIndex: ").append(toIndentedString(smogReadabilityIndex)).append("\n");
    sb.append("    spellingErrors: ").append(toIndentedString(spellingErrors)).append("\n");
    sb.append("    grammarErrors: ").append(toIndentedString(grammarErrors)).append("\n");
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
    
    openapiFields.add("sentences");
    
    openapiFields.add("paragraphs");
    
    openapiFields.add("words");
    
    openapiFields.add("characters_without_spaces");
    
    openapiFields.add("characters_with_spaces");
    
    openapiFields.add("words_per_sentence");
    
    openapiFields.add("characters_per_word");
    
    openapiFields.add("vocabulary_density");
    
    openapiFields.add("keyword_density");
    
    openapiFields.add("automated_readability_index");
    
    openapiFields.add("coleman_liau_index");
    
    openapiFields.add("flesch_kincaid_grade_level");
    
    openapiFields.add("smog_readability_index");
    
    openapiFields.add("spelling_errors");
    
    openapiFields.add("grammar_errors");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentGenerationTextSummaryLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentGenerationTextSummaryLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentGenerationTextSummaryLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentGenerationTextSummaryLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentGenerationTextSummaryLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentGenerationTextSummaryLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, ContentGenerationTextSummaryLiveResultInfo value) throws IOException {
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
           public ContentGenerationTextSummaryLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentGenerationTextSummaryLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentGenerationTextSummaryLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentGenerationTextSummaryLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}