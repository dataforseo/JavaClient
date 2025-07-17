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



public class BacklinksPageMeta  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public BacklinksPageMeta title(String title) {
    this.title = title;
    return this;
  }

  /**
   * page title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_CANONICAL = "canonical";
  @SerializedName(SERIALIZED_NAME_CANONICAL)
  private String canonical;

  public BacklinksPageMeta canonical(String canonical) {
    this.canonical = canonical;
    return this;
  }

  /**
   * canonical page
   * @return canonical
   */
  @javax.annotation.Nullable
  public String getCanonical() {
    return canonical;
  }

  public void setCanonical(String canonical) {
    this.canonical = canonical;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LINKS_COUNT = "internal_links_count";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LINKS_COUNT)
  private Long internalLinksCount;

  public BacklinksPageMeta internalLinksCount(Long internalLinksCount) {
    this.internalLinksCount = internalLinksCount;
    return this;
  }

  /**
   * number of internal links on the page
   * @return internalLinksCount
   */
  @javax.annotation.Nullable
  public Long getInternalLinksCount() {
    return internalLinksCount;
  }

  public void setInternalLinksCount(Long internalLinksCount) {
    this.internalLinksCount = internalLinksCount;
  }


  public static final String SERIALIZED_NAME_EXTERNAL_LINKS_COUNT = "external_links_count";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LINKS_COUNT)
  private Long externalLinksCount;

  public BacklinksPageMeta externalLinksCount(Long externalLinksCount) {
    this.externalLinksCount = externalLinksCount;
    return this;
  }

  /**
   * number of external links on the page
   * @return externalLinksCount
   */
  @javax.annotation.Nullable
  public Long getExternalLinksCount() {
    return externalLinksCount;
  }

  public void setExternalLinksCount(Long externalLinksCount) {
    this.externalLinksCount = externalLinksCount;
  }


  public static final String SERIALIZED_NAME_IMAGES_COUNT = "images_count";
  @SerializedName(SERIALIZED_NAME_IMAGES_COUNT)
  private Long imagesCount;

  public BacklinksPageMeta imagesCount(Long imagesCount) {
    this.imagesCount = imagesCount;
    return this;
  }

  /**
   * number of images on the page
   * @return imagesCount
   */
  @javax.annotation.Nullable
  public Long getImagesCount() {
    return imagesCount;
  }

  public void setImagesCount(Long imagesCount) {
    this.imagesCount = imagesCount;
  }


  public static final String SERIALIZED_NAME_WORDS_COUNT = "words_count";
  @SerializedName(SERIALIZED_NAME_WORDS_COUNT)
  private Long wordsCount;

  public BacklinksPageMeta wordsCount(Long wordsCount) {
    this.wordsCount = wordsCount;
    return this;
  }

  /**
   * number of words on the page
   * @return wordsCount
   */
  @javax.annotation.Nullable
  public Long getWordsCount() {
    return wordsCount;
  }

  public void setWordsCount(Long wordsCount) {
    this.wordsCount = wordsCount;
  }


  public static final String SERIALIZED_NAME_PAGE_SPAM_SCORE = "page_spam_score";
  @SerializedName(SERIALIZED_NAME_PAGE_SPAM_SCORE)
  private Integer pageSpamScore;

  public BacklinksPageMeta pageSpamScore(Integer pageSpamScore) {
    this.pageSpamScore = pageSpamScore;
    return this;
  }

  /**
   * spam score of the page
* learn more about how the metric is calculated on this help center page
   * @return pageSpamScore
   */
  @javax.annotation.Nullable
  public Integer getPageSpamScore() {
    return pageSpamScore;
  }

  public void setPageSpamScore(Integer pageSpamScore) {
    this.pageSpamScore = pageSpamScore;
  }


  public static final String SERIALIZED_NAME_SOCIAL_MEDIA_TAGS = "social_media_tags";
  @SerializedName(SERIALIZED_NAME_SOCIAL_MEDIA_TAGS)
  private Map<String, String> socialMediaTags;

  public BacklinksPageMeta socialMediaTags(Map<String, String> socialMediaTags) {
    this.socialMediaTags = socialMediaTags;
    return this;
  }

  /**
   * array of social media tags found on the page
* contains social media tags and their content
* supported tags include but are not limited to Open Graph and Twitter card
   * @return socialMediaTags
   */
  @javax.annotation.Nullable
  public Map<String, String> getSocialMediaTags() {
    return socialMediaTags;
  }

  public void setSocialMediaTags(Map<String, String> socialMediaTags) {
    this.socialMediaTags = socialMediaTags;
  }


  public static final String SERIALIZED_NAME_H1 = "h1";
  @SerializedName(SERIALIZED_NAME_H1)
  private List<String> h1;

  public BacklinksPageMeta h1(List<String> h1) {
    this.h1 = h1;
    return this;
  }

  /**
   * h1 tag
* content of h1 tags
   * @return h1
   */
  @javax.annotation.Nullable
  public List<String> getH1() {
    return h1;
  }

  public void setH1(List<String> h1) {
    this.h1 = h1;
  }


  public static final String SERIALIZED_NAME_H2 = "h2";
  @SerializedName(SERIALIZED_NAME_H2)
  private List<String> h2;

  public BacklinksPageMeta h2(List<String> h2) {
    this.h2 = h2;
    return this;
  }

  /**
   * h2 tag
* content of h2 tags
   * @return h2
   */
  @javax.annotation.Nullable
  public List<String> getH2() {
    return h2;
  }

  public void setH2(List<String> h2) {
    this.h2 = h2;
  }


  public static final String SERIALIZED_NAME_H3 = "h3";
  @SerializedName(SERIALIZED_NAME_H3)
  private List<String> h3;

  public BacklinksPageMeta h3(List<String> h3) {
    this.h3 = h3;
    return this;
  }

  /**
   * h3 tag
* content of h3 tags
   * @return h3
   */
  @javax.annotation.Nullable
  public List<String> getH3() {
    return h3;
  }

  public void setH3(List<String> h3) {
    this.h3 = h3;
  }


  public static final String SERIALIZED_NAME_IMAGES_ALT = "images_alt";
  @SerializedName(SERIALIZED_NAME_IMAGES_ALT)
  private List<String> imagesAlt;

  public BacklinksPageMeta imagesAlt(List<String> imagesAlt) {
    this.imagesAlt = imagesAlt;
    return this;
  }

  /**
   * content of alt tags
   * @return imagesAlt
   */
  @javax.annotation.Nullable
  public List<String> getImagesAlt() {
    return imagesAlt;
  }

  public void setImagesAlt(List<String> imagesAlt) {
    this.imagesAlt = imagesAlt;
  }


  public static final String SERIALIZED_NAME_POWERED_BY = "powered_by";
  @SerializedName(SERIALIZED_NAME_POWERED_BY)
  private List<String> poweredBy;

  public BacklinksPageMeta poweredBy(List<String> poweredBy) {
    this.poweredBy = poweredBy;
    return this;
  }

  /**
   * CMS details
   * @return poweredBy
   */
  @javax.annotation.Nullable
  public List<String> getPoweredBy() {
    return poweredBy;
  }

  public void setPoweredBy(List<String> poweredBy) {
    this.poweredBy = poweredBy;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public BacklinksPageMeta language(String language) {
    this.language = language;
    return this;
  }

  /**
   * page content language
* example:
* en
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public BacklinksPageMeta charset(String charset) {
    this.charset = charset;
    return this;
  }

  /**
   * character encoding
* examples:
* utf-8
   * @return charset
   */
  @javax.annotation.Nullable
  public String getCharset() {
    return charset;
  }

  public void setCharset(String charset) {
    this.charset = charset;
  }


  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private List<String> platformType;

  public BacklinksPageMeta platformType(List<String> platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * type of a platform
   * @return platformType
   */
  @javax.annotation.Nullable
  public List<String> getPlatformType() {
    return platformType;
  }

  public void setPlatformType(List<String> platformType) {
    this.platformType = platformType;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private Map<String, String> technologies;

  public BacklinksPageMeta technologies(Map<String, String> technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * website technologies
   * @return technologies
   */
  @javax.annotation.Nullable
  public Map<String, String> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(Map<String, String> technologies) {
    this.technologies = technologies;
  }



  public BacklinksPageMeta() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksPageMeta putAdditionalProperty(String key, Object value) {
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


    
    BacklinksPageMeta backlinksPageMeta = (BacklinksPageMeta) o;
    return

        Objects.equals(this.title, backlinksPageMeta.title) &&
        Objects.equals(this.canonical, backlinksPageMeta.canonical) &&
        Objects.equals(this.internalLinksCount, backlinksPageMeta.internalLinksCount) &&
        Objects.equals(this.externalLinksCount, backlinksPageMeta.externalLinksCount) &&
        Objects.equals(this.imagesCount, backlinksPageMeta.imagesCount) &&
        Objects.equals(this.wordsCount, backlinksPageMeta.wordsCount) &&
        Objects.equals(this.pageSpamScore, backlinksPageMeta.pageSpamScore) &&
        Objects.equals(this.socialMediaTags, backlinksPageMeta.socialMediaTags) &&
        Objects.equals(this.h1, backlinksPageMeta.h1) &&
        Objects.equals(this.h2, backlinksPageMeta.h2) &&
        Objects.equals(this.h3, backlinksPageMeta.h3) &&
        Objects.equals(this.imagesAlt, backlinksPageMeta.imagesAlt) &&
        Objects.equals(this.poweredBy, backlinksPageMeta.poweredBy) &&
        Objects.equals(this.language, backlinksPageMeta.language) &&
        Objects.equals(this.charset, backlinksPageMeta.charset) &&
        Objects.equals(this.platformType, backlinksPageMeta.platformType) &&
        Objects.equals(this.technologies, backlinksPageMeta.technologies);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, canonical, internalLinksCount, externalLinksCount, imagesCount, wordsCount, pageSpamScore, socialMediaTags, h1, h2, h3, imagesAlt, poweredBy, language, charset, platformType, technologies);
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
    sb.append("class BacklinksPageMeta {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    internalLinksCount: ").append(toIndentedString(internalLinksCount)).append("\n");
    sb.append("    externalLinksCount: ").append(toIndentedString(externalLinksCount)).append("\n");
    sb.append("    imagesCount: ").append(toIndentedString(imagesCount)).append("\n");
    sb.append("    wordsCount: ").append(toIndentedString(wordsCount)).append("\n");
    sb.append("    pageSpamScore: ").append(toIndentedString(pageSpamScore)).append("\n");
    sb.append("    socialMediaTags: ").append(toIndentedString(socialMediaTags)).append("\n");
    sb.append("    h1: ").append(toIndentedString(h1)).append("\n");
    sb.append("    h2: ").append(toIndentedString(h2)).append("\n");
    sb.append("    h3: ").append(toIndentedString(h3)).append("\n");
    sb.append("    imagesAlt: ").append(toIndentedString(imagesAlt)).append("\n");
    sb.append("    poweredBy: ").append(toIndentedString(poweredBy)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("canonical");
    
    openapiFields.add("internal_links_count");
    
    openapiFields.add("external_links_count");
    
    openapiFields.add("images_count");
    
    openapiFields.add("words_count");
    
    openapiFields.add("page_spam_score");
    
    openapiFields.add("social_media_tags");
    
    openapiFields.add("h1");
    
    openapiFields.add("h2");
    
    openapiFields.add("h3");
    
    openapiFields.add("images_alt");
    
    openapiFields.add("powered_by");
    
    openapiFields.add("language");
    
    openapiFields.add("charset");
    
    openapiFields.add("platform_type");
    
    openapiFields.add("technologies");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksPageMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksPageMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksPageMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksPageMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksPageMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksPageMeta>() {
           @Override
           public void write(JsonWriter out, BacklinksPageMeta value) throws IOException {
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
           public BacklinksPageMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksPageMeta instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksPageMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksPageMeta.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}