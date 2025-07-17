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



public class ContentCommentInfo  {


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private ContentRatingInfo rating;

  public ContentCommentInfo rating(ContentRatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * product’s rating
* contains information about the rating a customer has given to the product
   * @return rating
   */
  @javax.annotation.Nullable
  public ContentRatingInfo getRating() {
    return rating;
  }

  public void setRating(ContentRatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ContentCommentInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the customer’s comment
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_PUBLISH_DATE = "publish_date";
  @SerializedName(SERIALIZED_NAME_PUBLISH_DATE)
  private String publishDate;

  public ContentCommentInfo publishDate(String publishDate) {
    this.publishDate = publishDate;
    return this;
  }

  /**
   * date when the comment was published
   * @return publishDate
   */
  @javax.annotation.Nullable
  public String getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(String publishDate) {
    this.publishDate = publishDate;
  }


  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public ContentCommentInfo author(String author) {
    this.author = author;
    return this;
  }

  /**
   * author of the comment
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public static final String SERIALIZED_NAME_HAVE_FORM = "have_form";
  @SerializedName(SERIALIZED_NAME_HAVE_FORM)
  private Boolean haveForm;

  public ContentCommentInfo haveForm(Boolean haveForm) {
    this.haveForm = haveForm;
    return this;
  }

  /**
   * 
   * @return haveForm
   */
  @javax.annotation.Nullable
  public Boolean getHaveForm() {
    return haveForm;
  }

  public void setHaveForm(Boolean haveForm) {
    this.haveForm = haveForm;
  }


  public static final String SERIALIZED_NAME_PRIMARY_CONTENT = "primary_content";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CONTENT)
  private List<SectionContentItemInfo> primaryContent;

  public ContentCommentInfo primaryContent(List<SectionContentItemInfo> primaryContent) {
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



  public ContentCommentInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentCommentInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentCommentInfo contentCommentInfo = (ContentCommentInfo) o;
    return

        Objects.equals(this.rating, contentCommentInfo.rating) &&
        Objects.equals(this.title, contentCommentInfo.title) &&
        Objects.equals(this.publishDate, contentCommentInfo.publishDate) &&
        Objects.equals(this.author, contentCommentInfo.author) &&
        Objects.equals(this.haveForm, contentCommentInfo.haveForm) &&
        Objects.equals(this.primaryContent, contentCommentInfo.primaryContent);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(rating, title, publishDate, author, haveForm, primaryContent);
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
    sb.append("class ContentCommentInfo {\n");

    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    haveForm: ").append(toIndentedString(haveForm)).append("\n");
    sb.append("    primaryContent: ").append(toIndentedString(primaryContent)).append("\n");
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
    
    openapiFields.add("rating");
    
    openapiFields.add("title");
    
    openapiFields.add("publish_date");
    
    openapiFields.add("author");
    
    openapiFields.add("have_form");
    
    openapiFields.add("primary_content");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentCommentInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentCommentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentCommentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentCommentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentCommentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentCommentInfo>() {
           @Override
           public void write(JsonWriter out, ContentCommentInfo value) throws IOException {
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
           public ContentCommentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentCommentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentCommentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentCommentInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}