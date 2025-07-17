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



public class SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo  {


  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * ID of the video received in a POST array
   * @return videoId
   */
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * search engine domain in a POST array
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results
* you can use it to make sure that we provided accurate results
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when the result was received
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public static final String SERIALIZED_NAME_SPELL = "spell";
  @SerializedName(SERIALIZED_NAME_SPELL)
  private SpellInfo spell;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo spell(SpellInfo spell) {
    this.spell = spell;
    return this;
  }

  /**
   * autocorrection of the search engine
* if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection
   * @return spell
   */
  @javax.annotation.Nullable
  public SpellInfo getSpell() {
    return spell;
  }

  public void setSpell(SpellInfo spell) {
    this.spell = spell;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * types of search results in SERP
* contains types of search results (items) found in SERP.
* possible item:
* youtube_subtitles
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_UNSUPPORTED_LANGUAGE = "unsupported_language";
  @SerializedName(SERIALIZED_NAME_UNSUPPORTED_LANGUAGE)
  private Boolean unsupportedLanguage;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo unsupportedLanguage(Boolean unsupportedLanguage) {
    this.unsupportedLanguage = unsupportedLanguage;
    return this;
  }

  /**
   * indicates whether the language is unsupported by the system
   * @return unsupportedLanguage
   */
  @javax.annotation.Nullable
  public Boolean getUnsupportedLanguage() {
    return unsupportedLanguage;
  }

  public void setUnsupportedLanguage(Boolean unsupportedLanguage) {
    this.unsupportedLanguage = unsupportedLanguage;
  }


  public static final String SERIALIZED_NAME_TRANSLATE_LANGUAGE = "translate_language";
  @SerializedName(SERIALIZED_NAME_TRANSLATE_LANGUAGE)
  private String translateLanguage;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo translateLanguage(String translateLanguage) {
    this.translateLanguage = translateLanguage;
    return this;
  }

  /**
   * language code of translated text
   * @return translateLanguage
   */
  @javax.annotation.Nullable
  public String getTranslateLanguage() {
    return translateLanguage;
  }

  public void setTranslateLanguage(String translateLanguage) {
    this.translateLanguage = translateLanguage;
  }


  public static final String SERIALIZED_NAME_ORIGIN_LANGUAGE = "origin_language";
  @SerializedName(SERIALIZED_NAME_ORIGIN_LANGUAGE)
  private String originLanguage;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo originLanguage(String originLanguage) {
    this.originLanguage = originLanguage;
    return this;
  }

  /**
   * language code of original text
   * @return originLanguage
   */
  @javax.annotation.Nullable
  public String getOriginLanguage() {
    return originLanguage;
  }

  public void setOriginLanguage(String originLanguage) {
    this.originLanguage = originLanguage;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo category(String category) {
    this.category = category;
    return this;
  }

  /**
   * the category the video belongs to
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public static final String SERIALIZED_NAME_SUBTITLES_COUNT = "subtitles_count";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_COUNT)
  private Long subtitlesCount;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo subtitlesCount(Long subtitlesCount) {
    this.subtitlesCount = subtitlesCount;
    return this;
  }

  /**
   * number of subtitles in the video
   * @return subtitlesCount
   */
  @javax.annotation.Nullable
  public Long getSubtitlesCount() {
    return subtitlesCount;
  }

  public void setSubtitlesCount(Long subtitlesCount) {
    this.subtitlesCount = subtitlesCount;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the video
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * the number of results returned in the items array
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<YoutubeSubtitles> items;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo items(List<YoutubeSubtitles> items) {
    this.items = items;
    return this;
  }

  /**
   * elements of search results found in SERP
   * @return items
   */
  @javax.annotation.Nullable
  public List<YoutubeSubtitles> getItems() {
    return items;
  }

  public void setItems(List<YoutubeSubtitles> items) {
    this.items = items;
  }



  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo serpYoutubeVideoSubtitlesLiveAdvancedResultInfo = (SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo) o;
    return

        Objects.equals(this.videoId, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.videoId) &&
        Objects.equals(this.seDomain, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.seDomain) &&
        Objects.equals(this.locationCode, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.locationCode) &&
        Objects.equals(this.languageCode, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.languageCode) &&
        Objects.equals(this.checkUrl, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.checkUrl) &&
        Objects.equals(this.datetime, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.datetime) &&
        Objects.equals(this.spell, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.spell) &&
        Objects.equals(this.itemTypes, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.itemTypes) &&
        Objects.equals(this.unsupportedLanguage, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.unsupportedLanguage) &&
        Objects.equals(this.translateLanguage, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.translateLanguage) &&
        Objects.equals(this.originLanguage, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.originLanguage) &&
        Objects.equals(this.category, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.category) &&
        Objects.equals(this.subtitlesCount, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.subtitlesCount) &&
        Objects.equals(this.title, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.title) &&
        Objects.equals(this.itemsCount, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.itemsCount) &&
        Objects.equals(this.items, serpYoutubeVideoSubtitlesLiveAdvancedResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(videoId, seDomain, locationCode, languageCode, checkUrl, datetime, spell, itemTypes, unsupportedLanguage, translateLanguage, originLanguage, category, subtitlesCount, title, itemsCount, items);
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
    sb.append("class SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo {\n");

    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    spell: ").append(toIndentedString(spell)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    unsupportedLanguage: ").append(toIndentedString(unsupportedLanguage)).append("\n");
    sb.append("    translateLanguage: ").append(toIndentedString(translateLanguage)).append("\n");
    sb.append("    originLanguage: ").append(toIndentedString(originLanguage)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subtitlesCount: ").append(toIndentedString(subtitlesCount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    
    openapiFields.add("video_id");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("check_url");
    
    openapiFields.add("datetime");
    
    openapiFields.add("spell");
    
    openapiFields.add("item_types");
    
    openapiFields.add("unsupported_language");
    
    openapiFields.add("translate_language");
    
    openapiFields.add("origin_language");
    
    openapiFields.add("category");
    
    openapiFields.add("subtitles_count");
    
    openapiFields.add("title");
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo>() {
           @Override
           public void write(JsonWriter out, SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo value) throws IOException {
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
           public SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}