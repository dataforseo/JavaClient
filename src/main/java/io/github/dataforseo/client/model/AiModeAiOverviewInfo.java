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



public class AiModeAiOverviewInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AiModeAiOverviewInfo type(String type) {
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


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public AiModeAiOverviewInfo rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP
* position within a group of elements with identical type values
* positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public AiModeAiOverviewInfo rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public AiModeAiOverviewInfo page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * 
   * @return page
   */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public AiModeAiOverviewInfo position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in SERP
* can take the following values:
* left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public AiModeAiOverviewInfo xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public static final String SERIALIZED_NAME_MARKDOWN = "markdown";
  @SerializedName(SERIALIZED_NAME_MARKDOWN)
  private String markdown;

  public AiModeAiOverviewInfo markdown(String markdown) {
    this.markdown = markdown;
    return this;
  }

  /**
   * content of the element in markdown format
* the text of the ai_overview formatted in the markdown markup language
   * @return markdown
   */
  @javax.annotation.Nullable
  public String getMarkdown() {
    return markdown;
  }

  public void setMarkdown(String markdown) {
    this.markdown = markdown;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BaseSerpApiAiModeAiOverviewElementItem> items;

  public AiModeAiOverviewInfo items(List<BaseSerpApiAiModeAiOverviewElementItem> items) {
    this.items = items;
    return this;
  }

  /**
   * elements of search results found in SERP
   * @return items
   */
  @javax.annotation.Nullable
  public List<BaseSerpApiAiModeAiOverviewElementItem> getItems() {
    return items;
  }

  public void setItems(List<BaseSerpApiAiModeAiOverviewElementItem> items) {
    this.items = items;
  }


  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private List<AiModeAiOverviewReferenceInfo> references;

  public AiModeAiOverviewInfo references(List<AiModeAiOverviewReferenceInfo> references) {
    this.references = references;
    return this;
  }

  /**
   * additional references relevant to the item
* includes references to webpages that may have been used to generate the ai_overview
   * @return references
   */
  @javax.annotation.Nullable
  public List<AiModeAiOverviewReferenceInfo> getReferences() {
    return references;
  }

  public void setReferences(List<AiModeAiOverviewReferenceInfo> references) {
    this.references = references;
  }


  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private AiModeRectangleInfo rectangle;

  public AiModeAiOverviewInfo rectangle(AiModeRectangleInfo rectangle) {
    this.rectangle = rectangle;
    return this;
  }

  /**
   * rectangle parameters
* contains cartesian coordinates and pixel dimensions of the result’s snippet in SERP
* equals null if calculate_rectangles in the POST request is not set to true
   * @return rectangle
   */
  @javax.annotation.Nullable
  public AiModeRectangleInfo getRectangle() {
    return rectangle;
  }

  public void setRectangle(AiModeRectangleInfo rectangle) {
    this.rectangle = rectangle;
  }



  public AiModeAiOverviewInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiModeAiOverviewInfo putAdditionalProperty(String key, Object value) {
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


    
    AiModeAiOverviewInfo aiModeAiOverviewInfo = (AiModeAiOverviewInfo) o;
    return

        Objects.equals(this.type, aiModeAiOverviewInfo.type) &&
        Objects.equals(this.rankGroup, aiModeAiOverviewInfo.rankGroup) &&
        Objects.equals(this.rankAbsolute, aiModeAiOverviewInfo.rankAbsolute) &&
        Objects.equals(this.page, aiModeAiOverviewInfo.page) &&
        Objects.equals(this.position, aiModeAiOverviewInfo.position) &&
        Objects.equals(this.xpath, aiModeAiOverviewInfo.xpath) &&
        Objects.equals(this.markdown, aiModeAiOverviewInfo.markdown) &&
        Objects.equals(this.items, aiModeAiOverviewInfo.items) &&
        Objects.equals(this.references, aiModeAiOverviewInfo.references) &&
        Objects.equals(this.rectangle, aiModeAiOverviewInfo.rectangle);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, page, position, xpath, markdown, items, references, rectangle);
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
    sb.append("class AiModeAiOverviewInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
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
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("page");
    
    openapiFields.add("position");
    
    openapiFields.add("xpath");
    
    openapiFields.add("markdown");
    
    openapiFields.add("items");
    
    openapiFields.add("references");
    
    openapiFields.add("rectangle");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiModeAiOverviewInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiModeAiOverviewInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiModeAiOverviewInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiModeAiOverviewInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiModeAiOverviewInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiModeAiOverviewInfo>() {
           @Override
           public void write(JsonWriter out, AiModeAiOverviewInfo value) throws IOException {
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
           public AiModeAiOverviewInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiModeAiOverviewInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiModeAiOverviewInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiModeAiOverviewInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}