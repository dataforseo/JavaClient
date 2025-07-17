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



public class SearchVolumeHistorySearchInfo  {


  public static final String SERIALIZED_NAME_DESKTOP = "desktop";
  @SerializedName(SERIALIZED_NAME_DESKTOP)
  private List<SearchVolumeHistoryItemInfo> desktop;

  public SearchVolumeHistorySearchInfo desktop(List<SearchVolumeHistoryItemInfo> desktop) {
    this.desktop = desktop;
    return this;
  }

  /**
   * device type = desktop
* contains historical search volume data for searches made from desktop devices
   * @return desktop
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getDesktop() {
    return desktop;
  }

  public void setDesktop(List<SearchVolumeHistoryItemInfo> desktop) {
    this.desktop = desktop;
  }


  public static final String SERIALIZED_NAME_NON_SMARTPHONES = "non_smartphones";
  @SerializedName(SERIALIZED_NAME_NON_SMARTPHONES)
  private List<SearchVolumeHistoryItemInfo> nonSmartphones;

  public SearchVolumeHistorySearchInfo nonSmartphones(List<SearchVolumeHistoryItemInfo> nonSmartphones) {
    this.nonSmartphones = nonSmartphones;
    return this;
  }

  /**
   * device type = non-smartphones
* contains historical search volume data for searches made from feature phones (non-smartphone mobile devices)
   * @return nonSmartphones
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getNonSmartphones() {
    return nonSmartphones;
  }

  public void setNonSmartphones(List<SearchVolumeHistoryItemInfo> nonSmartphones) {
    this.nonSmartphones = nonSmartphones;
  }


  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private List<SearchVolumeHistoryItemInfo> mobile;

  public SearchVolumeHistorySearchInfo mobile(List<SearchVolumeHistoryItemInfo> mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * device type = mobile
* contains historical search volume data for searches made from mobile devices
   * @return mobile
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getMobile() {
    return mobile;
  }

  public void setMobile(List<SearchVolumeHistoryItemInfo> mobile) {
    this.mobile = mobile;
  }


  public static final String SERIALIZED_NAME_TABLET = "tablet";
  @SerializedName(SERIALIZED_NAME_TABLET)
  private List<SearchVolumeHistoryItemInfo> tablet;

  public SearchVolumeHistorySearchInfo tablet(List<SearchVolumeHistoryItemInfo> tablet) {
    this.tablet = tablet;
    return this;
  }

  /**
   * device type = tablet
* contains historical search volume data for searches made from tablets
   * @return tablet
   */
  @javax.annotation.Nullable
  public List<SearchVolumeHistoryItemInfo> getTablet() {
    return tablet;
  }

  public void setTablet(List<SearchVolumeHistoryItemInfo> tablet) {
    this.tablet = tablet;
  }



  public SearchVolumeHistorySearchInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SearchVolumeHistorySearchInfo putAdditionalProperty(String key, Object value) {
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


    
    SearchVolumeHistorySearchInfo searchVolumeHistorySearchInfo = (SearchVolumeHistorySearchInfo) o;
    return

        Objects.equals(this.desktop, searchVolumeHistorySearchInfo.desktop) &&
        Objects.equals(this.nonSmartphones, searchVolumeHistorySearchInfo.nonSmartphones) &&
        Objects.equals(this.mobile, searchVolumeHistorySearchInfo.mobile) &&
        Objects.equals(this.tablet, searchVolumeHistorySearchInfo.tablet);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(desktop, nonSmartphones, mobile, tablet);
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


  public static SearchVolumeHistorySearchInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchVolumeHistorySearchInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}