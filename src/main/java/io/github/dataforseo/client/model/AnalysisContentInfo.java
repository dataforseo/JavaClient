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



public class AnalysisContentInfo  {


  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public AnalysisContentInfo contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * type of content
* example:
* page_content, comment
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AnalysisContentInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the result
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_MAIN_TITLE = "main_title";
  @SerializedName(SERIALIZED_NAME_MAIN_TITLE)
  private String mainTitle;

  public AnalysisContentInfo mainTitle(String mainTitle) {
    this.mainTitle = mainTitle;
    return this;
  }

  /**
   * page title
   * @return mainTitle
   */
  @javax.annotation.Nullable
  public String getMainTitle() {
    return mainTitle;
  }

  public void setMainTitle(String mainTitle) {
    this.mainTitle = mainTitle;
  }


  public static final String SERIALIZED_NAME_PREVIOUS_TITLE = "previous_title";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TITLE)
  private String previousTitle;

  public AnalysisContentInfo previousTitle(String previousTitle) {
    this.previousTitle = previousTitle;
    return this;
  }

  /**
   * title of the previous content block
   * @return previousTitle
   */
  @javax.annotation.Nullable
  public String getPreviousTitle() {
    return previousTitle;
  }

  public void setPreviousTitle(String previousTitle) {
    this.previousTitle = previousTitle;
  }


  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public AnalysisContentInfo level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * title heading level
