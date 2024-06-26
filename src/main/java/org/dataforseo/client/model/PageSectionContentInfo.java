/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.dataforseo.client.model.ContentItemInfo;
import org.dataforseo.client.model.TableContent;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * PageSectionContentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
public class PageSectionContentInfo {
  public static final String SERIALIZED_NAME_PRIMARY_CONTENT = "primary_content";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CONTENT)
  private List<ContentItemInfo> primaryContent;

  public static final String SERIALIZED_NAME_SECONDARY_CONTENT = "secondary_content";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CONTENT)
  private List<ContentItemInfo> secondaryContent;

  public static final String SERIALIZED_NAME_TABLE_CONTENT = "table_content";
  @SerializedName(SERIALIZED_NAME_TABLE_CONTENT)
  private List<TableContent> tableContent;

  public PageSectionContentInfo() {
  }

  public PageSectionContentInfo primaryContent(List<ContentItemInfo> primaryContent) {
    this.primaryContent = primaryContent;
    return this;
  }

  public PageSectionContentInfo addPrimaryContentItem(ContentItemInfo primaryContentItem) {
    if (this.primaryContent == null) {
      this.primaryContent = new ArrayList<>();
    }
    this.primaryContent.add(primaryContentItem);
    return this;
  }

   /**
   * primary content on the page you can find more information about content priority calculation in this help center article
   * @return primaryContent
  **/
  @javax.annotation.Nullable
  public List<ContentItemInfo> getPrimaryContent() {
    return primaryContent;
  }

  public void setPrimaryContent(List<ContentItemInfo> primaryContent) {
    this.primaryContent = primaryContent;
  }


  public PageSectionContentInfo secondaryContent(List<ContentItemInfo> secondaryContent) {
    this.secondaryContent = secondaryContent;
    return this;
  }

  public PageSectionContentInfo addSecondaryContentItem(ContentItemInfo secondaryContentItem) {
    if (this.secondaryContent == null) {
      this.secondaryContent = new ArrayList<>();
    }
    this.secondaryContent.add(secondaryContentItem);
    return this;
  }

   /**
   * secondary content on the page you can find more information about content priority calculation in this help center article
   * @return secondaryContent
  **/
  @javax.annotation.Nullable
  public List<ContentItemInfo> getSecondaryContent() {
    return secondaryContent;
  }

  public void setSecondaryContent(List<ContentItemInfo> secondaryContent) {
    this.secondaryContent = secondaryContent;
  }


  public PageSectionContentInfo tableContent(List<TableContent> tableContent) {
    this.tableContent = tableContent;
    return this;
  }

  public PageSectionContentInfo addTableContentItem(TableContent tableContentItem) {
    if (this.tableContent == null) {
      this.tableContent = new ArrayList<>();
    }
    this.tableContent.add(tableContentItem);
    return this;
  }

   /**
   * content of the table on the page
   * @return tableContent
  **/
  @javax.annotation.Nullable
  public List<TableContent> getTableContent() {
    return tableContent;
  }

  public void setTableContent(List<TableContent> tableContent) {
    this.tableContent = tableContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageSectionContentInfo pageSectionContentInfo = (PageSectionContentInfo) o;
    return Objects.equals(this.primaryContent, pageSectionContentInfo.primaryContent) &&
        Objects.equals(this.secondaryContent, pageSectionContentInfo.secondaryContent) &&
        Objects.equals(this.tableContent, pageSectionContentInfo.tableContent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryContent, secondaryContent, tableContent);
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
    sb.append("class PageSectionContentInfo {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to PageSectionContentInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageSectionContentInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageSectionContentInfo is not found in the empty JSON string", PageSectionContentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageSectionContentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageSectionContentInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("primary_content") != null && !jsonObj.get("primary_content").isJsonNull()) {
        JsonArray jsonArrayprimaryContent = jsonObj.getAsJsonArray("primary_content");
        if (jsonArrayprimaryContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("primary_content").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `primary_content` to be an array in the JSON string but got `%s`", jsonObj.get("primary_content").toString()));
          }

          // validate the optional field `primary_content` (array)
          for (int i = 0; i < jsonArrayprimaryContent.size(); i++) {
            ContentItemInfo.validateJsonElement(jsonArrayprimaryContent.get(i));
          };
        }
      }
      if (jsonObj.get("secondary_content") != null && !jsonObj.get("secondary_content").isJsonNull()) {
        JsonArray jsonArraysecondaryContent = jsonObj.getAsJsonArray("secondary_content");
        if (jsonArraysecondaryContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secondary_content").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secondary_content` to be an array in the JSON string but got `%s`", jsonObj.get("secondary_content").toString()));
          }

          // validate the optional field `secondary_content` (array)
          for (int i = 0; i < jsonArraysecondaryContent.size(); i++) {
            ContentItemInfo.validateJsonElement(jsonArraysecondaryContent.get(i));
          };
        }
      }
      if (jsonObj.get("table_content") != null && !jsonObj.get("table_content").isJsonNull()) {
        JsonArray jsonArraytableContent = jsonObj.getAsJsonArray("table_content");
        if (jsonArraytableContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("table_content").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `table_content` to be an array in the JSON string but got `%s`", jsonObj.get("table_content").toString()));
          }

          // validate the optional field `table_content` (array)
          for (int i = 0; i < jsonArraytableContent.size(); i++) {
            TableContent.validateJsonElement(jsonArraytableContent.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageSectionContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageSectionContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageSectionContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageSectionContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PageSectionContentInfo>() {
           @Override
           public void write(JsonWriter out, PageSectionContentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageSectionContentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageSectionContentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageSectionContentInfo
  * @throws IOException if the JSON string is invalid with respect to PageSectionContentInfo
  */
  public static PageSectionContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageSectionContentInfo.class);
  }

 /**
  * Convert an instance of PageSectionContentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

