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
import org.dataforseo.client.model.KeywordKpiInfo;
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
 * KeywordKpi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
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
  **/
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
  **/
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
  **/
  @javax.annotation.Nullable
  public List<KeywordKpiInfo> getTablet() {
    return tablet;
  }

  public void setTablet(List<KeywordKpiInfo> tablet) {
    this.tablet = tablet;
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
        Objects.equals(this.tablet, keywordKpi.tablet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, mobile, tablet);
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KeywordKpi.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeywordKpi` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordKpi read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

