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



public class AiModeAiOverviewExpandedComponent  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AiModeAiOverviewExpandedComponent type(String type) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AiModeAiOverviewExpandedComponent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * reference page title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public AiModeAiOverviewExpandedComponent text(String text) {
    this.text = text;
    return this;
  }

  /**
   * additional text of the element in SERP
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public static final String SERIALIZED_NAME_MARKDOWN = "markdown";
  @SerializedName(SERIALIZED_NAME_MARKDOWN)
  private String markdown;

  public AiModeAiOverviewExpandedComponent markdown(String markdown) {
    this.markdown = markdown;
    return this;
  }

  /**
   * content of the element in markdown format
   * @return markdown
   */
  @javax.annotation.Nullable
  public String getMarkdown() {
    return markdown;
  }

  public void setMarkdown(String markdown) {
    this.markdown = markdown;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AiModeImagesElement> images;

  public AiModeAiOverviewExpandedComponent images(List<AiModeImagesElement> images) {
    this.images = images;
    return this;
  }

  /**
   * images of the component
* if there are none, equals null
   * @return images
   */
  @javax.annotation.Nullable
  public List<AiModeImagesElement> getImages() {
    return images;
  }

  public void setImages(List<AiModeImagesElement> images) {
    this.images = images;
  }


  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<InformationAndTicketsElement> links;

  public AiModeAiOverviewExpandedComponent links(List<InformationAndTicketsElement> links) {
    this.links = links;
    return this;
  }

  /**
   * sitelinks
* the links shown below some of Google’s search results
* if there are none, equals null
   * @return links
   */
  @javax.annotation.Nullable
  public List<InformationAndTicketsElement> getLinks() {
    return links;
  }

  public void setLinks(List<InformationAndTicketsElement> links) {
    this.links = links;
  }


  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private List<AiAiOverviewReferenceInfo> references;

  public AiModeAiOverviewExpandedComponent references(List<AiAiOverviewReferenceInfo> references) {
    this.references = references;
    return this;
  }

  /**
   * references relevant to the element
* includes references to webpages that were used to generate the ai_overview_element
   * @return references
   */
  @javax.annotation.Nullable
  public List<AiAiOverviewReferenceInfo> getReferences() {
    return references;
  }

  public void setReferences(List<AiAiOverviewReferenceInfo> references) {
    this.references = references;
  }



  public AiModeAiOverviewExpandedComponent() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiModeAiOverviewExpandedComponent putAdditionalProperty(String key, Object value) {
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


    
    AiModeAiOverviewExpandedComponent aiModeAiOverviewExpandedComponent = (AiModeAiOverviewExpandedComponent) o;
    return

        Objects.equals(this.type, aiModeAiOverviewExpandedComponent.type) &&
        Objects.equals(this.title, aiModeAiOverviewExpandedComponent.title) &&
        Objects.equals(this.text, aiModeAiOverviewExpandedComponent.text) &&
        Objects.equals(this.markdown, aiModeAiOverviewExpandedComponent.markdown) &&
        Objects.equals(this.images, aiModeAiOverviewExpandedComponent.images) &&
        Objects.equals(this.links, aiModeAiOverviewExpandedComponent.links) &&
        Objects.equals(this.references, aiModeAiOverviewExpandedComponent.references);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, title, text, markdown, images, links, references);
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
    sb.append("class AiModeAiOverviewExpandedComponent {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("text");
    
    openapiFields.add("markdown");
    
    openapiFields.add("images");
    
    openapiFields.add("links");
    
    openapiFields.add("references");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiModeAiOverviewExpandedComponent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiModeAiOverviewExpandedComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiModeAiOverviewExpandedComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiModeAiOverviewExpandedComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiModeAiOverviewExpandedComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<AiModeAiOverviewExpandedComponent>() {
           @Override
           public void write(JsonWriter out, AiModeAiOverviewExpandedComponent value) throws IOException {
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
           public AiModeAiOverviewExpandedComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiModeAiOverviewExpandedComponent instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiModeAiOverviewExpandedComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiModeAiOverviewExpandedComponent.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}