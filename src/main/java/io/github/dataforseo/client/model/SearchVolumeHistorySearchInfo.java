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
import io.github.dataforseo.client.model.SearchVolumeHistoryItemInfo;
import java.io.IOException;
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
 * SearchVolumeHistorySearchInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class SearchVolumeHistorySearchInfo {
  public static final String SERIALIZED_NAME_DESKTOP = "desktop";
  @SerializedName(SERIALIZED_NAME_DESKTOP)
  private List<SearchVolumeHistoryItemInfo> desktop;

  public static final String SERIALIZED_NAME_NON_SMARTPHONES = "non_smartphones";
  @SerializedName(SERIALIZED_NAME_NON_SMARTPHONES)
  private List<SearchVolumeHistoryItemInfo> nonSmartphones;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private List<SearchVolumeHistoryItemInfo> mobile;

  public static final String SERIALIZED_NAME_TABLET = "tablet";
  @SerializedName(SERIALIZED_NAME_TABLET)
  private List<SearchVolumeHistoryItemInfo> tablet;

  public SearchVolumeHistorySearchInfo() {
  }

  public SearchVolumeHistorySearchInfo desktop(List<SearchVolumeHistoryItemInfo> desktop) {
    this.desktop = desktop;
    return this;
  }

  public SearchVolumeHistorySearchInfo addDesktopItem(SearchVolumeHistoryItemInfo desktopItem) {
    if (this.desktop == null) {
      this.desktop = new ArrayList<>();
    }
    this.desktop.add(desktopItem);
    return this;
  }

  /**
   * device type &#x3D; desktop contains historical search volume data for searches made from desktop devices
   * @return desktop
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getDesktop() {
    return desktop;
  }

  public void setDesktop(List<SearchVolumeHistoryItemInfo> desktop) {
    this.desktop = desktop;
  }


  public SearchVolumeHistorySearchInfo nonSmartphones(List<SearchVolumeHistoryItemInfo> nonSmartphones) {
    this.nonSmartphones = nonSmartphones;
    return this;
  }

  public SearchVolumeHistorySearchInfo addNonSmartphonesItem(SearchVolumeHistoryItemInfo nonSmartphonesItem) {
    if (this.nonSmartphones == null) {
      this.nonSmartphones = new ArrayList<>();
    }
    this.nonSmartphones.add(nonSmartphonesItem);
    return this;
  }

  /**
   * device type &#x3D; non-smartphones contains historical search volume data for searches made from feature phones (non-smartphone mobile devices)
   * @return nonSmartphones
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getNonSmartphones() {
    return nonSmartphones;
  }

  public void setNonSmartphones(List<SearchVolumeHistoryItemInfo> nonSmartphones) {
    this.nonSmartphones = nonSmartphones;
  }


  public SearchVolumeHistorySearchInfo mobile(List<SearchVolumeHistoryItemInfo> mobile) {
    this.mobile = mobile;
    return this;
  }

  public SearchVolumeHistorySearchInfo addMobileItem(SearchVolumeHistoryItemInfo mobileItem) {
    if (this.mobile == null) {
      this.mobile = new ArrayList<>();
    }
    this.mobile.add(mobileItem);
    return this;
  }

  /**
   * device type &#x3D; mobile contains historical search volume data for searches made from mobile devices
   * @return mobile
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getMobile() {
    return mobile;
  }

  public void setMobile(List<SearchVolumeHistoryItemInfo> mobile) {
    this.mobile = mobile;
  }


  public SearchVolumeHistorySearchInfo tablet(List<SearchVolumeHistoryItemInfo> tablet) {
    this.tablet = tablet;
    return this;
  }

  public SearchVolumeHistorySearchInfo addTabletItem(SearchVolumeHistoryItemInfo tabletItem) {
    if (this.tablet == null) {
      this.tablet = new ArrayList<>();
    }
    this.tablet.add(tabletItem);
    return this;
  }

  /**
   * device type &#x3D; tablet contains historical search volume data for searches made from tablets
   * @return tablet
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getTablet() {
    return tablet;
  }

  public void setTablet(List<SearchVolumeHistoryItemInfo> tablet) {
    this.tablet = tablet;
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
   * @return the SearchVolumeHistorySearchInfo instance itself
   */
  public SearchVolumeHistorySearchInfo putAdditionalProperty(String key, Object value) {
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
    SearchVolumeHistorySearchInfo searchVolumeHistorySearchInfo = (SearchVolumeHistorySearchInfo) o;
    return Objects.equals(this.desktop, searchVolumeHistorySearchInfo.desktop) &&
        Objects.equals(this.nonSmartphones, searchVolumeHistorySearchInfo.nonSmartphones) &&
        Objects.equals(this.mobile, searchVolumeHistorySearchInfo.mobile) &&
        Objects.equals(this.tablet, searchVolumeHistorySearchInfo.tablet)&&
        Objects.equals(this.additionalProperties, searchVolumeHistorySearchInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, nonSmartphones, mobile, tablet, additionalProperties);
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
    sb.append("class SearchVolumeHistorySearchInfo {\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    nonSmartphones: ").append(toIndentedString(nonSmartphones)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    tablet: ").append(toIndentedString(tablet)).append("\n");
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
    openapiFields.add("desktop");
    openapiFields.add("non_smartphones");
    openapiFields.add("mobile");
    openapiFields.add("tablet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchVolumeHistorySearchInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchVolumeHistorySearchInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchVolumeHistorySearchInfo is not found in the empty JSON string", SearchVolumeHistorySearchInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("desktop") != null && !jsonObj.get("desktop").isJsonNull()) {
        JsonArray jsonArraydesktop = jsonObj.getAsJsonArray("desktop");
        if (jsonArraydesktop != null) {
          // ensure the json data is an array
          if (!jsonObj.get("desktop").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `desktop` to be an array in the JSON string but got `%s`", jsonObj.get("desktop").toString()));
          }

          // validate the optional field `desktop` (array)
          for (int i = 0; i < jsonArraydesktop.size(); i++) {
            SearchVolumeHistoryItemInfo.validateJsonElement(jsonArraydesktop.get(i));
          };
        }
      }
      if (jsonObj.get("non_smartphones") != null && !jsonObj.get("non_smartphones").isJsonNull()) {
        JsonArray jsonArraynonSmartphones = jsonObj.getAsJsonArray("non_smartphones");
        if (jsonArraynonSmartphones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("non_smartphones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `non_smartphones` to be an array in the JSON string but got `%s`", jsonObj.get("non_smartphones").toString()));
          }

          // validate the optional field `non_smartphones` (array)
          for (int i = 0; i < jsonArraynonSmartphones.size(); i++) {
            SearchVolumeHistoryItemInfo.validateJsonElement(jsonArraynonSmartphones.get(i));
          };
        }
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonNull()) {
        JsonArray jsonArraymobile = jsonObj.getAsJsonArray("mobile");
        if (jsonArraymobile != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mobile").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mobile` to be an array in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
          }

          // validate the optional field `mobile` (array)
          for (int i = 0; i < jsonArraymobile.size(); i++) {
            SearchVolumeHistoryItemInfo.validateJsonElement(jsonArraymobile.get(i));
          };
        }
      }
      if (jsonObj.get("tablet") != null && !jsonObj.get("tablet").isJsonNull()) {
        JsonArray jsonArraytablet = jsonObj.getAsJsonArray("tablet");
        if (jsonArraytablet != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tablet").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tablet` to be an array in the JSON string but got `%s`", jsonObj.get("tablet").toString()));
          }

          // validate the optional field `tablet` (array)
          for (int i = 0; i < jsonArraytablet.size(); i++) {
            SearchVolumeHistoryItemInfo.validateJsonElement(jsonArraytablet.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchVolumeHistorySearchInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchVolumeHistorySearchInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchVolumeHistorySearchInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchVolumeHistorySearchInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchVolumeHistorySearchInfo>() {
           @Override
           public void write(JsonWriter out, SearchVolumeHistorySearchInfo value) throws IOException {
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
           public SearchVolumeHistorySearchInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SearchVolumeHistorySearchInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SearchVolumeHistorySearchInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchVolumeHistorySearchInfo
   * @throws IOException if the JSON string is invalid with respect to SearchVolumeHistorySearchInfo
   */
  public static SearchVolumeHistorySearchInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchVolumeHistorySearchInfo.class);
  }

  /**
   * Convert an instance of SearchVolumeHistorySearchInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
