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
import io.github.dataforseo.client.model.KeywordKpiInfo;
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
 * KeywordKpi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class KeywordKpi {
  public static final String SERIALIZED_NAME_DESKTOP = "desktop";
  @SerializedName(SERIALIZED_NAME_DESKTOP)
  private List<KeywordKpiInfo> desktop;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private List<KeywordKpiInfo> mobile;

  public static final String SERIALIZED_NAME_TABLET = "tablet";
  @SerializedName(SERIALIZED_NAME_TABLET)
  private List<KeywordKpiInfo> tablet;

  public KeywordKpi() {
  }

  public KeywordKpi desktop(List<KeywordKpiInfo> desktop) {
    this.desktop = desktop;
    return this;
  }

  public KeywordKpi addDesktopItem(KeywordKpiInfo desktopItem) {
    if (this.desktop == null) {
      this.desktop = new ArrayList<>();
    }
    this.desktop.add(desktopItem);
    return this;
  }

  /**
   * keyword data aggregated for desktop devices if there is no data, then the value is null
   * @return desktop
   */
  @javax.annotation.Nullable
  public List<KeywordKpiInfo> getDesktop() {
    return desktop;
  }

  public void setDesktop(List<KeywordKpiInfo> desktop) {
    this.desktop = desktop;
  }


  public KeywordKpi mobile(List<KeywordKpiInfo> mobile) {
    this.mobile = mobile;
    return this;
  }

  public KeywordKpi addMobileItem(KeywordKpiInfo mobileItem) {
    if (this.mobile == null) {
      this.mobile = new ArrayList<>();
    }
    this.mobile.add(mobileItem);
    return this;
  }

  /**
   * keyword data aggregated for mobile devices if there is no data, then the value is null
   * @return mobile
   */
  @javax.annotation.Nullable
  public List<KeywordKpiInfo> getMobile() {
    return mobile;
  }

  public void setMobile(List<KeywordKpiInfo> mobile) {
    this.mobile = mobile;
  }


  public KeywordKpi tablet(List<KeywordKpiInfo> tablet) {
    this.tablet = tablet;
    return this;
  }

  public KeywordKpi addTabletItem(KeywordKpiInfo tabletItem) {
    if (this.tablet == null) {
      this.tablet = new ArrayList<>();
    }
    this.tablet.add(tabletItem);
    return this;
  }

  /**
   * keyword data aggregated for tablet devices if there is no data, then the value is null
   * @return tablet
   */
  @javax.annotation.Nullable
  public List<KeywordKpiInfo> getTablet() {
    return tablet;
  }

  public void setTablet(List<KeywordKpiInfo> tablet) {
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
   * @return the KeywordKpi instance itself
   */
  public KeywordKpi putAdditionalProperty(String key, Object value) {
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
    KeywordKpi keywordKpi = (KeywordKpi) o;
    return Objects.equals(this.desktop, keywordKpi.desktop) &&
        Objects.equals(this.mobile, keywordKpi.mobile) &&
        Objects.equals(this.tablet, keywordKpi.tablet)&&
        Objects.equals(this.additionalProperties, keywordKpi.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, mobile, tablet, additionalProperties);
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
    sb.append("class KeywordKpi {\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
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
    openapiFields.add("mobile");
    openapiFields.add("tablet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordKpi
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KeywordKpi.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeywordKpi is not found in the empty JSON string", KeywordKpi.openapiRequiredFields.toString()));
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
            KeywordKpiInfo.validateJsonElement(jsonArraydesktop.get(i));
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
            KeywordKpiInfo.validateJsonElement(jsonArraymobile.get(i));
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
            KeywordKpiInfo.validateJsonElement(jsonArraytablet.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordKpi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordKpi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordKpi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordKpi.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordKpi>() {
           @Override
           public void write(JsonWriter out, KeywordKpi value) throws IOException {
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
           public KeywordKpi read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordKpi instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of KeywordKpi given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KeywordKpi
   * @throws IOException if the JSON string is invalid with respect to KeywordKpi
   */
  public static KeywordKpi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordKpi.class);
  }

  /**
   * Convert an instance of KeywordKpi to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

