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



public class DataforseoLabsLocationsAndLanguagesResultInfo  {


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public DataforseoLabsLocationsAndLanguagesResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsLocationsAndLanguagesResultInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of the location
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE_PARENT = "location_code_parent";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE_PARENT)
  private Integer locationCodeParent;

  public DataforseoLabsLocationsAndLanguagesResultInfo locationCodeParent(Integer locationCodeParent) {
    this.locationCodeParent = locationCodeParent;
    return this;
  }

  /**
   * the code of the superordinate location
* the value will be null as Country is the only supported location_type for this API
   * @return locationCodeParent
   */
  @javax.annotation.Nullable
  public Integer getLocationCodeParent() {
    return locationCodeParent;
  }

  public void setLocationCodeParent(Integer locationCodeParent) {
    this.locationCodeParent = locationCodeParent;
  }


  public static final String SERIALIZED_NAME_COUNTRY_ISO_CODE = "country_iso_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO_CODE)
  private String countryIsoCode;

  public DataforseoLabsLocationsAndLanguagesResultInfo countryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
    return this;
  }

  /**
   * ISO country code of the location
   * @return countryIsoCode
   */
  @javax.annotation.Nullable
  public String getCountryIsoCode() {
    return countryIsoCode;
  }

  public void setCountryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
  }


  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private String locationType;

  public DataforseoLabsLocationsAndLanguagesResultInfo locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * location type
* possible values:
* Country
   * @return locationType
   */
  @javax.annotation.Nullable
  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  public static final String SERIALIZED_NAME_AVAILABLE_LANGUAGES = "available_languages";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_LANGUAGES)
  private List<AvailableLanguages> availableLanguages;

  public DataforseoLabsLocationsAndLanguagesResultInfo availableLanguages(List<AvailableLanguages> availableLanguages) {
    this.availableLanguages = availableLanguages;
    return this;
  }

  /**
   * supported languages
* contains the languages which are supported for a specific location
   * @return availableLanguages
   */
  @javax.annotation.Nullable
  public List<AvailableLanguages> getAvailableLanguages() {
    return availableLanguages;
  }

  public void setAvailableLanguages(List<AvailableLanguages> availableLanguages) {
    this.availableLanguages = availableLanguages;
  }



  public DataforseoLabsLocationsAndLanguagesResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsLocationsAndLanguagesResultInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsLocationsAndLanguagesResultInfo dataforseoLabsLocationsAndLanguagesResultInfo = (DataforseoLabsLocationsAndLanguagesResultInfo) o;
    return

        Objects.equals(this.locationCode, dataforseoLabsLocationsAndLanguagesResultInfo.locationCode) &&
        Objects.equals(this.locationName, dataforseoLabsLocationsAndLanguagesResultInfo.locationName) &&
        Objects.equals(this.locationCodeParent, dataforseoLabsLocationsAndLanguagesResultInfo.locationCodeParent) &&
        Objects.equals(this.countryIsoCode, dataforseoLabsLocationsAndLanguagesResultInfo.countryIsoCode) &&
        Objects.equals(this.locationType, dataforseoLabsLocationsAndLanguagesResultInfo.locationType) &&
        Objects.equals(this.availableLanguages, dataforseoLabsLocationsAndLanguagesResultInfo.availableLanguages);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(locationCode, locationName, locationCodeParent, countryIsoCode, locationType, availableLanguages);
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
    sb.append("class DataforseoLabsLocationsAndLanguagesResultInfo {\n");

    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCodeParent: ").append(toIndentedString(locationCodeParent)).append("\n");
    sb.append("    countryIsoCode: ").append(toIndentedString(countryIsoCode)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    availableLanguages: ").append(toIndentedString(availableLanguages)).append("\n");
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
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code_parent");
    
    openapiFields.add("country_iso_code");
    
    openapiFields.add("location_type");
    
    openapiFields.add("available_languages");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsLocationsAndLanguagesResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsLocationsAndLanguagesResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsLocationsAndLanguagesResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsLocationsAndLanguagesResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsLocationsAndLanguagesResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsLocationsAndLanguagesResultInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsLocationsAndLanguagesResultInfo value) throws IOException {
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
           public DataforseoLabsLocationsAndLanguagesResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsLocationsAndLanguagesResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsLocationsAndLanguagesResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsLocationsAndLanguagesResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}