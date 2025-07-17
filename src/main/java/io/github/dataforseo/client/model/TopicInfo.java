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



public class TopicInfo  {


  public static final String SERIALIZED_NAME_H_TITLE = "h_title";
  @SerializedName(SERIALIZED_NAME_H_TITLE)
  private String hTitle;

  public TopicInfo hTitle(String hTitle) {
    this.hTitle = hTitle;
    return this;
  }

  /**
   * meta title
   * @return hTitle
   */
  @javax.annotation.Nullable
  public String getHTitle() {
    return hTitle;
  }

  public void setHTitle(String hTitle) {
    this.hTitle = hTitle;
  }


  public static final String SERIALIZED_NAME_MAIN_TITLE = "main_title";
  @SerializedName(SERIALIZED_NAME_MAIN_TITLE)
  private String mainTitle;

  public TopicInfo mainTitle(String mainTitle) {
    this.mainTitle = mainTitle;
    return this;
  }

  /**
   * main title of the block
   * @return mainTitle
   */
  @javax.annotation.Nullable
  public String getMainTitle() {
    return mainTitle;
  }

  public void setMainTitle(String mainTitle) {
    this.mainTitle = mainTitle;
  }


  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public TopicInfo author(String author) {
    this.author = author;
    return this;
  }

  /**
   * content author name
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public TopicInfo language(String language) {
    this.language = language;
    return this;
  }

  /**
   * content language
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public TopicInfo level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * HTML level
   * @return level
   */
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public static final String SERIALIZED_NAME_PRIMARY_CONTENT = "primary_content";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CONTENT)
  private List<SectionContentItemInfo> primaryContent;

  public TopicInfo primaryContent(List<SectionContentItemInfo> primaryContent) {
    this.primaryContent = primaryContent;
    return this;
  }

  /**
   * primary content on the page
* you can find more information about content priority calculation in this help center article
   * @return primaryContent
   */
  @javax.annotation.Nullable
  public List<SectionContentItemInfo> getPrimaryContent() {
    return primaryContent;
  }

  public void setPrimaryContent(List<SectionContentItemInfo> primaryContent) {
    this.primaryContent = primaryContent;
  }


  public static final String SERIALIZED_NAME_SECONDARY_CONTENT = "secondary_content";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CONTENT)
  private List<SectionContentItemInfo> secondaryContent;

  public TopicInfo secondaryContent(List<SectionContentItemInfo> secondaryContent) {
    this.secondaryContent = secondaryContent;
    return this;
  }

  /**
   * secondary content on the page
* you can find more information about content priority calculation in this help center article
   * @return secondaryContent
   */
  @javax.annotation.Nullable
  public List<SectionContentItemInfo> getSecondaryContent() {
    return secondaryContent;
  }

  public void setSecondaryContent(List<SectionContentItemInfo> secondaryContent) {
    this.secondaryContent = secondaryContent;
  }


  public static final String SERIALIZED_NAME_TABLE_CONTENT = "table_content";
  @SerializedName(SERIALIZED_NAME_TABLE_CONTENT)
  private List<TableContentInfo> tableContent;

  public TopicInfo tableContent(List<TableContentInfo> tableContent) {
    this.tableContent = tableContent;
    return this;
  }

  /**
   * content of the table on the page
   * @return tableContent
   */
  @javax.annotation.Nullable
  public List<TableContentInfo> getTableContent() {
    return tableContent;
  }

  public void setTableContent(List<TableContentInfo> tableContent) {
    this.tableContent = tableContent;
  }



  public TopicInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public TopicInfo putAdditionalProperty(String key, Object value) {
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


    
    TopicInfo topicInfo = (TopicInfo) o;
    return

        Objects.equals(this.hTitle, topicInfo.hTitle) &&
        Objects.equals(this.mainTitle, topicInfo.mainTitle) &&
        Objects.equals(this.author, topicInfo.author) &&
        Objects.equals(this.language, topicInfo.language) &&
        Objects.equals(this.level, topicInfo.level) &&
        Objects.equals(this.primaryContent, topicInfo.primaryContent) &&
        Objects.equals(this.secondaryContent, topicInfo.secondaryContent) &&
        Objects.equals(this.tableContent, topicInfo.tableContent);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(hTitle, mainTitle, author, language, level, primaryContent, secondaryContent, tableContent);
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
    sb.append("class TopicInfo {\n");

    sb.append("    hTitle: ").append(toIndentedString(hTitle)).append("\n");
    sb.append("    mainTitle: ").append(toIndentedString(mainTitle)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    primaryContent: ").append(toIndentedString(primaryContent)).append("\n");
    sb.append("    secondaryContent: ").append(toIndentedString(secondaryContent)).append("\n");
    sb.append("    tableContent: ").append(toIndentedString(tableContent)).append("\n");
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
    
    openapiFields.add("h_title");
    
    openapiFields.add("main_title");
    
    openapiFields.add("author");
    
    openapiFields.add("language");
    
    openapiFields.add("level");
    
    openapiFields.add("primary_content");
    
    openapiFields.add("secondary_content");
    
    openapiFields.add("table_content");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopicInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopicInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopicInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopicInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopicInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TopicInfo>() {
           @Override
           public void write(JsonWriter out, TopicInfo value) throws IOException {
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
           public TopicInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TopicInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static TopicInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopicInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}