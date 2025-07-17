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



public class KeywordsDataGoogleAdsStatusResultInfo  {


  public static final String SERIALIZED_NAME_ACTUAL_DATA = "actual_data";
  @SerializedName(SERIALIZED_NAME_ACTUAL_DATA)
  private Boolean actualData;

  public KeywordsDataGoogleAdsStatusResultInfo actualData(Boolean actualData) {
    this.actualData = actualData;
    return this;
  }

  /**
   * indicates whether Google updated keyword data for the previous month
* generally, Google updates keyword data in the middle of the month
* if the value is true, Google currently provides up-to-date data for the previous month
* if the value is false, we are not able to provide data for the previous month
   * @return actualData
   */
  @javax.annotation.Nullable
  public Boolean getActualData() {
    return actualData;
  }

  public void setActualData(Boolean actualData) {
    this.actualData = actualData;
  }


  public static final String SERIALIZED_NAME_DATE_UPDATE = "date_update";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATE)
  private String dateUpdate;

  public KeywordsDataGoogleAdsStatusResultInfo dateUpdate(String dateUpdate) {
    this.dateUpdate = dateUpdate;
    return this;
  }

  /**
   * date of the latest update of Google Ads data
* indicates the latest date when Google updated search volume, CPC, and other keyword metrics
* example:
* 2020-05-15
   * @return dateUpdate
   */
  @javax.annotation.Nullable
  public String getDateUpdate() {
    return dateUpdate;
  }

  public void setDateUpdate(String dateUpdate) {
    this.dateUpdate = dateUpdate;
  }


  public static final String SERIALIZED_NAME_LAST_YEAR_IN_MONTHLY_SEARCHES = "last_year_in_monthly_searches";
  @SerializedName(SERIALIZED_NAME_LAST_YEAR_IN_MONTHLY_SEARCHES)
  private Integer lastYearInMonthlySearches;

  public KeywordsDataGoogleAdsStatusResultInfo lastYearInMonthlySearches(Integer lastYearInMonthlySearches) {
    this.lastYearInMonthlySearches = lastYearInMonthlySearches;
    return this;
  }

  /**
   * the latest year for which search volume data is available
   * @return lastYearInMonthlySearches
   */
  @javax.annotation.Nullable
  public Integer getLastYearInMonthlySearches() {
    return lastYearInMonthlySearches;
  }

  public void setLastYearInMonthlySearches(Integer lastYearInMonthlySearches) {
    this.lastYearInMonthlySearches = lastYearInMonthlySearches;
  }


  public static final String SERIALIZED_NAME_LAST_MONTH_IN_MONTHLY_SEARCHES = "last_month_in_monthly_searches";
  @SerializedName(SERIALIZED_NAME_LAST_MONTH_IN_MONTHLY_SEARCHES)
  private Integer lastMonthInMonthlySearches;

  public KeywordsDataGoogleAdsStatusResultInfo lastMonthInMonthlySearches(Integer lastMonthInMonthlySearches) {
    this.lastMonthInMonthlySearches = lastMonthInMonthlySearches;
    return this;
  }

  /**
   * the latest month for which search volume data is available
   * @return lastMonthInMonthlySearches
   */
  @javax.annotation.Nullable
  public Integer getLastMonthInMonthlySearches() {
    return lastMonthInMonthlySearches;
  }

  public void setLastMonthInMonthlySearches(Integer lastMonthInMonthlySearches) {
    this.lastMonthInMonthlySearches = lastMonthInMonthlySearches;
  }



  public KeywordsDataGoogleAdsStatusResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataGoogleAdsStatusResultInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataGoogleAdsStatusResultInfo keywordsDataGoogleAdsStatusResultInfo = (KeywordsDataGoogleAdsStatusResultInfo) o;
    return

        Objects.equals(this.actualData, keywordsDataGoogleAdsStatusResultInfo.actualData) &&
        Objects.equals(this.dateUpdate, keywordsDataGoogleAdsStatusResultInfo.dateUpdate) &&
        Objects.equals(this.lastYearInMonthlySearches, keywordsDataGoogleAdsStatusResultInfo.lastYearInMonthlySearches) &&
        Objects.equals(this.lastMonthInMonthlySearches, keywordsDataGoogleAdsStatusResultInfo.lastMonthInMonthlySearches);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(actualData, dateUpdate, lastYearInMonthlySearches, lastMonthInMonthlySearches);
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
    sb.append("class KeywordsDataGoogleAdsStatusResultInfo {\n");

    sb.append("    actualData: ").append(toIndentedString(actualData)).append("\n");
    sb.append("    dateUpdate: ").append(toIndentedString(dateUpdate)).append("\n");
    sb.append("    lastYearInMonthlySearches: ").append(toIndentedString(lastYearInMonthlySearches)).append("\n");
    sb.append("    lastMonthInMonthlySearches: ").append(toIndentedString(lastMonthInMonthlySearches)).append("\n");
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
    
    openapiFields.add("actual_data");
    
    openapiFields.add("date_update");
    
    openapiFields.add("last_year_in_monthly_searches");
    
    openapiFields.add("last_month_in_monthly_searches");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleAdsStatusResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleAdsStatusResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleAdsStatusResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleAdsStatusResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleAdsStatusResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleAdsStatusResultInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleAdsStatusResultInfo value) throws IOException {
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
           public KeywordsDataGoogleAdsStatusResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataGoogleAdsStatusResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataGoogleAdsStatusResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleAdsStatusResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}