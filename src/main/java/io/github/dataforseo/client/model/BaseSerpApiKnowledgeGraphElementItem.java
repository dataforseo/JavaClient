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



public class BaseSerpApiKnowledgeGraphElementItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BaseSerpApiKnowledgeGraphElementItem type(String type) {
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


  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public BaseSerpApiKnowledgeGraphElementItem position(String position) {
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

  public BaseSerpApiKnowledgeGraphElementItem xpath(String xpath) {
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


  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private AiModeRectangleInfo rectangle;

  public BaseSerpApiKnowledgeGraphElementItem rectangle(AiModeRectangleInfo rectangle) {
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



  public BaseSerpApiKnowledgeGraphElementItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseSerpApiKnowledgeGraphElementItem baseSerpApiKnowledgeGraphElementItem = (BaseSerpApiKnowledgeGraphElementItem) o;
    return

        Objects.equals(this.type, baseSerpApiKnowledgeGraphElementItem.type) &&
        Objects.equals(this.position, baseSerpApiKnowledgeGraphElementItem.position) &&
        Objects.equals(this.xpath, baseSerpApiKnowledgeGraphElementItem.xpath) &&
        Objects.equals(this.rectangle, baseSerpApiKnowledgeGraphElementItem.rectangle);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, position, xpath, rectangle);
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
    sb.append("class BaseSerpApiKnowledgeGraphElementItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
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
    
    openapiFields.add("position");
    
    openapiFields.add("xpath");
    
    openapiFields.add("rectangle");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseSerpApiKnowledgeGraphElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseSerpApiKnowledgeGraphElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}