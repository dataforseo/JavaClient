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


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.client.model.BaseMerchantSerpElementItem;
import io.github.dataforseo.client.model.GoogleShoppingSponsoredCarouselElement;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

/**
 * GoogleShoppingSponsoredCarouselMerchantSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class GoogleShoppingSponsoredCarouselMerchantSerpElementItem extends BaseMerchantSerpElementItem {
  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<GoogleShoppingSponsoredCarouselElement> items;

  public GoogleShoppingSponsoredCarouselMerchantSerpElementItem() {
  }

  public GoogleShoppingSponsoredCarouselMerchantSerpElementItem xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public GoogleShoppingSponsoredCarouselMerchantSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * product title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public GoogleShoppingSponsoredCarouselMerchantSerpElementItem items(List<GoogleShoppingSponsoredCarouselElement> items) {
    this.items = items;
    return this;
  }

  public GoogleShoppingSponsoredCarouselMerchantSerpElementItem addItemsItem(GoogleShoppingSponsoredCarouselElement itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items in SERP
   * @return items
   */
  @javax.annotation.Nullable
  public List<GoogleShoppingSponsoredCarouselElement> getItems() {
    return items;
  }

  public void setItems(List<GoogleShoppingSponsoredCarouselElement> items) {
    this.items = items;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GoogleShoppingSponsoredCarouselMerchantSerpElementItem instance itself
   */
  public GoogleShoppingSponsoredCarouselMerchantSerpElementItem putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    GoogleShoppingSponsoredCarouselMerchantSerpElementItem googleShoppingSponsoredCarouselMerchantSerpElementItem = (GoogleShoppingSponsoredCarouselMerchantSerpElementItem) o;
    return Objects.equals(this.xpath, googleShoppingSponsoredCarouselMerchantSerpElementItem.xpath) &&
        Objects.equals(this.title, googleShoppingSponsoredCarouselMerchantSerpElementItem.title) &&
        Objects.equals(this.items, googleShoppingSponsoredCarouselMerchantSerpElementItem.items)&&
        Objects.equals(this.additionalProperties, googleShoppingSponsoredCarouselMerchantSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpath, title, items, super.hashCode(), additionalProperties);
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
    sb.append("class GoogleShoppingSponsoredCarouselMerchantSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("xpath");
    openapiFields.add("title");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleShoppingSponsoredCarouselMerchantSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleShoppingSponsoredCarouselMerchantSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleShoppingSponsoredCarouselMerchantSerpElementItem is not found in the empty JSON string", GoogleShoppingSponsoredCarouselMerchantSerpElementItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("xpath") != null && !jsonObj.get("xpath").isJsonNull()) && !jsonObj.get("xpath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xpath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xpath").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            GoogleShoppingSponsoredCarouselElement.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleShoppingSponsoredCarouselMerchantSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleShoppingSponsoredCarouselMerchantSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleShoppingSponsoredCarouselMerchantSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleShoppingSponsoredCarouselMerchantSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleShoppingSponsoredCarouselMerchantSerpElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleShoppingSponsoredCarouselMerchantSerpElementItem value) throws IOException {
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
           public GoogleShoppingSponsoredCarouselMerchantSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleShoppingSponsoredCarouselMerchantSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of GoogleShoppingSponsoredCarouselMerchantSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleShoppingSponsoredCarouselMerchantSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to GoogleShoppingSponsoredCarouselMerchantSerpElementItem
   */
  public static GoogleShoppingSponsoredCarouselMerchantSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleShoppingSponsoredCarouselMerchantSerpElementItem.class);
  }

  /**
   * Convert an instance of GoogleShoppingSponsoredCarouselMerchantSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

