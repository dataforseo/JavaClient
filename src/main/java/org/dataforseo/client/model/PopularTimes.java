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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dataforseo.client.model.BusyWorkingTimeInfo;
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
 * PopularTimes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class PopularTimes {
  public static final String SERIALIZED_NAME_POPULAR_TIMES_BY_DAYS = "popular_times_by_days";
  @SerializedName(SERIALIZED_NAME_POPULAR_TIMES_BY_DAYS)
  private Map<String, List<BusyWorkingTimeInfo>> popularTimesByDays;

  public PopularTimes() {
  }

  public PopularTimes popularTimesByDays(Map<String, List<BusyWorkingTimeInfo>> popularTimesByDays) {
    this.popularTimesByDays = popularTimesByDays;
    return this;
  }

  public PopularTimes putPopularTimesByDaysItem(String key, List<BusyWorkingTimeInfo> popularTimesByDaysItem) {
    if (this.popularTimesByDays == null) {
      this.popularTimesByDays = new HashMap<>();
    }
    this.popularTimesByDays.put(key, popularTimesByDaysItem);
    return this;
  }

   /**
   * popular hours information about busy hours of the local establishment on each day of the week
   * @return popularTimesByDays
  **/
  @javax.annotation.Nullable
  public Map<String, List<BusyWorkingTimeInfo>> getPopularTimesByDays() {
    return popularTimesByDays;
  }

  public void setPopularTimesByDays(Map<String, List<BusyWorkingTimeInfo>> popularTimesByDays) {
    this.popularTimesByDays = popularTimesByDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularTimes popularTimes = (PopularTimes) o;
    return Objects.equals(this.popularTimesByDays, popularTimes.popularTimesByDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(popularTimesByDays);
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
    sb.append("class PopularTimes {\n");
    sb.append("    popularTimesByDays: ").append(toIndentedString(popularTimesByDays)).append("\n");
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
    openapiFields.add("popular_times_by_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PopularTimes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PopularTimes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PopularTimes is not found in the empty JSON string", PopularTimes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PopularTimes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PopularTimes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PopularTimes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PopularTimes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PopularTimes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PopularTimes.class));

       return (TypeAdapter<T>) new TypeAdapter<PopularTimes>() {
           @Override
           public void write(JsonWriter out, PopularTimes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PopularTimes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PopularTimes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PopularTimes
  * @throws IOException if the JSON string is invalid with respect to PopularTimes
  */
  public static PopularTimes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PopularTimes.class);
  }

 /**
  * Convert an instance of PopularTimes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
