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



public class ContentParsingElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ContentParsingElement type(String type) {
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


  public static final String SERIALIZED_NAME_FETCH_TIME = "fetch_time";
  @SerializedName(SERIALIZED_NAME_FETCH_TIME)
  private String fetchTime;

  public ContentParsingElement fetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
    return this;
  }

  /**
   * date and time when the content was fethced
* example:
* '2022-11-01 10:02:52 +00:00'
   * @return fetchTime
   */
  @javax.annotation.Nullable
  public String getFetchTime() {
    return fetchTime;
  }

  public void setFetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
  }


  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public ContentParsingElement statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * status code of the page
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public static final String SERIALIZED_NAME_PAGE_CONTENT = "page_content";
  @SerializedName(SERIALIZED_NAME_PAGE_CONTENT)
  private PageContentInfo pageContent;

  public ContentParsingElement pageContent(PageContentInfo pageContent) {
    this.pageContent = pageContent;
    return this;
  }

  /**
   * parsed content of the page
   * @return pageContent
   */
  @javax.annotation.Nullable
  public PageContentInfo getPageContent() {
    return pageContent;
  }

  public void setPageContent(PageContentInfo pageContent) {
    this.pageContent = pageContent;
  }


  public static final String SERIALIZED_NAME_PAGE_AS_MARKDOWN = "page_as_markdown";
  @SerializedName(SERIALIZED_NAME_PAGE_AS_MARKDOWN)
  private String pageAsMarkdown;

  public ContentParsingElement pageAsMarkdown(String pageAsMarkdown) {
    this.pageAsMarkdown = pageAsMarkdown;
    return this;
  }

  /**
   * page content in the markdown format
* page content in the text-to-HTML markdown format
* specify markdown_view as true in the request to return the value
   * @return pageAsMarkdown
   */
  @javax.annotation.Nullable
  public String getPageAsMarkdown() {
    return pageAsMarkdown;
  }

  public void setPageAsMarkdown(String pageAsMarkdown) {
    this.pageAsMarkdown = pageAsMarkdown;
  }



  public ContentParsingElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentParsingElement putAdditionalProperty(String key, Object value) {
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


    
    ContentParsingElement contentParsingElement = (ContentParsingElement) o;
    return

        Objects.equals(this.type, contentParsingElement.type) &&
        Objects.equals(this.fetchTime, contentParsingElement.fetchTime) &&
        Objects.equals(this.statusCode, contentParsingElement.statusCode) &&
        Objects.equals(this.pageContent, contentParsingElement.pageContent) &&
        Objects.equals(this.pageAsMarkdown, contentParsingElement.pageAsMarkdown);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, fetchTime, statusCode, pageContent, pageAsMarkdown);
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
    sb.append("class ContentParsingElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fetchTime: ").append(toIndentedString(fetchTime)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    pageContent: ").append(toIndentedString(pageContent)).append("\n");
    sb.append("    pageAsMarkdown: ").append(toIndentedString(pageAsMarkdown)).append("\n");
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
    
    openapiFields.add("fetch_time");
    
    openapiFields.add("status_code");
    
    openapiFields.add("page_content");
    
    openapiFields.add("page_as_markdown");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentParsingElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentParsingElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentParsingElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentParsingElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentParsingElement.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentParsingElement>() {
           @Override
           public void write(JsonWriter out, ContentParsingElement value) throws IOException {
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
           public ContentParsingElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentParsingElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentParsingElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentParsingElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}