* indicates h-tag level from 1 (top) to 6 (bottom)
   * @return level
   */
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public AnalysisContentInfo author(String author) {
    this.author = author;
    return this;
  }

  /**
   * author of the content
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public AnalysisContentInfo snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * content snippet
   * @return snippet
   */
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public static final String SERIALIZED_NAME_SNIPPET_LENGTH = "snippet_length";
  @SerializedName(SERIALIZED_NAME_SNIPPET_LENGTH)
  private Integer snippetLength;

  public AnalysisContentInfo snippetLength(Integer snippetLength) {
    this.snippetLength = snippetLength;
    return this;
  }

  /**
   * character length of the snippet
   * @return snippetLength
   */
  @javax.annotation.Nullable
  public Integer getSnippetLength() {
    return snippetLength;
  }

  public void setSnippetLength(Integer snippetLength) {
    this.snippetLength = snippetLength;
  }


  public static final String SERIALIZED_NAME_SOCIAL_METRICS = "social_metrics";
  @SerializedName(SERIALIZED_NAME_SOCIAL_METRICS)
  private List<SocialMetricsInfo> socialMetrics;

  public AnalysisContentInfo socialMetrics(List<SocialMetricsInfo> socialMetrics) {
    this.socialMetrics = socialMetrics;
    return this;
  }

  /**
   * social media engagement metrics
* data on social media interactions associated with the content based on website embeds developed and supported by social media platforms
   * @return socialMetrics
   */
  @javax.annotation.Nullable
  public List<SocialMetricsInfo> getSocialMetrics() {
    return socialMetrics;
  }

  public void setSocialMetrics(List<SocialMetricsInfo> socialMetrics) {
    this.socialMetrics = socialMetrics;
  }


  public static final String SERIALIZED_NAME_HIGHLIGHTED_TEXT = "highlighted_text";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHTED_TEXT)
  private String highlightedText;

  public AnalysisContentInfo highlightedText(String highlightedText) {
    this.highlightedText = highlightedText;
    return this;
  }

  /**
   * highlighted text from the snippet
   * @return highlightedText
   */
  @javax.annotation.Nullable
  public String getHighlightedText() {
    return highlightedText;
  }

  public void setHighlightedText(String highlightedText) {
    this.highlightedText = highlightedText;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public AnalysisContentInfo language(String language) {
    this.language = language;
    return this;
  }

  /**
   * content language
* to obtain a full list of available languages, refer to the Languages endpoint
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_SENTIMENT_CONNOTATIONS = "sentiment_connotations";
  @SerializedName(SERIALIZED_NAME_SENTIMENT_CONNOTATIONS)
  private Map<String, Long> sentimentConnotations;

  public AnalysisContentInfo sentimentConnotations(Map<String, Long> sentimentConnotations) {
    this.sentimentConnotations = sentimentConnotations;
    return this;
  }

  /**
   * sentiment connotations
* contains sentiments (emotional reactions) related to the given citation and probability index per each sentiment
* possible sentiment connotations: anger, happiness, love, sadness, share, fun
   * @return sentimentConnotations
   */
  @javax.annotation.Nullable
  public Map<String, Long> getSentimentConnotations() {
    return sentimentConnotations;
  }

  public void setSentimentConnotations(Map<String, Long> sentimentConnotations) {
    this.sentimentConnotations = sentimentConnotations;
  }


  public static final String SERIALIZED_NAME_CONNOTATION_TYPES = "connotation_types";
  @SerializedName(SERIALIZED_NAME_CONNOTATION_TYPES)
  private Map<String, Long> connotationTypes;

  public AnalysisContentInfo connotationTypes(Map<String, Long> connotationTypes) {
    this.connotationTypes = connotationTypes;
    return this;
  }

  /**
   * connotation types
* contains types of sentiments (sentiment polarity) related to the given citation and probability index per each sentiment type
* possible sentiment connotation types: positive, negative, neutral
   * @return connotationTypes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getConnotationTypes() {
    return connotationTypes;
  }

  public void setConnotationTypes(Map<String, Long> connotationTypes) {
    this.connotationTypes = connotationTypes;
  }


  public static final String SERIALIZED_NAME_TEXT_CATEGORY = "text_category";
  @SerializedName(SERIALIZED_NAME_TEXT_CATEGORY)
  private List<Integer> textCategory;

  public AnalysisContentInfo textCategory(List<Integer> textCategory) {
    this.textCategory = textCategory;
    return this;
  }

  /**
   * text category
* to obtain a full list of available categories, refer to the Categories endpoint
   * @return textCategory
   */
  @javax.annotation.Nullable
  public List<Integer> getTextCategory() {
    return textCategory;
  }

  public void setTextCategory(List<Integer> textCategory) {
    this.textCategory = textCategory;
  }


  public static final String SERIALIZED_NAME_DATE_PUBLISHED = "date_published";
  @SerializedName(SERIALIZED_NAME_DATE_PUBLISHED)
  private String datePublished;

  public AnalysisContentInfo datePublished(String datePublished) {
    this.datePublished = datePublished;
    return this;
  }

  /**
   * date and time when the content was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return datePublished
   */
  @javax.annotation.Nullable
  public String getDatePublished() {
    return datePublished;
  }

  public void setDatePublished(String datePublished) {
    this.datePublished = datePublished;
  }


  public static final String SERIALIZED_NAME_CONTENT_QUALITY_SCORE = "content_quality_score";
  @SerializedName(SERIALIZED_NAME_CONTENT_QUALITY_SCORE)
  private Integer contentQualityScore;

  public AnalysisContentInfo contentQualityScore(Integer contentQualityScore) {
    this.contentQualityScore = contentQualityScore;
    return this;
  }

  /**
   * content quality score
* this value is calculated based on the number of words, sentences and characters the content contains
   * @return contentQualityScore
   */
  @javax.annotation.Nullable
  public Integer getContentQualityScore() {
    return contentQualityScore;
  }

  public void setContentQualityScore(Integer contentQualityScore) {
    this.contentQualityScore = contentQualityScore;
  }


  public static final String SERIALIZED_NAME_SEMANTIC_LOCATION = "semantic_location";
  @SerializedName(SERIALIZED_NAME_SEMANTIC_LOCATION)
  private String semanticLocation;

  public AnalysisContentInfo semanticLocation(String semanticLocation) {
    this.semanticLocation = semanticLocation;
    return this;
  }

  /**
   * semantic location
* indicates semantic element in HTML where the target keyword citation is located
* example:
* article, header
   * @return semanticLocation
   */
  @javax.annotation.Nullable
  public String getSemanticLocation() {
    return semanticLocation;
  }

  public void setSemanticLocation(String semanticLocation) {
    this.semanticLocation = semanticLocation;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private ContentRatingInfo rating;

  public AnalysisContentInfo rating(ContentRatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * content rating
* rating related to content_info
   * @return rating
   */
  @javax.annotation.Nullable
  public ContentRatingInfo getRating() {
    return rating;
  }

  public void setRating(ContentRatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_GROUP_DATE = "group_date";
  @SerializedName(SERIALIZED_NAME_GROUP_DATE)
  private String groupDate;

  public AnalysisContentInfo groupDate(String groupDate) {
    this.groupDate = groupDate;
    return this;
  }

  /**
   * citation group date and time
* indicates content publication date or date and time when our crawler visited the page for the first time;
* this field can be used to group citations by date and display citation trends;
* date and time are provided in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return groupDate
   */
  @javax.annotation.Nullable
  public String getGroupDate() {
    return groupDate;
  }

  public void setGroupDate(String groupDate) {
    this.groupDate = groupDate;
  }



  public AnalysisContentInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AnalysisContentInfo putAdditionalProperty(String key, Object value) {
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


    
    AnalysisContentInfo analysisContentInfo = (AnalysisContentInfo) o;
    return

        Objects.equals(this.contentType, analysisContentInfo.contentType) &&
        Objects.equals(this.title, analysisContentInfo.title) &&
        Objects.equals(this.mainTitle, analysisContentInfo.mainTitle) &&
        Objects.equals(this.previousTitle, analysisContentInfo.previousTitle) &&
        Objects.equals(this.level, analysisContentInfo.level) &&
        Objects.equals(this.author, analysisContentInfo.author) &&
        Objects.equals(this.snippet, analysisContentInfo.snippet) &&
        Objects.equals(this.snippetLength, analysisContentInfo.snippetLength) &&
        Objects.equals(this.socialMetrics, analysisContentInfo.socialMetrics) &&
        Objects.equals(this.highlightedText, analysisContentInfo.highlightedText) &&
        Objects.equals(this.language, analysisContentInfo.language) &&
        Objects.equals(this.sentimentConnotations, analysisContentInfo.sentimentConnotations) &&
        Objects.equals(this.connotationTypes, analysisContentInfo.connotationTypes) &&
        Objects.equals(this.textCategory, analysisContentInfo.textCategory) &&
        Objects.equals(this.datePublished, analysisContentInfo.datePublished) &&
        Objects.equals(this.contentQualityScore, analysisContentInfo.contentQualityScore) &&
        Objects.equals(this.semanticLocation, analysisContentInfo.semanticLocation) &&
        Objects.equals(this.rating, analysisContentInfo.rating) &&
        Objects.equals(this.groupDate, analysisContentInfo.groupDate);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(contentType, title, mainTitle, previousTitle, level, author, snippet, snippetLength, socialMetrics, highlightedText, language, sentimentConnotations, connotationTypes, textCategory, datePublished, contentQualityScore, semanticLocation, rating, groupDate);
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
    sb.append("class AnalysisContentInfo {\n");

    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    mainTitle: ").append(toIndentedString(mainTitle)).append("\n");
    sb.append("    previousTitle: ").append(toIndentedString(previousTitle)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    snippetLength: ").append(toIndentedString(snippetLength)).append("\n");
    sb.append("    socialMetrics: ").append(toIndentedString(socialMetrics)).append("\n");
    sb.append("    highlightedText: ").append(toIndentedString(highlightedText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    sentimentConnotations: ").append(toIndentedString(sentimentConnotations)).append("\n");
    sb.append("    connotationTypes: ").append(toIndentedString(connotationTypes)).append("\n");
    sb.append("    textCategory: ").append(toIndentedString(textCategory)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    contentQualityScore: ").append(toIndentedString(contentQualityScore)).append("\n");
    sb.append("    semanticLocation: ").append(toIndentedString(semanticLocation)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    groupDate: ").append(toIndentedString(groupDate)).append("\n");
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
    
    openapiFields.add("content_type");
    
    openapiFields.add("title");
    
    openapiFields.add("main_title");
    
    openapiFields.add("previous_title");
    
    openapiFields.add("level");
    
    openapiFields.add("author");
    
    openapiFields.add("snippet");
    
    openapiFields.add("snippet_length");
    
    openapiFields.add("social_metrics");
    
    openapiFields.add("highlighted_text");
    
    openapiFields.add("language");
    
    openapiFields.add("sentiment_connotations");
    
    openapiFields.add("connotation_types");
    
    openapiFields.add("text_category");
    
    openapiFields.add("date_published");
    
    openapiFields.add("content_quality_score");
    
    openapiFields.add("semantic_location");
    
    openapiFields.add("rating");
    
    openapiFields.add("group_date");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnalysisContentInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalysisContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalysisContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalysisContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalysisContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalysisContentInfo>() {
           @Override
           public void write(JsonWriter out, AnalysisContentInfo value) throws IOException {
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
           public AnalysisContentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AnalysisContentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AnalysisContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalysisContentInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}